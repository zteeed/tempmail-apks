package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcsm implements zzcqw<zzbzj, zzdlm, zzcsd> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7460a;

    /* renamed from: b  reason: collision with root package name */
    private final zzcae f7461b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbbd f7462c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f7463d;

    public zzcsm(Context context, zzbbd zzbbd, zzcae zzcae, Executor executor) {
        this.f7460a = context;
        this.f7462c = zzbbd;
        this.f7461b = zzcae;
        this.f7463d = executor;
    }

    public final /* synthetic */ Object a(zzdkw zzdkw, zzdkk zzdkk, zzcqv zzcqv) throws zzdlg, zzctw {
        zzbzl a2 = this.f7461b.a(new zzbpr(zzdkw, zzdkk, zzcqv.f7382a), new zzbzk(new ho(zzcqv)));
        a2.a().p0(new zzbli((zzdlm) zzcqv.f7383b), this.f7463d);
        ((zzcsd) zzcqv.f7384c).A6(a2.f());
        return a2.i();
    }

    public final void b(zzdkw zzdkw, zzdkk zzdkk, zzcqv<zzdlm, zzcsd> zzcqv) throws zzdlg {
        if (this.f7462c.f6133d < 4100000) {
            ((zzdlm) zzcqv.f7383b).m(this.f7460a, zzdkw.f8161a.f8149a.f8166d, zzdkk.s.toString(), (zzamx) zzcqv.f7384c);
        } else {
            ((zzdlm) zzcqv.f7383b).o(this.f7460a, zzdkw.f8161a.f8149a.f8166d, zzdkk.s.toString(), zzazy.a(zzdkk.p), (zzamx) zzcqv.f7384c);
        }
    }
}
