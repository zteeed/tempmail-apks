package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzsh extends zzgu implements zzsf {
    zzsh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    public final zzww O4() throws RemoteException {
        Parcel E = E(2, y());
        zzww zzc = zzwv.zzc(E.readStrongBinder());
        E.recycle();
        return zzc;
    }

    public final void b5(zzsl zzsl) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzsl);
        P(3, y);
    }
}
