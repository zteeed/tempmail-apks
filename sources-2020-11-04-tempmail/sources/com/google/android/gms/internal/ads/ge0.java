package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class ge0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzjj f4071b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzqe f4072c;

    ge0(zzqe zzqe, zzjj zzjj) {
        this.f4072c = zzqe;
        this.f4071b = zzjj;
    }

    public final void run() {
        this.f4071b.a();
        this.f4072c.f9211b.c(this.f4071b);
    }
}
