package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzail extends zzgu implements zzaij {
    zzail(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public final void c0(List<zzaic> list) throws RemoteException {
        Parcel y = y();
        y.writeTypedList(list);
        P(1, y);
    }
}
