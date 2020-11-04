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

    public final void k3(List<Uri> list) throws RemoteException {
        Parcel y = y();
        y.writeTypedList(list);
        P(1, y);
    }

    public final void onError(String str) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        P(2, y);
    }
}
