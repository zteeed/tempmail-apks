package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzbib extends zzgu implements zzbia {
    zzbib(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    public final void P5(IObjectWrapper iObjectWrapper, zzbhy zzbhy) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        zzgw.c(B, zzbhy);
        V(2, B);
    }
}
