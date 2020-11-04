package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfg;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
final class c2<T extends zzfg<T>> {

    /* renamed from: d  reason: collision with root package name */
    private static final c2 f9552d = new c2(true);

    /* renamed from: a  reason: collision with root package name */
    final q3<T, Object> f9553a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f9554b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f9555c;

    private c2() {
        this.f9553a = q3.b(16);
    }

    public static int a(zzfg<?> zzfg, Object obj) {
        zziu b2 = zzfg.b();
        int a2 = zzfg.a();
        if (!zzfg.d()) {
            return b(b2, a2, obj);
        }
        int i = 0;
        if (zzfg.e()) {
            for (Object j : (List) obj) {
                i += j(b2, j);
            }
            return zzev.h0(a2) + i + zzev.E0(i);
        }
        for (Object b3 : (List) obj) {
            i += b(b2, a2, b3);
        }
        return i;
    }

    static int b(zziu zziu, int i, Object obj) {
        int h0 = zzev.h0(i);
        if (zziu == zziu.GROUP) {
            zzfr.g((zzgw) obj);
            h0 <<= 1;
        }
        return h0 + j(zziu, obj);
    }

    public static <T extends zzfg<T>> c2<T> c() {
        return f9552d;
    }

    private final Object d(T t) {
        Object obj = this.f9553a.get(t);
        if (!(obj instanceof zzgb)) {
            return obj;
        }
        zzgb zzgb = (zzgb) obj;
        zzgb.e();
        throw null;
    }

    private static Object e(Object obj) {
        if (obj instanceof zzhf) {
            return ((zzhf) obj).a();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    static void f(zzev zzev, zziu zziu, int i, Object obj) throws IOException {
        if (zziu == zziu.GROUP) {
            zzgw zzgw = (zzgw) obj;
            zzfr.g(zzgw);
            zzev.m(i, 3);
            zzgw.g(zzev);
            zzev.m(i, 4);
            return;
        }
        zzev.m(i, zziu.g());
        switch (e2.f9571b[zziu.ordinal()]) {
            case 1:
                zzev.h(((Double) obj).doubleValue());
                return;
            case 2:
                zzev.i(((Float) obj).floatValue());
                return;
            case 3:
                zzev.t(((Long) obj).longValue());
                return;
            case 4:
                zzev.t(((Long) obj).longValue());
                return;
            case 5:
                zzev.j(((Integer) obj).intValue());
                return;
            case 6:
                zzev.a0(((Long) obj).longValue());
                return;
            case 7:
                zzev.f0(((Integer) obj).intValue());
                return;
            case 8:
                zzev.y(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzgw) obj).g(zzev);
                return;
            case 10:
                zzev.v((zzgw) obj);
                return;
            case 11:
                if (obj instanceof zzeg) {
                    zzev.u((zzeg) obj);
                    return;
                } else {
                    zzev.w((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzeg) {
                    zzev.u((zzeg) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzev.T(bArr, 0, bArr.length);
                return;
            case 13:
                zzev.O(((Integer) obj).intValue());
                return;
            case 14:
                zzev.f0(((Integer) obj).intValue());
                return;
            case 15:
                zzev.a0(((Long) obj).longValue());
                return;
            case 16:
                zzev.X(((Integer) obj).intValue());
                return;
            case 17:
                zzev.S(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof zzfq) {
                    zzev.j(((zzfq) obj).a());
                    return;
                } else {
                    zzev.j(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if ((r3 instanceof com.google.android.gms.internal.measurement.zzfq) == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if ((r3 instanceof com.google.android.gms.internal.measurement.zzgb) == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void h(com.google.android.gms.internal.measurement.zziu r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.measurement.zzfr.d(r3)
            int[] r0 = com.google.android.gms.internal.measurement.e2.f9570a
            com.google.android.gms.internal.measurement.zzjb r2 = r2.f()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x0040;
                case 2: goto L_0x003d;
                case 3: goto L_0x003a;
                case 4: goto L_0x0037;
                case 5: goto L_0x0034;
                case 6: goto L_0x0031;
                case 7: goto L_0x0028;
                case 8: goto L_0x001f;
                case 9: goto L_0x0016;
                default: goto L_0x0014;
            }
        L_0x0014:
            r0 = 0
            goto L_0x0042
        L_0x0016:
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzgw
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzgb
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x001f:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzfq
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x0028:
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzeg
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x0031:
            boolean r0 = r3 instanceof java.lang.String
            goto L_0x0042
        L_0x0034:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L_0x0042
        L_0x0037:
            boolean r0 = r3 instanceof java.lang.Double
            goto L_0x0042
        L_0x003a:
            boolean r0 = r3 instanceof java.lang.Float
            goto L_0x0042
        L_0x003d:
            boolean r0 = r3 instanceof java.lang.Long
            goto L_0x0042
        L_0x0040:
            boolean r0 = r3 instanceof java.lang.Integer
        L_0x0042:
            if (r0 == 0) goto L_0x0045
            return
        L_0x0045:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.c2.h(com.google.android.gms.internal.measurement.zziu, java.lang.Object):void");
    }

    private static <T extends zzfg<T>> boolean i(Map.Entry<T, Object> entry) {
        zzfg zzfg = (zzfg) entry.getKey();
        if (zzfg.c() == zzjb.MESSAGE) {
            if (zzfg.d()) {
                for (zzgw f2 : (List) entry.getValue()) {
                    if (!f2.f()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof zzgw) {
                    if (!((zzgw) value).f()) {
                        return false;
                    }
                } else if (value instanceof zzgb) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    private static int j(zziu zziu, Object obj) {
        switch (e2.f9571b[zziu.ordinal()]) {
            case 1:
                return zzev.z(((Double) obj).doubleValue());
            case 2:
                return zzev.A(((Float) obj).floatValue());
            case 3:
                return zzev.e0(((Long) obj).longValue());
            case 4:
                return zzev.j0(((Long) obj).longValue());
            case 5:
                return zzev.l0(((Integer) obj).intValue());
            case 6:
                return zzev.s0(((Long) obj).longValue());
            case 7:
                return zzev.x0(((Integer) obj).intValue());
            case 8:
                return zzev.L(((Boolean) obj).booleanValue());
            case 9:
                return zzev.W((zzgw) obj);
            case 10:
                if (obj instanceof zzgb) {
                    return zzev.d((zzgb) obj);
                }
                return zzev.J((zzgw) obj);
            case 11:
                if (obj instanceof zzeg) {
                    return zzev.I((zzeg) obj);
                }
                return zzev.K((String) obj);
            case 12:
                if (obj instanceof zzeg) {
                    return zzev.I((zzeg) obj);
                }
                return zzev.M((byte[]) obj);
            case 13:
                return zzev.p0(((Integer) obj).intValue());
            case 14:
                return zzev.A0(((Integer) obj).intValue());
            case 15:
                return zzev.w0(((Long) obj).longValue());
            case 16:
                return zzev.t0(((Integer) obj).intValue());
            case 17:
                return zzev.o0(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzfq) {
                    return zzev.C0(((zzfq) obj).a());
                }
                return zzev.C0(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private final void l(T t, Object obj) {
        if (!t.d()) {
            h(t.b(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                h(t.b(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzgb) {
            this.f9555c = true;
        }
        this.f9553a.put(t, obj);
    }

    private final void m(Map.Entry<T, Object> entry) {
        Object obj;
        zzfg zzfg = (zzfg) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzgb) {
            zzgb zzgb = (zzgb) value;
            zzgb.e();
            throw null;
        } else if (zzfg.d()) {
            Object d2 = d(zzfg);
            if (d2 == null) {
                d2 = new ArrayList();
            }
            for (Object e2 : (List) value) {
                ((List) d2).add(e(e2));
            }
            this.f9553a.put(zzfg, d2);
        } else if (zzfg.c() == zzjb.MESSAGE) {
            Object d3 = d(zzfg);
            if (d3 == null) {
                this.f9553a.put(zzfg, e(value));
                return;
            }
            if (d3 instanceof zzhf) {
                obj = zzfg.z((zzhf) d3, (zzhf) value);
            } else {
                obj = zzfg.Q(((zzgw) d3).c(), (zzgw) value).q();
            }
            this.f9553a.put(zzfg, obj);
        } else {
            this.f9553a.put(zzfg, e(value));
        }
    }

    private static int n(Map.Entry<T, Object> entry) {
        zzfg zzfg = (zzfg) entry.getKey();
        Object value = entry.getValue();
        if (zzfg.c() != zzjb.MESSAGE || zzfg.d() || zzfg.e()) {
            return a(zzfg, value);
        }
        if (value instanceof zzgb) {
            return zzev.D(((zzfg) entry.getKey()).a(), (zzgb) value);
        }
        return zzev.E(((zzfg) entry.getKey()).a(), (zzgw) value);
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        c2 c2Var = new c2();
        for (int i = 0; i < this.f9553a.j(); i++) {
            Map.Entry<T, Object> h = this.f9553a.h(i);
            c2Var.l((zzfg) h.getKey(), h.getValue());
        }
        for (Map.Entry next : this.f9553a.m()) {
            c2Var.l((zzfg) next.getKey(), next.getValue());
        }
        c2Var.f9555c = this.f9555c;
        return c2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2)) {
            return false;
        }
        return this.f9553a.equals(((c2) obj).f9553a);
    }

    public final void g(c2<T> c2Var) {
        for (int i = 0; i < c2Var.f9553a.j(); i++) {
            m(c2Var.f9553a.h(i));
        }
        for (Map.Entry<T, Object> m : c2Var.f9553a.m()) {
            m(m);
        }
    }

    public final int hashCode() {
        return this.f9553a.hashCode();
    }

    public final void k() {
        if (!this.f9554b) {
            this.f9553a.e();
            this.f9554b = true;
        }
    }

    public final boolean o() {
        return this.f9554b;
    }

    public final Iterator<Map.Entry<T, Object>> p() {
        if (this.f9555c) {
            return new m2(this.f9553a.entrySet().iterator());
        }
        return this.f9553a.entrySet().iterator();
    }

    /* access modifiers changed from: package-private */
    public final Iterator<Map.Entry<T, Object>> q() {
        if (this.f9555c) {
            return new m2(this.f9553a.o().iterator());
        }
        return this.f9553a.o().iterator();
    }

    public final boolean r() {
        for (int i = 0; i < this.f9553a.j(); i++) {
            if (!i(this.f9553a.h(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> i2 : this.f9553a.m()) {
            if (!i(i2)) {
                return false;
            }
        }
        return true;
    }

    public final int s() {
        int i = 0;
        for (int i2 = 0; i2 < this.f9553a.j(); i2++) {
            i += n(this.f9553a.h(i2));
        }
        for (Map.Entry<T, Object> n : this.f9553a.m()) {
            i += n(n);
        }
        return i;
    }

    private c2(boolean z) {
        this(q3.b(0));
        k();
    }

    private c2(q3<T, Object> q3Var) {
        this.f9553a = q3Var;
        k();
    }
}
