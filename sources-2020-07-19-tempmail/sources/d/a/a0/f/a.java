package d.a.a0.f;

import d.a.a0.c.e;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MpscLinkedQueue */
public final class a<T> implements e<T> {

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference<C0154a<T>> f13774b = new AtomicReference<>();

    /* renamed from: c  reason: collision with root package name */
    private final AtomicReference<C0154a<T>> f13775c = new AtomicReference<>();

    /* renamed from: d.a.a0.f.a$a  reason: collision with other inner class name */
    /* compiled from: MpscLinkedQueue */
    static final class C0154a<E> extends AtomicReference<C0154a<E>> {
        private static final long serialVersionUID = 2404266111789071508L;

        /* renamed from: b  reason: collision with root package name */
        private E f13776b;

        C0154a() {
        }

        public E a() {
            E b2 = b();
            e((Object) null);
            return b2;
        }

        public E b() {
            return this.f13776b;
        }

        public C0154a<E> c() {
            return (C0154a) get();
        }

        public void d(C0154a<E> aVar) {
            lazySet(aVar);
        }

        public void e(E e2) {
            this.f13776b = e2;
        }

        C0154a(E e2) {
            e(e2);
        }
    }

    public a() {
        C0154a aVar = new C0154a();
        d(aVar);
        e(aVar);
    }

    /* access modifiers changed from: package-private */
    public C0154a<T> a() {
        return this.f13775c.get();
    }

    /* access modifiers changed from: package-private */
    public C0154a<T> b() {
        return this.f13775c.get();
    }

    /* access modifiers changed from: package-private */
    public C0154a<T> c() {
        return this.f13774b.get();
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000a, LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void clear() {
        /*
            r1 = this;
        L_0x0000:
            java.lang.Object r0 = r1.poll()
            if (r0 == 0) goto L_0x000d
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x000d
            goto L_0x0000
        L_0x000d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.a0.f.a.clear():void");
    }

    /* access modifiers changed from: package-private */
    public void d(C0154a<T> aVar) {
        this.f13775c.lazySet(aVar);
    }

    /* access modifiers changed from: package-private */
    public C0154a<T> e(C0154a<T> aVar) {
        return this.f13774b.getAndSet(aVar);
    }

    public boolean isEmpty() {
        return b() == c();
    }

    public boolean offer(T t) {
        if (t != null) {
            C0154a aVar = new C0154a(t);
            e(aVar).d(aVar);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public T poll() {
        C0154a c2;
        C0154a a2 = a();
        C0154a c3 = a2.c();
        if (c3 != null) {
            T a3 = c3.a();
            d(c3);
            return a3;
        } else if (a2 == c()) {
            return null;
        } else {
            do {
                c2 = a2.c();
            } while (c2 == null);
            T a4 = c2.a();
            d(c2);
            return a4;
        }
    }
}
