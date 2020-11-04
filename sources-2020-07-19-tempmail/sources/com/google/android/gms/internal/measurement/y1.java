package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfo;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
final class y1 implements w4 {

    /* renamed from: a  reason: collision with root package name */
    private final zzev f9526a;

    private y1(zzev zzev) {
        zzfr.f(zzev, "output");
        zzev zzev2 = zzev;
        this.f9526a = zzev2;
        zzev2.f9616a = this;
    }

    public static y1 P(zzev zzev) {
        y1 y1Var = zzev.f9616a;
        if (y1Var != null) {
            return y1Var;
        }
        return new y1(zzev);
    }

    public final void A(int i, long j) throws IOException {
        this.f9526a.Z(i, j);
    }

    public final void B(int i, int i2) throws IOException {
        this.f9526a.P(i, i2);
    }

    public final void C(int i, zzeg zzeg) throws IOException {
        this.f9526a.o(i, zzeg);
    }

    public final void D(int i, List<?> list, p3 p3Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            H(i, list.get(i2), p3Var);
        }
    }

    public final <K, V> void E(int i, w2<K, V> w2Var, Map<K, V> map) throws IOException {
        for (Map.Entry next : map.entrySet()) {
            this.f9526a.m(i, 2);
            this.f9526a.O(zzgo.a(w2Var, next.getKey(), next.getValue()));
            zzgo.b(this.f9526a, w2Var, next.getKey(), next.getValue());
        }
    }

    public final void F(int i, int i2) throws IOException {
        this.f9526a.k0(i, i2);
    }

    public final void G(int i, long j) throws IOException {
        this.f9526a.n(i, j);
    }

    public final void H(int i, Object obj, p3 p3Var) throws IOException {
        zzev zzev = this.f9526a;
        zzev.m(i, 3);
        p3Var.i((zzgw) obj, zzev.f9616a);
        zzev.m(i, 4);
    }

    public final void I(int i, int i2) throws IOException {
        this.f9526a.g0(i, i2);
    }

    public final void J(int i, List<?> list, p3 p3Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            N(i, list.get(i2), p3Var);
        }
    }

    public final void K(int i, int i2) throws IOException {
        this.f9526a.k0(i, i2);
    }

    public final void L(int i, long j) throws IOException {
        this.f9526a.Z(i, j);
    }

    public final void M(int i, int i2) throws IOException {
        this.f9526a.Y(i, i2);
    }

    public final void N(int i, Object obj, p3 p3Var) throws IOException {
        this.f9526a.q(i, (zzgw) obj, p3Var);
    }

    public final void O(int i, long j) throws IOException {
        this.f9526a.Q(i, j);
    }

    public final int a() {
        return zzfo.zzf.k;
    }

    public final void b(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f9526a.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzev.L(list.get(i4).booleanValue());
            }
            this.f9526a.O(i3);
            while (i2 < list.size()) {
                this.f9526a.y(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9526a.s(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    public final void c(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f9526a.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzev.l0(list.get(i4).intValue());
            }
            this.f9526a.O(i3);
            while (i2 < list.size()) {
                this.f9526a.j(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9526a.P(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void d(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f9526a.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzev.C0(list.get(i4).intValue());
            }
            this.f9526a.O(i3);
            while (i2 < list.size()) {
                this.f9526a.j(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9526a.P(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void e(int i, int i2) throws IOException {
        this.f9526a.P(i, i2);
    }

    public final void f(int i) throws IOException {
        this.f9526a.m(i, 3);
    }

    public final void g(int i) throws IOException {
        this.f9526a.m(i, 4);
    }

    public final void h(int i, long j) throws IOException {
        this.f9526a.n(i, j);
    }

    public final void i(int i, Object obj) throws IOException {
        if (obj instanceof zzeg) {
            this.f9526a.R(i, (zzeg) obj);
        } else {
            this.f9526a.p(i, (zzgw) obj);
        }
    }

    public final void j(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f9526a.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzev.e0(list.get(i4).longValue());
            }
            this.f9526a.O(i3);
            while (i2 < list.size()) {
                this.f9526a.t(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9526a.n(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void k(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f9526a.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzev.w0(list.get(i4).longValue());
            }
            this.f9526a.O(i3);
            while (i2 < list.size()) {
                this.f9526a.a0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9526a.Z(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void l(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f9526a.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzev.x0(list.get(i4).intValue());
            }
            this.f9526a.O(i3);
            while (i2 < list.size()) {
                this.f9526a.f0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9526a.k0(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void m(int i, String str) throws IOException {
        this.f9526a.r(i, str);
    }

    public final void n(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f9526a.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzev.p0(list.get(i4).intValue());
            }
            this.f9526a.O(i3);
            while (i2 < list.size()) {
                this.f9526a.O(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9526a.Y(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void o(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f9526a.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzev.A0(list.get(i4).intValue());
            }
            this.f9526a.O(i3);
            while (i2 < list.size()) {
                this.f9526a.f0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9526a.k0(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void p(int i, double d2) throws IOException {
        this.f9526a.k(i, d2);
    }

    public final void q(int i, float f2) throws IOException {
        this.f9526a.l(i, f2);
    }

    public final void r(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f9526a.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzev.s0(list.get(i4).longValue());
            }
            this.f9526a.O(i3);
            while (i2 < list.size()) {
                this.f9526a.a0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9526a.Z(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void s(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f9526a.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzev.o0(list.get(i4).longValue());
            }
            this.f9526a.O(i3);
            while (i2 < list.size()) {
                this.f9526a.S(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9526a.Q(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void t(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f9526a.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzev.j0(list.get(i4).longValue());
            }
            this.f9526a.O(i3);
            while (i2 < list.size()) {
                this.f9526a.t(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9526a.n(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void u(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f9526a.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzev.t0(list.get(i4).intValue());
            }
            this.f9526a.O(i3);
            while (i2 < list.size()) {
                this.f9526a.X(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9526a.g0(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void v(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f9526a.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzev.z(list.get(i4).doubleValue());
            }
            this.f9526a.O(i3);
            while (i2 < list.size()) {
                this.f9526a.h(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9526a.k(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    public final void w(int i, List<zzeg> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f9526a.o(i, list.get(i2));
        }
    }

    public final void x(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f9526a.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzev.A(list.get(i4).floatValue());
            }
            this.f9526a.O(i3);
            while (i2 < list.size()) {
                this.f9526a.i(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9526a.l(i, list.get(i2).floatValue());
            i2++;
        }
    }

    public final void y(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof zzgh) {
            zzgh zzgh = (zzgh) list;
            while (i2 < list.size()) {
                Object g = zzgh.g(i2);
                if (g instanceof String) {
                    this.f9526a.r(i, (String) g);
                } else {
                    this.f9526a.o(i, (zzeg) g);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9526a.r(i, list.get(i2));
            i2++;
        }
    }

    public final void z(int i, boolean z) throws IOException {
        this.f9526a.s(i, z);
    }
}
