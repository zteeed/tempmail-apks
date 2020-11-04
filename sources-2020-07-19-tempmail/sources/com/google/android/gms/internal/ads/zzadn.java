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

    public final String H0() throws RemoteException {
        Parcel E = E(2, y());
        String readString = E.readString();
        E.recycle();
        return readString;
    }

    public final List<zzadt> v6() throws RemoteException {
        Parcel E = E(3, y());
        ArrayList f2 = zzgw.f(E);
        E.recycle();
        return f2;
    }
}
