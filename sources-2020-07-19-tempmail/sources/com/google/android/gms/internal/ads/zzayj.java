package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import com.google.android.gms.ads.internal.zzq;
import java.io.InputStream;
import java.util.Map;

@TargetApi(16)
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzayj {
    private zzayj() {
    }

    public static boolean j(zzbfn zzbfn) {
        if (zzbfn == null) {
            return false;
        }
        zzbfn.onPause();
        return true;
    }

    public static boolean l(zzbfn zzbfn) {
        if (zzbfn == null) {
            return false;
        }
        zzbfn.onResume();
        return true;
    }

    public static zzayj o(int i) {
        if (i >= 28) {
            return new zzayu();
        }
        if (i >= 26) {
            return new zzayr();
        }
        if (i >= 24) {
            return new zzays();
        }
        if (i >= 21) {
            return new zzayp();
        }
        if (i >= 19) {
            return new zzayq();
        }
        if (i >= 18) {
            return new zzayn();
        }
        if (i >= 17) {
            return new zzayo();
        }
        return new zzayj();
    }

    public static boolean s() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    public String a(Context context) {
        return "";
    }

    public boolean b(View view) {
        return (view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true;
    }

    public int c(ContentResolver contentResolver) {
        return Settings.System.getInt(contentResolver, "wifi_on", 0);
    }

    public Drawable d(Context context, Bitmap bitmap, boolean z, float f2) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    public WebResourceResponse e(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    public zzbfq f(zzbfn zzbfn, zztm zztm, boolean z) {
        return new zzbgs(zzbfn, zztm, z);
    }

    public zzui g(Context context, TelephonyManager telephonyManager) {
        return zzui.ENUM_UNKNOWN;
    }

    public boolean h(Activity activity, Configuration configuration) {
        return false;
    }

    public boolean i(Context context, WebSettings webSettings) {
        zzbai.a(context, new o5(context, webSettings));
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
        return true;
    }

    public int k(ContentResolver contentResolver) {
        return Settings.System.getInt(contentResolver, "airplane_mode_on", 0);
    }

    public void m(Context context) {
    }

    public CookieManager n(Context context) {
        if (s()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            zzbba.c("Failed to obtain CookieManager.", th);
            zzq.zzla().e(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public void p(Activity activity) {
    }

    public int q() {
        return 5;
    }

    public ViewGroup.LayoutParams r() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    public int t() {
        return 1;
    }

    public long u() {
        return -1;
    }
}
