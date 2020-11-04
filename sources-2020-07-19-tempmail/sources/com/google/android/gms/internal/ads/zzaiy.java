package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzaiy extends zzgu implements zzaiw {
    zzaiy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    public final void O3(zzaiq zzaiq) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzaiq);
        P(1, y);
    }

    public final void S5(int i) throws RemoteException {
        Parcel y = y();
        y.writeInt(i);
        P(2, y);
    }
}
