package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class fe0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f3976b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f3977c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ int f3978d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ float f3979e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ zzqe f3980f;

    fe0(zzqe zzqe, int i, int i2, int i3, float f2) {
        this.f3980f = zzqe;
        this.f3976b = i;
        this.f3977c = i2;
        this.f3978d = i3;
        this.f3979e = f2;
    }

    public final void run() {
        this.f3980f.f9211b.m(this.f3976b, this.f3977c, this.f3978d, this.f3979e);
    }
}
