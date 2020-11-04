package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class b80 {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f3433a = y();

    /* renamed from: b  reason: collision with root package name */
    private static final r80<?, ?> f3434b = A(false);

    /* renamed from: c  reason: collision with root package name */
    private static final r80<?, ?> f3435c = A(true);

    /* renamed from: d  reason: collision with root package name */
    private static final r80<?, ?> f3436d = new t80();

    private static r80<?, ?> A(boolean z) {
        try {
            Class<?> z2 = z();
            if (z2 == null) {
                return null;
            }
            return (r80) z2.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    static int B(int i, Object obj, z70 z70) {
        if (obj instanceof zzegu) {
            return zzefl.c(i, (zzegu) obj);
        }
        return zzefl.z(i, (zzehl) obj, z70);
    }

    static int C(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int e0 = zzefl.e0(i) * size;
        if (list instanceof zzegw) {
            zzegw zzegw = (zzegw) list;
            while (i4 < size) {
                Object I = zzegw.I(i4);
                if (I instanceof zzeer) {
                    i3 = zzefl.t((zzeer) I);
                } else {
                    i3 = zzefl.r0((String) I);
                }
                e0 += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zzeer) {
                    i2 = zzefl.t((zzeer) obj);
                } else {
                    i2 = zzefl.r0((String) obj);
                }
                e0 += i2;
                i4++;
            }
        }
        return e0;
    }

    static int D(int i, List<?> list, z70 z70) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e0 = zzefl.e0(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof zzegu) {
                i2 = zzefl.d((zzegu) obj);
            } else {
                i2 = zzefl.e((zzehl) obj, z70);
            }
            e0 += i2;
        }
        return e0;
    }

    public static void E(int i, List<Long> list, j90 j90, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            j90.j(i, list, z);
        }
    }

    static int F(int i, List<zzeer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e0 = size * zzefl.e0(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            e0 += zzefl.t(list.get(i2));
        }
        return e0;
    }

    static int G(int i, List<zzehl> list, z70 z70) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzefl.L(i, list.get(i3), z70);
        }
        return i2;
    }

    public static void H(int i, List<Long> list, j90 j90, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            j90.t(i, list, z);
        }
    }

    public static void I(int i, List<Long> list, j90 j90, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            j90.s(i, list, z);
        }
    }

    public static void J(int i, List<Long> list, j90 j90, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            j90.r(i, list, z);
        }
    }

    public static void K(int i, List<Long> list, j90 j90, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            j90.k(i, list, z);
        }
    }

    public static void L(int i, List<Integer> list, j90 j90, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            j90.c(i, list, z);
        }
    }

    static boolean M(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void N(int i, List<Integer> list, j90 j90, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            j90.n(i, list, z);
        }
    }

    public static void O(Class<?> cls) {
        Class<?> cls2;
        if (!zzegb.class.isAssignableFrom(cls) && (cls2 = f3433a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void P(int i, List<Integer> list, j90 j90, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            j90.u(i, list, z);
        }
    }

    public static void Q(int i, List<Integer> list, j90 j90, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            j90.l(i, list, z);
        }
    }

    public static void R(int i, List<Integer> list, j90 j90, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            j90.o(i, list, z);
        }
    }

    public static void S(int i, List<Integer> list, j90 j90, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            j90.d(i, list, z);
        }
    }

    public static void T(int i, List<Boolean> list, j90 j90, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            j90.b(i, list, z);
        }
    }

    static int U(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return i(list) + (list.size() * zzefl.e0(i));
    }

    static int V(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return j(list) + (size * zzefl.e0(i));
    }

    static int W(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return k(list) + (size * zzefl.e0(i));
    }

    static int X(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return l(list) + (size * zzefl.e0(i));
    }

    static int Y(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m(list) + (size * zzefl.e0(i));
    }

    static int Z(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return n(list) + (size * zzefl.e0(i));
    }

    static <UT, UB> UB a(int i, int i2, UB ub, r80<UT, UB> r80) {
        if (ub == null) {
            ub = r80.n();
        }
        r80.a(ub, i, (long) i2);
        return ub;
    }

    static int a0(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return o(list) + (size * zzefl.e0(i));
    }

    static <UT, UB> UB b(int i, List<Integer> list, zzegi zzegi, UB ub, r80<UT, UB> r80) {
        if (zzegi == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (zzegi.a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = a(i, intValue, ub, r80);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzegi.a(intValue2)) {
                    ub = a(i, intValue2, ub, r80);
                    it.remove();
                }
            }
        }
        return ub;
    }

    static int b0(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzefl.s(i, 0);
    }

    public static void c(int i, List<String> list, j90 j90) throws IOException {
        if (list != null && !list.isEmpty()) {
            j90.y(i, list);
        }
    }

    static int c0(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzefl.C0(i, 0);
    }

    public static void d(int i, List<?> list, j90 j90, z70 z70) throws IOException {
        if (list != null && !list.isEmpty()) {
            j90.H(i, list, z70);
        }
    }

    static int d0(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzefl.s0(i, true);
    }

    public static void e(int i, List<Double> list, j90 j90, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            j90.v(i, list, z);
        }
    }

    static <T, FT extends zzefw<FT>> void f(h60<FT> h60, T t, T t2) {
        l60<FT> g = h60.g(t2);
        if (!g.f4267a.isEmpty()) {
            h60.h(t).h(g);
        }
    }

    static <T> void g(f70 f70, T t, T t2, long j) {
        v80.f(t, j, f70.e(v80.G(t, j), v80.G(t2, j)));
    }

    static <T, UT, UB> void h(r80<UT, UB> r80, T t, T t2) {
        r80.q(t, r80.s(r80.j(t), r80.j(t2)));
    }

    static int i(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y60) {
            y60 y60 = (y60) list;
            i = 0;
            while (i2 < size) {
                i += zzefl.S(y60.h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzefl.S(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    static int j(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y60) {
            y60 y60 = (y60) list;
            i = 0;
            while (i2 < size) {
                i += zzefl.T(y60.h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzefl.T(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    static int k(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y60) {
            y60 y60 = (y60) list;
            i = 0;
            while (i2 < size) {
                i += zzefl.U(y60.h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzefl.U(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    static int l(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof r60) {
            r60 r60 = (r60) list;
            i = 0;
            while (i2 < size) {
                i += zzefl.k0(r60.h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzefl.k0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    static int m(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof r60) {
            r60 r60 = (r60) list;
            i = 0;
            while (i2 < size) {
                i += zzefl.f0(r60.h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzefl.f0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    static int n(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof r60) {
            r60 r60 = (r60) list;
            i = 0;
            while (i2 < size) {
                i += zzefl.g0(r60.h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzefl.g0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    static int o(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof r60) {
            r60 r60 = (r60) list;
            i = 0;
            while (i2 < size) {
                i += zzefl.h0(r60.h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzefl.h0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    static int p(List<?> list) {
        return list.size() << 2;
    }

    static int q(List<?> list) {
        return list.size() << 3;
    }

    static int r(List<?> list) {
        return list.size();
    }

    public static void s(int i, List<zzeer> list, j90 j90) throws IOException {
        if (list != null && !list.isEmpty()) {
            j90.w(i, list);
        }
    }

    public static void t(int i, List<?> list, j90 j90, z70 z70) throws IOException {
        if (list != null && !list.isEmpty()) {
            j90.K(i, list, z70);
        }
    }

    public static void u(int i, List<Float> list, j90 j90, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            j90.x(i, list, z);
        }
    }

    public static r80<?, ?> v() {
        return f3434b;
    }

    public static r80<?, ?> w() {
        return f3435c;
    }

    public static r80<?, ?> x() {
        return f3436d;
    }

    private static Class<?> y() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> z() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }
}
