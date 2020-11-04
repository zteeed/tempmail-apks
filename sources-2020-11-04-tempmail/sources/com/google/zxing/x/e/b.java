package com.google.zxing.x.e;

import com.google.zxing.x.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: BarcodeValue */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Integer, Integer> f12530a = new HashMap();

    b() {
    }

    /* access modifiers changed from: package-private */
    public int[] a() {
        ArrayList arrayList = new ArrayList();
        int i = -1;
        for (Map.Entry next : this.f12530a.entrySet()) {
            if (((Integer) next.getValue()).intValue() > i) {
                i = ((Integer) next.getValue()).intValue();
                arrayList.clear();
                arrayList.add(next.getKey());
            } else if (((Integer) next.getValue()).intValue() == i) {
                arrayList.add(next.getKey());
            }
        }
        return a.b(arrayList);
    }

    /* access modifiers changed from: package-private */
    public void b(int i) {
        Integer num = this.f12530a.get(Integer.valueOf(i));
        if (num == null) {
            num = 0;
        }
        this.f12530a.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
    }
}
