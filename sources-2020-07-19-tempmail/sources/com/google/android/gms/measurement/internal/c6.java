package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class c6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ boolean f9945b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzkq f9946c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzn f9947d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzir f9948e;

    c6(zzir zzir, boolean z, zzkq zzkq, zzn zzn) {
        this.f9948e = zzir;
        this.f9945b = z;
        this.f9946c = zzkq;
        this.f9947d = zzn;
    }

    public final void run() {
        zzem l0 = this.f9948e.f10489d;
        if (l0 == null) {
            this.f9948e.h().G().a("Discarding data. Failed to set user property");
            return;
        }
        this.f9948e.N(l0, this.f9945b ? null : this.f9946c, this.f9947d);
        this.f9948e.f0();
    }
}
