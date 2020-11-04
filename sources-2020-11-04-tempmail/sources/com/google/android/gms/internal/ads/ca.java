package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class ca implements zzo {

    /* renamed from: b  reason: collision with root package name */
    private zzbfn f3712b;

    /* renamed from: c  reason: collision with root package name */
    private zzo f3713c;

    public ca(zzbfn zzbfn, zzo zzo) {
        this.f3712b = zzbfn;
        this.f3713c = zzo;
    }

    public final void onPause() {
    }

    public final void onResume() {
    }

    public final void zzud() {
        zzo zzo = this.f3713c;
        if (zzo != null) {
            zzo.zzud();
        }
        this.f3712b.K();
    }

    public final void zzue() {
        zzo zzo = this.f3713c;
        if (zzo != null) {
            zzo.zzue();
        }
        this.f3712b.J();
    }
}
