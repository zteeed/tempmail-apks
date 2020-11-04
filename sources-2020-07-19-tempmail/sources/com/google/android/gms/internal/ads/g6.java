package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.common.util.SharedPreferencesUtils;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class g6 implements Callable<String> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f3853b;

    g6(zzbah zzbah, Context context) {
        this.f3853b = context;
    }

    public final /* synthetic */ Object call() throws Exception {
        SharedPreferences sharedPreferences = this.f3853b.getSharedPreferences("admob_user_agent", 0);
        String string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            zzaxv.m("User agent is not initialized on Google Play Services. Initializing.");
            String defaultUserAgent = WebSettings.getDefaultUserAgent(this.f3853b);
            SharedPreferencesUtils.a(this.f3853b, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
            return defaultUserAgent;
        }
        zzaxv.m("User agent is already initialized on Google Play Services.");
        return string;
    }
}
