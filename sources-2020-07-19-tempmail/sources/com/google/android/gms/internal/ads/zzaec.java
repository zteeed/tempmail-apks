package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzaec extends zzgu implements zzaea {
    zzaec(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    public final void I(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        P(3, y);
    }

    public final void p5() throws RemoteException {
        P(2, y());
    }

    public final void z(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        P(1, y);
    }
}
