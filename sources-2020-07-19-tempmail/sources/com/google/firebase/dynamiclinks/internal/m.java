package com.google.firebase.dynamiclinks.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.firebase_dynamic_links.zzb;
import com.google.android.gms.internal.firebase_dynamic_links.zzd;

/* compiled from: com.google.firebase:firebase-dynamic-links@@19.1.0 */
public final class m extends zzb implements k {
    m(IBinder iBinder) {
        super(iBinder, "com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
    }

    public final void o4(i iVar, String str) throws RemoteException {
        Parcel y = y();
        zzd.b(y, iVar);
        y.writeString(str);
        E(1, y);
    }
}
