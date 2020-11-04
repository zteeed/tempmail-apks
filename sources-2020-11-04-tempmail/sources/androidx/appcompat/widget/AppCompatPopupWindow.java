package androidx.appcompat.widget;

import a.a.j;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.h;

class AppCompatPopupWindow extends PopupWindow {

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f972b = (Build.VERSION.SDK_INT < 21);

    /* renamed from: a  reason: collision with root package name */
    private boolean f973a;

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet, i, 0);
    }

    private void a(Context context, AttributeSet attributeSet, int i, int i2) {
        b0 u = b0.u(context, attributeSet, j.PopupWindow, i, i2);
        if (u.r(j.PopupWindow_overlapAnchor)) {
            b(u.a(j.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(u.g(j.PopupWindow_android_popupBackground));
        u.v();
    }

    private void b(boolean z) {
        if (f972b) {
            this.f973a = z;
        } else {
            h.a(this, z);
        }
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (f972b && this.f973a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        if (f972b && this.f973a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet, i, i2);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f972b && this.f973a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }
}
