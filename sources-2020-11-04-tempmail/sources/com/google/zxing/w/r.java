package com.google.zxing.w;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.c;
import com.google.zxing.d;
import com.google.zxing.l;
import com.google.zxing.m;
import com.google.zxing.n;
import com.google.zxing.o;
import com.google.zxing.t.a;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: OneDReader */
public abstract class r implements l {
    private m e(c cVar, Map<d, ?> map) throws NotFoundException {
        int i;
        Map<d, ?> map2;
        EnumMap enumMap = map;
        int d2 = cVar.d();
        int c2 = cVar.c();
        a aVar = new a(d2);
        char c3 = 0;
        int i2 = 1;
        boolean z = enumMap != null && enumMap.containsKey(d.TRY_HARDER);
        int max = Math.max(1, c2 >> (z ? 8 : 5));
        int i3 = z ? c2 : 15;
        int i4 = c2 / 2;
        int i5 = 0;
        while (i5 < i3) {
            int i6 = i5 + 1;
            int i7 = i6 / 2;
            if (!((i5 & 1) == 0)) {
                i7 = -i7;
            }
            int i8 = (i7 * max) + i4;
            if (i8 < 0 || i8 >= c2) {
                break;
            }
            try {
                aVar = cVar.b(i8, aVar);
                int i9 = 0;
                while (i9 < 2) {
                    if (i9 == i2) {
                        aVar.s();
                        if (enumMap != null && enumMap.containsKey(d.NEED_RESULT_POINT_CALLBACK)) {
                            EnumMap enumMap2 = new EnumMap(d.class);
                            enumMap2.putAll(enumMap);
                            enumMap2.remove(d.NEED_RESULT_POINT_CALLBACK);
                            enumMap = enumMap2;
                        }
                    }
                    try {
                        m d3 = d(i8, aVar, enumMap);
                        if (i9 == i2) {
                            d3.h(n.ORIENTATION, 180);
                            o[] e2 = d3.e();
                            if (e2 != null) {
                                map2 = enumMap;
                                float f2 = (float) d2;
                                try {
                                    i = d2;
                                } catch (ReaderException unused) {
                                    i = d2;
                                    i9++;
                                    enumMap = map2;
                                    d2 = i;
                                    c3 = 0;
                                    i2 = 1;
                                }
                                try {
                                    e2[0] = new o((f2 - e2[c3].c()) - 1.0f, e2[c3].d());
                                    try {
                                        e2[1] = new o((f2 - e2[1].c()) - 1.0f, e2[1].d());
                                    } catch (ReaderException unused2) {
                                        continue;
                                    }
                                } catch (ReaderException unused3) {
                                    i9++;
                                    enumMap = map2;
                                    d2 = i;
                                    c3 = 0;
                                    i2 = 1;
                                }
                            }
                        }
                        return d3;
                    } catch (ReaderException unused4) {
                        map2 = enumMap;
                        i = d2;
                        i9++;
                        enumMap = map2;
                        d2 = i;
                        c3 = 0;
                        i2 = 1;
                    }
                }
                continue;
            } catch (NotFoundException unused5) {
            }
            i5 = i6;
            d2 = d2;
            c3 = 0;
            i2 = 1;
        }
        throw NotFoundException.a();
    }

    protected static float f(int[] iArr, int[] iArr2, float f2) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f3 = (float) i;
        float f4 = f3 / ((float) i2);
        float f5 = f2 * f4;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            float f7 = ((float) iArr2[i4]) * f4;
            float f8 = (float) i5;
            float f9 = f8 > f7 ? f8 - f7 : f7 - f8;
            if (f9 > f5) {
                return Float.POSITIVE_INFINITY;
            }
            f6 += f9;
        }
        return f6 / f3;
    }

    protected static void g(a aVar, int i, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int i2 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int n = aVar.n();
        if (i < n) {
            boolean z = !aVar.i(i);
            while (i < n) {
                if (aVar.i(i) == z) {
                    i2++;
                    if (i2 == length) {
                        break;
                    }
                    iArr[i2] = 1;
                    z = !z;
                } else {
                    iArr[i2] = iArr[i2] + 1;
                }
                i++;
            }
            if (i2 == length) {
                return;
            }
            if (i2 != length - 1 || i != n) {
                throw NotFoundException.a();
            }
            return;
        }
        throw NotFoundException.a();
    }

    protected static void h(a aVar, int i, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        boolean i2 = aVar.i(i);
        while (i > 0 && length >= 0) {
            i--;
            if (aVar.i(i) != i2) {
                length--;
                i2 = !i2;
            }
        }
        if (length < 0) {
            g(aVar, i + 1, iArr);
            return;
        }
        throw NotFoundException.a();
    }

    public void a() {
    }

    public m b(c cVar, Map<d, ?> map) throws NotFoundException, FormatException {
        try {
            return e(cVar, map);
        } catch (NotFoundException e2) {
            if (!(map != null && map.containsKey(d.TRY_HARDER)) || !cVar.e()) {
                throw e2;
            }
            c f2 = cVar.f();
            m e3 = e(f2, map);
            Map<n, Object> d2 = e3.d();
            int i = 270;
            if (d2 != null && d2.containsKey(n.ORIENTATION)) {
                i = (((Integer) d2.get(n.ORIENTATION)).intValue() + 270) % 360;
            }
            e3.h(n.ORIENTATION, Integer.valueOf(i));
            o[] e4 = e3.e();
            if (e4 != null) {
                int c2 = f2.c();
                for (int i2 = 0; i2 < e4.length; i2++) {
                    e4[i2] = new o((((float) c2) - e4[i2].d()) - 1.0f, e4[i2].c());
                }
            }
            return e3;
        }
    }

    public m c(c cVar) throws NotFoundException, FormatException {
        return b(cVar, (Map<d, ?>) null);
    }

    public abstract m d(int i, a aVar, Map<d, ?> map) throws NotFoundException, ChecksumException, FormatException;
}
