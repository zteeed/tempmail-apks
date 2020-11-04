package com.google.android.gms.measurement.internal;

import a.e.a;
import com.google.android.gms.internal.measurement.zzcb;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzki;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
final class x7 {

    /* renamed from: a  reason: collision with root package name */
    private String f10506a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f10507b;

    /* renamed from: c  reason: collision with root package name */
    private zzcb.zzi f10508c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public BitSet f10509d;

    /* renamed from: e  reason: collision with root package name */
    private BitSet f10510e;

    /* renamed from: f  reason: collision with root package name */
    private Map<Integer, Long> f10511f;
    private Map<Integer, List<Long>> g;
    private final /* synthetic */ w7 h;

    private x7(w7 w7Var, String str) {
        this.h = w7Var;
        this.f10506a = str;
        this.f10507b = true;
        this.f10509d = new BitSet();
        this.f10510e = new BitSet();
        this.f10511f = new a();
        this.g = new a();
    }

    /* access modifiers changed from: package-private */
    public final zzcb.zza a(int i) {
        ArrayList arrayList;
        List list;
        zzcb.zza.C0091zza T = zzcb.zza.T();
        T.C(i);
        T.F(this.f10507b);
        zzcb.zzi zzi = this.f10508c;
        if (zzi != null) {
            T.E(zzi);
        }
        zzcb.zzi.zza c0 = zzcb.zzi.c0();
        c0.I(zzkn.F(this.f10509d));
        c0.E(zzkn.F(this.f10510e));
        if (this.f10511f == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(this.f10511f.size());
            for (Integer intValue : this.f10511f.keySet()) {
                int intValue2 = intValue.intValue();
                zzcb.zzb.zza L = zzcb.zzb.L();
                L.C(intValue2);
                L.D(this.f10511f.get(Integer.valueOf(intValue2)).longValue());
                arrayList.add((zzcb.zzb) ((zzfo) L.q()));
            }
        }
        c0.L(arrayList);
        if (this.g == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList(this.g.size());
            for (Integer next : this.g.keySet()) {
                zzcb.zzj.zza M = zzcb.zzj.M();
                M.C(next.intValue());
                List list2 = this.g.get(next);
                if (list2 != null) {
                    Collections.sort(list2);
                    M.D(list2);
                }
                arrayList2.add((zzcb.zzj) ((zzfo) M.q()));
            }
            list = arrayList2;
        }
        c0.M(list);
        T.D(c0);
        return (zzcb.zza) ((zzfo) T.q());
    }

    /* access modifiers changed from: package-private */
    public final void c(c8 c8Var) {
        int a2 = c8Var.a();
        Boolean bool = c8Var.f10139c;
        if (bool != null) {
            this.f10510e.set(a2, bool.booleanValue());
        }
        Boolean bool2 = c8Var.f10140d;
        if (bool2 != null) {
            this.f10509d.set(a2, bool2.booleanValue());
        }
        if (c8Var.f10141e != null) {
            Long l = this.f10511f.get(Integer.valueOf(a2));
            long longValue = c8Var.f10141e.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.f10511f.put(Integer.valueOf(a2), Long.valueOf(longValue));
            }
        }
        if (c8Var.f10142f != null) {
            List list = this.g.get(Integer.valueOf(a2));
            if (list == null) {
                list = new ArrayList();
                this.g.put(Integer.valueOf(a2), list);
            }
            if (c8Var.i()) {
                list.clear();
            }
            if (zzki.b() && this.h.l().z(this.f10506a, zzaq.g0) && c8Var.j()) {
                list.clear();
            }
            if (!zzki.b() || !this.h.l().z(this.f10506a, zzaq.g0)) {
                list.add(Long.valueOf(c8Var.f10142f.longValue() / 1000));
                return;
            }
            long longValue2 = c8Var.f10142f.longValue() / 1000;
            if (!list.contains(Long.valueOf(longValue2))) {
                list.add(Long.valueOf(longValue2));
            }
        }
    }

    private x7(w7 w7Var, String str, zzcb.zzi zzi, BitSet bitSet, BitSet bitSet2, Map<Integer, Long> map, Map<Integer, Long> map2) {
        this.h = w7Var;
        this.f10506a = str;
        this.f10509d = bitSet;
        this.f10510e = bitSet2;
        this.f10511f = map;
        this.g = new a();
        if (map2 != null) {
            for (Integer next : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(map2.get(next));
                this.g.put(next, arrayList);
            }
        }
        this.f10507b = false;
        this.f10508c = zzi;
    }

    /* synthetic */ x7(w7 w7Var, String str, zzcb.zzi zzi, BitSet bitSet, BitSet bitSet2, Map map, Map map2, y7 y7Var) {
        this(w7Var, str, zzi, bitSet, bitSet2, map, map2);
    }

    /* synthetic */ x7(w7 w7Var, String str, y7 y7Var) {
        this(w7Var, str);
    }
}
