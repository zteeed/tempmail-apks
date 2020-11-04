package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.location.zza;
import com.google.android.gms.internal.location.zzc;

public final class zzz extends zza implements zzx {
    zzz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationListener");
    }

    public final void z6(Location location) throws RemoteException {
        Parcel B = B();
        zzc.b(B, location);
        V(1, B);
    }
}
