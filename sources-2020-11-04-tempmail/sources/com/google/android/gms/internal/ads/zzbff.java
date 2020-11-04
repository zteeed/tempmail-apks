package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.PlatformVersion;

@TargetApi(11)
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbff extends WebChromeClient {

    /* renamed from: a  reason: collision with root package name */
    private final zzbfn f6407a;

    public zzbff(zzbfn zzbfn) {
        this.f6407a = zzbfn;
    }

    private static Context a(WebView webView) {
        if (!(webView instanceof zzbfn)) {
            return webView.getContext();
        }
        zzbfn zzbfn = (zzbfn) webView;
        Activity b2 = zzbfn.b();
        if (b2 != null) {
            return b2;
        }
        return zzbfn.getContext();
    }

    private final boolean b(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        zzc l;
        try {
            if (this.f6407a == null || this.f6407a.q() == null || this.f6407a.q().l() == null || (l = this.f6407a.q().l()) == null || l.zzjy()) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle(str2);
                if (z) {
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(context);
                    textView.setText(str3);
                    EditText editText = new EditText(context);
                    editText.setText(str4);
                    linearLayout.addView(textView);
                    linearLayout.addView(editText);
                    builder.setView(linearLayout).setPositiveButton(17039370, new d9(jsPromptResult, editText)).setNegativeButton(17039360, new e9(jsPromptResult)).setOnCancelListener(new b9(jsPromptResult)).create().show();
                } else {
                    builder.setMessage(str3).setPositiveButton(17039370, new c9(jsResult)).setNegativeButton(17039360, new z8(jsResult)).setOnCancelListener(new a9(jsResult)).create().show();
                }
                return true;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(str3).length());
            sb.append("window.");
            sb.append(str);
            sb.append("('");
            sb.append(str3);
            sb.append("')");
            l.zzbn(sb.toString());
            return false;
        } catch (WindowManager.BadTokenException e2) {
            zzbba.d("Fail to display Dialog.", e2);
        }
    }

    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof zzbfn)) {
            zzbba.i("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzc o0 = ((zzbfn) webView).o0();
        if (o0 == null) {
            zzbba.i("Tried to close an AdWebView not associated with an overlay.");
        } else {
            o0.close();
        }
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        int lineNumber = consoleMessage.lineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 19 + String.valueOf(sourceId).length());
        sb.append("JS: ");
        sb.append(message);
        sb.append(" (");
        sb.append(sourceId);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(")");
        String sb2 = sb.toString();
        if (sb2.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = f9.f3953a[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            zzbba.g(sb2);
        } else if (i == 2) {
            zzbba.i(sb2);
        } else if (i == 3 || i == 4) {
            zzbba.h(sb2);
        } else if (i != 5) {
            zzbba.h(sb2);
        } else {
            zzbba.f(sb2);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.f6407a.q0() != null) {
            webView2.setWebViewClient(this.f6407a.q0());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j != 0) {
            if (j2 == 0) {
                j = Math.min(j + Math.min(PlaybackStateCompat.ACTION_PREPARE_FROM_URI, j4), PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
            } else if (j2 <= Math.min(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED - j, j4)) {
                j += j2;
            }
            j2 = j;
        } else if (j2 > j4 || j2 > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            j2 = 0;
        }
        quotaUpdater.updateQuota(j2);
    }

    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z;
        if (callback != null) {
            zzq.zzkw();
            if (!zzaye.l0(this.f6407a.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                zzq.zzkw();
                if (!zzaye.l0(this.f6407a.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z = false;
                    callback.invoke(str, z, true);
                }
            }
            z = true;
            callback.invoke(str, z, true);
        }
    }

    public final void onHideCustomView() {
        com.google.android.gms.ads.internal.overlay.zzc o0 = this.f6407a.o0();
        if (o0 == null) {
            zzbba.i("Could not get ad overlay when hiding custom view.");
        } else {
            o0.zzuj();
        }
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return b(a(webView), "alert", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return b(a(webView), "onBeforeUnload", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return b(a(webView), "confirm", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return b(a(webView), "prompt", str, str2, str3, (JsResult) null, jsPromptResult, true);
    }

    @TargetApi(21)
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        if (!PlatformVersion.h() || zzacw.f5799a.a().booleanValue()) {
            super.onPermissionRequest(permissionRequest);
            return;
        }
        zzbfn zzbfn = this.f6407a;
        if (zzbfn == null || zzbfn.q() == null || this.f6407a.q().p() == null) {
            super.onPermissionRequest(permissionRequest);
            return;
        }
        String[] e2 = this.f6407a.q().p().e(permissionRequest.getResources());
        if (e2.length > 0) {
            permissionRequest.grant(e2);
        } else {
            permissionRequest.deny();
        }
    }

    public final void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
        long j3 = j + PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
        if (5242880 - j2 < j3) {
            quotaUpdater.updateQuota(0);
        } else {
            quotaUpdater.updateQuota(j3);
        }
    }

    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }

    @Deprecated
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        com.google.android.gms.ads.internal.overlay.zzc o0 = this.f6407a.o0();
        if (o0 == null) {
            zzbba.i("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        o0.zza(view, customViewCallback);
        o0.setRequestedOrientation(i);
    }
}
