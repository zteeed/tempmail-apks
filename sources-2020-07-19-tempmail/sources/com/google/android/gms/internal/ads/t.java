package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class t implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f4938b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f4939c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzaa f4940d;

    t(zzaa zzaa, String str, long j) {
        this.f4940d = zzaa;
        this.f4938b = str;
        this.f4939c = j;
    }

    public final void run() {
        this.f4940d.f5508b.a(this.f4938b, this.f4939c);
        this.f4940d.f5508b.b(this.f4940d.toString());
    }
}
