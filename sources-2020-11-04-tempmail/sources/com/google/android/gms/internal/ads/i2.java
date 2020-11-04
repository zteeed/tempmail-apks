package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class i2 implements zzahk {

    /* renamed from: a  reason: collision with root package name */
    private final zzaku f4193a;

    /* renamed from: b  reason: collision with root package name */
    private final zzbbn<O> f4194b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzals f4195c;

    public i2(zzals zzals, zzaku zzaku, zzbbn<O> zzbbn) {
        this.f4195c = zzals;
        this.f4193a = zzaku;
        this.f4194b = zzbbn;
    }

    public final void a(JSONObject jSONObject) {
        try {
            this.f4194b.a(this.f4195c.f5960a.a(jSONObject));
        } catch (IllegalStateException unused) {
        } catch (JSONException e2) {
            this.f4194b.c(e2);
        } finally {
            this.f4193a.f();
        }
    }

    public final void onFailure(String str) {
        if (str == null) {
            try {
                this.f4194b.c(new zzalg());
            } catch (IllegalStateException unused) {
                this.f4193a.f();
                return;
            } catch (Throwable th) {
                this.f4193a.f();
                throw th;
            }
        } else {
            this.f4194b.c(new zzalg(str));
        }
        this.f4193a.f();
    }
}
