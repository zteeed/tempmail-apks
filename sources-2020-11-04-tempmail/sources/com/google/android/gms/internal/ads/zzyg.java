package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public abstract class zzyg extends zzgt implements zzyd {
    public zzyg() {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    public static zzyd e7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        if (queryLocalInterface instanceof zzyd) {
            return (zzyd) queryLocalInterface;
        }
        return new zzyf(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String mediationAdapterClassName = getMediationAdapterClassName();
            parcel2.writeNoException();
            parcel2.writeString(mediationAdapterClassName);
        } else if (i != 2) {
            return false;
        } else {
            String g5 = g5();
            parcel2.writeNoException();
            parcel2.writeString(g5);
        }
        return true;
    }
}
