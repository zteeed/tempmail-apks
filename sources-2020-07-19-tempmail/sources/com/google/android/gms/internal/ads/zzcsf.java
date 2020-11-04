package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcsf implements zzcqt<zzbzj> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7448a;

    /* renamed from: b  reason: collision with root package name */
    private final zzchw f7449b;

    /* renamed from: c  reason: collision with root package name */
    private final zzcae f7450c;

    /* renamed from: d  reason: collision with root package name */
    private final zzdla f7451d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f7452e;

    /* renamed from: f  reason: collision with root package name */
    private final zzbbd f7453f;

    public zzcsf(Context context, zzbbd zzbbd, zzdla zzdla, Executor executor, zzcae zzcae, zzchw zzchw) {
        this.f7448a = context;
        this.f7451d = zzdla;
        this.f7450c = zzcae;
        this.f7452e = executor;
        this.f7453f = zzbbd;
        this.f7449b = zzchw;
    }

    public final zzdvf<zzbzj> a(zzdkw zzdkw, zzdkk zzdkk) {
        zzcim zzcim = new zzcim();
        zzdvf<zzbzj> j = zzdux.j(zzdux.g(null), new ao(this, zzdkk, zzcim, zzdkw), this.f7452e);
        zzcim.getClass();
        j.f(co.a(zzcim), this.f7452e);
        return j;
    }

    public final boolean b(zzdkw zzdkw, zzdkk zzdkk) {
        zzdko zzdko = zzdkk.p;
        return (zzdko == null || zzdko.f8144a == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf c(zzdkk zzdkk, zzcim zzcim, zzdkw zzdkw, Object obj) throws Exception {
        zzdvf<?> zzdvf;
        zzbfn a2 = this.f7449b.a(this.f7451d.f8167e, zzdkk.Q);
        a2.A0(zzdkk.N);
        zzcim.b(this.f7448a, a2.getView());
        zzbbn zzbbn = new zzbbn();
        zzbzl a3 = this.f7450c.a(new zzbpr(zzdkw, zzdkk, (String) null), new zzbzk(new fo(this.f7448a, this.f7453f, zzbbn, zzdkk, a2), a2));
        zzbbn.a(a3);
        a3.d().p0(new bo(a2), zzbbf.f6142f);
        a3.h().i(a2, true);
        if (!((Boolean) zzwg.e().c(zzaav.g3)).booleanValue() || !zzdkk.Q) {
            a3.h();
            zzdko zzdko = zzdkk.p;
            zzdvf = zzchy.b(a2, zzdko.f8145b, zzdko.f8144a);
        } else {
            zzdvf = zzdux.g(null);
        }
        return zzdux.i(zzdvf, new eo(this, a2, zzdkk, a3), this.f7452e);
    }
}
