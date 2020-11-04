package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class fv implements zzdrx<zzcop, zzdij> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ ev f4016a;

    fv(ev evVar) {
        this.f4016a = evVar;
    }

    @NullableDecl
    public final /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzbba.c("", (zzcop) obj);
        zzaxv.m("Failed to get a cache key, reverting to legacy flow.");
        ev evVar = this.f4016a;
        zzdij unused = evVar.f3932e = new zzdij((zzasm) null, evVar.d(), (fv) null);
        return this.f4016a.f3932e;
    }
}
