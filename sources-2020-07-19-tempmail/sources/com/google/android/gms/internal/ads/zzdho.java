package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbpb;
import com.google.android.gms.internal.ads.zzbrv;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdho<R extends zzbrv<AdT>, AdT extends zzbpb> implements zzdil<R, zzdmw<AdT>> {

    /* renamed from: a  reason: collision with root package name */
    private R f8060a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f8061b = zzdvh.c();

    public final zzdvf<zzdmw<AdT>> a(zzdiq zzdiq, zzdin<R> zzdin) {
        zzdvf<zzdkw> zzdvf;
        zzbru<R> a2 = zzdin.a(zzdiq.f8083b);
        a2.g(new zzdir(true));
        R r = (zzbrv) a2.p();
        this.f8060a = r;
        zzbpz a3 = r.a();
        zzdmw zzdmw = new zzdmw();
        zzasm zzasm = zzdiq.f8082a;
        if (zzasm != null) {
            zzdvf = a3.b(zzasm);
        } else {
            zzdvf = a3.f();
        }
        return zzduo.H(zzdvf).G(new tu(this, zzdmw, a3), this.f8061b).D(new uu(zzdmw), this.f8061b);
    }

    public final /* synthetic */ Object b() {
        return this.f8060a;
    }
}
