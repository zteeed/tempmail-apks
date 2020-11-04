package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class f1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f3754b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzajw f3755c;

    f1(zzajw zzajw, String str) {
        this.f3755c = zzajw;
        this.f3754b = str;
    }

    public final void run() {
        this.f3755c.f5751b.loadUrl(this.f3754b);
    }
}
