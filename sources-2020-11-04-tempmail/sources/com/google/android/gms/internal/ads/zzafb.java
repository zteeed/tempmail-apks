package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzafb extends zzgu implements zzaez {
    zzafb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public final void b0(zzaep zzaep, String str) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzaep);
        B.writeString(str);
        V(1, B);
    }
}
