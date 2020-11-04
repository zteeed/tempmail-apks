package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class ug0 extends zzwn {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzze f5068b;

    private ug0(zzze zzze) {
        this.f5068b = zzze;
    }

    public final void J4(zzve zzve, int i) throws RemoteException {
        zzbba.g("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzbaq.f6115b.post(new wg0(this));
    }

    public final void X5(zzve zzve) throws RemoteException {
        J4(zzve, 1);
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        return null;
    }

    public final boolean isLoading() throws RemoteException {
        return false;
    }

    public final String zzki() throws RemoteException {
        return null;
    }
}
