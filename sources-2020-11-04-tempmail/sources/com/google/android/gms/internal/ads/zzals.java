package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzals<I, O> implements zzalj<I, O> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final zzall<O> f5960a;

    /* renamed from: b  reason: collision with root package name */
    private final zzalk<I> f5961b;

    /* renamed from: c  reason: collision with root package name */
    private final zzakh f5962c;

    /* renamed from: d  reason: collision with root package name */
    private final String f5963d;

    zzals(zzakh zzakh, String str, zzalk<I> zzalk, zzall<O> zzall) {
        this.f5962c = zzakh;
        this.f5963d = str;
        this.f5961b = zzalk;
        this.f5960a = zzall;
    }

    /* access modifiers changed from: private */
    public final void c(zzaku zzaku, zzalf zzalf, I i, zzbbn<O> zzbbn) {
        try {
            zzq.zzkw();
            String q0 = zzaye.q0();
            zzagm.p.c(q0, new i2(this, zzaku, zzbbn));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", q0);
            jSONObject.put("args", this.f5961b.b(i));
            zzalf.e0(this.f5963d, jSONObject);
        } catch (Exception e2) {
            zzbbn.c(e2);
            zzbba.c("Unable to invokeJavascript", e2);
            zzaku.f();
        } catch (Throwable th) {
            zzaku.f();
            throw th;
        }
    }

    public final zzdvf<O> a(I i) {
        zzbbn zzbbn = new zzbbn();
        zzaku h = this.f5962c.h((zzeg) null);
        h.d(new h2(this, h, i, zzbbn), new g2(this, zzbbn, h));
        return zzbbn;
    }

    public final zzdvf<O> zzf(I i) throws Exception {
        return a(i);
    }
}
