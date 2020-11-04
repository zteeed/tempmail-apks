package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.f0.d;
import d.a.l;
import d.a.q;
import d.a.s;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ObservableWindow */
public final class f4<T> extends a<T, l<T>> {

    /* renamed from: c  reason: collision with root package name */
    final long f13545c;

    /* renamed from: d  reason: collision with root package name */
    final long f13546d;

    /* renamed from: e  reason: collision with root package name */
    final int f13547e;

    /* compiled from: ObservableWindow */
    static final class a<T> extends AtomicInteger implements s<T>, d.a.y.b, Runnable {
        private static final long serialVersionUID = -7481782523886138128L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super l<T>> f13548b;

        /* renamed from: c  reason: collision with root package name */
        final long f13549c;

        /* renamed from: d  reason: collision with root package name */
        final int f13550d;

        /* renamed from: e  reason: collision with root package name */
        long f13551e;

        /* renamed from: f  reason: collision with root package name */
        d.a.y.b f13552f;
        d<T> g;
        volatile boolean h;

        a(s<? super l<T>> sVar, long j, int i) {
            this.f13548b = sVar;
            this.f13549c = j;
            this.f13550d = i;
        }

        public void dispose() {
            this.h = true;
        }

        public void onComplete() {
            d<T> dVar = this.g;
            if (dVar != null) {
                this.g = null;
                dVar.onComplete();
            }
            this.f13548b.onComplete();
        }

        public void onError(Throwable th) {
            d<T> dVar = this.g;
            if (dVar != null) {
                this.g = null;
                dVar.onError(th);
            }
            this.f13548b.onError(th);
        }

        public void onNext(T t) {
            d<T> dVar = this.g;
            if (dVar == null && !this.h) {
                dVar = d.g(this.f13550d, this);
                this.g = dVar;
                this.f13548b.onNext(dVar);
            }
            if (dVar != null) {
                dVar.onNext(t);
                long j = this.f13551e + 1;
                this.f13551e = j;
                if (j >= this.f13549c) {
                    this.f13551e = 0;
                    this.g = null;
                    dVar.onComplete();
                    if (this.h) {
                        this.f13552f.dispose();
                    }
                }
            }
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (c.p(this.f13552f, bVar)) {
                this.f13552f = bVar;
                this.f13548b.onSubscribe(this);
            }
        }

        public void run() {
            if (this.h) {
                this.f13552f.dispose();
            }
        }
    }

    /* compiled from: ObservableWindow */
    static final class b<T> extends AtomicBoolean implements s<T>, d.a.y.b, Runnable {
        private static final long serialVersionUID = 3366976432059579510L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super l<T>> f13553b;

        /* renamed from: c  reason: collision with root package name */
        final long f13554c;

        /* renamed from: d  reason: collision with root package name */
        final long f13555d;

        /* renamed from: e  reason: collision with root package name */
        final int f13556e;

        /* renamed from: f  reason: collision with root package name */
        final ArrayDeque<d<T>> f13557f;
        long g;
        volatile boolean h;
        long i;
        d.a.y.b j;
        final AtomicInteger k = new AtomicInteger();

        b(s<? super l<T>> sVar, long j2, long j3, int i2) {
            this.f13553b = sVar;
            this.f13554c = j2;
            this.f13555d = j3;
            this.f13556e = i2;
            this.f13557f = new ArrayDeque<>();
        }

        public void dispose() {
            this.h = true;
        }

        public void onComplete() {
            ArrayDeque<d<T>> arrayDeque = this.f13557f;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onComplete();
            }
            this.f13553b.onComplete();
        }

        public void onError(Throwable th) {
            ArrayDeque<d<T>> arrayDeque = this.f13557f;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onError(th);
            }
            this.f13553b.onError(th);
        }

        public void onNext(T t) {
            ArrayDeque<d<T>> arrayDeque = this.f13557f;
            long j2 = this.g;
            long j3 = this.f13555d;
            if (j2 % j3 == 0 && !this.h) {
                this.k.getAndIncrement();
                d g2 = d.g(this.f13556e, this);
                arrayDeque.offer(g2);
                this.f13553b.onNext(g2);
            }
            long j4 = this.i + 1;
            Iterator<d<T>> it = arrayDeque.iterator();
            while (it.hasNext()) {
                it.next().onNext(t);
            }
            if (j4 >= this.f13554c) {
                arrayDeque.poll().onComplete();
                if (!arrayDeque.isEmpty() || !this.h) {
                    this.i = j4 - j3;
                } else {
                    this.j.dispose();
                    return;
                }
            } else {
                this.i = j4;
            }
            this.g = j2 + 1;
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (c.p(this.j, bVar)) {
                this.j = bVar;
                this.f13553b.onSubscribe(this);
            }
        }

        public void run() {
            if (this.k.decrementAndGet() == 0 && this.h) {
                this.j.dispose();
            }
        }
    }

    public f4(q<T> qVar, long j, long j2, int i) {
        super(qVar);
        this.f13545c = j;
        this.f13546d = j2;
        this.f13547e = i;
    }

    public void subscribeActual(s<? super l<T>> sVar) {
        if (this.f13545c == this.f13546d) {
            this.f13338b.subscribe(new a(sVar, this.f13545c, this.f13547e));
            return;
        }
        this.f13338b.subscribe(new b(sVar, this.f13545c, this.f13546d, this.f13547e));
    }
}
