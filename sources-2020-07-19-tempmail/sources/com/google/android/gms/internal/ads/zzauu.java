package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzauu extends zzgu implements zzaur {
    zzauu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    public final void O0(zzaud zzaud, String str, String str2) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzaud);
        y.writeString(str);
        y.writeString(str2);
        P(2, y);
    }
}
