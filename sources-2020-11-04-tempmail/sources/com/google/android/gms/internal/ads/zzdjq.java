package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbrx;
import com.google.android.gms.internal.ads.zzbxa;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdjq implements zzcxn<zzchj> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f8277a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Executor f8278b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbif f8279c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final zzdiu f8280d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final zzdil<zzchm, zzchj> f8281e;

    /* renamed from: f  reason: collision with root package name */
    private final zzdkv f8282f;
    @GuardedBy("this")
    private final zzdlc g;
    @GuardedBy("this")
    private zzdvf<zzchj> h;

    public zzdjq(Context context, Executor executor, zzbif zzbif, zzdil<zzchm, zzchj> zzdil, zzdiu zzdiu, zzdlc zzdlc, zzdkv zzdkv) {
        this.f8277a = context;
        this.f8278b = executor;
        this.f8279c = zzbif;
        this.f8281e = zzdil;
        this.f8280d = zzdiu;
        this.g = zzdlc;
        this.f8282f = zzdkv;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final zzchp i(zzdio zzdio) {
        hw hwVar = (hw) zzdio;
        if (((Boolean) zzwg.e().c(zzaav.W3)).booleanValue()) {
            zzchp q = this.f8279c.q();
            zzbrx.zza zza = new zzbrx.zza();
            zza.g(this.f8277a);
            zza.c(hwVar.f4179a);
            zza.k(hwVar.f4180b);
            zza.b(this.f8282f);
            return q.v(zza.d()).u(new zzbxa.zza().n());
        }
        zzdiu f2 = zzdiu.f(this.f8280d);
        zzchp q2 = this.f8279c.q();
        zzbrx.zza zza2 = new zzbrx.zza();
        zza2.g(this.f8277a);
        zza2.c(hwVar.f4179a);
        zza2.k(hwVar.f4180b);
        zza2.b(this.f8282f);
        zzchp v = q2.v(zza2.d());
        zzbxa.zza zza3 = new zzbxa.zza();
        zza3.c(f2, this.f8278b);
        zza3.g(f2, this.f8278b);
        zza3.d(f2, this.f8278b);
        zza3.b(f2, this.f8278b);
        zza3.e(f2, this.f8278b);
        zza3.i(f2, this.f8278b);
        zza3.j(f2);
        return v.u(zza3.n());
    }

    public final boolean a(zzve zzve, String str, zzcxm zzcxm, zzcxp<? super zzchj> zzcxp) throws RemoteException {
        zzatw zzatw = new zzatw(zzve, str);
        String str2 = zzcxm instanceof zzdjn ? ((zzdjn) zzcxm).f8275a : null;
        if (zzatw.f6134c == null) {
            zzbba.g("Ad unit ID should not be null for rewarded video ad.");
            this.f8278b.execute(new cw(this));
            return false;
        }
        zzdvf<zzchj> zzdvf = this.h;
        if (zzdvf != null && !zzdvf.isDone()) {
            return false;
        }
        zzdlj.b(this.f8277a, zzatw.f6133b.g);
        zzdlc zzdlc = this.g;
        zzdlc.y(zzatw.f6134c);
        zzdlc.r(zzvh.G());
        zzdlc.A(zzatw.f6133b);
        zzdla e2 = zzdlc.e();
        hw hwVar = new hw((dw) null);
        hwVar.f4179a = e2;
        hwVar.f4180b = str2;
        zzdvf<zzchj> a2 = this.f8281e.a(new zzdiq(hwVar), new ew(this));
        this.h = a2;
        zzdux.f(a2, new dw(this, zzcxp, hwVar), this.f8278b);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d() {
        this.f8280d.onAdFailedToLoad(1);
    }

    /* access modifiers changed from: package-private */
    public final void h(int i) {
        this.g.d().c(i);
    }

    public final boolean isLoading() {
        zzdvf<zzchj> zzdvf = this.h;
        return zzdvf != null && !zzdvf.isDone();
    }
}
