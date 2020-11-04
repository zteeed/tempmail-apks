package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class l7 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ boolean f4270b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzbco f4271c;

    l7(zzbco zzbco, boolean z) {
        this.f4271c = zzbco;
        this.f4270b = z;
    }

    public final void run() {
        this.f4271c.v("windowVisibilityChanged", "isVisible", String.valueOf(this.f4270b));
    }
}
