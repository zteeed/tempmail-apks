package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
final class r3 {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f9486a = F();

    /* renamed from: b  reason: collision with root package name */
    private static final f4<?, ?> f9487b = g(false);

    /* renamed from: c  reason: collision with root package name */
    private static final f4<?, ?> f9488c = g(true);

    /* renamed from: d  reason: collision with root package name */
    private static final f4<?, ?> f9489d = new g4();

    static int A(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof r2) {
            r2 r2Var = (r2) list;
            i = 0;
            while (i2 < size) {
                i += zzev.o0(r2Var.g(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzev.o0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static f4<?, ?> B() {
        return f9489d;
    }

    public static void C(int i, List<Long> list, w4 w4Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            w4Var.j(i, list, z);
        }
    }

    static int D(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return E(list) + (size * zzev.h0(i));
    }

    static int E(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof k2) {
            k2 k2Var = (k2) list;
            i = 0;
            while (i2 < size) {
                i += zzev.C0(k2Var.h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzev.C0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    private static Class<?> F() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void G(int i, List<Long> list, w4 w4Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            w4Var.t(i, list, z);
        }
    }

    static int H(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return I(list) + (size * zzev.h0(i));
    }

    static int I(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof k2) {
            k2 k2Var = (k2) list;
            i = 0;
            while (i2 < size) {
                i += zzev.l0(k2Var.h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzev.l0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    private static Class<?> J() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void K(int i, List<Long> list, w4 w4Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            w4Var.s(i, list, z);
        }
    }

    static int L(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return M(list) + (size * zzev.h0(i));
    }

    static int M(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof k2) {
            k2 k2Var = (k2) list;
            i = 0;
            while (i2 < size) {
                i += zzev.p0(k2Var.h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzev.p0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void N(int i, List<Long> list, w4 w4Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            w4Var.r(i, list, z);
        }
    }

    static int O(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return P(list) + (size * zzev.h0(i));
    }

    static int P(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof k2) {
            k2 k2Var = (k2) list;
            i = 0;
            while (i2 < size) {
                i += zzev.t0(k2Var.h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzev.t0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void Q(int i, List<Long> list, w4 w4Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            w4Var.k(i, list, z);
        }
    }

    static int R(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzev.y0(i, 0);
    }

    static int S(List<?> list) {
        return list.size() << 2;
    }

    public static void T(int i, List<Integer> list, w4 w4Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            w4Var.c(i, list, z);
        }
    }

    static int U(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzev.r0(i, 0);
    }

    static int V(List<?> list) {
        return list.size() << 3;
    }

    public static void W(int i, List<Integer> list, w4 w4Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            w4Var.n(i, list, z);
        }
    }

    static int X(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzev.H(i, true);
    }

    static int Y(List<?> list) {
        return list.size();
    }

    public static void Z(int i, List<Integer> list, w4 w4Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            w4Var.u(i, list, z);
        }
    }

    static int a(int i, Object obj, p3 p3Var) {
        if (obj instanceof zzgf) {
            return zzev.c(i, (zzgf) obj);
        }
        return zzev.F(i, (zzgw) obj, p3Var);
    }

    public static void a0(int i, List<Integer> list, w4 w4Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            w4Var.l(i, list, z);
        }
    }

    static int b(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int h0 = zzev.h0(i) * size;
        if (list instanceof zzgh) {
            zzgh zzgh = (zzgh) list;
            while (i4 < size) {
                Object g = zzgh.g(i4);
                if (g instanceof zzeg) {
                    i3 = zzev.I((zzeg) g);
                } else {
                    i3 = zzev.K((String) g);
                }
                h0 += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zzeg) {
                    i2 = zzev.I((zzeg) obj);
                } else {
                    i2 = zzev.K((String) obj);
                }
                h0 += i2;
                i4++;
            }
        }
        return h0;
    }

    public static void b0(int i, List<Integer> list, w4 w4Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            w4Var.o(i, list, z);
        }
    }

    static int c(int i, List<?> list, p3 p3Var) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int h0 = zzev.h0(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof zzgf) {
                i2 = zzev.d((zzgf) obj);
            } else {
                i2 = zzev.e((zzgw) obj, p3Var);
            }
            h0 += i2;
        }
        return h0;
    }

    public static void c0(int i, List<Integer> list, w4 w4Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            w4Var.d(i, list, z);
        }
    }

    static int d(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return e(list) + (list.size() * zzev.h0(i));
    }

    public static void d0(int i, List<Boolean> list, w4 w4Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            w4Var.b(i, list, z);
        }
    }

    static int e(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof r2) {
            r2 r2Var = (r2) list;
            i = 0;
            while (i2 < size) {
                i += zzev.e0(r2Var.g(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzev.e0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static f4<?, ?> f() {
        return f9487b;
    }

    private static f4<?, ?> g(boolean z) {
        try {
            Class<?> J = J();
            if (J == null) {
                return null;
            }
            return (f4) J.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    static <UT, UB> UB h(int i, int i2, UB ub, f4<UT, UB> f4Var) {
        if (ub == null) {
            ub = f4Var.a();
        }
        f4Var.d(ub, i, (long) i2);
        return ub;
    }

    static <UT, UB> UB i(int i, List<Integer> list, zzfs zzfs, UB ub, f4<UT, UB> f4Var) {
        if (zzfs == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (zzfs.f(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = h(i, intValue, ub, f4Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzfs.f(intValue2)) {
                    ub = h(i, intValue2, ub, f4Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static void j(int i, List<String> list, w4 w4Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            w4Var.y(i, list);
        }
    }

    public static void k(int i, List<?> list, w4 w4Var, p3 p3Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            w4Var.J(i, list, p3Var);
        }
    }

    public static void l(int i, List<Double> list, w4 w4Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            w4Var.v(i, list, z);
        }
    }

    static <T, FT extends zzfg<FT>> void m(b2<FT> b2Var, T t, T t2) {
        c2<FT> b2 = b2Var.b(t2);
        if (!b2.f9370a.isEmpty()) {
            b2Var.i(t).g(b2);
        }
    }

    static <T> void n(y2 y2Var, T t, T t2, long j) {
        k4.j(t, j, y2Var.g(k4.F(t, j), k4.F(t2, j)));
    }

    static <T, UT, UB> void o(f4<UT, UB> f4Var, T t, T t2) {
        f4Var.h(t, f4Var.p(f4Var.k(t), f4Var.k(t2)));
    }

    public static void p(Class<?> cls) {
        Class<?> cls2;
        if (!zzfo.class.isAssignableFrom(cls) && (cls2 = f9486a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean q(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int r(int i, List<zzeg> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int h0 = size * zzev.h0(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            h0 += zzev.I(list.get(i2));
        }
        return h0;
    }

    static int s(int i, List<zzgw> list, p3 p3Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzev.V(i, list.get(i3), p3Var);
        }
        return i2;
    }

    static int t(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return u(list) + (size * zzev.h0(i));
    }

    static int u(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof r2) {
            r2 r2Var = (r2) list;
            i = 0;
            while (i2 < size) {
                i += zzev.j0(r2Var.g(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzev.j0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static f4<?, ?> v() {
        return f9488c;
    }

    public static void w(int i, List<zzeg> list, w4 w4Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            w4Var.w(i, list);
        }
    }

    public static void x(int i, List<?> list, w4 w4Var, p3 p3Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            w4Var.D(i, list, p3Var);
        }
    }

    public static void y(int i, List<Float> list, w4 w4Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            w4Var.x(i, list, z);
        }
    }

    static int z(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return A(list) + (size * zzev.h0(i));
    }
}
