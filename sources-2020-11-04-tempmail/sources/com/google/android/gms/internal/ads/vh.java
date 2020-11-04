package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class vh implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: b  reason: collision with root package name */
    private final View f5327b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbfn f5328c;

    /* renamed from: d  reason: collision with root package name */
    private final String f5329d;

    /* renamed from: e  reason: collision with root package name */
    private final WindowManager.LayoutParams f5330e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5331f;
    private final WindowManager g;

    vh(View view, zzbfn zzbfn, String str, WindowManager.LayoutParams layoutParams, int i, WindowManager windowManager) {
        this.f5327b = view;
        this.f5328c = zzbfn;
        this.f5329d = str;
        this.f5330e = layoutParams;
        this.f5331f = i;
        this.g = windowManager;
    }

    public final void onScrollChanged() {
        View view = this.f5327b;
        zzbfn zzbfn = this.f5328c;
        String str = this.f5329d;
        WindowManager.LayoutParams layoutParams = this.f5330e;
        int i = this.f5331f;
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
