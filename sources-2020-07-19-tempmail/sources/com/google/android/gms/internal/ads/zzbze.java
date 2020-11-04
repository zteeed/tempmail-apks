package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbze implements zzso {

    /* renamed from: a  reason: collision with root package name */
    private zzdrw f6713a;

    public final void a(Activity activity, WebView webView) {
        try {
            this.f6713a = new zzdrw(activity, webView);
        } catch (RuntimeException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
            sb.append(" Failed to initialize the internal ArWebView: ");
            sb.append(valueOf);
            zzbba.g(sb.toString());
        }
    }

    public final void b(WebView webView, String str, Bitmap bitmap) {
        if (this.f6713a != null) {
            zzdrw.a(webView, str, bitmap);
        }
    }

    public final void c(String str, String str2) {
        if (this.f6713a == null) {
            zzbba.g("ArWebView is not initialized.");
        } else {
            zzdrw.getWebView().loadDataWithBaseURL(str, str2, "text/html", "UTF-8", (String) null);
        }
    }

    public final View getView() {
        return this.f6713a;
    }

    public final WebView getWebView() {
        if (this.f6713a == null) {
            return null;
        }
        return zzdrw.getWebView();
    }
}
