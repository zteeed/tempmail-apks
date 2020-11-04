package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class p5 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f4792a;

    p5(zzayu zzayu, Activity activity) {
        this.f4792a = activity;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return zzayu.w(this.f4792a, view, windowInsets);
    }
}
