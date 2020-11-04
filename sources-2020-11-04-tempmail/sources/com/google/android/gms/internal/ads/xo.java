package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class xo implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzcim f5506b;

    private xo(zzcim zzcim) {
        this.f5506b = zzcim;
    }

    static Runnable a(zzcim zzcim) {
        return new xo(zzcim);
    }

    public final void run() {
        this.f5506b.a();
    }
}
