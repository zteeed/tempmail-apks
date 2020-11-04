package d.a.a0.e.c;

import d.a.a0.j.j;
import d.a.b;
import d.a.c;
import d.a.l;
import d.a.s;
import d.a.z.n;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableSwitchMapCompletable */
public final class d<T> extends b {

    /* renamed from: a  reason: collision with root package name */
    final l<T> f12751a;

    /* renamed from: b  reason: collision with root package name */
    final n<? super T, ? extends d.a.d> f12752b;

    /* renamed from: c  reason: collision with root package name */
    final boolean f12753c;

    /* compiled from: ObservableSwitchMapCompletable */
    static final class a<T> implements s<T>, d.a.y.b {
        static final C0132a i = new C0132a((a<?>) null);

        /* renamed from: b  reason: collision with root package name */
        final c f12754b;

        /* renamed from: c  reason: collision with root package name */
        final n<? super T, ? extends d.a.d> f12755c;

        /* renamed from: d  reason: collision with root package name */
        final boolean f12756d;

        /* renamed from: e  reason: collision with root package name */
        final d.a.a0.j.c f12757e = new d.a.a0.j.c();

        /* renamed from: f  reason: collision with root package name */
        final AtomicReference<C0132a> f12758f = new AtomicReference<>();
        volatile boolean g;
        d.a.y.b h;

        /* renamed from: d.a.a0.e.c.d$a$a  reason: collision with other inner class name */
        /* compiled from: ObservableSwitchMapCompletable */
        static final class C0132a extends AtomicReference<d.a.y.b> implements c {
            private static final long serialVersionUID = -8003404460084760287L;

            /* renamed from: b  reason: collision with root package name */
            final a<?> f12759b;

            C0132a(a<?> aVar) {
                this.f12759b = aVar;
            }

            /* access modifiers changed from: package-private */
            public void a() {
                d.a.a0.a.c.f(this);
            }

            public void onComplete() {
                this.f12759b.b(this);
            }

            public void onError(Throwable th) {
                this.f12759b.c(this, th);
            }

            public void onSubscribe(d.a.y.b bVar) {
                d.a.a0.a.c.n(this, bVar);
            }
        }

        a(c cVar, n<? super T, ? extends d.a.d> nVar, boolean z) {
            this.f12754b = cVar;
            this.f12755c = nVar;
            this.f12756d = z;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            C0132a andSet = this.f12758f.getAndSet(i);
            if (andSet != null && andSet != i) {
                andSet.a();
            }
        }

        /* access modifiers changed from: package-private */
        public void b(C0132a aVar) {
            if (this.f12758f.compareAndSet(aVar, (Object) null) && this.g) {
                Throwable b2 = this.f12757e.b();
                if (b2 == null) {
                    this.f12754b.onComplete();
                } else {
                    this.f12754b.onError(b2);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c(C0132a aVar, Throwable th) {
            if (!this.f12758f.compareAndSet(aVar, (Object) null) || !this.f12757e.a(th)) {
                d.a.d0.a.s(th);
            } else if (!this.f12756d) {
                dispose();
                Throwable b2 = this.f12757e.b();
                if (b2 != j.f13880a) {
                    this.f12754b.onError(b2);
                }
            } else if (this.g) {
                this.f12754b.onError(this.f12757e.b());
            }
        }

        public void dispose() {
            this.h.dispose();
            a();
        }

        public void onComplete() {
            this.g = true;
            if (this.f12758f.get() == null) {
                Throwable b2 = this.f12757e.b();
                if (b2 == null) {
                    this.f12754b.onComplete();
                } else {
                    this.f12754b.onError(b2);
                }
            }
        }

        public void onError(Throwable th) {
            if (!this.f12757e.a(th)) {
                d.a.d0.a.s(th);
            } else if (this.f12756d) {
                onComplete();
            } else {
                a();
                Throwable b2 = this.f12757e.b();
                if (b2 != j.f13880a) {
                    this.f12754b.onError(b2);
                }
            }
        }

        public void onNext(T t) {
            C0132a aVar;
            try {
                Object apply = this.f12755c.apply(t);
                d.a.a0.b.b.e(apply, "The mapper returned a null CompletableSource");
                d.a.d dVar = (d.a.d) apply;
                C0132a aVar2 = new C0132a(this);
                do {
                    aVar = this.f12758f.get();
                    if (aVar == i) {
                        return;
                    }
                } while (!this.f12758f.compareAndSet(aVar, aVar2));
                if (aVar != null) {
                    aVar.a();
                }
                dVar.b(aVar2);
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                this.h.dispose();
                onError(th);
            }
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (d.a.a0.a.c.p(this.h, bVar)) {
                this.h = bVar;
                this.f12754b.onSubscribe(this);
            }
        }
    }

    public d(l<T> lVar, n<? super T, ? extends d.a.d> nVar, boolean z) {
        this.f12751a = lVar;
        this.f12752b = nVar;
        this.f12753c = z;
    }

    /* access modifiers changed from: protected */
    public void c(c cVar) {
        if (!g.a(this.f12751a, this.f12752b, cVar)) {
            this.f12751a.subscribe(new a(cVar, this.f12752b, this.f12753c));
        }
    }
}
