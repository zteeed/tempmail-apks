package com.google.android.gms.internal.measurement;

import android.os.Binder;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final /* synthetic */ class zzco {
    public static <V> V a(zzcn<V> zzcn) {
        long clearCallingIdentity;
        try {
            return zzcn.a();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V a2 = zzcn.a();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return a2;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
