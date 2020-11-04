package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
final class q4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzw f10377b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzn f10378c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzgd f10379d;

    q4(zzgd zzgd, zzw zzw, zzn zzn) {
        this.f10379d = zzgd;
        this.f10377b = zzw;
        this.f10378c = zzn;
    }

    public final void run() {
        this.f10379d.f10642b.e0();
        if (this.f10377b.f10717d.u() == null) {
            this.f10379d.f10642b.P(this.f10377b, this.f10378c);
        } else {
            this.f10379d.f10642b.y(this.f10377b, this.f10378c);
        }
    }
}
