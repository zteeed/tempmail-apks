package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzyl extends zzgu implements zzyj {
    zzyl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    public final void S() throws RemoteException {
        P(4, y());
    }

    public final void n0(boolean z) throws RemoteException {
        Parcel y = y();
        zzgw.a(y, z);
        P(5, y);
    }

    public final void onVideoPause() throws RemoteException {
        P(3, y());
    }

    public final void onVideoPlay() throws RemoteException {
        P(2, y());
    }

    public final void onVideoStart() throws RemoteException {
        P(1, y());
    }
}
