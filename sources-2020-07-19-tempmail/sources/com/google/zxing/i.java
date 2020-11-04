package com.google.zxing;

import com.google.zxing.r.b;
import com.google.zxing.w.p;
import com.google.zxing.y.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* compiled from: MultiFormatReader */
public final class i implements l {

    /* renamed from: a  reason: collision with root package name */
    private Map<d, ?> f11680a;

    /* renamed from: b  reason: collision with root package name */
    private l[] f11681b;

    private m d(c cVar) throws NotFoundException {
        l[] lVarArr = this.f11681b;
        if (lVarArr != null) {
            int length = lVarArr.length;
            int i = 0;
            while (i < length) {
                try {
                    return lVarArr[i].b(cVar, this.f11680a);
                } catch (ReaderException unused) {
                    i++;
                }
            }
        }
        throw NotFoundException.a();
    }

    public void a() {
        l[] lVarArr = this.f11681b;
        if (lVarArr != null) {
            for (l a2 : lVarArr) {
                a2.a();
            }
        }
    }

    public m b(c cVar, Map<d, ?> map) throws NotFoundException {
        f(map);
        return d(cVar);
    }

    public m c(c cVar) throws NotFoundException {
        f((Map<d, ?>) null);
        return d(cVar);
    }

    public m e(c cVar) throws NotFoundException {
        if (this.f11681b == null) {
            f((Map<d, ?>) null);
        }
        return d(cVar);
    }

    public void f(Map<d, ?> map) {
        Collection collection;
        this.f11680a = map;
        boolean z = true;
        boolean z2 = map != null && map.containsKey(d.TRY_HARDER);
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(d.POSSIBLE_FORMATS);
        }
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (!collection.contains(a.UPC_A) && !collection.contains(a.UPC_E) && !collection.contains(a.EAN_13) && !collection.contains(a.EAN_8) && !collection.contains(a.CODABAR) && !collection.contains(a.CODE_39) && !collection.contains(a.CODE_93) && !collection.contains(a.CODE_128) && !collection.contains(a.ITF) && !collection.contains(a.RSS_14) && !collection.contains(a.RSS_EXPANDED)) {
                z = false;
            }
            if (z && !z2) {
                arrayList.add(new p(map));
            }
            if (collection.contains(a.QR_CODE)) {
                arrayList.add(new a());
            }
            if (collection.contains(a.DATA_MATRIX)) {
                arrayList.add(new com.google.zxing.u.a());
            }
            if (collection.contains(a.AZTEC)) {
                arrayList.add(new b());
            }
            if (collection.contains(a.PDF_417)) {
                arrayList.add(new com.google.zxing.x.b());
            }
            if (collection.contains(a.MAXICODE)) {
                arrayList.add(new com.google.zxing.v.a());
            }
            if (z && z2) {
                arrayList.add(new p(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z2) {
                arrayList.add(new p(map));
            }
            arrayList.add(new a());
            arrayList.add(new com.google.zxing.u.a());
            arrayList.add(new b());
            arrayList.add(new com.google.zxing.x.b());
            arrayList.add(new com.google.zxing.v.a());
            if (z2) {
                arrayList.add(new p(map));
            }
        }
        this.f11681b = (l[]) arrayList.toArray(new l[arrayList.size()]);
    }
}
