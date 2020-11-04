package androidx.appcompat.widget;

import a.a.d;
import a.a.f;
import a.a.g;
import a.a.i;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.google.firebase.crashlytics.internal.common.AbstractSpiCall;

/* compiled from: TooltipPopup */
class f0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1107a;

    /* renamed from: b  reason: collision with root package name */
    private final View f1108b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f1109c;

    /* renamed from: d  reason: collision with root package name */
    private final WindowManager.LayoutParams f1110d = new WindowManager.LayoutParams();

    /* renamed from: e  reason: collision with root package name */
    private final Rect f1111e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private final int[] f1112f = new int[2];
    private final int[] g = new int[2];

    f0(Context context) {
        this.f1107a = context;
        View inflate = LayoutInflater.from(context).inflate(g.abc_tooltip, (ViewGroup) null);
        this.f1108b = inflate;
        this.f1109c = (TextView) inflate.findViewById(f.message);
        this.f1110d.setTitle(f0.class.getSimpleName());
        this.f1110d.packageName = this.f1107a.getPackageName();
        WindowManager.LayoutParams layoutParams = this.f1110d;
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = i.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    private void a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int i3;
        int i4;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1107a.getResources().getDimensionPixelOffset(d.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1107a.getResources().getDimensionPixelOffset(d.tooltip_precise_anchor_extra_offset);
            i4 = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            i4 = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1107a.getResources().getDimensionPixelOffset(z ? d.tooltip_y_offset_touch : d.tooltip_y_offset_non_touch);
        View b2 = b(view);
        if (b2 == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        b2.getWindowVisibleDisplayFrame(this.f1111e);
        Rect rect = this.f1111e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f1107a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", AbstractSpiCall.ANDROID_CLIENT_TYPE);
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f1111e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b2.getLocationOnScreen(this.g);
        view.getLocationOnScreen(this.f1112f);
        int[] iArr = this.f1112f;
        int i5 = iArr[0];
        int[] iArr2 = this.g;
        iArr[0] = i5 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i) - (b2.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f1108b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f1108b.getMeasuredHeight();
        int[] iArr3 = this.f1112f;
        int i6 = ((iArr3[1] + i3) - dimensionPixelOffset3) - measuredHeight;
        int i7 = iArr3[1] + i4 + dimensionPixelOffset3;
        if (z) {
            if (i6 >= 0) {
                layoutParams.y = i6;
            } else {
                layoutParams.y = i7;
            }
        } else if (measuredHeight + i7 <= this.f1111e.height()) {
            layoutParams.y = i7;
        } else {
            layoutParams.y = i6;
        }
    }

    private static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (d()) {
            ((WindowManager) this.f1107a.getSystemService("window")).removeView(this.f1108b);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return this.f1108b.getParent() != null;
    }

    /* access modifiers changed from: package-private */
    public void e(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f1109c.setText(charSequence);
        a(view, i, i2, z, this.f1110d);
        ((WindowManager) this.f1107a.getSystemService("window")).addView(this.f1108b, this.f1110d);
    }
}
