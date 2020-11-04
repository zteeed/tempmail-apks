package d.a.a0.f;

import com.google.firebase.crashlytics.internal.proto.CodedOutputStream;
import d.a.a0.c.e;
import d.a.a0.j.p;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: SpscLinkedArrayQueue */
public final class c<T> implements e<T> {
    static final int j = Integer.getInteger("jctools.spsc.max.lookahead.step", CodedOutputStream.DEFAULT_BUFFER_SIZE).intValue();
    private static final Object k = new Object();

    /* renamed from: b  reason: collision with root package name */
    final AtomicLong f13782b = new AtomicLong();

    /* renamed from: c  reason: collision with root package name */
    int f13783c;

    /* renamed from: d  reason: collision with root package name */
    long f13784d;

    /* renamed from: e  reason: collision with root package name */
    final int f13785e;

    /* renamed from: f  reason: collision with root package name */
    AtomicReferenceArray<Object> f13786f;
    final int g;
    AtomicReferenceArray<Object> h;
    final AtomicLong i = new AtomicLong();

    public c(int i2) {
        int a2 = p.a(Math.max(8, i2));
        int i3 = a2 - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(a2 + 1);
        this.f13786f = atomicReferenceArray;
        this.f13785e = i3;
        a(a2);
        this.h = atomicReferenceArray;
        this.g = i3;
        this.f13784d = (long) (i3 - 1);
        t(0);
    }

    private void a(int i2) {
        this.f13783c = Math.min(i2 / 4, j);
    }

    private static int b(int i2) {
        return i2;
    }

    private static int c(long j2, int i2) {
        int i3 = ((int) j2) & i2;
        b(i3);
        return i3;
    }

    private long d() {
        return this.i.get();
    }

    private long e() {
        return this.f13782b.get();
    }

    private long f() {
        return this.i.get();
    }

    private static <E> Object h(AtomicReferenceArray<Object> atomicReferenceArray, int i2) {
        return atomicReferenceArray.get(i2);
    }

    private AtomicReferenceArray<Object> i(AtomicReferenceArray<Object> atomicReferenceArray, int i2) {
        b(i2);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) h(atomicReferenceArray, i2);
        r(atomicReferenceArray, i2, (Object) null);
        return atomicReferenceArray2;
    }

    private long j() {
        return this.f13782b.get();
    }

    private T k(AtomicReferenceArray<Object> atomicReferenceArray, long j2, int i2) {
        this.h = atomicReferenceArray;
        return h(atomicReferenceArray, c(j2, i2));
    }

    private T l(AtomicReferenceArray<Object> atomicReferenceArray, long j2, int i2) {
        this.h = atomicReferenceArray;
        int c2 = c(j2, i2);
        T h2 = h(atomicReferenceArray, c2);
        if (h2 != null) {
            r(atomicReferenceArray, c2, (Object) null);
            q(j2 + 1);
        }
        return h2;
    }

    private void o(AtomicReferenceArray<Object> atomicReferenceArray, long j2, int i2, T t, long j3) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f13786f = atomicReferenceArray2;
        this.f13784d = (j3 + j2) - 1;
        r(atomicReferenceArray2, i2, t);
        s(atomicReferenceArray, atomicReferenceArray2);
        r(atomicReferenceArray, i2, k);
        t(j2 + 1);
    }

    private void q(long j2) {
        this.i.lazySet(j2);
    }

    private static void r(AtomicReferenceArray<Object> atomicReferenceArray, int i2, Object obj) {
        atomicReferenceArray.lazySet(i2, obj);
    }

    private void s(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        int length = atomicReferenceArray.length() - 1;
        b(length);
        r(atomicReferenceArray, length, atomicReferenceArray2);
    }

    private void t(long j2) {
        this.f13782b.lazySet(j2);
    }

    private boolean u(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j2, int i2) {
        r(atomicReferenceArray, i2, t);
        t(j2 + 1);
        return true;
    }

    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public boolean isEmpty() {
        return j() == f();
    }

    public boolean m(T t, T t2) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f13786f;
        long j2 = j();
        int i2 = this.f13785e;
        long j3 = 2 + j2;
        if (h(atomicReferenceArray, c(j3, i2)) == null) {
            int c2 = c(j2, i2);
            r(atomicReferenceArray, c2 + 1, t2);
            r(atomicReferenceArray, c2, t);
            t(j3);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f13786f = atomicReferenceArray2;
        int c3 = c(j2, i2);
        r(atomicReferenceArray2, c3 + 1, t2);
        r(atomicReferenceArray2, c3, t);
        s(atomicReferenceArray, atomicReferenceArray2);
        r(atomicReferenceArray, c3, k);
        t(j3);
        return true;
    }

    public T n() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.h;
        long d2 = d();
        int i2 = this.g;
        T h2 = h(atomicReferenceArray, c(d2, i2));
        return h2 == k ? k(i(atomicReferenceArray, i2 + 1), d2, i2) : h2;
    }

    public boolean offer(T t) {
        if (t != null) {
            AtomicReferenceArray<Object> atomicReferenceArray = this.f13786f;
            long e2 = e();
            int i2 = this.f13785e;
            int c2 = c(e2, i2);
            if (e2 < this.f13784d) {
                return u(atomicReferenceArray, t, e2, c2);
            }
            long j2 = ((long) this.f13783c) + e2;
            if (h(atomicReferenceArray, c(j2, i2)) == null) {
                this.f13784d = j2 - 1;
                return u(atomicReferenceArray, t, e2, c2);
            } else if (h(atomicReferenceArray, c(1 + e2, i2)) == null) {
                return u(atomicReferenceArray, t, e2, c2);
            } else {
                o(atomicReferenceArray, e2, c2, t, (long) i2);
                return true;
            }
        } else {
            throw new NullPointerException("Null is not a valid element");
        }
    }

    public int p() {
        long f2 = f();
        while (true) {
            long j2 = j();
            long f3 = f();
            if (f2 == f3) {
                return (int) (j2 - f3);
            }
            f2 = f3;
        }
    }

    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.h;
        long d2 = d();
        int i2 = this.g;
        int c2 = c(d2, i2);
        T h2 = h(atomicReferenceArray, c2);
        boolean z = h2 == k;
        if (h2 != null && !z) {
            r(atomicReferenceArray, c2, (Object) null);
            q(d2 + 1);
            return h2;
        } else if (z) {
            return l(i(atomicReferenceArray, i2 + 1), d2, i2);
        } else {
            return null;
        }
    }
}
