package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdjy extends zzauh {

    /* renamed from: b  reason: collision with root package name */
    private final zzdjq f8289b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdiu f8290c;

    /* renamed from: d  reason: collision with root package name */
    private final String f8291d;

    /* renamed from: e  reason: collision with root package name */
    private final zzdkv f8292e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f8293f;
    /* access modifiers changed from: private */
    @GuardedBy("this")
    public zzchj g;

    public zzdjy(String str, zzdjq zzdjq, Context context, zzdiu zzdiu, zzdkv zzdkv) {
        this.f8291d = str;
        this.f8289b = zzdjq;
        this.f8290c = zzdiu;
        this.f8292e = zzdkv;
        this.f8293f = context;
    }

    private final synchronized void h7(zzve zzve, zzauq zzauq, int i) throws RemoteException {
        Preconditions.f("#008 Must be called on the main UI thread.");
        this.f8290c.j(zzauq);
        zzq.zzkw();
        if (zzaye.M(this.f8293f) && zzve.t == null) {
            zzbba.g("Failed to load the ad because app ID is missing.");
            this.f8290c.onAdFailedToLoad(8);
        } else if (this.g == null) {
            zzdjn zzdjn = new zzdjn((String) null);
            this.f8289b.h(i);
            this.f8289b.a(zzve, this.f8291d, zzdjn, new kw(this));
        }
    }

    public final zzaud K2() {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzchj zzchj = this.g;
        if (zzchj != null) {
            return zzchj.k();
        }
        return null;
    }

    public final synchronized void Z5(zzauz zzauz) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzdkv zzdkv = this.f8292e;
        zzdkv.f8342a = zzauz.f6151b;
        if (((Boolean) zzwg.e().c(zzaav.p0)).booleanValue()) {
            zzdkv.f8343b = zzauz.f6152c;
        }
    }

    public final synchronized void b7(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        Preconditions.f("#008 Must be called on the main UI thread.");
        if (this.g == null) {
            zzbba.i("Rewarded can not be shown before loaded");
            this.f8290c.c(new zzuy(2, "The ad is not ready.", "com.google.android.gms.ads"));
            return;
        }
        this.g.j(z, (Activity) ObjectWrapper.V(iObjectWrapper));
    }

    public final void e1(zzxx zzxx) {
        if (zzxx == null) {
            this.f8290c.e((AdMetadataListener) null);
        } else {
            this.f8290c.e(new iw(this, zzxx));
        }
    }

    public final void e5(zzauj zzauj) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        this.f8290c.i(zzauj);
    }

    public final Bundle getAdMetadata() {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzchj zzchj = this.g;
        return zzchj != null ? zzchj.g() : new Bundle();
    }

    public final synchronized String getMediationAdapterClassName() throws RemoteException {
        if (this.g == null || this.g.d() == null) {
            return null;
        }
        return this.g.d().getMediationAdapterClassName();
    }

    public final boolean isLoaded() {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzchj zzchj = this.g;
        return zzchj != null && !zzchj.i();
    }

    public final synchronized void k1(zzve zzve, zzauq zzauq) throws RemoteException {
        h7(zzve, zzauq, zzdks.f8335c);
    }

    public final synchronized void l2(IObjectWrapper iObjectWrapper) throws RemoteException {
        b7(iObjectWrapper, false);
    }

    public final synchronized void o0(zzve zzve, zzauq zzauq) throws RemoteException {
        h7(zzve, zzauq, zzdks.f8334b);
    }

    public final void q6(zzaur zzaur) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        this.f8290c.k(zzaur);
    }

    public final void zza(zzyc zzyc) {
        Preconditions.f("setOnPaidEventListener must be called on the main UI thread.");
        this.f8290c.l(zzyc);
    }

    public final zzyd zzkj() {
        zzchj zzchj;
        if (((Boolean) zzwg.e().c(zzaav.C3)).booleanValue() && (zzchj = this.g) != null) {
            return zzchj.d();
        }
        return null;
    }
}
