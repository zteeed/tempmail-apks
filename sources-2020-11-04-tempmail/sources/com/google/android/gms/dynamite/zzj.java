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

    public final int O3(IObjectWrapper iObjectWrapper, String str, boolean z) throws RemoteException {
        Parcel B = B();
        zzc.c(B, iObjectWrapper);
        B.writeString(str);
        zzc.a(B, z);
        Parcel H = H(5, B);
        int readInt = H.readInt();
        H.recycle();
        return readInt;
    }

    public final int O4(IObjectWrapper iObjectWrapper, String str, boolean z) throws RemoteException {
        Parcel B = B();
        zzc.c(B, iObjectWrapper);
        B.writeString(str);
        zzc.a(B, z);
        Parcel H = H(3, B);
        int readInt = H.readInt();
        H.recycle();
        return readInt;
    }

    public final IObjectWrapper f5(IObjectWrapper iObjectWrapper, String str, int i) throws RemoteException {
        Parcel B = B();
        zzc.c(B, iObjectWrapper);
        B.writeString(str);
        B.writeInt(i);
        Parcel H = H(4, B);
        IObjectWrapper H2 = IObjectWrapper.Stub.H(H.readStrongBinder());
        H.recycle();
        return H2;
    }

    public final IObjectWrapper w2(IObjectWrapper iObjectWrapper, String str, int i) throws RemoteException {
        Parcel B = B();
        zzc.c(B, iObjectWrapper);
        B.writeString(str);
        B.writeInt(i);
        Parcel H = H(2, B);
        IObjectWrapper H2 = IObjectWrapper.Stub.H(H.readStrongBinder());
        H.recycle();
        return H2;
    }

    public final int y6() throws RemoteException {
        Parcel H = H(6, B());
        int readInt = H.readInt();
        H.recycle();
        return readInt;
    }
}
