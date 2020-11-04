package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzabq extends zzgu implements zzabo {
    zzabq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    public final void k2(zzabn zzabn) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzabn);
        P(1, y);
    }
}
