package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcbt implements zzela<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private final zzcbr f6991a;

    public zzcbt(zzcbr zzcbr) {
        this.f6991a = zzcbr;
    }

    public final /* synthetic */ Object get() {
        JSONObject a2 = this.f6991a.a();
        zzelg.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
