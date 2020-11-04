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
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class ga extends zzbhu implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, zzajp, zzbfn {
    @GuardedBy("this")
    private zzadh A;
    @GuardedBy("this")
    private zzadc B;
    @GuardedBy("this")
    private zzsa C;
    @GuardedBy("this")
    private int D;
    /* access modifiers changed from: private */
    @GuardedBy("this")
    public int E;
    private zzabg F;
    private zzabg G;
    private zzabg H;
    private zzabj I;
    @GuardedBy("this")
    private zzc J;
    private zzban K;
    private final AtomicReference<IObjectWrapper> L = new AtomicReference<>();
    private int M = -1;
    private int N = -1;
    private int O = -1;
    private int P = -1;
    private Map<String, zzbes> Q;
    private final WindowManager R;

    /* renamed from: e  reason: collision with root package name */
    private final zzbhd f4045e;

    /* renamed from: f  reason: collision with root package name */
    private final zzbhf f4046f;
    private final zzeg g;
    private final zzbbd h;
    private final zzi i;
    private final zza j;
    private final DisplayMetrics k;
    private final zztm l;
    private final zzso m;
    private final boolean n;
    @GuardedBy("this")
    private zzc o;
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
    private int u;
    @GuardedBy("this")
    private boolean v = true;
    @GuardedBy("this")
    private String w = "";
    @GuardedBy("this")
    private zzbgh x;
    @GuardedBy("this")
    private boolean y;
    @GuardedBy("this")
    private boolean z;

    @VisibleForTesting
    protected ga(zzbhd zzbhd, zzbhf zzbhf, zzbhg zzbhg, String str, boolean z2, boolean z3, zzeg zzeg, zzbbd zzbbd, zzabi zzabi, zzi zzi, zza zza, zztm zztm, zzso zzso, boolean z4) {
        super(zzbhd, zzbhf);
        this.f4045e = zzbhd;
        this.f4046f = zzbhf;
        this.p = zzbhg;
        this.q = str;
        this.s = z2;
        this.u = -1;
        this.g = zzeg;
        this.h = zzbbd;
        this.i = zzi;
        this.j = zza;
        this.R = (WindowManager) getContext().getSystemService("window");
        zzq.zzkw();
        this.k = zzaye.b(this.R);
        this.l = zztm;
        this.m = zzso;
        this.n = z4;
        this.K = new zzban(this.f4045e.b(), this, this, (ViewTreeObserver.OnScrollChangedListener) null);
        zzq.zzkw().k(zzbhd, zzbbd.f6314b, getSettings());
        setDownloadListener(this);
        K0();
        if (PlatformVersion.d()) {
            addJavascriptInterface(zzbgm.a(this), "googleAdsJsInterface");
        }
        O0();
        zzabj zzabj = new zzabj(new zzabi(true, "make_wv", this.q));
        this.I = zzabj;
        zzabj.c().b(zzabi);
        zzabg b2 = zzabd.b(this.I.c());
        this.G = b2;
        this.I.a("native:view_create", b2);
        this.H = null;
        this.F = null;
        zzq.zzky().m(zzbhd);
    }

    static final /* synthetic */ void H0(boolean z2, int i2, zzty.zzi.zza zza) {
        zzty.zzae.zza M2 = zzty.zzae.M();
        if (M2.x() != z2) {
            M2.y(z2);
        }
        M2.w(i2);
        zza.y((zzty.zzae) ((zzegb) M2.O()));
    }

    private final boolean I0() {
        int i2;
        int i3;
        boolean z2 = false;
        if (!this.f4046f.o() && !this.f4046f.F()) {
            return false;
        }
        zzwg.a();
        DisplayMetrics displayMetrics = this.k;
        int k2 = zzbaq.k(displayMetrics, displayMetrics.widthPixels);
        zzwg.a();
        DisplayMetrics displayMetrics2 = this.k;
        int k3 = zzbaq.k(displayMetrics2, displayMetrics2.heightPixels);
        Activity b2 = this.f4045e.b();
        if (b2 == null || b2.getWindow() == null) {
            i3 = k2;
            i2 = k3;
        } else {
            zzq.zzkw();
            int[] S = zzaye.S(b2);
            zzwg.a();
            int k4 = zzbaq.k(this.k, S[0]);
            zzwg.a();
            i2 = zzbaq.k(this.k, S[1]);
            i3 = k4;
        }
        if (this.N == k2 && this.M == k3 && this.O == i3 && this.P == i2) {
            return false;
        }
        if (!(this.N == k2 && this.M == k3)) {
            z2 = true;
        }
        this.N = k2;
        this.M = k3;
        this.O = i3;
        this.P = i2;
        new zzaqd(this).b(k2, k3, i3, i2, this.k.density, this.R.getDefaultDisplay().getRotation());
        return z2;
    }

    private final void J0() {
        zzabd.a(this.I.c(), this.G, "aeh2");
    }

    private final synchronized void K0() {
        if (!this.s) {
            if (!this.p.e()) {
                if (Build.VERSION.SDK_INT < 18) {
                    zzbba.f("Disabling hardware acceleration on an AdView.");
                    L0();
                    return;
                }
                zzbba.f("Enabling hardware acceleration on an AdView.");
                M0();
                return;
            }
        }
        zzbba.f("Enabling hardware acceleration on an overlay.");
        M0();
    }

    private final synchronized void L0() {
        if (!this.t) {
            zzq.zzky();
            setLayerType(1, (Paint) null);
        }
        this.t = true;
    }

    private final synchronized void M0() {
        if (this.t) {
            zzq.zzky();
            setLayerType(0, (Paint) null);
        }
        this.t = false;
    }

    private final synchronized void N0() {
        if (this.Q != null) {
            for (zzbes release : this.Q.values()) {
                release.release();
            }
        }
        this.Q = null;
    }

    private final void O0() {
        zzabi c2;
        zzabj zzabj = this.I;
        if (zzabj != null && (c2 = zzabj.c()) != null && zzq.zzla().l() != null) {
            zzq.zzla().l().d(c2);
        }
    }

    private final void P0(boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", z2 ? "1" : "0");
        zzajo.b(this, "onAdVisibilityChanged", hashMap);
    }

    public final void A(IObjectWrapper iObjectWrapper) {
        this.L.set(iObjectWrapper);
    }

    public final void A0(boolean z2) {
        this.f4046f.O(z2);
    }

    public final void B() {
        zzc o0 = o0();
        if (o0 != null) {
            o0.zzur();
        }
    }

    public final void B0() {
        if (this.H == null) {
            zzabg b2 = zzabd.b(this.I.c());
            this.H = b2;
            this.I.a("native:view_load", b2);
        }
    }

    public final void C(boolean z2, int i2) {
        this.f4046f.P(z2, i2);
    }

    public final IObjectWrapper D() {
        return this.L.get();
    }

    /* access modifiers changed from: protected */
    public final synchronized void D0(boolean z2) {
        if (!z2) {
            O0();
            this.K.f();
            if (this.o != null) {
                this.o.close();
                this.o.onDestroy();
                this.o = null;
            }
        }
        this.L.set((Object) null);
        this.f4046f.v();
        zzq.zzls();
        zzbep.i(this);
        N0();
    }

    public final int E() {
        return getMeasuredWidth();
    }

    public final synchronized zzsa F() {
        return this.C;
    }

    public final synchronized void G(zzadc zzadc) {
        this.B = zzadc;
    }

    public final synchronized void H(String str, String str2, String str3) {
        String str4 = str;
        super.loadDataWithBaseURL(str4, zzbgw.b(str2, zzbgw.a()), "text/html", "UTF-8", str3);
    }

    public final void J() {
        if (this.F == null) {
            zzabd.a(this.I.c(), this.G, "aes2");
            zzabg b2 = zzabd.b(this.I.c());
            this.F = b2;
            this.I.a("native:view_show", b2);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.h.f6314b);
        zzajo.b(this, "onshow", hashMap);
    }

    public final void K() {
        J0();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.h.f6314b);
        zzajo.b(this, "onhide", hashMap);
    }

    public final synchronized void M(zzc zzc) {
        this.o = zzc;
    }

    public final int N() {
        return getMeasuredHeight();
    }

    public final synchronized zzbes O(String str) {
        if (this.Q == null) {
            return null;
        }
        return this.Q.get(str);
    }

    public final void R(zzqt zzqt) {
        synchronized (this) {
            this.y = zzqt.j;
        }
        P0(zzqt.j);
    }

    public final boolean S() {
        return false;
    }

    public final void T() {
    }

    public final void U() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(zzq.zzlb().e()));
        hashMap.put("app_volume", String.valueOf(zzq.zzlb().d()));
        hashMap.put("device_volume", String.valueOf(zzayw.c(getContext())));
        zzajo.b(this, "volume", hashMap);
    }

    public final void V(boolean z2, long j2) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", z2 ? "1" : "0");
        hashMap.put("duration", Long.toString(j2));
        zzajo.b(this, "onCacheAccessComplete", hashMap);
    }

    public final synchronized void W(zzsa zzsa) {
        this.C = zzsa;
    }

    public final synchronized void X(zzbhg zzbhg) {
        this.p = zzbhg;
        requestLayout();
    }

    public final synchronized void Y(boolean z2) {
        this.v = z2;
    }

    public final zzso Z() {
        return this.m;
    }

    public final zzbbd a() {
        return this.h;
    }

    public final void a0(String str, String str2) {
        zzajo.a(this, str, str2);
    }

    public final Activity b() {
        return this.f4045e.b();
    }

    public final void b0(Context context) {
        this.f4045e.setBaseContext(context);
        this.K.c(this.f4045e.b());
    }

    public final void c(String str, zzahc<? super zzbfn> zzahc) {
        zzbhf zzbhf = this.f4046f;
        if (zzbhf != null) {
            zzbhf.C(str, zzahc);
        }
    }

    public final synchronized boolean c0() {
        return this.v;
    }

    public final zzeg d() {
        return this.g;
    }

    public final Context d0() {
        return this.f4045e.a();
    }

    public final synchronized void e(zzbgh zzbgh) {
        if (this.x != null) {
            zzbba.g("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.x = zzbgh;
        }
    }

    public final void e0(String str, JSONObject jSONObject) {
        zzajo.c(this, str, jSONObject);
    }

    public final synchronized void f(String str) {
        if (!l()) {
            super.f(str);
        } else {
            zzbba.i("The webview is destroyed. Ignoring action.");
        }
    }

    public final void f0(int i2) {
        if (i2 == 0) {
            zzabd.a(this.I.c(), this.G, "aebb2");
        }
        J0();
        if (this.I.c() != null) {
            this.I.c().d("close_type", String.valueOf(i2));
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i2));
        hashMap.put("version", this.h.f6314b);
        zzajo.b(this, "onhide", hashMap);
    }

    public final synchronized void g(String str, zzbes zzbes) {
        if (this.Q == null) {
            this.Q = new HashMap();
        }
        this.Q.put(str, zzbes);
    }

    public final synchronized String getRequestId() {
        return this.w;
    }

    public final View getView() {
        return this;
    }

    public final WebView getWebView() {
        return this;
    }

    public final synchronized boolean h() {
        return this.s;
    }

    public final boolean h0() {
        return ((Boolean) zzwg.e().c(zzaav.g3)).booleanValue() && this.m != null && this.n;
    }

    public final zzabj i() {
        return this.I;
    }

    public final synchronized void i0(boolean z2) {
        int i2 = this.D + (z2 ? 1 : -1);
        this.D = i2;
        if (i2 <= 0 && this.o != null) {
            this.o.zzus();
        }
    }

    public final zza j() {
        return this.j;
    }

    public final void j0(boolean z2, int i2, String str) {
        this.f4046f.D(z2, i2, str);
    }

    public final void k(String str, JSONObject jSONObject) {
        zzajo.d(this, str, jSONObject);
    }

    public final void k0(zzd zzd) {
        this.f4046f.y(zzd);
    }

    public final synchronized void l0(zzc zzc) {
        this.J = zzc;
    }

    public final synchronized zzbgh m() {
        return this.x;
    }

    public final void n(String str, zzahc<? super zzbfn> zzahc) {
        zzbhf zzbhf = this.f4046f;
        if (zzbhf != null) {
            zzbhf.N(str, zzahc);
        }
    }

    public final synchronized boolean n0() {
        return this.D > 0;
    }

    public final synchronized zzbhg o() {
        return this.p;
    }

    public final synchronized zzc o0() {
        return this.o;
    }

    /* access modifiers changed from: protected */
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!l()) {
            this.K.a();
        }
        boolean z2 = this.y;
        if (this.f4046f != null && this.f4046f.F()) {
            if (!this.z) {
                this.f4046f.H();
                this.f4046f.I();
                this.z = true;
            }
            I0();
            z2 = true;
        }
        P0(z2);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        synchronized (this) {
            if (!l()) {
                this.K.b();
            }
            super.onDetachedFromWindow();
            if (this.z && this.f4046f != null && this.f4046f.F() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.f4046f.H();
                this.f4046f.I();
                this.z = false;
            }
        }
        P0(false);
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
        if (Build.VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
            super.onDraw(canvas);
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
        boolean I0 = I0();
        zzc o0 = o0();
        if (o0 != null && I0) {
            o0.zzup();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01d8 A[SYNTHETIC, Splitter:B:109:0x01d8] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0141  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:64:0x00de=Splitter:B:64:0x00de, B:116:0x01ee=Splitter:B:116:0x01ee} */
    @android.annotation.SuppressLint({"DrawAllocation"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.l()     // Catch:{ all -> 0x01f3 }
            r1 = 0
            if (r0 == 0) goto L_0x000d
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x000d:
            boolean r0 = r7.isInEditMode()     // Catch:{ all -> 0x01f3 }
            if (r0 != 0) goto L_0x01ee
            boolean r0 = r7.s     // Catch:{ all -> 0x01f3 }
            if (r0 != 0) goto L_0x01ee
            com.google.android.gms.internal.ads.zzbhg r0 = r7.p     // Catch:{ all -> 0x01f3 }
            boolean r0 = r0.f()     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x0021
            goto L_0x01ee
        L_0x0021:
            com.google.android.gms.internal.ads.zzbhg r0 = r7.p     // Catch:{ all -> 0x01f3 }
            boolean r0 = r0.h()     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x002e
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x002e:
            com.google.android.gms.internal.ads.zzbhg r0 = r7.p     // Catch:{ all -> 0x01f3 }
            boolean r0 = r0.g()     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x0091
            com.google.android.gms.internal.ads.zzaag<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzaav.B1     // Catch:{ all -> 0x01f3 }
            com.google.android.gms.internal.ads.zzaar r1 = com.google.android.gms.internal.ads.zzwg.e()     // Catch:{ all -> 0x01f3 }
            java.lang.Object r0 = r1.c(r0)     // Catch:{ all -> 0x01f3 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01f3 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x004d
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x004d:
            com.google.android.gms.internal.ads.zzbgh r0 = r7.m()     // Catch:{ all -> 0x01f3 }
            r1 = 0
            if (r0 == 0) goto L_0x0059
            float r0 = r0.getAspectRatio()     // Catch:{ all -> 0x01f3 }
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0063
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x0063:
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01f3 }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01f3 }
            float r1 = (float) r9     // Catch:{ all -> 0x01f3 }
            float r1 = r1 * r0
            int r1 = (int) r1     // Catch:{ all -> 0x01f3 }
            float r2 = (float) r8     // Catch:{ all -> 0x01f3 }
            float r2 = r2 / r0
            int r2 = (int) r2     // Catch:{ all -> 0x01f3 }
            if (r9 != 0) goto L_0x007c
            if (r2 == 0) goto L_0x007c
            float r9 = (float) r2     // Catch:{ all -> 0x01f3 }
            float r9 = r9 * r0
            int r1 = (int) r9     // Catch:{ all -> 0x01f3 }
            r9 = r2
            goto L_0x0084
        L_0x007c:
            if (r8 != 0) goto L_0x0084
            if (r1 == 0) goto L_0x0084
            float r8 = (float) r1     // Catch:{ all -> 0x01f3 }
            float r8 = r8 / r0
            int r2 = (int) r8     // Catch:{ all -> 0x01f3 }
            r8 = r1
        L_0x0084:
            int r8 = java.lang.Math.min(r1, r8)     // Catch:{ all -> 0x01f3 }
            int r9 = java.lang.Math.min(r2, r9)     // Catch:{ all -> 0x01f3 }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x0091:
            com.google.android.gms.internal.ads.zzbhg r0 = r7.p     // Catch:{ all -> 0x01f3 }
            boolean r0 = r0.a()     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x00e3
            com.google.android.gms.internal.ads.zzaag<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzaav.D1     // Catch:{ all -> 0x01f3 }
            com.google.android.gms.internal.ads.zzaar r1 = com.google.android.gms.internal.ads.zzwg.e()     // Catch:{ all -> 0x01f3 }
            java.lang.Object r0 = r1.c(r0)     // Catch:{ all -> 0x01f3 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01f3 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01f3 }
            if (r0 != 0) goto L_0x00de
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.d()     // Catch:{ all -> 0x01f3 }
            if (r0 != 0) goto L_0x00b2
            goto L_0x00de
        L_0x00b2:
            java.lang.String r0 = "/contentHeight"
            com.google.android.gms.internal.ads.ia r1 = new com.google.android.gms.internal.ads.ia     // Catch:{ all -> 0x01f3 }
            r1.<init>(r7)     // Catch:{ all -> 0x01f3 }
            r7.c(r0, r1)     // Catch:{ all -> 0x01f3 }
            java.lang.String r0 = "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();"
            r7.f(r0)     // Catch:{ all -> 0x01f3 }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01f3 }
            int r0 = r7.E     // Catch:{ all -> 0x01f3 }
            r1 = -1
            if (r0 == r1) goto L_0x00d5
            int r9 = r7.E     // Catch:{ all -> 0x01f3 }
            float r9 = (float) r9     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r0 = r7.k     // Catch:{ all -> 0x01f3 }
            float r0 = r0.density     // Catch:{ all -> 0x01f3 }
            float r9 = r9 * r0
            int r9 = (int) r9     // Catch:{ all -> 0x01f3 }
            goto L_0x00d9
        L_0x00d5:
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01f3 }
        L_0x00d9:
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x00de:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x00e3:
            com.google.android.gms.internal.ads.zzbhg r0 = r7.p     // Catch:{ all -> 0x01f3 }
            boolean r0 = r0.e()     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x00f8
            android.util.DisplayMetrics r8 = r7.k     // Catch:{ all -> 0x01f3 }
            int r8 = r8.widthPixels     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r9 = r7.k     // Catch:{ all -> 0x01f3 }
            int r9 = r9.heightPixels     // Catch:{ all -> 0x01f3 }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x00f8:
            int r0 = android.view.View.MeasureSpec.getMode(r8)     // Catch:{ all -> 0x01f3 }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01f3 }
            int r2 = android.view.View.MeasureSpec.getMode(r9)     // Catch:{ all -> 0x01f3 }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01f3 }
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
            com.google.android.gms.internal.ads.zzbhg r2 = r7.p     // Catch:{ all -> 0x01f3 }
            int r2 = r2.f6434c     // Catch:{ all -> 0x01f3 }
            r3 = 1
            if (r2 > r0) goto L_0x012e
            com.google.android.gms.internal.ads.zzbhg r2 = r7.p     // Catch:{ all -> 0x01f3 }
            int r2 = r2.f6433b     // Catch:{ all -> 0x01f3 }
            if (r2 <= r5) goto L_0x012c
            goto L_0x012e
        L_0x012c:
            r2 = 0
            goto L_0x012f
        L_0x012e:
            r2 = 1
        L_0x012f:
            com.google.android.gms.internal.ads.zzaag<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.zzaav.t2     // Catch:{ all -> 0x01f3 }
            com.google.android.gms.internal.ads.zzaar r6 = com.google.android.gms.internal.ads.zzwg.e()     // Catch:{ all -> 0x01f3 }
            java.lang.Object r4 = r6.c(r4)     // Catch:{ all -> 0x01f3 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x01f3 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x01f3 }
            if (r4 == 0) goto L_0x016e
            com.google.android.gms.internal.ads.zzbhg r4 = r7.p     // Catch:{ all -> 0x01f3 }
            int r4 = r4.f6434c     // Catch:{ all -> 0x01f3 }
            float r4 = (float) r4     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r6 = r7.k     // Catch:{ all -> 0x01f3 }
            float r6 = r6.density     // Catch:{ all -> 0x01f3 }
            float r4 = r4 / r6
            float r0 = (float) r0     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r6 = r7.k     // Catch:{ all -> 0x01f3 }
            float r6 = r6.density     // Catch:{ all -> 0x01f3 }
            float r0 = r0 / r6
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x016a
            com.google.android.gms.internal.ads.zzbhg r0 = r7.p     // Catch:{ all -> 0x01f3 }
            int r0 = r0.f6433b     // Catch:{ all -> 0x01f3 }
            float r0 = (float) r0     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r4 = r7.k     // Catch:{ all -> 0x01f3 }
            float r4 = r4.density     // Catch:{ all -> 0x01f3 }
            float r0 = r0 / r4
            float r4 = (float) r5     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r5 = r7.k     // Catch:{ all -> 0x01f3 }
            float r5 = r5.density     // Catch:{ all -> 0x01f3 }
            float r4 = r4 / r5
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x016a
            goto L_0x016b
        L_0x016a:
            r3 = 0
        L_0x016b:
            if (r2 == 0) goto L_0x016e
            r2 = r3
        L_0x016e:
            r0 = 8
            if (r2 == 0) goto L_0x01d8
            com.google.android.gms.internal.ads.zzbhg r2 = r7.p     // Catch:{ all -> 0x01f3 }
            int r2 = r2.f6434c     // Catch:{ all -> 0x01f3 }
            float r2 = (float) r2     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r3 = r7.k     // Catch:{ all -> 0x01f3 }
            float r3 = r3.density     // Catch:{ all -> 0x01f3 }
            float r2 = r2 / r3
            int r2 = (int) r2     // Catch:{ all -> 0x01f3 }
            com.google.android.gms.internal.ads.zzbhg r3 = r7.p     // Catch:{ all -> 0x01f3 }
            int r3 = r3.f6433b     // Catch:{ all -> 0x01f3 }
            float r3 = (float) r3     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r4 = r7.k     // Catch:{ all -> 0x01f3 }
            float r4 = r4.density     // Catch:{ all -> 0x01f3 }
            float r3 = r3 / r4
            int r3 = (int) r3     // Catch:{ all -> 0x01f3 }
            float r8 = (float) r8     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r4 = r7.k     // Catch:{ all -> 0x01f3 }
            float r4 = r4.density     // Catch:{ all -> 0x01f3 }
            float r8 = r8 / r4
            int r8 = (int) r8     // Catch:{ all -> 0x01f3 }
            float r9 = (float) r9     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r4 = r7.k     // Catch:{ all -> 0x01f3 }
            float r4 = r4.density     // Catch:{ all -> 0x01f3 }
            float r9 = r9 / r4
            int r9 = (int) r9     // Catch:{ all -> 0x01f3 }
            r4 = 103(0x67, float:1.44E-43)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f3 }
            r5.<init>(r4)     // Catch:{ all -> 0x01f3 }
            java.lang.String r4 = "Not enough space to show ad. Needs "
            r5.append(r4)     // Catch:{ all -> 0x01f3 }
            r5.append(r2)     // Catch:{ all -> 0x01f3 }
            java.lang.String r2 = "x"
            r5.append(r2)     // Catch:{ all -> 0x01f3 }
            r5.append(r3)     // Catch:{ all -> 0x01f3 }
            java.lang.String r2 = " dp, but only has "
            r5.append(r2)     // Catch:{ all -> 0x01f3 }
            r5.append(r8)     // Catch:{ all -> 0x01f3 }
            java.lang.String r8 = "x"
            r5.append(r8)     // Catch:{ all -> 0x01f3 }
            r5.append(r9)     // Catch:{ all -> 0x01f3 }
            java.lang.String r8 = " dp."
            r5.append(r8)     // Catch:{ all -> 0x01f3 }
            java.lang.String r8 = r5.toString()     // Catch:{ all -> 0x01f3 }
            com.google.android.gms.internal.ads.zzbba.i(r8)     // Catch:{ all -> 0x01f3 }
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01f3 }
            if (r8 == r0) goto L_0x01d3
            r8 = 4
            r7.setVisibility(r8)     // Catch:{ all -> 0x01f3 }
        L_0x01d3:
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x01d8:
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01f3 }
            if (r8 == r0) goto L_0x01e1
            r7.setVisibility(r1)     // Catch:{ all -> 0x01f3 }
        L_0x01e1:
            com.google.android.gms.internal.ads.zzbhg r8 = r7.p     // Catch:{ all -> 0x01f3 }
            int r8 = r8.f6434c     // Catch:{ all -> 0x01f3 }
            com.google.android.gms.internal.ads.zzbhg r9 = r7.p     // Catch:{ all -> 0x01f3 }
            int r9 = r9.f6433b     // Catch:{ all -> 0x01f3 }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x01ee:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x01f3:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ga.onMeasure(int, int):void");
    }

    public final void onPause() {
        try {
            super.onPause();
        } catch (Exception e2) {
            zzbba.c("Could not pause webview.", e2);
        }
    }

    public final void onResume() {
        try {
            super.onResume();
        } catch (Exception e2) {
            zzbba.c("Could not resume webview.", e2);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f4046f.F() || this.f4046f.G()) {
            zzeg zzeg = this.g;
            if (zzeg != null) {
                zzeg.d(motionEvent);
            }
        } else {
            synchronized (this) {
                if (this.A != null) {
                    this.A.b(motionEvent);
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p() {
        setBackgroundColor(0);
    }

    public final zzabg p0() {
        return this.G;
    }

    public final /* synthetic */ zzbgz q() {
        return this.f4046f;
    }

    public final WebViewClient q0() {
        return this.f4046f;
    }

    public final zzbcu r() {
        return null;
    }

    public final void r0() {
        this.K.e();
    }

    public final synchronized zzc s0() {
        return this.J;
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        new WeakReference(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    public final synchronized void setRequestedOrientation(int i2) {
        this.u = i2;
        if (this.o != null) {
            this.o.setRequestedOrientation(i2);
        }
    }

    public final void stopLoading() {
        try {
            super.stopLoading();
        } catch (Exception e2) {
            zzbba.c("Could not stop loading webview.", e2);
        }
    }

    public final synchronized void t(boolean z2) {
        if (this.o != null) {
            this.o.zza(this.f4046f.o(), z2);
        } else {
            this.r = z2;
        }
    }

    public final synchronized void t0(zzadh zzadh) {
        this.A = zzadh;
    }

    public final synchronized void u() {
        if (this.B != null) {
            this.B.z3();
        }
    }

    public final synchronized zzadh u0() {
        return this.A;
    }

    public final void v(String str, Predicate<zzahc<? super zzbfn>> predicate) {
        zzbhf zzbhf = this.f4046f;
        if (zzbhf != null) {
            zzbhf.B(str, predicate);
        }
    }

    public final synchronized String v0() {
        return this.q;
    }

    public final boolean w(boolean z2, int i2) {
        destroy();
        this.l.b(new fa(z2, i2));
        this.l.a(zzto.zza.C0084zza.ANDROID_WEBVIEW_CRASH);
        return true;
    }

    public final synchronized void w0(boolean z2) {
        boolean z3 = z2 != this.s;
        this.s = z2;
        K0();
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
        this.m.a(activity, this);
        this.m.c(str, str2);
        if (viewGroup != null) {
            viewGroup.addView(this.m.getView());
        } else {
            zzbba.g("The FrameLayout object cannot be null.");
        }
    }

    public final void y(boolean z2) {
        this.f4046f.M(z2);
    }

    public final void y0(boolean z2, int i2, String str, String str2) {
        this.f4046f.E(z2, i2, str, str2);
    }

    public final void z(String str, Map map) {
        zzajo.b(this, str, map);
    }

    public final synchronized boolean z0() {
        return this.r;
    }

    public final synchronized void zzkd() {
        if (this.i != null) {
            this.i.zzkd();
        }
    }

    public final synchronized void zzke() {
        if (this.i != null) {
            this.i.zzke();
        }
    }
}
