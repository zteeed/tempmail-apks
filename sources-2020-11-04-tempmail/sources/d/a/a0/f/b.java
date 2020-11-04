package d.a.a0.f;

import com.google.firebase.crashlytics.internal.proto.CodedOutputStream;
import d.a.a0.c.e;
import d.a.a0.j.p;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: SpscArrayQueue */
public final class b<E> extends AtomicReferenceArray<E> implements e<E> {
    private static final Integer g = Integer.getInteger("jctools.spsc.max.lookahead.step", CodedOutputStream.DEFAULT_BUFFER_SIZE);
    private static final long serialVersionUID = -1296597691183856449L;

    /* renamed from: b  reason: collision with root package name */
    final int f14335b = (length() - 1);

    /* renamed from: c  reason: collision with root package name */
    final AtomicLong f14336c = new AtomicLong();

    /* renamed from: d  reason: collision with root package name */
    long f14337d;

    /* renamed from: e  reason: collision with root package name */
    final AtomicLong f14338e = new AtomicLong();

    /* renamed from: f  reason: collision with root package name */
    final int f14339f;

    public b(int i) {
        super(p.a(i));
        this.f14339f = Math.min(i / 4, g.intValue());
    }

    /* access modifiers changed from: package-private */
    public int a(long j) {
        return this.f14335b & ((int) j);
    }

    /* access modifiers changed from: package-private */
    public int b(long j, int i) {
        return ((int) j) & i;
    }

    /* access modifiers changed from: package-private */
    public E c(int i) {
        return get(i);
    }

    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d(long j) {
        this.f14338e.lazySet(j);
    }

    /* access modifiers changed from: package-private */
    public void e(int i, E e2) {
        lazySet(i, e2);
    }

    /* access modifiers changed from: package-private */
    public void f(long j) {
        this.f14336c.lazySet(j);
    }

    public boolean isEmpty() {
        return this.f14336c.get() == this.f14338e.get();
    }

    public boolean offer(E e2) {
        if (e2 != null) {
            int i = this.f14335b;
            long j = this.f14336c.get();
            int b2 = b(j, i);
            if (j >= this.f14337d) {
                long j2 = ((long) this.f14339f) + j;
                if (c(b(j2, i)) == null) {
                    this.f14337d = j2;
                } else if (c(b2) != null) {
                    return false;
                }
            }
            e(b2, e2);
            f(j + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public E poll() {
        long j = this.f14338e.get();
        int a2 = a(j);
        E c2 = c(a2);
        if (c2 == null) {
            return null;
        }
        d(j + 1);
        e(a2, (Object) null);
        return c2;
    }
}
