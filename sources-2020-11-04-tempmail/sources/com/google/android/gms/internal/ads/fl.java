package com.google.android.gms.internal.ads;

import android.webkit.CookieManager;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class fl implements Callable {

    /* renamed from: b  reason: collision with root package name */
    private final CookieManager f3999b;

    fl(CookieManager cookieManager) {
        this.f3999b = cookieManager;
    }

    public final Object call() {
        CookieManager cookieManager = this.f3999b;
        if (cookieManager == null) {
            return "";
        }
        return cookieManager.getCookie((String) zzwg.e().c(zzaav.m0));
    }
}
