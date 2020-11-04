package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzaeb extends zzgu implements zzady {
    zzaeb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
    }

    public final IBinder c3(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3, int i) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        zzgw.c(y, iObjectWrapper2);
        zzgw.c(y, iObjectWrapper3);
        y.writeInt(i);
        Parcel E = E(1, y);
        IBinder readStrongBinder = E.readStrongBinder();
        E.recycle();
        return readStrongBinder;
    }
}
