package d.a.a0.e.d;

import d.a.a0.f.c;
import d.a.l;
import d.a.q;
import d.a.s;
import d.a.z.d;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ObservableSequenceEqual */
public final class b3<T> extends l<Boolean> {

    /* renamed from: b  reason: collision with root package name */
    final q<? extends T> f12823b;

    /* renamed from: c  reason: collision with root package name */
    final q<? extends T> f12824c;

    /* renamed from: d  reason: collision with root package name */
    final d<? super T, ? super T> f12825d;

    /* renamed from: e  reason: collision with root package name */
    final int f12826e;

    /* compiled from: ObservableSequenceEqual */
    static final class a<T> extends AtomicInteger implements d.a.y.b {
        private static final long serialVersionUID = -6178010334400373240L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super Boolean> f12827b;

        /* renamed from: c  reason: collision with root package name */
        final d<? super T, ? super T> f12828c;

        /* renamed from: d  reason: collision with root package name */
        final d.a.a0.a.a f12829d = new d.a.a0.a.a(2);

        /* renamed from: e  reason: collision with root package name */
        final q<? extends T> f12830e;

        /* renamed from: f  reason: collision with root package name */
        final q<? extends T> f12831f;
        final b<T>[] g;
        volatile boolean h;
        T i;
        T j;

        a(s<? super Boolean> sVar, int i2, q<? extends T> qVar, q<? extends T> qVar2, d<? super T, ? super T> dVar) {
            this.f12827b = sVar;
            this.f12830e = qVar;
            this.f12831f = qVar2;
            this.f12828c = dVar;
            b<T>[] bVarArr = new b[2];
            this.g = bVarArr;
            bVarArr[0] = new b<>(this, 0, i2);
            bVarArr[1] = new b<>(this, 1, i2);
        }

        /* access modifiers changed from: package-private */
        public void a(c<T> cVar, c<T> cVar2) {
            this.h = true;
            cVar.clear();
            cVar2.clear();
        }

        /* access modifiers changed from: package-private */
        public void b() {
            Throwable th;
            Throwable th2;
            if (getAndIncrement() == 0) {
                b<T>[] bVarArr = this.g;
                b<T> bVar = bVarArr[0];
                c<T> cVar = bVar.f12833c;
                b<T> bVar2 = bVarArr[1];
                c<T> cVar2 = bVar2.f12833c;
                int i2 = 1;
                while (!this.h) {
                    boolean z = bVar.f12835e;
                    if (!z || (th2 = bVar.f12836f) == null) {
                        boolean z2 = bVar2.f12835e;
                        if (!z2 || (th = bVar2.f12836f) == null) {
                            if (this.i == null) {
                                this.i = cVar.poll();
                            }
                            boolean z3 = this.i == null;
                            if (this.j == null) {
                                this.j = cVar2.poll();
                            }
                            boolean z4 = this.j == null;
                            if (z && z2 && z3 && z4) {
                                this.f12827b.onNext(Boolean.TRUE);
                                this.f12827b.onComplete();
                                return;
                            } else if (!z || !z2 || z3 == z4) {
                                if (!z3 && !z4) {
                                    try {
                                        if (!this.f12828c.a(this.i, this.j)) {
                                            a(cVar, cVar2);
                                            this.f12827b.onNext(Boolean.FALSE);
                                            this.f12827b.onComplete();
                                            return;
                                        }
                                        this.i = null;
                                        this.j = null;
                                    } catch (Throwable th3) {
                                        io.reactivex.exceptions.a.b(th3);
                                        a(cVar, cVar2);
                                        this.f12827b.onError(th3);
                                        return;
                                    }
                                }
                                if ((z3 || z4) && (i2 = addAndGet(-i2)) == 0) {
                                    return;
                                }
                            } else {
                                a(cVar, cVar2);
                                this.f12827b.onNext(Boolean.FALSE);
                                this.f12827b.onComplete();
                                return;
                            }
                        } else {
                            a(cVar, cVar2);
                            this.f12827b.onError(th);
                            return;
                        }
                    } else {
                        a(cVar, cVar2);
                        this.f12827b.onError(th2);
                        return;
                    }
                }
                cVar.clear();
                cVar2.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean c(d.a.y.b bVar, int i2) {
            return this.f12829d.a(i2, bVar);
        }

        /* access modifiers changed from: package-private */
        public void d() {
            b<T>[] bVarArr = this.g;
            this.f12830e.subscribe(bVarArr[0]);
            this.f12831f.subscribe(bVarArr[1]);
        }

        public void dispose() {
            if (!this.h) {
                this.h = true;
                this.f12829d.dispose();
                if (getAndIncrement() == 0) {
                    b<T>[] bVarArr = this.g;
                    bVarArr[0].f12833c.clear();
                    bVarArr[1].f12833c.clear();
                }
            }
        }
    }

    /* compiled from: ObservableSequenceEqual */
    static final class b<T> implements s<T> {

        /* renamed from: b  reason: collision with root package name */
        final a<T> f12832b;

        /* renamed from: c  reason: collision with root package name */
        final c<T> f12833c;

        /* renamed from: d  reason: collision with root package name */
        final int f12834d;

        /* renamed from: e  reason: collision with root package name */
        volatile boolean f12835e;

        /* renamed from: f  reason: collision with root package name */
        Throwable f12836f;

        b(a<T> aVar, int i, int i2) {
            this.f12832b = aVar;
            this.f12834d = i;
            this.f12833c = new c<>(i2);
        }

        public void onComplete() {
            this.f12835e = true;
            this.f12832b.b();
        }

        public void onError(Throwable th) {
            this.f12836f = th;
            this.f12835e = true;
            this.f12832b.b();
        }

        public void onNext(T t) {
            this.f12833c.offer(t);
            this.f12832b.b();
        }

        public void onSubscribe(d.a.y.b bVar) {
            this.f12832b.c(bVar, this.f12834d);
        }
    }

    public b3(q<? extends T> qVar, q<? extends T> qVar2, d<? super T, ? super T> dVar, int i) {
        this.f12823b = qVar;
        this.f12824c = qVar2;
        this.f12825d = dVar;
        this.f12826e = i;
    }

    public void subscribeActual(s<? super Boolean> sVar) {
        a aVar = new a(sVar, this.f12826e, this.f12823b, this.f12824c, this.f12825d);
        sVar.onSubscribe(aVar);
        aVar.d();
    }
}
