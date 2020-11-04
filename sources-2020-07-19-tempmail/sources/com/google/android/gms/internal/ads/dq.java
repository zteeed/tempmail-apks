package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class dq implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final cq f3663b;

    dq(cq cqVar) {
        this.f3663b = cqVar;
    }

    public final void run() {
        this.f3663b.f3574b.g.onAdLoaded();
    }
}
