package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public abstract class zzaup extends zzgt implements zzauq {
    public zzaup() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            Q0();
        } else if (i != 2) {
            return false;
        } else {
            U4(parcel.readInt());
        }
        parcel2.writeNoException();
        return true;
    }
}
