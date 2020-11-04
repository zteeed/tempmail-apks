package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzxo extends zzgu implements zzxm {
    zzxo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    public final List<zzaic> B2() throws RemoteException {
        Parcel E = E(13, y());
        ArrayList<zzaic> createTypedArrayList = E.createTypedArrayList(zzaic.CREATOR);
        E.recycle();
        return createTypedArrayList;
    }

    public final void C1() throws RemoteException {
        P(15, y());
    }

    public final void F() throws RemoteException {
        P(1, y());
    }

    public final void J1(boolean z) throws RemoteException {
        Parcel y = y();
        zzgw.a(y, z);
        P(4, y);
    }

    public final void V1(zzaij zzaij) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzaij);
        P(12, y);
    }

    public final void Y4(String str) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        P(3, y);
    }

    public final float k4() throws RemoteException {
        Parcel E = E(7, y());
        float readFloat = E.readFloat();
        E.recycle();
        return readFloat;
    }

    public final void m0(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        y.writeString(str);
        P(5, y);
    }

    public final void n5(float f2) throws RemoteException {
        Parcel y = y();
        y.writeFloat(f2);
        P(2, y);
    }

    public final boolean q3() throws RemoteException {
        Parcel E = E(8, y());
        boolean e2 = zzgw.e(E);
        E.recycle();
        return e2;
    }

    public final String t3() throws RemoteException {
        Parcel E = E(9, y());
        String readString = E.readString();
        E.recycle();
        return readString;
    }

    public final void u5(zzamr zzamr) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzamr);
        P(11, y);
    }

    public final void y1(zzzu zzzu) throws RemoteException {
        Parcel y = y();
        zzgw.d(y, zzzu);
        P(14, y);
    }

    public final void y3(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        zzgw.c(y, iObjectWrapper);
        P(6, y);
    }

    public final void z2(String str) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        P(10, y);
    }
}
