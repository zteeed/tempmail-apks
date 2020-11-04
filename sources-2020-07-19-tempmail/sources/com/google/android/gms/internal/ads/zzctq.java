package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbrx;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzctq extends zzctn<zzchj> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbif f7516a;

    /* renamed from: b  reason: collision with root package name */
    private final zzbrx.zza f7517b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbxa f7518c;

    public zzctq(zzbif zzbif, zzbrx.zza zza, zzbxa zzbxa) {
        this.f7516a = zzbif;
        this.f7517b = zza;
        this.f7518c = zzbxa;
    }

    /* access modifiers changed from: protected */
    public final zzdvf<zzchj> c(zzdla zzdla, Bundle bundle) {
        zzchp q = this.f7516a.q();
        zzbrx.zza zza = this.f7517b;
        zza.c(zzdla);
        zza.j(bundle);
        return q.v(zza.d()).u(this.f7518c).o().a().g();
    }
}
