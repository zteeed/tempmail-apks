package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzabp extends zzgu implements zzabn {
    zzabp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    public final void Y1(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        V(3, B);
    }

    public final String getContent() throws RemoteException {
        Parcel H = H(2, B());
        String readString = H.readString();
        H.recycle();
        return readString;
    }

    public final String l1() throws RemoteException {
        Parcel H = H(1, B());
        String readString = H.readString();
        H.recycle();
        return readString;
    }

    public final void recordClick() throws RemoteException {
        V(4, B());
    }

    public final void recordImpression() throws RemoteException {
        V(5, B());
    }
}
