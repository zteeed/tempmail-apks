package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public abstract class zzxw extends zzgt implements zzxt {
    public zzxw() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    public static zzxt e7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        if (queryLocalInterface instanceof zzxt) {
            return (zzxt) queryLocalInterface;
        }
        return new zzxv(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String description = getDescription();
            parcel2.writeNoException();
            parcel2.writeString(description);
        } else if (i != 2) {
            return false;
        } else {
            String K0 = K0();
            parcel2.writeNoException();
            parcel2.writeString(K0);
        }
        return true;
    }
}
