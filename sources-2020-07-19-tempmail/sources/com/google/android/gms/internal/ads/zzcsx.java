package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcsx implements zzcsu<zzccd> {

    /* renamed from: a  reason: collision with root package name */
    private final zzcbc f7473a;

    /* renamed from: b  reason: collision with root package name */
    private final zzdvi f7474b;

    /* renamed from: c  reason: collision with root package name */
    private final zzceu f7475c;

    /* renamed from: d  reason: collision with root package name */
    private final zzdll<zzcgr> f7476d;

    public zzcsx(zzcbc zzcbc, zzdvi zzdvi, zzceu zzceu, zzdll<zzcgr> zzdll) {
        this.f7473a = zzcbc;
        this.f7474b = zzdvi;
        this.f7475c = zzceu;
        this.f7476d = zzdll;
    }

    private final zzdvf<zzccd> g(zzdkw zzdkw, zzdkk zzdkk, JSONObject jSONObject) {
        zzdvf<zzcgr> a2 = this.f7476d.a();
        zzdvf<zzcck> a3 = this.f7475c.a(zzdkw, zzdkk, jSONObject);
        return zzdux.h(a2, a3).a(new oo(this, a3, a2, zzdkw, zzdkk, jSONObject), this.f7474b);
    }

    public final zzdvf<List<zzdvf<zzccd>>> a(zzdkw zzdkw, zzdkk zzdkk) {
        return zzdux.j(zzdux.j(this.f7476d.a(), new ko(this, zzdkk), this.f7474b), new mo(this, zzdkw, zzdkk), this.f7474b);
    }

    public final boolean b(zzdkw zzdkw, zzdkk zzdkk) {
        zzdko zzdko = zzdkk.p;
        return (zzdko == null || zzdko.f8146c == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzccd c(zzdvf zzdvf, zzdvf zzdvf2, zzdkw zzdkw, zzdkk zzdkk, JSONObject jSONObject) throws Exception {
        zzcck zzcck = (zzcck) zzdvf.get();
        zzcgr zzcgr = (zzcgr) zzdvf2.get();
        zzccm a2 = this.f7473a.a(new zzbpr(zzdkw, zzdkk, (String) null), new zzccw(zzcck), new zzcbr(jSONObject, zzcgr));
        a2.i().b();
        a2.j().a(zzcgr);
        a2.k().c(zzcck.F());
        return a2.h();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf d(zzcgr zzcgr, JSONObject jSONObject) throws Exception {
        this.f7476d.b(zzdux.g(zzcgr));
        if (jSONObject.optBoolean("success")) {
            return zzdux.g(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new zzalg("process json failed");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf e(zzdkk zzdkk, zzcgr zzcgr) throws Exception {
        JSONObject d2 = zzazy.d("isNonagon", Boolean.TRUE);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("response", zzdkk.p.f8146c);
        jSONObject.put("sdk_params", d2);
        return zzdux.j(zzcgr.i("google.afma.nativeAds.preProcessJson", jSONObject), new lo(this, zzcgr), this.f7474b);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf f(zzdkw zzdkw, zzdkk zzdkk, JSONArray jSONArray) throws Exception {
        if (jSONArray.length() == 0) {
            return zzdux.a(new zzcmi(zzdls.f8182c));
        }
        if (zzdkw.f8161a.f8149a.k <= 1) {
            return zzdux.i(g(zzdkw, zzdkk, jSONArray.getJSONObject(0)), po.f4652a, this.f7474b);
        }
        int length = jSONArray.length();
        this.f7476d.c(Math.min(length, zzdkw.f8161a.f8149a.k));
        ArrayList arrayList = new ArrayList(zzdkw.f8161a.f8149a.k);
        for (int i = 0; i < zzdkw.f8161a.f8149a.k; i++) {
            if (i < length) {
                arrayList.add(g(zzdkw, zzdkk, jSONArray.getJSONObject(i)));
            } else {
                arrayList.add(zzdux.a(new zzcmi(zzdls.f8182c)));
            }
        }
        return zzdux.g(arrayList);
    }
}
