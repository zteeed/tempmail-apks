package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzadq extends zzgu implements zzado {
    zzadq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    public final IObjectWrapper N2() throws RemoteException {
        Parcel E = E(4, y());
        IObjectWrapper E2 = IObjectWrapper.Stub.E(E.readStrongBinder());
        E.recycle();
        return E2;
    }

    public final void X0(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        P(3, y);
    }

    public final float getAspectRatio() throws RemoteException {
        Parcel E = E(2, y());
        float readFloat = E.readFloat();
        E.recycle();
        return readFloat;
    }

    public final float getCurrentTime() throws RemoteException {
        Parcel E = E(6, y());
        float readFloat = E.readFloat();
        E.recycle();
        return readFloat;
    }

    public final float getDuration() throws RemoteException {
        Parcel E = E(5, y());
        float readFloat = E.readFloat();
        E.recycle();
        return readFloat;
    }

    public final zzyi getVideoController() throws RemoteException {
        Parcel E = E(7, y());
        zzyi z6 = zzyh.z6(E.readStrongBinder());
        E.recycle();
        return z6;
    }

    public final boolean hasVideoContent() throws RemoteException {
        Parcel E = E(8, y());
        boolean e2 = zzgw.e(E);
        E.recycle();
        return e2;
    }

    public final void v4(zzaff zzaff) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzaff);
        P(9, y);
    }
}
