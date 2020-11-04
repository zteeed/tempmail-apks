package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzadn extends zzgu implements zzadl {
    zzadn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public final String O0() throws RemoteException {
        Parcel H = H(2, B());
        String readString = H.readString();
        H.recycle();
        return readString;
    }

    public final List<zzadt> Z6() throws RemoteException {
        Parcel H = H(3, B());
        ArrayList f2 = zzgw.f(H);
        H.recycle();
        return f2;
    }
}
