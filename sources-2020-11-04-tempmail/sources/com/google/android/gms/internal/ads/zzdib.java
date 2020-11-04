package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdib {
    public static <T> void a(AtomicReference<T> atomicReference, zzdie<T> zzdie) {
        T t = atomicReference.get();
        if (t != null) {
            try {
                zzdie.a(t);
            } catch (RemoteException e2) {
                zzbba.e("#007 Could not call remote method.", e2);
            }
        }
    }
}
