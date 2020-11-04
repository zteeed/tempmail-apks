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

    public final void K4(zzao zzao, String str, String str2) throws RemoteException {
        Parcel B = B();
        zzb.c(B, zzao);
        B.writeString(str);
        B.writeString(str2);
        V(5, B);
    }

    public final List<zzkq> P3(String str, String str2, boolean z, zzn zzn) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        B.writeString(str2);
        zzb.d(B, z);
        zzb.c(B, zzn);
        Parcel H = H(14, B);
        ArrayList<zzkq> createTypedArrayList = H.createTypedArrayList(zzkq.CREATOR);
        H.recycle();
        return createTypedArrayList;
    }

    public final List<zzkq> Q3(zzn zzn, boolean z) throws RemoteException {
        Parcel B = B();
        zzb.c(B, zzn);
        zzb.d(B, z);
        Parcel H = H(7, B);
        ArrayList<zzkq> createTypedArrayList = H.createTypedArrayList(zzkq.CREATOR);
        H.recycle();
        return createTypedArrayList;
    }

    public final void S4(zzn zzn) throws RemoteException {
        Parcel B = B();
        zzb.c(B, zzn);
        V(6, B);
    }

    public final void T3(zzn zzn) throws RemoteException {
        Parcel B = B();
        zzb.c(B, zzn);
        V(4, B);
    }

    public final void Y5(Bundle bundle, zzn zzn) throws RemoteException {
        Parcel B = B();
        zzb.c(B, bundle);
        zzb.c(B, zzn);
        V(19, B);
    }

    public final void a3(long j, String str, String str2, String str3) throws RemoteException {
        Parcel B = B();
        B.writeLong(j);
        B.writeString(str);
        B.writeString(str2);
        B.writeString(str3);
        V(10, B);
    }

    public final byte[] f6(zzao zzao, String str) throws RemoteException {
        Parcel B = B();
        zzb.c(B, zzao);
        B.writeString(str);
        Parcel H = H(9, B);
        byte[] createByteArray = H.createByteArray();
        H.recycle();
        return createByteArray;
    }

    public final void i3(zzn zzn) throws RemoteException {
        Parcel B = B();
        zzb.c(B, zzn);
        V(18, B);
    }

    public final List<zzw> j3(String str, String str2, String str3) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        B.writeString(str2);
        B.writeString(str3);
        Parcel H = H(17, B);
        ArrayList<zzw> createTypedArrayList = H.createTypedArrayList(zzw.CREATOR);
        H.recycle();
        return createTypedArrayList;
    }

    public final List<zzw> l3(String str, String str2, zzn zzn) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        B.writeString(str2);
        zzb.c(B, zzn);
        Parcel H = H(16, B);
        ArrayList<zzw> createTypedArrayList = H.createTypedArrayList(zzw.CREATOR);
        H.recycle();
        return createTypedArrayList;
    }

    public final String m2(zzn zzn) throws RemoteException {
        Parcel B = B();
        zzb.c(B, zzn);
        Parcel H = H(11, B);
        String readString = H.readString();
        H.recycle();
        return readString;
    }

    public final void r0(zzw zzw, zzn zzn) throws RemoteException {
        Parcel B = B();
        zzb.c(B, zzw);
        zzb.c(B, zzn);
        V(12, B);
    }

    public final List<zzkq> v1(String str, String str2, String str3, boolean z) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        B.writeString(str2);
        B.writeString(str3);
        zzb.d(B, z);
        Parcel H = H(15, B);
        ArrayList<zzkq> createTypedArrayList = H.createTypedArrayList(zzkq.CREATOR);
        H.recycle();
        return createTypedArrayList;
    }

    public final void w4(zzw zzw) throws RemoteException {
        Parcel B = B();
        zzb.c(B, zzw);
        V(13, B);
    }

    public final void x4(zzao zzao, zzn zzn) throws RemoteException {
        Parcel B = B();
        zzb.c(B, zzao);
        zzb.c(B, zzn);
        V(1, B);
    }

    public final void y3(zzkq zzkq, zzn zzn) throws RemoteException {
        Parcel B = B();
        zzb.c(B, zzkq);
        zzb.c(B, zzn);
        V(2, B);
    }
}
