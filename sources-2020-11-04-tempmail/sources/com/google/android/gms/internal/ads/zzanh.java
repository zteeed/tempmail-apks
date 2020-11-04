package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzanh extends zzgu implements zzanf {
    zzanh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public final void D(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        V(9, B);
    }

    public final boolean G() throws RemoteException {
        Parcel H = H(12, B());
        boolean e2 = zzgw.e(H);
        H.recycle();
        return e2;
    }

    public final void O(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        V(10, B);
    }

    public final String e() throws RemoteException {
        Parcel H = H(2, B());
        String readString = H.readString();
        H.recycle();
        return readString;
    }

    public final IObjectWrapper f() throws RemoteException {
        Parcel H = H(21, B());
        IObjectWrapper H2 = IObjectWrapper.Stub.H(H.readStrongBinder());
        H.recycle();
        return H2;
    }

    public final zzadl g() throws RemoteException {
        Parcel H = H(19, B());
        zzadl e7 = zzadk.e7(H.readStrongBinder());
        H.recycle();
        return e7;
    }

    public final Bundle getExtras() throws RemoteException {
        Parcel H = H(13, B());
        Bundle bundle = (Bundle) zzgw.b(H, Bundle.CREATOR);
        H.recycle();
        return bundle;
    }

    public final zzyi getVideoController() throws RemoteException {
        Parcel H = H(16, B());
        zzyi e7 = zzyh.e7(H.readStrongBinder());
        H.recycle();
        return e7;
    }

    public final String i() throws RemoteException {
        Parcel H = H(6, B());
        String readString = H.readString();
        H.recycle();
        return readString;
    }

    public final String j() throws RemoteException {
        Parcel H = H(4, B());
        String readString = H.readString();
        H.recycle();
        return readString;
    }

    public final List k() throws RemoteException {
        Parcel H = H(3, B());
        ArrayList f2 = zzgw.f(H);
        H.recycle();
        return f2;
    }

    public final zzadt n0() throws RemoteException {
        Parcel H = H(5, B());
        zzadt e7 = zzads.e7(H.readStrongBinder());
        H.recycle();
        return e7;
    }

    public final String q() throws RemoteException {
        Parcel H = H(7, B());
        String readString = H.readString();
        H.recycle();
        return readString;
    }

    public final void recordImpression() throws RemoteException {
        V(8, B());
    }

    public final void t(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        V(14, B);
    }

    public final boolean v() throws RemoteException {
        Parcel H = H(11, B());
        boolean e2 = zzgw.e(H);
        H.recycle();
        return e2;
    }

    public final void w(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        zzgw.c(B, iObjectWrapper2);
        zzgw.c(B, iObjectWrapper3);
        V(22, B);
    }

    public final IObjectWrapper x() throws RemoteException {
        Parcel H = H(20, B());
        IObjectWrapper H2 = IObjectWrapper.Stub.H(H.readStrongBinder());
        H.recycle();
        return H2;
    }

    public final IObjectWrapper z() throws RemoteException {
        Parcel H = H(15, B());
        IObjectWrapper H2 = IObjectWrapper.Stub.H(H.readStrongBinder());
        H.recycle();
        return H2;
    }
}
