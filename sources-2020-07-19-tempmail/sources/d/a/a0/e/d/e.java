package d.a.a0.e.d;

import d.a.a0.j.j;
import d.a.c0.c;
import d.a.k;
import d.a.q;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: BlockingObservableNext */
public final class e<T> implements Iterable<T> {

    /* renamed from: b  reason: collision with root package name */
    final q<T> f12915b;

    /* compiled from: BlockingObservableNext */
    static final class a<T> implements Iterator<T> {

        /* renamed from: b  reason: collision with root package name */
        private final b<T> f12916b;

        /* renamed from: c  reason: collision with root package name */
        private final q<T> f12917c;

        /* renamed from: d  reason: collision with root package name */
        private T f12918d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f12919e = true;

        /* renamed from: f  reason: collision with root package name */
        private boolean f12920f = true;
        private Throwable g;
        private boolean h;

        a(q<T> qVar, b<T> bVar) {
            this.f12917c = qVar;
            this.f12916b = bVar;
        }

        private boolean b() {
            if (!this.h) {
                this.h = true;
                this.f12916b.d();
                new x1(this.f12917c).subscribe(this.f12916b);
            }
            try {
                k<T> e2 = this.f12916b.e();
                if (e2.h()) {
                    this.f12920f = false;
                    this.f12918d = e2.e();
                    return true;
                }
                this.f12919e = false;
                if (e2.f()) {
                    return false;
                }
                Throwable d2 = e2.d();
                this.g = d2;
                throw j.d(d2);
            } catch (InterruptedException e3) {
                this.f12916b.dispose();
                this.g = e3;
                throw j.d(e3);
            }
        }

        public boolean hasNext() {
            Throwable th = this.g;
            if (th != null) {
                throw j.d(th);
            } else if (!this.f12919e) {
                return false;
            } else {
                if (!this.f12920f || b()) {
                    return true;
                }
                return false;
            }
        }

        public T next() {
            Throwable th = this.g;
            if (th != null) {
                throw j.d(th);
            } else if (hasNext()) {
                this.f12920f = true;
                return this.f12918d;
            } else {
                throw new NoSuchElementException("No more elements");
            }
        }

        public void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }
    }

    /* compiled from: BlockingObservableNext */
    static final class b<T> extends c<k<T>> {

        /* renamed from: c  reason: collision with root package name */
        private final BlockingQueue<k<T>> f12921c = new ArrayBlockingQueue(1);

        /* renamed from: d  reason: collision with root package name */
        final AtomicInteger f12922d = new AtomicInteger();

        b() {
        }

        /* renamed from: c */
        public void onNext(k<T> kVar) {
            if (this.f12922d.getAndSet(0) == 1 || !kVar.h()) {
                while (!this.f12921c.offer(kVar)) {
                    k<T> kVar2 = (k) this.f12921c.poll();
                    if (kVar2 != null && !kVar2.h()) {
                        kVar = kVar2;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.f12922d.set(1);
        }

        public k<T> e() throws InterruptedException {
            d();
            d.a.a0.j.e.b();
            return this.f12921c.take();
        }

        public void onComplete() {
        }

        public void onError(Throwable th) {
            d.a.d0.a.s(th);
        }
    }

    public e(q<T> qVar) {
        this.f12915b = qVar;
    }

    public Iterator<T> iterator() {
        return new a(this.f12915b, new b());
    }
}
