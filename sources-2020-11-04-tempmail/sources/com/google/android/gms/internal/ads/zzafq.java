package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzafq extends zzgu implements zzafo {
    zzafq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    public final void onUnconfirmedClickCancelled() throws RemoteException {
        V(2, B());
    }

    public final void onUnconfirmedClickReceived(String str) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        V(1, B);
    }
}
