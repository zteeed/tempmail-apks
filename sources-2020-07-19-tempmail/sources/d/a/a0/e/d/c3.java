package d.a.a0.e.d;

import d.a.a0.f.c;
import d.a.l;
import d.a.q;
import d.a.s;
import d.a.u;
import d.a.v;
import d.a.z.d;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ObservableSequenceEqualSingle */
public final class c3<T> extends u<Boolean> implements d.a.a0.c.a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final q<? extends T> f12864a;

    /* renamed from: b  reason: collision with root package name */
    final q<? extends T> f12865b;

    /* renamed from: c  reason: collision with root package name */
    final d<? super T, ? super T> f12866c;

    /* renamed from: d  reason: collision with root package name */
    final int f12867d;

    /* compiled from: ObservableSequenceEqualSingle */
    static final class a<T> extends AtomicInteger implements d.a.y.b {
        private static final long serialVersionUID = -6178010334400373240L;

        /* renamed from: b  reason: collision with root package name */
        final v<? super Boolean> f12868b;

        /* renamed from: c  reason: collision with root package name */
        final d<? super T, ? super T> f12869c;

        /* renamed from: d  reason: collision with root package name */
        final d.a.a0.a.a f12870d = new d.a.a0.a.a(2);

        /* renamed from: e  reason: collision with root package name */
        final q<? extends T> f12871e;

        /* renamed from: f  reason: collision with root package name */
        final q<? extends T> f12872f;
        final b<T>[] g;
        volatile boolean h;
        T i;
        T j;

        a(v<? super Boolean> vVar, int i2, q<? extends T> qVar, q<? extends T> qVar2, d<? super T, ? super T> dVar) {
            this.f12868b = vVar;
            this.f12871e = qVar;
            this.f12872f = qVar2;
            this.f12869c = dVar;
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
                c<T> cVar = bVar.f12874c;
                b<T> bVar2 = bVarArr[1];
                c<T> cVar2 = bVar2.f12874c;
                int i2 = 1;
                while (!this.h) {
                    boolean z = bVar.f12876e;
                    if (!z || (th2 = bVar.f12877f) == null) {
                        boolean z2 = bVar2.f12876e;
                        if (!z2 || (th = bVar2.f12877f) == null) {
                            if (this.i == null) {
                                this.i = cVar.poll();
                            }
                            boolean z3 = this.i == null;
                            if (this.j == null) {
                                this.j = cVar2.poll();
                            }
                            boolean z4 = this.j == null;
                            if (z && z2 && z3 && z4) {
                                this.f12868b.onSuccess(Boolean.TRUE);
                                return;
                            } else if (!z || !z2 || z3 == z4) {
                                if (!z3 && !z4) {
                                    try {
                                        if (!this.f12869c.a(this.i, this.j)) {
                                            a(cVar, cVar2);
                                            this.f12868b.onSuccess(Boolean.FALSE);
                                            return;
                                        }
                                        this.i = null;
                                        this.j = null;
                                    } catch (Throwable th3) {
                                        io.reactivex.exceptions.a.b(th3);
                                        a(cVar, cVar2);
                                        this.f12868b.onError(th3);
                                        return;
                                    }
                                }
                                if ((z3 || z4) && (i2 = addAndGet(-i2)) == 0) {
                                    return;
                                }
                            } else {
                                a(cVar, cVar2);
                                this.f12868b.onSuccess(Boolean.FALSE);
                                return;
                            }
                        } else {
                            a(cVar, cVar2);
                            this.f12868b.onError(th);
                            return;
                        }
                    } else {
                        a(cVar, cVar2);
                        this.f12868b.onError(th2);
                        return;
                    }
                }
                cVar.clear();
                cVar2.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean c(d.a.y.b bVar, int i2) {
            return this.f12870d.a(i2, bVar);
        }

        /* access modifiers changed from: package-private */
        public void d() {
            b<T>[] bVarArr = this.g;
            this.f12871e.subscribe(bVarArr[0]);
            this.f12872f.subscribe(bVarArr[1]);
        }

        public void dispose() {
            if (!this.h) {
                this.h = true;
                this.f12870d.dispose();
                if (getAndIncrement() == 0) {
                    b<T>[] bVarArr = this.g;
                    bVarArr[0].f12874c.clear();
                    bVarArr[1].f12874c.clear();
                }
            }
        }
    }

    /* compiled from: ObservableSequenceEqualSingle */
    static final class b<T> implements s<T> {

        /* renamed from: b  reason: collision with root package name */
        final a<T> f12873b;

        /* renamed from: c  reason: collision with root package name */
        final c<T> f12874c;

        /* renamed from: d  reason: collision with root package name */
        final int f12875d;

        /* renamed from: e  reason: collision with root package name */
        volatile boolean f12876e;

        /* renamed from: f  reason: collision with root package name */
        Throwable f12877f;

        b(a<T> aVar, int i, int i2) {
            this.f12873b = aVar;
            this.f12875d = i;
            this.f12874c = new c<>(i2);
        }

        public void onComplete() {
            this.f12876e = true;
            this.f12873b.b();
        }

        public void onError(Throwable th) {
            this.f12877f = th;
            this.f12876e = true;
            this.f12873b.b();
        }

        public void onNext(T t) {
            this.f12874c.offer(t);
            this.f12873b.b();
        }

        public void onSubscribe(d.a.y.b bVar) {
            this.f12873b.c(bVar, this.f12875d);
        }
    }

    public c3(q<? extends T> qVar, q<? extends T> qVar2, d<? super T, ? super T> dVar, int i) {
        this.f12864a = qVar;
        this.f12865b = qVar2;
        this.f12866c = dVar;
        this.f12867d = i;
    }

    public l<Boolean> a() {
        return d.a.d0.a.n(new b3(this.f12864a, this.f12865b, this.f12866c, this.f12867d));
    }

    public void e(v<? super Boolean> vVar) {
        a aVar = new a(vVar, this.f12867d, this.f12864a, this.f12865b, this.f12866c);
        vVar.onSubscribe(aVar);
        aVar.d();
    }
}
