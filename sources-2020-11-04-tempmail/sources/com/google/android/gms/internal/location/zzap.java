package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzap extends zza implements zzao {
    zzap(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    public final void D3(zzo zzo) throws RemoteException {
        Parcel B = B();
        zzc.b(B, zzo);
        H(75, B);
    }

    public final void N5(zzbf zzbf) throws RemoteException {
        Parcel B = B();
        zzc.b(B, zzbf);
        H(59, B);
    }

    public final void n5(boolean z) throws RemoteException {
        Parcel B = B();
        zzc.c(B, z);
        H(12, B);
    }
}
