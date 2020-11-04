package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class gj implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzbfn f4080b;

    private gj(zzbfn zzbfn) {
        this.f4080b = zzbfn;
    }

    static Runnable a(zzbfn zzbfn) {
        return new gj(zzbfn);
    }

    public final void run() {
        this.f4080b.destroy();
    }
}
