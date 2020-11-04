package d.a.a0.e.d;

import d.a.a0.b.b;
import d.a.a0.d.c;
import d.a.l;
import d.a.s;

/* compiled from: ObservableFromArray */
public final class b1<T> extends l<T> {

    /* renamed from: b  reason: collision with root package name */
    final T[] f13374b;

    /* compiled from: ObservableFromArray */
    static final class a<T> extends c<T> {

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13375b;

        /* renamed from: c  reason: collision with root package name */
        final T[] f13376c;

        /* renamed from: d  reason: collision with root package name */
        int f13377d;

        /* renamed from: e  reason: collision with root package name */
        boolean f13378e;

        /* renamed from: f  reason: collision with root package name */
        volatile boolean f13379f;

        a(s<? super T> sVar, T[] tArr) {
            this.f13375b = sVar;
            this.f13376c = tArr;
        }

        public boolean a() {
            return this.f13379f;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            T[] tArr = this.f13376c;
            int length = tArr.length;
            for (int i = 0; i < length && !a(); i++) {
                T t = tArr[i];
                if (t == null) {
                    s<? super T> sVar = this.f13375b;
                    sVar.onError(new NullPointerException("The element at index " + i + " is null"));
                    return;
                }
                this.f13375b.onNext(t);
            }
            if (!a()) {
                this.f13375b.onComplete();
            }
        }

        public void clear() {
            this.f13377d = this.f13376c.length;
        }

        public void dispose() {
            this.f13379f = true;
        }

        public int g(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f13378e = true;
            return 1;
        }

        public boolean isEmpty() {
            return this.f13377d == this.f13376c.length;
        }

        public T poll() {
            int i = this.f13377d;
            T[] tArr = this.f13376c;
            if (i == tArr.length) {
                return null;
            }
            this.f13377d = i + 1;
            T t = tArr[i];
            b.e(t, "The array element is null");
            return t;
        }
    }

    public b1(T[] tArr) {
        this.f13374b = tArr;
    }

    public void subscribeActual(s<? super T> sVar) {
        a aVar = new a(sVar, this.f13374b);
        sVar.onSubscribe(aVar);
        if (!aVar.f13378e) {
            aVar.b();
        }
    }
}
