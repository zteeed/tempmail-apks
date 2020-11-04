package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class l9 implements zzo {

    /* renamed from: b  reason: collision with root package name */
    private zzbfn f4278b;

    /* renamed from: c  reason: collision with root package name */
    private zzo f4279c;

    public l9(zzbfn zzbfn, zzo zzo) {
        this.f4278b = zzbfn;
        this.f4279c = zzo;
    }

    public final void onPause() {
    }

    public final void onResume() {
    }

    public final void zzud() {
        zzo zzo = this.f4279c;
        if (zzo != null) {
            zzo.zzud();
        }
        this.f4278b.K();
    }

    public final void zzue() {
        zzo zzo = this.f4279c;
        if (zzo != null) {
            zzo.zzue();
        }
        this.f4278b.J();
    }
}
