package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.c.a.d.b;
import b.c.a.d.h;
import com.google.android.material.snackbar.BaseTransientBottomBar;

public final class Snackbar extends BaseTransientBottomBar<Snackbar> {
    private static final int[] o = {b.snackbarButtonStyle};
    private final AccessibilityManager m;
    private boolean n;

    public static final class SnackbarLayout extends BaseTransientBottomBar.SnackbarBaseLayout {
        public SnackbarLayout(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View.OnClickListener f11083b;

        a(View.OnClickListener onClickListener) {
            this.f11083b = onClickListener;
        }

        public void onClick(View view) {
            this.f11083b.onClick(view);
            Snackbar.this.f(1);
        }
    }

    private Snackbar(ViewGroup viewGroup, View view, a aVar) {
        super(viewGroup, view, aVar);
        this.m = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    private static ViewGroup u(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    continue;
                } else {
                    view = null;
                    continue;
                }
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    protected static boolean v(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(o);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        if (resourceId != -1) {
            return true;
        }
        return false;
    }

    public static Snackbar w(View view, int i, int i2) {
        return x(view, view.getResources().getText(i), i2);
    }

    public static Snackbar x(View view, CharSequence charSequence, int i) {
        ViewGroup u = u(view);
        if (u != null) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(u.getContext()).inflate(v(u.getContext()) ? h.mtrl_layout_snackbar_include : h.design_layout_snackbar_include, u, false);
            Snackbar snackbar = new Snackbar(u, snackbarContentLayout, snackbarContentLayout);
            snackbar.B(charSequence);
            snackbar.q(i);
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    public Snackbar A(int i) {
        ((SnackbarContentLayout) this.f11059c.getChildAt(0)).getActionView().setTextColor(i);
        return this;
    }

    public Snackbar B(CharSequence charSequence) {
        ((SnackbarContentLayout) this.f11059c.getChildAt(0)).getMessageView().setText(charSequence);
        return this;
    }

    public void e() {
        super.e();
    }

    public int h() {
        if (!this.n || !this.m.isTouchExplorationEnabled()) {
            return super.h();
        }
        return -2;
    }

    public void s() {
        super.s();
    }

    public Snackbar y(int i, View.OnClickListener onClickListener) {
        z(g().getText(i), onClickListener);
        return this;
    }

    public Snackbar z(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button actionView = ((SnackbarContentLayout) this.f11059c.getChildAt(0)).getActionView();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            actionView.setVisibility(8);
            actionView.setOnClickListener((View.OnClickListener) null);
            this.n = false;
        } else {
            this.n = true;
            actionView.setVisibility(0);
            actionView.setText(charSequence);
            actionView.setOnClickListener(new a(onClickListener));
        }
        return this;
    }
}
