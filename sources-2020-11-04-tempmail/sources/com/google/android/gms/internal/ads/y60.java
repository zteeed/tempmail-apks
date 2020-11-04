package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class y60 extends m50<Long> implements zzegj, q70, RandomAccess {

    /* renamed from: e  reason: collision with root package name */
    private static final y60 f5537e;

    /* renamed from: c  reason: collision with root package name */
    private long[] f5538c;

    /* renamed from: d  reason: collision with root package name */
    private int f5539d;

    static {
        y60 y60 = new y60(new long[0], 0);
        f5537e = y60;
        y60.k();
    }

    y60() {
        this(new long[10], 0);
    }

    public static y60 i() {
        return f5537e;
    }

    private final void j(int i) {
        if (i < 0 || i >= this.f5539d) {
            throw new IndexOutOfBoundsException(l(i));
        }
    }

    private final String l(int i) {
        int i2 = this.f5539d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: T */
    public final zzegj r(int i) {
        if (i >= this.f5539d) {
            return new y60(Arrays.copyOf(this.f5538c, i), this.f5539d);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        c();
        if (i < 0 || i > (i2 = this.f5539d)) {
            throw new IndexOutOfBoundsException(l(i));
        }
        long[] jArr = this.f5538c;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f5538c, i, jArr2, i + 1, this.f5539d - i);
            this.f5538c = jArr2;
        }
        this.f5538c[i] = longValue;
        this.f5539d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        c();
        zzegd.a(collection);
        if (!(collection instanceof y60)) {
            return super.addAll(collection);
        }
        y60 y60 = (y60) collection;
        int i = y60.f5539d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f5539d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f5538c;
            if (i3 > jArr.length) {
                this.f5538c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(y60.f5538c, 0, this.f5538c, this.f5539d, y60.f5539d);
            this.f5539d = i3;
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
        if (!(obj instanceof y60)) {
            return super.equals(obj);
        }
        y60 y60 = (y60) obj;
        if (this.f5539d != y60.f5539d) {
            return false;
        }
        long[] jArr = y60.f5538c;
        for (int i = 0; i < this.f5539d; i++) {
            if (this.f5538c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(h(i));
    }

    public final long h(int i) {
        j(i);
        return this.f5538c[i];
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f5539d; i2++) {
            i = (i * 31) + zzegd.g(this.f5538c[i2]);
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
            if (this.f5538c[i] == longValue) {
                return i;
            }
        }
        return -1;
    }

    public final void m(long j) {
        c();
        int i = this.f5539d;
        long[] jArr = this.f5538c;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f5538c = jArr2;
        }
        long[] jArr3 = this.f5538c;
        int i2 = this.f5539d;
        this.f5539d = i2 + 1;
        jArr3[i2] = j;
    }

    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.f5539d; i++) {
            if (obj.equals(Long.valueOf(this.f5538c[i]))) {
                long[] jArr = this.f5538c;
                System.arraycopy(jArr, i + 1, jArr, i, (this.f5539d - i) - 1);
                this.f5539d--;
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
            long[] jArr = this.f5538c;
            System.arraycopy(jArr, i2, jArr, i, this.f5539d - i2);
            this.f5539d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        c();
        j(i);
        long[] jArr = this.f5538c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f5539d;
    }

    private y60(long[] jArr, int i) {
        this.f5538c = jArr;
        this.f5539d = i;
    }

    public final /* synthetic */ Object remove(int i) {
        c();
        j(i);
        long[] jArr = this.f5538c;
        long j = jArr[i];
        int i2 = this.f5539d;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f5539d--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final /* synthetic */ boolean add(Object obj) {
        m(((Long) obj).longValue());
        return true;
    }
}
