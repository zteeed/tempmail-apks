package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzapa extends zzgu implements zzaoy {
    zzapa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    public final void B4(String str) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        P(1, y);
    }

    public final void onFailure(String str) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        P(2, y);
    }
}
