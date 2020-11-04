package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class pi implements zzqs {

    /* renamed from: b  reason: collision with root package name */
    private final zzbfn f4645b;

    pi(zzbfn zzbfn) {
        this.f4645b = zzbfn;
    }

    public final void R(zzqt zzqt) {
        zzbfn zzbfn = this.f4645b;
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", zzqt.j ? "1" : "0");
        zzbfn.z("onAdVisibilityChanged", hashMap);
    }
}
