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

    public final void B0(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        V(7, B);
    }

    public final void C(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        V(3, B);
    }

    public final IObjectWrapper E3(String str) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        Parcel H = H(2, B);
        IObjectWrapper H2 = IObjectWrapper.Stub.H(H.readStrongBinder());
        H.recycle();
        return H2;
    }

    public final void L6(zzado zzado) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzado);
        V(8, B);
    }

    public final void M(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        V(6, B);
    }

    public final void destroy() throws RemoteException {
        V(4, B());
    }

    public final void n3(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        V(9, B);
    }

    public final void x2(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        zzgw.c(B, iObjectWrapper);
        V(1, B);
    }

    public final void z0(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        B.writeInt(i);
        V(5, B);
    }
}
