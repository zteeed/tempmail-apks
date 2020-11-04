package d.a.a0.e.d;

import d.a.g;
import d.a.l;
import d.a.s;
import d.a.y.b;
import f.a.c;

/* compiled from: ObservableFromPublisher */
public final class f1<T> extends l<T> {

    /* renamed from: b  reason: collision with root package name */
    final f.a.a<? extends T> f12967b;

    /* compiled from: ObservableFromPublisher */
    static final class a<T> implements g<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f12968b;

        /* renamed from: c  reason: collision with root package name */
        c f12969c;

        a(s<? super T> sVar) {
            this.f12968b = sVar;
        }

        public void dispose() {
            this.f12969c.cancel();
            this.f12969c = d.a.a0.i.b.CANCELLED;
        }

        public void f(c cVar) {
            if (d.a.a0.i.b.o(this.f12969c, cVar)) {
                this.f12969c = cVar;
                this.f12968b.onSubscribe(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        public void onComplete() {
            this.f12968b.onComplete();
        }

        public void onError(Throwable th) {
            this.f12968b.onError(th);
        }

        public void onNext(T t) {
            this.f12968b.onNext(t);
        }
    }

    public f1(f.a.a<? extends T> aVar) {
        this.f12967b = aVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super T> sVar) {
        this.f12967b.b(new a(sVar));
    }
}
