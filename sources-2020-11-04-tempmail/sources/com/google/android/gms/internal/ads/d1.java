package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class d1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f3772b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzajw f3773c;

    d1(zzajw zzajw, String str) {
        this.f3773c = zzajw;
        this.f3772b = str;
    }

    public final void run() {
        this.f3773c.f5934b.loadData(this.f3772b, "text/html", "UTF-8");
    }
}
