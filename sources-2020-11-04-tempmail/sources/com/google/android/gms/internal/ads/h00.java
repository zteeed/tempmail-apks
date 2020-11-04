package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
abstract class h00<InputT, OutputT> extends k00<OutputT> {
    private static final Logger p = Logger.getLogger(h00.class.getName());
    /* access modifiers changed from: private */
    @NullableDecl
    public zzdsr<? extends zzdvf<? extends InputT>> m;
    private final boolean n;
    private final boolean o;

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    enum a {
        OUTPUT_FUTURE_DONE,
        ALL_INPUT_FUTURES_PROCESSED
    }

    h00(zzdsr<? extends zzdvf<? extends InputT>> zzdsr, boolean z, boolean z2) {
        super(zzdsr.size());
        zzdsh.b(zzdsr);
        this.m = zzdsr;
        this.n = z;
        this.o = z2;
    }

    /* access modifiers changed from: private */
    public final void K(int i, Future<? extends InputT> future) {
        try {
            R(i, zzdux.e(future));
        } catch (ExecutionException e2) {
            T(e2.getCause());
        } catch (Throwable th) {
            T(th);
        }
    }

    /* access modifiers changed from: private */
    public final void L(@NullableDecl zzdsr<? extends Future<? extends InputT>> zzdsr) {
        int F = F();
        int i = 0;
        if (!(F >= 0)) {
            throw new IllegalStateException("Less than 0 remaining futures");
        } else if (F == 0) {
            if (zzdsr != null) {
                zzdtn zzdtn = (zzdtn) zzdsr.iterator();
                while (zzdtn.hasNext()) {
                    Future future = (Future) zzdtn.next();
                    if (!future.isCancelled()) {
                        K(i, future);
                    }
                    i++;
                }
            }
            G();
            Q();
            M(a.ALL_INPUT_FUTURES_PROCESSED);
        }
    }

    private static boolean O(Set<Throwable> set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    private final void T(Throwable th) {
        zzdsh.b(th);
        if (this.n && !j(th) && O(E(), th)) {
            U(th);
        } else if (th instanceof Error) {
            U(th);
        }
    }

    private static void U(Throwable th) {
        p.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", th instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th);
    }

    /* access modifiers changed from: package-private */
    public final void I(Set<Throwable> set) {
        zzdsh.b(set);
        if (!isCancelled()) {
            O(set, a());
        }
    }

    /* access modifiers changed from: package-private */
    public void M(a aVar) {
        zzdsh.b(aVar);
        this.m = null;
    }

    /* access modifiers changed from: package-private */
    public final void P() {
        if (this.m.isEmpty()) {
            Q();
        } else if (this.n) {
            int i = 0;
            zzdtn zzdtn = (zzdtn) this.m.iterator();
            while (zzdtn.hasNext()) {
                zzdvf zzdvf = (zzdvf) zzdtn.next();
                zzdvf.f(new g00(this, zzdvf, i), q00.INSTANCE);
                i++;
            }
        } else {
            i00 i00 = new i00(this, this.o ? this.m : null);
            zzdtn zzdtn2 = (zzdtn) this.m.iterator();
            while (zzdtn2.hasNext()) {
                ((zzdvf) zzdtn2.next()).f(i00, q00.INSTANCE);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void Q();

    /* access modifiers changed from: package-private */
    public abstract void R(int i, @NullableDecl InputT inputt);

    /* access modifiers changed from: protected */
    public final void b() {
        super.b();
        zzdsr<? extends zzdvf<? extends InputT>> zzdsr = this.m;
        M(a.OUTPUT_FUTURE_DONE);
        if (isCancelled() && (zzdsr != null)) {
            boolean l = l();
            zzdtn zzdtn = (zzdtn) zzdsr.iterator();
            while (zzdtn.hasNext()) {
                ((Future) zzdtn.next()).cancel(l);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final String h() {
        zzdsr<? extends zzdvf<? extends InputT>> zzdsr = this.m;
        if (zzdsr == null) {
            return super.h();
        }
        String valueOf = String.valueOf(zzdsr);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("futures=");
        sb.append(valueOf);
        return sb.toString();
    }
}
