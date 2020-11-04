package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.util.Map;

@TargetApi(11)
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbgs extends zzbgr {
    public zzbgs(zzbfn zzbfn, zztm zztm, boolean z) {
        super(zzbfn, zztm, z);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return O(webView, str, (Map<String, String>) null);
    }
}
