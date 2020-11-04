package com.google.zxing.w;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.d;
import com.google.zxing.m;
import com.google.zxing.n;
import com.google.zxing.o;
import com.google.zxing.p;
import com.google.zxing.t.a;
import java.util.Arrays;
import java.util.Map;

/* compiled from: UPCEANReader */
public abstract class y extends r {

    /* renamed from: d  reason: collision with root package name */
    static final int[] f11966d = {1, 1, 1};

    /* renamed from: e  reason: collision with root package name */
    static final int[] f11967e = {1, 1, 1, 1, 1};

    /* renamed from: f  reason: collision with root package name */
    static final int[] f11968f = {1, 1, 1, 1, 1, 1};
    static final int[][] g;
    static final int[][] h;

    /* renamed from: a  reason: collision with root package name */
    private final StringBuilder f11969a = new StringBuilder(20);

    /* renamed from: b  reason: collision with root package name */
    private final x f11970b = new x();

    /* renamed from: c  reason: collision with root package name */
    private final m f11971c = new m();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        g = iArr;
        int[][] iArr2 = new int[20][];
        h = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = g[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            h[i] = iArr4;
        }
    }

    protected y() {
    }

    static boolean j(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = length - 1;
        return s(charSequence.subSequence(0, i)) == Character.digit(charSequence.charAt(i), 10);
    }

    static int k(a aVar, int[] iArr, int i, int[][] iArr2) throws NotFoundException {
        r.g(aVar, i, iArr);
        int length = iArr2.length;
        float f2 = 0.48f;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            float f3 = r.f(iArr, iArr2[i3], 0.7f);
            if (f3 < f2) {
                i2 = i3;
                f2 = f3;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        throw NotFoundException.a();
    }

    static int[] o(a aVar, int i, boolean z, int[] iArr) throws NotFoundException {
        return p(aVar, i, z, iArr, new int[iArr.length]);
    }

    private static int[] p(a aVar, int i, boolean z, int[] iArr, int[] iArr2) throws NotFoundException {
        int n = aVar.n();
        int l = z ? aVar.l(i) : aVar.k(i);
        int length = iArr.length;
        boolean z2 = z;
        int i2 = 0;
        int i3 = l;
        while (l < n) {
            if (aVar.i(l) != z2) {
                iArr2[i2] = iArr2[i2] + 1;
            } else {
                if (i2 != length - 1) {
                    i2++;
                } else if (r.f(iArr2, iArr, 0.7f) < 0.48f) {
                    return new int[]{i3, l};
                } else {
                    i3 += iArr2[0] + iArr2[1];
                    int i4 = i2 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i4);
                    iArr2[i4] = 0;
                    iArr2[i2] = 0;
                    i2--;
                }
                iArr2[i2] = 1;
                z2 = !z2;
            }
            l++;
        }
        throw NotFoundException.a();
    }

    static int[] q(a aVar) throws NotFoundException {
        int[] iArr = new int[f11966d.length];
        int[] iArr2 = null;
        boolean z = false;
        int i = 0;
        while (!z) {
            Arrays.fill(iArr, 0, f11966d.length, 0);
            iArr2 = p(aVar, i, false, f11966d, iArr);
            int i2 = iArr2[0];
            int i3 = iArr2[1];
            int i4 = i2 - (i3 - i2);
            if (i4 >= 0) {
                z = aVar.p(i4, i2, false);
            }
            i = i3;
        }
        return iArr2;
    }

    static int s(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 1; i2 >= 0; i2 -= 2) {
            int charAt = charSequence.charAt(i2) - '0';
            if (charAt < 0 || charAt > 9) {
                throw FormatException.a();
            }
            i += charAt;
        }
        int i3 = i * 3;
        for (int i4 = length - 2; i4 >= 0; i4 -= 2) {
            int charAt2 = charSequence.charAt(i4) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw FormatException.a();
            }
            i3 += charAt2;
        }
        return (1000 - i3) % 10;
    }

    public m d(int i, a aVar, Map<d, ?> map) throws NotFoundException, ChecksumException, FormatException {
        return n(i, aVar, q(aVar), map);
    }

    /* access modifiers changed from: package-private */
    public boolean i(String str) throws FormatException {
        return j(str);
    }

    /* access modifiers changed from: package-private */
    public int[] l(a aVar, int i) throws NotFoundException {
        return o(aVar, i, false, f11966d);
    }

    /* access modifiers changed from: protected */
    public abstract int m(a aVar, int[] iArr, StringBuilder sb) throws NotFoundException;

    public m n(int i, a aVar, int[] iArr, Map<d, ?> map) throws NotFoundException, ChecksumException, FormatException {
        p pVar;
        int i2;
        String c2;
        int[] iArr2 = null;
        if (map == null) {
            pVar = null;
        } else {
            pVar = (p) map.get(d.NEED_RESULT_POINT_CALLBACK);
        }
        boolean z = true;
        if (pVar != null) {
            pVar.a(new o(((float) (iArr[0] + iArr[1])) / 2.0f, (float) i));
        }
        StringBuilder sb = this.f11969a;
        sb.setLength(0);
        int m = m(aVar, iArr, sb);
        if (pVar != null) {
            pVar.a(new o((float) m, (float) i));
        }
        int[] l = l(aVar, m);
        if (pVar != null) {
            pVar.a(new o(((float) (l[0] + l[1])) / 2.0f, (float) i));
        }
        int i3 = l[1];
        int i4 = (i3 - l[0]) + i3;
        if (i4 >= aVar.n() || !aVar.p(i3, i4, false)) {
            throw NotFoundException.a();
        }
        String sb2 = sb.toString();
        if (sb2.length() < 8) {
            throw FormatException.a();
        } else if (i(sb2)) {
            com.google.zxing.a r = r();
            float f2 = (float) i;
            m mVar = new m(sb2, (byte[]) null, new o[]{new o(((float) (iArr[1] + iArr[0])) / 2.0f, f2), new o(((float) (l[1] + l[0])) / 2.0f, f2)}, r);
            try {
                m a2 = this.f11970b.a(i, aVar, l[1]);
                mVar.h(n.UPC_EAN_EXTENSION, a2.f());
                mVar.g(a2.d());
                mVar.a(a2.e());
                i2 = a2.f().length();
            } catch (ReaderException unused) {
                i2 = 0;
            }
            if (map != null) {
                iArr2 = (int[]) map.get(d.ALLOWED_EAN_EXTENSIONS);
            }
            if (iArr2 != null) {
                int length = iArr2.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        z = false;
                        break;
                    } else if (i2 == iArr2[i5]) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (!z) {
                    throw NotFoundException.a();
                }
            }
            if ((r == com.google.zxing.a.EAN_13 || r == com.google.zxing.a.UPC_A) && (c2 = this.f11971c.c(sb2)) != null) {
                mVar.h(n.POSSIBLE_COUNTRY, c2);
            }
            return mVar;
        } else {
            throw ChecksumException.a();
        }
    }

    /* access modifiers changed from: package-private */
    public abstract com.google.zxing.a r();
}
