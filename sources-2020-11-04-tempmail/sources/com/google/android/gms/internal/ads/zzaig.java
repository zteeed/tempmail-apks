package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzaig extends zzgu implements zzaie {
    zzaig(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    public final void onInitializationFailed(String str) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        V(3, B);
    }

    public final void onInitializationSucceeded() throws RemoteException {
        V(2, B());
    }
}
