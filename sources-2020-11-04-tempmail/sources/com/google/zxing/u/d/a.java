package com.google.zxing.u.d;

import com.google.zxing.NotFoundException;
import com.google.zxing.o;
import com.google.zxing.t.g;
import com.google.zxing.t.i;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Detector */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final com.google.zxing.t.b f12387a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.zxing.t.m.b f12388b;

    /* compiled from: Detector */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final o f12389a;

        /* renamed from: b  reason: collision with root package name */
        private final o f12390b;

        /* renamed from: c  reason: collision with root package name */
        private final int f12391c;

        /* access modifiers changed from: package-private */
        public o a() {
            return this.f12389a;
        }

        /* access modifiers changed from: package-private */
        public o b() {
            return this.f12390b;
        }

        /* access modifiers changed from: package-private */
        public int c() {
            return this.f12391c;
        }

        public String toString() {
            return this.f12389a + "/" + this.f12390b + '/' + this.f12391c;
        }

        private b(o oVar, o oVar2, int i) {
            this.f12389a = oVar;
            this.f12390b = oVar2;
            this.f12391c = i;
        }
    }

    /* compiled from: Detector */
    private static final class c implements Serializable, Comparator<b> {
        private c() {
        }

        /* renamed from: a */
        public int compare(b bVar, b bVar2) {
            return bVar.c() - bVar2.c();
        }
    }

    public a(com.google.zxing.t.b bVar) throws NotFoundException {
        this.f12387a = bVar;
        this.f12388b = new com.google.zxing.t.m.b(bVar);
    }

    private o a(o oVar, o oVar2, o oVar3, o oVar4, int i) {
        float f2 = (float) i;
        float d2 = ((float) d(oVar, oVar2)) / f2;
        float d3 = (float) d(oVar3, oVar4);
        o oVar5 = new o(oVar4.c() + (((oVar4.c() - oVar3.c()) / d3) * d2), oVar4.d() + (d2 * ((oVar4.d() - oVar3.d()) / d3)));
        float d4 = ((float) d(oVar, oVar3)) / f2;
        float d5 = (float) d(oVar2, oVar4);
        o oVar6 = new o(oVar4.c() + (((oVar4.c() - oVar2.c()) / d5) * d4), oVar4.d() + (d4 * ((oVar4.d() - oVar2.d()) / d5)));
        if (f(oVar5)) {
            return (f(oVar6) && Math.abs(h(oVar3, oVar5).c() - h(oVar2, oVar5).c()) > Math.abs(h(oVar3, oVar6).c() - h(oVar2, oVar6).c())) ? oVar6 : oVar5;
        }
        if (f(oVar6)) {
            return oVar6;
        }
        return null;
    }

    private o b(o oVar, o oVar2, o oVar3, o oVar4, int i, int i2) {
        float d2 = ((float) d(oVar, oVar2)) / ((float) i);
        float d3 = (float) d(oVar3, oVar4);
        o oVar5 = new o(oVar4.c() + (((oVar4.c() - oVar3.c()) / d3) * d2), oVar4.d() + (d2 * ((oVar4.d() - oVar3.d()) / d3)));
        float d4 = ((float) d(oVar, oVar3)) / ((float) i2);
        float d5 = (float) d(oVar2, oVar4);
        o oVar6 = new o(oVar4.c() + (((oVar4.c() - oVar2.c()) / d5) * d4), oVar4.d() + (d4 * ((oVar4.d() - oVar2.d()) / d5)));
        if (f(oVar5)) {
            return (f(oVar6) && Math.abs(i - h(oVar3, oVar5).c()) + Math.abs(i2 - h(oVar2, oVar5).c()) > Math.abs(i - h(oVar3, oVar6).c()) + Math.abs(i2 - h(oVar2, oVar6).c())) ? oVar6 : oVar5;
        }
        if (f(oVar6)) {
            return oVar6;
        }
        return null;
    }

    private static int d(o oVar, o oVar2) {
        return com.google.zxing.t.m.a.c(o.b(oVar, oVar2));
    }

    private static void e(Map<o, Integer> map, o oVar) {
        Integer num = map.get(oVar);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        map.put(oVar, Integer.valueOf(i));
    }

    private boolean f(o oVar) {
        return oVar.c() >= 0.0f && oVar.c() < ((float) this.f12387a.n()) && oVar.d() > 0.0f && oVar.d() < ((float) this.f12387a.j());
    }

    private static com.google.zxing.t.b g(com.google.zxing.t.b bVar, o oVar, o oVar2, o oVar3, o oVar4, int i, int i2) throws NotFoundException {
        float f2 = ((float) i) - 0.5f;
        float f3 = ((float) i2) - 0.5f;
        return i.b().c(bVar, i, i2, 0.5f, 0.5f, f2, 0.5f, f2, f3, 0.5f, f3, oVar.c(), oVar.d(), oVar4.c(), oVar4.d(), oVar3.c(), oVar3.d(), oVar2.c(), oVar2.d());
    }

    private b h(o oVar, o oVar2) {
        int c2 = (int) oVar.c();
        int d2 = (int) oVar.d();
        int c3 = (int) oVar2.c();
        int d3 = (int) oVar2.d();
        int i = 0;
        int i2 = 1;
        boolean z = Math.abs(d3 - d2) > Math.abs(c3 - c2);
        if (z) {
            int i3 = d2;
            d2 = c2;
            c2 = i3;
            int i4 = d3;
            d3 = c3;
            c3 = i4;
        }
        int abs = Math.abs(c3 - c2);
        int abs2 = Math.abs(d3 - d2);
        int i5 = (-abs) / 2;
        int i6 = d2 < d3 ? 1 : -1;
        if (c2 >= c3) {
            i2 = -1;
        }
        boolean f2 = this.f12387a.f(z ? d2 : c2, z ? c2 : d2);
        while (c2 != c3) {
            boolean f3 = this.f12387a.f(z ? d2 : c2, z ? c2 : d2);
            if (f3 != f2) {
                i++;
                f2 = f3;
            }
            i5 += abs2;
            if (i5 > 0) {
                if (d2 == d3) {
                    break;
                }
                d2 += i6;
                i5 -= abs;
            }
            c2 += i2;
        }
        return new b(oVar, oVar2, i);
    }

    public g c() throws NotFoundException {
        o oVar;
        o oVar2;
        com.google.zxing.t.b bVar;
        o[] c2 = this.f12388b.c();
        o oVar3 = c2[0];
        o oVar4 = c2[1];
        o oVar5 = c2[2];
        o oVar6 = c2[3];
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(h(oVar3, oVar4));
        arrayList.add(h(oVar3, oVar5));
        arrayList.add(h(oVar4, oVar6));
        arrayList.add(h(oVar5, oVar6));
        o oVar7 = null;
        Collections.sort(arrayList, new c());
        b bVar2 = (b) arrayList.get(0);
        b bVar3 = (b) arrayList.get(1);
        HashMap hashMap = new HashMap();
        e(hashMap, bVar2.a());
        e(hashMap, bVar2.b());
        e(hashMap, bVar3.a());
        e(hashMap, bVar3.b());
        o oVar8 = null;
        o oVar9 = null;
        for (Map.Entry entry : hashMap.entrySet()) {
            o oVar10 = (o) entry.getKey();
            if (((Integer) entry.getValue()).intValue() == 2) {
                oVar8 = oVar10;
            } else if (oVar7 == null) {
                oVar7 = oVar10;
            } else {
                oVar9 = oVar10;
            }
        }
        if (oVar7 == null || oVar8 == null || oVar9 == null) {
            throw NotFoundException.a();
        }
        o[] oVarArr = {oVar7, oVar8, oVar9};
        o.e(oVarArr);
        o oVar11 = oVarArr[0];
        o oVar12 = oVarArr[1];
        o oVar13 = oVarArr[2];
        if (!hashMap.containsKey(oVar3)) {
            oVar = oVar3;
        } else if (!hashMap.containsKey(oVar4)) {
            oVar = oVar4;
        } else {
            oVar = !hashMap.containsKey(oVar5) ? oVar5 : oVar6;
        }
        int c3 = h(oVar13, oVar).c();
        int c4 = h(oVar11, oVar).c();
        if ((c3 & 1) == 1) {
            c3++;
        }
        int i = c3 + 2;
        if ((c4 & 1) == 1) {
            c4++;
        }
        int i2 = c4 + 2;
        if (i * 4 >= i2 * 7 || i2 * 4 >= i * 7) {
            oVar2 = oVar13;
            o b2 = b(oVar12, oVar11, oVar13, oVar, i, i2);
            if (b2 != null) {
                oVar = b2;
            }
            int c5 = h(oVar2, oVar).c();
            int c6 = h(oVar11, oVar).c();
            if ((c5 & 1) == 1) {
                c5++;
            }
            int i3 = c5;
            if ((c6 & 1) == 1) {
                c6++;
            }
            bVar = g(this.f12387a, oVar2, oVar12, oVar11, oVar, i3, c6);
        } else {
            o a2 = a(oVar12, oVar11, oVar13, oVar, Math.min(i2, i));
            if (a2 != null) {
                oVar = a2;
            }
            int max = Math.max(h(oVar13, oVar).c(), h(oVar11, oVar).c()) + 1;
            if ((max & 1) == 1) {
                max++;
            }
            int i4 = max;
            bVar = g(this.f12387a, oVar13, oVar12, oVar11, oVar, i4, i4);
            oVar2 = oVar13;
        }
        return new g(bVar, new o[]{oVar2, oVar12, oVar11, oVar});
    }
}
