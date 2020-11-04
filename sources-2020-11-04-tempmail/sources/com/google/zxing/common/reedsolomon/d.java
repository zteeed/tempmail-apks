package com.google.zxing.common.reedsolomon;

import java.util.ArrayList;
import java.util.List;

/* compiled from: ReedSolomonEncoder */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final a f12212a;

    /* renamed from: b  reason: collision with root package name */
    private final List<b> f12213b;

    public d(a aVar) {
        this.f12212a = aVar;
        ArrayList arrayList = new ArrayList();
        this.f12213b = arrayList;
        arrayList.add(new b(aVar, new int[]{1}));
    }

    private b a(int i) {
        if (i >= this.f12213b.size()) {
            List<b> list = this.f12213b;
            b bVar = list.get(list.size() - 1);
            for (int size = this.f12213b.size(); size <= i; size++) {
                a aVar = this.f12212a;
                bVar = bVar.i(new b(aVar, new int[]{1, aVar.c((size - 1) + aVar.d())}));
                this.f12213b.add(bVar);
            }
        }
        return this.f12213b.get(i);
    }

    public void b(int[] iArr, int i) {
        if (i != 0) {
            int length = iArr.length - i;
            if (length > 0) {
                b a2 = a(i);
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                int[] e2 = new b(this.f12212a, iArr2).j(i, 1).b(a2)[1].e();
                int length2 = i - e2.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    iArr[length + i2] = 0;
                }
                System.arraycopy(e2, 0, iArr, length + length2, e2.length);
                return;
            }
            throw new IllegalArgumentException("No data bytes provided");
        }
        throw new IllegalArgumentException("No error correction bytes");
    }
}
