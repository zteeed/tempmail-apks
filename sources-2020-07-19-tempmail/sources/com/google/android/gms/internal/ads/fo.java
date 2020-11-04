package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzt;
import com.google.android.gms.ads.internal.zzg;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class fo implements zzcam {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3819a;

    /* renamed from: b  reason: collision with root package name */
    private final zzbbd f3820b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdvf<zzbzl> f3821c;

    /* renamed from: d  reason: collision with root package name */
    private final zzdkk f3822d;

    /* renamed from: e  reason: collision with root package name */
    private final zzbfn f3823e;

    private fo(Context context, zzbbd zzbbd, zzdvf<zzbzl> zzdvf, zzdkk zzdkk, zzbfn zzbfn) {
        this.f3819a = context;
        this.f3820b = zzbbd;
        this.f3821c = zzdvf;
        this.f3822d = zzdkk;
        this.f3823e = zzbfn;
    }

    public final void a(boolean z, Context context) {
        this.f3823e.w0(true);
        zzq.zzkw();
        zzg zzg = new zzg(false, zzaye.K(this.f3819a), false, 0.0f, -1, z, this.f3822d.G, false);
        zzq.zzkv();
        zzcac k = ((zzbzl) zzdux.l(this.f3821c)).k();
        zzbfn zzbfn = this.f3823e;
        zzdkk zzdkk = this.f3822d;
        int i = zzdkk.I;
        zzbbd zzbbd = this.f3820b;
        String str = zzdkk.y;
        zzdko zzdko = zzdkk.p;
        Context context2 = context;
        zzn.zza(context2, new AdOverlayInfoParcel((zzuu) null, (zzo) k, (zzt) null, zzbfn, i, zzbbd, str, zzg, zzdko.f8145b, zzdko.f8144a), true);
    }
}
