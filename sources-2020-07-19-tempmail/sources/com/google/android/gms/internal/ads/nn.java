package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class nn implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzbfn f4499b;

    private nn(zzbfn zzbfn) {
        this.f4499b = zzbfn;
    }

    static Runnable a(zzbfn zzbfn) {
        return new nn(zzbfn);
    }

    public final void run() {
        this.f4499b.x();
    }
}
