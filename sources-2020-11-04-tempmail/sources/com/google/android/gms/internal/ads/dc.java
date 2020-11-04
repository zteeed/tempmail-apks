package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class dc implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzbmh f3816b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f3817c;

    dc(zzbmh zzbmh, JSONObject jSONObject) {
        this.f3816b = zzbmh;
        this.f3817c = jSONObject;
    }

    public final void run() {
        this.f3816b.y(this.f3817c);
    }
}
