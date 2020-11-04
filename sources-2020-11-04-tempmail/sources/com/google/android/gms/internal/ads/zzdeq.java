package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdeq implements zzdec<zzden> {

    /* renamed from: a  reason: collision with root package name */
    private final zzaxd f8134a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f8135b;

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledExecutorService f8136c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f8137d;

    public zzdeq(zzaxd zzaxd, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f8134a = zzaxd;
        this.f8135b = context;
        this.f8136c = scheduledExecutorService;
        this.f8137d = executor;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzden a(Throwable th) {
        zzwg.a();
        return new zzden((AdvertisingIdClient.Info) null, zzbaq.m(this.f8135b));
    }

    public final zzdvf<zzden> b() {
        if (!((Boolean) zzwg.e().c(zzaav.s0)).booleanValue()) {
            return zzdux.a(new Exception("Did not ad Ad ID into query param."));
        }
        return zzduo.H(this.f8134a.c(this.f8135b)).D(lt.f4508a, this.f8137d).C(((Long) zzwg.e().c(zzaav.t0)).longValue(), TimeUnit.MILLISECONDS, this.f8136c).E(Throwable.class, new mt(this), this.f8137d);
    }
}
