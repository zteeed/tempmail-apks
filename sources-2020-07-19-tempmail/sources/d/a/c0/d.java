package d.a.c0;

import d.a.a0.a.c;
import d.a.s;
import d.a.y.b;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.a;

/* compiled from: SafeObserver */
public final class d<T> implements s<T>, b {

    /* renamed from: b  reason: collision with root package name */
    final s<? super T> f13901b;

    /* renamed from: c  reason: collision with root package name */
    b f13902c;

    /* renamed from: d  reason: collision with root package name */
    boolean f13903d;

    public d(s<? super T> sVar) {
        this.f13901b = sVar;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f13901b.onSubscribe(d.a.a0.a.d.INSTANCE);
            try {
                this.f13901b.onError(nullPointerException);
            } catch (Throwable th) {
                a.b(th);
                d.a.d0.a.s(new CompositeException(nullPointerException, th));
            }
        } catch (Throwable th2) {
            a.b(th2);
            d.a.d0.a.s(new CompositeException(nullPointerException, th2));
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f13903d = true;
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f13901b.onSubscribe(d.a.a0.a.d.INSTANCE);
            try {
                this.f13901b.onError(nullPointerException);
            } catch (Throwable th) {
                a.b(th);
                d.a.d0.a.s(new CompositeException(nullPointerException, th));
            }
        } catch (Throwable th2) {
            a.b(th2);
            d.a.d0.a.s(new CompositeException(nullPointerException, th2));
        }
    }

    public void dispose() {
        this.f13902c.dispose();
    }

    public void onComplete() {
        if (!this.f13903d) {
            this.f13903d = true;
            if (this.f13902c == null) {
                a();
                return;
            }
            try {
                this.f13901b.onComplete();
            } catch (Throwable th) {
                a.b(th);
                d.a.d0.a.s(th);
            }
        }
    }

    public void onError(Throwable th) {
        if (this.f13903d) {
            d.a.d0.a.s(th);
            return;
        }
        this.f13903d = true;
        if (this.f13902c == null) {
            NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
            try {
                this.f13901b.onSubscribe(d.a.a0.a.d.INSTANCE);
                try {
                    this.f13901b.onError(new CompositeException(th, nullPointerException));
                } catch (Throwable th2) {
                    a.b(th2);
                    d.a.d0.a.s(new CompositeException(th, nullPointerException, th2));
                }
            } catch (Throwable th3) {
                a.b(th3);
                d.a.d0.a.s(new CompositeException(th, nullPointerException, th3));
            }
        } else {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            try {
                this.f13901b.onError(th);
            } catch (Throwable th4) {
                a.b(th4);
                d.a.d0.a.s(new CompositeException(th, th4));
            }
        }
    }

    public void onNext(T t) {
        if (!this.f13903d) {
            if (this.f13902c == null) {
                b();
            } else if (t == null) {
                NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
                try {
                    this.f13902c.dispose();
                    onError(nullPointerException);
                } catch (Throwable th) {
                    a.b(th);
                    onError(new CompositeException(nullPointerException, th));
                }
            } else {
                try {
                    this.f13901b.onNext(t);
                } catch (Throwable th2) {
                    a.b(th2);
                    onError(new CompositeException(th, th2));
                }
            }
        }
    }

    public void onSubscribe(b bVar) {
        if (c.p(this.f13902c, bVar)) {
            this.f13902c = bVar;
            try {
                this.f13901b.onSubscribe(this);
            } catch (Throwable th) {
                a.b(th);
                d.a.d0.a.s(new CompositeException(th, th));
            }
        }
    }
}
