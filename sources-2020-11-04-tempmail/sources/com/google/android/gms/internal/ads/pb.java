package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class pb implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzbkg f4814b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f4815c;

    pb(zzbkg zzbkg, Runnable runnable) {
        this.f4814b = zzbkg;
        this.f4815c = runnable;
    }

    public final void run() {
        this.f4814b.e7(this.f4815c);
    }
}
