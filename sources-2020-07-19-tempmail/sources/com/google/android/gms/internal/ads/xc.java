package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class xc implements zzduu<zzasm> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzbpz f5304a;

    xc(zzbpz zzbpz) {
        this.f5304a = zzbpz;
    }

    public final void a(Throwable th) {
        this.f5304a.g.k(false);
    }

    public final /* synthetic */ void onSuccess(@NullableDecl Object obj) {
        zzasm zzasm = (zzasm) obj;
        this.f5304a.g.k(true);
    }
}
