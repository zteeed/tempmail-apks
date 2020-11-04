package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class zk extends zzaih {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Object f5659b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f5660c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ long f5661d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzbbn f5662e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ zzclx f5663f;

    zk(zzclx zzclx, Object obj, String str, long j, zzbbn zzbbn) {
        this.f5663f = zzclx;
        this.f5659b = obj;
        this.f5660c = str;
        this.f5661d = j;
        this.f5662e = zzbbn;
    }

    public final void onInitializationFailed(String str) {
        synchronized (this.f5659b) {
            this.f5663f.h(this.f5660c, false, str, (int) (zzq.zzld().b() - this.f5661d));
            this.f5663f.k.f(this.f5660c, "error");
            this.f5662e.a(Boolean.FALSE);
        }
    }

    public final void onInitializationSucceeded() {
        synchronized (this.f5659b) {
            this.f5663f.h(this.f5660c, true, "", (int) (zzq.zzld().b() - this.f5661d));
            this.f5663f.k.e(this.f5660c);
            this.f5662e.a(Boolean.TRUE);
        }
    }
}
