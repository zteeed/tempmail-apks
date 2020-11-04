package com.google.android.gms.ads.query;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbba;
import org.json.JSONException;
import org.json.JSONObject;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public class AdInfo {
    private final QueryInfo zzhhc;
    private final String zzhhd;

    @KeepForSdk
    public AdInfo(QueryInfo queryInfo, String str) {
        this.zzhhc = queryInfo;
        this.zzhhd = str;
    }

    @KeepForSdk
    public static String getRequestId(String str) {
        if (str == null) {
            zzbba.i("adString passed to AdInfo.getRequestId() cannot be null. Returning empty string.");
            return "";
        }
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            zzbba.i("Invalid adString passed to AdInfo.getRequestId(). Returning empty string.");
            return "";
        }
    }

    @KeepForSdk
    public String getAdString() {
        return this.zzhhd;
    }

    @KeepForSdk
    public QueryInfo getQueryInfo() {
        return this.zzhhc;
    }
}
