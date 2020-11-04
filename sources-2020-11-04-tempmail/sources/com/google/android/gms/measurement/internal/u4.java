package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final /* synthetic */ class u4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzhc f10454b;

    u4(zzhc zzhc) {
        this.f10454b = zzhc;
    }

    public final void run() {
        zzhc zzhc = this.f10454b;
        zzhc.c();
        if (zzhc.k().x.b()) {
            zzhc.h().N().a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long a2 = zzhc.k().y.a();
        zzhc.k().y.b(1 + a2);
        if (a2 >= 5) {
            zzhc.h().J().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            zzhc.k().x.a(true);
            return;
        }
        zzhc.f10357a.v();
    }
}
