package d.a.a0.e.d;

import d.a.g;
import d.a.l;
import d.a.s;
import d.a.y.b;
import f.a.c;

/* compiled from: ObservableFromPublisher */
public final class f1<T> extends l<T> {

    /* renamed from: b  reason: collision with root package name */
    final f.a.a<? extends T> f13525b;

    /* compiled from: ObservableFromPublisher */
    static final class a<T> implements g<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13526b;

        /* renamed from: c  reason: collision with root package name */
        c f13527c;

        a(s<? super T> sVar) {
            this.f13526b = sVar;
        }

        public void dispose() {
            this.f13527c.cancel();
            this.f13527c = d.a.a0.i.b.CANCELLED;
        }

        public void f(c cVar) {
            if (d.a.a0.i.b.o(this.f13527c, cVar)) {
                this.f13527c = cVar;
                this.f13526b.onSubscribe(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        public void onComplete() {
            this.f13526b.onComplete();
        }

        public void onError(Throwable th) {
            this.f13526b.onError(th);
        }

        public void onNext(T t) {
            this.f13526b.onNext(t);
        }
    }

    public f1(f.a.a<? extends T> aVar) {
        this.f13525b = aVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super T> sVar) {
        this.f13525b.b(new a(sVar));
    }
}
