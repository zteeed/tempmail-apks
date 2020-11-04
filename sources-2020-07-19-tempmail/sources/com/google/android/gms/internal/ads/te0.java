package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class te0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private ValueCallback<String> f4978b = new we0(this);

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzrc f4979c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ WebView f4980d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f4981e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ zzri f4982f;

    te0(zzri zzri, zzrc zzrc, WebView webView, boolean z) {
        this.f4982f = zzri;
        this.f4979c = zzrc;
        this.f4980d = webView;
        this.f4981e = z;
    }

    public final void run() {
        if (this.f4980d.getSettings().getJavaScriptEnabled()) {
            try {
                this.f4980d.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f4978b);
            } catch (Throwable unused) {
                this.f4978b.onReceiveValue("");
            }
        }
    }
}
