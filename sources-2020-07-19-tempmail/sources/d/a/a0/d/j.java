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
    final s<? super T> f12670b;

    /* renamed from: c  reason: collision with root package name */
    final f<? super b> f12671c;

    /* renamed from: d  reason: collision with root package name */
    final a f12672d;

    /* renamed from: e  reason: collision with root package name */
    b f12673e;

    public j(s<? super T> sVar, f<? super b> fVar, a aVar) {
        this.f12670b = sVar;
        this.f12671c = fVar;
        this.f12672d = aVar;
    }

    public void dispose() {
        b bVar = this.f12673e;
        c cVar = c.DISPOSED;
        if (bVar != cVar) {
            this.f12673e = cVar;
            try {
                this.f12672d.run();
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                d.a.d0.a.s(th);
            }
            bVar.dispose();
        }
    }

    public void onComplete() {
        b bVar = this.f12673e;
        c cVar = c.DISPOSED;
        if (bVar != cVar) {
            this.f12673e = cVar;
            this.f12670b.onComplete();
        }
    }

    public void onError(Throwable th) {
        b bVar = this.f12673e;
        c cVar = c.DISPOSED;
        if (bVar != cVar) {
            this.f12673e = cVar;
            this.f12670b.onError(th);
            return;
        }
        d.a.d0.a.s(th);
    }

    public void onNext(T t) {
        this.f12670b.onNext(t);
    }

    public void onSubscribe(b bVar) {
        try {
            this.f12671c.a(bVar);
            if (c.p(this.f12673e, bVar)) {
                this.f12673e = bVar;
                this.f12670b.onSubscribe(this);
            }
        } catch (Throwable th) {
            io.reactivex.exceptions.a.b(th);
            bVar.dispose();
            this.f12673e = c.DISPOSED;
            d.m(th, this.f12670b);
        }
    }
}
