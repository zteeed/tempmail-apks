package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class c extends zzaag<Integer> {
    c(int i, String str, Integer num) {
        super(1, str, num, (d) null);
    }

    public final /* synthetic */ Object g(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(a(), ((Integer) m()).intValue()));
    }

    public final /* synthetic */ Object h(Bundle bundle) {
        String valueOf = String.valueOf(a());
        if (!bundle.containsKey(valueOf.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf) : new String("com.google.android.gms.ads.flag."))) {
            return (Integer) m();
        }
        String valueOf2 = String.valueOf(a());
        return Integer.valueOf(bundle.getInt(valueOf2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf2) : new String("com.google.android.gms.ads.flag.")));
    }

    public final /* synthetic */ void i(SharedPreferences.Editor editor, Object obj) {
        editor.putInt(a(), ((Integer) obj).intValue());
    }

    public final /* synthetic */ Object l(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(a(), ((Integer) m()).intValue()));
    }
}
