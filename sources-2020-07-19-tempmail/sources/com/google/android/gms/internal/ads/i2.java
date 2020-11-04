package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class i2 implements zzahk {

    /* renamed from: a  reason: collision with root package name */
    private final zzaku f4010a;

    /* renamed from: b  reason: collision with root package name */
    private final zzbbn<O> f4011b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzals f4012c;

    public i2(zzals zzals, zzaku zzaku, zzbbn<O> zzbbn) {
        this.f4012c = zzals;
        this.f4010a = zzaku;
        this.f4011b = zzbbn;
    }

    public final void a(JSONObject jSONObject) {
        try {
            this.f4011b.a(this.f4012c.f5777a.a(jSONObject));
        } catch (IllegalStateException unused) {
        } catch (JSONException e2) {
            this.f4011b.c(e2);
        } finally {
            this.f4010a.f();
        }
    }

    public final void onFailure(String str) {
        if (str == null) {
            try {
                this.f4011b.c(new zzalg());
            } catch (IllegalStateException unused) {
                this.f4010a.f();
                return;
            } catch (Throwable th) {
                this.f4010a.f();
                throw th;
            }
        } else {
            this.f4011b.c(new zzalg(str));
        }
        this.f4010a.f();
    }
}
