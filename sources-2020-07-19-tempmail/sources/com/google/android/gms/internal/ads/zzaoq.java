package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public abstract class zzaoq extends zzgt implements zzaor {
    public zzaoq() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            n4(zzanj.z6(parcel.readStrongBinder()));
        } else if (i != 2) {
            return false;
        } else {
            q(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
