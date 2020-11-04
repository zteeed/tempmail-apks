package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

public final class zzl extends zza implements IGmsCallbacks {
    zzl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    public final void J2(int i, IBinder iBinder, zzb zzb) throws RemoteException {
        Parcel y = y();
        y.writeInt(i);
        y.writeStrongBinder(iBinder);
        zzc.d(y, zzb);
        P(3, y);
    }

    public final void a3(int i, Bundle bundle) throws RemoteException {
        Parcel y = y();
        y.writeInt(i);
        zzc.d(y, bundle);
        P(2, y);
    }

    public final void x3(int i, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel y = y();
        y.writeInt(i);
        y.writeStrongBinder(iBinder);
        zzc.d(y, bundle);
        P(1, y);
    }
}
