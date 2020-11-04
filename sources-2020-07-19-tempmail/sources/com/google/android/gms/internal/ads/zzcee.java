package com.google.android.gms.internal.ads;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public interface zzcee extends View.OnClickListener, View.OnTouchListener {
    View E(String str);

    Map<String, WeakReference<View>> L5();

    FrameLayout P();

    IObjectWrapper U1();

    zzqo a1();

    String b6();

    void d1(String str, View view, boolean z);

    Map<String, WeakReference<View>> l5();

    Map<String, WeakReference<View>> s6();

    View w5();
}
