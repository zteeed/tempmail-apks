package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzaot extends zzgu implements zzaor {
    zzaot(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    public final void H4(zzang zzang) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzang);
        V(1, B);
    }

    public final void s(String str) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        V(2, B);
    }
}
