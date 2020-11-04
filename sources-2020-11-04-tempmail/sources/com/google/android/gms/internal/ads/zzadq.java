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

    public final void P4(zzaff zzaff) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzaff);
        V(9, B);
    }

    public final IObjectWrapper Z2() throws RemoteException {
        Parcel H = H(4, B());
        IObjectWrapper H2 = IObjectWrapper.Stub.H(H.readStrongBinder());
        H.recycle();
        return H2;
    }

    public final void d1(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        V(3, B);
    }

    public final float getAspectRatio() throws RemoteException {
        Parcel H = H(2, B());
        float readFloat = H.readFloat();
        H.recycle();
        return readFloat;
    }

    public final float getCurrentTime() throws RemoteException {
        Parcel H = H(6, B());
        float readFloat = H.readFloat();
        H.recycle();
        return readFloat;
    }

    public final float getDuration() throws RemoteException {
        Parcel H = H(5, B());
        float readFloat = H.readFloat();
        H.recycle();
        return readFloat;
    }

    public final zzyi getVideoController() throws RemoteException {
        Parcel H = H(7, B());
        zzyi e7 = zzyh.e7(H.readStrongBinder());
        H.recycle();
        return e7;
    }

    public final boolean hasVideoContent() throws RemoteException {
        Parcel H = H(8, B());
        boolean e2 = zzgw.e(H);
        H.recycle();
        return e2;
    }
}
