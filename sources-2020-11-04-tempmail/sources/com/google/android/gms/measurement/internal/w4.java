package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class w4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f10484b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzhc f10485c;

    w4(zzhc zzhc, long j) {
        this.f10485c = zzhc;
        this.f10484b = j;
    }

    public final void run() {
        this.f10485c.k().q.b(this.f10484b);
        this.f10485c.h().N().b("Session timeout duration set", Long.valueOf(this.f10484b));
    }
}
