package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zztc extends zzgu implements zztd {
    zztc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final zzsx w0(zzsy zzsy) throws RemoteException {
        Parcel y = y();
        zzgw.d(y, zzsy);
        Parcel E = E(1, y);
        zzsx zzsx = (zzsx) zzgw.b(E, zzsx.CREATOR);
        E.recycle();
        return zzsx;
    }
}
