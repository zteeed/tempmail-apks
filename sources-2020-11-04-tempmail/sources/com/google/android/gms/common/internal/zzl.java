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

    public final void L3(int i, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel B = B();
        B.writeInt(i);
        B.writeStrongBinder(iBinder);
        zzc.d(B, bundle);
        V(1, B);
    }

    public final void V2(int i, IBinder iBinder, zzb zzb) throws RemoteException {
        Parcel B = B();
        B.writeInt(i);
        B.writeStrongBinder(iBinder);
        zzc.d(B, zzb);
        V(3, B);
    }

    public final void m3(int i, Bundle bundle) throws RemoteException {
        Parcel B = B();
        B.writeInt(i);
        zzc.d(B, bundle);
        V(2, B);
    }
}
