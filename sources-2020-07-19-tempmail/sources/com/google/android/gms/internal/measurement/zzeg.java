package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
public abstract class zzeg implements Serializable, Iterable<Byte> {

    /* renamed from: c  reason: collision with root package name */
    public static final zzeg f9608c = new s1(zzfr.f9641b);

    /* renamed from: d  reason: collision with root package name */
    private static final o1 f9609d = (f1.b() ? new r1((k1) null) : new n1((k1) null));

    /* renamed from: b  reason: collision with root package name */
    private int f9610b = 0;

    zzeg() {
    }

    public static zzeg l(String str) {
        return new s1(str.getBytes(zzfr.f9640a));
    }

    static zzeg m(byte[] bArr) {
        return new s1(bArr);
    }

    public static zzeg q(byte[] bArr, int i, int i2) {
        w(i, i + i2, bArr.length);
        return new s1(f9609d.a(bArr, i, i2));
    }

    static int w(int i, int i2, int i3) {
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

    static q1 z(int i) {
        return new q1(i, (k1) null);
    }

    public abstract boolean A();

    /* access modifiers changed from: protected */
    public final int B() {
        return this.f9610b;
    }

    public abstract byte c(int i);

    public abstract boolean equals(Object obj);

    public abstract int h();

    public final int hashCode() {
        int i = this.f9610b;
        if (i == 0) {
            int h = h();
            i = i(h, 0, h);
            if (i == 0) {
                i = 1;
            }
            this.f9610b = i;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    public abstract int i(int i, int i2, int i3);

    public /* synthetic */ Iterator iterator() {
        return new k1(this);
    }

    public abstract zzeg j(int i, int i2);

    /* access modifiers changed from: protected */
    public abstract String s(Charset charset);

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(h());
        objArr[2] = h() <= 50 ? d4.a(this) : String.valueOf(d4.a(j(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* access modifiers changed from: package-private */
    public abstract void u(zzed zzed) throws IOException;

    /* access modifiers changed from: package-private */
    public abstract byte v(int i);

    public final String y() {
        return h() == 0 ? "" : s(zzfr.f9640a);
    }
}
