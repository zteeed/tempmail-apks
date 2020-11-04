package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class sd0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzaa f4901b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzm f4902c;

    sd0(zzm zzm, zzaa zzaa) {
        this.f4902c = zzm;
        this.f4901b = zzaa;
    }

    public final void run() {
        try {
            this.f4902c.f8862c.put(this.f4901b);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
