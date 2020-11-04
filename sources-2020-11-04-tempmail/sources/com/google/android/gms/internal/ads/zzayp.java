package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.ads.internal.zzq;
import java.io.InputStream;
import java.util.Map;

@TargetApi(21)
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzayp extends zzayq {
    public final WebResourceResponse e(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i, str3, map, inputStream);
    }

    public final zzbfq f(zzbfn zzbfn, zztm zztm, boolean z) {
        return new zzbgu(zzbfn, zztm, z);
    }

    public final CookieManager n(Context context) {
        if (zzayj.s()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            zzbba.c("Failed to obtain CookieManager.", th);
            zzq.zzla().e(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public final int t() {
        return 16974374;
    }
}
