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
    private final zzdjq f8106b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdiu f8107c;

    /* renamed from: d  reason: collision with root package name */
    private final String f8108d;

    /* renamed from: e  reason: collision with root package name */
    private final zzdkv f8109e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f8110f;
    /* access modifiers changed from: private */
    @GuardedBy("this")
    public zzchj g;

    public zzdjy(String str, zzdjq zzdjq, Context context, zzdiu zzdiu, zzdkv zzdkv) {
        this.f8108d = str;
        this.f8106b = zzdjq;
        this.f8107c = zzdiu;
        this.f8109e = zzdkv;
        this.f8110f = context;
    }

    private final synchronized void C6(zzve zzve, zzauq zzauq, int i) throws RemoteException {
        Preconditions.f("#008 Must be called on the main UI thread.");
        this.f8107c.j(zzauq);
        zzq.zzkw();
        if (zzaye.M(this.f8110f) && zzve.t == null) {
            zzbba.g("Failed to load the ad because app ID is missing.");
            this.f8107c.onAdFailedToLoad(8);
        } else if (this.g == null) {
            zzdjn zzdjn = new zzdjn((String) null);
            this.f8106b.h(i);
            this.f8106b.a(zzve, this.f8108d, zzdjn, new kw(this));
        }
    }

    public final synchronized void B5(zzauz zzauz) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzdkv zzdkv = this.f8109e;
        zzdkv.f8159a = zzauz.f5968b;
        if (((Boolean) zzwg.e().c(zzaav.p0)).booleanValue()) {
            zzdkv.f8160b = zzauz.f5969c;
        }
    }

    public final void K4(zzauj zzauj) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        this.f8107c.i(zzauj);
    }

    public final void R5(zzaur zzaur) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        this.f8107c.k(zzaur);
    }

    public final void Y0(zzxx zzxx) {
        if (zzxx == null) {
            this.f8107c.e((AdMetadataListener) null);
        } else {
            this.f8107c.e(new iw(this, zzxx));
        }
    }

    public final synchronized void b2(IObjectWrapper iObjectWrapper) throws RemoteException {
        x6(iObjectWrapper, false);
    }

    public final synchronized void e1(zzve zzve, zzauq zzauq) throws RemoteException {
        C6(zzve, zzauq, zzdks.f8152c);
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

    public final synchronized void i0(zzve zzve, zzauq zzauq) throws RemoteException {
        C6(zzve, zzauq, zzdks.f8151b);
    }

    public final boolean isLoaded() {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzchj zzchj = this.g;
        return zzchj != null && !zzchj.i();
    }

    public final zzaud x2() {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzchj zzchj = this.g;
        if (zzchj != null) {
            return zzchj.k();
        }
        return null;
    }

    public final synchronized void x6(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        Preconditions.f("#008 Must be called on the main UI thread.");
        if (this.g == null) {
            zzbba.i("Rewarded can not be shown before loaded");
            this.f8107c.c(new zzuy(2, "The ad is not ready.", "com.google.android.gms.ads"));
            return;
        }
        this.g.j(z, (Activity) ObjectWrapper.P(iObjectWrapper));
    }

    public final void zza(zzyc zzyc) {
        Preconditions.f("setOnPaidEventListener must be called on the main UI thread.");
        this.f8107c.l(zzyc);
    }

    public final zzyd zzkj() {
        zzchj zzchj;
        if (((Boolean) zzwg.e().c(zzaav.C3)).booleanValue() && (zzchj = this.g) != null) {
            return zzchj.d();
        }
        return null;
    }
}
