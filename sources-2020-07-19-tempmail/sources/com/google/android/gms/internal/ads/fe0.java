package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class fe0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f3793b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f3794c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ int f3795d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ float f3796e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ zzqe f3797f;

    fe0(zzqe zzqe, int i, int i2, int i3, float f2) {
        this.f3797f = zzqe;
        this.f3793b = i;
        this.f3794c = i2;
        this.f3795d = i3;
        this.f3796e = f2;
    }

    public final void run() {
        this.f3797f.f9028b.m(this.f3793b, this.f3794c, this.f3795d, this.f3796e);
    }
}
