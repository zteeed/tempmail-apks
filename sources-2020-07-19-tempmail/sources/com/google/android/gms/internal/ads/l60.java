package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzefw;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class l60<T extends zzefw<T>> {

    /* renamed from: d  reason: collision with root package name */
    private static final l60 f4266d = new l60(true);

    /* renamed from: a  reason: collision with root package name */
    final e80<T, Object> f4267a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f4268b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4269c;

    private l60() {
        this.f4267a = e80.o(16);
    }

    static int e(zzejq zzejq, int i, Object obj) {
        int e0 = zzefl.e0(i);
        if (zzejq == zzejq.GROUP) {
            zzegd.h((zzehl) obj);
            e0 <<= 1;
        }
        return e0 + m(zzejq, obj);
    }

    private final Object f(T t) {
        Object obj = this.f4267a.get(t);
        if (!(obj instanceof zzegq)) {
            return obj;
        }
        zzegq zzegq = (zzegq) obj;
        zzegq.e();
        throw null;
    }

    static void g(zzefl zzefl, zzejq zzejq, int i, Object obj) throws IOException {
        if (zzejq == zzejq.GROUP) {
            zzehl zzehl = (zzehl) obj;
            zzegd.h(zzehl);
            zzefl.b(i, 3);
            zzehl.i(zzefl);
            zzefl.b(i, 4);
            return;
        }
        zzefl.b(i, zzejq.g());
        switch (k60.f4184b[zzejq.ordinal()]) {
            case 1:
                zzefl.A(((Double) obj).doubleValue());
                return;
            case 2:
                zzefl.O(((Float) obj).floatValue());
                return;
            case 3:
                zzefl.P(((Long) obj).longValue());
                return;
            case 4:
                zzefl.P(((Long) obj).longValue());
                return;
            case 5:
                zzefl.a0(((Integer) obj).intValue());
                return;
            case 6:
                zzefl.R(((Long) obj).longValue());
                return;
            case 7:
                zzefl.d0(((Integer) obj).intValue());
                return;
            case 8:
                zzefl.G(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzehl) obj).i(zzefl);
                return;
            case 10:
                zzefl.Z((zzehl) obj);
                return;
            case 11:
                if (obj instanceof zzeer) {
                    zzefl.r((zzeer) obj);
                    return;
                } else {
                    zzefl.q0((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzeer) {
                    zzefl.r((zzeer) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzefl.y0(bArr, 0, bArr.length);
                return;
            case 13:
                zzefl.b0(((Integer) obj).intValue());
                return;
            case 14:
                zzefl.d0(((Integer) obj).intValue());
                return;
            case 15:
                zzefl.R(((Long) obj).longValue());
                return;
            case 16:
                zzefl.c0(((Integer) obj).intValue());
                return;
            case 17:
                zzefl.Q(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof zzegg) {
                    zzefl.a0(((zzegg) obj).i());
                    return;
                } else {
                    zzefl.a0(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    private final void i(T t, Object obj) {
        if (!t.F()) {
            j(t.w(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                j(t.w(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzegq) {
            this.f4269c = true;
        }
        this.f4267a.put(t, obj);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if ((r3 instanceof com.google.android.gms.internal.ads.zzegg) == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if ((r3 instanceof com.google.android.gms.internal.ads.zzegq) == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void j(com.google.android.gms.internal.ads.zzejq r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.ads.zzegd.a(r3)
            int[] r0 = com.google.android.gms.internal.ads.k60.f4183a
            com.google.android.gms.internal.ads.zzejt r2 = r2.f()
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
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.zzehl
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.zzegq
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x001f:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.zzegg
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x0028:
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.zzeer
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.l60.j(com.google.android.gms.internal.ads.zzejq, java.lang.Object):void");
    }

    private static Object k(Object obj) {
        if (obj instanceof zzehu) {
            return ((zzehu) obj).J();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int l(zzefw<?> zzefw, Object obj) {
        zzejq w = zzefw.w();
        int i = zzefw.i();
        if (!zzefw.F()) {
            return e(w, i, obj);
        }
        int i2 = 0;
        if (zzefw.j()) {
            for (Object m : (List) obj) {
                i2 += m(w, m);
            }
            return zzefl.e0(i) + i2 + zzefl.m0(i2);
        }
        for (Object e2 : (List) obj) {
            i2 += e(w, i, e2);
        }
        return i2;
    }

    private static int m(zzejq zzejq, Object obj) {
        switch (k60.f4184b[zzejq.ordinal()]) {
            case 1:
                return zzefl.I(((Double) obj).doubleValue());
            case 2:
                return zzefl.Y(((Float) obj).floatValue());
            case 3:
                return zzefl.S(((Long) obj).longValue());
            case 4:
                return zzefl.T(((Long) obj).longValue());
            case 5:
                return zzefl.f0(((Integer) obj).intValue());
            case 6:
                return zzefl.V(((Long) obj).longValue());
            case 7:
                return zzefl.i0(((Integer) obj).intValue());
            case 8:
                return zzefl.H(((Boolean) obj).booleanValue());
            case 9:
                return zzefl.t0((zzehl) obj);
            case 10:
                if (obj instanceof zzegq) {
                    return zzefl.d((zzegq) obj);
                }
                return zzefl.n0((zzehl) obj);
            case 11:
                if (obj instanceof zzeer) {
                    return zzefl.t((zzeer) obj);
                }
                return zzefl.r0((String) obj);
            case 12:
                if (obj instanceof zzeer) {
                    return zzefl.t((zzeer) obj);
                }
                return zzefl.F0((byte[]) obj);
            case 13:
                return zzefl.g0(((Integer) obj).intValue());
            case 14:
                return zzefl.j0(((Integer) obj).intValue());
            case 15:
                return zzefl.W(((Long) obj).longValue());
            case 16:
                return zzefl.h0(((Integer) obj).intValue());
            case 17:
                return zzefl.U(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzegg) {
                    return zzefl.k0(((zzegg) obj).i());
                }
                return zzefl.k0(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static <T extends zzefw<T>> boolean n(Map.Entry<T, Object> entry) {
        zzefw zzefw = (zzefw) entry.getKey();
        if (zzefw.C() == zzejt.MESSAGE) {
            if (zzefw.F()) {
                for (zzehl isInitialized : (List) entry.getValue()) {
                    if (!isInitialized.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof zzehl) {
                    if (!((zzehl) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof zzegq) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public static <T extends zzefw<T>> l60<T> p() {
        return f4266d;
    }

    private final void r(Map.Entry<T, Object> entry) {
        Object obj;
        zzefw zzefw = (zzefw) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzegq) {
            zzegq zzegq = (zzegq) value;
            zzegq.e();
            throw null;
        } else if (zzefw.F()) {
            Object f2 = f(zzefw);
            if (f2 == null) {
                f2 = new ArrayList();
            }
            for (Object k : (List) value) {
                ((List) f2).add(k(k));
            }
            this.f4267a.put(zzefw, f2);
        } else if (zzefw.C() == zzejt.MESSAGE) {
            Object f3 = f(zzefw);
            if (f3 == null) {
                this.f4267a.put(zzefw, k(value));
                return;
            }
            if (f3 instanceof zzehu) {
                obj = zzefw.M((zzehu) f3, (zzehu) value);
            } else {
                obj = zzefw.U(((zzehl) f3).b(), (zzehl) value).O();
            }
            this.f4267a.put(zzefw, obj);
        } else {
            this.f4267a.put(zzefw, k(value));
        }
    }

    private static int s(Map.Entry<T, Object> entry) {
        zzefw zzefw = (zzefw) entry.getKey();
        Object value = entry.getValue();
        if (zzefw.C() != zzejt.MESSAGE || zzefw.F() || zzefw.j()) {
            return l(zzefw, value);
        }
        if (value instanceof zzegq) {
            return zzefl.x(((zzefw) entry.getKey()).i(), (zzegq) value);
        }
        return zzefl.y(((zzefw) entry.getKey()).i(), (zzehl) value);
    }

    /* access modifiers changed from: package-private */
    public final Iterator<Map.Entry<T, Object>> a() {
        if (this.f4269c) {
            return new t60(this.f4267a.j().iterator());
        }
        return this.f4267a.j().iterator();
    }

    public final boolean b() {
        return this.f4268b;
    }

    public final boolean c() {
        for (int i = 0; i < this.f4267a.h(); i++) {
            if (!n(this.f4267a.p(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> n : this.f4267a.i()) {
            if (!n(n)) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        l60 l60 = new l60();
        for (int i = 0; i < this.f4267a.h(); i++) {
            Map.Entry<T, Object> p = this.f4267a.p(i);
            l60.i((zzefw) p.getKey(), p.getValue());
        }
        for (Map.Entry next : this.f4267a.i()) {
            l60.i((zzefw) next.getKey(), next.getValue());
        }
        l60.f4269c = this.f4269c;
        return l60;
    }

    public final Iterator<Map.Entry<T, Object>> d() {
        if (this.f4269c) {
            return new t60(this.f4267a.entrySet().iterator());
        }
        return this.f4267a.entrySet().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l60)) {
            return false;
        }
        return this.f4267a.equals(((l60) obj).f4267a);
    }

    public final void h(l60<T> l60) {
        for (int i = 0; i < l60.f4267a.h(); i++) {
            r(l60.f4267a.p(i));
        }
        for (Map.Entry<T, Object> r : l60.f4267a.i()) {
            r(r);
        }
    }

    public final int hashCode() {
        return this.f4267a.hashCode();
    }

    public final void o() {
        if (!this.f4268b) {
            this.f4267a.g();
            this.f4268b = true;
        }
    }

    public final int q() {
        int i = 0;
        for (int i2 = 0; i2 < this.f4267a.h(); i2++) {
            i += s(this.f4267a.p(i2));
        }
        for (Map.Entry<T, Object> s : this.f4267a.i()) {
            i += s(s);
        }
        return i;
    }

    private l60(boolean z) {
        this(e80.o(0));
        o();
    }

    private l60(e80<T, Object> e80) {
        this.f4267a = e80;
        o();
    }
}
