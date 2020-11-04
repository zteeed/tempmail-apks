package d.a.a0.e.a;

import d.a.f;
import d.a.l;
import d.a.s;
import f.a.c;

/* compiled from: FlowableFromObservable */
public final class b<T> extends f<T> {

    /* renamed from: c  reason: collision with root package name */
    private final l<T> f12696c;

    /* compiled from: FlowableFromObservable */
    static final class a<T> implements s<T>, c {

        /* renamed from: b  reason: collision with root package name */
        final f.a.b<? super T> f12697b;

        /* renamed from: c  reason: collision with root package name */
        d.a.y.b f12698c;

        a(f.a.b<? super T> bVar) {
            this.f12697b = bVar;
        }

        public void cancel() {
            this.f12698c.dispose();
        }

        public void onComplete() {
            this.f12697b.onComplete();
        }

        public void onError(Throwable th) {
            this.f12697b.onError(th);
        }

        public void onNext(T t) {
            this.f12697b.onNext(t);
        }

        public void onSubscribe(d.a.y.b bVar) {
            this.f12698c = bVar;
            this.f12697b.f(this);
        }

        public void request(long j) {
        }
    }

    public b(l<T> lVar) {
        this.f12696c = lVar;
    }

    /* access modifiers changed from: protected */
    public void i(f.a.b<? super T> bVar) {
        this.f12696c.subscribe(new a(bVar));
    }
}
