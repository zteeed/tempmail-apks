package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class vh implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: b  reason: collision with root package name */
    private final View f5144b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbfn f5145c;

    /* renamed from: d  reason: collision with root package name */
    private final String f5146d;

    /* renamed from: e  reason: collision with root package name */
    private final WindowManager.LayoutParams f5147e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5148f;
    private final WindowManager g;

    vh(View view, zzbfn zzbfn, String str, WindowManager.LayoutParams layoutParams, int i, WindowManager windowManager) {
        this.f5144b = view;
        this.f5145c = zzbfn;
        this.f5146d = str;
        this.f5147e = layoutParams;
        this.f5148f = i;
        this.g = windowManager;
    }

    public final void onScrollChanged() {
        View view = this.f5144b;
        zzbfn zzbfn = this.f5145c;
        String str = this.f5146d;
        WindowManager.LayoutParams layoutParams = this.f5147e;
        int i = this.f5148f;
        WindowManager windowManager = this.g;
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect) && zzbfn.getView().getWindowToken() != null) {
            if ("1".equals(str) || "2".equals(str)) {
                layoutParams.y = rect.bottom - i;
            } else {
                layoutParams.y = rect.top - i;
            }
            windowManager.updateViewLayout(zzbfn.getView(), layoutParams);
        }
    }
}
