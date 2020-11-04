package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.zzq;
import java.io.InputStream;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcnf {

    /* renamed from: a  reason: collision with root package name */
    private final ScheduledExecutorService f7453a;

    /* renamed from: b  reason: collision with root package name */
    private final zzdvi f7454b;

    /* renamed from: c  reason: collision with root package name */
    private final zzcoa f7455c;

    /* renamed from: d  reason: collision with root package name */
    private final zzeku<zzcoy> f7456d;

    public zzcnf(ScheduledExecutorService scheduledExecutorService, zzdvi zzdvi, zzcoa zzcoa, zzeku<zzcoy> zzeku) {
        this.f7453a = scheduledExecutorService;
        this.f7454b = zzdvi;
        this.f7455c = zzcoa;
        this.f7456d = zzeku;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf a(zzasm zzasm, int i, Throwable th) throws Exception {
        return this.f7456d.get().l7(zzasm, i);
    }

    public final zzdvf<InputStream> b(zzasm zzasm) {
        zzdvf<InputStream> zzdvf;
        String str = zzasm.f6095e;
        zzq.zzkw();
        if (zzaye.Z(str)) {
            zzdvf = zzdux.a(new zzcop(zzdls.f8363a));
        } else {
            zzdvf = this.f7455c.b(zzasm);
        }
        int callingUid = Binder.getCallingUid();
        return zzduo.H(zzdvf).C((long) ((Integer) zzwg.e().c(zzaav.y2)).intValue(), TimeUnit.SECONDS, this.f7453a).F(Throwable.class, new jl(this, zzasm, callingUid), this.f7454b);
    }
}
