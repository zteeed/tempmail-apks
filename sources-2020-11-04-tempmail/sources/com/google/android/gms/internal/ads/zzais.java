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

    public final void R4(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        V(6, B);
    }

    public final void destroy() throws RemoteException {
        V(4, B());
    }

    public final zzyi getVideoController() throws RemoteException {
        Parcel H = H(3, B());
        zzyi e7 = zzyh.e7(H.readStrongBinder());
        H.recycle();
        return e7;
    }

    public final zzado l0() throws RemoteException {
        Parcel H = H(7, B());
        zzado e7 = zzadr.e7(H.readStrongBinder());
        H.recycle();
        return e7;
    }

    public final void z5(IObjectWrapper iObjectWrapper, zzaiv zzaiv) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        zzgw.c(B, zzaiv);
        V(5, B);
    }
}
