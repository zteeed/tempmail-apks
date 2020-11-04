package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzaoz extends zzgu implements zzaox {
    zzaoz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public final void A4(String str, String str2, zzve zzve, IObjectWrapper iObjectWrapper, zzaom zzaom, zzamx zzamx) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        B.writeString(str2);
        zzgw.d(B, zzve);
        zzgw.c(B, iObjectWrapper);
        zzgw.c(B, zzaom);
        zzgw.c(B, zzamx);
        V(14, B);
    }

    public final boolean C6(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        Parcel H = H(17, B);
        boolean e2 = zzgw.e(H);
        H.recycle();
        return e2;
    }

    public final void E6(String str, String str2, zzve zzve, IObjectWrapper iObjectWrapper, zzaor zzaor, zzamx zzamx) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        B.writeString(str2);
        zzgw.d(B, zzve);
        zzgw.c(B, iObjectWrapper);
        zzgw.c(B, zzaor);
        zzgw.c(B, zzamx);
        V(18, B);
    }

    public final boolean I2(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        Parcel H = H(15, B);
        boolean e2 = zzgw.e(H);
        H.recycle();
        return e2;
    }

    public final void Q1(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzvh zzvh, zzaoy zzaoy) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        B.writeString(str);
        zzgw.d(B, bundle);
        zzgw.d(B, bundle2);
        zzgw.d(B, zzvh);
        zzgw.c(B, zzaoy);
        V(1, B);
    }

    public final void V3(String str) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        V(19, B);
    }

    public final void W4(String str, String str2, zzve zzve, IObjectWrapper iObjectWrapper, zzaos zzaos, zzamx zzamx) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        B.writeString(str2);
        zzgw.d(B, zzve);
        zzgw.c(B, iObjectWrapper);
        zzgw.c(B, zzaos);
        zzgw.c(B, zzamx);
        V(20, B);
    }

    public final void a2(String str, String str2, zzve zzve, IObjectWrapper iObjectWrapper, zzaos zzaos, zzamx zzamx) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        B.writeString(str2);
        zzgw.d(B, zzve);
        zzgw.c(B, iObjectWrapper);
        zzgw.c(B, zzaos);
        zzgw.c(B, zzamx);
        V(16, B);
    }

    public final zzapl e0() throws RemoteException {
        Parcel H = H(3, B());
        zzapl zzapl = (zzapl) zzgw.b(H, zzapl.CREATOR);
        H.recycle();
        return zzapl;
    }

    public final zzapl g0() throws RemoteException {
        Parcel H = H(2, B());
        zzapl zzapl = (zzapl) zzgw.b(H, zzapl.CREATOR);
        H.recycle();
        return zzapl;
    }

    public final zzyi getVideoController() throws RemoteException {
        Parcel H = H(5, B());
        zzyi e7 = zzyh.e7(H.readStrongBinder());
        H.recycle();
        return e7;
    }

    public final void j5(String str, String str2, zzve zzve, IObjectWrapper iObjectWrapper, zzaol zzaol, zzamx zzamx, zzvh zzvh) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        B.writeString(str2);
        zzgw.d(B, zzve);
        zzgw.c(B, iObjectWrapper);
        zzgw.c(B, zzaol);
        zzgw.c(B, zzamx);
        zzgw.d(B, zzvh);
        V(13, B);
    }

    public final void q2(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        V(10, B);
    }

    public final void v5(String[] strArr, Bundle[] bundleArr) throws RemoteException {
        Parcel B = B();
        B.writeStringArray(strArr);
        B.writeTypedArray(bundleArr, 0);
        V(11, B);
    }
}
