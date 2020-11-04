package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzsi extends zzgu implements zzsg {
    zzsi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public final void m4(int i) throws RemoteException {
        Parcel y = y();
        y.writeInt(i);
        P(2, y);
    }

    public final void x5(zzsf zzsf) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzsf);
        P(1, y);
    }
}
