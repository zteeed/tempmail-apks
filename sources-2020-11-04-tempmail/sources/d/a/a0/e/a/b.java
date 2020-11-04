package d.a.a0.e.a;

import d.a.f;
import d.a.l;
import d.a.s;
import f.a.c;

/* compiled from: FlowableFromObservable */
public final class b<T> extends f<T> {

    /* renamed from: c  reason: collision with root package name */
    private final l<T> f13254c;

    /* compiled from: FlowableFromObservable */
    static final class a<T> implements s<T>, c {

        /* renamed from: b  reason: collision with root package name */
        final f.a.b<? super T> f13255b;

        /* renamed from: c  reason: collision with root package name */
        d.a.y.b f13256c;

        a(f.a.b<? super T> bVar) {
            this.f13255b = bVar;
        }

        public void cancel() {
            this.f13256c.dispose();
        }

        public void onComplete() {
            this.f13255b.onComplete();
        }

        public void onError(Throwable th) {
            this.f13255b.onError(th);
        }

        public void onNext(T t) {
            this.f13255b.onNext(t);
        }

        public void onSubscribe(d.a.y.b bVar) {
            this.f13256c = bVar;
            this.f13255b.f(this);
        }

        public void request(long j) {
        }
    }

    public b(l<T> lVar) {
        this.f13254c = lVar;
    }

    /* access modifiers changed from: protected */
    public void i(f.a.b<? super T> bVar) {
        this.f13254c.subscribe(new a(bVar));
    }
}
