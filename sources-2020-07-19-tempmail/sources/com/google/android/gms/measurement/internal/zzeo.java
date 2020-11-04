package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zza;
import com.google.android.gms.internal.measurement.zzb;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzeo extends zza implements zzem {
    zzeo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    public final void A5(Bundle bundle, zzn zzn) throws RemoteException {
        Parcel y = y();
        zzb.c(y, bundle);
        zzb.c(y, zzn);
        P(19, y);
    }

    public final List<zzkq> B3(String str, String str2, boolean z, zzn zzn) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        y.writeString(str2);
        zzb.d(y, z);
        zzb.c(y, zzn);
        Parcel E = E(14, y);
        ArrayList<zzkq> createTypedArrayList = E.createTypedArrayList(zzkq.CREATOR);
        E.recycle();
        return createTypedArrayList;
    }

    public final List<zzkq> C3(zzn zzn, boolean z) throws RemoteException {
        Parcel y = y();
        zzb.c(y, zzn);
        zzb.d(y, z);
        Parcel E = E(7, y);
        ArrayList<zzkq> createTypedArrayList = E.createTypedArrayList(zzkq.CREATOR);
        E.recycle();
        return createTypedArrayList;
    }

    public final void F3(zzn zzn) throws RemoteException {
        Parcel y = y();
        zzb.c(y, zzn);
        P(4, y);
    }

    public final byte[] H5(zzao zzao, String str) throws RemoteException {
        Parcel y = y();
        zzb.c(y, zzao);
        y.writeString(str);
        Parcel E = E(9, y);
        byte[] createByteArray = E.createByteArray();
        E.recycle();
        return createByteArray;
    }

    public final void O2(long j, String str, String str2, String str3) throws RemoteException {
        Parcel y = y();
        y.writeLong(j);
        y.writeString(str);
        y.writeString(str2);
        y.writeString(str3);
        P(10, y);
    }

    public final void W2(zzn zzn) throws RemoteException {
        Parcel y = y();
        zzb.c(y, zzn);
        P(18, y);
    }

    public final List<zzw> X2(String str, String str2, String str3) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        y.writeString(str2);
        y.writeString(str3);
        Parcel E = E(17, y);
        ArrayList<zzw> createTypedArrayList = E.createTypedArrayList(zzw.CREATOR);
        E.recycle();
        return createTypedArrayList;
    }

    public final List<zzw> Z2(String str, String str2, zzn zzn) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        y.writeString(str2);
        zzb.c(y, zzn);
        Parcel E = E(16, y);
        ArrayList<zzw> createTypedArrayList = E.createTypedArrayList(zzw.CREATOR);
        E.recycle();
        return createTypedArrayList;
    }

    public final String c2(zzn zzn) throws RemoteException {
        Parcel y = y();
        zzb.c(y, zzn);
        Parcel E = E(11, y);
        String readString = E.readString();
        E.recycle();
        return readString;
    }

    public final void c4(zzw zzw) throws RemoteException {
        Parcel y = y();
        zzb.c(y, zzw);
        P(13, y);
    }

    public final void d4(zzao zzao, zzn zzn) throws RemoteException {
        Parcel y = y();
        zzb.c(y, zzao);
        zzb.c(y, zzn);
        P(1, y);
    }

    public final void i3(zzkq zzkq, zzn zzn) throws RemoteException {
        Parcel y = y();
        zzb.c(y, zzkq);
        zzb.c(y, zzn);
        P(2, y);
    }

    public final void l0(zzw zzw, zzn zzn) throws RemoteException {
        Parcel y = y();
        zzb.c(y, zzw);
        zzb.c(y, zzn);
        P(12, y);
    }

    public final List<zzkq> o1(String str, String str2, String str3, boolean z) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        y.writeString(str2);
        y.writeString(str3);
        zzb.d(y, z);
        Parcel E = E(15, y);
        ArrayList<zzkq> createTypedArrayList = E.createTypedArrayList(zzkq.CREATOR);
        E.recycle();
        return createTypedArrayList;
    }

    public final void q4(zzao zzao, String str, String str2) throws RemoteException {
        Parcel y = y();
        zzb.c(y, zzao);
        y.writeString(str);
        y.writeString(str2);
        P(5, y);
    }

    public final void y4(zzn zzn) throws RemoteException {
        Parcel y = y();
        zzb.c(y, zzn);
        P(6, y);
    }
}
