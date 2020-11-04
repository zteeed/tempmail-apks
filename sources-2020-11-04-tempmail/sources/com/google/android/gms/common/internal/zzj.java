package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

public abstract class zzj extends zzb implements zzi {
    public zzj() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static zzi H(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        if (queryLocalInterface instanceof zzi) {
            return (zzi) queryLocalInterface;
        }
        return new zzk(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean B(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            IObjectWrapper b2 = b();
            parcel2.writeNoException();
            zzc.c(parcel2, b2);
        } else if (i != 2) {
            return false;
        } else {
            int c2 = c();
            parcel2.writeNoException();
            parcel2.writeInt(c2);
        }
        return true;
    }
}
