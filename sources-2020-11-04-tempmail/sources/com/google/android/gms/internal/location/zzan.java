package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzan extends zzb implements zzam {
    public zzan() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean B(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            d6(parcel.readInt(), parcel.createStringArray());
        } else if (i == 2) {
            c7(parcel.readInt(), parcel.createStringArray());
        } else if (i != 3) {
            return false;
        } else {
            r3(parcel.readInt(), (PendingIntent) zzc.a(parcel, PendingIntent.CREATOR));
        }
        return true;
    }
}
