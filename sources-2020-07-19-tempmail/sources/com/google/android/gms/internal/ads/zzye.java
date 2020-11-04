package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzye extends zzgu implements zzyc {
    zzye(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public final void V2(zzvj zzvj) throws RemoteException {
        Parcel y = y();
        zzgw.d(y, zzvj);
        P(1, y);
    }
}
