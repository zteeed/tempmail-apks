package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbrv;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class ev<R extends zzbrv<? extends zzbpb>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzdml f3745a;

    /* renamed from: b  reason: collision with root package name */
    private final zzdio f3746b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdin<R> f3747c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f3748d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public zzdij f3749e;

    public ev(zzdml zzdml, zzdio zzdio, zzdin<R> zzdin, Executor executor) {
        this.f3745a = zzdml;
        this.f3746b = zzdio;
        this.f3747c = zzdin;
        this.f3748d = executor;
    }

    /* access modifiers changed from: private */
    @Deprecated
    public final zzdmv d() {
        zzdla b2 = ((zzbrv) this.f3747c.a(this.f3746b).p()).b();
        return this.f3745a.d(b2.f8166d, b2.f8168f, b2.j);
    }

    public final zzdvf<zzdij> c() {
        zzdvf zzdvf;
        zzdij zzdij = this.f3749e;
        if (zzdij != null) {
            return zzdux.g(zzdij);
        }
        if (!zzacp.f5604a.a().booleanValue()) {
            zzdij zzdij2 = new zzdij((zzasm) null, d(), (fv) null);
            this.f3749e = zzdij2;
            zzdvf = zzdux.g(zzdij2);
        } else {
            zzdvf = zzduo.H(((zzbrv) this.f3747c.a(this.f3746b).q(new zzdhv(this.f3745a.c().k)).p()).a().c(this.f3745a.c())).D(new hv(this), this.f3748d).E(zzcop.class, new fv(this), this.f3748d);
        }
        return zzdux.i(zzdvf, gv.f3917a, this.f3748d);
    }
}
