package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcsm implements zzcqw<zzbzj, zzdlm, zzcsd> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7643a;

    /* renamed from: b  reason: collision with root package name */
    private final zzcae f7644b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbbd f7645c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f7646d;

    public zzcsm(Context context, zzbbd zzbbd, zzcae zzcae, Executor executor) {
        this.f7643a = context;
        this.f7645c = zzbbd;
        this.f7644b = zzcae;
        this.f7646d = executor;
    }

    public final /* synthetic */ Object a(zzdkw zzdkw, zzdkk zzdkk, zzcqv zzcqv) throws zzdlg, zzctw {
        zzbzl a2 = this.f7644b.a(new zzbpr(zzdkw, zzdkk, zzcqv.f7565a), new zzbzk(new ho(zzcqv)));
        a2.a().p0(new zzbli((zzdlm) zzcqv.f7566b), this.f7646d);
        ((zzcsd) zzcqv.f7567c).f7(a2.f());
        return a2.i();
    }

    public final void b(zzdkw zzdkw, zzdkk zzdkk, zzcqv<zzdlm, zzcsd> zzcqv) throws zzdlg {
        if (this.f7645c.f6316d < 4100000) {
            ((zzdlm) zzcqv.f7566b).m(this.f7643a, zzdkw.f8344a.f8332a.f8349d, zzdkk.s.toString(), (zzamx) zzcqv.f7567c);
        } else {
            ((zzdlm) zzcqv.f7566b).o(this.f7643a, zzdkw.f8344a.f8332a.f8349d, zzdkk.s.toString(), zzazy.a(zzdkk.p), (zzamx) zzcqv.f7567c);
        }
    }
}
