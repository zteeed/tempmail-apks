package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class zk extends zzaih {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Object f5476b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f5477c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ long f5478d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzbbn f5479e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ zzclx f5480f;

    zk(zzclx zzclx, Object obj, String str, long j, zzbbn zzbbn) {
        this.f5480f = zzclx;
        this.f5476b = obj;
        this.f5477c = str;
        this.f5478d = j;
        this.f5479e = zzbbn;
    }

    public final void onInitializationFailed(String str) {
        synchronized (this.f5476b) {
            this.f5480f.h(this.f5477c, false, str, (int) (zzq.zzld().b() - this.f5478d));
            this.f5480f.k.f(this.f5477c, "error");
            this.f5479e.a(Boolean.FALSE);
        }
    }

    public final void onInitializationSucceeded() {
        synchronized (this.f5476b) {
            this.f5480f.h(this.f5477c, true, "", (int) (zzq.zzld().b() - this.f5478d));
            this.f5480f.k.e(this.f5477c);
            this.f5479e.a(Boolean.TRUE);
        }
    }
}
