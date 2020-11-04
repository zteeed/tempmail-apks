package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzsi extends zzgu implements zzsg {
    zzsi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public final void G4(int i) throws RemoteException {
        Parcel B = B();
        B.writeInt(i);
        V(2, B);
    }

    public final void V5(zzsf zzsf) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzsf);
        V(1, B);
    }
}
