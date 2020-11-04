package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
public final class zzy extends zza implements zzw {
    zzy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    public final void B(Bundle bundle) throws RemoteException {
        Parcel y = y();
        zzb.c(y, bundle);
        P(1, y);
    }
}
