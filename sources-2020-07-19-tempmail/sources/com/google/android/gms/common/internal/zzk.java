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
        Parcel E = E(1, y());
        IObjectWrapper E2 = IObjectWrapper.Stub.E(E.readStrongBinder());
        E.recycle();
        return E2;
    }

    public final int c() throws RemoteException {
        Parcel E = E(2, y());
        int readInt = E.readInt();
        E.recycle();
        return readInt;
    }
}
