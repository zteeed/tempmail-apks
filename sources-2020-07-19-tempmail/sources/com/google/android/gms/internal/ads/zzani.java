package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzani extends zzgu implements zzang {
    zzani(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public final void A(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        P(20, y);
    }

    public final float B1() throws RemoteException {
        Parcel E = E(25, y());
        float readFloat = E.readFloat();
        E.recycle();
        return readFloat;
    }

    public final boolean D() throws RemoteException {
        Parcel E = E(18, y());
        boolean e2 = zzgw.e(E);
        E.recycle();
        return e2;
    }

    public final float P0() throws RemoteException {
        Parcel E = E(23, y());
        float readFloat = E.readFloat();
        E.recycle();
        return readFloat;
    }

    public final float T1() throws RemoteException {
        Parcel E = E(24, y());
        float readFloat = E.readFloat();
        E.recycle();
        return readFloat;
    }

    public final String d() throws RemoteException {
        Parcel E = E(2, y());
        String readString = E.readString();
        E.recycle();
        return readString;
    }

    public final IObjectWrapper e() throws RemoteException {
        Parcel E = E(15, y());
        IObjectWrapper E2 = IObjectWrapper.Stub.E(E.readStrongBinder());
        E.recycle();
        return E2;
    }

    public final zzadl f() throws RemoteException {
        Parcel E = E(12, y());
        zzadl z6 = zzadk.z6(E.readStrongBinder());
        E.recycle();
        return z6;
    }

    public final Bundle getExtras() throws RemoteException {
        Parcel E = E(16, y());
        Bundle bundle = (Bundle) zzgw.b(E, Bundle.CREATOR);
        E.recycle();
        return bundle;
    }

    public final zzyi getVideoController() throws RemoteException {
        Parcel E = E(11, y());
        zzyi z6 = zzyh.z6(E.readStrongBinder());
        E.recycle();
        return z6;
    }

    public final String h() throws RemoteException {
        Parcel E = E(6, y());
        String readString = E.readString();
        E.recycle();
        return readString;
    }

    public final String i() throws RemoteException {
        Parcel E = E(4, y());
        String readString = E.readString();
        E.recycle();
        return readString;
    }

    public final List j() throws RemoteException {
        Parcel E = E(3, y());
        ArrayList f2 = zzgw.f(E);
        E.recycle();
        return f2;
    }

    public final zzadt k() throws RemoteException {
        Parcel E = E(5, y());
        zzadt z6 = zzads.z6(E.readStrongBinder());
        E.recycle();
        return z6;
    }

    public final String l() throws RemoteException {
        Parcel E = E(10, y());
        String readString = E.readString();
        E.recycle();
        return readString;
    }

    public final double n() throws RemoteException {
        Parcel E = E(8, y());
        double readDouble = E.readDouble();
        E.recycle();
        return readDouble;
    }

    public final String o() throws RemoteException {
        Parcel E = E(7, y());
        String readString = E.readString();
        E.recycle();
        return readString;
    }

    public final String p() throws RemoteException {
        Parcel E = E(9, y());
        String readString = E.readString();
        E.recycle();
        return readString;
    }

    public final void r(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        P(22, y);
    }

    public final void recordImpression() throws RemoteException {
        P(19, y());
    }

    public final boolean t() throws RemoteException {
        Parcel E = E(17, y());
        boolean e2 = zzgw.e(E);
        E.recycle();
        return e2;
    }

    public final void u(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        zzgw.c(y, iObjectWrapper2);
        zzgw.c(y, iObjectWrapper3);
        P(21, y);
    }

    public final IObjectWrapper v() throws RemoteException {
        Parcel E = E(14, y());
        IObjectWrapper E2 = IObjectWrapper.Stub.E(E.readStrongBinder());
        E.recycle();
        return E2;
    }

    public final IObjectWrapper w() throws RemoteException {
        Parcel E = E(13, y());
        IObjectWrapper E2 = IObjectWrapper.Stub.E(E.readStrongBinder());
        E.recycle();
        return E2;
    }
}