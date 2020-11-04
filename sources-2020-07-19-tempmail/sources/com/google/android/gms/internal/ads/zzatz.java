package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzatz extends zzgu implements zzatx {
    zzatz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public final void C0(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        P(3, y);
    }

    public final void I1(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        P(4, y);
    }

    public final void J5(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        P(5, y);
    }

    public final void L3(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        P(8, y);
    }

    public final void N4(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        P(10, y);
    }

    public final void Z1(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        y.writeInt(i);
        P(9, y);
    }

    public final void f3(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        P(1, y);
    }

    public final void h2(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        P(11, y);
    }

    public final void i1(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        y.writeInt(i);
        P(2, y);
    }

    public final void i6(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        P(6, y);
    }

    public final void u6(IObjectWrapper iObjectWrapper, zzaub zzaub) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        zzgw.d(y, zzaub);
        P(7, y);
    }

    public final void zzb(Bundle bundle) throws RemoteException {
        Parcel y = y();
        zzgw.d(y, bundle);
        P(12, y);
    }
}
