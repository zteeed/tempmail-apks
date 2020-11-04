package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.zzq;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcml {

    /* renamed from: a  reason: collision with root package name */
    private final zzdvi f7428a;

    /* renamed from: b  reason: collision with root package name */
    private final zzdvi f7429b;

    /* renamed from: c  reason: collision with root package name */
    private final zzcnw f7430c;

    /* renamed from: d  reason: collision with root package name */
    private final zzeku<zzcoy> f7431d;

    public zzcml(zzdvi zzdvi, zzdvi zzdvi2, zzcnw zzcnw, zzeku<zzcoy> zzeku) {
        this.f7428a = zzdvi;
        this.f7429b = zzdvi2;
        this.f7430c = zzcnw;
        this.f7431d = zzeku;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf a(zzasm zzasm, int i, zzcop zzcop) throws Exception {
        return this.f7431d.get().j7(zzasm, i);
    }

    public final zzdvf<InputStream> b(zzasm zzasm) {
        zzdvf<V> zzdvf;
        String str = zzasm.f6095e;
        zzq.zzkw();
        if (zzaye.Z(str)) {
            zzdvf = zzdux.a(new zzcop(zzdls.f8363a));
        } else {
            zzdvf = zzdux.k(this.f7428a.f(new bl(this, zzasm)), ExecutionException.class, dl.f3835a, this.f7429b);
        }
        return zzdux.k(zzdvf, zzcop.class, new cl(this, zzasm, Binder.getCallingUid()), this.f7429b);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ InputStream c(zzasm zzasm) throws Exception {
        return this.f7430c.b(zzasm).get((long) ((Integer) zzwg.e().c(zzaav.y2)).intValue(), TimeUnit.SECONDS);
    }
}
