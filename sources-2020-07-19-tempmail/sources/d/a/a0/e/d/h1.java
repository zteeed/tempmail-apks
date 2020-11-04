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
    final Callable<S> f13049b;

    /* renamed from: c  reason: collision with root package name */
    final c<S, e<T>, S> f13050c;

    /* renamed from: d  reason: collision with root package name */
    final f<? super S> f13051d;

    /* compiled from: ObservableGenerate */
    static final class a<T, S> implements e<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13052b;

        /* renamed from: c  reason: collision with root package name */
        final c<S, ? super e<T>, S> f13053c;

        /* renamed from: d  reason: collision with root package name */
        final f<? super S> f13054d;

        /* renamed from: e  reason: collision with root package name */
        S f13055e;

        /* renamed from: f  reason: collision with root package name */
        volatile boolean f13056f;
        boolean g;

        a(s<? super T> sVar, c<S, ? super e<T>, S> cVar, f<? super S> fVar, S s) {
            this.f13052b = sVar;
            this.f13053c = cVar;
            this.f13054d = fVar;
            this.f13055e = s;
        }

        private void a(S s) {
            try {
                this.f13054d.a(s);
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
            this.f13052b.onError(th);
        }

        public void c() {
            S s = this.f13055e;
            if (this.f13056f) {
                this.f13055e = null;
                a(s);
                return;
            }
            c<S, ? super e<T>, S> cVar = this.f13053c;
            while (!this.f13056f) {
                try {
                    s = cVar.a(s, this);
                    if (this.g) {
                        this.f13056f = true;
                        this.f13055e = null;
                        a(s);
                        return;
                    }
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    this.f13055e = null;
                    this.f13056f = true;
                    b(th);
                    a(s);
                    return;
                }
            }
            this.f13055e = null;
            a(s);
        }

        public void dispose() {
            this.f13056f = true;
        }
    }

    public h1(Callable<S> callable, c<S, e<T>, S> cVar, f<? super S> fVar) {
        this.f13049b = callable;
        this.f13050c = cVar;
        this.f13051d = fVar;
    }

    public void subscribeActual(s<? super T> sVar) {
        try {
            a aVar = new a(sVar, this.f13050c, this.f13051d, this.f13049b.call());
            sVar.onSubscribe(aVar);
            aVar.c();
        } catch (Throwable th) {
            io.reactivex.exceptions.a.b(th);
            d.m(th, sVar);
        }
    }
}
