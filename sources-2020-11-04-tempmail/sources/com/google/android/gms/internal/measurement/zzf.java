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

    public final Bundle E(Bundle bundle) throws RemoteException {
        Parcel B = B();
        zzb.c(B, bundle);
        Parcel H = H(1, B);
        Bundle bundle2 = (Bundle) zzb.a(H, Bundle.CREATOR);
        H.recycle();
        return bundle2;
    }
}
