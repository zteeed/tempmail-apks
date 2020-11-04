package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzatk extends zzgu implements zzath {
    zzatk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void I5(zzatg zzatg, String str, String str2) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzatg);
        B.writeString(str);
        B.writeString(str2);
        V(2, B);
    }
}
