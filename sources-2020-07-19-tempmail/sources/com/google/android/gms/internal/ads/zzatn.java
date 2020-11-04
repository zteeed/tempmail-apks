package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzatn extends zzgu implements zzato {
    zzatn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
    }

    public final IBinder f5(IObjectWrapper iObjectWrapper, zzamr zzamr, int i) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        zzgw.c(y, zzamr);
        y.writeInt(i);
        Parcel E = E(1, y);
        IBinder readStrongBinder = E.readStrongBinder();
        E.recycle();
        return readStrongBinder;
    }
}
