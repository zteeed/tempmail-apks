package androidx.browser.browseractions;

import a.c.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: b  reason: collision with root package name */
    private final int f1182b = getResources().getDimensionPixelOffset(a.browser_actions_context_menu_min_padding);

    /* renamed from: c  reason: collision with root package name */
    private final int f1183c = getResources().getDimensionPixelOffset(a.browser_actions_context_menu_max_width);

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f1182b * 2), this.f1183c), 1073741824), i2);
    }
}
