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

    public final boolean I1() throws RemoteException {
        Parcel H = H(20, B());
        boolean e2 = zzgw.e(H);
        H.recycle();
        return e2;
    }

    public final void N6(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        V(11, B);
    }

    public final void W5(zzatw zzatw) throws RemoteException {
        Parcel B = B();
        zzgw.d(B, zzatw);
        V(1, B);
    }

    public final void Y4(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        V(18, B);
    }

    public final void b4(zzath zzath) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzath);
        V(16, B);
    }

    public final void destroy() throws RemoteException {
        V(8, B());
    }

    public final Bundle getAdMetadata() throws RemoteException {
        Parcel H = H(15, B());
        Bundle bundle = (Bundle) zzgw.b(H, Bundle.CREATOR);
        H.recycle();
        return bundle;
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        Parcel H = H(12, B());
        String readString = H.readString();
        H.recycle();
        return readString;
    }

    public final boolean isLoaded() throws RemoteException {
        Parcel H = H(5, B());
        boolean e2 = zzgw.e(H);
        H.recycle();
        return e2;
    }

    public final void o5(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        V(9, B);
    }

    public final void pause() throws RemoteException {
        V(6, B());
    }

    public final void q5(String str) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        V(17, B);
    }

    public final void resume() throws RemoteException {
        V(7, B());
    }

    public final void setCustomData(String str) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        V(19, B);
    }

    public final void setImmersiveMode(boolean z) throws RemoteException {
        Parcel B = B();
        zzgw.a(B, z);
        V(34, B);
    }

    public final void setUserId(String str) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        V(13, B);
    }

    public final void show() throws RemoteException {
        V(2, B());
    }

    public final void y4(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        V(10, B);
    }

    public final void zza(zzatq zzatq) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzatq);
        V(3, B);
    }

    public final zzyd zzkj() throws RemoteException {
        Parcel H = H(21, B());
        zzyd e7 = zzyg.e7(H.readStrongBinder());
        H.recycle();
        return e7;
    }

    public final void zza(zzwz zzwz) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzwz);
        V(14, B);
    }
}
