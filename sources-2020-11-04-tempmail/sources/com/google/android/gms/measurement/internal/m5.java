package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class m5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ boolean f10309b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzhc f10310c;

    m5(zzhc zzhc, boolean z) {
        this.f10310c = zzhc;
        this.f10309b = z;
    }

    public final void run() {
        boolean p = this.f10310c.f10357a.p();
        boolean o = this.f10310c.f10357a.o();
        this.f10310c.f10357a.l(this.f10309b);
        if (o == this.f10309b) {
            this.f10310c.f10357a.h().O().b("Default data collection state already set to", Boolean.valueOf(this.f10309b));
        }
        if (this.f10310c.f10357a.p() == p || this.f10310c.f10357a.p() != this.f10310c.f10357a.o()) {
            this.f10310c.f10357a.h().L().c("Default data collection is different than actual status", Boolean.valueOf(this.f10309b), Boolean.valueOf(p));
        }
        this.f10310c.j0();
    }
}
