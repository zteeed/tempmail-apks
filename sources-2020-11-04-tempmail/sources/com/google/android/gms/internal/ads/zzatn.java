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

    public final IBinder C5(IObjectWrapper iObjectWrapper, zzamr zzamr, int i) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        zzgw.c(B, zzamr);
        B.writeInt(i);
        Parcel H = H(1, B);
        IBinder readStrongBinder = H.readStrongBinder();
        H.recycle();
        return readStrongBinder;
    }
}
