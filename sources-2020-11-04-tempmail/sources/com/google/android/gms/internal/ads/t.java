package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class t implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f5121b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f5122c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzaa f5123d;

    t(zzaa zzaa, String str, long j) {
        this.f5123d = zzaa;
        this.f5121b = str;
        this.f5122c = j;
    }

    public final void run() {
        this.f5123d.f5691b.a(this.f5121b, this.f5122c);
        this.f5123d.f5691b.b(this.f5123d.toString());
    }
}
