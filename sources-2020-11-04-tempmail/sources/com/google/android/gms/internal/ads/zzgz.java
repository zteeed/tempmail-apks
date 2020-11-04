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

    public final void K3(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        B.writeString(str);
        B.writeString((String) null);
        V(8, B);
    }

    public final void L4(int i) throws RemoteException {
        Parcel B = B();
        B.writeInt(i);
        V(6, B);
    }

    public final void R2(int[] iArr) throws RemoteException {
        Parcel B = B();
        B.writeIntArray((int[]) null);
        V(4, B);
    }

    public final void k2(int i) throws RemoteException {
        Parcel B = B();
        B.writeInt(i);
        V(7, B);
    }

    public final void q1(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        B.writeString(str);
        V(2, B);
    }

    public final void u0(byte[] bArr) throws RemoteException {
        Parcel B = B();
        B.writeByteArray(bArr);
        V(5, B);
    }

    public final void x3() throws RemoteException {
        V(3, B());
    }
}
