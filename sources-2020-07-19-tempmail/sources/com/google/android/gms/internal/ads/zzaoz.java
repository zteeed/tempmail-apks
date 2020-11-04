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

    public final void C4(String str, String str2, zzve zzve, IObjectWrapper iObjectWrapper, zzaos zzaos, zzamx zzamx) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        y.writeString(str2);
        zzgw.d(y, zzve);
        zzgw.c(y, iObjectWrapper);
        zzgw.c(y, zzaos);
        zzgw.c(y, zzamx);
        P(20, y);
    }

    public final void H1(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzvh zzvh, zzaoy zzaoy) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        y.writeString(str);
        zzgw.d(y, bundle);
        zzgw.d(y, bundle2);
        zzgw.d(y, zzvh);
        zzgw.c(y, zzaoy);
        P(1, y);
    }

    public final void H3(String str) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        P(19, y);
    }

    public final void P4(String str, String str2, zzve zzve, IObjectWrapper iObjectWrapper, zzaol zzaol, zzamx zzamx, zzvh zzvh) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        y.writeString(str2);
        zzgw.d(y, zzve);
        zzgw.c(y, iObjectWrapper);
        zzgw.c(y, zzaol);
        zzgw.c(y, zzamx);
        zzgw.d(y, zzvh);
        P(13, y);
    }

    public final void R1(String str, String str2, zzve zzve, IObjectWrapper iObjectWrapper, zzaos zzaos, zzamx zzamx) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        y.writeString(str2);
        zzgw.d(y, zzve);
        zzgw.c(y, iObjectWrapper);
        zzgw.c(y, zzaos);
        zzgw.c(y, zzamx);
        P(16, y);
    }

    public final zzapl Y() throws RemoteException {
        Parcel E = E(3, y());
        zzapl zzapl = (zzapl) zzgw.b(E, zzapl.CREATOR);
        E.recycle();
        return zzapl;
    }

    public final zzapl a0() throws RemoteException {
        Parcel E = E(2, y());
        zzapl zzapl = (zzapl) zzgw.b(E, zzapl.CREATOR);
        E.recycle();
        return zzapl;
    }

    public final void a5(String[] strArr, Bundle[] bundleArr) throws RemoteException {
        Parcel y = y();
        y.writeStringArray(strArr);
        y.writeTypedArray(bundleArr, 0);
        P(11, y);
    }

    public final boolean c6(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        Parcel E = E(17, y);
        boolean e2 = zzgw.e(E);
        E.recycle();
        return e2;
    }

    public final void d6(String str, String str2, zzve zzve, IObjectWrapper iObjectWrapper, zzaor zzaor, zzamx zzamx) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        y.writeString(str2);
        zzgw.d(y, zzve);
        zzgw.c(y, iObjectWrapper);
        zzgw.c(y, zzaor);
        zzgw.c(y, zzamx);
        P(18, y);
    }

    public final void g2(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        P(10, y);
    }

    public final void g4(String str, String str2, zzve zzve, IObjectWrapper iObjectWrapper, zzaom zzaom, zzamx zzamx) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        y.writeString(str2);
        zzgw.d(y, zzve);
        zzgw.c(y, iObjectWrapper);
        zzgw.c(y, zzaom);
        zzgw.c(y, zzamx);
        P(14, y);
    }

    public final zzyi getVideoController() throws RemoteException {
        Parcel E = E(5, y());
        zzyi z6 = zzyh.z6(E.readStrongBinder());
        E.recycle();
        return z6;
    }

    public final boolean v2(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        Parcel E = E(15, y);
        boolean e2 = zzgw.e(E);
        E.recycle();
        return e2;
    }
}
