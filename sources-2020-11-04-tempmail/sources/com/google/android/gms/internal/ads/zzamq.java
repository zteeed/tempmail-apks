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

    public static zzamr e7(IBinder iBinder) {
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
            zzams O6 = O6(parcel.readString());
            parcel2.writeNoException();
            zzgw.c(parcel2, O6);
        } else if (i == 2) {
            boolean s4 = s4(parcel.readString());
            parcel2.writeNoException();
            zzgw.a(parcel2, s4);
        } else if (i != 3) {
            return false;
        } else {
            zzaox g3 = g3(parcel.readString());
            parcel2.writeNoException();
            zzgw.c(parcel2, g3);
        }
        return true;
    }
}
