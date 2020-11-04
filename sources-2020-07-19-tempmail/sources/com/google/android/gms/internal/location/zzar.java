package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.LocationSettingsResult;

public abstract class zzar extends zzb implements zzaq {
    public zzar() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        C2((LocationSettingsResult) zzc.a(parcel, LocationSettingsResult.CREATOR));
        return true;
    }
}
