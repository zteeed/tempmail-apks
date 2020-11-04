package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class d1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f3589b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzajw f3590c;

    d1(zzajw zzajw, String str) {
        this.f3590c = zzajw;
        this.f3589b = str;
    }

    public final void run() {
        this.f3590c.f5751b.loadData(this.f3589b, "text/html", "UTF-8");
    }
}
