package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class te0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private ValueCallback<String> f5161b = new we0(this);

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzrc f5162c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ WebView f5163d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f5164e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ zzri f5165f;

    te0(zzri zzri, zzrc zzrc, WebView webView, boolean z) {
        this.f5165f = zzri;
        this.f5162c = zzrc;
        this.f5163d = webView;
        this.f5164e = z;
    }

    public final void run() {
        if (this.f5163d.getSettings().getJavaScriptEnabled()) {
            try {
                this.f5163d.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f5161b);
            } catch (Throwable unused) {
                this.f5161b.onReceiveValue("");
            }
        }
    }
}
