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

    public final void N3(LocationAvailability locationAvailability) throws RemoteException {
        Parcel B = B();
        zzc.b(B, locationAvailability);
        V(2, B);
    }

    public final void a5(LocationResult locationResult) throws RemoteException {
        Parcel B = B();
        zzc.b(B, locationResult);
        V(1, B);
    }
}
