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
    private final zzdlc f7683a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final zzbif f7684b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f7685c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final zzcxl f7686d;
    @GuardedBy("this")

    /* renamed from: e  reason: collision with root package name */
    private zzbpi f7687e;

    public zzcxr(zzbif zzbif, Context context, zzcxl zzcxl, zzdlc zzdlc) {
        this.f7684b = zzbif;
        this.f7685c = context;
        this.f7686d = zzcxl;
        this.f7683a = zzdlc;
    }

    public final boolean a(zzve zzve, String str, zzcxm zzcxm, zzcxp<? super zzbpb> zzcxp) throws RemoteException {
        zzcbc zzcbc;
        zzq.zzkw();
        if (zzaye.M(this.f7685c) && zzve.t == null) {
            zzbba.g("Failed to load the ad because app ID is missing.");
            this.f7684b.e().execute(new jq(this));
            return false;
        } else if (str == null) {
            zzbba.g("Ad unit ID should not be null for NativeAdLoader.");
            this.f7684b.e().execute(new lq(this));
            return false;
        } else {
            zzdlj.b(this.f7685c, zzve.g);
            int i = zzcxm instanceof zzcxo ? ((zzcxo) zzcxm).f7682a : 1;
            zzdlc zzdlc = this.f7683a;
            zzdlc.A(zzve);
            zzdlc.v(i);
            zzdla e2 = zzdlc.e();
            if (((Boolean) zzwg.e().c(zzaav.Z3)).booleanValue()) {
                zzcbf p = this.f7684b.p();
                zzbrx.zza zza = new zzbrx.zza();
                zza.g(this.f7685c);
                zza.c(e2);
                zzcbc = p.h(zza.d()).j(new zzbxa.zza().n()).f(this.f7686d.a()).l();
            } else {
                zzcbf p2 = this.f7684b.p();
                zzbrx.zza zza2 = new zzbrx.zza();
                zza2.g(this.f7685c);
                zza2.c(e2);
                zzcbf h = p2.h(zza2.d());
                zzbxa.zza zza3 = new zzbxa.zza();
                zza3.g(this.f7686d.d(), this.f7684b.e());
                zza3.d(this.f7686d.e(), this.f7684b.e());
                zza3.f(this.f7686d.f(), this.f7684b.e());
                zza3.k(this.f7686d.g(), this.f7684b.e());
                zza3.c(this.f7686d.c(), this.f7684b.e());
                zza3.l(e2.m, this.f7684b.e());
                zzcbc = h.j(zza3.n()).f(this.f7686d.a()).l();
            }
            this.f7684b.u().c(1);
            zzbpi zzbpi = new zzbpi(this.f7684b.g(), this.f7684b.f(), zzcbc.c().g());
            this.f7687e = zzbpi;
            zzbpi.e(new kq(this, zzcxp, zzcbc));
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c() {
        this.f7686d.e().onAdFailedToLoad(1);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d() {
        this.f7686d.e().onAdFailedToLoad(8);
    }

    public final boolean isLoading() {
        zzbpi zzbpi = this.f7687e;
        return zzbpi != null && zzbpi.a();
    }
}
