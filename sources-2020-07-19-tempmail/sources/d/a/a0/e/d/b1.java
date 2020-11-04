package d.a.a0.e.d;

import d.a.a0.b.b;
import d.a.a0.d.c;
import d.a.l;
import d.a.s;

/* compiled from: ObservableFromArray */
public final class b1<T> extends l<T> {

    /* renamed from: b  reason: collision with root package name */
    final T[] f12816b;

    /* compiled from: ObservableFromArray */
    static final class a<T> extends c<T> {

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f12817b;

        /* renamed from: c  reason: collision with root package name */
        final T[] f12818c;

        /* renamed from: d  reason: collision with root package name */
        int f12819d;

        /* renamed from: e  reason: collision with root package name */
        boolean f12820e;

        /* renamed from: f  reason: collision with root package name */
        volatile boolean f12821f;

        a(s<? super T> sVar, T[] tArr) {
            this.f12817b = sVar;
            this.f12818c = tArr;
        }

        public boolean a() {
            return this.f12821f;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            T[] tArr = this.f12818c;
            int length = tArr.length;
            for (int i = 0; i < length && !a(); i++) {
                T t = tArr[i];
                if (t == null) {
                    s<? super T> sVar = this.f12817b;
                    sVar.onError(new NullPointerException("The element at index " + i + " is null"));
                    return;
                }
                this.f12817b.onNext(t);
            }
            if (!a()) {
                this.f12817b.onComplete();
            }
        }

        public void clear() {
            this.f12819d = this.f12818c.length;
        }

        public void dispose() {
            this.f12821f = true;
        }

        public int g(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f12820e = true;
            return 1;
        }

        public boolean isEmpty() {
            return this.f12819d == this.f12818c.length;
        }

        public T poll() {
            int i = this.f12819d;
            T[] tArr = this.f12818c;
            if (i == tArr.length) {
                return null;
            }
            this.f12819d = i + 1;
            T t = tArr[i];
            b.e(t, "The array element is null");
            return t;
        }
    }

    public b1(T[] tArr) {
        this.f12816b = tArr;
    }

    public void subscribeActual(s<? super T> sVar) {
        a aVar = new a(sVar, this.f12816b);
        sVar.onSubscribe(aVar);
        if (!aVar.f12820e) {
            aVar.b();
        }
    }
}
