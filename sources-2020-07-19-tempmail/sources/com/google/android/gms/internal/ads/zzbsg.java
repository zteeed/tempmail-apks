package com.google.android.gms.internal.ads;

import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbsg extends zzyg {

    /* renamed from: b  reason: collision with root package name */
    private final String f6622b;

    /* renamed from: c  reason: collision with root package name */
    private final String f6623c;

    public zzbsg(zzdkk zzdkk, String str) {
        String str2;
        String str3 = null;
        if (zzdkk == null) {
            str2 = null;
        } else {
            str2 = zzdkk.T;
        }
        this.f6623c = str2;
        str3 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str) ? A6(zzdkk) : str3;
        this.f6622b = str3 != null ? str3 : str;
    }

    private static String A6(zzdkk zzdkk) {
        try {
            return zzdkk.s.getString("class_name");
        } catch (JSONException unused) {
            return null;
        }
    }

    public final String M4() {
        return this.f6623c;
    }

    public final String getMediationAdapterClassName() {
        return this.f6622b;
    }
}
