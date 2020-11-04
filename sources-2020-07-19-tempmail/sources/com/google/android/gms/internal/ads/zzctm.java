package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.zzbrx;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzctm extends zzctn<zzbnc> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbif f7500a;

    /* renamed from: b  reason: collision with root package name */
    private final zzbrx.zza f7501b;

    /* renamed from: c  reason: collision with root package name */
    private final zzcvw f7502c;

    /* renamed from: d  reason: collision with root package name */
    private final zzbxa f7503d;

    /* renamed from: e  reason: collision with root package name */
    private final zzcay f7504e;

    /* renamed from: f  reason: collision with root package name */
    private final zzbus f7505f;
    private final ViewGroup g;

    public zzctm(zzbif zzbif, zzbrx.zza zza, zzcvw zzcvw, zzbxa zzbxa, zzcay zzcay, zzbus zzbus, ViewGroup viewGroup) {
        this.f7500a = zzbif;
        this.f7501b = zza;
        this.f7502c = zzcvw;
        this.f7503d = zzbxa;
        this.f7504e = zzcay;
        this.f7505f = zzbus;
        this.g = viewGroup;
    }

    /* access modifiers changed from: protected */
    public final zzdvf<zzbnc> c(zzdla zzdla, Bundle bundle) {
        zzbob l = this.f7500a.l();
        zzbrx.zza zza = this.f7501b;
        zza.c(zzdla);
        zza.j(bundle);
        return l.d(zza.d()).z(this.f7503d).a(this.f7502c).c(this.f7504e).s(new zzbou(this.f7505f)).n(new zzbnb(this.g)).r().c().g();
    }
}
