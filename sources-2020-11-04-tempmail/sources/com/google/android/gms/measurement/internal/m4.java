package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
final class m4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzkq f10306b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzn f10307c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzgd f10308d;

    m4(zzgd zzgd, zzkq zzkq, zzn zzn) {
        this.f10308d = zzgd;
        this.f10306b = zzkq;
        this.f10307c = zzn;
    }

    public final void run() {
        this.f10308d.f10642b.e0();
        if (this.f10306b.u() == null) {
            this.f10308d.f10642b.M(this.f10306b, this.f10307c);
        } else {
            this.f10308d.f10642b.v(this.f10306b, this.f10307c);
        }
    }
}
