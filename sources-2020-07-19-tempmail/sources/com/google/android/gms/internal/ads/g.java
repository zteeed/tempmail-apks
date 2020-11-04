package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class g extends zzaag<String> {
    g(int i, String str, String str2) {
        super(i, str, str2, (d) null);
    }

    public final /* synthetic */ Object g(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(a(), (String) m());
    }

    public final /* synthetic */ Object h(Bundle bundle) {
        String valueOf = String.valueOf(a());
        if (!bundle.containsKey(valueOf.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf) : new String("com.google.android.gms.ads.flag."))) {
            return (String) m();
        }
        String valueOf2 = String.valueOf(a());
        return bundle.getString(valueOf2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf2) : new String("com.google.android.gms.ads.flag."));
    }

    public final /* synthetic */ void i(SharedPreferences.Editor editor, Object obj) {
        editor.putString(a(), (String) obj);
    }

    public final /* synthetic */ Object l(JSONObject jSONObject) {
        return jSONObject.optString(a(), (String) m());
    }
}
