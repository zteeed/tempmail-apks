package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class co implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzcim f3755b;

    private co(zzcim zzcim) {
        this.f3755b = zzcim;
    }

    static Runnable a(zzcim zzcim) {
        return new co(zzcim);
    }

    public final void run() {
        this.f3755b.a();
    }
}
