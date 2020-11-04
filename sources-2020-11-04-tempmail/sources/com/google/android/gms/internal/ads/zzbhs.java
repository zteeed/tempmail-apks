package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.http.SslError;
import android.view.KeyEvent;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzbhs extends WebViewClient {

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f6438b = {"UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"};

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f6439c = {"NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"};

    /* renamed from: a  reason: collision with root package name */
    private zzbhv f6440a;

    public final void onLoadResource(WebView webView, String str) {
        if (str != null) {
            String valueOf = String.valueOf(str);
            zzaxv.m(valueOf.length() != 0 ? "Loading resource: ".concat(valueOf) : new String("Loading resource: "));
            s(new zzbhr(str));
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        if (str != null) {
            zzbhr zzbhr = new zzbhr(str);
            zzbhv zzbhv = this.f6440a;
            if (zzbhv != null) {
                zzbhv.I(zzbhr);
            } else {
                q(zzbhr);
            }
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        if (i >= 0 || (-i) - 1 >= f6438b.length) {
            String.valueOf(i);
        }
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslError != null) {
            int primaryError = sslError.getPrimaryError();
            if (primaryError < 0 || primaryError >= f6439c.length) {
                String.valueOf(primaryError);
            }
            sslError.getUrl();
        }
    }

    public void q(zzbhr zzbhr) {
    }

    /* access modifiers changed from: package-private */
    public final void r(zzbhv zzbhv) {
        this.f6440a = zzbhv;
    }

    public void s(zzbhr zzbhr) {
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (str == null) {
            return null;
        }
        return u(new zzbhr(str));
    }

    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str == null) {
            return false;
        }
        return t(new zzbhr(str));
    }

    public boolean t(zzbhr zzbhr) {
        return false;
    }

    public WebResourceResponse u(zzbhr zzbhr) {
        return null;
    }

    @TargetApi(24)
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return u(new zzbhr(webResourceRequest));
    }

    @TargetApi(24)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return false;
        }
        return t(new zzbhr(webResourceRequest));
    }
}
