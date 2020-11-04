package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
final class g4 extends f4<zzig, zzig> {
    g4() {
    }

    private static void t(Object obj, zzig zzig) {
        ((zzfo) obj).zzb = zzig;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a() {
        return zzig.g();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object b(Object obj) {
        zzig zzig = (zzig) obj;
        zzig.i();
        return zzig;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(Object obj, int i, int i2) {
        ((zzig) obj).c((i << 3) | 5, Integer.valueOf(i2));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d(Object obj, int i, long j) {
        ((zzig) obj).c(i << 3, Long.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e(Object obj, int i, zzeg zzeg) {
        ((zzig) obj).c((i << 3) | 2, zzeg);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void f(Object obj, int i, Object obj2) {
        ((zzig) obj).c((i << 3) | 3, (zzig) obj2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void g(Object obj, w4 w4Var) throws IOException {
        ((zzig) obj).h(w4Var);
    }

    /* access modifiers changed from: package-private */
    public final /* bridge */ /* synthetic */ void h(Object obj, Object obj2) {
        t(obj, (zzig) obj2);
    }

    /* access modifiers changed from: package-private */
    public final boolean i(m3 m3Var) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object k(Object obj) {
        return ((zzfo) obj).zzb;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void l(Object obj, int i, long j) {
        ((zzig) obj).c((i << 3) | 1, Long.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void m(Object obj, w4 w4Var) throws IOException {
        ((zzig) obj).e(w4Var);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void n(Object obj, Object obj2) {
        t(obj, (zzig) obj2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object o(Object obj) {
        zzig zzig = ((zzfo) obj).zzb;
        if (zzig != zzig.a()) {
            return zzig;
        }
        zzig g = zzig.g();
        t(obj, g);
        return g;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object p(Object obj, Object obj2) {
        zzig zzig = (zzig) obj;
        zzig zzig2 = (zzig) obj2;
        if (zzig2.equals(zzig.a())) {
            return zzig;
        }
        return zzig.b(zzig, zzig2);
    }

    /* access modifiers changed from: package-private */
    public final void q(Object obj) {
        ((zzfo) obj).zzb.i();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ int r(Object obj) {
        return ((zzig) obj).j();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ int s(Object obj) {
        return ((zzig) obj).k();
    }
}
