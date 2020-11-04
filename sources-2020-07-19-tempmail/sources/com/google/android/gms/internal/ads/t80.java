package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class t80 extends r80<zzejc, zzejc> {
    t80() {
    }

    private static void t(Object obj, zzejc zzejc) {
        ((zzegb) obj).zzieg = zzejc;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Object obj, int i, long j) {
        ((zzejc) obj).k(i << 3, Long.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(Object obj, int i, zzeer zzeer) {
        ((zzejc) obj).k((i << 3) | 2, zzeer);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(Object obj, int i, Object obj2) {
        ((zzejc) obj).k((i << 3) | 3, (zzejc) obj2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d(Object obj, j90 j90) throws IOException {
        ((zzejc) obj).e(j90);
    }

    /* access modifiers changed from: package-private */
    public final boolean e(t70 t70) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void g(Object obj) {
        ((zzegb) obj).zzieg.f();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object h(Object obj) {
        zzejc zzejc = (zzejc) obj;
        zzejc.f();
        return zzejc;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ int i(Object obj) {
        return ((zzejc) obj).g();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object j(Object obj) {
        return ((zzegb) obj).zzieg;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object k(Object obj) {
        zzejc zzejc = ((zzegb) obj).zzieg;
        if (zzejc != zzejc.h()) {
            return zzejc;
        }
        zzejc i = zzejc.i();
        t(obj, i);
        return i;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ int l(Object obj) {
        return ((zzejc) obj).j();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void m(Object obj, int i, long j) {
        ((zzejc) obj).k((i << 3) | 1, Long.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object n() {
        return zzejc.i();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void o(Object obj, int i, int i2) {
        ((zzejc) obj).k((i << 3) | 5, Integer.valueOf(i2));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void p(Object obj, j90 j90) throws IOException {
        ((zzejc) obj).b(j90);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void q(Object obj, Object obj2) {
        t(obj, (zzejc) obj2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void r(Object obj, Object obj2) {
        t(obj, (zzejc) obj2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object s(Object obj, Object obj2) {
        zzejc zzejc = (zzejc) obj;
        zzejc zzejc2 = (zzejc) obj2;
        if (zzejc2.equals(zzejc.h())) {
            return zzejc;
        }
        return zzejc.a(zzejc, zzejc2);
    }
}
