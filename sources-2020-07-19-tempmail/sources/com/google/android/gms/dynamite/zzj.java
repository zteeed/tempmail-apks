package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

public final class zzj extends zza implements zzi {
    zzj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int A3(IObjectWrapper iObjectWrapper, String str, boolean z) throws RemoteException {
        Parcel y = y();
        zzc.c(y, iObjectWrapper);
        y.writeString(str);
        zzc.a(y, z);
        Parcel E = E(5, y);
        int readInt = E.readInt();
        E.recycle();
        return readInt;
    }

    public final IObjectWrapper L4(IObjectWrapper iObjectWrapper, String str, int i) throws RemoteException {
        Parcel y = y();
        zzc.c(y, iObjectWrapper);
        y.writeString(str);
        y.writeInt(i);
        Parcel E = E(4, y);
        IObjectWrapper E2 = IObjectWrapper.Stub.E(E.readStrongBinder());
        E.recycle();
        return E2;
    }

    public final int Y5() throws RemoteException {
        Parcel E = E(6, y());
        int readInt = E.readInt();
        E.recycle();
        return readInt;
    }

    public final IObjectWrapper m2(IObjectWrapper iObjectWrapper, String str, int i) throws RemoteException {
        Parcel y = y();
        zzc.c(y, iObjectWrapper);
        y.writeString(str);
        y.writeInt(i);
        Parcel E = E(2, y);
        IObjectWrapper E2 = IObjectWrapper.Stub.E(E.readStrongBinder());
        E.recycle();
        return E2;
    }

    public final int u4(IObjectWrapper iObjectWrapper, String str, boolean z) throws RemoteException {
        Parcel y = y();
        zzc.c(y, iObjectWrapper);
        y.writeString(str);
        zzc.a(y, z);
        Parcel E = E(3, y);
        int readInt = E.readInt();
        E.recycle();
        return readInt;
    }
}
