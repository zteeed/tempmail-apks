package d.a.a0.e.a;

import d.a.a0.j.d;
import d.a.g;
import f.a.b;
import f.a.c;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FlowableOnBackpressureLatest */
public final class f<T> extends a<T, T> {

    /* compiled from: FlowableOnBackpressureLatest */
    static final class a<T> extends AtomicInteger implements g<T>, c {
        private static final long serialVersionUID = 163080509307634843L;

        /* renamed from: b  reason: collision with root package name */
        final b<? super T> f12715b;

        /* renamed from: c  reason: collision with root package name */
        c f12716c;

        /* renamed from: d  reason: collision with root package name */
        volatile boolean f12717d;

        /* renamed from: e  reason: collision with root package name */
        Throwable f12718e;

        /* renamed from: f  reason: collision with root package name */
        volatile boolean f12719f;
        final AtomicLong g = new AtomicLong();
        final AtomicReference<T> h = new AtomicReference<>();

        a(b<? super T> bVar) {
            this.f12715b = bVar;
        }

        /* access modifiers changed from: package-private */
        public boolean a(boolean z, boolean z2, b<?> bVar, AtomicReference<T> atomicReference) {
            if (this.f12719f) {
                atomicReference.lazySet((Object) null);
                return true;
            } else if (!z) {
                return false;
            } else {
                Throwable th = this.f12718e;
                if (th != null) {
                    atomicReference.lazySet((Object) null);
                    bVar.onError(th);
                    return true;
                } else if (!z2) {
                    return false;
                } else {
                    bVar.onComplete();
                    return true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            boolean z;
            if (getAndIncrement() == 0) {
                b<? super T> bVar = this.f12715b;
                AtomicLong atomicLong = this.g;
                AtomicReference<T> atomicReference = this.h;
                int i = 1;
                do {
                    long j = 0;
                    while (true) {
                        z = false;
                        if (j == atomicLong.get()) {
                            break;
                        }
                        boolean z2 = this.f12717d;
                        T andSet = atomicReference.getAndSet((Object) null);
                        boolean z3 = andSet == null;
                        if (!a(z2, z3, bVar, atomicReference)) {
                            if (z3) {
                                break;
                            }
                            bVar.onNext(andSet);
                            j++;
                        } else {
                            return;
                        }
                    }
                    if (j == atomicLong.get()) {
                        boolean z4 = this.f12717d;
                        if (atomicReference.get() == null) {
                            z = true;
                        }
                        if (a(z4, z, bVar, atomicReference)) {
                            return;
                        }
                    }
                    if (j != 0) {
                        d.c(atomicLong, j);
                    }
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }

        public void cancel() {
            if (!this.f12719f) {
                this.f12719f = true;
                this.f12716c.cancel();
                if (getAndIncrement() == 0) {
                    this.h.lazySet((Object) null);
                }
            }
        }

        public void f(c cVar) {
            if (d.a.a0.i.b.o(this.f12716c, cVar)) {
                this.f12716c = cVar;
                this.f12715b.f(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        public void onComplete() {
            this.f12717d = true;
            b();
        }

        public void onError(Throwable th) {
            this.f12718e = th;
            this.f12717d = true;
            b();
        }

        public void onNext(T t) {
            this.h.lazySet(t);
            b();
        }

        public void request(long j) {
            if (d.a.a0.i.b.n(j)) {
                d.a(this.g, j);
                b();
            }
        }
    }

    public f(d.a.f<T> fVar) {
        super(fVar);
    }

    /* access modifiers changed from: protected */
    public void i(b<? super T> bVar) {
        this.f12695c.h(new a(bVar));
    }
}
