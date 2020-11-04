package com.google.zxing.t;

import com.google.zxing.NotFoundException;

/* compiled from: DefaultGridSampler */
public final class f extends i {
    public b c(b bVar, int i, int i2, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) throws NotFoundException {
        b bVar2 = bVar;
        int i3 = i;
        int i4 = i2;
        return d(bVar, i, i2, k.b(f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17));
    }

    public b d(b bVar, int i, int i2, k kVar) throws NotFoundException {
        if (i <= 0 || i2 <= 0) {
            throw NotFoundException.a();
        }
        b bVar2 = new b(i, i2);
        int i3 = i * 2;
        float[] fArr = new float[i3];
        for (int i4 = 0; i4 < i2; i4++) {
            float f2 = ((float) i4) + 0.5f;
            for (int i5 = 0; i5 < i3; i5 += 2) {
                fArr[i5] = ((float) (i5 / 2)) + 0.5f;
                fArr[i5 + 1] = f2;
            }
            kVar.f(fArr);
            i.a(bVar, fArr);
            int i6 = 0;
            while (i6 < i3) {
                try {
                    if (bVar.f((int) fArr[i6], (int) fArr[i6 + 1])) {
                        bVar2.p(i6 / 2, i4);
                    }
                    i6 += 2;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw NotFoundException.a();
                }
            }
        }
        return bVar2;
    }
}
