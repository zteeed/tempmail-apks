package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class zc implements zzduu<Void> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzbpz f5454a;

    zc(zzbpz zzbpz) {
        this.f5454a = zzbpz;
    }

    public final void a(Throwable th) {
        this.f5454a.g.z(false);
    }

    public final /* synthetic */ void onSuccess(@NullableDecl Object obj) {
        Void voidR = (Void) obj;
        this.f5454a.g.z(true);
    }
}
