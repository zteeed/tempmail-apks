package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public interface zzso {
    void a(Activity activity, WebView webView);

    void b(WebView webView, String str, Bitmap bitmap);

    void c(String str, String str2);

    View getView();

    WebView getWebView();
}
