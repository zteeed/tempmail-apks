package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzgz extends zzgu implements zzgy {
    zzgz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    public final void G2(int[] iArr) throws RemoteException {
        Parcel y = y();
        y.writeIntArray((int[]) null);
        P(4, y);
    }

    public final void a2(int i) throws RemoteException {
        Parcel y = y();
        y.writeInt(i);
        P(7, y);
    }

    public final void h3() throws RemoteException {
        P(3, y());
    }

    public final void k1(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        y.writeString(str);
        P(2, y);
    }

    public final void o0(byte[] bArr) throws RemoteException {
        Parcel y = y();
        y.writeByteArray(bArr);
        P(5, y);
    }

    public final void r4(int i) throws RemoteException {
        Parcel y = y();
        y.writeInt(i);
        P(6, y);
    }

    public final void w3(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        y.writeString(str);
        y.writeString((String) null);
        P(8, y);
    }
}
