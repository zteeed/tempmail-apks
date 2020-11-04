package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.query.QueryInfo;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzzd {

    /* renamed from: a  reason: collision with root package name */
    private final String f9449a;

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f9450b;

    public zzzd(String str, Bundle bundle) {
        this.f9449a = str;
        this.f9450b = bundle;
    }

    public static String c(QueryInfo queryInfo) {
        String str = zzwg.i().get(queryInfo);
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    public final String a() {
        return this.f9449a;
    }

    public final Bundle b() {
        return this.f9450b;
    }
}
