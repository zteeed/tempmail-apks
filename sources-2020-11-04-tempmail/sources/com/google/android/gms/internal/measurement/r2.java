package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
final class r2 extends g1<Long> implements zzfu, j3, RandomAccess {

    /* renamed from: e  reason: collision with root package name */
    private static final r2 f9666e;

    /* renamed from: c  reason: collision with root package name */
    private long[] f9667c;

    /* renamed from: d  reason: collision with root package name */
    private int f9668d;

    static {
        r2 r2Var = new r2(new long[0], 0);
        f9666e = r2Var;
        r2Var.b();
    }

    r2() {
        this(new long[10], 0);
    }

    public static r2 i() {
        return f9666e;
    }

    private final void j(int i) {
        if (i < 0 || i >= this.f9668d) {
            throw new IndexOutOfBoundsException(l(i));
        }
    }

    private final String l(int i) {
        int i2 = this.f9668d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: D */
    public final zzfu f(int i) {
        if (i >= this.f9668d) {
            return new r2(Arrays.copyOf(this.f9667c, i), this.f9668d);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        c();
        if (i < 0 || i > (i2 = this.f9668d)) {
            throw new IndexOutOfBoundsException(l(i));
        }
        long[] jArr = this.f9667c;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f9667c, i, jArr2, i + 1, this.f9668d - i);
            this.f9667c = jArr2;
        }
        this.f9667c[i] = longValue;
        this.f9668d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        c();
        zzfr.d(collection);
        if (!(collection instanceof r2)) {
            return super.addAll(collection);
        }
        r2 r2Var = (r2) collection;
        int i = r2Var.f9668d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f9668d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f9667c;
            if (i3 > jArr.length) {
                this.f9667c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(r2Var.f9667c, 0, this.f9667c, this.f9668d, r2Var.f9668d);
            this.f9668d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2)) {
            return super.equals(obj);
        }
        r2 r2Var = (r2) obj;
        if (this.f9668d != r2Var.f9668d) {
            return false;
        }
        long[] jArr = r2Var.f9667c;
        for (int i = 0; i < this.f9668d; i++) {
            if (this.f9667c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final long g(int i) {
        j(i);
        return this.f9667c[i];
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(g(i));
    }

    public final void h(long j) {
        c();
        int i = this.f9668d;
        long[] jArr = this.f9667c;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f9667c = jArr2;
        }
        long[] jArr3 = this.f9667c;
        int i2 = this.f9668d;
        this.f9668d = i2 + 1;
        jArr3[i2] = j;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f9668d; i2++) {
            i = (i * 31) + zzfr.b(this.f9667c[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f9667c[i] == longValue) {
                return i;
            }
        }
        return -1;
    }

    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.f9668d; i++) {
            if (obj.equals(Long.valueOf(this.f9667c[i]))) {
                long[] jArr = this.f9667c;
                System.arraycopy(jArr, i + 1, jArr, i, (this.f9668d - i) - 1);
                this.f9668d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        c();
        if (i2 >= i) {
            long[] jArr = this.f9667c;
            System.arraycopy(jArr, i2, jArr, i, this.f9668d - i2);
            this.f9668d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        c();
        j(i);
        long[] jArr = this.f9667c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f9668d;
    }

    private r2(long[] jArr, int i) {
        this.f9667c = jArr;
        this.f9668d = i;
    }

    public final /* synthetic */ Object remove(int i) {
        c();
        j(i);
        long[] jArr = this.f9667c;
        long j = jArr[i];
        int i2 = this.f9668d;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f9668d--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final /* synthetic */ boolean add(Object obj) {
        h(((Long) obj).longValue());
        return true;
    }
}
