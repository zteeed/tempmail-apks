package com.google.android.gms.internal.ads;

import java.lang.Throwable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class c00<V, X extends Throwable> extends b00<V, X, zzdrx<? super X, ? extends V>, V> {
    c00(zzdvf<? extends V> zzdvf, Class<X> cls, zzdrx<? super X, ? extends V> zzdrx) {
        super(zzdvf, cls, zzdrx);
    }

    /* access modifiers changed from: package-private */
    public final void I(@NullableDecl V v) {
        i(v);
    }

    /* access modifiers changed from: package-private */
    @NullableDecl
    public final /* synthetic */ Object K(Object obj, Throwable th) throws Exception {
        return ((zzdrx) obj).apply(th);
    }
}
