package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzafb extends zzgu implements zzaez {
    zzafb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public final void V(zzaep zzaep, String str) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzaep);
        y.writeString(str);
        P(1, y);
    }
}
