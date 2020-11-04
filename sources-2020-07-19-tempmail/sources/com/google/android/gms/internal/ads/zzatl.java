package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzatl extends zzgu implements zzatj {
    zzatl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    public final void E4(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        P(18, y);
    }

    public final void N3(zzath zzath) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzath);
        P(16, y);
    }

    public final void U4(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        P(9, y);
    }

    public final void V4(String str) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        P(17, y);
    }

    public final void destroy() throws RemoteException {
        P(8, y());
    }

    public final void e4(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        P(10, y);
    }

    public final Bundle getAdMetadata() throws RemoteException {
        Parcel E = E(15, y());
        Bundle bundle = (Bundle) zzgw.b(E, Bundle.CREATOR);
        E.recycle();
        return bundle;
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        Parcel E = E(12, y());
        String readString = E.readString();
        E.recycle();
        return readString;
    }

    public final boolean isLoaded() throws RemoteException {
        Parcel E = E(5, y());
        boolean e2 = zzgw.e(E);
        E.recycle();
        return e2;
    }

    public final void l6(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        P(11, y);
    }

    public final void pause() throws RemoteException {
        P(6, y());
    }

    public final void resume() throws RemoteException {
        P(7, y());
    }

    public final void setCustomData(String str) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        P(19, y);
    }

    public final void setImmersiveMode(boolean z) throws RemoteException {
        Parcel y = y();
        zzgw.a(y, z);
        P(34, y);
    }

    public final void setUserId(String str) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        P(13, y);
    }

    public final void show() throws RemoteException {
        P(2, y());
    }

    public final void y5(zzatw zzatw) throws RemoteException {
        Parcel y = y();
        zzgw.d(y, zzatw);
        P(1, y);
    }

    public final boolean z1() throws RemoteException {
        Parcel E = E(20, y());
        boolean e2 = zzgw.e(E);
        E.recycle();
        return e2;
    }

    public final void zza(zzatq zzatq) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzatq);
        P(3, y);
    }

    public final zzyd zzkj() throws RemoteException {
        Parcel E = E(21, y());
        zzyd z6 = zzyg.z6(E.readStrongBinder());
        E.recycle();
        return z6;
    }

    public final void zza(zzwz zzwz) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzwz);
        P(14, y);
    }
}
