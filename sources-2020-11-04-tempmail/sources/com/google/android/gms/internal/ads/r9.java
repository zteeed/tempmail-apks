package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzi;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzto;
import com.google.android.gms.internal.ads.zzty;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class r9 extends WebView implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, zzbfn {
    @GuardedBy("this")
    private boolean A;
    @GuardedBy("this")
    private boolean B;
    @GuardedBy("this")
    private zzadh C;
    @GuardedBy("this")
    private zzadc D;
    @GuardedBy("this")
    private zzsa E;
    @GuardedBy("this")
    private int F;
    /* access modifiers changed from: private */
    @GuardedBy("this")
    public int G;
    private zzabg H;
    private zzabg I;
    private zzabg J;
    private zzabj K;
    @GuardedBy("this")
    private zzc L;
    @GuardedBy("this")
    private boolean M;
    private zzban N;
    private int O = -1;
    private int P = -1;
    private int Q = -1;
    private int R = -1;
    private Map<String, zzbes> S;
    private final WindowManager T;
    private final zztm U;

    /* renamed from: b  reason: collision with root package name */
    private final zzbhd f4981b;

    /* renamed from: c  reason: collision with root package name */
    private final zzeg f4982c;

    /* renamed from: d  reason: collision with root package name */
    private final zzbbd f4983d;

    /* renamed from: e  reason: collision with root package name */
    private final zzi f4984e;

    /* renamed from: f  reason: collision with root package name */
    private final zza f4985f;
    private final DisplayMetrics g;
    private final float h;
    private final zzso i;
    private final boolean j;
    private boolean k = false;
    private boolean l = false;
    private zzbfq m;
    @GuardedBy("this")
    private zzc n;
    @GuardedBy("this")
    private IObjectWrapper o;
    @GuardedBy("this")
    private zzbhg p;
    @GuardedBy("this")
    private String q;
    @GuardedBy("this")
    private boolean r;
    @GuardedBy("this")
    private boolean s;
    @GuardedBy("this")
    private boolean t;
    @GuardedBy("this")
    private boolean u;
    @GuardedBy("this")
    private Boolean v;
    @GuardedBy("this")
    private int w;
    @GuardedBy("this")
    private boolean x = true;
    @GuardedBy("this")
    private String y = "";
    @GuardedBy("this")
    private zzbgh z;

    @VisibleForTesting
    private r9(zzbhd zzbhd, zzbhg zzbhg, String str, boolean z2, boolean z3, zzeg zzeg, zzbbd zzbbd, zzabi zzabi, zzi zzi, zza zza, zztm zztm, zzso zzso, boolean z4) {
        super(zzbhd);
        this.f4981b = zzbhd;
        this.p = zzbhg;
        this.q = str;
        this.t = z2;
        this.w = -1;
        this.f4982c = zzeg;
        this.f4983d = zzbbd;
        this.f4984e = zzi;
        this.f4985f = zza;
        this.T = (WindowManager) getContext().getSystemService("window");
        zzq.zzkw();
        DisplayMetrics b2 = zzaye.b(this.T);
        this.g = b2;
        this.h = b2.density;
        this.U = zztm;
        this.i = zzso;
        this.j = z4;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e2) {
            zzbba.c("Unable to enable Javascript.", e2);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        zzq.zzkw().k(zzbhd, zzbbd.f6314b, settings);
        zzq.zzky().i(getContext(), settings);
        setDownloadListener(this);
        J0();
        if (PlatformVersion.d()) {
            addJavascriptInterface(zzbgm.a(this), "googleAdsJsInterface");
        }
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        this.N = new zzban(this.f4981b.b(), this, this, (ViewTreeObserver.OnScrollChangedListener) null);
        N0();
        zzabj zzabj = new zzabj(new zzabi(true, "make_wv", this.q));
        this.K = zzabj;
        zzabj.c().b(zzabi);
        zzabg b3 = zzabd.b(this.K.c());
        this.I = b3;
        this.K.a("native:view_create", b3);
        this.J = null;
        this.H = null;
        zzq.zzky().m(zzbhd);
        zzq.zzla().o();
    }

    @VisibleForTesting
    private final void D0(Boolean bool) {
        synchronized (this) {
            this.v = bool;
        }
        zzq.zzla().d(bool);
    }

    @TargetApi(19)
    private final synchronized void E0(String str, ValueCallback<String> valueCallback) {
        if (!l()) {
            evaluateJavascript(str, (ValueCallback<String>) null);
        } else {
            zzbba.i("#004 The webview is destroyed. Ignoring action.");
        }
    }

    static final /* synthetic */ void F0(boolean z2, int i2, zzty.zzi.zza zza) {
        zzty.zzae.zza M2 = zzty.zzae.M();
        if (M2.x() != z2) {
            M2.y(z2);
        }
        M2.w(i2);
        zza.y((zzty.zzae) ((zzegb) M2.O()));
    }

    private final boolean G0() {
        int i2;
        int i3;
        boolean z2 = false;
        if (!this.m.o() && !this.m.B()) {
            return false;
        }
        zzwg.a();
        DisplayMetrics displayMetrics = this.g;
        int k2 = zzbaq.k(displayMetrics, displayMetrics.widthPixels);
        zzwg.a();
        DisplayMetrics displayMetrics2 = this.g;
        int k3 = zzbaq.k(displayMetrics2, displayMetrics2.heightPixels);
        Activity b2 = this.f4981b.b();
        if (b2 == null || b2.getWindow() == null) {
            i3 = k2;
            i2 = k3;
        } else {
            zzq.zzkw();
            int[] S2 = zzaye.S(b2);
            zzwg.a();
            int k4 = zzbaq.k(this.g, S2[0]);
            zzwg.a();
            i2 = zzbaq.k(this.g, S2[1]);
            i3 = k4;
        }
        if (this.P == k2 && this.O == k3 && this.Q == i3 && this.R == i2) {
            return false;
        }
        if (!(this.P == k2 && this.O == k3)) {
            z2 = true;
        }
        this.P = k2;
        this.O = k3;
        this.Q = i3;
        this.R = i2;
        new zzaqd(this).b(k2, k3, i3, i2, this.g.density, this.T.getDefaultDisplay().getRotation());
        return z2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:9|10|11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        D0(java.lang.Boolean.FALSE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void H0() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzaxh r0 = com.google.android.gms.ads.internal.zzq.zzla()     // Catch:{ all -> 0x0021 }
            java.lang.Boolean r0 = r0.m()     // Catch:{ all -> 0x0021 }
            r2.v = r0     // Catch:{ all -> 0x0021 }
            if (r0 != 0) goto L_0x001f
            java.lang.String r0 = "(function(){})()"
            r1 = 0
            r2.evaluateJavascript(r0, r1)     // Catch:{ IllegalStateException -> 0x001a }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ IllegalStateException -> 0x001a }
            r2.D0(r0)     // Catch:{ IllegalStateException -> 0x001a }
            monitor-exit(r2)
            return
        L_0x001a:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0021 }
            r2.D0(r0)     // Catch:{ all -> 0x0021 }
        L_0x001f:
            monitor-exit(r2)
            return
        L_0x0021:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r9.H0():void");
    }

    private final void I0() {
        zzabd.a(this.K.c(), this.I, "aeh2");
    }

    private final synchronized void J0() {
        if (!this.t) {
            if (!this.p.e()) {
                if (Build.VERSION.SDK_INT < 18) {
                    zzbba.f("Disabling hardware acceleration on an AdView.");
                    K0();
                    return;
                }
                zzbba.f("Enabling hardware acceleration on an AdView.");
                L0();
                return;
            }
        }
        zzbba.f("Enabling hardware acceleration on an overlay.");
        L0();
    }

    private final synchronized void K0() {
        if (!this.u) {
            zzq.zzky();
            setLayerType(1, (Paint) null);
        }
        this.u = true;
    }

    private final synchronized void L0() {
        if (this.u) {
            zzq.zzky();
            setLayerType(0, (Paint) null);
        }
        this.u = false;
    }

    private final synchronized void M0() {
        if (this.S != null) {
            for (zzbes release : this.S.values()) {
                release.release();
            }
        }
        this.S = null;
    }

    private final void N0() {
        zzabi c2;
        zzabj zzabj = this.K;
        if (zzabj != null && (c2 = zzabj.c()) != null && zzq.zzla().l() != null) {
            zzq.zzla().l().d(c2);
        }
    }

    static r9 O0(Context context, zzbhg zzbhg, String str, boolean z2, boolean z3, zzeg zzeg, zzbbd zzbbd, zzabi zzabi, zzi zzi, zza zza, zztm zztm, zzso zzso, boolean z4) {
        Context context2 = context;
        return new r9(new zzbhd(context), zzbhg, str, z2, z3, zzeg, zzbbd, zzabi, zzi, zza, zztm, zzso, z4);
    }

    private final void Q0(boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", z2 ? "1" : "0");
        z("onAdVisibilityChanged", hashMap);
    }

    private final synchronized void R0(String str) {
        if (!l()) {
            loadUrl(str);
        } else {
            zzbba.i("#004 The webview is destroyed. Ignoring action.");
        }
    }

    private final synchronized void S0(String str) {
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError | UnsatisfiedLinkError e2) {
            zzq.zzla().e(e2, "AdWebViewImpl.loadUrlUnsafe");
            zzbba.d("Could not call loadUrl. ", e2);
        }
    }

    private final void T0(String str) {
        if (PlatformVersion.f()) {
            if (U0() == null) {
                H0();
            }
            if (U0().booleanValue()) {
                E0(str, (ValueCallback<String>) null);
                return;
            }
            String valueOf = String.valueOf(str);
            R0(valueOf.length() != 0 ? "javascript:".concat(valueOf) : new String("javascript:"));
            return;
        }
        String valueOf2 = String.valueOf(str);
        R0(valueOf2.length() != 0 ? "javascript:".concat(valueOf2) : new String("javascript:"));
    }

    @VisibleForTesting
    private final synchronized Boolean U0() {
        return this.v;
    }

    private final synchronized void V0() {
        if (!this.M) {
            this.M = true;
            zzq.zzla().p();
        }
    }

    public final synchronized void A(IObjectWrapper iObjectWrapper) {
        this.o = iObjectWrapper;
    }

    public final void A0(boolean z2) {
        this.m.K(z2);
    }

    public final void B() {
        zzc o0 = o0();
        if (o0 != null) {
            o0.zzur();
        }
    }

    public final void B0() {
        if (this.J == null) {
            zzabg b2 = zzabd.b(this.K.c());
            this.J = b2;
            this.K.a("native:view_load", b2);
        }
    }

    public final void C(boolean z2, int i2) {
        this.m.L(z2, i2);
    }

    public final synchronized IObjectWrapper D() {
        return this.o;
    }

    public final int E() {
        return getMeasuredWidth();
    }

    public final synchronized zzsa F() {
        return this.E;
    }

    public final synchronized void G(zzadc zzadc) {
        this.D = zzadc;
    }

    public final synchronized void H(String str, String str2, String str3) {
        if (!l()) {
            String str4 = str;
            super.loadDataWithBaseURL(str4, zzbgw.b(str2, zzbgw.a()), "text/html", "UTF-8", str3);
            return;
        }
        zzbba.i("#004 The webview is destroyed. Ignoring action.");
    }

    public final void J() {
        if (this.H == null) {
            zzabd.a(this.K.c(), this.I, "aes2");
            zzabg b2 = zzabd.b(this.K.c());
            this.H = b2;
            this.K.a("native:view_show", b2);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f4983d.f6314b);
        z("onshow", hashMap);
    }

    public final void K() {
        I0();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f4983d.f6314b);
        z("onhide", hashMap);
    }

    public final synchronized void M(zzc zzc) {
        this.n = zzc;
    }

    public final int N() {
        return getMeasuredHeight();
    }

    public final synchronized zzbes O(String str) {
        if (this.S == null) {
            return null;
        }
        return this.S.get(str);
    }

    public final void R(zzqt zzqt) {
        synchronized (this) {
            this.A = zzqt.j;
        }
        Q0(zzqt.j);
    }

    public final boolean S() {
        return false;
    }

    public final synchronized void T() {
        zzaxv.m("Destroying WebView!");
        V0();
        zzaye.h.post(new v9(this));
    }

    public final void U() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(zzq.zzlb().e()));
        hashMap.put("app_volume", String.valueOf(zzq.zzlb().d()));
        hashMap.put("device_volume", String.valueOf(zzayw.c(getContext())));
        z("volume", hashMap);
    }

    public final void V(boolean z2, long j2) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", z2 ? "1" : "0");
        hashMap.put("duration", Long.toString(j2));
        z("onCacheAccessComplete", hashMap);
    }

    public final synchronized void W(zzsa zzsa) {
        this.E = zzsa;
    }

    public final synchronized void X(zzbhg zzbhg) {
        this.p = zzbhg;
        requestLayout();
    }

    public final synchronized void Y(boolean z2) {
        this.x = z2;
    }

    public final zzso Z() {
        return this.i;
    }

    public final zzbbd a() {
        return this.f4983d;
    }

    public final Activity b() {
        return this.f4981b.b();
    }

    public final void b0(Context context) {
        this.f4981b.setBaseContext(context);
        this.N.c(this.f4981b.b());
    }

    public final void c(String str, zzahc<? super zzbfn> zzahc) {
        zzbfq zzbfq = this.m;
        if (zzbfq != null) {
            zzbfq.x(str, zzahc);
        }
    }

    public final synchronized boolean c0() {
        return this.x;
    }

    public final zzeg d() {
        return this.f4982c;
    }

    public final Context d0() {
        return this.f4981b.a();
    }

    public final synchronized void destroy() {
        N0();
        this.N.f();
        if (this.n != null) {
            this.n.close();
            this.n.onDestroy();
            this.n = null;
        }
        this.o = null;
        this.m.q();
        if (!this.s) {
            zzq.zzls();
            zzbep.i(this);
            M0();
            this.s = true;
            zzaxv.m("Initiating WebView self destruct sequence in 3...");
            zzaxv.m("Loading blank page in WebView, 2...");
            S0("about:blank");
        }
    }

    public final synchronized void e(zzbgh zzbgh) {
        if (this.z != null) {
            zzbba.g("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.z = zzbgh;
        }
    }

    public final void e0(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(jSONObject2).length());
        sb.append(str);
        sb.append("(");
        sb.append(jSONObject2);
        sb.append(");");
        T0(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        return;
     */
    @android.annotation.TargetApi(19)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void evaluateJavascript(java.lang.String r2, android.webkit.ValueCallback<java.lang.String> r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.l()     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0014
            java.lang.String r2 = "#004 The webview is destroyed. Ignoring action."
            com.google.android.gms.internal.ads.zzbba.k(r2)     // Catch:{ all -> 0x0019 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r9.evaluateJavascript(java.lang.String, android.webkit.ValueCallback):void");
    }

    public final void f(String str) {
        T0(str);
    }

    public final void f0(int i2) {
        if (i2 == 0) {
            zzabd.a(this.K.c(), this.I, "aebb2");
        }
        I0();
        if (this.K.c() != null) {
            this.K.c().d("close_type", String.valueOf(i2));
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i2));
        hashMap.put("version", this.f4983d.f6314b);
        z("onhide", hashMap);
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.s) {
                    this.m.q();
                    zzq.zzls();
                    zzbep.i(this);
                    M0();
                    V0();
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public final synchronized void g(String str, zzbes zzbes) {
        if (this.S == null) {
            this.S = new HashMap();
        }
        this.S.put(str, zzbes);
    }

    public final synchronized String getRequestId() {
        return this.y;
    }

    public final View getView() {
        return this;
    }

    public final WebView getWebView() {
        return this;
    }

    public final synchronized boolean h() {
        return this.t;
    }

    public final boolean h0() {
        return ((Boolean) zzwg.e().c(zzaav.g3)).booleanValue() && this.i != null && this.j;
    }

    public final zzabj i() {
        return this.K;
    }

    public final synchronized void i0(boolean z2) {
        int i2 = this.F + (z2 ? 1 : -1);
        this.F = i2;
        if (i2 <= 0 && this.n != null) {
            this.n.zzus();
        }
    }

    public final zza j() {
        return this.f4985f;
    }

    public final void j0(boolean z2, int i2, String str) {
        this.m.z(z2, i2, str);
    }

    public final void k(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(jSONObject2);
        sb.append(");");
        String valueOf = String.valueOf(sb.toString());
        zzbba.f(valueOf.length() != 0 ? "Dispatching AFMA event: ".concat(valueOf) : new String("Dispatching AFMA event: "));
        T0(sb.toString());
    }

    public final void k0(zzd zzd) {
        this.m.t(zzd);
    }

    public final synchronized boolean l() {
        return this.s;
    }

    public final synchronized void l0(zzc zzc) {
        this.L = zzc;
    }

    public final synchronized void loadData(String str, String str2, String str3) {
        if (!l()) {
            super.loadData(str, str2, str3);
        } else {
            zzbba.i("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!l()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            zzbba.i("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadUrl(String str) {
        if (!l()) {
            try {
                super.loadUrl(str);
            } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e2) {
                zzq.zzla().e(e2, "AdWebViewImpl.loadUrl");
                zzbba.d("Could not call loadUrl. ", e2);
            }
        } else {
            zzbba.i("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized zzbgh m() {
        return this.z;
    }

    public final void n(String str, zzahc<? super zzbfn> zzahc) {
        zzbfq zzbfq = this.m;
        if (zzbfq != null) {
            zzbfq.J(str, zzahc);
        }
    }

    public final synchronized boolean n0() {
        return this.F > 0;
    }

    public final synchronized zzbhg o() {
        return this.p;
    }

    public final synchronized zzc o0() {
        return this.n;
    }

    /* access modifiers changed from: protected */
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!l()) {
            this.N.a();
        }
        boolean z2 = this.A;
        if (this.m != null && this.m.B()) {
            if (!this.B) {
                this.m.D();
                this.m.E();
                this.B = true;
            }
            G0();
            z2 = true;
        }
        Q0(z2);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        synchronized (this) {
            if (!l()) {
                this.N.b();
            }
            super.onDetachedFromWindow();
            if (this.B && this.m != null && this.m.B() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.m.D();
                this.m.E();
                this.B = false;
            }
        }
        Q0(false);
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            zzq.zzkw();
            zzaye.i(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            zzbba.f(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    @TargetApi(21)
    public final void onDraw(Canvas canvas) {
        if (!l()) {
            if (Build.VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
                super.onDraw(canvas);
            }
        }
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public final void onGlobalLayout() {
        boolean G0 = G0();
        zzc o0 = o0();
        if (o0 != null && G0) {
            o0.zzup();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01f8, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01d6 A[SYNTHETIC, Splitter:B:111:0x01d6] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0141  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:121:0x01f9=Splitter:B:121:0x01f9, B:64:0x00de=Splitter:B:64:0x00de} */
    @android.annotation.SuppressLint({"DrawAllocation"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.l()     // Catch:{ all -> 0x01fe }
            r1 = 0
            if (r0 == 0) goto L_0x000d
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01fe }
            monitor-exit(r7)
            return
        L_0x000d:
            boolean r0 = r7.isInEditMode()     // Catch:{ all -> 0x01fe }
            if (r0 != 0) goto L_0x01f9
            boolean r0 = r7.t     // Catch:{ all -> 0x01fe }
            if (r0 != 0) goto L_0x01f9
            com.google.android.gms.internal.ads.zzbhg r0 = r7.p     // Catch:{ all -> 0x01fe }
            boolean r0 = r0.f()     // Catch:{ all -> 0x01fe }
            if (r0 == 0) goto L_0x0021
            goto L_0x01f9
        L_0x0021:
            com.google.android.gms.internal.ads.zzbhg r0 = r7.p     // Catch:{ all -> 0x01fe }
            boolean r0 = r0.h()     // Catch:{ all -> 0x01fe }
            if (r0 == 0) goto L_0x002e
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01fe }
            monitor-exit(r7)
            return
        L_0x002e:
            com.google.android.gms.internal.ads.zzbhg r0 = r7.p     // Catch:{ all -> 0x01fe }
            boolean r0 = r0.g()     // Catch:{ all -> 0x01fe }
            if (r0 == 0) goto L_0x0091
            com.google.android.gms.internal.ads.zzaag<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzaav.B1     // Catch:{ all -> 0x01fe }
            com.google.android.gms.internal.ads.zzaar r1 = com.google.android.gms.internal.ads.zzwg.e()     // Catch:{ all -> 0x01fe }
            java.lang.Object r0 = r1.c(r0)     // Catch:{ all -> 0x01fe }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01fe }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01fe }
            if (r0 == 0) goto L_0x004d
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01fe }
            monitor-exit(r7)
            return
        L_0x004d:
            com.google.android.gms.internal.ads.zzbgh r0 = r7.m()     // Catch:{ all -> 0x01fe }
            r1 = 0
            if (r0 == 0) goto L_0x0059
            float r0 = r0.getAspectRatio()     // Catch:{ all -> 0x01fe }
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0063
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01fe }
            monitor-exit(r7)
            return
        L_0x0063:
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01fe }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01fe }
            float r1 = (float) r9     // Catch:{ all -> 0x01fe }
            float r1 = r1 * r0
            int r1 = (int) r1     // Catch:{ all -> 0x01fe }
            float r2 = (float) r8     // Catch:{ all -> 0x01fe }
            float r2 = r2 / r0
            int r2 = (int) r2     // Catch:{ all -> 0x01fe }
            if (r9 != 0) goto L_0x007c
            if (r2 == 0) goto L_0x007c
            float r9 = (float) r2     // Catch:{ all -> 0x01fe }
            float r9 = r9 * r0
            int r1 = (int) r9     // Catch:{ all -> 0x01fe }
            r9 = r2
            goto L_0x0084
        L_0x007c:
            if (r8 != 0) goto L_0x0084
            if (r1 == 0) goto L_0x0084
            float r8 = (float) r1     // Catch:{ all -> 0x01fe }
            float r8 = r8 / r0
            int r2 = (int) r8     // Catch:{ all -> 0x01fe }
            r8 = r1
        L_0x0084:
            int r8 = java.lang.Math.min(r1, r8)     // Catch:{ all -> 0x01fe }
            int r9 = java.lang.Math.min(r2, r9)     // Catch:{ all -> 0x01fe }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01fe }
            monitor-exit(r7)
            return
        L_0x0091:
            com.google.android.gms.internal.ads.zzbhg r0 = r7.p     // Catch:{ all -> 0x01fe }
            boolean r0 = r0.a()     // Catch:{ all -> 0x01fe }
            if (r0 == 0) goto L_0x00e3
            com.google.android.gms.internal.ads.zzaag<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzaav.D1     // Catch:{ all -> 0x01fe }
            com.google.android.gms.internal.ads.zzaar r1 = com.google.android.gms.internal.ads.zzwg.e()     // Catch:{ all -> 0x01fe }
            java.lang.Object r0 = r1.c(r0)     // Catch:{ all -> 0x01fe }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01fe }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01fe }
            if (r0 != 0) goto L_0x00de
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.d()     // Catch:{ all -> 0x01fe }
            if (r0 != 0) goto L_0x00b2
            goto L_0x00de
        L_0x00b2:
            java.lang.String r0 = "/contentHeight"
            com.google.android.gms.internal.ads.t9 r1 = new com.google.android.gms.internal.ads.t9     // Catch:{ all -> 0x01fe }
            r1.<init>(r7)     // Catch:{ all -> 0x01fe }
            r7.c(r0, r1)     // Catch:{ all -> 0x01fe }
            java.lang.String r0 = "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();"
            r7.T0(r0)     // Catch:{ all -> 0x01fe }
            android.util.DisplayMetrics r0 = r7.g     // Catch:{ all -> 0x01fe }
            float r0 = r0.density     // Catch:{ all -> 0x01fe }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01fe }
            int r1 = r7.G     // Catch:{ all -> 0x01fe }
            r2 = -1
            if (r1 == r2) goto L_0x00d5
            int r9 = r7.G     // Catch:{ all -> 0x01fe }
            float r9 = (float) r9     // Catch:{ all -> 0x01fe }
            float r9 = r9 * r0
            int r9 = (int) r9     // Catch:{ all -> 0x01fe }
            goto L_0x00d9
        L_0x00d5:
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01fe }
        L_0x00d9:
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01fe }
            monitor-exit(r7)
            return
        L_0x00de:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01fe }
            monitor-exit(r7)
            return
        L_0x00e3:
            com.google.android.gms.internal.ads.zzbhg r0 = r7.p     // Catch:{ all -> 0x01fe }
            boolean r0 = r0.e()     // Catch:{ all -> 0x01fe }
            if (r0 == 0) goto L_0x00f8
            android.util.DisplayMetrics r8 = r7.g     // Catch:{ all -> 0x01fe }
            int r8 = r8.widthPixels     // Catch:{ all -> 0x01fe }
            android.util.DisplayMetrics r9 = r7.g     // Catch:{ all -> 0x01fe }
            int r9 = r9.heightPixels     // Catch:{ all -> 0x01fe }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01fe }
            monitor-exit(r7)
            return
        L_0x00f8:
            int r0 = android.view.View.MeasureSpec.getMode(r8)     // Catch:{ all -> 0x01fe }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01fe }
            int r2 = android.view.View.MeasureSpec.getMode(r9)     // Catch:{ all -> 0x01fe }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01fe }
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r4) goto L_0x0118
            if (r0 != r3) goto L_0x0114
            goto L_0x0118
        L_0x0114:
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0119
        L_0x0118:
            r0 = r8
        L_0x0119:
            if (r2 == r4) goto L_0x011d
            if (r2 != r3) goto L_0x011e
        L_0x011d:
            r5 = r9
        L_0x011e:
            com.google.android.gms.internal.ads.zzbhg r2 = r7.p     // Catch:{ all -> 0x01fe }
            int r2 = r2.f6434c     // Catch:{ all -> 0x01fe }
            r3 = 1
            if (r2 > r0) goto L_0x012e
            com.google.android.gms.internal.ads.zzbhg r2 = r7.p     // Catch:{ all -> 0x01fe }
            int r2 = r2.f6433b     // Catch:{ all -> 0x01fe }
            if (r2 <= r5) goto L_0x012c
            goto L_0x012e
        L_0x012c:
            r2 = 0
            goto L_0x012f
        L_0x012e:
            r2 = 1
        L_0x012f:
            com.google.android.gms.internal.ads.zzaag<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.zzaav.t2     // Catch:{ all -> 0x01fe }
            com.google.android.gms.internal.ads.zzaar r6 = com.google.android.gms.internal.ads.zzwg.e()     // Catch:{ all -> 0x01fe }
            java.lang.Object r4 = r6.c(r4)     // Catch:{ all -> 0x01fe }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x01fe }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x01fe }
            if (r4 == 0) goto L_0x0167
            com.google.android.gms.internal.ads.zzbhg r4 = r7.p     // Catch:{ all -> 0x01fe }
            int r4 = r4.f6434c     // Catch:{ all -> 0x01fe }
            float r4 = (float) r4     // Catch:{ all -> 0x01fe }
            float r6 = r7.h     // Catch:{ all -> 0x01fe }
            float r4 = r4 / r6
            float r0 = (float) r0     // Catch:{ all -> 0x01fe }
            float r6 = r7.h     // Catch:{ all -> 0x01fe }
            float r0 = r0 / r6
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0163
            com.google.android.gms.internal.ads.zzbhg r0 = r7.p     // Catch:{ all -> 0x01fe }
            int r0 = r0.f6433b     // Catch:{ all -> 0x01fe }
            float r0 = (float) r0     // Catch:{ all -> 0x01fe }
            float r4 = r7.h     // Catch:{ all -> 0x01fe }
            float r0 = r0 / r4
            float r4 = (float) r5     // Catch:{ all -> 0x01fe }
            float r5 = r7.h     // Catch:{ all -> 0x01fe }
            float r4 = r4 / r5
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0163
            r0 = 1
            goto L_0x0164
        L_0x0163:
            r0 = 0
        L_0x0164:
            if (r2 == 0) goto L_0x0167
            r2 = r0
        L_0x0167:
            r0 = 8
            if (r2 == 0) goto L_0x01d6
            com.google.android.gms.internal.ads.zzbhg r2 = r7.p     // Catch:{ all -> 0x01fe }
            int r2 = r2.f6434c     // Catch:{ all -> 0x01fe }
            float r2 = (float) r2     // Catch:{ all -> 0x01fe }
            float r4 = r7.h     // Catch:{ all -> 0x01fe }
            float r2 = r2 / r4
            int r2 = (int) r2     // Catch:{ all -> 0x01fe }
            com.google.android.gms.internal.ads.zzbhg r4 = r7.p     // Catch:{ all -> 0x01fe }
            int r4 = r4.f6433b     // Catch:{ all -> 0x01fe }
            float r4 = (float) r4     // Catch:{ all -> 0x01fe }
            float r5 = r7.h     // Catch:{ all -> 0x01fe }
            float r4 = r4 / r5
            int r4 = (int) r4     // Catch:{ all -> 0x01fe }
            float r8 = (float) r8     // Catch:{ all -> 0x01fe }
            float r5 = r7.h     // Catch:{ all -> 0x01fe }
            float r8 = r8 / r5
            int r8 = (int) r8     // Catch:{ all -> 0x01fe }
            float r9 = (float) r9     // Catch:{ all -> 0x01fe }
            float r5 = r7.h     // Catch:{ all -> 0x01fe }
            float r9 = r9 / r5
            int r9 = (int) r9     // Catch:{ all -> 0x01fe }
            r5 = 103(0x67, float:1.44E-43)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fe }
            r6.<init>(r5)     // Catch:{ all -> 0x01fe }
            java.lang.String r5 = "Not enough space to show ad. Needs "
            r6.append(r5)     // Catch:{ all -> 0x01fe }
            r6.append(r2)     // Catch:{ all -> 0x01fe }
            java.lang.String r2 = "x"
            r6.append(r2)     // Catch:{ all -> 0x01fe }
            r6.append(r4)     // Catch:{ all -> 0x01fe }
            java.lang.String r2 = " dp, but only has "
            r6.append(r2)     // Catch:{ all -> 0x01fe }
            r6.append(r8)     // Catch:{ all -> 0x01fe }
            java.lang.String r8 = "x"
            r6.append(r8)     // Catch:{ all -> 0x01fe }
            r6.append(r9)     // Catch:{ all -> 0x01fe }
            java.lang.String r8 = " dp."
            r6.append(r8)     // Catch:{ all -> 0x01fe }
            java.lang.String r8 = r6.toString()     // Catch:{ all -> 0x01fe }
            com.google.android.gms.internal.ads.zzbba.i(r8)     // Catch:{ all -> 0x01fe }
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01fe }
            if (r8 == r0) goto L_0x01c4
            r8 = 4
            r7.setVisibility(r8)     // Catch:{ all -> 0x01fe }
        L_0x01c4:
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01fe }
            boolean r8 = r7.k     // Catch:{ all -> 0x01fe }
            if (r8 != 0) goto L_0x01f7
            com.google.android.gms.internal.ads.zztm r8 = r7.U     // Catch:{ all -> 0x01fe }
            com.google.android.gms.internal.ads.zzto$zza$zza r9 = com.google.android.gms.internal.ads.zzto.zza.C0084zza.BANNER_SIZE_INVALID     // Catch:{ all -> 0x01fe }
            r8.a(r9)     // Catch:{ all -> 0x01fe }
            r7.k = r3     // Catch:{ all -> 0x01fe }
            monitor-exit(r7)
            return
        L_0x01d6:
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01fe }
            if (r8 == r0) goto L_0x01df
            r7.setVisibility(r1)     // Catch:{ all -> 0x01fe }
        L_0x01df:
            boolean r8 = r7.l     // Catch:{ all -> 0x01fe }
            if (r8 != 0) goto L_0x01ec
            com.google.android.gms.internal.ads.zztm r8 = r7.U     // Catch:{ all -> 0x01fe }
            com.google.android.gms.internal.ads.zzto$zza$zza r9 = com.google.android.gms.internal.ads.zzto.zza.C0084zza.BANNER_SIZE_VALID     // Catch:{ all -> 0x01fe }
            r8.a(r9)     // Catch:{ all -> 0x01fe }
            r7.l = r3     // Catch:{ all -> 0x01fe }
        L_0x01ec:
            com.google.android.gms.internal.ads.zzbhg r8 = r7.p     // Catch:{ all -> 0x01fe }
            int r8 = r8.f6434c     // Catch:{ all -> 0x01fe }
            com.google.android.gms.internal.ads.zzbhg r9 = r7.p     // Catch:{ all -> 0x01fe }
            int r9 = r9.f6433b     // Catch:{ all -> 0x01fe }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01fe }
        L_0x01f7:
            monitor-exit(r7)
            return
        L_0x01f9:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01fe }
            monitor-exit(r7)
            return
        L_0x01fe:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r9.onMeasure(int, int):void");
    }

    public final void onPause() {
        if (!l()) {
            try {
                super.onPause();
            } catch (Exception e2) {
                zzbba.c("Could not pause webview.", e2);
            }
        }
    }

    public final void onResume() {
        if (!l()) {
            try {
                super.onResume();
            } catch (Exception e2) {
                zzbba.c("Could not resume webview.", e2);
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.m.B() || this.m.C()) {
            zzeg zzeg = this.f4982c;
            if (zzeg != null) {
                zzeg.d(motionEvent);
            }
        } else {
            synchronized (this) {
                if (this.C != null) {
                    this.C.b(motionEvent);
                }
            }
        }
        if (l()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p() {
        setBackgroundColor(0);
    }

    public final zzabg p0() {
        return this.I;
    }

    public final /* synthetic */ zzbgz q() {
        return this.m;
    }

    public final WebViewClient q0() {
        return this.m;
    }

    public final zzbcu r() {
        return null;
    }

    public final void r0() {
        this.N.e();
    }

    public final synchronized zzc s0() {
        return this.L;
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        new WeakReference(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    public final synchronized void setRequestedOrientation(int i2) {
        this.w = i2;
        if (this.n != null) {
            this.n.setRequestedOrientation(i2);
        }
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzbfq) {
            this.m = (zzbfq) webViewClient;
        }
    }

    public final void stopLoading() {
        if (!l()) {
            try {
                super.stopLoading();
            } catch (Exception e2) {
                zzbba.c("Could not stop loading webview.", e2);
            }
        }
    }

    public final synchronized void t(boolean z2) {
        if (this.n != null) {
            this.n.zza(this.m.o(), z2);
        } else {
            this.r = z2;
        }
    }

    public final synchronized void t0(zzadh zzadh) {
        this.C = zzadh;
    }

    public final synchronized void u() {
        if (this.D != null) {
            this.D.z3();
        }
    }

    public final synchronized zzadh u0() {
        return this.C;
    }

    public final void v(String str, Predicate<zzahc<? super zzbfn>> predicate) {
        zzbfq zzbfq = this.m;
        if (zzbfq != null) {
            zzbfq.w(str, predicate);
        }
    }

    public final synchronized String v0() {
        return this.q;
    }

    public final boolean w(boolean z2, int i2) {
        destroy();
        this.U.b(new u9(z2, i2));
        this.U.a(zzto.zza.C0084zza.ANDROID_WEBVIEW_CRASH);
        return true;
    }

    public final synchronized void w0(boolean z2) {
        boolean z3 = z2 != this.t;
        this.t = z2;
        J0();
        if (z3) {
            if (!((Boolean) zzwg.e().c(zzaav.H)).booleanValue() || !this.p.e()) {
                new zzaqd(this).g(z2 ? "expanded" : "default");
            }
        }
    }

    public final void x() {
        zzaxv.m("Cannot add text view to inner AdWebView");
    }

    public final void x0(ViewGroup viewGroup, Activity activity, String str, String str2) {
        if (!h0()) {
            zzaxv.m("AR ad is not enabled or the ad from the server is not an AR ad.");
            return;
        }
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).removeView(this);
        }
        zzaxv.m("Initializing ArWebView object.");
        this.i.a(activity, this);
        this.i.c(str, str2);
        if (viewGroup != null) {
            viewGroup.addView(this.i.getView());
        } else {
            zzbba.g("The FrameLayout object cannot be null.");
        }
    }

    public final void y(boolean z2) {
        this.m.I(z2);
    }

    public final void y0(boolean z2, int i2, String str, String str2) {
        this.m.A(z2, i2, str, str2);
    }

    public final void z(String str, Map<String, ?> map) {
        try {
            k(str, zzq.zzkw().e0(map));
        } catch (JSONException unused) {
            zzbba.i("Could not convert parameters to JSON.");
        }
    }

    public final synchronized boolean z0() {
        return this.r;
    }

    public final synchronized void zzkd() {
        if (this.f4984e != null) {
            this.f4984e.zzkd();
        }
    }

    public final synchronized void zzke() {
        if (this.f4984e != null) {
            this.f4984e.zzke();
        }
    }
}
