package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbrv;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class ev<R extends zzbrv<? extends zzbpb>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzdml f3928a;

    /* renamed from: b  reason: collision with root package name */
    private final zzdio f3929b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdin<R> f3930c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f3931d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public zzdij f3932e;

    public ev(zzdml zzdml, zzdio zzdio, zzdin<R> zzdin, Executor executor) {
        this.f3928a = zzdml;
        this.f3929b = zzdio;
        this.f3930c = zzdin;
        this.f3931d = executor;
    }

    /* access modifiers changed from: private */
    @Deprecated
    public final zzdmv d() {
        zzdla b2 = ((zzbrv) this.f3930c.a(this.f3929b).p()).b();
        return this.f3928a.d(b2.f8349d, b2.f8351f, b2.j);
    }

    public final zzdvf<zzdij> c() {
        zzdvf zzdvf;
        zzdij zzdij = this.f3932e;
        if (zzdij != null) {
            return zzdux.g(zzdij);
        }
        if (!zzacp.f5787a.a().booleanValue()) {
            zzdij zzdij2 = new zzdij((zzasm) null, d(), (fv) null);
            this.f3932e = zzdij2;
            zzdvf = zzdux.g(zzdij2);
        } else {
            zzdvf = zzduo.H(((zzbrv) this.f3930c.a(this.f3929b).q(new zzdhv(this.f3928a.c().k)).p()).a().c(this.f3928a.c())).D(new hv(this), this.f3931d).E(zzcop.class, new fv(this), this.f3931d);
        }
        return zzdux.i(zzdvf, gv.f4100a, this.f3931d);
    }
}
