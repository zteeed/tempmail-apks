package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class y8 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzbdb f5544b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f5545c;

    /* renamed from: d  reason: collision with root package name */
    private final long f5546d;

    y8(zzbdb zzbdb, boolean z, long j) {
        this.f5544b = zzbdb;
        this.f5545c = z;
        this.f5546d = j;
    }

    public final void run() {
        this.f5544b.V(this.f5545c, this.f5546d);
    }
}
