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

    public final float E4() throws RemoteException {
        Parcel H = H(7, B());
        float readFloat = H.readFloat();
        H.recycle();
        return readFloat;
    }

    public final boolean F3() throws RemoteException {
        Parcel H = H(8, B());
        boolean e2 = zzgw.e(H);
        H.recycle();
        return e2;
    }

    public final void H1(zzzu zzzu) throws RemoteException {
        Parcel B = B();
        zzgw.d(B, zzzu);
        V(14, B);
    }

    public final void I() throws RemoteException {
        V(1, B());
    }

    public final String I3() throws RemoteException {
        Parcel H = H(9, B());
        String readString = H.readString();
        H.recycle();
        return readString;
    }

    public final void J5(float f2) throws RemoteException {
        Parcel B = B();
        B.writeFloat(f2);
        V(2, B);
    }

    public final void L1() throws RemoteException {
        V(15, B());
    }

    public final void L2(String str) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        V(10, B);
    }

    public final List<zzaic> M2() throws RemoteException {
        Parcel H = H(13, B());
        ArrayList<zzaic> createTypedArrayList = H.createTypedArrayList(zzaic.CREATOR);
        H.recycle();
        return createTypedArrayList;
    }

    public final void M3(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        zzgw.c(B, iObjectWrapper);
        V(6, B);
    }

    public final void Q5(zzamr zzamr) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzamr);
        V(11, B);
    }

    public final void S1(boolean z) throws RemoteException {
        Parcel B = B();
        zzgw.a(B, z);
        V(4, B);
    }

    public final void e2(zzaij zzaij) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzaij);
        V(12, B);
    }

    public final void s0(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        B.writeString(str);
        V(5, B);
    }

    public final void t5(String str) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        V(3, B);
    }
}
