package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzais extends zzgu implements zzaiq {
    zzais(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    public final void d5(IObjectWrapper iObjectWrapper, zzaiv zzaiv) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        zzgw.c(y, zzaiv);
        P(5, y);
    }

    public final void destroy() throws RemoteException {
        P(4, y());
    }

    public final zzado f0() throws RemoteException {
        Parcel E = E(7, y());
        zzado z6 = zzadr.z6(E.readStrongBinder());
        E.recycle();
        return z6;
    }

    public final zzyi getVideoController() throws RemoteException {
        Parcel E = E(3, y());
        zzyi z6 = zzyh.z6(E.readStrongBinder());
        E.recycle();
        return z6;
    }

    public final void x4(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        P(6, y);
    }
}
