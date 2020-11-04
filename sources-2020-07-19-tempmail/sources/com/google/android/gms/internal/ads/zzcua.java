package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcua implements zzcqw<zzchj, zzdlm, zzcsd> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7543a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f7544b;

    /* renamed from: c  reason: collision with root package name */
    private final zzchm f7545c;

    public zzcua(Context context, Executor executor, zzchm zzchm) {
        this.f7543a = context;
        this.f7544b = executor;
        this.f7545c = zzchm;
    }

    public final /* synthetic */ Object a(zzdkw zzdkw, zzdkk zzdkk, zzcqv zzcqv) throws zzdlg, zzctw {
        zzchl d2 = this.f7545c.d(new zzbpr(zzdkw, zzdkk, zzcqv.f7382a), new zzchk(new uo(zzcqv)));
        d2.a().p0(new zzbli((zzdlm) zzcqv.f7383b), this.f7544b);
        ((zzcsd) zzcqv.f7384c).A6(d2.m());
        return d2.k();
    }

    public final void b(zzdkw zzdkw, zzdkk zzdkk, zzcqv<zzdlm, zzcsd> zzcqv) throws zzdlg {
        try {
            zzdla zzdla = zzdkw.f8161a.f8149a;
            if (zzdla.n.f8143a == zzdks.f8152c) {
                ((zzdlm) zzcqv.f7383b).u(this.f7543a, zzdla.f8166d, zzdkk.s.toString(), (zzamx) zzcqv.f7384c);
            } else {
                ((zzdlm) zzcqv.f7383b).t(this.f7543a, zzdla.f8166d, zzdkk.s.toString(), (zzamx) zzcqv.f7384c);
            }
        } catch (Exception e2) {
            String valueOf = String.valueOf(zzcqv.f7382a);
            zzbba.d(valueOf.length() != 0 ? "Fail to load ad from adapter ".concat(valueOf) : new String("Fail to load ad from adapter "), e2);
        }
    }
}
