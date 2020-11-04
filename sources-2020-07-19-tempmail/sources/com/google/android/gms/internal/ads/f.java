package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class f extends zzaag<Long> {
    f(int i, String str, Long l) {
        super(1, str, l, (d) null);
    }

    public final /* synthetic */ Object g(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(a(), ((Long) m()).longValue()));
    }

    public final /* synthetic */ Object h(Bundle bundle) {
        String valueOf = String.valueOf(a());
        if (!bundle.containsKey(valueOf.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf) : new String("com.google.android.gms.ads.flag."))) {
            return (Long) m();
        }
        String valueOf2 = String.valueOf(a());
        return Long.valueOf(bundle.getLong(valueOf2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf2) : new String("com.google.android.gms.ads.flag.")));
    }

    public final /* synthetic */ void i(SharedPreferences.Editor editor, Object obj) {
        editor.putLong(a(), ((Long) obj).longValue());
    }

    public final /* synthetic */ Object l(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(a(), ((Long) m()).longValue()));
    }
}
