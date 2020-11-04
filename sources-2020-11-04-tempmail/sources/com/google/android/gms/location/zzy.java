package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.location.zzb;
import com.google.android.gms.internal.location.zzc;

public abstract class zzy extends zzb implements zzx {
    public zzy() {
        super("com.google.android.gms.location.ILocationListener");
    }

    public static zzx H(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return queryLocalInterface instanceof zzx ? (zzx) queryLocalInterface : new zzz(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean B(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        z6((Location) zzc.a(parcel, Location.CREATOR));
        return true;
    }
}
