package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class d8 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzbdi f3800b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f3801c;

    /* renamed from: d  reason: collision with root package name */
    private final long f3802d;

    d8(zzbdi zzbdi, boolean z, long j) {
        this.f3800b = zzbdi;
        this.f3801c = z;
        this.f3802d = j;
    }

    public final void run() {
        this.f3800b.F(this.f3801c, this.f3802d);
    }
}
