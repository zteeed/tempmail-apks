package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.zzq;
import java.io.File;
import java.util.Collections;
import java.util.Map;

@TargetApi(11)
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzbgr extends zzbfq {
    public zzbgr(zzbfn zzbfn, zztm zztm, boolean z) {
        super(zzbfn, zztm, z);
    }

    /* access modifiers changed from: protected */
    public final WebResourceResponse O(WebView webView, String str, Map<String, String> map) {
        String str2;
        if (!(webView instanceof zzbfn)) {
            zzbba.i("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzbfn zzbfn = (zzbfn) webView;
        zzavr zzavr = this.s;
        if (zzavr != null) {
            zzavr.a(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.M(str, map);
        }
        if (zzbfn.q() != null) {
            zzbfn.q().m();
        }
        if (zzbfn.o().e()) {
            str2 = (String) zzwg.e().c(zzaav.F);
        } else if (zzbfn.h()) {
            str2 = (String) zzwg.e().c(zzaav.E);
        } else {
            str2 = (String) zzwg.e().c(zzaav.D);
        }
        zzq.zzkw();
        return zzaye.P(zzbfn.getContext(), zzbfn.a().f6314b, str2);
    }
}
