package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class d extends zzaag<Boolean> {
    d(int i, String str, Boolean bool) {
        super(i, str, bool, (d) null);
    }

    public final /* synthetic */ Object g(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(a(), ((Boolean) m()).booleanValue()));
    }

    public final /* synthetic */ Object h(Bundle bundle) {
        String valueOf = String.valueOf(a());
        if (!bundle.containsKey(valueOf.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf) : new String("com.google.android.gms.ads.flag."))) {
            return (Boolean) m();
        }
        String valueOf2 = String.valueOf(a());
        return Boolean.valueOf(bundle.getBoolean(valueOf2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf2) : new String("com.google.android.gms.ads.flag.")));
    }

    public final /* synthetic */ void i(SharedPreferences.Editor editor, Object obj) {
        editor.putBoolean(a(), ((Boolean) obj).booleanValue());
    }

    public final /* synthetic */ Object l(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(a(), ((Boolean) m()).booleanValue()));
    }
}
