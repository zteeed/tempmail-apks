package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcwt extends zzwn {

    /* renamed from: b  reason: collision with root package name */
    private final zzcxj f7848b;

    public zzcwt(Context context, zzbif zzbif, zzdlc zzdlc, zzccv zzccv, zzwj zzwj) {
        zzcxl zzcxl = new zzcxl(zzccv);
        zzcxl.h(zzwj);
        this.f7848b = new zzcxj(new zzcxr(zzbif, context, zzcxl, zzdlc), zzdlc.c());
    }

    public final synchronized void d5(zzve zzve, int i) throws RemoteException {
        this.f7848b.d(zzve, i);
    }

    public final synchronized String getMediationAdapterClassName() {
        return this.f7848b.a();
    }

    public final synchronized boolean isLoading() throws RemoteException {
        return this.f7848b.b();
    }

    public final void x6(zzve zzve) throws RemoteException {
        this.f7848b.d(zzve, 1);
    }

    public final synchronized String zzki() {
        return this.f7848b.f();
    }
}
