package com.google.firebase.dynamiclinks.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.firebase_dynamic_links.zza;
import com.google.android.gms.internal.firebase_dynamic_links.zzd;

/* compiled from: com.google.firebase:firebase-dynamic-links@@19.1.0 */
public abstract class l extends zza implements i {
    public l() {
        super("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean B(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            v2((Status) zzd.a(parcel, Status.CREATOR), (DynamicLinkData) zzd.a(parcel, DynamicLinkData.CREATOR));
            return true;
        } else if (i != 2) {
            return false;
        } else {
            C2((Status) zzd.a(parcel, Status.CREATOR), (zzo) zzd.a(parcel, zzo.CREATOR));
            throw null;
        }
    }
}
