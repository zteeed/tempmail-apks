package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzawt extends zzgu implements zzawr {
    zzawt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public final void E1(List<Uri> list, IObjectWrapper iObjectWrapper, zzaqz zzaqz) throws RemoteException {
        Parcel y = y();
        y.writeTypedList(list);
        zzgw.c(y, iObjectWrapper);
        zzgw.c(y, zzaqz);
        P(6, y);
    }

    public final IObjectWrapper F2(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        zzgw.c(y, iObjectWrapper2);
        Parcel E = E(3, y);
        IObjectWrapper E2 = IObjectWrapper.Stub.E(E.readStrongBinder());
        E.recycle();
        return E2;
    }

    public final void F4(IObjectWrapper iObjectWrapper, zzawx zzawx, zzawq zzawq) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        zzgw.d(y, zzawx);
        zzgw.c(y, zzawq);
        P(1, y);
    }

    public final void L2(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        P(2, y);
    }

    public final void R0(List<Uri> list, IObjectWrapper iObjectWrapper, zzaqz zzaqz) throws RemoteException {
        Parcel y = y();
        y.writeTypedList(list);
        zzgw.c(y, iObjectWrapper);
        zzgw.c(y, zzaqz);
        P(5, y);
    }

    public final void i4(zzark zzark) throws RemoteException {
        Parcel y = y();
        zzgw.d(y, zzark);
        P(7, y);
    }

    public final IObjectWrapper k0(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        Parcel E = E(4, y);
        IObjectWrapper E2 = IObjectWrapper.Stub.E(E.readStrongBinder());
        E.recycle();
        return E2;
    }
}
