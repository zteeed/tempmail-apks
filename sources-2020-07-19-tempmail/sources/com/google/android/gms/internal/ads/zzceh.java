package com.google.android.gms.internal.ads;

import a.e.a;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzceh implements zzbtd {

    /* renamed from: b  reason: collision with root package name */
    private final zzcck f6914b;

    /* renamed from: c  reason: collision with root package name */
    private final zzcco f6915c;

    public zzceh(zzcck zzcck, zzcco zzcco) {
        this.f6914b = zzcck;
        this.f6915c = zzcco;
    }

    public final void onAdImpression() {
        if (this.f6914b.H() != null) {
            zzbfn G = this.f6914b.G();
            zzbfn F = this.f6914b.F();
            if (G == null) {
                G = F != null ? F : null;
            }
            if (this.f6915c.a() && G != null) {
                G.z("onSdkImpression", new a());
            }
        }
    }
}
