package com.google.android.gms.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.gcm.zzd;
import com.google.android.gms.internal.gcm.zze;

public final class zzm extends zzd implements zzl {
    zzm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.iid.IMessengerCompat");
    }

    public final void h1(Message message) throws RemoteException {
        Parcel y = y();
        zze.a(y, message);
        P(1, y);
    }
}
