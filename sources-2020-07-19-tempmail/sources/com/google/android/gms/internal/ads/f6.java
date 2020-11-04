package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class f6 implements Callable<String> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f3763b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Context f3764c;

    f6(zzbah zzbah, Context context, Context context2) {
        this.f3763b = context;
        this.f3764c = context2;
    }

    public final /* synthetic */ Object call() throws Exception {
        SharedPreferences sharedPreferences;
        boolean z = false;
        if (this.f3763b != null) {
            zzaxv.m("Attempting to read user agent from Google Play Services.");
            sharedPreferences = this.f3763b.getSharedPreferences("admob_user_agent", 0);
        } else {
            zzaxv.m("Attempting to read user agent from local cache.");
            sharedPreferences = this.f3764c.getSharedPreferences("admob_user_agent", 0);
            z = true;
        }
        String string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            zzaxv.m("Reading user agent from WebSettings");
            string = WebSettings.getDefaultUserAgent(this.f3764c);
            if (z) {
                sharedPreferences.edit().putString("user_agent", string).apply();
                zzaxv.m("Persisting user agent.");
            }
        }
        return string;
    }
}
