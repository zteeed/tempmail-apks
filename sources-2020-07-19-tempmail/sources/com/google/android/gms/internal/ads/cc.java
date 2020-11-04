package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class cc implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzbfn f3540b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f3541c;

    cc(zzbfn zzbfn, JSONObject jSONObject) {
        this.f3540b = zzbfn;
        this.f3541c = jSONObject;
    }

    public final void run() {
        this.f3540b.e0("AFMA_updateActiveView", this.f3541c);
    }
}
