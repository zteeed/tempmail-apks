package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class o2 implements zzahk {

    /* renamed from: a  reason: collision with root package name */
    private final zzbbn<O> f4519a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzamd f4520b;

    public o2(zzamd zzamd, zzbbn<O> zzbbn) {
        this.f4520b = zzamd;
        this.f4519a = zzbbn;
    }

    public final void a(JSONObject jSONObject) {
        try {
            this.f4519a.a(this.f4520b.f5783a.a(jSONObject));
        } catch (IllegalStateException unused) {
        } catch (JSONException e2) {
            this.f4519a.c(e2);
        }
    }

    public final void onFailure(String str) {
        if (str == null) {
            try {
                this.f4519a.c(new zzalg());
            } catch (IllegalStateException unused) {
            }
        } else {
            this.f4519a.c(new zzalg(str));
        }
    }
}
