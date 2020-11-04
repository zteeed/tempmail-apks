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
    private final Context f4002a;

    /* renamed from: b  reason: collision with root package name */
    private final zzbbd f4003b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdvf<zzbzl> f4004c;

    /* renamed from: d  reason: collision with root package name */
    private final zzdkk f4005d;

    /* renamed from: e  reason: collision with root package name */
    private final zzbfn f4006e;

    private fo(Context context, zzbbd zzbbd, zzdvf<zzbzl> zzdvf, zzdkk zzdkk, zzbfn zzbfn) {
        this.f4002a = context;
        this.f4003b = zzbbd;
        this.f4004c = zzdvf;
        this.f4005d = zzdkk;
        this.f4006e = zzbfn;
    }

    public final void a(boolean z, Context context) {
        this.f4006e.w0(true);
        zzq.zzkw();
        zzg zzg = new zzg(false, zzaye.K(this.f4002a), false, 0.0f, -1, z, this.f4005d.G, false);
        zzq.zzkv();
        zzcac k = ((zzbzl) zzdux.l(this.f4004c)).k();
        zzbfn zzbfn = this.f4006e;
        zzdkk zzdkk = this.f4005d;
        int i = zzdkk.I;
        zzbbd zzbbd = this.f4003b;
        String str = zzdkk.y;
        zzdko zzdko = zzdkk.p;
        Context context2 = context;
        zzn.zza(context2, new AdOverlayInfoParcel((zzuu) null, (zzo) k, (zzt) null, zzbfn, i, zzbbd, str, zzg, zzdko.f8328b, zzdko.f8327a), true);
    }
}
