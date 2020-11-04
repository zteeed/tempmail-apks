package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzaot extends zzgu implements zzaor {
    zzaot(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    public final void n4(zzang zzang) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzang);
        P(1, y);
    }

    public final void q(String str) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        P(2, y);
    }
}
