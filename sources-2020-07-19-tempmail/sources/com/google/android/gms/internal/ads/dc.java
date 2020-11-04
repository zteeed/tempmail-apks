package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class dc implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzbmh f3633b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f3634c;

    dc(zzbmh zzbmh, JSONObject jSONObject) {
        this.f3633b = zzbmh;
        this.f3634c = jSONObject;
    }

    public final void run() {
        this.f3633b.y(this.f3634c);
    }
}
