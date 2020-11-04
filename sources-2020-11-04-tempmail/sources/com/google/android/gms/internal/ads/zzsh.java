package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzsh extends zzgu implements zzsf {
    zzsh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    public final zzww i5() throws RemoteException {
        Parcel H = H(2, B());
        zzww zzc = zzwv.zzc(H.readStrongBinder());
        H.recycle();
        return zzc;
    }

    public final void w5(zzsl zzsl) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzsl);
        V(3, B);
    }
}
