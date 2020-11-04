package com.google.android.gms.internal.ads;

import a.h.k.u;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzt;
import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzto;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzbfq extends WebViewClient implements zzbgz {

    /* renamed from: a  reason: collision with root package name */
    protected zzbfn f6408a;

    /* renamed from: b  reason: collision with root package name */
    private final zztm f6409b;

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, List<zzahc<? super zzbfn>>> f6410c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f6411d;

    /* renamed from: e  reason: collision with root package name */
    private zzuu f6412e;

    /* renamed from: f  reason: collision with root package name */
    private zzo f6413f;
    private zzbhc g;
    private zzbhb h;
    private zzagi i;
    private zzagk j;
    private boolean k;
    @GuardedBy("lock")
    private boolean l;
    @GuardedBy("lock")
    private boolean m;
    @GuardedBy("lock")
    private boolean n;
    private zzt o;
    private final zzaqa p;
    private zzc q;
    private zzapt r;
    protected zzavr s;
    private boolean t;
    private boolean u;
    private int v;
    private boolean w;
    private View.OnAttachStateChangeListener x;

    public zzbfq(zzbfn zzbfn, zztm zztm, boolean z) {
        this(zzbfn, zztm, z, new zzaqa(zzbfn, zzbfn.d0(), new zzaac(zzbfn.getContext())), (zzapt) null);
    }

    private final void F() {
        if (this.x != null) {
            this.f6408a.getView().removeOnAttachStateChangeListener(this.x);
        }
    }

    private final void G() {
        if (this.g != null && ((this.t && this.v <= 0) || this.u)) {
            this.g.zzak(!this.u);
            this.g = null;
        }
        this.f6408a.B0();
    }

    private static WebResourceResponse H() {
        if (((Boolean) zzwg.e().c(zzaav.h0)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    private final WebResourceResponse N(String str, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnection;
        URL url = new URL(str);
        int i2 = 0;
        while (true) {
            i2++;
            if (i2 <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Map.Entry next : map.entrySet()) {
                    openConnection.addRequestProperty((String) next.getKey(), (String) next.getValue());
                }
                if (openConnection instanceof HttpURLConnection) {
                    httpURLConnection = (HttpURLConnection) openConnection;
                    zzq.zzkw().m(this.f6408a.getContext(), this.f6408a.a().f6314b, false, httpURLConnection);
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
                                return H();
                            } else if (protocol.equals("http") || protocol.equals("https")) {
                                String valueOf = String.valueOf(headerField);
                                zzbba.f(valueOf.length() != 0 ? "Redirecting to ".concat(valueOf) : new String("Redirecting to "));
                                httpURLConnection.disconnect();
                                url = url2;
                            } else {
                                String valueOf2 = String.valueOf(protocol);
                                zzbba.i(valueOf2.length() != 0 ? "Unsupported scheme: ".concat(valueOf2) : new String("Unsupported scheme: "));
                                return H();
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
    public final void r(View view, zzavr zzavr, int i2) {
        if (zzavr.g() && i2 > 0) {
            zzavr.d(view);
            if (zzavr.g()) {
                zzaye.h.postDelayed(new h9(this, view, zzavr, i2), 100);
            }
        }
    }

    private final void s(AdOverlayInfoParcel adOverlayInfoParcel) {
        zzd zzd;
        zzapt zzapt = this.r;
        boolean l2 = zzapt != null ? zzapt.l() : false;
        zzq.zzkv();
        zzn.zza(this.f6408a.getContext(), adOverlayInfoParcel, !l2);
        if (this.s != null) {
            String str = adOverlayInfoParcel.url;
            if (str == null && (zzd = adOverlayInfoParcel.zzdod) != null) {
                str = zzd.url;
            }
            this.s.f(str);
        }
    }

    /* access modifiers changed from: private */
    public final void y(Map<String, String> map, List<zzahc<? super zzbfn>> list, String str) {
        if (zzbba.a(2)) {
            String valueOf = String.valueOf(str);
            zzaxv.m(valueOf.length() != 0 ? "Received GMSG: ".concat(valueOf) : new String("Received GMSG: "));
            for (String next : map.keySet()) {
                String str2 = map.get(next);
                StringBuilder sb = new StringBuilder(String.valueOf(next).length() + 4 + String.valueOf(str2).length());
                sb.append("  ");
                sb.append(next);
                sb.append(": ");
                sb.append(str2);
                zzaxv.m(sb.toString());
            }
        }
        for (zzahc<? super zzbfn> a2 : list) {
            a2.a(this.f6408a, map);
        }
    }

    public final void A(boolean z, int i2, String str, String str2) {
        l9 l9Var;
        boolean h2 = this.f6408a.h();
        zzuu zzuu = (!h2 || this.f6408a.o().e()) ? this.f6412e : null;
        if (h2) {
            l9Var = null;
        } else {
            l9Var = new l9(this.f6408a, this.f6413f);
        }
        zzagi zzagi = this.i;
        zzagk zzagk = this.j;
        zzt zzt = this.o;
        zzbfn zzbfn = this.f6408a;
        s(new AdOverlayInfoParcel(zzuu, l9Var, zzagi, zzagk, zzt, zzbfn, z, i2, str, str2, zzbfn.a()));
    }

    public final boolean B() {
        boolean z;
        synchronized (this.f6411d) {
            z = this.m;
        }
        return z;
    }

    public final boolean C() {
        boolean z;
        synchronized (this.f6411d) {
            z = this.n;
        }
        return z;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener D() {
        synchronized (this.f6411d) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener E() {
        synchronized (this.f6411d) {
        }
        return null;
    }

    public final void I(boolean z) {
        this.k = z;
    }

    public final void J(String str, zzahc<? super zzbfn> zzahc) {
        synchronized (this.f6411d) {
            List list = this.f6410c.get(str);
            if (list != null) {
                list.remove(zzahc);
            }
        }
    }

    public final void K(boolean z) {
        this.w = z;
    }

    public final void L(boolean z, int i2) {
        zzuu zzuu = (!this.f6408a.h() || this.f6408a.o().e()) ? this.f6412e : null;
        zzo zzo = this.f6413f;
        zzt zzt = this.o;
        zzbfn zzbfn = this.f6408a;
        s(new AdOverlayInfoParcel(zzuu, zzo, zzt, zzbfn, z, i2, zzbfn.a()));
    }

    /* access modifiers changed from: protected */
    public final WebResourceResponse M(String str, Map<String, String> map) {
        zzsx d2;
        try {
            String d3 = zzawn.d(str, this.f6408a.getContext(), this.w);
            if (!d3.equals(str)) {
                return N(d3, map);
            }
            zzsy u2 = zzsy.u(str);
            if (u2 != null && (d2 = zzq.zzlc().d(u2)) != null && d2.u()) {
                return new WebResourceResponse("", "", d2.v());
            }
            if (!zzbau.a() || !zzacg.f5767b.a().booleanValue()) {
                return null;
            }
            return N(str, map);
        } catch (Exception | NoClassDefFoundError e2) {
            zzq.zzla().e(e2, "AdWebViewClient.interceptRequest");
            return H();
        }
    }

    public final void a(Uri uri) {
        String path = uri.getPath();
        List list = this.f6410c.get(path);
        if (list != null) {
            if (!((Boolean) zzwg.e().c(zzaav.C2)).booleanValue()) {
                zzq.zzkw();
                y(zzaye.d0(uri), list, path);
                return;
            }
            zzdux.f(zzq.zzkw().c0(uri), new j9(this, list, path), zzbbf.f6325f);
            return;
        }
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("No GMSG handler found for GMSG: ");
        sb.append(valueOf);
        zzaxv.m(sb.toString());
        if (((Boolean) zzwg.e().c(zzaav.B3)).booleanValue() && zzq.zzla().l() != null) {
            zzbbf.f6320a.execute(new i9(path));
        }
    }

    public final void b(zzbhc zzbhc) {
        this.g = zzbhc;
    }

    public final void c(zzbhb zzbhb) {
        this.h = zzbhb;
    }

    public final void d(int i2, int i3) {
        zzapt zzapt = this.r;
        if (zzapt != null) {
            zzapt.k(i2, i3);
        }
    }

    public final void e() {
        this.v--;
        G();
    }

    public final void f(zzuu zzuu, zzagi zzagi, zzo zzo, zzagk zzagk, zzt zzt, boolean z, zzahf zzahf, zzc zzc, zzaqc zzaqc, zzavr zzavr) {
        if (zzc == null) {
            zzc = new zzc(this.f6408a.getContext(), zzavr, (zzarx) null);
        }
        this.r = new zzapt(this.f6408a, zzaqc);
        this.s = zzavr;
        if (((Boolean) zzwg.e().c(zzaav.o0)).booleanValue()) {
            x("/adMetadata", new zzagj(zzagi));
        }
        x("/appEvent", new zzagl(zzagk));
        x("/backButton", zzagm.k);
        x("/refresh", zzagm.l);
        x("/canOpenApp", zzagm.f5874b);
        x("/canOpenURLs", zzagm.f5873a);
        x("/canOpenIntents", zzagm.f5875c);
        x("/click", zzagm.f5876d);
        x("/close", zzagm.f5877e);
        x("/customClose", zzagm.f5878f);
        x("/instrument", zzagm.o);
        x("/delayPageLoaded", zzagm.q);
        x("/delayPageClosed", zzagm.r);
        x("/getLocationInfo", zzagm.s);
        x("/httpTrack", zzagm.g);
        x("/log", zzagm.h);
        x("/mraid", new zzahh(zzc, this.r, zzaqc));
        x("/mraidLoaded", this.p);
        x("/open", new zzahg(zzc, this.r));
        x("/precache", new zzbex());
        x("/touch", zzagm.j);
        x("/video", zzagm.m);
        x("/videoMeta", zzagm.n);
        if (zzq.zzlu().l(this.f6408a.getContext())) {
            x("/logScionEvent", new zzahe(this.f6408a.getContext()));
        }
        this.f6412e = zzuu;
        this.f6413f = zzo;
        this.i = zzagi;
        this.j = zzagk;
        this.o = zzt;
        this.q = zzc;
        this.k = z;
    }

    public final void g() {
        zztm zztm = this.f6409b;
        if (zztm != null) {
            zztm.a(zzto.zza.C0084zza.DELAY_PAGE_LOAD_CANCELLED_AD);
        }
        this.u = true;
        G();
        if (((Boolean) zzwg.e().c(zzaav.F2)).booleanValue()) {
            this.f6408a.destroy();
        }
    }

    public final void h(boolean z) {
        synchronized (this.f6411d) {
            this.m = true;
        }
    }

    public final void i(int i2, int i3, boolean z) {
        this.p.h(i2, i3);
        zzapt zzapt = this.r;
        if (zzapt != null) {
            zzapt.h(i2, i3, false);
        }
    }

    public final void j() {
        zzavr zzavr = this.s;
        if (zzavr != null) {
            WebView webView = this.f6408a.getWebView();
            if (u.H(webView)) {
                r(webView, zzavr, 10);
                return;
            }
            F();
            this.x = new k9(this, zzavr);
            this.f6408a.getView().addOnAttachStateChangeListener(this.x);
        }
    }

    public final void k(boolean z) {
        synchronized (this.f6411d) {
            this.n = z;
        }
    }

    public final zzc l() {
        return this.q;
    }

    public final void m() {
        synchronized (this.f6411d) {
            this.k = false;
            this.l = true;
            zzbbf.f6324e.execute(new g9(this));
        }
    }

    public final void n() {
        synchronized (this.f6411d) {
        }
        this.v++;
        G();
    }

    public final boolean o() {
        boolean z;
        synchronized (this.f6411d) {
            z = this.l;
        }
        return z;
    }

    public final void onLoadResource(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        zzaxv.m(valueOf.length() != 0 ? "Loading resource: ".concat(valueOf) : new String("Loading resource: "));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            a(parse);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r1 == null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        r1.a();
        r0.h = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        G();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        r0.t = true;
        r1 = r0.h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageFinished(android.webkit.WebView r1, java.lang.String r2) {
        /*
            r0 = this;
            java.lang.Object r1 = r0.f6411d
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzbfn r2 = r0.f6408a     // Catch:{ all -> 0x0029 }
            boolean r2 = r2.l()     // Catch:{ all -> 0x0029 }
            if (r2 == 0) goto L_0x0017
            java.lang.String r2 = "Blank page loaded, 1..."
            com.google.android.gms.internal.ads.zzaxv.m(r2)     // Catch:{ all -> 0x0029 }
            com.google.android.gms.internal.ads.zzbfn r2 = r0.f6408a     // Catch:{ all -> 0x0029 }
            r2.T()     // Catch:{ all -> 0x0029 }
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            return
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            r1 = 1
            r0.t = r1
            com.google.android.gms.internal.ads.zzbhb r1 = r0.h
            if (r1 == 0) goto L_0x0025
            r1.a()
            r1 = 0
            r0.h = r1
        L_0x0025:
            r0.G()
            return
        L_0x0029:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbfq.onPageFinished(android.webkit.WebView, java.lang.String):void");
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        zzso Z = this.f6408a.Z();
        if (Z != null && webView == Z.getWebView()) {
            Z.b(webView, str, bitmap);
        }
        super.onPageStarted(webView, str, bitmap);
    }

    @TargetApi(26)
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.f6408a.w(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    public final zzavr p() {
        return this.s;
    }

    public final void q() {
        zzavr zzavr = this.s;
        if (zzavr != null) {
            zzavr.b();
            this.s = null;
        }
        F();
        synchronized (this.f6411d) {
            this.f6410c.clear();
            this.f6412e = null;
            this.f6413f = null;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = false;
            this.l = false;
            this.m = false;
            this.o = null;
            if (this.r != null) {
                this.r.i(true);
                this.r = null;
            }
        }
    }

    @TargetApi(11)
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return M(str, Collections.emptyMap());
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
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
        String valueOf = String.valueOf(str);
        zzaxv.m(valueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(valueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri parse = Uri.parse(str);
        if (!"gmsg".equalsIgnoreCase(parse.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            if (this.k && webView == this.f6408a.getWebView()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    zzuu zzuu = this.f6412e;
                    if (zzuu != null) {
                        zzuu.onAdClicked();
                        zzavr zzavr = this.s;
                        if (zzavr != null) {
                            zzavr.f(str);
                        }
                        this.f6412e = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (!this.f6408a.getWebView().willNotDraw()) {
                try {
                    zzeg d2 = this.f6408a.d();
                    if (d2 != null && d2.f(parse)) {
                        parse = d2.b(parse, this.f6408a.getContext(), this.f6408a.getView(), this.f6408a.b());
                    }
                } catch (zzef unused) {
                    String valueOf2 = String.valueOf(str);
                    zzbba.i(valueOf2.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf2) : new String("Unable to append parameter to URL: "));
                }
                zzc zzc = this.q;
                if (zzc == null || zzc.zzjy()) {
                    t(new zzd("android.intent.action.VIEW", parse.toString(), (String) null, (String) null, (String) null, (String) null, (String) null));
                } else {
                    this.q.zzbn(str);
                }
            } else {
                String valueOf3 = String.valueOf(str);
                zzbba.i(valueOf3.length() != 0 ? "AdWebView unable to handle URL: ".concat(valueOf3) : new String("AdWebView unable to handle URL: "));
            }
        } else {
            a(parse);
        }
        return true;
    }

    public final void t(zzd zzd) {
        zzo zzo;
        boolean h2 = this.f6408a.h();
        zzuu zzuu = (!h2 || this.f6408a.o().e()) ? this.f6412e : null;
        if (h2) {
            zzo = null;
        } else {
            zzo = this.f6413f;
        }
        s(new AdOverlayInfoParcel(zzd, zzuu, zzo, this.o, this.f6408a.a()));
    }

    public final void w(String str, Predicate<zzahc<? super zzbfn>> predicate) {
        synchronized (this.f6411d) {
            List<zzahc> list = this.f6410c.get(str);
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (zzahc zzahc : list) {
                    if (predicate.apply(zzahc)) {
                        arrayList.add(zzahc);
                    }
                }
                list.removeAll(arrayList);
            }
        }
    }

    public final void x(String str, zzahc<? super zzbfn> zzahc) {
        synchronized (this.f6411d) {
            List list = this.f6410c.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.f6410c.put(str, list);
            }
            list.add(zzahc);
        }
    }

    public final void z(boolean z, int i2, String str) {
        l9 l9Var;
        boolean h2 = this.f6408a.h();
        zzuu zzuu = (!h2 || this.f6408a.o().e()) ? this.f6412e : null;
        if (h2) {
            l9Var = null;
        } else {
            l9Var = new l9(this.f6408a, this.f6413f);
        }
        zzagi zzagi = this.i;
        zzagk zzagk = this.j;
        zzt zzt = this.o;
        zzbfn zzbfn = this.f6408a;
        s(new AdOverlayInfoParcel(zzuu, (zzo) l9Var, zzagi, zzagk, zzt, zzbfn, z, i2, str, zzbfn.a()));
    }

    @VisibleForTesting
    private zzbfq(zzbfn zzbfn, zztm zztm, boolean z, zzaqa zzaqa, zzapt zzapt) {
        this.f6410c = new HashMap<>();
        this.f6411d = new Object();
        this.k = false;
        this.f6409b = zztm;
        this.f6408a = zzbfn;
        this.l = z;
        this.p = zzaqa;
        this.r = null;
    }
}
