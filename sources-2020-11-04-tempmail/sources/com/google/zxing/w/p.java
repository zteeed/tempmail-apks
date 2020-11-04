package com.google.zxing.w;

import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.a;
import com.google.zxing.d;
import com.google.zxing.m;
import com.google.zxing.w.c0.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* compiled from: MultiFormatOneDReader */
public final class p extends r {

    /* renamed from: a  reason: collision with root package name */
    private final r[] f12504a;

    public p(Map<d, ?> map) {
        Collection collection;
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(d.POSSIBLE_FORMATS);
        }
        boolean z = (map == null || map.get(d.ASSUME_CODE_39_CHECK_DIGIT) == null) ? false : true;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(a.EAN_13) || collection.contains(a.UPC_A) || collection.contains(a.EAN_8) || collection.contains(a.UPC_E)) {
                arrayList.add(new q(map));
            }
            if (collection.contains(a.CODE_39)) {
                arrayList.add(new e(z));
            }
            if (collection.contains(a.CODE_93)) {
                arrayList.add(new g());
            }
            if (collection.contains(a.CODE_128)) {
                arrayList.add(new c());
            }
            if (collection.contains(a.ITF)) {
                arrayList.add(new n());
            }
            if (collection.contains(a.CODABAR)) {
                arrayList.add(new a());
            }
            if (collection.contains(a.RSS_14)) {
                arrayList.add(new e());
            }
            if (collection.contains(a.RSS_EXPANDED)) {
                arrayList.add(new com.google.zxing.w.c0.g.d());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new q(map));
            arrayList.add(new e());
            arrayList.add(new a());
            arrayList.add(new g());
            arrayList.add(new c());
            arrayList.add(new n());
            arrayList.add(new e());
            arrayList.add(new com.google.zxing.w.c0.g.d());
        }
        this.f12504a = (r[]) arrayList.toArray(new r[arrayList.size()]);
    }

    public void a() {
        for (r a2 : this.f12504a) {
            a2.a();
        }
    }

    public m d(int i, com.google.zxing.t.a aVar, Map<d, ?> map) throws NotFoundException {
        r[] rVarArr = this.f12504a;
        int i2 = 0;
        while (i2 < rVarArr.length) {
            try {
                return rVarArr[i2].d(i, aVar, map);
            } catch (ReaderException unused) {
                i2++;
            }
        }
        throw NotFoundException.a();
    }
}
