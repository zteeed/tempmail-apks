package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public abstract class zzasf extends zzgt implements zzasg {
    public zzasf() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            x0((ParcelFileDescriptor) zzgw.b(parcel, ParcelFileDescriptor.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            G5((zzazi) zzgw.b(parcel, zzazi.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
