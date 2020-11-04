package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcrc implements zzcqt<zzbnc> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbny f7573a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f7574b;

    /* renamed from: c  reason: collision with root package name */
    private final zzchw f7575c;

    /* renamed from: d  reason: collision with root package name */
    private final zzdla f7576d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f7577e;

    /* renamed from: f  reason: collision with root package name */
    private final zzdrx<zzdkk, zzayv> f7578f;

    public zzcrc(zzbny zzbny, Context context, Executor executor, zzchw zzchw, zzdla zzdla, zzdrx<zzdkk, zzayv> zzdrx) {
        this.f7574b = context;
        this.f7573a = zzbny;
        this.f7577e = executor;
        this.f7575c = zzchw;
        this.f7576d = zzdla;
        this.f7578f = zzdrx;
    }

    public final zzdvf<zzbnc> a(zzdkw zzdkw, zzdkk zzdkk) {
        return zzdux.j(zzdux.g(null), new mn(this, zzdkw, zzdkk), this.f7577e);
    }

    public final boolean b(zzdkw zzdkw, zzdkk zzdkk) {
        zzdko zzdko = zzdkk.p;
        return (zzdko == null || zzdko.f8327a == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf c(zzdkw zzdkw, zzdkk zzdkk, Object obj) throws Exception {
        zzvh b2 = zzdld.b(this.f7574b, zzdkk.r);
        zzbfn c2 = this.f7575c.c(b2);
        c2.A0(zzdkk.N);
        zzbny zzbny = this.f7573a;
        zzbpr zzbpr = new zzbpr(zzdkw, zzdkk, (String) null);
        zzcin zzcin = new zzcin(this.f7574b, c2.getView(), this.f7578f.apply(zzdkk));
        c2.getClass();
        zzbnf a2 = zzbny.a(zzbpr, new zzbnj(zzcin, c2, ln.a(c2), zzdld.c(b2)));
        a2.h().i(c2, false);
        a2.d().p0(new on(c2), zzbbf.f6325f);
        a2.h();
        zzdko zzdko = zzdkk.p;
        zzdvf<?> b3 = zzchy.b(c2, zzdko.f8328b, zzdko.f8327a);
        if (zzdkk.E) {
            c2.getClass();
            b3.f(nn.a(c2), this.f7577e);
        }
        b3.f(new qn(this, c2), this.f7577e);
        return zzdux.i(b3, new pn(a2), zzbbf.f6325f);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d(zzbfn zzbfn) {
        zzbfn.U();
        zzbgh m = zzbfn.m();
        zzaaa zzaaa = this.f7576d.f8347b;
        if (zzaaa != null && m != null) {
            m.j7(zzaaa);
        }
    }
}
