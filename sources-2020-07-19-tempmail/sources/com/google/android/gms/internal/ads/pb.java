package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class pb implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzbkg f4631b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f4632c;

    pb(zzbkg zzbkg, Runnable runnable) {
        this.f4631b = zzbkg;
        this.f4632c = runnable;
    }

    public final void run() {
        this.f4631b.z6(this.f4632c);
    }
}
