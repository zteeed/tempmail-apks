package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.zzb;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcrk implements zzcqw<zzbnc, zzdlm, zzcsd> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7584a;

    /* renamed from: b  reason: collision with root package name */
    private final zzbbd f7585b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbny f7586c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f7587d;

    public zzcrk(Context context, zzbbd zzbbd, zzbny zzbny, Executor executor) {
        this.f7584a = context;
        this.f7585b = zzbbd;
        this.f7586c = zzbny;
        this.f7587d = executor;
    }

    public final /* synthetic */ Object a(zzdkw zzdkw, zzdkk zzdkk, zzcqv zzcqv) throws zzdlg, zzctw {
        zzbny zzbny = this.f7586c;
        zzbpr zzbpr = new zzbpr(zzdkw, zzdkk, zzcqv.f7565a);
        View c2 = ((zzdlm) zzcqv.f7566b).c();
        zzdlm zzdlm = (zzdlm) zzcqv.f7566b;
        zzdlm.getClass();
        zzbnf a2 = zzbny.a(zzbpr, new zzbnj(c2, (zzbfn) null, rn.a(zzdlm), zzdkk.r.get(0)));
        a2.j().C0(((zzdlm) zzcqv.f7566b).c());
        a2.a().p0(new zzbli((zzdlm) zzcqv.f7566b), this.f7587d);
        ((zzcsd) zzcqv.f7567c).f7(a2.f());
        return a2.i();
    }

    public final void b(zzdkw zzdkw, zzdkk zzdkk, zzcqv<zzdlm, zzcsd> zzcqv) throws zzdlg {
        zzvh zzvh;
        zzvh zzvh2 = zzdkw.f8344a.f8332a.f8350e;
        if (zzvh2.o) {
            zzvh = new zzvh(this.f7584a, zzb.zza(zzvh2.f9376f, zzvh2.f9373c));
        } else {
            zzvh = zzdld.b(this.f7584a, zzdkk.r);
        }
        zzvh zzvh3 = zzvh;
        if (this.f7585b.f6316d < 4100000) {
            ((zzdlm) zzcqv.f7566b).q(this.f7584a, zzvh3, zzdkw.f8344a.f8332a.f8349d, zzdkk.s.toString(), (zzamx) zzcqv.f7567c);
        } else {
            ((zzdlm) zzcqv.f7566b).r(this.f7584a, zzvh3, zzdkw.f8344a.f8332a.f8349d, zzdkk.s.toString(), zzazy.a(zzdkk.p), (zzamx) zzcqv.f7567c);
        }
    }
}
