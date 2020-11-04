package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
final class m4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzkq f10120b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzn f10121c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzgd f10122d;

    m4(zzgd zzgd, zzkq zzkq, zzn zzn) {
        this.f10122d = zzgd;
        this.f10120b = zzkq;
        this.f10121c = zzn;
    }

    public final void run() {
        this.f10122d.f10456b.e0();
        if (this.f10120b.u() == null) {
            this.f10122d.f10456b.M(this.f10120b, this.f10121c);
        } else {
            this.f10122d.f10456b.v(this.f10120b, this.f10121c);
        }
    }
}
