package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class n0 implements zzahk {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzbbn f4436a;

    n0(zzahi zzahi, zzbbn zzbbn) {
        this.f4436a = zzbbn;
    }

    public final void a(JSONObject jSONObject) {
        this.f4436a.a(jSONObject);
    }

    public final void onFailure(String str) {
        this.f4436a.c(new zzalg(str));
    }
}
