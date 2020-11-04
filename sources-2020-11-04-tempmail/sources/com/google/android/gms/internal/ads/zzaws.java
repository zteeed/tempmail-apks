package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzaws extends zzgu implements zzawq {
    zzaws(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    public final void T(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        B.writeString(str2);
        zzgw.d(B, bundle);
        V(3, B);
    }

    public final void U6(String str, String str2) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        B.writeString(str2);
        V(1, B);
    }

    public final void onError(String str) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        V(2, B);
    }
}
