package d.a.c0;

import d.a.c;
import d.a.i;
import d.a.s;
import d.a.v;
import d.a.y.b;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: TestObserver */
public class f<T> extends a<T, f<T>> implements s<T>, b, i<T>, v<T>, c {
    private final s<? super T> i;
    private final AtomicReference<b> j;
    private d.a.a0.c.b<T> k;

    /* compiled from: TestObserver */
    enum a implements s<Object> {
        INSTANCE;

        public void onComplete() {
        }

        public void onError(Throwable th) {
        }

        public void onNext(Object obj) {
        }

        public void onSubscribe(b bVar) {
        }
    }

    public f() {
        this(a.INSTANCE);
    }

    public final void dispose() {
        d.a.a0.a.c.f(this.j);
    }

    public void onComplete() {
        if (!this.f14494f) {
            this.f14494f = true;
            if (this.j.get() == null) {
                this.f14492d.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            Thread.currentThread();
            this.f14493e++;
            this.i.onComplete();
        } finally {
            this.f14490b.countDown();
        }
    }

    public void onError(Throwable th) {
        if (!this.f14494f) {
            this.f14494f = true;
            if (this.j.get() == null) {
                this.f14492d.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            Thread.currentThread();
            if (th == null) {
                this.f14492d.add(new NullPointerException("onError received a null Throwable"));
            } else {
                this.f14492d.add(th);
            }
            this.i.onError(th);
        } finally {
            this.f14490b.countDown();
        }
    }

    public void onNext(T t) {
        if (!this.f14494f) {
            this.f14494f = true;
            if (this.j.get() == null) {
                this.f14492d.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        Thread.currentThread();
        if (this.h == 2) {
            while (true) {
                try {
                    T poll = this.k.poll();
                    if (poll != null) {
                        this.f14491c.add(poll);
                    } else {
                        return;
                    }
                } catch (Throwable th) {
                    this.f14492d.add(th);
                    this.k.dispose();
                    return;
                }
            }
        } else {
            this.f14491c.add(t);
            if (t == null) {
                this.f14492d.add(new NullPointerException("onNext received a null value"));
            }
            this.i.onNext(t);
        }
    }

    public void onSubscribe(b bVar) {
        Thread.currentThread();
        if (bVar == null) {
            this.f14492d.add(new NullPointerException("onSubscribe received a null Subscription"));
        } else if (!this.j.compareAndSet((Object) null, bVar)) {
            bVar.dispose();
            if (this.j.get() != d.a.a0.a.c.DISPOSED) {
                this.f14492d.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + bVar));
            }
        } else {
            int i2 = this.g;
            if (i2 != 0 && (bVar instanceof d.a.a0.c.b)) {
                d.a.a0.c.b<T> bVar2 = (d.a.a0.c.b) bVar;
                this.k = bVar2;
                int g = bVar2.g(i2);
                this.h = g;
                if (g == 1) {
                    this.f14494f = true;
                    Thread.currentThread();
                    while (true) {
                        try {
                            T poll = this.k.poll();
                            if (poll != null) {
                                this.f14491c.add(poll);
                            } else {
                                this.f14493e++;
                                this.j.lazySet(d.a.a0.a.c.DISPOSED);
                                return;
                            }
                        } catch (Throwable th) {
                            this.f14492d.add(th);
                            return;
                        }
                    }
                }
            }
            this.i.onSubscribe(bVar);
        }
    }

    public void onSuccess(T t) {
        onNext(t);
        onComplete();
    }

    public f(s<? super T> sVar) {
        this.j = new AtomicReference<>();
        this.i = sVar;
    }
}
