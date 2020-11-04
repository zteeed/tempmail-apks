package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.SharedPreferencesUtils;

@TargetApi(17)
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzayo extends zzayj {
    public zzayo() {
        super();
    }

    public final String a(Context context) {
        String str;
        zzbah a2 = zzbah.a();
        if (TextUtils.isEmpty(a2.f6283a)) {
            if (ClientLibraryUtils.b()) {
                str = (String) zzbai.a(context, new g6(a2, context));
            } else {
                str = (String) zzbai.a(context, new f6(a2, GooglePlayServicesUtilLight.getRemoteContext(context), context));
            }
            a2.f6283a = str;
        }
        return a2.f6283a;
    }

    public final int c(ContentResolver contentResolver) {
        return Settings.Global.getInt(contentResolver, "wifi_on", 0);
    }

    public final Drawable d(Context context, Bitmap bitmap, boolean z, float f2) {
        if (!z || f2 <= 0.0f || f2 > 25.0f) {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
        try {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
            Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
            RenderScript create = RenderScript.create(context);
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            create2.setRadius(f2);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            return new BitmapDrawable(context.getResources(), createBitmap);
        } catch (RuntimeException unused) {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
    }

    public final boolean i(Context context, WebSettings webSettings) {
        super.i(context, webSettings);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
        return true;
    }

    public final int k(ContentResolver contentResolver) {
        return Settings.Global.getInt(contentResolver, "airplane_mode_on", 0);
    }

    public final void m(Context context) {
        zzbah a2 = zzbah.a();
        zzaxv.m("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(a2.f6283a)) {
            Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
            if (ClientLibraryUtils.b() || remoteContext == null) {
                SharedPreferences.Editor putString = context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context));
                if (remoteContext == null) {
                    putString.apply();
                } else {
                    SharedPreferencesUtils.a(context, putString, "admob_user_agent");
                }
            }
            a2.f6283a = defaultUserAgent;
        }
        zzaxv.m("User agent is updated.");
    }
}
