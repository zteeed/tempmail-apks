package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzpq {

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f9000a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9001b;

    /* renamed from: c  reason: collision with root package name */
    public final float f9002c;

    private zzpq(List<byte[]> list, int i, int i2, int i3, float f2) {
        this.f9000a = list;
        this.f9001b = i;
        this.f9002c = f2;
    }

    public static zzpq a(zzpi zzpi) throws zzht {
        float f2;
        int i;
        int i2;
        try {
            zzpi.m(4);
            int g = (zzpi.g() & 3) + 1;
            if (g != 3) {
                ArrayList arrayList = new ArrayList();
                int g2 = zzpi.g() & 31;
                for (int i3 = 0; i3 < g2; i3++) {
                    arrayList.add(b(zzpi));
                }
                int g3 = zzpi.g();
                for (int i4 = 0; i4 < g3; i4++) {
                    arrayList.add(b(zzpi));
                }
                if (g2 > 0) {
                    zzpg c2 = zzph.c((byte[]) arrayList.get(0), g, ((byte[]) arrayList.get(0)).length);
                    int i5 = c2.f8973a;
                    int i6 = c2.f8974b;
                    f2 = c2.f8975c;
                    i2 = i5;
                    i = i6;
                } else {
                    i2 = -1;
                    i = -1;
                    f2 = 1.0f;
                }
                return new zzpq(arrayList, g, i2, i, f2);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new zzht("Error parsing AVC config", e2);
        }
    }

    private static byte[] b(zzpi zzpi) {
        int h = zzpi.h();
        int b2 = zzpi.b();
        zzpi.m(h);
        return zzpa.c(zzpi.f8980a, b2, h);
    }
}
