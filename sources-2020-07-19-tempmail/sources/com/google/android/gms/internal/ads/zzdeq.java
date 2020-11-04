package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdeq implements zzdec<zzden> {

    /* renamed from: a  reason: collision with root package name */
    private final zzaxd f7951a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f7952b;

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledExecutorService f7953c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f7954d;

    public zzdeq(zzaxd zzaxd, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f7951a = zzaxd;
        this.f7952b = context;
        this.f7953c = scheduledExecutorService;
        this.f7954d = executor;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzden a(Throwable th) {
        zzwg.a();
        return new zzden((AdvertisingIdClient.Info) null, zzbaq.m(this.f7952b));
    }

    public final zzdvf<zzden> b() {
        if (!((Boolean) zzwg.e().c(zzaav.s0)).booleanValue()) {
            return zzdux.a(new Exception("Did not ad Ad ID into query param."));
        }
        return zzduo.H(this.f7951a.c(this.f7952b)).D(lt.f4325a, this.f7954d).C(((Long) zzwg.e().c(zzaav.t0)).longValue(), TimeUnit.MILLISECONDS, this.f7953c).E(Throwable.class, new mt(this), this.f7954d);
    }
}
