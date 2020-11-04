package d.a;

import d.a.a0.e.a.c;
import d.a.a0.e.a.d;
import f.a.a;
import f.a.b;

/* compiled from: Flowable */
public abstract class f<T> implements a<T> {

    /* renamed from: b  reason: collision with root package name */
    static final int f14345b = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    public static int c() {
        return f14345b;
    }

    public final void b(b<? super T> bVar) {
        if (bVar instanceof g) {
            h((g) bVar);
            return;
        }
        d.a.a0.b.b.e(bVar, "s is null");
        h(new d.a.a0.h.a(bVar));
    }

    public final f<T> d() {
        return e(c(), false, true);
    }

    public final f<T> e(int i, boolean z, boolean z2) {
        d.a.a0.b.b.f(i, "capacity");
        return d.a.d0.a.l(new c(this, i, z2, z, d.a.a0.b.a.f13175c));
    }

    public final f<T> f() {
        return d.a.d0.a.l(new d(this));
    }

    public final f<T> g() {
        return d.a.d0.a.l(new d.a.a0.e.a.f(this));
    }

    public final void h(g<? super T> gVar) {
        d.a.a0.b.b.e(gVar, "s is null");
        try {
            b<? super Object> z = d.a.d0.a.z(this, gVar);
            d.a.a0.b.b.e(z, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            i(z);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            io.reactivex.exceptions.a.b(th);
            d.a.d0.a.s(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void i(b<? super T> bVar);
}
