package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class sd0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzaa f5084b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzm f5085c;

    sd0(zzm zzm, zzaa zzaa) {
        this.f5085c = zzm;
        this.f5084b = zzaa;
    }

    public final void run() {
        try {
            this.f5085c.f9045c.put(this.f5084b);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
