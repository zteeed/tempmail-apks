package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.zzq;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcoo {

    /* renamed from: a  reason: collision with root package name */
    private final zzdvi f7312a;

    /* renamed from: b  reason: collision with root package name */
    private final zzcof f7313b;

    /* renamed from: c  reason: collision with root package name */
    private final zzeku<zzcoy> f7314c;

    public zzcoo(zzdvi zzdvi, zzcof zzcof, zzeku<zzcoy> zzeku) {
        this.f7312a = zzdvi;
        this.f7313b = zzcof;
        this.f7314c = zzeku;
    }

    private final <RetT> zzdvf<RetT> a(zzasm zzasm, lm<InputStream> lmVar, lm<InputStream> lmVar2, zzduh<InputStream, RetT> zzduh) {
        zzdvf<V> zzdvf;
        String str = zzasm.f5912e;
        zzq.zzkw();
        if (zzaye.Z(str)) {
            zzdvf = zzdux.a(new zzcop(zzdls.f8180a));
        } else {
            zzdvf = zzdux.k(lmVar.a(zzasm), ExecutionException.class, em.f3733a, this.f7312a);
        }
        return zzduo.H(zzdvf).G(zzduh, this.f7312a).F(zzcop.class, new dm(this, lmVar2, zzasm, zzduh), this.f7312a);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf b(lm lmVar, zzasm zzasm, zzduh zzduh, zzcop zzcop) throws Exception {
        return zzdux.j(lmVar.a(zzasm), zzduh, this.f7312a);
    }

    public final zzdvf<zzasm> c(zzasm zzasm) {
        gm gmVar = new gm(zzasm);
        zzcof zzcof = this.f7313b;
        zzcof.getClass();
        return a(zzasm, fm.b(zzcof), new im(this), gmVar);
    }

    public final zzdvf<Void> d(zzasm zzasm) {
        if (zzfg.f(zzasm.l)) {
            return zzdux.a(new zzcmi(zzdls.f8181b, "Pool key missing from removeUrl call."));
        }
        return a(zzasm, new km(this), new jm(this), hm.f3981a);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf e(zzasm zzasm) {
        return this.f7314c.get().H6(zzasm.l);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf f(zzasm zzasm) {
        return this.f7313b.b(zzasm.l);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf g(zzasm zzasm) {
        return this.f7314c.get().F6(zzasm, Binder.getCallingUid());
    }
}
