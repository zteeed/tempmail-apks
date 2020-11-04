package com.google.zxing.w;

import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.a;
import com.google.zxing.d;
import com.google.zxing.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* compiled from: MultiFormatUPCEANReader */
public final class q extends r {

    /* renamed from: a  reason: collision with root package name */
    private final y[] f12505a;

    public q(Map<d, ?> map) {
        Collection collection;
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(d.POSSIBLE_FORMATS);
        }
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(a.EAN_13)) {
                arrayList.add(new i());
            } else if (collection.contains(a.UPC_A)) {
                arrayList.add(new t());
            }
            if (collection.contains(a.EAN_8)) {
                arrayList.add(new k());
            }
            if (collection.contains(a.UPC_E)) {
                arrayList.add(new a0());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new i());
            arrayList.add(new k());
            arrayList.add(new a0());
        }
        this.f12505a = (y[]) arrayList.toArray(new y[arrayList.size()]);
    }

    public void a() {
        for (y a2 : this.f12505a) {
            a2.a();
        }
    }

    public m d(int i, com.google.zxing.t.a aVar, Map<d, ?> map) throws NotFoundException {
        Collection collection;
        boolean z;
        int[] q = y.q(aVar);
        y[] yVarArr = this.f12505a;
        int i2 = 0;
        while (i2 < yVarArr.length) {
            try {
                m n = yVarArr[i2].n(i, aVar, q, map);
                boolean z2 = n.b() == a.EAN_13 && n.f().charAt(0) == '0';
                if (map == null) {
                    collection = null;
                } else {
                    collection = (Collection) map.get(d.POSSIBLE_FORMATS);
                }
                if (collection != null) {
                    if (!collection.contains(a.UPC_A)) {
                        z = false;
                        if (z2 || !z) {
                            return n;
                        }
                        m mVar = new m(n.f().substring(1), n.c(), n.e(), a.UPC_A);
                        mVar.g(n.d());
                        return mVar;
                    }
                }
                z = true;
                if (z2) {
                }
                return n;
            } catch (ReaderException unused) {
                i2++;
            }
        }
        throw NotFoundException.a();
    }
}
