package d.a.a0.e.a;

import d.a.a0.c.e;
import d.a.a0.j.d;
import d.a.f;
import d.a.g;
import f.a.b;
import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: FlowableOnBackpressureBuffer */
public final class c<T> extends a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    final int f12699d;

    /* renamed from: e  reason: collision with root package name */
    final boolean f12700e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f12701f;
    final d.a.z.a g;

    /* compiled from: FlowableOnBackpressureBuffer */
    static final class a<T> extends d.a.a0.i.a<T> implements g<T> {
        private static final long serialVersionUID = -2514538129242366402L;

        /* renamed from: b  reason: collision with root package name */
        final b<? super T> f12702b;

        /* renamed from: c  reason: collision with root package name */
        final e<T> f12703c;

        /* renamed from: d  reason: collision with root package name */
        final boolean f12704d;

        /* renamed from: e  reason: collision with root package name */
        final d.a.z.a f12705e;

        /* renamed from: f  reason: collision with root package name */
        f.a.c f12706f;
        volatile boolean g;
        volatile boolean h;
        Throwable i;
        final AtomicLong j = new AtomicLong();
        boolean k;

        a(b<? super T> bVar, int i2, boolean z, boolean z2, d.a.z.a aVar) {
            e<T> eVar;
            this.f12702b = bVar;
            this.f12705e = aVar;
            this.f12704d = z2;
            if (z) {
                eVar = new d.a.a0.f.c<>(i2);
            } else {
                eVar = new d.a.a0.f.b<>(i2);
            }
            this.f12703c = eVar;
        }

        /* access modifiers changed from: package-private */
        public boolean a(boolean z, boolean z2, b<? super T> bVar) {
            if (this.g) {
                this.f12703c.clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!this.f12704d) {
                    Throwable th = this.i;
                    if (th != null) {
                        this.f12703c.clear();
                        bVar.onError(th);
                        return true;
                    } else if (!z2) {
                        return false;
                    } else {
                        bVar.onComplete();
                        return true;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    Throwable th2 = this.i;
                    if (th2 != null) {
                        bVar.onError(th2);
                    } else {
                        bVar.onComplete();
                    }
                    return true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            int i2;
            if (getAndIncrement() == 0) {
                e<T> eVar = this.f12703c;
                b<? super T> bVar = this.f12702b;
                int i3 = 1;
                while (!a(this.h, eVar.isEmpty(), bVar)) {
                    long j2 = this.j.get();
                    long j3 = 0;
                    while (true) {
                        i2 = (j3 > j2 ? 1 : (j3 == j2 ? 0 : -1));
                        if (i2 == 0) {
                            break;
                        }
                        boolean z = this.h;
                        T poll = eVar.poll();
                        boolean z2 = poll == null;
                        if (!a(z, z2, bVar)) {
                            if (z2) {
                                break;
                            }
                            bVar.onNext(poll);
                            j3++;
                        } else {
                            return;
                        }
                    }
                    if (i2 != 0 || !a(this.h, eVar.isEmpty(), bVar)) {
                        if (!(j3 == 0 || j2 == Long.MAX_VALUE)) {
                            this.j.addAndGet(-j3);
                        }
                        i3 = addAndGet(-i3);
                        if (i3 == 0) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        public void cancel() {
            if (!this.g) {
                this.g = true;
                this.f12706f.cancel();
                if (!this.k && getAndIncrement() == 0) {
                    this.f12703c.clear();
                }
            }
        }

        public void clear() {
            this.f12703c.clear();
        }

        public void f(f.a.c cVar) {
            if (d.a.a0.i.b.o(this.f12706f, cVar)) {
                this.f12706f = cVar;
                this.f12702b.f(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        public int g(int i2) {
            if ((i2 & 2) == 0) {
                return 0;
            }
            this.k = true;
            return 2;
        }

        public boolean isEmpty() {
            return this.f12703c.isEmpty();
        }

        public void onComplete() {
            this.h = true;
            if (this.k) {
                this.f12702b.onComplete();
            } else {
                b();
            }
        }

        public void onError(Throwable th) {
            this.i = th;
            this.h = true;
            if (this.k) {
                this.f12702b.onError(th);
            } else {
                b();
            }
        }

        public void onNext(T t) {
            if (!this.f12703c.offer(t)) {
                this.f12706f.cancel();
                MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
                try {
                    this.f12705e.run();
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    missingBackpressureException.initCause(th);
                }
                onError(missingBackpressureException);
            } else if (this.k) {
                this.f12702b.onNext(null);
            } else {
                b();
            }
        }

        public T poll() throws Exception {
            return this.f12703c.poll();
        }

        public void request(long j2) {
            if (!this.k && d.a.a0.i.b.n(j2)) {
                d.a(this.j, j2);
                b();
            }
        }
    }

    public c(f<T> fVar, int i, boolean z, boolean z2, d.a.z.a aVar) {
        super(fVar);
        this.f12699d = i;
        this.f12700e = z;
        this.f12701f = z2;
        this.g = aVar;
    }

    /* access modifiers changed from: protected */
    public void i(b<? super T> bVar) {
        this.f12695c.h(new a(bVar, this.f12699d, this.f12700e, this.f12701f, this.g));
    }
}
