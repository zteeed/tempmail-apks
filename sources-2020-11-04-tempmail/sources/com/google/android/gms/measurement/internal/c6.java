package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class c6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ boolean f10131b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzkq f10132c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzn f10133d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzir f10134e;

    c6(zzir zzir, boolean z, zzkq zzkq, zzn zzn) {
        this.f10134e = zzir;
        this.f10131b = z;
        this.f10132c = zzkq;
        this.f10133d = zzn;
    }

    public final void run() {
        zzem l0 = this.f10134e.f10675d;
        if (l0 == null) {
            this.f10134e.h().G().a("Discarding data. Failed to set user property");
            return;
        }
        this.f10134e.N(l0, this.f10131b ? null : this.f10132c, this.f10133d);
        this.f10134e.f0();
    }
}
