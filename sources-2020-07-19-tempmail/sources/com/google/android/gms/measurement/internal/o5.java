package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class o5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f10153b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzhc f10154c;

    o5(zzhc zzhc, long j) {
        this.f10154c = zzhc;
        this.f10153b = j;
    }

    public final void run() {
        this.f10154c.k().p.b(this.f10153b);
        this.f10154c.h().N().b("Minimum session duration set", Long.valueOf(this.f10153b));
    }
}
