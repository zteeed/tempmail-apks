package d.a.a0.e.d;

import d.a.a0.a.d;
import d.a.a0.f.c;
import d.a.l;
import d.a.q;
import d.a.s;
import d.a.z.n;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableZip */
public final class m4<T, R> extends l<R> {

    /* renamed from: b  reason: collision with root package name */
    final q<? extends T>[] f13257b;

    /* renamed from: c  reason: collision with root package name */
    final Iterable<? extends q<? extends T>> f13258c;

    /* renamed from: d  reason: collision with root package name */
    final n<? super Object[], ? extends R> f13259d;

    /* renamed from: e  reason: collision with root package name */
    final int f13260e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f13261f;

    /* compiled from: ObservableZip */
    static final class a<T, R> extends AtomicInteger implements d.a.y.b {
        private static final long serialVersionUID = 2983708048395377667L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super R> f13262b;

        /* renamed from: c  reason: collision with root package name */
        final n<? super Object[], ? extends R> f13263c;

        /* renamed from: d  reason: collision with root package name */
        final b<T, R>[] f13264d;

        /* renamed from: e  reason: collision with root package name */
        final T[] f13265e;

        /* renamed from: f  reason: collision with root package name */
        final boolean f13266f;
        volatile boolean g;

        a(s<? super R> sVar, n<? super Object[], ? extends R> nVar, int i, boolean z) {
            this.f13262b = sVar;
            this.f13263c = nVar;
            this.f13264d = new b[i];
            this.f13265e = new Object[i];
            this.f13266f = z;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            d();
            b();
        }

        /* access modifiers changed from: package-private */
        public void b() {
            for (b<T, R> a2 : this.f13264d) {
                a2.a();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean c(boolean z, boolean z2, s<? super R> sVar, boolean z3, b<?, ?> bVar) {
            if (this.g) {
                a();
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!z3) {
                    Throwable th = bVar.f13270e;
                    if (th != null) {
                        this.g = true;
                        a();
                        sVar.onError(th);
                        return true;
                    } else if (!z2) {
                        return false;
                    } else {
                        this.g = true;
                        a();
                        sVar.onComplete();
                        return true;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    Throwable th2 = bVar.f13270e;
                    this.g = true;
                    a();
                    if (th2 != null) {
                        sVar.onError(th2);
                    } else {
                        sVar.onComplete();
                    }
                    return true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void d() {
            for (b<T, R> bVar : this.f13264d) {
                bVar.f13268c.clear();
            }
        }

        public void dispose() {
            if (!this.g) {
                this.g = true;
                b();
                if (getAndIncrement() == 0) {
                    d();
                }
            }
        }

        public void e() {
            Throwable th;
            if (getAndIncrement() == 0) {
                b<T, R>[] bVarArr = this.f13264d;
                s<? super R> sVar = this.f13262b;
                T[] tArr = this.f13265e;
                boolean z = this.f13266f;
                int i = 1;
                while (true) {
                    int i2 = 0;
                    int i3 = 0;
                    for (b<T, R> bVar : bVarArr) {
                        if (tArr[i3] == null) {
                            boolean z2 = bVar.f13269d;
                            T poll = bVar.f13268c.poll();
                            boolean z3 = poll == null;
                            if (!c(z2, z3, sVar, z, bVar)) {
                                if (!z3) {
                                    tArr[i3] = poll;
                                } else {
                                    i2++;
                                }
                            } else {
                                return;
                            }
                        } else if (bVar.f13269d && !z && (th = bVar.f13270e) != null) {
                            this.g = true;
                            a();
                            sVar.onError(th);
                            return;
                        }
                        i3++;
                    }
                    if (i2 != 0) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        try {
                            Object apply = this.f13263c.apply(tArr.clone());
                            d.a.a0.b.b.e(apply, "The zipper returned a null value");
                            sVar.onNext(apply);
                            Arrays.fill(tArr, (Object) null);
                        } catch (Throwable th2) {
                            io.reactivex.exceptions.a.b(th2);
                            a();
                            sVar.onError(th2);
                            return;
                        }
                    }
                }
            }
        }

        public void f(q<? extends T>[] qVarArr, int i) {
            b<T, R>[] bVarArr = this.f13264d;
            int length = bVarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                bVarArr[i2] = new b<>(this, i);
            }
            lazySet(0);
            this.f13262b.onSubscribe(this);
            for (int i3 = 0; i3 < length && !this.g; i3++) {
                qVarArr[i3].subscribe(bVarArr[i3]);
            }
        }
    }

    /* compiled from: ObservableZip */
    static final class b<T, R> implements s<T> {

        /* renamed from: b  reason: collision with root package name */
        final a<T, R> f13267b;

        /* renamed from: c  reason: collision with root package name */
        final c<T> f13268c;

        /* renamed from: d  reason: collision with root package name */
        volatile boolean f13269d;

        /* renamed from: e  reason: collision with root package name */
        Throwable f13270e;

        /* renamed from: f  reason: collision with root package name */
        final AtomicReference<d.a.y.b> f13271f = new AtomicReference<>();

        b(a<T, R> aVar, int i) {
            this.f13267b = aVar;
            this.f13268c = new c<>(i);
        }

        public void a() {
            d.a.a0.a.c.f(this.f13271f);
        }

        public void onComplete() {
            this.f13269d = true;
            this.f13267b.e();
        }

        public void onError(Throwable th) {
            this.f13270e = th;
            this.f13269d = true;
            this.f13267b.e();
        }

        public void onNext(T t) {
            this.f13268c.offer(t);
            this.f13267b.e();
        }

        public void onSubscribe(d.a.y.b bVar) {
            d.a.a0.a.c.n(this.f13271f, bVar);
        }
    }

    public m4(q<? extends T>[] qVarArr, Iterable<? extends q<? extends T>> iterable, n<? super Object[], ? extends R> nVar, int i, boolean z) {
        this.f13257b = qVarArr;
        this.f13258c = iterable;
        this.f13259d = nVar;
        this.f13260e = i;
        this.f13261f = z;
    }

    public void subscribeActual(s<? super R> sVar) {
        int i;
        q<? extends T>[] qVarArr = this.f13257b;
        if (qVarArr == null) {
            qVarArr = new q[8];
            i = 0;
            for (q<? extends T> qVar : this.f13258c) {
                if (i == qVarArr.length) {
                    q<? extends T>[] qVarArr2 = new q[((i >> 2) + i)];
                    System.arraycopy(qVarArr, 0, qVarArr2, 0, i);
                    qVarArr = qVarArr2;
                }
                qVarArr[i] = qVar;
                i++;
            }
        } else {
            i = qVarArr.length;
        }
        if (i == 0) {
            d.h(sVar);
        } else {
            new a(sVar, this.f13259d, i, this.f13261f).f(qVarArr, this.f13260e);
        }
    }
}
