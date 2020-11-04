package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzf extends zza implements zzd {
    zzf(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    public final Bundle B(Bundle bundle) throws RemoteException {
        Parcel y = y();
        zzb.c(y, bundle);
        Parcel E = E(1, y);
        Bundle bundle2 = (Bundle) zzb.a(E, Bundle.CREATOR);
        E.recycle();
        return bundle2;
    }
}
