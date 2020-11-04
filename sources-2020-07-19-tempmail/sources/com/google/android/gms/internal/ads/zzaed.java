package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public abstract class zzaed extends zzgt implements zzaea {
    public zzaed() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    public static zzaea z6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        if (queryLocalInterface instanceof zzaea) {
            return (zzaea) queryLocalInterface;
        }
        return new zzaec(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            z(IObjectWrapper.Stub.E(parcel.readStrongBinder()));
        } else if (i == 2) {
            p5();
        } else if (i != 3) {
            return false;
        } else {
            I(IObjectWrapper.Stub.E(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
