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

    public final void G5(zzazi zzazi) throws RemoteException {
        Parcel B = B();
        zzgw.d(B, zzazi);
        V(2, B);
    }

    public final void x0(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel B = B();
        zzgw.d(B, parcelFileDescriptor);
        V(1, B);
    }
}
