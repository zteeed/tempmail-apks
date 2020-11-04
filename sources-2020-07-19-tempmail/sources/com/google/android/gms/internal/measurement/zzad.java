package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
public final class zzad extends zza implements zzab {
    zzad(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    public final int a() throws RemoteException {
        Parcel E = E(2, y());
        int readInt = E.readInt();
        E.recycle();
        return readInt;
    }

    public final void a4(String str, String str2, Bundle bundle, long j) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        y.writeString(str2);
        zzb.c(y, bundle);
        y.writeLong(j);
        P(1, y);
    }
}
