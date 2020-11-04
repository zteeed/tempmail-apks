package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbgc extends FrameLayout implements zzbfn {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final zzbfn f6231b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbcu f6232c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicBoolean f6233d = new AtomicBoolean();

    public zzbgc(zzbfn zzbfn) {
        super(zzbfn.getContext());
        this.f6231b = zzbfn;
        this.f6232c = new zzbcu(zzbfn.d0(), this, this);
        if (!h0()) {
            addView(this.f6231b.getView());
        }
    }

    public final void A(IObjectWrapper iObjectWrapper) {
        this.f6231b.A(iObjectWrapper);
    }

    public final void A0(boolean z) {
        this.f6231b.A0(z);
    }

    public final void B() {
        this.f6231b.B();
    }

    public final void B0() {
        this.f6231b.B0();
    }

    public final void C(boolean z, int i) {
        this.f6231b.C(z, i);
    }

    public final IObjectWrapper D() {
        return this.f6231b.D();
    }

    public final int E() {
        return getMeasuredWidth();
    }

    public final zzsa F() {
        return this.f6231b.F();
    }

    public final void G(zzadc zzadc) {
        this.f6231b.G(zzadc);
    }

    public final void H(String str, String str2, String str3) {
        this.f6231b.H(str, str2, str3);
    }

    public final void J() {
        this.f6231b.J();
    }

    public final void K() {
        this.f6231b.K();
    }

    public final void M(zzc zzc) {
        this.f6231b.M(zzc);
    }

    public final int N() {
        return getMeasuredHeight();
    }

    public final zzbes O(String str) {
        return this.f6231b.O(str);
    }

    public final void R(zzqt zzqt) {
        this.f6231b.R(zzqt);
    }

    public final boolean S() {
        return this.f6233d.get();
    }

    public final void T() {
        this.f6232c.a();
        this.f6231b.T();
    }

    public final void U() {
        this.f6231b.U();
    }

    public final void V(boolean z, long j) {
        this.f6231b.V(z, j);
    }

    public final void W(zzsa zzsa) {
        this.f6231b.W(zzsa);
    }

    public final void X(zzbhg zzbhg) {
        this.f6231b.X(zzbhg);
    }

    public final void Y(boolean z) {
        this.f6231b.Y(z);
    }

    public final zzso Z() {
        return this.f6231b.Z();
    }

    public final zzbbd a() {
        return this.f6231b.a();
    }

    public final Activity b() {
        return this.f6231b.b();
    }

    public final void b0(Context context) {
        this.f6231b.b0(context);
    }

    public final void c(String str, zzahc<? super zzbfn> zzahc) {
        this.f6231b.c(str, zzahc);
    }

    public final boolean c0() {
        return this.f6231b.c0();
    }

    public final zzeg d() {
        return this.f6231b.d();
    }

    public final Context d0() {
        return this.f6231b.d0();
    }

    public final void destroy() {
        IObjectWrapper D = D();
        if (D != null) {
            zzaye.h.post(new q9(D));
            zzaye.h.postDelayed(new s9(this), (long) ((Integer) zzwg.e().c(zzaav.p2)).intValue());
            return;
        }
        this.f6231b.destroy();
    }

    public final void e(zzbgh zzbgh) {
        this.f6231b.e(zzbgh);
    }

    public final void e0(String str, JSONObject jSONObject) {
        this.f6231b.e0(str, jSONObject);
    }

    public final void f(String str) {
        this.f6231b.f(str);
    }

    public final void f0(int i) {
        this.f6231b.f0(i);
    }

    public final void g(String str, zzbes zzbes) {
        this.f6231b.g(str, zzbes);
    }

    public final String getRequestId() {
        return this.f6231b.getRequestId();
    }

    public final View getView() {
        return this;
    }

    public final WebView getWebView() {
        return this.f6231b.getWebView();
    }

    public final boolean h() {
        return this.f6231b.h();
    }

    public final boolean h0() {
        return this.f6231b.h0();
    }

    public final zzabj i() {
        return this.f6231b.i();
    }

    public final void i0(boolean z) {
        this.f6231b.i0(z);
    }

    public final zza j() {
        return this.f6231b.j();
    }

    public final void j0(boolean z, int i, String str) {
        this.f6231b.j0(z, i, str);
    }

    public final void k(String str, JSONObject jSONObject) {
        this.f6231b.k(str, jSONObject);
    }

    public final void k0(zzd zzd) {
        this.f6231b.k0(zzd);
    }

    public final boolean l() {
        return this.f6231b.l();
    }

    public final void l0(zzc zzc) {
        this.f6231b.l0(zzc);
    }

    public final void loadData(String str, String str2, String str3) {
        this.f6231b.loadData(str, str2, str3);
    }

    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f6231b.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public final void loadUrl(String str) {
        this.f6231b.loadUrl(str);
    }

    public final zzbgh m() {
        return this.f6231b.m();
    }

    public final void n(String str, zzahc<? super zzbfn> zzahc) {
        this.f6231b.n(str, zzahc);
    }

    public final boolean n0() {
        return this.f6231b.n0();
    }

    public final zzbhg o() {
        return this.f6231b.o();
    }

    public final zzc o0() {
        return this.f6231b.o0();
    }

    public final void onPause() {
        this.f6232c.b();
        this.f6231b.onPause();
    }

    public final void onResume() {
        this.f6231b.onResume();
    }

    public final void p() {
        setBackgroundColor(0);
        this.f6231b.setBackgroundColor(0);
    }

    public final zzabg p0() {
        return this.f6231b.p0();
    }

    public final zzbgz q() {
        return this.f6231b.q();
    }

    public final WebViewClient q0() {
        return this.f6231b.q0();
    }

    public final zzbcu r() {
        return this.f6232c;
    }

    public final void r0() {
        this.f6231b.r0();
    }

    public final zzc s0() {
        return this.f6231b.s0();
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f6231b.setOnClickListener(onClickListener);
    }

    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f6231b.setOnTouchListener(onTouchListener);
    }

    public final void setRequestedOrientation(int i) {
        this.f6231b.setRequestedOrientation(i);
    }

    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f6231b.setWebChromeClient(webChromeClient);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f6231b.setWebViewClient(webViewClient);
    }

    public final void t(boolean z) {
        this.f6231b.t(z);
    }

    public final void t0(zzadh zzadh) {
        this.f6231b.t0(zzadh);
    }

    public final void u() {
        this.f6231b.u();
    }

    public final zzadh u0() {
        return this.f6231b.u0();
    }

    public final void v(String str, Predicate<zzahc<? super zzbfn>> predicate) {
        this.f6231b.v(str, predicate);
    }

    public final String v0() {
        return this.f6231b.v0();
    }

    public final boolean w(boolean z, int i) {
        if (!this.f6233d.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) zzwg.e().c(zzaav.j0)).booleanValue()) {
            return false;
        }
        if (this.f6231b.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.f6231b.getParent()).removeView(this.f6231b.getView());
        }
        return this.f6231b.w(z, i);
    }

    public final void w0(boolean z) {
        this.f6231b.w0(z);
    }

    public final void x() {
        TextView textView = new TextView(getContext());
        Resources b2 = zzq.zzla().b();
        textView.setText(b2 != null ? b2.getString(R.string.s7) : "Test Ad");
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    public final void x0(ViewGroup viewGroup, Activity activity, String str, String str2) {
        this.f6231b.x0(this, activity, str, str2);
    }

    public final void y(boolean z) {
        this.f6231b.y(z);
    }

    public final void y0(boolean z, int i, String str, String str2) {
        this.f6231b.y0(z, i, str, str2);
    }

    public final void z(String str, Map<String, ?> map) {
        this.f6231b.z(str, map);
    }

    public final boolean z0() {
        return this.f6231b.z0();
    }

    public final void zzkd() {
        this.f6231b.zzkd();
    }

    public final void zzke() {
        this.f6231b.zzke();
    }
}
