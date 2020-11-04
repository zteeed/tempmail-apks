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

    public final IBinder q5(IObjectWrapper iObjectWrapper, zzvh zzvh, String str, zzamr zzamr, int i, int i2) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        zzgw.d(y, zzvh);
        y.writeString(str);
        zzgw.c(y, zzamr);
        y.writeInt(i);
        y.writeInt(i2);
        Parcel E = E(2, y);
        IBinder readStrongBinder = E.readStrongBinder();
        E.recycle();
        return readStrongBinder;
    }
}
