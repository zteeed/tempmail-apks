package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzaon extends zzgu implements zzaol {
    zzaon(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    public final void T2(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        P(1, y);
    }

    public final void q(String str) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        P(2, y);
    }
}
