package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzafk extends zzgu implements zzafi {
    zzafk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    public final void y0(zzaft zzaft) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzaft);
        P(1, y);
    }
}
