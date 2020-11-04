package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbrx;
import com.google.android.gms.internal.ads.zzbxa;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdgr implements zzcxn<zzbmw> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f8030a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Executor f8031b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbif f8032c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final zzdhi f8033d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final zzdil<zzbmq, zzbmw> f8034e;

    /* renamed from: f  reason: collision with root package name */
    private final ViewGroup f8035f;
    @GuardedBy("this")
    private final zzdlc g;
    /* access modifiers changed from: private */
    @GuardedBy("this")
    @Nullable
    public zzdvf<zzbmw> h;

    public zzdgr(Context context, Executor executor, zzbif zzbif, zzdil<zzbmq, zzbmw> zzdil, zzdhi zzdhi, zzdlc zzdlc) {
        this.f8030a = context;
        this.f8031b = executor;
        this.f8032c = zzbif;
        this.f8034e = zzdil;
        this.f8033d = zzdhi;
        this.g = zzdlc;
        this.f8035f = new FrameLayout(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final synchronized zzbmt h(zzdio zzdio) {
        ju juVar = (ju) zzdio;
        if (((Boolean) zzwg.e().c(zzaav.X3)).booleanValue()) {
            zzbmt k = this.f8032c.m().k(new zzbnb(this.f8035f));
            zzbrx.zza zza = new zzbrx.zza();
            zza.g(this.f8030a);
            zza.c(juVar.f4164a);
            return k.i(zza.d()).e(new zzbxa.zza().n());
        }
        zzdhi d2 = zzdhi.d(this.f8033d);
        zzbxa.zza zza2 = new zzbxa.zza();
        zza2.d(d2, this.f8031b);
        zza2.h(d2, this.f8031b);
        zza2.j(d2);
        zzbmt k2 = this.f8032c.m().k(new zzbnb(this.f8035f));
        zzbrx.zza zza3 = new zzbrx.zza();
        zza3.g(this.f8030a);
        zza3.c(juVar.f4164a);
        return k2.i(zza3.d()).e(zza2.n());
    }

    public final synchronized boolean a(zzve zzve, String str, zzcxm zzcxm, zzcxp<? super zzbmw> zzcxp) throws RemoteException {
        Preconditions.f("loadAd must be called on the main UI thread.");
        if (str == null) {
            zzbba.g("Ad unit ID should not be null for app open ad.");
            this.f8031b.execute(new gu(this));
            return false;
        } else if (this.h != null) {
            return false;
        } else {
            zzdlj.b(this.f8030a, zzve.g);
            zzdlc zzdlc = this.g;
            zzdlc.y(str);
            zzdlc.r(zzvh.J());
            zzdlc.A(zzve);
            zzdla e2 = zzdlc.e();
            ju juVar = new ju((iu) null);
            juVar.f4164a = e2;
            zzdvf<zzbmw> a2 = this.f8034e.a(new zzdiq(juVar), new fu(this));
            this.h = a2;
            zzdux.f(a2, new iu(this, zzcxp, juVar), this.f8031b);
            return true;
        }
    }

    public final void f(zzvo zzvo) {
        this.g.i(zzvo);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void g() {
        this.f8033d.onAdFailedToLoad(1);
    }

    public final boolean isLoading() {
        zzdvf<zzbmw> zzdvf = this.h;
        return zzdvf != null && !zzdvf.isDone();
    }
}
