package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.zzbrx;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzctm extends zzctn<zzbnc> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbif f7683a;

    /* renamed from: b  reason: collision with root package name */
    private final zzbrx.zza f7684b;

    /* renamed from: c  reason: collision with root package name */
    private final zzcvw f7685c;

    /* renamed from: d  reason: collision with root package name */
    private final zzbxa f7686d;

    /* renamed from: e  reason: collision with root package name */
    private final zzcay f7687e;

    /* renamed from: f  reason: collision with root package name */
    private final zzbus f7688f;
    private final ViewGroup g;

    public zzctm(zzbif zzbif, zzbrx.zza zza, zzcvw zzcvw, zzbxa zzbxa, zzcay zzcay, zzbus zzbus, ViewGroup viewGroup) {
        this.f7683a = zzbif;
        this.f7684b = zza;
        this.f7685c = zzcvw;
        this.f7686d = zzbxa;
        this.f7687e = zzcay;
        this.f7688f = zzbus;
        this.g = viewGroup;
    }

    /* access modifiers changed from: protected */
    public final zzdvf<zzbnc> c(zzdla zzdla, Bundle bundle) {
        zzbob l = this.f7683a.l();
        zzbrx.zza zza = this.f7684b;
        zza.c(zzdla);
        zza.j(bundle);
        return l.d(zza.d()).z(this.f7686d).a(this.f7685c).c(this.f7687e).s(new zzbou(this.f7688f)).n(new zzbnb(this.g)).r().c().g();
    }
}
