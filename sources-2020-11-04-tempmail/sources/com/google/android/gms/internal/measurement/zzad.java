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
        Parcel H = H(2, B());
        int readInt = H.readInt();
        H.recycle();
        return readInt;
    }

    public final void u4(String str, String str2, Bundle bundle, long j) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        B.writeString(str2);
        zzb.c(B, bundle);
        B.writeLong(j);
        V(1, B);
    }
}
