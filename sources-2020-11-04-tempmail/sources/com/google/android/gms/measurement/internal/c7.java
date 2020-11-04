package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class c7 {

    /* renamed from: a  reason: collision with root package name */
    private f7 f10135a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzjv f10136b;

    c7(zzjv zzjv) {
        this.f10136b = zzjv;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f10136b.c();
        if (this.f10136b.l().t(zzaq.p0) && this.f10135a != null) {
            this.f10136b.f10682c.removeCallbacks(this.f10135a);
        }
        if (this.f10136b.l().t(zzaq.D0)) {
            this.f10136b.k().w.a(false);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(long j) {
        if (this.f10136b.l().t(zzaq.p0)) {
            this.f10135a = new f7(this, this.f10136b.n().a(), j);
            this.f10136b.f10682c.postDelayed(this.f10135a, 2000);
        }
    }
}
