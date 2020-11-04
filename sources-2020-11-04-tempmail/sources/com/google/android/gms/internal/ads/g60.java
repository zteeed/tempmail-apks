package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegb;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class g60 implements j90 {

    /* renamed from: a  reason: collision with root package name */
    private final zzefl f4037a;

    private g60(zzefl zzefl) {
        zzegd.d(zzefl, "output");
        zzefl zzefl2 = zzefl;
        this.f4037a = zzefl2;
        zzefl2.f8730a = this;
    }

    public static g60 a(zzefl zzefl) {
        g60 g60 = zzefl.f8730a;
        if (g60 != null) {
            return g60;
        }
        return new g60(zzefl);
    }

    public final void A(int i, long j) throws IOException {
        this.f4037a.v0(i, j);
    }

    public final void B(int i, double d2) throws IOException {
        this.f4037a.B(i, d2);
    }

    public final int C() {
        return zzegb.zze.k;
    }

    public final void D(int i, int i2) throws IOException {
        this.f4037a.k(i, i2);
    }

    public final <K, V> void E(int i, d70<K, V> d70, Map<K, V> map) throws IOException {
        for (Map.Entry next : map.entrySet()) {
            this.f4037a.b(i, 2);
            this.f4037a.b0(zzehd.a(d70, next.getKey(), next.getValue()));
            zzehd.b(this.f4037a, d70, next.getKey(), next.getValue());
        }
    }

    public final void F(int i, String str) throws IOException {
        this.f4037a.x0(i, str);
    }

    public final void G(int i, long j) throws IOException {
        this.f4037a.o0(i, j);
    }

    public final void H(int i, List<?> list, z70 z70) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            P(i, list.get(i2), z70);
        }
    }

    public final void I(int i, long j) throws IOException {
        this.f4037a.o0(i, j);
    }

    public final void J(int i, long j) throws IOException {
        this.f4037a.v0(i, j);
    }

    public final void K(int i, List<?> list, z70 z70) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            N(i, list.get(i2), z70);
        }
    }

    public final void L(int i, boolean z) throws IOException {
        this.f4037a.p0(i, z);
    }

    public final void M(int i, long j) throws IOException {
        this.f4037a.u0(i, j);
    }

    public final void N(int i, Object obj, z70 z70) throws IOException {
        zzefl zzefl = this.f4037a;
        zzefl.b(i, 3);
        z70.d((zzehl) obj, zzefl.f8730a);
        zzefl.b(i, 4);
    }

    public final void O(int i, int i2) throws IOException {
        this.f4037a.n(i, i2);
    }

    public final void P(int i, Object obj, z70 z70) throws IOException {
        this.f4037a.i(i, (zzehl) obj, z70);
    }

    public final void Q(int i, zzeer zzeer) throws IOException {
        this.f4037a.g(i, zzeer);
    }

    public final void R(int i) throws IOException {
        this.f4037a.b(i, 3);
    }

    public final void S(int i, int i2) throws IOException {
        this.f4037a.n(i, i2);
    }

    public final void T(int i, int i2) throws IOException {
        this.f4037a.l(i, i2);
    }

    public final void U(int i) throws IOException {
        this.f4037a.b(i, 4);
    }

    public final void V(int i, int i2) throws IOException {
        this.f4037a.k(i, i2);
    }

    public final void W(int i, int i2) throws IOException {
        this.f4037a.m(i, i2);
    }

    public final void b(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f4037a.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzefl.H(list.get(i4).booleanValue());
            }
            this.f4037a.b0(i3);
            while (i2 < list.size()) {
                this.f4037a.G(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4037a.p0(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    public final void c(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f4037a.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzefl.f0(list.get(i4).intValue());
            }
            this.f4037a.b0(i3);
            while (i2 < list.size()) {
                this.f4037a.a0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4037a.k(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void d(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f4037a.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzefl.k0(list.get(i4).intValue());
            }
            this.f4037a.b0(i3);
            while (i2 < list.size()) {
                this.f4037a.a0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4037a.k(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void j(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f4037a.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzefl.S(list.get(i4).longValue());
            }
            this.f4037a.b0(i3);
            while (i2 < list.size()) {
                this.f4037a.P(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4037a.o0(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void k(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f4037a.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzefl.W(list.get(i4).longValue());
            }
            this.f4037a.b0(i3);
            while (i2 < list.size()) {
                this.f4037a.R(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4037a.v0(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void l(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f4037a.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzefl.i0(list.get(i4).intValue());
            }
            this.f4037a.b0(i3);
            while (i2 < list.size()) {
                this.f4037a.d0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4037a.n(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void n(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f4037a.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzefl.g0(list.get(i4).intValue());
            }
            this.f4037a.b0(i3);
            while (i2 < list.size()) {
                this.f4037a.b0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4037a.l(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void o(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f4037a.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzefl.j0(list.get(i4).intValue());
            }
            this.f4037a.b0(i3);
            while (i2 < list.size()) {
                this.f4037a.d0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4037a.n(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void q(int i, float f2) throws IOException {
        this.f4037a.f(i, f2);
    }

    public final void r(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f4037a.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzefl.V(list.get(i4).longValue());
            }
            this.f4037a.b0(i3);
            while (i2 < list.size()) {
                this.f4037a.R(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4037a.v0(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void s(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f4037a.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzefl.U(list.get(i4).longValue());
            }
            this.f4037a.b0(i3);
            while (i2 < list.size()) {
                this.f4037a.Q(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4037a.u0(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void t(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f4037a.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzefl.T(list.get(i4).longValue());
            }
            this.f4037a.b0(i3);
            while (i2 < list.size()) {
                this.f4037a.P(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4037a.o0(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void u(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f4037a.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzefl.h0(list.get(i4).intValue());
            }
            this.f4037a.b0(i3);
            while (i2 < list.size()) {
                this.f4037a.c0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4037a.m(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void v(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f4037a.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzefl.I(list.get(i4).doubleValue());
            }
            this.f4037a.b0(i3);
            while (i2 < list.size()) {
                this.f4037a.A(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4037a.B(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    public final void w(int i, List<zzeer> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f4037a.g(i, list.get(i2));
        }
    }

    public final void x(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f4037a.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzefl.Y(list.get(i4).floatValue());
            }
            this.f4037a.b0(i3);
            while (i2 < list.size()) {
                this.f4037a.O(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4037a.f(i, list.get(i2).floatValue());
            i2++;
        }
    }

    public final void y(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof zzegw) {
            zzegw zzegw = (zzegw) list;
            while (i2 < list.size()) {
                Object I = zzegw.I(i2);
                if (I instanceof String) {
                    this.f4037a.x0(i, (String) I);
                } else {
                    this.f4037a.g(i, (zzeer) I);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4037a.x0(i, list.get(i2));
            i2++;
        }
    }

    public final void z(int i, Object obj) throws IOException {
        if (obj instanceof zzeer) {
            this.f4037a.C(i, (zzeer) obj);
        } else {
            this.f4037a.h(i, (zzehl) obj);
        }
    }
}
