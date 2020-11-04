package d.a.f0;

import d.a.s;
import d.a.y.b;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PublishSubject */
public final class a<T> extends c<T> {

    /* renamed from: d  reason: collision with root package name */
    static final C0158a[] f13928d = new C0158a[0];

    /* renamed from: e  reason: collision with root package name */
    static final C0158a[] f13929e = new C0158a[0];

    /* renamed from: b  reason: collision with root package name */
    final AtomicReference<C0158a<T>[]> f13930b = new AtomicReference<>(f13929e);

    /* renamed from: c  reason: collision with root package name */
    Throwable f13931c;

    /* renamed from: d.a.f0.a$a  reason: collision with other inner class name */
    /* compiled from: PublishSubject */
    static final class C0158a<T> extends AtomicBoolean implements b {
        private static final long serialVersionUID = 3562861878281475070L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13932b;

        /* renamed from: c  reason: collision with root package name */
        final a<T> f13933c;

        C0158a(s<? super T> sVar, a<T> aVar) {
            this.f13932b = sVar;
            this.f13933c = aVar;
        }

        public boolean a() {
            return get();
        }

        public void b() {
            if (!get()) {
                this.f13932b.onComplete();
            }
        }

        public void c(Throwable th) {
            if (get()) {
                d.a.d0.a.s(th);
            } else {
                this.f13932b.onError(th);
            }
        }

        public void d(T t) {
            if (!get()) {
                this.f13932b.onNext(t);
            }
        }

        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f13933c.g(this);
            }
        }
    }

    a() {
    }

    public static <T> a<T> f() {
        return new a<>();
    }

    /* access modifiers changed from: package-private */
    public boolean e(C0158a<T> aVar) {
        C0158a[] aVarArr;
        C0158a[] aVarArr2;
        do {
            aVarArr = (C0158a[]) this.f13930b.get();
            if (aVarArr == f13928d) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C0158a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.f13930b.compareAndSet(aVarArr, aVarArr2));
        return true;
    }

    /* access modifiers changed from: package-private */
    public void g(C0158a<T> aVar) {
        C0158a<T>[] aVarArr;
        C0158a[] aVarArr2;
        do {
            aVarArr = (C0158a[]) this.f13930b.get();
            if (aVarArr != f13928d && aVarArr != f13929e) {
                int length = aVarArr.length;
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (aVarArr[i2] == aVar) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        aVarArr2 = f13929e;
                    } else {
                        C0158a[] aVarArr3 = new C0158a[(length - 1)];
                        System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                        System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                        aVarArr2 = aVarArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.f13930b.compareAndSet(aVarArr, aVarArr2));
    }

    public void onComplete() {
        C0158a<T>[] aVarArr = this.f13930b.get();
        C0158a<T>[] aVarArr2 = f13928d;
        if (aVarArr != aVarArr2) {
            for (C0158a b2 : (C0158a[]) this.f13930b.getAndSet(aVarArr2)) {
                b2.b();
            }
        }
    }

    public void onError(Throwable th) {
        d.a.a0.b.b.e(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        C0158a<T>[] aVarArr = this.f13930b.get();
        C0158a<T>[] aVarArr2 = f13928d;
        if (aVarArr == aVarArr2) {
            d.a.d0.a.s(th);
            return;
        }
        this.f13931c = th;
        for (C0158a c2 : (C0158a[]) this.f13930b.getAndSet(aVarArr2)) {
            c2.c(th);
        }
    }

    public void onNext(T t) {
        d.a.a0.b.b.e(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (C0158a d2 : (C0158a[]) this.f13930b.get()) {
            d2.d(t);
        }
    }

    public void onSubscribe(b bVar) {
        if (this.f13930b.get() == f13928d) {
            bVar.dispose();
        }
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super T> sVar) {
        C0158a aVar = new C0158a(sVar, this);
        sVar.onSubscribe(aVar);
        if (!e(aVar)) {
            Throwable th = this.f13931c;
            if (th != null) {
                sVar.onError(th);
            } else {
                sVar.onComplete();
            }
        } else if (aVar.a()) {
            g(aVar);
        }
    }
}
