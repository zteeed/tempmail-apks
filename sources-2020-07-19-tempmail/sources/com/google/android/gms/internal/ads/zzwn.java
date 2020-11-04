package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public abstract class zzwn extends zzgt implements zzwo {
    public zzwn() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            X5((zzve) zzgw.b(parcel, zzve.CREATOR));
            parcel2.writeNoException();
        } else if (i == 2) {
            String mediationAdapterClassName = getMediationAdapterClassName();
            parcel2.writeNoException();
            parcel2.writeString(mediationAdapterClassName);
        } else if (i == 3) {
            boolean isLoading = isLoading();
            parcel2.writeNoException();
            zzgw.a(parcel2, isLoading);
        } else if (i == 4) {
            String zzki = zzki();
            parcel2.writeNoException();
            parcel2.writeString(zzki);
        } else if (i != 5) {
            return false;
        } else {
            J4((zzve) zzgw.b(parcel, zzve.CREATOR), parcel.readInt());
            parcel2.writeNoException();
        }
        return true;
    }
}
