package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

public final class zzl extends zza implements zzk {
    zzl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final IObjectWrapper W0(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel y = y();
        zzc.c(y, iObjectWrapper);
        y.writeString(str);
        y.writeInt(i);
        zzc.c(y, iObjectWrapper2);
        Parcel E = E(2, y);
        IObjectWrapper E2 = IObjectWrapper.Stub.E(E.readStrongBinder());
        E.recycle();
        return E2;
    }

    public final IObjectWrapper c1(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel y = y();
        zzc.c(y, iObjectWrapper);
        y.writeString(str);
        y.writeInt(i);
        zzc.c(y, iObjectWrapper2);
        Parcel E = E(3, y);
        IObjectWrapper E2 = IObjectWrapper.Stub.E(E.readStrongBinder());
        E.recycle();
        return E2;
    }
}
