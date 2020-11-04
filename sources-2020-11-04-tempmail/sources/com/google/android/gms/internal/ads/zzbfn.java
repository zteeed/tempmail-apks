package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzi;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public interface zzbfn extends zzi, zzajh, zzake, zzbdb, zzbgp, zzbgq, zzbgt, zzbgx, zzbgy, zzbha, zzqs {
    void A(IObjectWrapper iObjectWrapper);

    void A0(boolean z);

    void B0();

    IObjectWrapper D();

    zzsa F();

    void G(zzadc zzadc);

    void H(String str, String str2, String str3);

    void J();

    void K();

    void M(zzc zzc);

    boolean S();

    void T();

    void U();

    void W(zzsa zzsa);

    void X(zzbhg zzbhg);

    void Y(boolean z);

    zzso Z();

    zzbbd a();

    Activity b();

    void b0(Context context);

    void c(String str, zzahc<? super zzbfn> zzahc);

    boolean c0();

    zzeg d();

    Context d0();

    void destroy();

    void e(zzbgh zzbgh);

    void f0(int i);

    void g(String str, zzbes zzbes);

    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    ViewParent getParent();

    View getView();

    WebView getWebView();

    int getWidth();

    boolean h();

    boolean h0();

    zzabj i();

    void i0(boolean z);

    zza j();

    boolean l();

    void l0(zzc zzc);

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    zzbgh m();

    void measure(int i, int i2);

    void n(String str, zzahc<? super zzbfn> zzahc);

    boolean n0();

    zzbhg o();

    zzc o0();

    void onPause();

    void onResume();

    void p();

    zzbgz q();

    WebViewClient q0();

    void r0();

    zzc s0();

    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setRequestedOrientation(int i);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void t(boolean z);

    void t0(zzadh zzadh);

    zzadh u0();

    void v(String str, Predicate<zzahc<? super zzbfn>> predicate);

    String v0();

    boolean w(boolean z, int i);

    void w0(boolean z);

    void x();

    void x0(ViewGroup viewGroup, Activity activity, String str, String str2);

    boolean z0();
}
