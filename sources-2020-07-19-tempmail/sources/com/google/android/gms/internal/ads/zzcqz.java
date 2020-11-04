package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcqz implements zzcqt<zzbmw> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbmq f7386a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f7387b;

    /* renamed from: c  reason: collision with root package name */
    private final zzchw f7388c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f7389d;

    public zzcqz(zzbmq zzbmq, Context context, Executor executor, zzchw zzchw, zzdla zzdla) {
        this.f7387b = context;
        this.f7386a = zzbmq;
        this.f7389d = executor;
        this.f7388c = zzchw;
    }

    public final zzdvf<zzbmw> a(zzdkw zzdkw, zzdkk zzdkk) {
        return zzdux.j(zzdux.g(null), new in(this, zzdkw, zzdkk), this.f7389d);
    }

    public final boolean b(zzdkw zzdkw, zzdkk zzdkk) {
        zzdko zzdko = zzdkk.p;
        return (zzdko == null || zzdko.f8144a == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf c(zzdkw zzdkw, zzdkk zzdkk, Object obj) throws Exception {
        zzvh b2 = zzdld.b(this.f7387b, zzdkk.r);
        zzbfn c2 = this.f7388c.c(b2);
        zzbmk d2 = this.f7386a.d(new zzbpr(zzdkw, zzdkk, (String) null), new zzbmn(c2.getView(), c2, zzdld.c(b2), zzdkk.S, zzdkk.W, zzdkk.G));
        d2.i().i(c2, false);
        d2.d().p0(new kn(c2), zzbbf.f6142f);
        d2.i();
        zzdko zzdko = zzdkk.p;
        return zzdux.i(zzchy.b(c2, zzdko.f8145b, zzdko.f8144a), new jn(d2), zzbbf.f6142f);
    }
}
