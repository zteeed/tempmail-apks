package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class ka {
    @GuardedBy("InvokeJavascriptWorkaround.class")
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f4374a;

    private ka() {
    }

    @TargetApi(19)
    static void a(WebView webView, String str) {
        if (!PlatformVersion.f() || !b(webView)) {
            String valueOf = String.valueOf(str);
            webView.loadUrl(valueOf.length() != 0 ? "javascript:".concat(valueOf) : new String("javascript:"));
            return;
        }
        webView.evaluateJavascript(str, (ValueCallback) null);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0012 */
    @android.annotation.TargetApi(19)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean b(android.webkit.WebView r3) {
        /*
            java.lang.Class<com.google.android.gms.internal.ads.ka> r0 = com.google.android.gms.internal.ads.ka.class
            monitor-enter(r0)
            java.lang.Boolean r1 = f4374a     // Catch:{ all -> 0x001e }
            if (r1 != 0) goto L_0x0016
            java.lang.String r1 = "(function(){})()"
            r2 = 0
            r3.evaluateJavascript(r1, r2)     // Catch:{ IllegalStateException -> 0x0012 }
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ IllegalStateException -> 0x0012 }
            f4374a = r3     // Catch:{ IllegalStateException -> 0x0012 }
            goto L_0x0016
        L_0x0012:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x001e }
            f4374a = r3     // Catch:{ all -> 0x001e }
        L_0x0016:
            java.lang.Boolean r3 = f4374a     // Catch:{ all -> 0x001e }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x001e }
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return r3
        L_0x001e:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ka.b(android.webkit.WebView):boolean");
    }
}
