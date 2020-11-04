package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcip implements zzbtg {

    /* renamed from: b  reason: collision with root package name */
    private final zzbfn f7285b;

    zzcip(zzbfn zzbfn) {
        this.f7285b = !((Boolean) zzwg.e().c(zzaav.l0)).booleanValue() ? null : zzbfn;
    }

    public final void f(Context context) {
        zzbfn zzbfn = this.f7285b;
        if (zzbfn != null) {
            zzbfn.destroy();
        }
    }

    public final void k(Context context) {
        zzbfn zzbfn = this.f7285b;
        if (zzbfn != null) {
            zzbfn.onResume();
        }
    }

    public final void r(Context context) {
        zzbfn zzbfn = this.f7285b;
        if (zzbfn != null) {
            zzbfn.onPause();
        }
    }
}
