package d.a.a0.d;

import d.a.a0.a.c;
import d.a.a0.a.d;
import d.a.s;
import d.a.y.b;
import d.a.z.a;
import d.a.z.f;

/* compiled from: DisposableLambdaObserver */
public final class j<T> implements s<T>, b {

    /* renamed from: b  reason: collision with root package name */
    final s<? super T> f13228b;

    /* renamed from: c  reason: collision with root package name */
    final f<? super b> f13229c;

    /* renamed from: d  reason: collision with root package name */
    final a f13230d;

    /* renamed from: e  reason: collision with root package name */
    b f13231e;

    public j(s<? super T> sVar, f<? super b> fVar, a aVar) {
        this.f13228b = sVar;
        this.f13229c = fVar;
        this.f13230d = aVar;
    }

    public void dispose() {
        b bVar = this.f13231e;
        c cVar = c.DISPOSED;
        if (bVar != cVar) {
            this.f13231e = cVar;
            try {
                this.f13230d.run();
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                d.a.d0.a.s(th);
            }
            bVar.dispose();
        }
    }

    public void onComplete() {
        b bVar = this.f13231e;
        c cVar = c.DISPOSED;
        if (bVar != cVar) {
            this.f13231e = cVar;
            this.f13228b.onComplete();
        }
    }

    public void onError(Throwable th) {
        b bVar = this.f13231e;
        c cVar = c.DISPOSED;
        if (bVar != cVar) {
            this.f13231e = cVar;
            this.f13228b.onError(th);
            return;
        }
        d.a.d0.a.s(th);
    }

    public void onNext(T t) {
        this.f13228b.onNext(t);
    }

    public void onSubscribe(b bVar) {
        try {
            this.f13229c.a(bVar);
            if (c.p(this.f13231e, bVar)) {
                this.f13231e = bVar;
                this.f13228b.onSubscribe(this);
            }
        } catch (Throwable th) {
            io.reactivex.exceptions.a.b(th);
            bVar.dispose();
            this.f13231e = c.DISPOSED;
            d.m(th, this.f13228b);
        }
    }
}
