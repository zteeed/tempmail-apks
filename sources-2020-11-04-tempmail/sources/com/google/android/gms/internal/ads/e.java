package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class e extends zzaag<Float> {
    e(int i, String str, Float f2) {
        super(1, str, f2, (d) null);
    }

    public final /* synthetic */ Object g(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(a(), ((Float) m()).floatValue()));
    }

    public final /* synthetic */ Object h(Bundle bundle) {
        String valueOf = String.valueOf(a());
        if (!bundle.containsKey(valueOf.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf) : new String("com.google.android.gms.ads.flag."))) {
            return (Float) m();
        }
        String valueOf2 = String.valueOf(a());
        return Float.valueOf(bundle.getFloat(valueOf2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf2) : new String("com.google.android.gms.ads.flag.")));
    }

    public final /* synthetic */ void i(SharedPreferences.Editor editor, Object obj) {
        editor.putFloat(a(), ((Float) obj).floatValue());
    }

    public final /* synthetic */ Object l(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(a(), (double) ((Float) m()).floatValue()));
    }
}
