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

    public final IObjectWrapper E2() throws RemoteException {
        Parcel H = H(1, B());
        IObjectWrapper H2 = IObjectWrapper.Stub.H(H.readStrongBinder());
        H.recycle();
        return H2;
    }

    public final double S3() throws RemoteException {
        Parcel H = H(3, B());
        double readDouble = H.readDouble();
        H.recycle();
        return readDouble;
    }

    public final int getHeight() throws RemoteException {
        Parcel H = H(5, B());
        int readInt = H.readInt();
        H.recycle();
        return readInt;
    }

    public final int getWidth() throws RemoteException {
        Parcel H = H(4, B());
        int readInt = H.readInt();
        H.recycle();
        return readInt;
    }

    public final Uri k0() throws RemoteException {
        Parcel H = H(2, B());
        Uri uri = (Uri) zzgw.b(H, Uri.CREATOR);
        H.recycle();
        return uri;
    }
}
