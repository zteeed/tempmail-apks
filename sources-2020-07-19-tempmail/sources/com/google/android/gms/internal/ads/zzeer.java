package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public abstract class zzeer implements Serializable, Iterable<Byte> {

    /* renamed from: c  reason: collision with root package name */
    public static final zzeer f8533c = new x50(zzegd.f8576b);

    /* renamed from: d  reason: collision with root package name */
    private static final u50 f8534d = (l50.a() ? new y50((q50) null) : new t50((q50) null));

    /* renamed from: b  reason: collision with root package name */
    private int f8535b = 0;

    zzeer() {
    }

    static w50 G(int i) {
        return new w50(i, (q50) null);
    }

    public static zzeer K(InputStream inputStream) throws IOException {
        zzeer zzeer;
        ArrayList arrayList = new ArrayList();
        int i = 256;
        while (true) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
            }
            if (i2 == 0) {
                zzeer = null;
            } else {
                zzeer = P(bArr, 0, i2);
            }
            if (zzeer == null) {
                return Q(arrayList);
            }
            arrayList.add(zzeer);
            i = Math.min(i << 1, 8192);
        }
    }

    public static zzeer N(String str) {
        return new x50(str.getBytes(zzegd.f8575a));
    }

    static int O(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("End index: ");
            sb3.append(i2);
            sb3.append(" >= ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    public static zzeer P(byte[] bArr, int i, int i2) {
        O(i, i + i2, bArr.length);
        return new x50(f8534d.a(bArr, i, i2));
    }

    public static zzeer Q(Iterable<zzeer> iterable) {
        int i;
        if (!(iterable instanceof Collection)) {
            i = 0;
            Iterator<zzeer> it = iterable.iterator();
            while (it.hasNext()) {
                it.next();
                i++;
            }
        } else {
            i = ((Collection) iterable).size();
        }
        if (i == 0) {
            return f8533c;
        }
        return h(iterable.iterator(), i);
    }

    public static zzeer U(byte[] bArr) {
        return P(bArr, 0, bArr.length);
    }

    static zzeer V(byte[] bArr) {
        return new x50(bArr);
    }

    private static zzeer h(Iterator<zzeer> it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", new Object[]{Integer.valueOf(i)}));
        } else if (i == 1) {
            return it.next();
        } else {
            int i2 = i >>> 1;
            zzeer h = h(it, i2);
            zzeer h2 = h(it, i - i2);
            if (Integer.MAX_VALUE - h.size() >= h2.size()) {
                return w70.X(h, h2);
            }
            int size = h.size();
            int size2 = h2.size();
            StringBuilder sb = new StringBuilder(53);
            sb.append("ByteString would be too long: ");
            sb.append(size);
            sb.append("+");
            sb.append(size2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    static void m(int i, int i2) {
        if (((i2 - (i + 1)) | i) >= 0) {
            return;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    public static zzefa y() {
        return new zzefa(128);
    }

    /* access modifiers changed from: protected */
    public abstract boolean A();

    /* access modifiers changed from: protected */
    public final int B() {
        return this.f8535b;
    }

    public abstract byte C(int i);

    /* access modifiers changed from: package-private */
    public abstract byte F(int i);

    /* access modifiers changed from: protected */
    public abstract int J(int i, int i2, int i3);

    /* access modifiers changed from: protected */
    public abstract int M(int i, int i2, int i3);

    public abstract zzeer W(int i, int i2);

    public final byte[] c() {
        int size = size();
        if (size == 0) {
            return zzegd.f8576b;
        }
        byte[] bArr = new byte[size];
        q(bArr, 0, 0, size);
        return bArr;
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.f8535b;
        if (i == 0) {
            int size = size();
            i = M(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.f8535b = i;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    public abstract String i(Charset charset);

    public final boolean isEmpty() {
        return size() == 0;
    }

    /* access modifiers changed from: package-private */
    public abstract void j(zzeeo zzeeo) throws IOException;

    @Deprecated
    public final void l(byte[] bArr, int i, int i2, int i3) {
        O(i, i + i3, size());
        O(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            q(bArr, i, i2, i3);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void q(byte[] bArr, int i, int i2, int i3);

    /* renamed from: s */
    public zzeew iterator() {
        return new q50(this);
    }

    public abstract int size();

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(size());
        objArr[2] = size() <= 50 ? n80.a(this) : String.valueOf(n80.a(W(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public final String u() {
        return size() == 0 ? "" : i(zzegd.f8575a);
    }

    public abstract boolean v();

    public abstract zzefc w();

    /* access modifiers changed from: protected */
    public abstract int z();
}
