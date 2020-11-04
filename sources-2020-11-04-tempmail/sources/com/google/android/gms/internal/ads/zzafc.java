package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzafc extends zzgu implements zzafa {
    zzafc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    public final void w1(zzaep zzaep) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzaep);
        V(1, B);
    }
}
