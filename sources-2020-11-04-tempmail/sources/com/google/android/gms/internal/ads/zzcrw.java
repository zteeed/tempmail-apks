package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcrw implements zzcqt<zzbnc> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbny f7607a;

    /* renamed from: b  reason: collision with root package name */
    private final zzcrc f7608b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdvi f7609c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final zzbso f7610d;

    /* renamed from: e  reason: collision with root package name */
    private final ScheduledExecutorService f7611e;

    public zzcrw(zzbny zzbny, zzcrc zzcrc, zzbso zzbso, ScheduledExecutorService scheduledExecutorService, zzdvi zzdvi) {
        this.f7607a = zzbny;
        this.f7608b = zzcrc;
        this.f7610d = zzbso;
        this.f7611e = scheduledExecutorService;
        this.f7609c = zzdvi;
    }

    public final zzdvf<zzbnc> a(zzdkw zzdkw, zzdkk zzdkk) {
        return this.f7609c.f(new yn(this, zzdkw, zzdkk));
    }

    public final boolean b(zzdkw zzdkw, zzdkk zzdkk) {
        return zzdkw.f8344a.f8332a.a() != null && this.f7608b.b(zzdkw, zzdkk);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzbnc d(zzdkw zzdkw, zzdkk zzdkk) throws Exception {
        return this.f7607a.b(new zzbpr(zzdkw, zzdkk, (String) null), new zzbom(zzdkw.f8344a.f8332a.a(), new xn(this, zzdkw, zzdkk))).a();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e(zzdkw zzdkw, zzdkk zzdkk) {
        zzdux.f(zzdux.d(this.f7608b.a(zzdkw, zzdkk), (long) zzdkk.J, TimeUnit.SECONDS, this.f7611e), new zn(this), this.f7609c);
    }
}
