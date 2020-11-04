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
    private final Context f3486a;

    /* renamed from: b  reason: collision with root package name */
    private final zzchw f3487b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdla f3488c;

    /* renamed from: d  reason: collision with root package name */
    private final zzbbd f3489d;

    /* renamed from: e  reason: collision with root package name */
    private final zzdkk f3490e;

    /* renamed from: f  reason: collision with root package name */
    private final zzdvf<zzchl> f3491f;
    private final zzbfn g;

    private bp(Context context, zzchw zzchw, zzdla zzdla, zzbbd zzbbd, zzdkk zzdkk, zzdvf<zzchl> zzdvf, zzbfn zzbfn) {
        this.f3486a = context;
        this.f3487b = zzchw;
        this.f3488c = zzdla;
        this.f3489d = zzbbd;
        this.f3490e = zzdkk;
        this.f3491f = zzdvf;
        this.g = zzbfn;
    }

    public final void a(boolean z, Context context) {
        zzbfn zzbfn;
        zzbfn zzbfn2;
        zzchl zzchl = (zzchl) zzdux.l(this.f3491f);
        try {
            zzdkk zzdkk = this.f3490e;
            if (!this.g.S()) {
                zzbfn2 = this.g;
            } else {
                if (!((Boolean) zzwg.e().c(zzaav.k0)).booleanValue()) {
                    zzbfn2 = this.g;
                } else {
                    zzbfn c2 = this.f3487b.c(this.f3488c.f8167e);
                    zzahn.b(c2, zzchl.l());
                    zzcim zzcim = new zzcim();
                    zzcim.b(this.f3486a, c2.getView());
                    zzchl.h().i(c2, true);
                    c2.q().b(new ep(zzcim, c2));
                    zzbgz q = c2.q();
                    c2.getClass();
                    q.c(dp.b(c2));
                    c2.H(zzdkk.p.f8145b, zzdkk.p.f8144a, (String) null);
                    zzbfn = c2;
                    zzbfn.w0(true);
                    zzq.zzkw();
                    boolean K = zzaye.K(this.f3486a);
                    zzdkk zzdkk2 = this.f3490e;
                    zzg zzg = new zzg(false, K, false, 0.0f, -1, z, zzdkk2.G, zzdkk2.H);
                    zzq.zzkv();
                    zzcac j = zzchl.j();
                    zzdkk zzdkk3 = this.f3490e;
                    int i = zzdkk3.I;
                    zzbbd zzbbd = this.f3489d;
                    String str = zzdkk3.y;
                    zzdko zzdko = zzdkk3.p;
                    String str2 = zzdko.f8145b;
                    zzn.zza(context, new AdOverlayInfoParcel((zzuu) null, (zzo) j, (zzt) null, zzbfn, i, zzbbd, str, zzg, str2, zzdko.f8144a), true);
                }
            }
            zzbfn = zzbfn2;
            zzbfn.w0(true);
            zzq.zzkw();
            boolean K2 = zzaye.K(this.f3486a);
            zzdkk zzdkk22 = this.f3490e;
            zzg zzg2 = new zzg(false, K2, false, 0.0f, -1, z, zzdkk22.G, zzdkk22.H);
            zzq.zzkv();
            zzcac j2 = zzchl.j();
            zzdkk zzdkk32 = this.f3490e;
            int i2 = zzdkk32.I;
            zzbbd zzbbd2 = this.f3489d;
            String str3 = zzdkk32.y;
            zzdko zzdko2 = zzdkk32.p;
            String str22 = zzdko2.f8145b;
            zzn.zza(context, new AdOverlayInfoParcel((zzuu) null, (zzo) j2, (zzt) null, zzbfn, i2, zzbbd2, str3, zzg2, str22, zzdko2.f8144a), true);
        } catch (zzbfz e2) {
            zzbba.c("", e2);
        }
    }
}
