package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class f00<I, O> extends d00<I, O, zzduh<? super I, ? extends O>, zzdvf<? extends O>> {
    f00(zzdvf<? extends I> zzdvf, zzduh<? super I, ? extends O> zzduh) {
        super(zzdvf, zzduh);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void I(Object obj) {
        k((zzdvf) obj);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object L(Object obj, @NullableDecl Object obj2) throws Exception {
        zzduh zzduh = (zzduh) obj;
        zzdvf zzf = zzduh.zzf(obj2);
        zzdsh.d(zzf, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzduh);
        return zzf;
    }
}
