package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzwq extends zzgu implements zzwo {
    zzwq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    public final void J4(zzve zzve, int i) throws RemoteException {
        Parcel y = y();
        zzgw.d(y, zzve);
        y.writeInt(i);
        P(5, y);
    }

    public final void X5(zzve zzve) throws RemoteException {
        Parcel y = y();
        zzgw.d(y, zzve);
        P(1, y);
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        Parcel E = E(2, y());
        String readString = E.readString();
        E.recycle();
        return readString;
    }

    public final boolean isLoading() throws RemoteException {
        Parcel E = E(3, y());
        boolean e2 = zzgw.e(E);
        E.recycle();
        return e2;
    }

    public final String zzki() throws RemoteException {
        Parcel E = E(4, y());
        String readString = E.readString();
        E.recycle();
        return readString;
    }
}
