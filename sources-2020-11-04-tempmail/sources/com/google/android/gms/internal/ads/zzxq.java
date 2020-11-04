package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzxq extends zzgu implements zzxn {
    zzxq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
    }

    public final IBinder H6(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        B.writeInt(i);
        Parcel H = H(1, B);
        IBinder readStrongBinder = H.readStrongBinder();
        H.recycle();
        return readStrongBinder;
    }
}
