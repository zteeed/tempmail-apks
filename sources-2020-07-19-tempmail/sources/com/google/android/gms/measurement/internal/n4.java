package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
final class n4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f10135b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f10136c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f10137d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ long f10138e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ zzgd f10139f;

    n4(zzgd zzgd, String str, String str2, String str3, long j) {
        this.f10139f = zzgd;
        this.f10135b = str;
        this.f10136c = str2;
        this.f10137d = str3;
        this.f10138e = j;
    }

    public final void run() {
        String str = this.f10135b;
        if (str == null) {
            this.f10139f.f10456b.g0().O().S(this.f10136c, (zzij) null);
            return;
        }
        this.f10139f.f10456b.g0().O().S(this.f10136c, new zzij(this.f10137d, str, this.f10138e));
    }
}
