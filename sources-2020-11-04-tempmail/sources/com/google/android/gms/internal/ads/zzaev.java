package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzaev extends zzgu implements zzaet {
    zzaev(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    public final void X1(zzaeh zzaeh) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzaeh);
        V(1, B);
    }
}
