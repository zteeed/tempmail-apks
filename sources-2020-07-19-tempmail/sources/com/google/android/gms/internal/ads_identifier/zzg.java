package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzg extends zza implements zze {
    zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    public final boolean c() throws RemoteException {
        Parcel E = E(6, y());
        boolean b2 = zzc.b(E);
        E.recycle();
        return b2;
    }

    public final String g() throws RemoteException {
        Parcel E = E(1, y());
        String readString = E.readString();
        E.recycle();
        return readString;
    }

    public final boolean q2(boolean z) throws RemoteException {
        Parcel y = y();
        zzc.a(y, true);
        Parcel E = E(2, y);
        boolean b2 = zzc.b(E);
        E.recycle();
        return b2;
    }
}
