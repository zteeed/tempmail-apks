package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzahx extends zzgu implements zzahu {
    zzahx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void p3(zzaho zzaho, zzahs zzahs) throws RemoteException {
        Parcel B = B();
        zzgw.d(B, zzaho);
        zzgw.c(B, zzahs);
        h0(2, B);
    }
}
