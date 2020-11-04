package com.google.android.gms.internal.ads;

import a.h.k.u;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzt;
import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbhf extends zzbhs implements zzbgz {

    /* renamed from: d  reason: collision with root package name */
    protected zzbfn f6429d;

    /* renamed from: e  reason: collision with root package name */
    private final zzajt<zzbfn> f6430e = new zzajt<>();

    /* renamed from: f  reason: collision with root package name */
    private final Object f6431f = new Object();
    private zzuu g;
    private zzo h;
    private zzbhc i;
    private zzbhb j;
    private zzagi k;
    private zzagk l;
    private boolean m = false;
    private volatile boolean n;
    @GuardedBy("lock")
    private boolean o;
    @GuardedBy("lock")
    private boolean p;
    private zzt q;
    private zzaqa r;
    private zzc s;
    private zzapt t;
    private zzavr u;
    private boolean v;
    private boolean w;
    private int x;
    private boolean y;
    private View.OnAttachStateChangeListener z;

    private final void J() {
        if (this.z != null) {
            this.f6429d.getView().removeOnAttachStateChangeListener(this.z);
        }
    }

    private final void K() {
        if (this.i != null && ((this.v && this.x <= 0) || this.w)) {
            this.i.zzak(!this.w);
            this.i = null;
        }
        this.f6429d.B0();
    }

    private static WebResourceResponse L() {
        if (((Boolean) zzwg.e().c(zzaav.h0)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    private final WebResourceResponse Q(zzbhr zzbhr) throws IOException {
        HttpURLConnection httpURLConnection;
        URL url = new URL(zzbhr.f6435a);
        int i2 = 0;
        while (true) {
            i2++;
            if (i2 <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Map.Entry next : zzbhr.f6437c.entrySet()) {
                    openConnection.addRequestProperty((String) next.getKey(), (String) next.getValue());
                }
                if (openConnection instanceof HttpURLConnection) {
                    httpURLConnection = (HttpURLConnection) openConnection;
                    zzq.zzkw().m(this.f6429d.getContext(), this.f6429d.a().f6314b, false, httpURLConnection);
                    zzbau zzbau = new zzbau();
                    zzbau.i(httpURLConnection, (byte[]) null);
                    int responseCode = httpURLConnection.getResponseCode();
                    zzbau.h(httpURLConnection, responseCode);
                    if (responseCode < 300 || responseCode >= 400) {
                        zzq.zzkw();
                    } else {
                        String headerField = httpURLConnection.getHeaderField("Location");
                        if (headerField == null) {
                            throw new IOException("Missing Location header in redirect");
                        } else if (headerField.startsWith("tel:")) {
                            return null;
                        } else {
                            URL url2 = new URL(url, headerField);
                            String protocol = url2.getProtocol();
                            if (protocol == null) {
                                zzbba.i("Protocol is null");
                                return L();
                            } else if (protocol.equals("http") || protocol.equals("https")) {
                                String valueOf = String.valueOf(headerField);
                                zzbba.f(valueOf.length() != 0 ? "Redirecting to ".concat(valueOf) : new String("Redirecting to "));
                                httpURLConnection.disconnect();
                                url = url2;
                            } else {
                                String valueOf2 = String.valueOf(protocol);
                                zzbba.i(valueOf2.length() != 0 ? "Unsupported scheme: ".concat(valueOf2) : new String("Unsupported scheme: "));
                                return L();
                            }
                        }
                    }
                } else {
                    throw new IOException("Invalid protocol.");
                }
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Too many redirects (20)");
                throw new IOException(sb.toString());
            }
        }
        zzq.zzkw();
        return zzaye.Q(httpURLConnection);
    }

    /* access modifiers changed from: private */
    public final void w(View view, zzavr zzavr, int i2) {
        if (zzavr.g() && i2 > 0) {
            zzavr.d(view);
            if (zzavr.g()) {
                zzaye.h.postDelayed(new aa(this, view, zzavr, i2), 100);
            }
        }
    }

    private final void x(AdOverlayInfoParcel adOverlayInfoParcel) {
        zzd zzd;
        zzapt zzapt = this.t;
        boolean l2 = zzapt != null ? zzapt.l() : false;
        zzq.zzkv();
        zzn.zza(this.f6429d.getContext(), adOverlayInfoParcel, !l2);
        if (this.u != null) {
            String str = adOverlayInfoParcel.url;
            if (str == null && (zzd = adOverlayInfoParcel.zzdod) != null) {
                str = zzd.url;
            }
            this.u.f(str);
        }
    }

    public final void B(String str, Predicate<zzahc<? super zzbfn>> predicate) {
        this.f6430e.v(str, predicate);
    }

    public final void C(String str, zzahc<? super zzbfn> zzahc) {
        this.f6430e.c(str, zzahc);
    }

    public final void D(boolean z2, int i2, String str) {
        ca caVar;
        boolean h2 = this.f6429d.h();
        zzuu zzuu = (!h2 || this.f6429d.o().e()) ? this.g : null;
        if (h2) {
            caVar = null;
        } else {
            caVar = new ca(this.f6429d, this.h);
        }
        zzagi zzagi = this.k;
        zzagk zzagk = this.l;
        zzt zzt = this.q;
        zzbfn zzbfn = this.f6429d;
        x(new AdOverlayInfoParcel(zzuu, (zzo) caVar, zzagi, zzagk, zzt, zzbfn, z2, i2, str, zzbfn.a()));
    }

    public final void E(boolean z2, int i2, String str, String str2) {
        ca caVar;
        boolean h2 = this.f6429d.h();
        zzuu zzuu = (!h2 || this.f6429d.o().e()) ? this.g : null;
        if (h2) {
            caVar = null;
        } else {
            caVar = new ca(this.f6429d, this.h);
        }
        zzagi zzagi = this.k;
        zzagk zzagk = this.l;
        zzt zzt = this.q;
        zzbfn zzbfn = this.f6429d;
        x(new AdOverlayInfoParcel(zzuu, caVar, zzagi, zzagk, zzt, zzbfn, z2, i2, str, str2, zzbfn.a()));
    }

    public final boolean F() {
        boolean z2;
        synchronized (this.f6431f) {
            z2 = this.o;
        }
        return z2;
    }

    public final boolean G() {
        boolean z2;
        synchronized (this.f6431f) {
            z2 = this.p;
        }
        return z2;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener H() {
        synchronized (this.f6431f) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener I() {
        synchronized (this.f6431f) {
        }
        return null;
    }

    public final void M(boolean z2) {
        this.m = z2;
    }

    public final void N(String str, zzahc<? super zzbfn> zzahc) {
        this.f6430e.n(str, zzahc);
    }

    public final void O(boolean z2) {
        this.y = z2;
    }

    public final void P(boolean z2, int i2) {
        zzuu zzuu = (!this.f6429d.h() || this.f6429d.o().e()) ? this.g : null;
        zzo zzo = this.h;
        zzt zzt = this.q;
        zzbfn zzbfn = this.f6429d;
        x(new AdOverlayInfoParcel(zzuu, zzo, zzt, zzbfn, z2, i2, zzbfn.a()));
    }

    public final void a(Uri uri) {
        this.f6430e.C0(uri);
    }

    public final void b(zzbhc zzbhc) {
        this.i = zzbhc;
    }

    public final void c(zzbhb zzbhb) {
        this.j = zzbhb;
    }

    public final void d(int i2, int i3) {
        zzapt zzapt = this.t;
        if (zzapt != null) {
            zzapt.k(i2, i3);
        }
    }

    public final void e() {
        this.x--;
        K();
    }

    public final void f(zzuu zzuu, zzagi zzagi, zzo zzo, zzagk zzagk, zzt zzt, boolean z2, zzahf zzahf, zzc zzc, zzaqc zzaqc, zzavr zzavr) {
        if (zzc == null) {
            zzc = new zzc(this.f6429d.getContext(), zzavr, (zzarx) null);
        }
        this.t = new zzapt(this.f6429d, zzaqc);
        this.u = zzavr;
        if (((Boolean) zzwg.e().c(zzaav.o0)).booleanValue()) {
            C("/adMetadata", new zzagj(zzagi));
        }
        C("/appEvent", new zzagl(zzagk));
        C("/backButton", zzagm.k);
        C("/refresh", zzagm.l);
        C("/canOpenApp", zzagm.f5874b);
        C("/canOpenURLs", zzagm.f5873a);
        C("/canOpenIntents", zzagm.f5875c);
        C("/click", zzagm.f5876d);
        C("/close", zzagm.f5877e);
        C("/customClose", zzagm.f5878f);
        C("/instrument", zzagm.o);
        C("/delayPageLoaded", zzagm.q);
        C("/delayPageClosed", zzagm.r);
        C("/getLocationInfo", zzagm.s);
        C("/httpTrack", zzagm.g);
        C("/log", zzagm.h);
        C("/mraid", new zzahh(zzc, this.t, zzaqc));
        C("/mraidLoaded", this.r);
        C("/open", new zzahg(zzc, this.t));
        C("/precache", new zzbex());
        C("/touch", zzagm.j);
        C("/video", zzagm.m);
        C("/videoMeta", zzagm.n);
        if (zzq.zzlu().l(this.f6429d.getContext())) {
            C("/logScionEvent", new zzahe(this.f6429d.getContext()));
        }
        this.g = zzuu;
        this.h = zzo;
        this.k = zzagi;
        this.l = zzagk;
        this.q = zzt;
        this.s = zzc;
        this.m = z2;
    }

    public final void g() {
        this.w = true;
        K();
    }

    public final void h(boolean z2) {
        synchronized (this.f6431f) {
            this.o = true;
        }
    }

    public final void i(int i2, int i3, boolean z2) {
        this.r.h(i2, i3);
        zzapt zzapt = this.t;
        if (zzapt != null) {
            zzapt.h(i2, i3, false);
        }
    }

    public final void j() {
        zzavr zzavr = this.u;
        if (zzavr != null) {
            WebView webView = this.f6429d.getWebView();
            if (u.H(webView)) {
                w(webView, zzavr, 10);
                return;
            }
            J();
            this.z = new da(this, zzavr);
            this.f6429d.getView().addOnAttachStateChangeListener(this.z);
        }
    }

    public final void k(boolean z2) {
        synchronized (this.f6431f) {
            this.p = z2;
        }
    }

    public final zzc l() {
        return this.s;
    }

    public final void m() {
        synchronized (this.f6431f) {
            this.m = false;
            this.n = true;
            zzbbf.f6324e.execute(new ba(this));
        }
    }

    public final void n() {
        synchronized (this.f6431f) {
        }
        this.x++;
        K();
    }

    public final boolean o() {
        return this.n;
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        zzso Z = this.f6429d.Z();
        if (Z != null && webView == Z.getWebView()) {
            Z.b(webView, str, bitmap);
        }
        super.onPageStarted(webView, str, bitmap);
    }

    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.f6429d.w(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    public final zzavr p() {
        return this.u;
    }

    public final void q(zzbhr zzbhr) {
        this.v = true;
        zzbhb zzbhb = this.j;
        if (zzbhb != null) {
            zzbhb.a();
            this.j = null;
        }
        K();
    }

    public final void s(zzbhr zzbhr) {
        this.f6430e.y0(zzbhr.f6436b);
    }

    public final boolean t(zzbhr zzbhr) {
        String valueOf = String.valueOf(zzbhr.f6435a);
        zzaxv.m(valueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(valueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri uri = zzbhr.f6436b;
        if (this.f6430e.y0(uri)) {
            return true;
        }
        if (this.m) {
            String scheme = uri.getScheme();
            if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                zzuu zzuu = this.g;
                if (zzuu != null) {
                    zzuu.onAdClicked();
                    zzavr zzavr = this.u;
                    if (zzavr != null) {
                        zzavr.f(zzbhr.f6435a);
                    }
                    this.g = null;
                }
                return false;
            }
        }
        if (!this.f6429d.getWebView().willNotDraw()) {
            try {
                zzeg d2 = this.f6429d.d();
                if (d2 != null && d2.f(uri)) {
                    uri = d2.b(uri, this.f6429d.getContext(), this.f6429d.getView(), this.f6429d.b());
                }
            } catch (zzef unused) {
                String valueOf2 = String.valueOf(zzbhr.f6435a);
                zzbba.i(valueOf2.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf2) : new String("Unable to append parameter to URL: "));
            }
            zzc zzc = this.s;
            if (zzc == null || zzc.zzjy()) {
                y(new zzd("android.intent.action.VIEW", uri.toString(), (String) null, (String) null, (String) null, (String) null, (String) null));
            } else {
                this.s.zzbn(zzbhr.f6435a);
            }
        } else {
            String valueOf3 = String.valueOf(zzbhr.f6435a);
            zzbba.i(valueOf3.length() != 0 ? "AdWebView unable to handle URL: ".concat(valueOf3) : new String("AdWebView unable to handle URL: "));
        }
        return true;
    }

    public final WebResourceResponse u(zzbhr zzbhr) {
        WebResourceResponse webResourceResponse;
        zzsx d2;
        String str;
        zzavr zzavr = this.u;
        if (zzavr != null) {
            zzavr.a(zzbhr.f6435a, zzbhr.f6437c, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(zzbhr.f6435a).getName())) {
            webResourceResponse = null;
        } else {
            m();
            if (this.f6429d.o().e()) {
                str = (String) zzwg.e().c(zzaav.F);
            } else if (this.f6429d.h()) {
                str = (String) zzwg.e().c(zzaav.E);
            } else {
                str = (String) zzwg.e().c(zzaav.D);
            }
            zzq.zzkw();
            webResourceResponse = zzaye.P(this.f6429d.getContext(), this.f6429d.a().f6314b, str);
        }
        if (webResourceResponse != null) {
            return webResourceResponse;
        }
        try {
            if (!zzawn.d(zzbhr.f6435a, this.f6429d.getContext(), this.y).equals(zzbhr.f6435a)) {
                return Q(zzbhr);
            }
            zzsy u2 = zzsy.u(zzbhr.f6435a);
            if (u2 != null && (d2 = zzq.zzlc().d(u2)) != null && d2.u()) {
                return new WebResourceResponse("", "", d2.v());
            }
            if (!zzbau.a() || !zzacg.f5767b.a().booleanValue()) {
                return null;
            }
            return Q(zzbhr);
        } catch (Exception | NoClassDefFoundError e2) {
            zzq.zzla().e(e2, "AdWebViewClient.interceptRequest");
            return L();
        }
    }

    public final void v() {
        zzavr zzavr = this.u;
        if (zzavr != null) {
            zzavr.b();
            this.u = null;
        }
        J();
        this.f6430e.I();
        this.f6430e.k0(null);
        synchronized (this.f6431f) {
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = null;
            this.q = null;
            if (this.t != null) {
                this.t.i(true);
                this.t = null;
            }
        }
    }

    public final void y(zzd zzd) {
        zzo zzo;
        boolean h2 = this.f6429d.h();
        zzuu zzuu = (!h2 || this.f6429d.o().e()) ? this.g : null;
        if (h2) {
            zzo = null;
        } else {
            zzo = this.h;
        }
        x(new AdOverlayInfoParcel(zzd, zzuu, zzo, this.q, this.f6429d.a()));
    }

    /* access modifiers changed from: package-private */
    public final void z(zzbfn zzbfn, boolean z2) {
        zzaqa zzaqa = new zzaqa(zzbfn, zzbfn.d0(), new zzaac(zzbfn.getContext()));
        this.f6429d = zzbfn;
        this.n = z2;
        this.r = zzaqa;
        this.t = null;
        this.f6430e.k0(zzbfn);
    }
}
