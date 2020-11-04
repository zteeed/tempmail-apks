package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class w4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f10298b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzhc f10299c;

    w4(zzhc zzhc, long j) {
        this.f10299c = zzhc;
        this.f10298b = j;
    }

    public final void run() {
        this.f10299c.k().q.b(this.f10298b);
        this.f10299c.h().N().b("Session timeout duration set", Long.valueOf(this.f10298b));
    }
}
