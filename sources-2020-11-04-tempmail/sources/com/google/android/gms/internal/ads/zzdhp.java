package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbpb;
import com.google.android.gms.internal.ads.zzbrv;
import com.google.android.gms.internal.ads.zzty;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdhp<R extends zzbrv<AdT>, AdT extends zzbpb> implements zzdil<R, AdT> {

    /* renamed from: a  reason: collision with root package name */
    private final zzdil<R, AdT> f8245a;

    /* renamed from: b  reason: collision with root package name */
    private final zzdil<R, zzdic<AdT>> f8246b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdne<AdT> f8247c;
    @GuardedBy("this")

    /* renamed from: d  reason: collision with root package name */
    private R f8248d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f8249e;

    public zzdhp(zzdil<R, AdT> zzdil, zzdil<R, zzdic<AdT>> zzdil2, zzdne<AdT> zzdne, Executor executor) {
        this.f8245a = zzdil;
        this.f8246b = zzdil2;
        this.f8247c = zzdne;
        this.f8249e = executor;
    }

    private final zzdvf<AdT> e(zzdmw<AdT> zzdmw, zzdiq zzdiq, zzdin<R> zzdin) {
        zzbru<R> a2 = zzdin.a(zzdiq.f8266b);
        if (zzdmw.f8412c != null) {
            zzbrv zzbrv = (zzbrv) a2.p();
            if (zzbrv.c() != null) {
                zzdmw.f8412c.e().b(zzbrv.c());
            }
            return zzdux.g(zzdmw.f8412c);
        }
        a2.m(zzdmw.f8411b);
        zzdvf<AdT> a3 = this.f8245a.a(zzdiq, new vu(a2));
        this.f8248d = (zzbrv) this.f8245a.b();
        return a3;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final synchronized R b() {
        return this.f8248d;
    }

    public final synchronized zzdvf<AdT> a(zzdiq zzdiq, zzdin<R> zzdin) {
        zzdla b2;
        zzdin<R> zzdin2;
        zzdiq zzdiq2;
        b2 = ((zzbrv) zzdin.a(zzdiq.f8266b).p()).b();
        zzdin2 = zzdin;
        zzdiq2 = zzdiq;
        return zzduo.H(this.f8246b.a(zzdiq, zzdin)).G(new wu(this, zzdiq, new zu(zzdin2, zzdiq2, b2.f8349d, b2.f8351f, this.f8249e, b2.j, (zzdmv) null), zzdin), this.f8249e);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf c(zzdin zzdin, zzdni zzdni) throws Exception {
        zzdnk zzdnk;
        if (zzdni == null || zzdni.f8425a == null || (zzdnk = zzdni.f8426b) == null) {
            throw new zzcmi(zzdls.f8363a, "Empty prefetch");
        }
        zzty.zzb.zzc I = zzty.zzb.I();
        zzty.zzb.zza.C0086zza P = zzty.zzb.zza.P();
        P.w(zzty.zzb.C0087zzb.IN_MEMORY);
        P.x(zzty.zzb.zzd.L());
        I.w(P);
        zzdni.f8425a.f8410a.h().y((zzty.zzb) ((zzegb) I.O()));
        return e(zzdni.f8425a, ((zu) zzdnk).f5678b, zzdin);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf d(zzdiq zzdiq, zu zuVar, zzdin zzdin, zzdic zzdic) throws Exception {
        if (zzdic != null) {
            zu zuVar2 = new zu(zuVar.f5677a, zuVar.f5678b, zuVar.f5679c, zuVar.f5680d, zuVar.f5681e, zuVar.f5682f, zzdic.f8254a);
            if (zzdic.f8256c != null) {
                this.f8248d = null;
                this.f8247c.g(zuVar2);
                return e(zzdic.f8256c, zzdiq, zzdin);
            }
            zzdvf<zzdni<AdT>> j = this.f8247c.j(zuVar2);
            if (j != null) {
                this.f8248d = (zzbrv) zzdin.a(zzdiq.f8266b).p();
                return zzdux.j(j, new yu(this, zzdin), this.f8249e);
            }
            this.f8247c.g(zuVar2);
            zzdiq = new zzdiq(zzdiq.f8266b, zzdic.f8255b);
        }
        zzdvf<AdT> a2 = this.f8245a.a(zzdiq, zzdin);
        this.f8248d = (zzbrv) this.f8245a.b();
        return a2;
    }
}
