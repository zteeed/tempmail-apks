package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class l7 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ boolean f4453b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzbco f4454c;

    l7(zzbco zzbco, boolean z) {
        this.f4454c = zzbco;
        this.f4453b = z;
    }

    public final void run() {
        this.f4454c.v("windowVisibilityChanged", "isVisible", String.valueOf(this.f4453b));
    }
}
