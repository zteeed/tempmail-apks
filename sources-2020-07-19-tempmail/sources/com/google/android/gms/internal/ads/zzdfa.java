package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdfa implements zzdec<zzdex> {

    /* renamed from: a  reason: collision with root package name */
    private final zzasp f7965a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f7966b;

    /* renamed from: c  reason: collision with root package name */
    private final String f7967c;

    /* renamed from: d  reason: collision with root package name */
    private final zzdvi f7968d;

    public zzdfa(zzasp zzasp, Context context, String str, zzdvi zzdvi) {
        this.f7965a = zzasp;
        this.f7966b = context;
        this.f7967c = str;
        this.f7968d = zzdvi;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdex a() throws Exception {
        JSONObject jSONObject = new JSONObject();
        zzasp zzasp = this.f7965a;
        if (zzasp != null) {
            zzasp.a(this.f7966b, this.f7967c, jSONObject);
        }
        return new zzdex(jSONObject);
    }

    public final zzdvf<zzdex> b() {
        return this.f7968d.f(new pt(this));
    }
}
