package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class o5 implements Callable {

    /* renamed from: b  reason: collision with root package name */
    private final Context f4708b;

    /* renamed from: c  reason: collision with root package name */
    private final WebSettings f4709c;

    o5(Context context, WebSettings webSettings) {
        this.f4708b = context;
        this.f4709c = webSettings;
    }

    public final Object call() {
        Context context = this.f4708b;
        WebSettings webSettings = this.f4709c;
        if (context.getCacheDir() != null) {
            webSettings.setAppCachePath(context.getCacheDir().getAbsolutePath());
            webSettings.setAppCacheMaxSize(0);
            webSettings.setAppCacheEnabled(true);
        }
        webSettings.setDatabasePath(context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
        webSettings.setDatabaseEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setSupportZoom(true);
        webSettings.setAllowContentAccess(false);
        return Boolean.TRUE;
    }
}
