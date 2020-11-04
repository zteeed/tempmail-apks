package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzaiy extends zzgu implements zzaiw {
    zzaiy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    public final void e4(zzaiq zzaiq) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzaiq);
        V(1, B);
    }

    public final void r6(int i) throws RemoteException {
        Parcel B = B();
        B.writeInt(i);
        V(2, B);
    }
}
