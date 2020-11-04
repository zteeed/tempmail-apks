package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class m7 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzbco f4538b;

    m7(zzbco zzbco) {
        this.f4538b = zzbco;
    }

    public final void run() {
        this.f4538b.v("surfaceDestroyed", new String[0]);
    }
}
