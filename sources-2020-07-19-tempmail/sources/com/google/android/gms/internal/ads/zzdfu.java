package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdfu implements zzddz<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private List<String> f8004a;

    public zzdfu(List<String> list) {
        this.f8004a = list;
    }

    public final /* synthetic */ void a(Object obj) {
        try {
            ((JSONObject) obj).put("eid", TextUtils.join(",", this.f8004a));
        } catch (JSONException unused) {
            zzaxv.m("Failed putting experiment ids.");
        }
    }
}
