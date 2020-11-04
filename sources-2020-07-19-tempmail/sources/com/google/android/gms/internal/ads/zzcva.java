package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcva implements zzcqu<zzaox, zzcsd> {

    /* renamed from: a  reason: collision with root package name */
    private final zzcwh f7576a;

    public zzcva(zzcwh zzcwh) {
        this.f7576a = zzcwh;
    }

    public final zzcqv<zzaox, zzcsd> a(String str, JSONObject jSONObject) throws zzdlg {
        zzaox b2 = this.f7576a.b(str);
        if (b2 == null) {
            return null;
        }
        return new zzcqv<>(b2, new zzcsd(), str);
    }
}
