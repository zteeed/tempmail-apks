package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class c7 {

    /* renamed from: a  reason: collision with root package name */
    private f7 f9949a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzjv f9950b;

    c7(zzjv zzjv) {
        this.f9950b = zzjv;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f9950b.c();
        if (this.f9950b.l().t(zzaq.p0) && this.f9949a != null) {
            this.f9950b.f10496c.removeCallbacks(this.f9949a);
        }
        if (this.f9950b.l().t(zzaq.D0)) {
            this.f9950b.k().w.a(false);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(long j) {
        if (this.f9950b.l().t(zzaq.p0)) {
            this.f9949a = new f7(this, this.f9950b.n().a(), j);
            this.f9950b.f10496c.postDelayed(this.f9949a, 2000);
        }
    }
}
