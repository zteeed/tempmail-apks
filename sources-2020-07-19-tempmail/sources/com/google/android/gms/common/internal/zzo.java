package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.zzk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

public final class zzo extends zza implements zzm {
    zzo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    public final boolean D1(zzk zzk, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = y();
        zzc.d(y, zzk);
        zzc.c(y, iObjectWrapper);
        Parcel E = E(5, y);
        boolean e2 = zzc.e(E);
        E.recycle();
        return e2;
    }
}
