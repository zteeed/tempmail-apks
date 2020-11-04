package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.zzq;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcml {

    /* renamed from: a  reason: collision with root package name */
    private final zzdvi f7245a;

    /* renamed from: b  reason: collision with root package name */
    private final zzdvi f7246b;

    /* renamed from: c  reason: collision with root package name */
    private final zzcnw f7247c;

    /* renamed from: d  reason: collision with root package name */
    private final zzeku<zzcoy> f7248d;

    public zzcml(zzdvi zzdvi, zzdvi zzdvi2, zzcnw zzcnw, zzeku<zzcoy> zzeku) {
        this.f7245a = zzdvi;
        this.f7246b = zzdvi2;
        this.f7247c = zzcnw;
        this.f7248d = zzeku;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf a(zzasm zzasm, int i, zzcop zzcop) throws Exception {
        return this.f7248d.get().E6(zzasm, i);
    }

    public final zzdvf<InputStream> b(zzasm zzasm) {
        zzdvf<V> zzdvf;
        String str = zzasm.f5912e;
        zzq.zzkw();
        if (zzaye.Z(str)) {
            zzdvf = zzdux.a(new zzcop(zzdls.f8180a));
        } else {
            zzdvf = zzdux.k(this.f7245a.f(new bl(this, zzasm)), ExecutionException.class, dl.f3652a, this.f7246b);
        }
        return zzdux.k(zzdvf, zzcop.class, new cl(this, zzasm, Binder.getCallingUid()), this.f7246b);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ InputStream c(zzasm zzasm) throws Exception {
        return this.f7247c.b(zzasm).get((long) ((Integer) zzwg.e().c(zzaav.y2)).intValue(), TimeUnit.SECONDS);
    }
}
