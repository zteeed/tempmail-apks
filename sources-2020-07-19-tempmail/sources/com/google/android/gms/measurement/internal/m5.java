package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class m5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ boolean f10123b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzhc f10124c;

    m5(zzhc zzhc, boolean z) {
        this.f10124c = zzhc;
        this.f10123b = z;
    }

    public final void run() {
        boolean p = this.f10124c.f10171a.p();
        boolean o = this.f10124c.f10171a.o();
        this.f10124c.f10171a.l(this.f10123b);
        if (o == this.f10123b) {
            this.f10124c.f10171a.h().O().b("Default data collection state already set to", Boolean.valueOf(this.f10123b));
        }
        if (this.f10124c.f10171a.p() == p || this.f10124c.f10171a.p() != this.f10124c.f10171a.o()) {
            this.f10124c.f10171a.h().L().c("Default data collection is different than actual status", Boolean.valueOf(this.f10123b), Boolean.valueOf(p));
        }
        this.f10124c.j0();
    }
}
