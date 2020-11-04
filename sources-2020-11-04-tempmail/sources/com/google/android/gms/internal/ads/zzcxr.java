package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.internal.ads.zzbrx;
import com.google.android.gms.internal.ads.zzbxa;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcxr implements zzcxn<zzbpb> {
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    private final zzdlc f7866a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final zzbif f7867b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f7868c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final zzcxl f7869d;
    @GuardedBy("this")

    /* renamed from: e  reason: collision with root package name */
    private zzbpi f7870e;

    public zzcxr(zzbif zzbif, Context context, zzcxl zzcxl, zzdlc zzdlc) {
        this.f7867b = zzbif;
        this.f7868c = context;
        this.f7869d = zzcxl;
        this.f7866a = zzdlc;
    }

    public final boolean a(zzve zzve, String str, zzcxm zzcxm, zzcxp<? super zzbpb> zzcxp) throws RemoteException {
        zzcbc zzcbc;
        zzq.zzkw();
        if (zzaye.M(this.f7868c) && zzve.t == null) {
            zzbba.g("Failed to load the ad because app ID is missing.");
            this.f7867b.e().execute(new jq(this));
            return false;
        } else if (str == null) {
            zzbba.g("Ad unit ID should not be null for NativeAdLoader.");
            this.f7867b.e().execute(new lq(this));
            return false;
        } else {
            zzdlj.b(this.f7868c, zzve.g);
            int i = zzcxm instanceof zzcxo ? ((zzcxo) zzcxm).f7865a : 1;
            zzdlc zzdlc = this.f7866a;
            zzdlc.A(zzve);
            zzdlc.v(i);
            zzdla e2 = zzdlc.e();
            if (((Boolean) zzwg.e().c(zzaav.Z3)).booleanValue()) {
                zzcbf p = this.f7867b.p();
                zzbrx.zza zza = new zzbrx.zza();
                zza.g(this.f7868c);
                zza.c(e2);
                zzcbc = p.h(zza.d()).j(new zzbxa.zza().n()).f(this.f7869d.a()).l();
            } else {
                zzcbf p2 = this.f7867b.p();
                zzbrx.zza zza2 = new zzbrx.zza();
                zza2.g(this.f7868c);
                zza2.c(e2);
                zzcbf h = p2.h(zza2.d());
                zzbxa.zza zza3 = new zzbxa.zza();
                zza3.g(this.f7869d.d(), this.f7867b.e());
                zza3.d(this.f7869d.e(), this.f7867b.e());
                zza3.f(this.f7869d.f(), this.f7867b.e());
                zza3.k(this.f7869d.g(), this.f7867b.e());
                zza3.c(this.f7869d.c(), this.f7867b.e());
                zza3.l(e2.m, this.f7867b.e());
                zzcbc = h.j(zza3.n()).f(this.f7869d.a()).l();
            }
            this.f7867b.u().c(1);
            zzbpi zzbpi = new zzbpi(this.f7867b.g(), this.f7867b.f(), zzcbc.c().g());
            this.f7870e = zzbpi;
            zzbpi.e(new kq(this, zzcxp, zzcbc));
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c() {
        this.f7869d.e().onAdFailedToLoad(1);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d() {
        this.f7869d.e().onAdFailedToLoad(8);
    }

    public final boolean isLoading() {
        zzbpi zzbpi = this.f7870e;
        return zzbpi != null && zzbpi.a();
    }
}
