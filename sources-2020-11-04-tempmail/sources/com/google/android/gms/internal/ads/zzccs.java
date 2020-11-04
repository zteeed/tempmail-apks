package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public interface zzccs {
    void J();

    void N();

    void R(zzxp zzxp);

    void a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener);

    void b(Bundle bundle);

    void c(View view);

    void c0(zzxt zzxt);

    void d();

    void destroy();

    void e();

    void f(View view, Map<String, WeakReference<View>> map);

    void f0(zzafo zzafo);

    void g();

    void h(View view, MotionEvent motionEvent, View view2);

    void i(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z);

    void j(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2);

    void k(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z);

    void l(String str);

    void m(Bundle bundle);

    boolean m0();

    boolean n(Bundle bundle);
}
