package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzahx extends zzgu implements zzahu {
    zzahx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void d3(zzaho zzaho, zzahs zzahs) throws RemoteException {
        Parcel y = y();
        zzgw.d(y, zzaho);
        zzgw.c(y, zzahs);
        b0(2, y);
    }
}
