package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbpb;
import com.google.android.gms.internal.ads.zzbrv;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdhy<R extends zzbrv<AdT>, AdT extends zzbpb> implements zzdil<R, zzdic<AdT>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzdml f8251a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f8252b;

    /* renamed from: c  reason: collision with root package name */
    private zzduu<Void> f8253c = new bv(this);

    public zzdhy(zzdml zzdml, Executor executor) {
        this.f8251a = zzdml;
        this.f8252b = executor;
    }

    public final zzdvf<zzdic<AdT>> a(zzdiq zzdiq, zzdin<R> zzdin) {
        return zzduo.H(new ev(this.f8251a, zzdiq.f8266b, zzdin, this.f8252b).c()).G(new av(this, zzdiq, zzdin), this.f8252b).E(Exception.class, new dv(this), this.f8252b);
    }

    public final /* bridge */ /* synthetic */ Object b() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf c(zzdiq zzdiq, zzdin zzdin, zzdij zzdij) throws Exception {
        zzdmv zzdmv = zzdij.f8261b;
        zzasm zzasm = zzdij.f8260a;
        zzdmw<?> b2 = zzdmv != null ? this.f8251a.b(zzdmv) : null;
        if (zzdmv == null) {
            return zzdux.g(null);
        }
        if (!(b2 == null || zzasm == null)) {
            zzdux.f(((zzbrv) zzdin.a(zzdiq.f8266b).p()).a().k(zzasm), this.f8253c, this.f8252b);
        }
        return zzdux.g(new zzdic(zzdmv, zzasm, b2));
    }
}
