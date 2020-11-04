package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class kg implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzbfn f4401b;

    private kg(zzbfn zzbfn) {
        this.f4401b = zzbfn;
    }

    static Runnable a(zzbfn zzbfn) {
        return new kg(zzbfn);
    }

    public final void run() {
        this.f4401b.destroy();
    }
}
