package com.google.android.material.appbar;

import a.h.g.a;
import a.h.k.b0;
import a.h.k.d;
import a.h.k.t;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

/* compiled from: HeaderScrollingViewBehavior */
abstract class b extends c<View> {

    /* renamed from: d  reason: collision with root package name */
    final Rect f10655d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    final Rect f10656e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private int f10657f = 0;
    private int g;

    public b() {
    }

    private static int M(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    public void E(CoordinatorLayout coordinatorLayout, View view, int i) {
        View G = G(coordinatorLayout.v(view));
        if (G != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
            Rect rect = this.f10655d;
            rect.set(coordinatorLayout.getPaddingLeft() + fVar.leftMargin, G.getBottom() + fVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - fVar.rightMargin, ((coordinatorLayout.getHeight() + G.getBottom()) - coordinatorLayout.getPaddingBottom()) - fVar.bottomMargin);
            b0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && t.q(coordinatorLayout) && !t.q(view)) {
                rect.left += lastWindowInsets.c();
                rect.right -= lastWindowInsets.d();
            }
            Rect rect2 = this.f10656e;
            d.a(M(fVar.f1245c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int H = H(G);
            view.layout(rect2.left, rect2.top - H, rect2.right, rect2.bottom - H);
            this.f10657f = rect2.top - G.getBottom();
            return;
        }
        super.E(coordinatorLayout, view, i);
        this.f10657f = 0;
    }

    /* access modifiers changed from: package-private */
    public abstract View G(List<View> list);

    /* access modifiers changed from: package-private */
    public final int H(View view) {
        if (this.g == 0) {
            return 0;
        }
        float I = I(view);
        int i = this.g;
        return a.b((int) (I * ((float) i)), 0, i);
    }

    /* access modifiers changed from: package-private */
    public abstract float I(View view);

    public final int J() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public int K(View view) {
        return view.getMeasuredHeight();
    }

    /* access modifiers changed from: package-private */
    public final int L() {
        return this.f10657f;
    }

    public final void N(int i) {
        this.g = i;
    }

    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View G;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (G = G(coordinatorLayout.v(view))) == null) {
            return false;
        }
        if (!t.q(G) || t.q(view)) {
            View view2 = view;
        } else {
            View view3 = view;
            t.g0(view, true);
            if (t.q(view)) {
                view.requestLayout();
                return true;
            }
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size == 0) {
            size = coordinatorLayout.getHeight();
        }
        coordinatorLayout.N(view, i, i2, View.MeasureSpec.makeMeasureSpec((size - G.getMeasuredHeight()) + K(G), i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
        return true;
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
