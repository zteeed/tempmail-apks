package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.android.gms.internal.ads.zzbgq;
import com.google.android.gms.internal.ads.zzbgy;
import com.google.android.gms.internal.ads.zzbha;

@TargetApi(17)
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbgm<WebViewT extends zzbgq & zzbgy & zzbha> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbgn f6422a;

    /* renamed from: b  reason: collision with root package name */
    private final WebViewT f6423b;

    private zzbgm(WebViewT webviewt, zzbgn zzbgn) {
        this.f6422a = zzbgn;
        this.f6423b = webviewt;
    }

    public static zzbgm<zzbfn> a(zzbfn zzbfn) {
        return new zzbgm<>(zzbfn, new y9(zzbfn));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(String str) {
        this.f6422a.a(Uri.parse(str));
    }

    @JavascriptInterface
    public final String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            zzaxv.m("Click string is empty, not proceeding.");
            return "";
        }
        zzeg d2 = ((zzbgy) this.f6423b).d();
        if (d2 == null) {
            zzaxv.m("Signal utils is empty, ignoring.");
            return "";
        }
        zzdw h = d2.h();
        if (h == null) {
            zzaxv.m("Signals object is empty, ignoring.");
            return "";
        } else if (this.f6423b.getContext() != null) {
            return h.zza(this.f6423b.getContext(), str, ((zzbha) this.f6423b).getView(), this.f6423b.b());
        } else {
            zzaxv.m("Context is null, ignoring.");
            return "";
        }
    }

    @JavascriptInterface
    public final void notify(String str) {
        if (TextUtils.isEmpty(str)) {
            zzbba.i("URL is empty, ignoring message");
        } else {
            zzaye.h.post(new z9(this, str));
        }
    }
}
