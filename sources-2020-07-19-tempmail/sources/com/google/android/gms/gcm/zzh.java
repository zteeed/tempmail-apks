package com.google.android.gms.gcm;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.gcm.zzd;

public final class zzh extends zzd implements zzg {
    zzh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gcm.INetworkTaskCallback");
    }

    public final void K1(int i) throws RemoteException {
        Parcel y = y();
        y.writeInt(i);
        E(2, y);
    }
}
