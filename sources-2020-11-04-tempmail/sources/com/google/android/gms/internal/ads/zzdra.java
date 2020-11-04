package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
public final class zzdra extends zzgu implements zzdqx {
    zzdra(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final void P0(zzdqs zzdqs) throws RemoteException {
        Parcel B = B();
        zzgw.d(B, zzdqs);
        V(2, B);
    }

    public final zzdqv R6(zzdqt zzdqt) throws RemoteException {
        Parcel B = B();
        zzgw.d(B, zzdqt);
        Parcel H = H(1, B);
        zzdqv zzdqv = (zzdqv) zzgw.b(H, zzdqv.CREATOR);
        H.recycle();
        return zzdqv;
    }

    public final zzdrf w0(zzdrd zzdrd) throws RemoteException {
        Parcel B = B();
        zzgw.d(B, zzdrd);
        Parcel H = H(3, B);
        zzdrf zzdrf = (zzdrf) zzgw.b(H, zzdrf.CREATOR);
        H.recycle();
        return zzdrf;
    }
}
