package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class ge0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzjj f3888b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzqe f3889c;

    ge0(zzqe zzqe, zzjj zzjj) {
        this.f3889c = zzqe;
        this.f3888b = zzjj;
    }

    public final void run() {
        this.f3888b.a();
        this.f3889c.f9028b.c(this.f3888b);
    }
}
