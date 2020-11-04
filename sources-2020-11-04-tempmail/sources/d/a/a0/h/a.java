package d.a.a0.h;

import d.a.a0.j.k;
import d.a.g;
import f.a.b;
import f.a.c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: StrictSubscriber */
public class a<T> extends AtomicInteger implements g<T>, c {
    private static final long serialVersionUID = -4945028590049415624L;

    /* renamed from: b  reason: collision with root package name */
    final b<? super T> f14456b;

    /* renamed from: c  reason: collision with root package name */
    final d.a.a0.j.c f14457c = new d.a.a0.j.c();

    /* renamed from: d  reason: collision with root package name */
    final AtomicLong f14458d = new AtomicLong();

    /* renamed from: e  reason: collision with root package name */
    final AtomicReference<c> f14459e = new AtomicReference<>();

    /* renamed from: f  reason: collision with root package name */
    final AtomicBoolean f14460f = new AtomicBoolean();
    volatile boolean g;

    public a(b<? super T> bVar) {
        this.f14456b = bVar;
    }

    public void cancel() {
        if (!this.g) {
            d.a.a0.i.b.f(this.f14459e);
        }
    }

    public void f(c cVar) {
        if (this.f14460f.compareAndSet(false, true)) {
            this.f14456b.f(this);
            d.a.a0.i.b.h(this.f14459e, this.f14458d, cVar);
            return;
        }
        cVar.cancel();
        cancel();
        onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
    }

    public void onComplete() {
        this.g = true;
        k.b(this.f14456b, this, this.f14457c);
    }

    public void onError(Throwable th) {
        this.g = true;
        k.d(this.f14456b, th, this, this.f14457c);
    }

    public void onNext(T t) {
        k.f(this.f14456b, t, this, this.f14457c);
    }

    public void request(long j) {
        if (j <= 0) {
            cancel();
            onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + j));
            return;
        }
        d.a.a0.i.b.g(this.f14459e, this.f14458d, j);
    }
}
