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
    final q<? extends T> f13422a;

    /* renamed from: b  reason: collision with root package name */
    final q<? extends T> f13423b;

    /* renamed from: c  reason: collision with root package name */
    final d<? super T, ? super T> f13424c;

    /* renamed from: d  reason: collision with root package name */
    final int f13425d;

    /* compiled from: ObservableSequenceEqualSingle */
    static final class a<T> extends AtomicInteger implements d.a.y.b {
        private static final long serialVersionUID = -6178010334400373240L;

        /* renamed from: b  reason: collision with root package name */
        final v<? super Boolean> f13426b;

        /* renamed from: c  reason: collision with root package name */
        final d<? super T, ? super T> f13427c;

        /* renamed from: d  reason: collision with root package name */
        final d.a.a0.a.a f13428d = new d.a.a0.a.a(2);

        /* renamed from: e  reason: collision with root package name */
        final q<? extends T> f13429e;

        /* renamed from: f  reason: collision with root package name */
        final q<? extends T> f13430f;
        final b<T>[] g;
        volatile boolean h;
        T i;
        T j;

        a(v<? super Boolean> vVar, int i2, q<? extends T> qVar, q<? extends T> qVar2, d<? super T, ? super T> dVar) {
            this.f13426b = vVar;
            this.f13429e = qVar;
            this.f13430f = qVar2;
            this.f13427c = dVar;
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
                c<T> cVar = bVar.f13432c;
                b<T> bVar2 = bVarArr[1];
                c<T> cVar2 = bVar2.f13432c;
                int i2 = 1;
                while (!this.h) {
                    boolean z = bVar.f13434e;
                    if (!z || (th2 = bVar.f13435f) == null) {
                        boolean z2 = bVar2.f13434e;
                        if (!z2 || (th = bVar2.f13435f) == null) {
                            if (this.i == null) {
                                this.i = cVar.poll();
                            }
                            boolean z3 = this.i == null;
                            if (this.j == null) {
                                this.j = cVar2.poll();
                            }
                            boolean z4 = this.j == null;
                            if (z && z2 && z3 && z4) {
                                this.f13426b.onSuccess(Boolean.TRUE);
                                return;
                            } else if (!z || !z2 || z3 == z4) {
                                if (!z3 && !z4) {
                                    try {
                                        if (!this.f13427c.a(this.i, this.j)) {
                                            a(cVar, cVar2);
                                            this.f13426b.onSuccess(Boolean.FALSE);
                                            return;
                                        }
                                        this.i = null;
                                        this.j = null;
                                    } catch (Throwable th3) {
                                        io.reactivex.exceptions.a.b(th3);
                                        a(cVar, cVar2);
                                        this.f13426b.onError(th3);
                                        return;
                                    }
                                }
                                if ((z3 || z4) && (i2 = addAndGet(-i2)) == 0) {
                                    return;
                                }
                            } else {
                                a(cVar, cVar2);
                                this.f13426b.onSuccess(Boolean.FALSE);
                                return;
                            }
                        } else {
                            a(cVar, cVar2);
                            this.f13426b.onError(th);
                            return;
                        }
                    } else {
                        a(cVar, cVar2);
                        this.f13426b.onError(th2);
                        return;
                    }
                }
                cVar.clear();
                cVar2.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean c(d.a.y.b bVar, int i2) {
            return this.f13428d.a(i2, bVar);
        }

        /* access modifiers changed from: package-private */
        public void d() {
            b<T>[] bVarArr = this.g;
            this.f13429e.subscribe(bVarArr[0]);
            this.f13430f.subscribe(bVarArr[1]);
        }

        public void dispose() {
            if (!this.h) {
                this.h = true;
                this.f13428d.dispose();
                if (getAndIncrement() == 0) {
                    b<T>[] bVarArr = this.g;
                    bVarArr[0].f13432c.clear();
                    bVarArr[1].f13432c.clear();
                }
            }
        }
    }

    /* compiled from: ObservableSequenceEqualSingle */
    static final class b<T> implements s<T> {

        /* renamed from: b  reason: collision with root package name */
        final a<T> f13431b;

        /* renamed from: c  reason: collision with root package name */
        final c<T> f13432c;

        /* renamed from: d  reason: collision with root package name */
        final int f13433d;

        /* renamed from: e  reason: collision with root package name */
        volatile boolean f13434e;

        /* renamed from: f  reason: collision with root package name */
        Throwable f13435f;

        b(a<T> aVar, int i, int i2) {
            this.f13431b = aVar;
            this.f13433d = i;
            this.f13432c = new c<>(i2);
        }

        public void onComplete() {
            this.f13434e = true;
            this.f13431b.b();
        }

        public void onError(Throwable th) {
            this.f13435f = th;
            this.f13434e = true;
            this.f13431b.b();
        }

        public void onNext(T t) {
            this.f13432c.offer(t);
            this.f13431b.b();
        }

        public void onSubscribe(d.a.y.b bVar) {
            this.f13431b.c(bVar, this.f13433d);
        }
    }

    public c3(q<? extends T> qVar, q<? extends T> qVar2, d<? super T, ? super T> dVar, int i) {
        this.f13422a = qVar;
        this.f13423b = qVar2;
        this.f13424c = dVar;
        this.f13425d = i;
    }

    public l<Boolean> a() {
        return d.a.d0.a.n(new b3(this.f13422a, this.f13423b, this.f13424c, this.f13425d));
    }

    public void e(v<? super Boolean> vVar) {
        a aVar = new a(vVar, this.f13425d, this.f13422a, this.f13423b, this.f13424c);
        vVar.onSubscribe(aVar);
        aVar.d();
    }
}
