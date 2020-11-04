package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzadz extends zzgu implements zzadx {
    zzadz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public final void I(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        P(6, y);
    }

    public final void b3(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        P(9, y);
    }

    public final void destroy() throws RemoteException {
        P(4, y());
    }

    public final void j6(zzado zzado) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzado);
        P(8, y);
    }

    public final void n2(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        zzgw.c(y, iObjectWrapper);
        P(1, y);
    }

    public final IObjectWrapper o3(String str) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        Parcel E = E(2, y);
        IObjectWrapper E2 = IObjectWrapper.Stub.E(E.readStrongBinder());
        E.recycle();
        return E2;
    }

    public final void t0(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        y.writeInt(i);
        P(5, y);
    }

    public final void v0(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        P(7, y);
    }

    public final void z(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        P(3, y);
    }
}
