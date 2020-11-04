package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcyu implements zzduh<zzasm, zzcyv> {

    /* renamed from: a  reason: collision with root package name */
    private Executor f7712a;

    /* renamed from: b  reason: collision with root package name */
    private zzcnf f7713b;

    public zzcyu(Executor executor, zzcnf zzcnf) {
        this.f7712a = executor;
        this.f7713b = zzcnf;
    }

    public final /* synthetic */ zzdvf zzf(Object obj) throws Exception {
        zzasm zzasm = (zzasm) obj;
        return zzdux.j(this.f7713b.b(zzasm), new cr(zzasm), this.f7712a);
    }
}
