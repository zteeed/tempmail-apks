package okhttp3.internal.connection;

import e.k0;
import e.m0.e;
import e.m0.j.f;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Proxy;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import okhttp3.internal.connection.j;

/* compiled from: RealConnectionPool */
public final class g {
    private static final Executor g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), e.H("OkHttp ConnectionPool", true));

    /* renamed from: a  reason: collision with root package name */
    private final int f14843a;

    /* renamed from: b  reason: collision with root package name */
    private final long f14844b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f14845c = new a(this);

    /* renamed from: d  reason: collision with root package name */
    private final Deque<f> f14846d = new ArrayDeque();

    /* renamed from: e  reason: collision with root package name */
    final h f14847e = new h();

    /* renamed from: f  reason: collision with root package name */
    boolean f14848f;

    public g(int i, long j, TimeUnit timeUnit) {
        this.f14843a = i;
        this.f14844b = timeUnit.toNanos(j);
        if (j <= 0) {
            throw new IllegalArgumentException("keepAliveDuration <= 0: " + j);
        }
    }

    private int e(f fVar, long j) {
        List<Reference<j>> list = fVar.p;
        int i = 0;
        while (i < list.size()) {
            Reference reference = list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                f.j().q("A connection to " + fVar.r().a().l() + " was leaked. Did you forget to close a response body?", ((j.b) reference).f14865a);
                list.remove(i);
                fVar.k = true;
                if (list.isEmpty()) {
                    fVar.q = j - this.f14844b;
                    return 0;
                }
            }
        }
        return list.size();
    }

    /* access modifiers changed from: package-private */
    public long a(long j) {
        synchronized (this) {
            f fVar = null;
            long j2 = Long.MIN_VALUE;
            int i = 0;
            int i2 = 0;
            for (f next : this.f14846d) {
                if (e(next, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - next.q;
                    if (j3 > j2) {
                        fVar = next;
                        j2 = j3;
                    }
                }
            }
            if (j2 < this.f14844b) {
                if (i <= this.f14843a) {
                    if (i > 0) {
                        long j4 = this.f14844b - j2;
                        return j4;
                    } else if (i2 > 0) {
                        long j5 = this.f14844b;
                        return j5;
                    } else {
                        this.f14848f = false;
                        return -1;
                    }
                }
            }
            this.f14846d.remove(fVar);
            e.g(fVar.t());
            return 0;
        }
    }

    public void b(k0 k0Var, IOException iOException) {
        if (k0Var.b().type() != Proxy.Type.DIRECT) {
            e.e a2 = k0Var.a();
            a2.i().connectFailed(a2.l().F(), k0Var.b().address(), iOException);
        }
        this.f14847e.b(k0Var);
    }

    /* access modifiers changed from: package-private */
    public boolean c(f fVar) {
        if (fVar.k || this.f14843a == 0) {
            this.f14846d.remove(fVar);
            return true;
        }
        notifyAll();
        return false;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0025 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void d() {
        /*
            r6 = this;
        L_0x0000:
            long r0 = java.lang.System.nanoTime()
            long r0 = r6.a(r0)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x000f
            return
        L_0x000f:
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0000
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r0 / r2
            long r2 = r2 * r4
            long r0 = r0 - r2
            monitor-enter(r6)
            int r1 = (int) r0
            r6.wait(r4, r1)     // Catch:{ InterruptedException -> 0x0025 }
            goto L_0x0025
        L_0x0023:
            r0 = move-exception
            goto L_0x0027
        L_0x0025:
            monitor-exit(r6)     // Catch:{ all -> 0x0023 }
            goto L_0x0000
        L_0x0027:
            monitor-exit(r6)     // Catch:{ all -> 0x0023 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.g.d():void");
    }

    /* access modifiers changed from: package-private */
    public void f(f fVar) {
        if (!this.f14848f) {
            this.f14848f = true;
            g.execute(this.f14845c);
        }
        this.f14846d.add(fVar);
    }

    /* access modifiers changed from: package-private */
    public boolean g(e.e eVar, j jVar, @Nullable List<k0> list, boolean z) {
        for (f next : this.f14846d) {
            if ((!z || next.o()) && next.m(eVar, list)) {
                jVar.a(next);
                return true;
            }
        }
        return false;
    }
}
