package com.google.android.material.appbar;

import a.a.i;
import a.h.k.b0;
import a.h.k.q;
import a.h.k.t;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import b.c.a.d.f;
import b.c.a.d.j;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.k;

public class CollapsingToolbarLayout extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    private boolean f10639b;

    /* renamed from: c  reason: collision with root package name */
    private int f10640c;

    /* renamed from: d  reason: collision with root package name */
    private Toolbar f10641d;

    /* renamed from: e  reason: collision with root package name */
    private View f10642e;

    /* renamed from: f  reason: collision with root package name */
    private View f10643f;
    private int g;
    private int h;
    private int i;
    private int j;
    private final Rect k;
    final com.google.android.material.internal.c l;
    private boolean m;
    private boolean n;
    private Drawable o;
    Drawable p;
    private int q;
    private boolean r;
    private ValueAnimator s;
    private long t;
    private int u;
    private AppBarLayout.d v;
    int w;
    b0 x;

    class a implements q {
        a() {
        }

        public b0 a(View view, b0 b0Var) {
            return CollapsingToolbarLayout.this.j(b0Var);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    private class d implements AppBarLayout.d {
        d() {
        }

        public void a(AppBarLayout appBarLayout, int i) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.w = i;
            b0 b0Var = collapsingToolbarLayout.x;
            int e2 = b0Var != null ? b0Var.e() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i2);
                c cVar = (c) childAt.getLayoutParams();
                d h = CollapsingToolbarLayout.h(childAt);
                int i3 = cVar.f10646a;
                if (i3 == 1) {
                    h.e(a.h.g.a.b(-i, 0, CollapsingToolbarLayout.this.g(childAt)));
                } else if (i3 == 2) {
                    h.e(Math.round(((float) (-i)) * cVar.f10647b));
                }
            }
            CollapsingToolbarLayout.this.m();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.p != null && e2 > 0) {
                t.T(collapsingToolbarLayout2);
            }
            CollapsingToolbarLayout.this.l.P(((float) Math.abs(i)) / ((float) ((CollapsingToolbarLayout.this.getHeight() - t.u(CollapsingToolbarLayout.this)) - e2)));
        }
    }

    public CollapsingToolbarLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private void a(int i2) {
        b();
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.s = valueAnimator2;
            valueAnimator2.setDuration(this.t);
            this.s.setInterpolator(i2 > this.q ? b.c.a.d.l.a.f2267c : b.c.a.d.l.a.f2268d);
            this.s.addUpdateListener(new b());
        } else if (valueAnimator.isRunning()) {
            this.s.cancel();
        }
        this.s.setIntValues(new int[]{this.q, i2});
        this.s.start();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
            r6 = this;
            boolean r0 = r6.f10639b
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r6.f10641d = r0
            r6.f10642e = r0
            int r1 = r6.f10640c
            r2 = -1
            if (r1 == r2) goto L_0x001f
            android.view.View r1 = r6.findViewById(r1)
            androidx.appcompat.widget.Toolbar r1 = (androidx.appcompat.widget.Toolbar) r1
            r6.f10641d = r1
            if (r1 == 0) goto L_0x001f
            android.view.View r1 = r6.c(r1)
            r6.f10642e = r1
        L_0x001f:
            androidx.appcompat.widget.Toolbar r1 = r6.f10641d
            r2 = 0
            if (r1 != 0) goto L_0x003c
            int r1 = r6.getChildCount()
            r3 = 0
        L_0x0029:
            if (r3 >= r1) goto L_0x003a
            android.view.View r4 = r6.getChildAt(r3)
            boolean r5 = r4 instanceof androidx.appcompat.widget.Toolbar
            if (r5 == 0) goto L_0x0037
            r0 = r4
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            goto L_0x003a
        L_0x0037:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x003a:
            r6.f10641d = r0
        L_0x003c:
            r6.l()
            r6.f10639b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.b():void");
    }

    private View c(View view) {
        ViewParent parent = view.getParent();
        while (parent != this && parent != null) {
            if (parent instanceof View) {
                view = (View) parent;
            }
            parent = parent.getParent();
        }
        return view;
    }

    private static int f(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    static d h(View view) {
        d dVar = (d) view.getTag(f.view_offset_helper);
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(view);
        view.setTag(f.view_offset_helper, dVar2);
        return dVar2;
    }

    private boolean i(View view) {
        View view2 = this.f10642e;
        if (view2 == null || view2 == this) {
            if (view == this.f10641d) {
                return true;
            }
        } else if (view == view2) {
            return true;
        }
        return false;
    }

    private void k() {
        setContentDescription(getTitle());
    }

    private void l() {
        View view;
        if (!this.m && (view = this.f10643f) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f10643f);
            }
        }
        if (this.m && this.f10641d != null) {
            if (this.f10643f == null) {
                this.f10643f = new View(getContext());
            }
            if (this.f10643f.getParent() == null) {
                this.f10641d.addView(this.f10643f, -1, -1);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public c generateDefaultLayoutParams() {
        return new c(-1, -1);
    }

    public void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        b();
        if (this.f10641d == null && (drawable = this.o) != null && this.q > 0) {
            drawable.mutate().setAlpha(this.q);
            this.o.draw(canvas);
        }
        if (this.m && this.n) {
            this.l.i(canvas);
        }
        if (this.p != null && this.q > 0) {
            b0 b0Var = this.x;
            int e2 = b0Var != null ? b0Var.e() : 0;
            if (e2 > 0) {
                this.p.setBounds(0, -this.w, getWidth(), e2 - this.w);
                this.p.mutate().setAlpha(this.q);
                this.p.draw(canvas);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j2) {
        boolean z;
        if (this.o == null || this.q <= 0 || !i(view)) {
            z = false;
        } else {
            this.o.mutate().setAlpha(this.q);
            this.o.draw(canvas);
            z = true;
        }
        if (super.drawChild(canvas, view, j2) || z) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.p;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.o;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        com.google.android.material.internal.c cVar = this.l;
        if (cVar != null) {
            z |= cVar.S(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    /* access modifiers changed from: package-private */
    public final int g(View view) {
        return ((getHeight() - h(view).a()) - view.getHeight()) - ((c) view.getLayoutParams()).bottomMargin;
    }

    public int getCollapsedTitleGravity() {
        return this.l.m();
    }

    public Typeface getCollapsedTitleTypeface() {
        return this.l.o();
    }

    public Drawable getContentScrim() {
        return this.o;
    }

    public int getExpandedTitleGravity() {
        return this.l.r();
    }

    public int getExpandedTitleMarginBottom() {
        return this.j;
    }

    public int getExpandedTitleMarginEnd() {
        return this.i;
    }

    public int getExpandedTitleMarginStart() {
        return this.g;
    }

    public int getExpandedTitleMarginTop() {
        return this.h;
    }

    public Typeface getExpandedTitleTypeface() {
        return this.l.s();
    }

    /* access modifiers changed from: package-private */
    public int getScrimAlpha() {
        return this.q;
    }

    public long getScrimAnimationDuration() {
        return this.t;
    }

    public int getScrimVisibleHeightTrigger() {
        int i2 = this.u;
        if (i2 >= 0) {
            return i2;
        }
        b0 b0Var = this.x;
        int e2 = b0Var != null ? b0Var.e() : 0;
        int u2 = t.u(this);
        if (u2 > 0) {
            return Math.min((u2 * 2) + e2, getHeight());
        }
        return getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.p;
    }

    public CharSequence getTitle() {
        if (this.m) {
            return this.l.u();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public b0 j(b0 b0Var) {
        b0 b0Var2 = t.q(this) ? b0Var : null;
        if (!a.h.j.c.a(this.x, b0Var2)) {
            this.x = b0Var2;
            requestLayout();
        }
        return b0Var.a();
    }

    /* access modifiers changed from: package-private */
    public final void m() {
        if (this.o != null || this.p != null) {
            setScrimsShown(getHeight() + this.w < getScrimVisibleHeightTrigger());
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            t.g0(this, t.q((View) parent));
            if (this.v == null) {
                this.v = new d();
            }
            ((AppBarLayout) parent).b(this.v);
            t.X(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.d dVar = this.v;
        if (dVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).n(dVar);
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        View view;
        super.onLayout(z, i2, i3, i4, i5);
        b0 b0Var = this.x;
        if (b0Var != null) {
            int e2 = b0Var.e();
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (!t.q(childAt) && childAt.getTop() < e2) {
                    t.O(childAt, e2);
                }
            }
        }
        if (this.m && (view = this.f10643f) != null) {
            boolean z2 = true;
            boolean z3 = t.H(view) && this.f10643f.getVisibility() == 0;
            this.n = z3;
            if (z3) {
                if (t.t(this) != 1) {
                    z2 = false;
                }
                View view2 = this.f10642e;
                if (view2 == null) {
                    view2 = this.f10641d;
                }
                int g2 = g(view2);
                com.google.android.material.internal.d.a(this, this.f10643f, this.k);
                this.l.E(this.k.left + (z2 ? this.f10641d.getTitleMarginEnd() : this.f10641d.getTitleMarginStart()), this.k.top + g2 + this.f10641d.getTitleMarginTop(), this.k.right + (z2 ? this.f10641d.getTitleMarginStart() : this.f10641d.getTitleMarginEnd()), (this.k.bottom + g2) - this.f10641d.getTitleMarginBottom());
                this.l.J(z2 ? this.i : this.g, this.k.top + this.h, (i4 - i2) - (z2 ? this.g : this.i), (i5 - i3) - this.j);
                this.l.C();
            }
        }
        int childCount2 = getChildCount();
        for (int i7 = 0; i7 < childCount2; i7++) {
            h(getChildAt(i7)).c();
        }
        if (this.f10641d != null) {
            if (this.m && TextUtils.isEmpty(this.l.u())) {
                setTitle(this.f10641d.getTitle());
            }
            View view3 = this.f10642e;
            if (view3 == null || view3 == this) {
                setMinimumHeight(f(this.f10641d));
            } else {
                setMinimumHeight(f(view3));
            }
        }
        m();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        b();
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i3);
        b0 b0Var = this.x;
        int e2 = b0Var != null ? b0Var.e() : 0;
        if (mode == 0 && e2 > 0) {
            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + e2, 1073741824));
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        Drawable drawable = this.o;
        if (drawable != null) {
            drawable.setBounds(0, 0, i2, i3);
        }
    }

    public void setCollapsedTitleGravity(int i2) {
        this.l.H(i2);
    }

    public void setCollapsedTitleTextAppearance(int i2) {
        this.l.F(i2);
    }

    public void setCollapsedTitleTextColor(int i2) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        this.l.I(typeface);
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.o;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.o = drawable3;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getWidth(), getHeight());
                this.o.setCallback(this);
                this.o.setAlpha(this.q);
            }
            t.T(this);
        }
    }

    public void setContentScrimColor(int i2) {
        setContentScrim(new ColorDrawable(i2));
    }

    public void setContentScrimResource(int i2) {
        setContentScrim(androidx.core.content.a.f(getContext(), i2));
    }

    public void setExpandedTitleColor(int i2) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setExpandedTitleGravity(int i2) {
        this.l.M(i2);
    }

    public void setExpandedTitleMargin(int i2, int i3, int i4, int i5) {
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = i5;
        requestLayout();
    }

    public void setExpandedTitleMarginBottom(int i2) {
        this.j = i2;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i2) {
        this.i = i2;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i2) {
        this.g = i2;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i2) {
        this.h = i2;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i2) {
        this.l.K(i2);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        this.l.L(colorStateList);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        this.l.O(typeface);
    }

    /* access modifiers changed from: package-private */
    public void setScrimAlpha(int i2) {
        Toolbar toolbar;
        if (i2 != this.q) {
            if (!(this.o == null || (toolbar = this.f10641d) == null)) {
                t.T(toolbar);
            }
            this.q = i2;
            t.T(this);
        }
    }

    public void setScrimAnimationDuration(long j2) {
        this.t = j2;
    }

    public void setScrimVisibleHeightTrigger(int i2) {
        if (this.u != i2) {
            this.u = i2;
            m();
        }
    }

    public void setScrimsShown(boolean z) {
        setScrimsShown(z, t.I(this) && !isInEditMode());
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.p;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.p = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.p.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.m(this.p, t.t(this));
                this.p.setVisible(getVisibility() == 0, false);
                this.p.setCallback(this);
                this.p.setAlpha(this.q);
            }
            t.T(this);
        }
    }

    public void setStatusBarScrimColor(int i2) {
        setStatusBarScrim(new ColorDrawable(i2));
    }

    public void setStatusBarScrimResource(int i2) {
        setStatusBarScrim(androidx.core.content.a.f(getContext(), i2));
    }

    public void setTitle(CharSequence charSequence) {
        this.l.T(charSequence);
        k();
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.m) {
            this.m = z;
            k();
            l();
            requestLayout();
        }
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.p;
        if (!(drawable == null || drawable.isVisible() == z)) {
            this.p.setVisible(z, false);
        }
        Drawable drawable2 = this.o;
        if (drawable2 != null && drawable2.isVisible() != z) {
            this.o.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.o || drawable == this.p;
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.l.G(colorStateList);
    }

    public void setScrimsShown(boolean z, boolean z2) {
        if (this.r != z) {
            int i2 = 255;
            if (z2) {
                if (!z) {
                    i2 = 0;
                }
                a(i2);
            } else {
                if (!z) {
                    i2 = 0;
                }
                setScrimAlpha(i2);
            }
            this.r = z;
        }
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f10639b = true;
        this.k = new Rect();
        this.u = -1;
        com.google.android.material.internal.c cVar = new com.google.android.material.internal.c(this);
        this.l = cVar;
        cVar.U(b.c.a.d.l.a.f2269e);
        TypedArray h2 = k.h(context, attributeSet, b.c.a.d.k.CollapsingToolbarLayout, i2, j.Widget_Design_CollapsingToolbar, new int[0]);
        this.l.M(h2.getInt(b.c.a.d.k.CollapsingToolbarLayout_expandedTitleGravity, 8388691));
        this.l.H(h2.getInt(b.c.a.d.k.CollapsingToolbarLayout_collapsedTitleGravity, 8388627));
        int dimensionPixelSize = h2.getDimensionPixelSize(b.c.a.d.k.CollapsingToolbarLayout_expandedTitleMargin, 0);
        this.j = dimensionPixelSize;
        this.i = dimensionPixelSize;
        this.h = dimensionPixelSize;
        this.g = dimensionPixelSize;
        if (h2.hasValue(b.c.a.d.k.CollapsingToolbarLayout_expandedTitleMarginStart)) {
            this.g = h2.getDimensionPixelSize(b.c.a.d.k.CollapsingToolbarLayout_expandedTitleMarginStart, 0);
        }
        if (h2.hasValue(b.c.a.d.k.CollapsingToolbarLayout_expandedTitleMarginEnd)) {
            this.i = h2.getDimensionPixelSize(b.c.a.d.k.CollapsingToolbarLayout_expandedTitleMarginEnd, 0);
        }
        if (h2.hasValue(b.c.a.d.k.CollapsingToolbarLayout_expandedTitleMarginTop)) {
            this.h = h2.getDimensionPixelSize(b.c.a.d.k.CollapsingToolbarLayout_expandedTitleMarginTop, 0);
        }
        if (h2.hasValue(b.c.a.d.k.CollapsingToolbarLayout_expandedTitleMarginBottom)) {
            this.j = h2.getDimensionPixelSize(b.c.a.d.k.CollapsingToolbarLayout_expandedTitleMarginBottom, 0);
        }
        this.m = h2.getBoolean(b.c.a.d.k.CollapsingToolbarLayout_titleEnabled, true);
        setTitle(h2.getText(b.c.a.d.k.CollapsingToolbarLayout_title));
        this.l.K(j.TextAppearance_Design_CollapsingToolbar_Expanded);
        this.l.F(i.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (h2.hasValue(b.c.a.d.k.CollapsingToolbarLayout_expandedTitleTextAppearance)) {
            this.l.K(h2.getResourceId(b.c.a.d.k.CollapsingToolbarLayout_expandedTitleTextAppearance, 0));
        }
        if (h2.hasValue(b.c.a.d.k.CollapsingToolbarLayout_collapsedTitleTextAppearance)) {
            this.l.F(h2.getResourceId(b.c.a.d.k.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
        }
        this.u = h2.getDimensionPixelSize(b.c.a.d.k.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
        this.t = (long) h2.getInt(b.c.a.d.k.CollapsingToolbarLayout_scrimAnimationDuration, 600);
        setContentScrim(h2.getDrawable(b.c.a.d.k.CollapsingToolbarLayout_contentScrim));
        setStatusBarScrim(h2.getDrawable(b.c.a.d.k.CollapsingToolbarLayout_statusBarScrim));
        this.f10640c = h2.getResourceId(b.c.a.d.k.CollapsingToolbarLayout_toolbarId, -1);
        h2.recycle();
        setWillNotDraw(false);
        t.l0(this, new a());
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public static class c extends FrameLayout.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        int f10646a = 0;

        /* renamed from: b  reason: collision with root package name */
        float f10647b = 0.5f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.c.a.d.k.CollapsingToolbarLayout_Layout);
            this.f10646a = obtainStyledAttributes.getInt(b.c.a.d.k.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            a(obtainStyledAttributes.getFloat(b.c.a.d.k.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f));
            obtainStyledAttributes.recycle();
        }

        public void a(float f2) {
            this.f10647b = f2;
        }

        public c(int i, int i2) {
            super(i, i2);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
