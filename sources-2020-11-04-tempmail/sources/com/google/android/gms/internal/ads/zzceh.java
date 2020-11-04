package com.google.android.gms.internal.ads;

import a.e.a;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzceh implements zzbtd {

    /* renamed from: b  reason: collision with root package name */
    private final zzcck f7097b;

    /* renamed from: c  reason: collision with root package name */
    private final zzcco f7098c;

    public zzceh(zzcck zzcck, zzcco zzcco) {
        this.f7097b = zzcck;
        this.f7098c = zzcco;
    }

    public final void onAdImpression() {
        if (this.f7097b.H() != null) {
            zzbfn G = this.f7097b.G();
            zzbfn F = this.f7097b.F();
            if (G == null) {
                G = F != null ? F : null;
            }
            if (this.f7098c.a() && G != null) {
                G.z("onSdkImpression", new a());
            }
        }
    }
}
