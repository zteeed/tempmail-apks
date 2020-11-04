package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcqg implements zzdpa {

    /* renamed from: b  reason: collision with root package name */
    private final zzcqf f7364b;

    zzcqg(zzcqf zzcqf) {
        this.f7364b = zzcqf;
    }

    public final void a(zzdor zzdor, String str) {
    }

    public final void b(zzdor zzdor, String str) {
        if (((Boolean) zzwg.e().c(zzaav.b3)).booleanValue() && zzdor.RENDERER == zzdor) {
            this.f7364b.h(zzq.zzld().b());
        }
    }

    public final void c(zzdor zzdor, String str) {
        if (((Boolean) zzwg.e().c(zzaav.b3)).booleanValue() && zzdor.RENDERER == zzdor && this.f7364b.c() != 0) {
            this.f7364b.g(zzq.zzld().b() - this.f7364b.c());
        }
    }

    public final void e(zzdor zzdor, String str, Throwable th) {
        if (((Boolean) zzwg.e().c(zzaav.b3)).booleanValue() && zzdor.RENDERER == zzdor && this.f7364b.c() != 0) {
            this.f7364b.g(zzq.zzld().b() - this.f7364b.c());
        }
    }
}
