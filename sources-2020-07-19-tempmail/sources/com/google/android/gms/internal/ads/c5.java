package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class c5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzaxr f3518b;

    c5(zzaxr zzaxr) {
        this.f3518b = zzaxr;
    }

    public final void run() {
        Thread unused = this.f3518b.thread = Thread.currentThread();
        this.f3518b.zzut();
    }
}
