package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class c5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzaxr f3701b;

    c5(zzaxr zzaxr) {
        this.f3701b = zzaxr;
    }

    public final void run() {
        Thread unused = this.f3701b.thread = Thread.currentThread();
        this.f3701b.zzut();
    }
}
