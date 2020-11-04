package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class g1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f4025b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzajw f4026c;

    g1(zzajw zzajw, String str) {
        this.f4026c = zzajw;
        this.f4025b = str;
    }

    public final void run() {
        this.f4026c.f5934b.loadData(this.f4025b, "text/html", "UTF-8");
    }
}
