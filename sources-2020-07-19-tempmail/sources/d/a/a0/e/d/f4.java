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
    final long f12987c;

    /* renamed from: d  reason: collision with root package name */
    final long f12988d;

    /* renamed from: e  reason: collision with root package name */
    final int f12989e;

    /* compiled from: ObservableWindow */
    static final class a<T> extends AtomicInteger implements s<T>, d.a.y.b, Runnable {
        private static final long serialVersionUID = -7481782523886138128L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super l<T>> f12990b;

        /* renamed from: c  reason: collision with root package name */
        final long f12991c;

        /* renamed from: d  reason: collision with root package name */
        final int f12992d;

        /* renamed from: e  reason: collision with root package name */
        long f12993e;

        /* renamed from: f  reason: collision with root package name */
        d.a.y.b f12994f;
        d<T> g;
        volatile boolean h;

        a(s<? super l<T>> sVar, long j, int i) {
            this.f12990b = sVar;
            this.f12991c = j;
            this.f12992d = i;
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
            this.f12990b.onComplete();
        }

        public void onError(Throwable th) {
            d<T> dVar = this.g;
            if (dVar != null) {
                this.g = null;
                dVar.onError(th);
            }
            this.f12990b.onError(th);
        }

        public void onNext(T t) {
            d<T> dVar = this.g;
            if (dVar == null && !this.h) {
                dVar = d.g(this.f12992d, this);
                this.g = dVar;
                this.f12990b.onNext(dVar);
            }
            if (dVar != null) {
                dVar.onNext(t);
                long j = this.f12993e + 1;
                this.f12993e = j;
                if (j >= this.f12991c) {
                    this.f12993e = 0;
                    this.g = null;
                    dVar.onComplete();
                    if (this.h) {
                        this.f12994f.dispose();
                    }
                }
            }
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (c.p(this.f12994f, bVar)) {
                this.f12994f = bVar;
                this.f12990b.onSubscribe(this);
            }
        }

        public void run() {
            if (this.h) {
                this.f12994f.dispose();
            }
        }
    }

    /* compiled from: ObservableWindow */
    static final class b<T> extends AtomicBoolean implements s<T>, d.a.y.b, Runnable {
        private static final long serialVersionUID = 3366976432059579510L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super l<T>> f12995b;

        /* renamed from: c  reason: collision with root package name */
        final long f12996c;

        /* renamed from: d  reason: collision with root package name */
        final long f12997d;

        /* renamed from: e  reason: collision with root package name */
        final int f12998e;

        /* renamed from: f  reason: collision with root package name */
        final ArrayDeque<d<T>> f12999f;
        long g;
        volatile boolean h;
        long i;
        d.a.y.b j;
        final AtomicInteger k = new AtomicInteger();

        b(s<? super l<T>> sVar, long j2, long j3, int i2) {
            this.f12995b = sVar;
            this.f12996c = j2;
            this.f12997d = j3;
            this.f12998e = i2;
            this.f12999f = new ArrayDeque<>();
        }

        public void dispose() {
            this.h = true;
        }

        public void onComplete() {
            ArrayDeque<d<T>> arrayDeque = this.f12999f;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onComplete();
            }
            this.f12995b.onComplete();
        }

        public void onError(Throwable th) {
            ArrayDeque<d<T>> arrayDeque = this.f12999f;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onError(th);
            }
            this.f12995b.onError(th);
        }

        public void onNext(T t) {
            ArrayDeque<d<T>> arrayDeque = this.f12999f;
            long j2 = this.g;
            long j3 = this.f12997d;
            if (j2 % j3 == 0 && !this.h) {
                this.k.getAndIncrement();
                d g2 = d.g(this.f12998e, this);
                arrayDeque.offer(g2);
                this.f12995b.onNext(g2);
            }
            long j4 = this.i + 1;
            Iterator<d<T>> it = arrayDeque.iterator();
            while (it.hasNext()) {
                it.next().onNext(t);
            }
            if (j4 >= this.f12996c) {
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
                this.f12995b.onSubscribe(this);
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
        this.f12987c = j;
        this.f12988d = j2;
        this.f12989e = i;
    }

    public void subscribeActual(s<? super l<T>> sVar) {
        if (this.f12987c == this.f12988d) {
            this.f12780b.subscribe(new a(sVar, this.f12987c, this.f12989e));
            return;
        }
        this.f12780b.subscribe(new b(sVar, this.f12987c, this.f12988d, this.f12989e));
    }
}
