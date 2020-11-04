package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzabq extends zzgu implements zzabo {
    zzabq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    public final void u2(zzabn zzabn) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzabn);
        V(1, B);
    }
}
