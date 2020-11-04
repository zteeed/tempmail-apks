package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzg extends zza implements zze {
    zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    public final boolean B2(boolean z) throws RemoteException {
        Parcel B = B();
        zzc.a(B, true);
        Parcel H = H(2, B);
        boolean b2 = zzc.b(H);
        H.recycle();
        return b2;
    }

    public final boolean c() throws RemoteException {
        Parcel H = H(6, B());
        boolean b2 = zzc.b(H);
        H.recycle();
        return b2;
    }

    public final String h() throws RemoteException {
        Parcel H = H(1, B());
        String readString = H.readString();
        H.recycle();
        return readString;
    }
}
