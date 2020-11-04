package com.google.android.gms.internal.ads;

import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbsg extends zzyg {

    /* renamed from: b  reason: collision with root package name */
    private final String f6805b;

    /* renamed from: c  reason: collision with root package name */
    private final String f6806c;

    public zzbsg(zzdkk zzdkk, String str) {
        String str2;
        String str3 = null;
        if (zzdkk == null) {
            str2 = null;
        } else {
            str2 = zzdkk.T;
        }
        this.f6806c = str2;
        str3 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str) ? f7(zzdkk) : str3;
        this.f6805b = str3 != null ? str3 : str;
    }

    private static String f7(zzdkk zzdkk) {
        try {
            return zzdkk.s.getString("class_name");
        } catch (JSONException unused) {
            return null;
        }
    }

    public final String g5() {
        return this.f6806c;
    }

    public final String getMediationAdapterClassName() {
        return this.f6805b;
    }
}
