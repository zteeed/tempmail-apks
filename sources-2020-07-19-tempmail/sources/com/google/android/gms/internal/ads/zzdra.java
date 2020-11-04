package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
public final class zzdra extends zzgu implements zzdqx {
    zzdra(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final void I0(zzdqs zzdqs) throws RemoteException {
        Parcel y = y();
        zzgw.d(y, zzdqs);
        P(2, y);
    }

    public final zzdqv p6(zzdqt zzdqt) throws RemoteException {
        Parcel y = y();
        zzgw.d(y, zzdqt);
        Parcel E = E(1, y);
        zzdqv zzdqv = (zzdqv) zzgw.b(E, zzdqv.CREATOR);
        E.recycle();
        return zzdqv;
    }

    public final zzdrf q0(zzdrd zzdrd) throws RemoteException {
        Parcel y = y();
        zzgw.d(y, zzdrd);
        Parcel E = E(3, y);
        zzdrf zzdrf = (zzdrf) zzgw.b(E, zzdrf.CREATOR);
        E.recycle();
        return zzdrf;
    }
}
