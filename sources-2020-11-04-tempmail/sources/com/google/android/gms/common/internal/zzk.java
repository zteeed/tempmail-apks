package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;

public final class zzk extends zza implements zzi {
    zzk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    public final IObjectWrapper b() throws RemoteException {
        Parcel H = H(1, B());
        IObjectWrapper H2 = IObjectWrapper.Stub.H(H.readStrongBinder());
        H.recycle();
        return H2;
    }

    public final int c() throws RemoteException {
        Parcel H = H(2, B());
        int readInt = H.readInt();
        H.recycle();
        return readInt;
    }
}
