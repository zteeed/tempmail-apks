package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzarb extends zzgu implements zzaqz {
    zzarb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    public final void A3(List<Uri> list) throws RemoteException {
        Parcel B = B();
        B.writeTypedList(list);
        V(1, B);
    }

    public final void onError(String str) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        V(2, B);
    }
}
