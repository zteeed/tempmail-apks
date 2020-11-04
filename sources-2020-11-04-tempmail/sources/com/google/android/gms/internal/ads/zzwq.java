package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzwq extends zzgu implements zzwo {
    zzwq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    public final void d5(zzve zzve, int i) throws RemoteException {
        Parcel B = B();
        zzgw.d(B, zzve);
        B.writeInt(i);
        V(5, B);
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        Parcel H = H(2, B());
        String readString = H.readString();
        H.recycle();
        return readString;
    }

    public final boolean isLoading() throws RemoteException {
        Parcel H = H(3, B());
        boolean e2 = zzgw.e(H);
        H.recycle();
        return e2;
    }

    public final void x6(zzve zzve) throws RemoteException {
        Parcel B = B();
        zzgw.d(B, zzve);
        V(1, B);
    }

    public final String zzki() throws RemoteException {
        Parcel H = H(4, B());
        String readString = H.readString();
        H.recycle();
        return readString;
    }
}
