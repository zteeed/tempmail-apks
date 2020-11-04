package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class d8 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzbdi f3617b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f3618c;

    /* renamed from: d  reason: collision with root package name */
    private final long f3619d;

    d8(zzbdi zzbdi, boolean z, long j) {
        this.f3617b = zzbdi;
        this.f3618c = z;
        this.f3619d = j;
    }

    public final void run() {
        this.f3617b.F(this.f3618c, this.f3619d);
    }
}
