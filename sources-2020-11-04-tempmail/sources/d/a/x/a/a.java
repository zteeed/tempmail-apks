package d.a.x.a;

import d.a.t;
import d.a.z.n;
import java.util.concurrent.Callable;

/* compiled from: RxAndroidPlugins */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile n<Callable<t>, t> f14361a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile n<t, t> f14362b;

    static <T, R> R a(n<T, R> nVar, T t) {
        try {
            return nVar.apply(t);
        } catch (Throwable th) {
            io.reactivex.exceptions.a.a(th);
            throw null;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [d.a.z.n<java.util.concurrent.Callable<d.a.t>, d.a.t>, d.a.z.n] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static d.a.t b(d.a.z.n<java.util.concurrent.Callable<d.a.t>, d.a.t> r0, java.util.concurrent.Callable<d.a.t> r1) {
        /*
            java.lang.Object r0 = a(r0, r1)
            d.a.t r0 = (d.a.t) r0
            if (r0 == 0) goto L_0x0009
            return r0
        L_0x0009:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Scheduler Callable returned null"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.x.a.a.b(d.a.z.n, java.util.concurrent.Callable):d.a.t");
    }

    static t c(Callable<t> callable) {
        try {
            t call = callable.call();
            if (call != null) {
                return call;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            io.reactivex.exceptions.a.a(th);
            throw null;
        }
    }

    public static t d(Callable<t> callable) {
        if (callable != null) {
            n<Callable<t>, t> nVar = f14361a;
            if (nVar == null) {
                return c(callable);
            }
            return b(nVar, callable);
        }
        throw new NullPointerException("scheduler == null");
    }

    public static t e(t tVar) {
        if (tVar != null) {
            n nVar = f14362b;
            if (nVar == null) {
                return tVar;
            }
            return (t) a(nVar, tVar);
        }
        throw new NullPointerException("scheduler == null");
    }
}
