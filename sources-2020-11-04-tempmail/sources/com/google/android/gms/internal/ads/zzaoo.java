package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzaoo extends zzgu implements zzaom {
    zzaoo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    public final void j0() throws RemoteException {
        V(2, B());
    }

    public final void s(String str) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        V(3, B);
    }
}
