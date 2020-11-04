package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzxa extends zzgu implements zzwx {
    zzxa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder M5(IObjectWrapper iObjectWrapper, zzvh zzvh, String str, zzamr zzamr, int i, int i2) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        zzgw.d(B, zzvh);
        B.writeString(str);
        zzgw.c(B, zzamr);
        B.writeInt(i);
        B.writeInt(i2);
        Parcel H = H(2, B);
        IBinder readStrongBinder = H.readStrongBinder();
        H.recycle();
        return readStrongBinder;
    }
}
