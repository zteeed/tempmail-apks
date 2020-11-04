package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzdpj extends zzgu implements zzdpi {
    zzdpj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.omid.IOmid");
    }

    public final void B4(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        V(7, B);
    }

    public final boolean E5(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        Parcel H = H(2, B);
        boolean e2 = zzgw.e(H);
        H.recycle();
        return e2;
    }

    public final String F6() throws RemoteException {
        Parcel H = H(6, B());
        String readString = H.readString();
        H.recycle();
        return readString;
    }

    public final void T0(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        zzgw.c(B, iObjectWrapper2);
        V(8, B);
    }

    public final IObjectWrapper U2(String str, IObjectWrapper iObjectWrapper, String str2, String str3, String str4, String str5) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        zzgw.c(B, iObjectWrapper);
        B.writeString(str2);
        B.writeString(str3);
        B.writeString(str4);
        B.writeString(str5);
        Parcel H = H(9, B);
        IObjectWrapper H2 = IObjectWrapper.Stub.H(H.readStrongBinder());
        H.recycle();
        return H2;
    }

    public final void W1(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        zzgw.c(B, iObjectWrapper2);
        V(5, B);
    }

    public final void X6(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        V(4, B);
    }
}
