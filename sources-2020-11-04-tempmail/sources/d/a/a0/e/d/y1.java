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
    final d f14259c;

    /* compiled from: ObservableMergeWithCompletable */
    static final class a<T> extends AtomicInteger implements s<T>, b {
        private static final long serialVersionUID = -4592979584110982903L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f14260b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReference<b> f14261c = new AtomicReference<>();

        /* renamed from: d  reason: collision with root package name */
        final C0148a f14262d = new C0148a(this);

        /* renamed from: e  reason: collision with root package name */
        final c f14263e = new c();

        /* renamed from: f  reason: collision with root package name */
        volatile boolean f14264f;
        volatile boolean g;

        /* renamed from: d.a.a0.e.d.y1$a$a  reason: collision with other inner class name */
        /* compiled from: ObservableMergeWithCompletable */
        static final class C0148a extends AtomicReference<b> implements d.a.c {
            private static final long serialVersionUID = -2935427570954647017L;

            /* renamed from: b  reason: collision with root package name */
            final a<?> f14265b;

            C0148a(a<?> aVar) {
                this.f14265b = aVar;
            }

            public void onComplete() {
                this.f14265b.a();
            }

            public void onError(Throwable th) {
                this.f14265b.b(th);
            }

            public void onSubscribe(b bVar) {
                d.a.a0.a.c.n(this, bVar);
            }
        }

        a(s<? super T> sVar) {
            this.f14260b = sVar;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.g = true;
            if (this.f14264f) {
                k.a(this.f14260b, this, this.f14263e);
            }
        }

        /* access modifiers changed from: package-private */
        public void b(Throwable th) {
            d.a.a0.a.c.f(this.f14261c);
            k.c(this.f14260b, th, this, this.f14263e);
        }

        public void dispose() {
            d.a.a0.a.c.f(this.f14261c);
            d.a.a0.a.c.f(this.f14262d);
        }

        public void onComplete() {
            this.f14264f = true;
            if (this.g) {
                k.a(this.f14260b, this, this.f14263e);
            }
        }

        public void onError(Throwable th) {
            d.a.a0.a.c.f(this.f14262d);
            k.c(this.f14260b, th, this, this.f14263e);
        }

        public void onNext(T t) {
            k.e(this.f14260b, t, this, this.f14263e);
        }

        public void onSubscribe(b bVar) {
            d.a.a0.a.c.n(this.f14261c, bVar);
        }
    }

    public y1(l<T> lVar, d dVar) {
        super(lVar);
        this.f14259c = dVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super T> sVar) {
        a aVar = new a(sVar);
        sVar.onSubscribe(aVar);
        this.f13338b.subscribe(aVar);
        this.f14259c.b(aVar.f14262d);
    }
}
