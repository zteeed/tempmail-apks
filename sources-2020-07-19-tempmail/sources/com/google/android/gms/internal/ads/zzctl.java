package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbrx;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzctl extends zzctn<zzbph> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbif f7496a;

    /* renamed from: b  reason: collision with root package name */
    private final zzcay f7497b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbrx.zza f7498c;

    /* renamed from: d  reason: collision with root package name */
    private final zzbxa f7499d;

    public zzctl(zzbif zzbif, zzcay zzcay, zzbrx.zza zza, zzbxa zzbxa) {
        this.f7496a = zzbif;
        this.f7497b = zzcay;
        this.f7498c = zza;
        this.f7499d = zzbxa;
    }

    /* access modifiers changed from: protected */
    public final zzdvf<zzbph> c(zzdla zzdla, Bundle bundle) {
        zzcbf p = this.f7496a.p();
        zzbrx.zza zza = this.f7498c;
        zza.c(zzdla);
        zza.j(bundle);
        return p.h(zza.d()).j(this.f7499d).f(this.f7497b).l().c().g();
    }
}
