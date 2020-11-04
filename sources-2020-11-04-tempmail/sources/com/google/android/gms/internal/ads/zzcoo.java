package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.zzq;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcoo {

    /* renamed from: a  reason: collision with root package name */
    private final zzdvi f7495a;

    /* renamed from: b  reason: collision with root package name */
    private final zzcof f7496b;

    /* renamed from: c  reason: collision with root package name */
    private final zzeku<zzcoy> f7497c;

    public zzcoo(zzdvi zzdvi, zzcof zzcof, zzeku<zzcoy> zzeku) {
        this.f7495a = zzdvi;
        this.f7496b = zzcof;
        this.f7497c = zzeku;
    }

    private final <RetT> zzdvf<RetT> a(zzasm zzasm, lm<InputStream> lmVar, lm<InputStream> lmVar2, zzduh<InputStream, RetT> zzduh) {
        zzdvf<V> zzdvf;
        String str = zzasm.f6095e;
        zzq.zzkw();
        if (zzaye.Z(str)) {
            zzdvf = zzdux.a(new zzcop(zzdls.f8363a));
        } else {
            zzdvf = zzdux.k(lmVar.a(zzasm), ExecutionException.class, em.f3916a, this.f7495a);
        }
        return zzduo.H(zzdvf).G(zzduh, this.f7495a).F(zzcop.class, new dm(this, lmVar2, zzasm, zzduh), this.f7495a);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf b(lm lmVar, zzasm zzasm, zzduh zzduh, zzcop zzcop) throws Exception {
        return zzdux.j(lmVar.a(zzasm), zzduh, this.f7495a);
    }

    public final zzdvf<zzasm> c(zzasm zzasm) {
        gm gmVar = new gm(zzasm);
        zzcof zzcof = this.f7496b;
        zzcof.getClass();
        return a(zzasm, fm.b(zzcof), new im(this), gmVar);
    }

    public final zzdvf<Void> d(zzasm zzasm) {
        if (zzfg.f(zzasm.l)) {
            return zzdux.a(new zzcmi(zzdls.f8364b, "Pool key missing from removeUrl call."));
        }
        return a(zzasm, new km(this), new jm(this), hm.f4164a);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf e(zzasm zzasm) {
        return this.f7497c.get().m7(zzasm.l);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf f(zzasm zzasm) {
        return this.f7496b.b(zzasm.l);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf g(zzasm zzasm) {
        return this.f7497c.get().k7(zzasm, Binder.getCallingUid());
    }
}
