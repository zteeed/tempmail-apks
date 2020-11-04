package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzaoo extends zzgu implements zzaom {
    zzaoo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    public final void d0() throws RemoteException {
        P(2, y());
    }

    public final void q(String str) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        P(3, y);
    }
}
