package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.zzb;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcrk implements zzcqw<zzbnc, zzdlm, zzcsd> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7401a;

    /* renamed from: b  reason: collision with root package name */
    private final zzbbd f7402b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbny f7403c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f7404d;

    public zzcrk(Context context, zzbbd zzbbd, zzbny zzbny, Executor executor) {
        this.f7401a = context;
        this.f7402b = zzbbd;
        this.f7403c = zzbny;
        this.f7404d = executor;
    }

    public final /* synthetic */ Object a(zzdkw zzdkw, zzdkk zzdkk, zzcqv zzcqv) throws zzdlg, zzctw {
        zzbny zzbny = this.f7403c;
        zzbpr zzbpr = new zzbpr(zzdkw, zzdkk, zzcqv.f7382a);
        View c2 = ((zzdlm) zzcqv.f7383b).c();
        zzdlm zzdlm = (zzdlm) zzcqv.f7383b;
        zzdlm.getClass();
        zzbnf a2 = zzbny.a(zzbpr, new zzbnj(c2, (zzbfn) null, rn.a(zzdlm), zzdkk.r.get(0)));
        a2.j().C0(((zzdlm) zzcqv.f7383b).c());
        a2.a().p0(new zzbli((zzdlm) zzcqv.f7383b), this.f7404d);
        ((zzcsd) zzcqv.f7384c).A6(a2.f());
        return a2.i();
    }

    public final void b(zzdkw zzdkw, zzdkk zzdkk, zzcqv<zzdlm, zzcsd> zzcqv) throws zzdlg {
        zzvh zzvh;
        zzvh zzvh2 = zzdkw.f8161a.f8149a.f8167e;
        if (zzvh2.o) {
            zzvh = new zzvh(this.f7401a, zzb.zza(zzvh2.f9193f, zzvh2.f9190c));
        } else {
            zzvh = zzdld.b(this.f7401a, zzdkk.r);
        }
        zzvh zzvh3 = zzvh;
        if (this.f7402b.f6133d < 4100000) {
            ((zzdlm) zzcqv.f7383b).q(this.f7401a, zzvh3, zzdkw.f8161a.f8149a.f8166d, zzdkk.s.toString(), (zzamx) zzcqv.f7384c);
        } else {
            ((zzdlm) zzcqv.f7383b).r(this.f7401a, zzvh3, zzdkw.f8161a.f8149a.f8166d, zzdkk.s.toString(), zzazy.a(zzdkk.p), (zzamx) zzcqv.f7384c);
        }
    }
}
