package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class g1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f3842b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzajw f3843c;

    g1(zzajw zzajw, String str) {
        this.f3843c = zzajw;
        this.f3842b = str;
    }

    public final void run() {
        this.f3843c.f5751b.loadData(this.f3842b, "text/html", "UTF-8");
    }
}
