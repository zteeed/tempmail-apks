package d.a.a0.e.d;

import d.a.a0.j.c;
import d.a.a0.j.k;
import d.a.d;
import d.a.l;
import d.a.s;
import d.a.y.b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableMergeWithCompletable */
public final class y1<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final d f13701c;

    /* compiled from: ObservableMergeWithCompletable */
    static final class a<T> extends AtomicInteger implements s<T>, b {
        private static final long serialVersionUID = -4592979584110982903L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13702b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReference<b> f13703c = new AtomicReference<>();

        /* renamed from: d  reason: collision with root package name */
        final C0150a f13704d = new C0150a(this);

        /* renamed from: e  reason: collision with root package name */
        final c f13705e = new c();

        /* renamed from: f  reason: collision with root package name */
        volatile boolean f13706f;
        volatile boolean g;

        /* renamed from: d.a.a0.e.d.y1$a$a  reason: collision with other inner class name */
        /* compiled from: ObservableMergeWithCompletable */
        static final class C0150a extends AtomicReference<b> implements d.a.c {
            private static final long serialVersionUID = -2935427570954647017L;

            /* renamed from: b  reason: collision with root package name */
            final a<?> f13707b;

            C0150a(a<?> aVar) {
                this.f13707b = aVar;
            }

            public void onComplete() {
                this.f13707b.a();
            }

            public void onError(Throwable th) {
                this.f13707b.b(th);
            }

            public void onSubscribe(b bVar) {
                d.a.a0.a.c.n(this, bVar);
            }
        }

        a(s<? super T> sVar) {
            this.f13702b = sVar;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.g = true;
            if (this.f13706f) {
                k.a(this.f13702b, this, this.f13705e);
            }
        }

        /* access modifiers changed from: package-private */
        public void b(Throwable th) {
            d.a.a0.a.c.f(this.f13703c);
            k.c(this.f13702b, th, this, this.f13705e);
        }

        public void dispose() {
            d.a.a0.a.c.f(this.f13703c);
            d.a.a0.a.c.f(this.f13704d);
        }

        public void onComplete() {
            this.f13706f = true;
            if (this.g) {
                k.a(this.f13702b, this, this.f13705e);
            }
        }

        public void onError(Throwable th) {
            d.a.a0.a.c.f(this.f13704d);
            k.c(this.f13702b, th, this, this.f13705e);
        }

        public void onNext(T t) {
            k.e(this.f13702b, t, this, this.f13705e);
        }

        public void onSubscribe(b bVar) {
            d.a.a0.a.c.n(this.f13703c, bVar);
        }
    }

    public y1(l<T> lVar, d dVar) {
        super(lVar);
        this.f13701c = dVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super T> sVar) {
        a aVar = new a(sVar);
        sVar.onSubscribe(aVar);
        this.f12780b.subscribe(aVar);
        this.f13701c.b(aVar.f13704d);
    }
}
