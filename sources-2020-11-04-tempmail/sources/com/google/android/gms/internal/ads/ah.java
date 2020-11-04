package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class ah implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzccs f3563b;

    private ah(zzccs zzccs) {
        this.f3563b = zzccs;
    }

    static Runnable a(zzccs zzccs) {
        return new ah(zzccs);
    }

    public final void run() {
        this.f3563b.e();
    }
}
