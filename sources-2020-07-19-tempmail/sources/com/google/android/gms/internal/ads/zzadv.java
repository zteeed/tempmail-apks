package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzadv extends zzgu implements zzadt {
    zzadv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public final double E3() throws RemoteException {
        Parcel E = E(3, y());
        double readDouble = E.readDouble();
        E.recycle();
        return readDouble;
    }

    public final Uri e0() throws RemoteException {
        Parcel E = E(2, y());
        Uri uri = (Uri) zzgw.b(E, Uri.CREATOR);
        E.recycle();
        return uri;
    }

    public final int getHeight() throws RemoteException {
        Parcel E = E(5, y());
        int readInt = E.readInt();
        E.recycle();
        return readInt;
    }

    public final int getWidth() throws RemoteException {
        Parcel E = E(4, y());
        int readInt = E.readInt();
        E.recycle();
        return readInt;
    }

    public final IObjectWrapper s2() throws RemoteException {
        Parcel E = E(1, y());
        IObjectWrapper E2 = IObjectWrapper.Stub.E(E.readStrongBinder());
        E.recycle();
        return E2;
    }
}
