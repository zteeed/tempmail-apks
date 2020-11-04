package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzafc extends zzgu implements zzafa {
    zzafc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    public final void p1(zzaep zzaep) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzaep);
        P(1, y);
    }
}
