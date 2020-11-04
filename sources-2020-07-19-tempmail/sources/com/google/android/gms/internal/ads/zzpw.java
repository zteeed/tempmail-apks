package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzpw {

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f9012a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9013b;

    private zzpw(List<byte[]> list, int i) {
        this.f9012a = list;
        this.f9013b = i;
    }

    public static zzpw a(zzpi zzpi) throws zzht {
        List list;
        try {
            zzpi.m(21);
            int g = zzpi.g() & 3;
            int g2 = zzpi.g();
            int b2 = zzpi.b();
            int i = 0;
            for (int i2 = 0; i2 < g2; i2++) {
                zzpi.m(1);
                int h = zzpi.h();
                for (int i3 = 0; i3 < h; i3++) {
                    int h2 = zzpi.h();
                    i += h2 + 4;
                    zzpi.m(h2);
                }
            }
            zzpi.l(b2);
            byte[] bArr = new byte[i];
            int i4 = 0;
            for (int i5 = 0; i5 < g2; i5++) {
                zzpi.m(1);
                int h3 = zzpi.h();
                for (int i6 = 0; i6 < h3; i6++) {
                    int h4 = zzpi.h();
                    System.arraycopy(zzph.f8976a, 0, bArr, i4, zzph.f8976a.length);
                    int length = i4 + zzph.f8976a.length;
                    System.arraycopy(zzpi.f8980a, zzpi.b(), bArr, length, h4);
                    i4 = length + h4;
                    zzpi.m(h4);
                }
            }
            if (i == 0) {
                list = null;
            } else {
                list = Collections.singletonList(bArr);
            }
            return new zzpw(list, g + 1);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new zzht("Error parsing HEVC config", e2);
        }
    }
}
