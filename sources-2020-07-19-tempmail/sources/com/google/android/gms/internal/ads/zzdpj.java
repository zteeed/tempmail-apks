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

    public final IObjectWrapper I2(String str, IObjectWrapper iObjectWrapper, String str2, String str3, String str4, String str5) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        zzgw.c(y, iObjectWrapper);
        y.writeString(str2);
        y.writeString(str3);
        y.writeString(str4);
        y.writeString(str5);
        Parcel E = E(9, y);
        IObjectWrapper E2 = IObjectWrapper.Stub.E(E.readStrongBinder());
        E.recycle();
        return E2;
    }

    public final void M0(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        zzgw.c(y, iObjectWrapper2);
        P(8, y);
    }

    public final void N1(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        zzgw.c(y, iObjectWrapper2);
        P(5, y);
    }

    public final String e6() throws RemoteException {
        Parcel E = E(6, y());
        String readString = E.readString();
        E.recycle();
        return readString;
    }

    public final void h4(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        P(7, y);
    }

    public final boolean i5(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        Parcel E = E(2, y);
        boolean e2 = zzgw.e(E);
        E.recycle();
        return e2;
    }

    public final void t6(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        P(4, y);
    }
}
