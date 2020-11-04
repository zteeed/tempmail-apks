package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzap extends zza implements zzao {
    zzap(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    public final void T4(boolean z) throws RemoteException {
        Parcel y = y();
        zzc.c(y, z);
        E(12, y);
    }

    public final void n3(zzo zzo) throws RemoteException {
        Parcel y = y();
        zzc.b(y, zzo);
        E(75, y);
    }

    public final void r5(zzbf zzbf) throws RemoteException {
        Parcel y = y();
        zzc.b(y, zzbf);
        E(59, y);
    }
}
