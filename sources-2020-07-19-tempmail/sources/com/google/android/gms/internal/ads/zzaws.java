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

    public final void N(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        y.writeString(str2);
        zzgw.d(y, bundle);
        P(3, y);
    }

    public final void onError(String str) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        P(2, y);
    }

    public final void q6(String str, String str2) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        y.writeString(str2);
        P(1, y);
    }
}
