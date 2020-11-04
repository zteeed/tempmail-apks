package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

@TargetApi(21)
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbgu extends zzbgr {
    public zzbgu(zzbfn zzbfn, zztm zztm, boolean z) {
        super(zzbfn, zztm, z);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return O(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}
