package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzyl extends zzgu implements zzyj {
    zzyl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    public final void Y() throws RemoteException {
        V(4, B());
    }

    public final void onVideoPause() throws RemoteException {
        V(3, B());
    }

    public final void onVideoPlay() throws RemoteException {
        V(2, B());
    }

    public final void onVideoStart() throws RemoteException {
        V(1, B());
    }

    public final void t0(boolean z) throws RemoteException {
        Parcel B = B();
        zzgw.a(B, z);
        V(5, B);
    }
}
