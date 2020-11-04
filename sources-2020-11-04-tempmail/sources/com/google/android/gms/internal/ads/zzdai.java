package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdai implements zzdec<zzdaf> {

    /* renamed from: a  reason: collision with root package name */
    private final ScheduledExecutorService f7965a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f7966b;

    public zzdai(Context context, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f7965a = scheduledExecutorService;
        this.f7966b = executor;
    }

    public final zzdvf<zzdaf> b() {
        if (!((Boolean) zzwg.e().c(zzaav.g3)).booleanValue()) {
            return zzdux.g(null);
        }
        zzbbn zzbbn = new zzbbn();
        try {
            new tr(zzbbn).a(false);
        } catch (Throwable unused) {
            zzbba.g("ArCoreApk is not ready.");
            zzbbn.a(Boolean.FALSE);
        }
        return zzdux.k(zzdux.i(zzdux.d(zzbbn, 200, TimeUnit.MILLISECONDS, this.f7965a), new vr(this), this.f7966b), Throwable.class, ur.f5261a, this.f7966b);
    }
}
