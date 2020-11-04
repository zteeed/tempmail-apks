package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.location.zzb;
import com.google.android.gms.internal.location.zzc;

public abstract class zzv extends zzb implements zzu {
    public zzv() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public static zzu E(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return queryLocalInterface instanceof zzu ? (zzu) queryLocalInterface : new zzw(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            G4((LocationResult) zzc.a(parcel, LocationResult.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            z3((LocationAvailability) zzc.a(parcel, LocationAvailability.CREATOR));
        }
        return true;
    }
}
