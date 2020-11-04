package com.google.android.gms.internal.ads;

import java.lang.Throwable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class a00<V, X extends Throwable> extends b00<V, X, zzduh<? super X, ? extends V>, zzdvf<? extends V>> {
    a00(zzdvf<? extends V> zzdvf, Class<X> cls, zzduh<? super X, ? extends V> zzduh) {
        super(zzdvf, cls, zzduh);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void I(Object obj) {
        k((zzdvf) obj);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object K(Object obj, Throwable th) throws Exception {
        zzduh zzduh = (zzduh) obj;
        zzdvf zzf = zzduh.zzf(th);
        zzdsh.d(zzf, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzduh);
        return zzf;
    }
}
