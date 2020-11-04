package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzal extends zza implements zzaj {
    zzal(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    public final void m1(zzad zzad) throws RemoteException {
        Parcel B = B();
        zzc.b(B, zzad);
        V(1, B);
    }
}
