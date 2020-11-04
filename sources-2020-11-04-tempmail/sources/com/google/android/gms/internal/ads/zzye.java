package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzye extends zzgu implements zzyc {
    zzye(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public final void h3(zzvj zzvj) throws RemoteException {
        Parcel B = B();
        zzgw.d(B, zzvj);
        V(1, B);
    }
}
