package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzamd<I, O> implements zzduh<I, O> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final zzall<O> f5783a;

    /* renamed from: b  reason: collision with root package name */
    private final zzalk<I> f5784b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5785c;

    /* renamed from: d  reason: collision with root package name */
    private final zzdvf<zzalf> f5786d;

    zzamd(zzdvf<zzalf> zzdvf, String str, zzalk<I> zzalk, zzall<O> zzall) {
        this.f5786d = zzdvf;
        this.f5785c = str;
        this.f5784b = zzalk;
        this.f5783a = zzall;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf c(Object obj, zzalf zzalf) throws Exception {
        zzbbn zzbbn = new zzbbn();
        zzq.zzkw();
        String q0 = zzaye.q0();
        zzagm.p.c(q0, new o2(this, zzbbn));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", q0);
        jSONObject.put("args", this.f5784b.b(obj));
        zzalf.e0(this.f5785c, jSONObject);
        return zzbbn;
    }

    public final zzdvf<O> zzf(I i) throws Exception {
        return zzdux.j(this.f5786d, new n2(this, i), zzbbf.f6142f);
    }
}
