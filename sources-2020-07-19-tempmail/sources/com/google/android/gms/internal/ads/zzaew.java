package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzaew extends zzgu implements zzaeu {
    zzaew(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    public final void R4(zzael zzael) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzael);
        P(1, y);
    }
}
