package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public abstract class zzamq extends zzgt implements zzamr {
    public zzamq() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzamr z6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        if (queryLocalInterface instanceof zzamr) {
            return (zzamr) queryLocalInterface;
        }
        return new zzamt(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzams m6 = m6(parcel.readString());
            parcel2.writeNoException();
            zzgw.c(parcel2, m6);
        } else if (i == 2) {
            boolean Y3 = Y3(parcel.readString());
            parcel2.writeNoException();
            zzgw.a(parcel2, Y3);
        } else if (i != 3) {
            return false;
        } else {
            zzaox U2 = U2(parcel.readString());
            parcel2.writeNoException();
            zzgw.c(parcel2, U2);
        }
        return true;
    }
}
