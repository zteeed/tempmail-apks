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

    public final void P1(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        P(3, y);
    }

    public final String f1() throws RemoteException {
        Parcel E = E(1, y());
        String readString = E.readString();
        E.recycle();
        return readString;
    }

    public final String getContent() throws RemoteException {
        Parcel E = E(2, y());
        String readString = E.readString();
        E.recycle();
        return readString;
    }

    public final void recordClick() throws RemoteException {
        P(4, y());
    }

    public final void recordImpression() throws RemoteException {
        P(5, y());
    }
}
