package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzasi extends zzgu implements zzasg {
    zzasi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    public final void k5(zzazi zzazi) throws RemoteException {
        Parcel y = y();
        zzgw.d(y, zzazi);
        P(2, y);
    }

    public final void r0(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel y = y();
        zzgw.d(y, parcelFileDescriptor);
        P(1, y);
    }
}
