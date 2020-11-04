package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.google.android.gms.common.util.PlatformVersion;

@TargetApi(19)
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcim {

    /* renamed from: a  reason: collision with root package name */
    private Context f7098a;

    /* renamed from: b  reason: collision with root package name */
    private PopupWindow f7099b;

    private static PopupWindow c(Context context, View view) {
        Window window = context instanceof Activity ? ((Activity) context).getWindow() : null;
        if (window == null || window.getDecorView() == null || ((Activity) context).isDestroyed()) {
            return null;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(view, -1, -1);
        PopupWindow popupWindow = new PopupWindow(frameLayout, 1, 1, false);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setClippingEnabled(false);
        zzbba.f("Displaying the 1x1 popup off the screen.");
        try {
            popupWindow.showAtLocation(window.getDecorView(), 0, -1, -1);
            return popupWindow;
        } catch (Exception unused) {
            return null;
        }
    }

    public final void a() {
        Context context = this.f7098a;
        if (context != null && this.f7099b != null) {
            if (!(context instanceof Activity) || !((Activity) context).isDestroyed()) {
                if (this.f7099b.isShowing()) {
                    this.f7099b.dismiss();
                }
                this.f7098a = null;
                this.f7099b = null;
                return;
            }
            this.f7098a = null;
            this.f7099b = null;
        }
    }

    public final void b(Context context, View view) {
        if (PlatformVersion.f() && !PlatformVersion.h()) {
            PopupWindow c2 = c(context, view);
            this.f7099b = c2;
            if (c2 == null) {
                context = null;
            }
            this.f7098a = context;
        }
    }
}
