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
    final q<? extends T> f13381b;

    /* renamed from: c  reason: collision with root package name */
    final q<? extends T> f13382c;

    /* renamed from: d  reason: collision with root package name */
    final d<? super T, ? super T> f13383d;

    /* renamed from: e  reason: collision with root package name */
    final int f13384e;

    /* compiled from: ObservableSequenceEqual */
    static final class a<T> extends AtomicInteger implements d.a.y.b {
        private static final long serialVersionUID = -6178010334400373240L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super Boolean> f13385b;

        /* renamed from: c  reason: collision with root package name */
        final d<? super T, ? super T> f13386c;

        /* renamed from: d  reason: collision with root package name */
        final d.a.a0.a.a f13387d = new d.a.a0.a.a(2);

        /* renamed from: e  reason: collision with root package name */
        final q<? extends T> f13388e;

        /* renamed from: f  reason: collision with root package name */
        final q<? extends T> f13389f;
        final b<T>[] g;
        volatile boolean h;
        T i;
        T j;

        a(s<? super Boolean> sVar, int i2, q<? extends T> qVar, q<? extends T> qVar2, d<? super T, ? super T> dVar) {
            this.f13385b = sVar;
            this.f13388e = qVar;
            this.f13389f = qVar2;
            this.f13386c = dVar;
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
                c<T> cVar = bVar.f13391c;
                b<T> bVar2 = bVarArr[1];
                c<T> cVar2 = bVar2.f13391c;
                int i2 = 1;
                while (!this.h) {
                    boolean z = bVar.f13393e;
                    if (!z || (th2 = bVar.f13394f) == null) {
                        boolean z2 = bVar2.f13393e;
                        if (!z2 || (th = bVar2.f13394f) == null) {
                            if (this.i == null) {
                                this.i = cVar.poll();
                            }
                            boolean z3 = this.i == null;
                            if (this.j == null) {
                                this.j = cVar2.poll();
                            }
                            boolean z4 = this.j == null;
                            if (z && z2 && z3 && z4) {
                                this.f13385b.onNext(Boolean.TRUE);
                                this.f13385b.onComplete();
                                return;
                            } else if (!z || !z2 || z3 == z4) {
                                if (!z3 && !z4) {
                                    try {
                                        if (!this.f13386c.a(this.i, this.j)) {
                                            a(cVar, cVar2);
                                            this.f13385b.onNext(Boolean.FALSE);
                                            this.f13385b.onComplete();
                                            return;
                                        }
                                        this.i = null;
                                        this.j = null;
                                    } catch (Throwable th3) {
                                        io.reactivex.exceptions.a.b(th3);
                                        a(cVar, cVar2);
                                        this.f13385b.onError(th3);
                                        return;
                                    }
                                }
                                if ((z3 || z4) && (i2 = addAndGet(-i2)) == 0) {
                                    return;
                                }
                            } else {
                                a(cVar, cVar2);
                                this.f13385b.onNext(Boolean.FALSE);
                                this.f13385b.onComplete();
                                return;
                            }
                        } else {
                            a(cVar, cVar2);
                            this.f13385b.onError(th);
                            return;
                        }
                    } else {
                        a(cVar, cVar2);
                        this.f13385b.onError(th2);
                        return;
                    }
                }
                cVar.clear();
                cVar2.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean c(d.a.y.b bVar, int i2) {
            return this.f13387d.a(i2, bVar);
        }

        /* access modifiers changed from: package-private */
        public void d() {
            b<T>[] bVarArr = this.g;
            this.f13388e.subscribe(bVarArr[0]);
            this.f13389f.subscribe(bVarArr[1]);
        }

        public void dispose() {
            if (!this.h) {
                this.h = true;
                this.f13387d.dispose();
                if (getAndIncrement() == 0) {
                    b<T>[] bVarArr = this.g;
                    bVarArr[0].f13391c.clear();
                    bVarArr[1].f13391c.clear();
                }
            }
        }
    }

    /* compiled from: ObservableSequenceEqual */
    static final class b<T> implements s<T> {

        /* renamed from: b  reason: collision with root package name */
        final a<T> f13390b;

        /* renamed from: c  reason: collision with root package name */
        final c<T> f13391c;

        /* renamed from: d  reason: collision with root package name */
        final int f13392d;

        /* renamed from: e  reason: collision with root package name */
        volatile boolean f13393e;

        /* renamed from: f  reason: collision with root package name */
        Throwable f13394f;

        b(a<T> aVar, int i, int i2) {
            this.f13390b = aVar;
            this.f13392d = i;
            this.f13391c = new c<>(i2);
        }

        public void onComplete() {
            this.f13393e = true;
            this.f13390b.b();
        }

        public void onError(Throwable th) {
            this.f13394f = th;
            this.f13393e = true;
            this.f13390b.b();
        }

        public void onNext(T t) {
            this.f13391c.offer(t);
            this.f13390b.b();
        }

        public void onSubscribe(d.a.y.b bVar) {
            this.f13390b.c(bVar, this.f13392d);
        }
    }

    public b3(q<? extends T> qVar, q<? extends T> qVar2, d<? super T, ? super T> dVar, int i) {
        this.f13381b = qVar;
        this.f13382c = qVar2;
        this.f13383d = dVar;
        this.f13384e = i;
    }

    public void subscribeActual(s<? super Boolean> sVar) {
        a aVar = new a(sVar, this.f13384e, this.f13381b, this.f13382c, this.f13383d);
        sVar.onSubscribe(aVar);
        aVar.d();
    }
}
