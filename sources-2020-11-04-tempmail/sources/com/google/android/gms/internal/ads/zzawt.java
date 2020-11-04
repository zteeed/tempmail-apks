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

    public final void C4(zzark zzark) throws RemoteException {
        Parcel B = B();
        zzgw.d(B, zzark);
        V(7, B);
    }

    public final void N1(List<Uri> list, IObjectWrapper iObjectWrapper, zzaqz zzaqz) throws RemoteException {
        Parcel B = B();
        B.writeTypedList(list);
        zzgw.c(B, iObjectWrapper);
        zzgw.c(B, zzaqz);
        V(6, B);
    }

    public final IObjectWrapper Q2(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        zzgw.c(B, iObjectWrapper2);
        Parcel H = H(3, B);
        IObjectWrapper H2 = IObjectWrapper.Stub.H(H.readStrongBinder());
        H.recycle();
        return H2;
    }

    public final void X2(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        V(2, B);
    }

    public final void Y0(List<Uri> list, IObjectWrapper iObjectWrapper, zzaqz zzaqz) throws RemoteException {
        Parcel B = B();
        B.writeTypedList(list);
        zzgw.c(B, iObjectWrapper);
        zzgw.c(B, zzaqz);
        V(5, B);
    }

    public final void Z4(IObjectWrapper iObjectWrapper, zzawx zzawx, zzawq zzawq) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        zzgw.d(B, zzawx);
        zzgw.c(B, zzawq);
        V(1, B);
    }

    public final IObjectWrapper q0(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        Parcel H = H(4, B);
        IObjectWrapper H2 = IObjectWrapper.Stub.H(H.readStrongBinder());
        H.recycle();
        return H2;
    }
}
