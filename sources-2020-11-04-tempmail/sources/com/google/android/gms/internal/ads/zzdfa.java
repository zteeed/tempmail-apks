package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdfa implements zzdec<zzdex> {

    /* renamed from: a  reason: collision with root package name */
    private final zzasp f8148a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f8149b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8150c;

    /* renamed from: d  reason: collision with root package name */
    private final zzdvi f8151d;

    public zzdfa(zzasp zzasp, Context context, String str, zzdvi zzdvi) {
        this.f8148a = zzasp;
        this.f8149b = context;
        this.f8150c = str;
        this.f8151d = zzdvi;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdex a() throws Exception {
        JSONObject jSONObject = new JSONObject();
        zzasp zzasp = this.f8148a;
        if (zzasp != null) {
            zzasp.a(this.f8149b, this.f8150c, jSONObject);
        }
        return new zzdex(jSONObject);
    }

    public final zzdvf<zzdex> b() {
        return this.f8151d.f(new pt(this));
    }
}
