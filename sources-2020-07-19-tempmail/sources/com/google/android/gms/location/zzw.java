package com.google.android.gms.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.location.zza;
import com.google.android.gms.internal.location.zzc;

public final class zzw extends zza implements zzu {
    zzw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationCallback");
    }

    public final void G4(LocationResult locationResult) throws RemoteException {
        Parcel y = y();
        zzc.b(y, locationResult);
        P(1, y);
    }

    public final void z3(LocationAvailability locationAvailability) throws RemoteException {
        Parcel y = y();
        zzc.b(y, locationAvailability);
        P(2, y);
    }
}
