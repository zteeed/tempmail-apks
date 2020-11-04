package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbpb;
import com.google.android.gms.internal.ads.zzbrv;
import com.google.android.gms.internal.ads.zzty;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdhp<R extends zzbrv<AdT>, AdT extends zzbpb> implements zzdil<R, AdT> {

    /* renamed from: a  reason: collision with root package name */
    private final zzdil<R, AdT> f8062a;

    /* renamed from: b  reason: collision with root package name */
    private final zzdil<R, zzdic<AdT>> f8063b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdne<AdT> f8064c;
    @GuardedBy("this")

    /* renamed from: d  reason: collision with root package name */
    private R f8065d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f8066e;

    public zzdhp(zzdil<R, AdT> zzdil, zzdil<R, zzdic<AdT>> zzdil2, zzdne<AdT> zzdne, Executor executor) {
        this.f8062a = zzdil;
        this.f8063b = zzdil2;
        this.f8064c = zzdne;
        this.f8066e = executor;
    }

    private final zzdvf<AdT> e(zzdmw<AdT> zzdmw, zzdiq zzdiq, zzdin<R> zzdin) {
        zzbru<R> a2 = zzdin.a(zzdiq.f8083b);
        if (zzdmw.f8229c != null) {
            zzbrv zzbrv = (zzbrv) a2.p();
            if (zzbrv.c() != null) {
                zzdmw.f8229c.e().b(zzbrv.c());
            }
            return zzdux.g(zzdmw.f8229c);
        }
        a2.m(zzdmw.f8228b);
        zzdvf<AdT> a3 = this.f8062a.a(zzdiq, new vu(a2));
        this.f8065d = (zzbrv) this.f8062a.b();
        return a3;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final synchronized R b() {
        return this.f8065d;
    }

    public final synchronized zzdvf<AdT> a(zzdiq zzdiq, zzdin<R> zzdin) {
        zzdla b2;
        zzdin<R> zzdin2;
        zzdiq zzdiq2;
        b2 = ((zzbrv) zzdin.a(zzdiq.f8083b).p()).b();
        zzdin2 = zzdin;
        zzdiq2 = zzdiq;
        return zzduo.H(this.f8063b.a(zzdiq, zzdin)).G(new wu(this, zzdiq, new zu(zzdin2, zzdiq2, b2.f8166d, b2.f8168f, this.f8066e, b2.j, (zzdmv) null), zzdin), this.f8066e);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf c(zzdin zzdin, zzdni zzdni) throws Exception {
        zzdnk zzdnk;
        if (zzdni == null || zzdni.f8242a == null || (zzdnk = zzdni.f8243b) == null) {
            throw new zzcmi(zzdls.f8180a, "Empty prefetch");
        }
        zzty.zzb.zzc I = zzty.zzb.I();
        zzty.zzb.zza.C0087zza P = zzty.zzb.zza.P();
        P.w(zzty.zzb.C0088zzb.IN_MEMORY);
        P.x(zzty.zzb.zzd.L());
        I.w(P);
        zzdni.f8242a.f8227a.h().y((zzty.zzb) ((zzegb) I.O()));
        return e(zzdni.f8242a, ((zu) zzdnk).f5495b, zzdin);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf d(zzdiq zzdiq, zu zuVar, zzdin zzdin, zzdic zzdic) throws Exception {
        if (zzdic != null) {
            zu zuVar2 = new zu(zuVar.f5494a, zuVar.f5495b, zuVar.f5496c, zuVar.f5497d, zuVar.f5498e, zuVar.f5499f, zzdic.f8071a);
            if (zzdic.f8073c != null) {
                this.f8065d = null;
                this.f8064c.g(zuVar2);
                return e(zzdic.f8073c, zzdiq, zzdin);
            }
            zzdvf<zzdni<AdT>> j = this.f8064c.j(zuVar2);
            if (j != null) {
                this.f8065d = (zzbrv) zzdin.a(zzdiq.f8083b).p();
                return zzdux.j(j, new yu(this, zzdin), this.f8066e);
            }
            this.f8064c.g(zuVar2);
            zzdiq = new zzdiq(zzdiq.f8083b, zzdic.f8072b);
        }
        zzdvf<AdT> a2 = this.f8062a.a(zzdiq, zzdin);
        this.f8065d = (zzbrv) this.f8062a.b();
        return a2;
    }
}
