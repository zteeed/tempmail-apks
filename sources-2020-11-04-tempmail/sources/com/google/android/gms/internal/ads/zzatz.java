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

    public final void I0(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        V(3, B);
    }

    public final void K6(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        V(6, B);
    }

    public final void R1(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        V(4, B);
    }

    public final void Y6(IObjectWrapper iObjectWrapper, zzaub zzaub) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        zzgw.d(B, zzaub);
        V(7, B);
    }

    public final void Z3(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        V(8, B);
    }

    public final void h5(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        V(10, B);
    }

    public final void h6(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        V(5, B);
    }

    public final void j2(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        B.writeInt(i);
        V(9, B);
    }

    public final void o1(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        B.writeInt(i);
        V(2, B);
    }

    public final void r2(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        V(11, B);
    }

    public final void v3(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        V(1, B);
    }

    public final void zzb(Bundle bundle) throws RemoteException {
        Parcel B = B();
        zzgw.d(B, bundle);
        V(12, B);
    }
}
