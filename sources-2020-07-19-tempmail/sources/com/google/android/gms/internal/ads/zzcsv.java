package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcsv implements zzcqu<zzdlm, zzcsd> {

    /* renamed from: a  reason: collision with root package name */
    private final zzcix f7472a;

    public zzcsv(zzcix zzcix) {
        this.f7472a = zzcix;
    }

    public final zzcqv<zzdlm, zzcsd> a(String str, JSONObject jSONObject) throws zzdlg {
        zzdlm d2 = this.f7472a.d(str, jSONObject);
        if (d2 == null) {
            return null;
        }
        return new zzcqv<>(d2, new zzcsd(), str);
    }
}
