package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
abstract class d00<I, O, F, T> extends t00<O> implements Runnable {
    @NullableDecl
    private zzdvf<? extends I> i;
    @NullableDecl
    private F j;

    d00(zzdvf<? extends I> zzdvf, F f2) {
        zzdsh.b(zzdvf);
        this.i = zzdvf;
        zzdsh.b(f2);
        this.j = f2;
    }

    static <I, O> zzdvf<O> J(zzdvf<I> zzdvf, zzdrx<? super I, ? extends O> zzdrx, Executor executor) {
        zzdsh.b(zzdrx);
        e00 e00 = new e00(zzdvf, zzdrx);
        zzdvf.f(e00, zzdvh.b(executor, e00));
        return e00;
    }

    static <I, O> zzdvf<O> K(zzdvf<I> zzdvf, zzduh<? super I, ? extends O> zzduh, Executor executor) {
        zzdsh.b(executor);
        f00 f00 = new f00(zzdvf, zzduh);
        zzdvf.f(f00, zzdvh.b(executor, f00));
        return f00;
    }

    /* access modifiers changed from: package-private */
    public abstract void I(@NullableDecl T t);

    /* access modifiers changed from: package-private */
    @NullableDecl
    public abstract T L(F f2, @NullableDecl I i2) throws Exception;

    /* access modifiers changed from: protected */
    public final void b() {
        g(this.i);
        this.i = null;
        this.j = null;
    }

    /* access modifiers changed from: protected */
    public final String h() {
        String str;
        zzdvf<? extends I> zzdvf = this.i;
        F f2 = this.j;
        String h = super.h();
        if (zzdvf != null) {
            String valueOf = String.valueOf(zzdvf);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("inputFuture=[");
            sb.append(valueOf);
            sb.append("], ");
            str = sb.toString();
        } else {
            str = "";
        }
        if (f2 != null) {
            String valueOf2 = String.valueOf(f2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(valueOf2).length());
            sb2.append(str);
            sb2.append("function=[");
            sb2.append(valueOf2);
            sb2.append("]");
            return sb2.toString();
        } else if (h == null) {
            return null;
        } else {
            String valueOf3 = String.valueOf(str);
            String valueOf4 = String.valueOf(h);
            return valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
        }
    }

    public final void run() {
        zzdvf<? extends I> zzdvf = this.i;
        F f2 = this.j;
        boolean z = true;
        boolean isCancelled = isCancelled() | (zzdvf == null);
        if (f2 != null) {
            z = false;
        }
        if (!isCancelled && !z) {
            this.i = null;
            if (zzdvf.isCancelled()) {
                k(zzdvf);
                return;
            }
            try {
                try {
                    Object L = L(f2, zzdux.e(zzdvf));
                    this.j = null;
                    I(L);
                } catch (Throwable th) {
                    this.j = null;
                    throw th;
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e2) {
                j(e2.getCause());
            } catch (RuntimeException e3) {
                j(e3);
            } catch (Error e4) {
                j(e4);
            }
        }
    }
}
