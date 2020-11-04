package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zztc extends zzgu implements zztd {
    zztc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final zzsx C0(zzsy zzsy) throws RemoteException {
        Parcel B = B();
        zzgw.d(B, zzsy);
        Parcel H = H(1, B);
        zzsx zzsx = (zzsx) zzgw.b(H, zzsx.CREATOR);
        H.recycle();
        return zzsx;
    }
}
