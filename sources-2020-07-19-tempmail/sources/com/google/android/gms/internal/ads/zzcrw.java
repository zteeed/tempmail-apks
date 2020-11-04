package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcrw implements zzcqt<zzbnc> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbny f7424a;

    /* renamed from: b  reason: collision with root package name */
    private final zzcrc f7425b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdvi f7426c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final zzbso f7427d;

    /* renamed from: e  reason: collision with root package name */
    private final ScheduledExecutorService f7428e;

    public zzcrw(zzbny zzbny, zzcrc zzcrc, zzbso zzbso, ScheduledExecutorService scheduledExecutorService, zzdvi zzdvi) {
        this.f7424a = zzbny;
        this.f7425b = zzcrc;
        this.f7427d = zzbso;
        this.f7428e = scheduledExecutorService;
        this.f7426c = zzdvi;
    }

    public final zzdvf<zzbnc> a(zzdkw zzdkw, zzdkk zzdkk) {
        return this.f7426c.f(new yn(this, zzdkw, zzdkk));
    }

    public final boolean b(zzdkw zzdkw, zzdkk zzdkk) {
        return zzdkw.f8161a.f8149a.a() != null && this.f7425b.b(zzdkw, zzdkk);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzbnc d(zzdkw zzdkw, zzdkk zzdkk) throws Exception {
        return this.f7424a.b(new zzbpr(zzdkw, zzdkk, (String) null), new zzbom(zzdkw.f8161a.f8149a.a(), new xn(this, zzdkw, zzdkk))).a();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e(zzdkw zzdkw, zzdkk zzdkk) {
        zzdux.f(zzdux.d(this.f7425b.a(zzdkw, zzdkk), (long) zzdkk.J, TimeUnit.SECONDS, this.f7428e), new zn(this), this.f7426c);
    }
}
