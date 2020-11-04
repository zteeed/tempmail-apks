package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
final class q4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzw f10191b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzn f10192c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzgd f10193d;

    q4(zzgd zzgd, zzw zzw, zzn zzn) {
        this.f10193d = zzgd;
        this.f10191b = zzw;
        this.f10192c = zzn;
    }

    public final void run() {
        this.f10193d.f10456b.e0();
        if (this.f10191b.f10531d.u() == null) {
            this.f10193d.f10456b.P(this.f10191b, this.f10192c);
        } else {
            this.f10193d.f10456b.y(this.f10191b, this.f10192c);
        }
    }
}
