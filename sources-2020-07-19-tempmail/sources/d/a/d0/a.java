package d.a.d0;

import d.a.a0.j.j;
import d.a.b;
import d.a.h;
import d.a.i;
import d.a.l;
import d.a.s;
import d.a.t;
import d.a.u;
import d.a.v;
import d.a.z.c;
import d.a.z.e;
import d.a.z.f;
import d.a.z.n;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.UndeliverableException;
import java.util.concurrent.Callable;

/* compiled from: RxJavaPlugins */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    static volatile f<? super Throwable> f13911a;

    /* renamed from: b  reason: collision with root package name */
    static volatile n<? super Runnable, ? extends Runnable> f13912b;

    /* renamed from: c  reason: collision with root package name */
    static volatile n<? super Callable<t>, ? extends t> f13913c;

    /* renamed from: d  reason: collision with root package name */
    static volatile n<? super Callable<t>, ? extends t> f13914d;

    /* renamed from: e  reason: collision with root package name */
    static volatile n<? super Callable<t>, ? extends t> f13915e;

    /* renamed from: f  reason: collision with root package name */
    static volatile n<? super Callable<t>, ? extends t> f13916f;
    static volatile n<? super t, ? extends t> g;
    static volatile n<? super t, ? extends t> h;
    static volatile n<? super d.a.f, ? extends d.a.f> i;
    static volatile n<? super l, ? extends l> j;
    static volatile n<? super d.a.b0.a, ? extends d.a.b0.a> k;
    static volatile n<? super h, ? extends h> l;
    static volatile n<? super u, ? extends u> m;
    static volatile n<? super b, ? extends b> n;
    static volatile c<? super d.a.f, ? super f.a.b, ? extends f.a.b> o;
    static volatile c<? super h, ? super i, ? extends i> p;
    static volatile c<? super l, ? super s, ? extends s> q;
    static volatile c<? super u, ? super v, ? extends v> r;
    static volatile c<? super b, ? super d.a.c, ? extends d.a.c> s;
    static volatile e t;
    static volatile boolean u;
    static volatile boolean v;

    public static void A(f<? super Throwable> fVar) {
        if (!u) {
            f13911a = fVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    static void B(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    static <T, U, R> R a(c<T, U, R> cVar, T t2, U u2) {
        try {
            return cVar.a(t2, u2);
        } catch (Throwable th) {
            throw j.d(th);
        }
    }

    static <T, R> R b(n<T, R> nVar, T t2) {
        try {
            return nVar.apply(t2);
        } catch (Throwable th) {
            throw j.d(th);
        }
    }

    static t c(n<? super Callable<t>, ? extends t> nVar, Callable<t> callable) {
        Object b2 = b(nVar, callable);
        d.a.a0.b.b.e(b2, "Scheduler Callable result can't be null");
        return (t) b2;
    }

    static t d(Callable<t> callable) {
        try {
            t call = callable.call();
            d.a.a0.b.b.e(call, "Scheduler Callable result can't be null");
            return call;
        } catch (Throwable th) {
            throw j.d(th);
        }
    }

    public static t e(Callable<t> callable) {
        d.a.a0.b.b.e(callable, "Scheduler Callable can't be null");
        n<? super Callable<t>, ? extends t> nVar = f13913c;
        if (nVar == null) {
            return d(callable);
        }
        return c(nVar, callable);
    }

    public static t f(Callable<t> callable) {
        d.a.a0.b.b.e(callable, "Scheduler Callable can't be null");
        n<? super Callable<t>, ? extends t> nVar = f13915e;
        if (nVar == null) {
            return d(callable);
        }
        return c(nVar, callable);
    }

    public static t g(Callable<t> callable) {
        d.a.a0.b.b.e(callable, "Scheduler Callable can't be null");
        n<? super Callable<t>, ? extends t> nVar = f13916f;
        if (nVar == null) {
            return d(callable);
        }
        return c(nVar, callable);
    }

    public static t h(Callable<t> callable) {
        d.a.a0.b.b.e(callable, "Scheduler Callable can't be null");
        n<? super Callable<t>, ? extends t> nVar = f13914d;
        if (nVar == null) {
            return d(callable);
        }
        return c(nVar, callable);
    }

    static boolean i(Throwable th) {
        if (!(th instanceof OnErrorNotImplementedException) && !(th instanceof MissingBackpressureException) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof CompositeException)) {
            return false;
        }
        return true;
    }

    public static boolean j() {
        return v;
    }

    public static b k(b bVar) {
        n<? super b, ? extends b> nVar = n;
        return nVar != null ? (b) b(nVar, bVar) : bVar;
    }

    public static <T> d.a.f<T> l(d.a.f<T> fVar) {
        n<? super d.a.f, ? extends d.a.f> nVar = i;
        return nVar != null ? (d.a.f) b(nVar, fVar) : fVar;
    }

    public static <T> h<T> m(h<T> hVar) {
        n<? super h, ? extends h> nVar = l;
        return nVar != null ? (h) b(nVar, hVar) : hVar;
    }

    public static <T> l<T> n(l<T> lVar) {
        n<? super l, ? extends l> nVar = j;
        return nVar != null ? (l) b(nVar, lVar) : lVar;
    }

    public static <T> u<T> o(u<T> uVar) {
        n<? super u, ? extends u> nVar = m;
        return nVar != null ? (u) b(nVar, uVar) : uVar;
    }

    public static <T> d.a.b0.a<T> p(d.a.b0.a<T> aVar) {
        n<? super d.a.b0.a, ? extends d.a.b0.a> nVar = k;
        return nVar != null ? (d.a.b0.a) b(nVar, aVar) : aVar;
    }

    public static boolean q() {
        e eVar = t;
        if (eVar == null) {
            return false;
        }
        try {
            return eVar.a();
        } catch (Throwable th) {
            throw j.d(th);
        }
    }

    public static t r(t tVar) {
        n<? super t, ? extends t> nVar = g;
        if (nVar == null) {
            return tVar;
        }
        return (t) b(nVar, tVar);
    }

    public static void s(Throwable th) {
        f<? super Throwable> fVar = f13911a;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!i(th)) {
            th = new UndeliverableException(th);
        }
        if (fVar != null) {
            try {
                fVar.a(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                B(th2);
            }
        }
        th.printStackTrace();
        B(th);
    }

    public static t t(t tVar) {
        n<? super t, ? extends t> nVar = h;
        if (nVar == null) {
            return tVar;
        }
        return (t) b(nVar, tVar);
    }

    public static Runnable u(Runnable runnable) {
        d.a.a0.b.b.e(runnable, "run is null");
        n<? super Runnable, ? extends Runnable> nVar = f13912b;
        if (nVar == null) {
            return runnable;
        }
        return (Runnable) b(nVar, runnable);
    }

    public static d.a.c v(b bVar, d.a.c cVar) {
        c<? super b, ? super d.a.c, ? extends d.a.c> cVar2 = s;
        return cVar2 != null ? (d.a.c) a(cVar2, bVar, cVar) : cVar;
    }

    public static <T> i<? super T> w(h<T> hVar, i<? super T> iVar) {
        c<? super h, ? super i, ? extends i> cVar = p;
        return cVar != null ? (i) a(cVar, hVar, iVar) : iVar;
    }

    public static <T> s<? super T> x(l<T> lVar, s<? super T> sVar) {
        c<? super l, ? super s, ? extends s> cVar = q;
        return cVar != null ? (s) a(cVar, lVar, sVar) : sVar;
    }

    public static <T> v<? super T> y(u<T> uVar, v<? super T> vVar) {
        c<? super u, ? super v, ? extends v> cVar = r;
        return cVar != null ? (v) a(cVar, uVar, vVar) : vVar;
    }

    public static <T> f.a.b<? super T> z(d.a.f<T> fVar, f.a.b<? super T> bVar) {
        c<? super d.a.f, ? super f.a.b, ? extends f.a.b> cVar = o;
        return cVar != null ? (f.a.b) a(cVar, fVar, bVar) : bVar;
    }
}
