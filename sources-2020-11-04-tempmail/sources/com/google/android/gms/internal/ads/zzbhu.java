package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.VisibleForTesting;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzbhu extends ha implements zzbhv {

    /* renamed from: b  reason: collision with root package name */
    private final zzbhs f6441b;
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    private boolean f6442c;
    @GuardedBy("this")

    /* renamed from: d  reason: collision with root package name */
    private boolean f6443d;

    public zzbhu(Context context, zzbhs zzbhs) {
        super(context);
        zzq.zzla().o();
        this.f6441b = zzbhs;
        super.setWebViewClient(zzbhs);
    }

    private final synchronized void E0() {
        if (!this.f6443d) {
            this.f6443d = true;
            zzq.zzla().p();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void C0() {
        super.destroy();
    }

    /* access modifiers changed from: protected */
    @GuardedBy("this")
    public void D0(boolean z) {
    }

    public final synchronized void I(zzbhr zzbhr) {
        zzaxv.m("Blank page loaded, 1...");
        T();
    }

    /* access modifiers changed from: protected */
    @VisibleForTesting
    public synchronized void T() {
        zzaxv.m("Destroying WebView!");
        E0();
        zzbbf.f6324e.execute(new ja(this));
    }

    public synchronized void destroy() {
        if (!this.f6442c) {
            this.f6442c = true;
            this.f6441b.r(this);
            D0(false);
            zzaxv.m("Initiating WebView self destruct sequence in 3...");
            zzaxv.m("Loading blank page in WebView, 2...");
            try {
                super.loadUrl("about:blank");
            } catch (UnsatisfiedLinkError e2) {
                zzq.zzla().e(e2, "AdWebViewImpl.loadUrlUnsafe");
                zzbba.e("#007 Could not call remote method.", e2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        return;
     */
    @android.annotation.TargetApi(19)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void evaluateJavascript(java.lang.String r2, android.webkit.ValueCallback<java.lang.String> r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.l()     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0014
            java.lang.String r2 = "#004 The webview is destroyed. Ignoring action."
            com.google.android.gms.internal.ads.zzbba.i(r2)     // Catch:{ all -> 0x0019 }
            if (r3 == 0) goto L_0x0012
            r2 = 0
            r3.onReceiveValue(r2)     // Catch:{ all -> 0x0019 }
        L_0x0012:
            monitor-exit(r1)
            return
        L_0x0014:
            super.evaluateJavascript(r2, r3)     // Catch:{ all -> 0x0019 }
            monitor-exit(r1)
            return
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbhu.evaluateJavascript(java.lang.String, android.webkit.ValueCallback):void");
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!l()) {
                    D0(true);
                }
                E0();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public final synchronized boolean l() {
        return this.f6442c;
    }

    public synchronized void loadData(String str, String str2, String str3) {
        if (!l()) {
            super.loadData(str, str2, str3);
        } else {
            zzbba.i("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!l()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            zzbba.i("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public synchronized void loadUrl(String str) {
        if (!l()) {
            super.loadUrl(str);
        } else {
            zzbba.i("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* access modifiers changed from: protected */
    @TargetApi(21)
    public void onDraw(Canvas canvas) {
        if (!l()) {
            super.onDraw(canvas);
        }
    }

    public void onPause() {
        if (!l()) {
            super.onPause();
        }
    }

    public void onResume() {
        if (!l()) {
            super.onResume();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return !l() && super.onTouchEvent(motionEvent);
    }

    public void setWebViewClient(WebViewClient webViewClient) {
    }

    public void stopLoading() {
        if (!l()) {
            super.stopLoading();
        }
    }
}
