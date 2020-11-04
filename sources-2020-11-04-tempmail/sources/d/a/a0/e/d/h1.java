package d.a.a0.e.d;

import d.a.a0.a.d;
import d.a.e;
import d.a.l;
import d.a.s;
import d.a.y.b;
import d.a.z.c;
import d.a.z.f;
import java.util.concurrent.Callable;

/* compiled from: ObservableGenerate */
public final class h1<T, S> extends l<T> {

    /* renamed from: b  reason: collision with root package name */
    final Callable<S> f13607b;

    /* renamed from: c  reason: collision with root package name */
    final c<S, e<T>, S> f13608c;

    /* renamed from: d  reason: collision with root package name */
    final f<? super S> f13609d;

    /* compiled from: ObservableGenerate */
    static final class a<T, S> implements e<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13610b;

        /* renamed from: c  reason: collision with root package name */
        final c<S, ? super e<T>, S> f13611c;

        /* renamed from: d  reason: collision with root package name */
        final f<? super S> f13612d;

        /* renamed from: e  reason: collision with root package name */
        S f13613e;

        /* renamed from: f  reason: collision with root package name */
        volatile boolean f13614f;
        boolean g;

        a(s<? super T> sVar, c<S, ? super e<T>, S> cVar, f<? super S> fVar, S s) {
            this.f13610b = sVar;
            this.f13611c = cVar;
            this.f13612d = fVar;
            this.f13613e = s;
        }

        private void a(S s) {
            try {
                this.f13612d.a(s);
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                d.a.d0.a.s(th);
            }
        }

        public void b(Throwable th) {
            if (this.g) {
                d.a.d0.a.s(th);
                return;
            }
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.g = true;
            this.f13610b.onError(th);
        }

        public void c() {
            S s = this.f13613e;
            if (this.f13614f) {
                this.f13613e = null;
                a(s);
                return;
            }
            c<S, ? super e<T>, S> cVar = this.f13611c;
            while (!this.f13614f) {
                try {
                    s = cVar.a(s, this);
                    if (this.g) {
                        this.f13614f = true;
                        this.f13613e = null;
                        a(s);
                        return;
                    }
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    this.f13613e = null;
                    this.f13614f = true;
                    b(th);
                    a(s);
                    return;
                }
            }
            this.f13613e = null;
            a(s);
        }

        public void dispose() {
            this.f13614f = true;
        }
    }

    public h1(Callable<S> callable, c<S, e<T>, S> cVar, f<? super S> fVar) {
        this.f13607b = callable;
        this.f13608c = cVar;
        this.f13609d = fVar;
    }

    public void subscribeActual(s<? super T> sVar) {
        try {
            a aVar = new a(sVar, this.f13608c, this.f13609d, this.f13607b.call());
            sVar.onSubscribe(aVar);
            aVar.c();
        } catch (Throwable th) {
            io.reactivex.exceptions.a.b(th);
            d.m(th, sVar);
        }
    }
}
