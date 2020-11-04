package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzt;
import com.google.android.gms.ads.internal.zzg;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class bp implements zzcam {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3669a;

    /* renamed from: b  reason: collision with root package name */
    private final zzchw f3670b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdla f3671c;

    /* renamed from: d  reason: collision with root package name */
    private final zzbbd f3672d;

    /* renamed from: e  reason: collision with root package name */
    private final zzdkk f3673e;

    /* renamed from: f  reason: collision with root package name */
    private final zzdvf<zzchl> f3674f;
    private final zzbfn g;

    private bp(Context context, zzchw zzchw, zzdla zzdla, zzbbd zzbbd, zzdkk zzdkk, zzdvf<zzchl> zzdvf, zzbfn zzbfn) {
        this.f3669a = context;
        this.f3670b = zzchw;
        this.f3671c = zzdla;
        this.f3672d = zzbbd;
        this.f3673e = zzdkk;
        this.f3674f = zzdvf;
        this.g = zzbfn;
    }

    public final void a(boolean z, Context context) {
        zzbfn zzbfn;
        zzbfn zzbfn2;
        zzchl zzchl = (zzchl) zzdux.l(this.f3674f);
        try {
            zzdkk zzdkk = this.f3673e;
            if (!this.g.S()) {
                zzbfn2 = this.g;
            } else {
                if (!((Boolean) zzwg.e().c(zzaav.k0)).booleanValue()) {
                    zzbfn2 = this.g;
                } else {
                    zzbfn c2 = this.f3670b.c(this.f3671c.f8350e);
                    zzahn.b(c2, zzchl.l());
                    zzcim zzcim = new zzcim();
                    zzcim.b(this.f3669a, c2.getView());
                    zzchl.h().i(c2, true);
                    c2.q().b(new ep(zzcim, c2));
                    zzbgz q = c2.q();
                    c2.getClass();
                    q.c(dp.b(c2));
                    c2.H(zzdkk.p.f8328b, zzdkk.p.f8327a, (String) null);
                    zzbfn = c2;
                    zzbfn.w0(true);
                    zzq.zzkw();
                    boolean K = zzaye.K(this.f3669a);
                    zzdkk zzdkk2 = this.f3673e;
                    zzg zzg = new zzg(false, K, false, 0.0f, -1, z, zzdkk2.G, zzdkk2.H);
                    zzq.zzkv();
                    zzcac j = zzchl.j();
                    zzdkk zzdkk3 = this.f3673e;
                    int i = zzdkk3.I;
                    zzbbd zzbbd = this.f3672d;
                    String str = zzdkk3.y;
                    zzdko zzdko = zzdkk3.p;
                    String str2 = zzdko.f8328b;
                    zzn.zza(context, new AdOverlayInfoParcel((zzuu) null, (zzo) j, (zzt) null, zzbfn, i, zzbbd, str, zzg, str2, zzdko.f8327a), true);
                }
            }
            zzbfn = zzbfn2;
            zzbfn.w0(true);
            zzq.zzkw();
            boolean K2 = zzaye.K(this.f3669a);
            zzdkk zzdkk22 = this.f3673e;
            zzg zzg2 = new zzg(false, K2, false, 0.0f, -1, z, zzdkk22.G, zzdkk22.H);
            zzq.zzkv();
            zzcac j2 = zzchl.j();
            zzdkk zzdkk32 = this.f3673e;
            int i2 = zzdkk32.I;
            zzbbd zzbbd2 = this.f3672d;
            String str3 = zzdkk32.y;
            zzdko zzdko2 = zzdkk32.p;
            String str22 = zzdko2.f8328b;
            zzn.zza(context, new AdOverlayInfoParcel((zzuu) null, (zzo) j2, (zzt) null, zzbfn, i2, zzbbd2, str3, zzg2, str22, zzdko2.f8327a), true);
        } catch (zzbfz e2) {
            zzbba.c("", e2);
        }
    }
}
