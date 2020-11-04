package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class cc implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzbfn f3723b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f3724c;

    cc(zzbfn zzbfn, JSONObject jSONObject) {
        this.f3723b = zzbfn;
        this.f3724c = jSONObject;
    }

    public final void run() {
        this.f3723b.e0("AFMA_updateActiveView", this.f3724c);
    }
}
