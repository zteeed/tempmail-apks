package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcuk implements zzcqt<zzchj> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7742a;

    /* renamed from: b  reason: collision with root package name */
    private final zzchw f7743b;

    /* renamed from: c  reason: collision with root package name */
    private final zzchm f7744c;

    /* renamed from: d  reason: collision with root package name */
    private final zzdla f7745d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f7746e;

    /* renamed from: f  reason: collision with root package name */
    private final zzbbd f7747f;

    public zzcuk(Context context, zzbbd zzbbd, zzdla zzdla, Executor executor, zzchm zzchm, zzchw zzchw) {
        this.f7742a = context;
        this.f7745d = zzdla;
        this.f7744c = zzchm;
        this.f7746e = executor;
        this.f7747f = zzbbd;
        this.f7743b = zzchw;
    }

    public final zzdvf<zzchj> a(zzdkw zzdkw, zzdkk zzdkk) {
        zzcim zzcim = new zzcim();
        zzdvf<zzchj> j = zzdux.j(zzdux.g(null), new yo(this, zzdkk, zzcim, zzdkw), this.f7746e);
        zzcim.getClass();
        j.f(xo.a(zzcim), this.f7746e);
        return j;
    }

    public final boolean b(zzdkw zzdkw, zzdkk zzdkk) {
        zzdko zzdko = zzdkk.p;
        return (zzdko == null || zzdko.f8327a == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf c(zzdkk zzdkk, zzcim zzcim, zzdkw zzdkw, Object obj) throws Exception {
        zzdvf<?> zzdvf;
        zzdkk zzdkk2 = zzdkk;
        zzbfn a2 = this.f7743b.a(this.f7745d.f8350e, zzdkk2.Q);
        a2.A0(zzdkk2.N);
        zzcim.b(this.f7742a, a2.getView());
        zzbbn zzbbn = new zzbbn();
        zzchm zzchm = this.f7744c;
        zzbpr zzbpr = new zzbpr(zzdkw, zzdkk2, (String) null);
        bp bpVar = r1;
        bp bpVar2 = new bp(this.f7742a, this.f7743b, this.f7745d, this.f7747f, zzdkk, zzbbn, a2);
        zzchl d2 = zzchm.d(zzbpr, new zzchk(bpVar, a2));
        zzbbn.a(d2);
        zzahn.b(a2, d2.l());
        d2.d().p0(new ap(a2), zzbbf.f6325f);
        d2.h().i(a2, true);
        if (!((Boolean) zzwg.e().c(zzaav.g3)).booleanValue() || !zzdkk2.Q) {
            d2.h();
            zzdko zzdko = zzdkk2.p;
            zzdvf = zzchy.b(a2, zzdko.f8328b, zzdko.f8327a);
        } else {
            zzdvf = zzdux.g(null);
        }
        return zzdux.i(zzdvf, new zo(this, a2, zzdkk2, d2), this.f7746e);
    }
}
