package com.google.android.material.floatingactionbutton;

import a.h.k.s;
import a.h.k.t;
import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.h;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.k;
import b.c.a.d.d;
import b.c.a.d.j;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.a;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.internal.l;
import com.google.android.material.stateful.ExtendableSavedState;
import java.util.List;

@CoordinatorLayout.d(Behavior.class)
public class FloatingActionButton extends VisibilityAwareImageButton implements s, k, b.c.a.d.o.a {

    /* renamed from: c  reason: collision with root package name */
    private ColorStateList f10782c;

    /* renamed from: d  reason: collision with root package name */
    private PorterDuff.Mode f10783d;

    /* renamed from: e  reason: collision with root package name */
    private ColorStateList f10784e;

    /* renamed from: f  reason: collision with root package name */
    private PorterDuff.Mode f10785f;
    private int g;
    private ColorStateList h;
    private int i;
    private int j;
    /* access modifiers changed from: private */
    public int k;
    private int l;
    boolean m;
    final Rect n;
    private final Rect o;
    private final h p;
    private final b.c.a.d.o.b q;
    private a r;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    class a implements a.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f10789a;

        a(b bVar) {
            this.f10789a = bVar;
        }

        public void a() {
            this.f10789a.b(FloatingActionButton.this);
        }

        public void b() {
            this.f10789a.a(FloatingActionButton.this);
        }
    }

    public static abstract class b {
        public abstract void a(FloatingActionButton floatingActionButton);

        public abstract void b(FloatingActionButton floatingActionButton);
    }

    private class c implements b.c.a.d.s.b {
        c() {
        }

        public void a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.n.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.k, i2 + FloatingActionButton.this.k, i3 + FloatingActionButton.this.k, i4 + FloatingActionButton.this.k);
        }

        public boolean b() {
            return FloatingActionButton.this.m;
        }

        public void c(Drawable drawable) {
            FloatingActionButton.super.setBackgroundDrawable(drawable);
        }

        public float d() {
            return ((float) FloatingActionButton.this.getSizeDimension()) / 2.0f;
        }
    }

    public FloatingActionButton(Context context) {
        this(context, (AttributeSet) null);
    }

    private a g() {
        if (Build.VERSION.SDK_INT >= 21) {
            return new b(this, new c());
        }
        return new a(this, new c());
    }

    private a getImpl() {
        if (this.r == null) {
            this.r = g();
        }
        return this.r;
    }

    private int j(int i2) {
        int i3 = this.j;
        if (i3 != 0) {
            return i3;
        }
        Resources resources = getResources();
        if (i2 != -1) {
            if (i2 != 1) {
                return resources.getDimensionPixelSize(d.design_fab_size_normal);
            }
            return resources.getDimensionPixelSize(d.design_fab_size_mini);
        } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return j(1);
        } else {
            return j(0);
        }
    }

    private void m(Rect rect) {
        int i2 = rect.left;
        Rect rect2 = this.n;
        rect.left = i2 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    private void n() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f10784e;
            if (colorStateList == null) {
                androidx.core.graphics.drawable.a.c(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.f10785f;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(f.r(colorForState, mode));
        }
    }

    private static int q(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i2, size);
        }
        if (mode == 0) {
            return i2;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    private a.g s(b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(bVar);
    }

    public boolean a() {
        return this.q.c();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().A(getDrawableState());
    }

    public void e(Animator.AnimatorListener animatorListener) {
        getImpl().a(animatorListener);
    }

    public void f(Animator.AnimatorListener animatorListener) {
        getImpl().b(animatorListener);
    }

    public ColorStateList getBackgroundTintList() {
        return this.f10782c;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f10783d;
    }

    public float getCompatElevation() {
        return getImpl().l();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().n();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().p();
    }

    public Drawable getContentBackground() {
        return getImpl().i();
    }

    public int getCustomSize() {
        return this.j;
    }

    public int getExpandedComponentIdHint() {
        return this.q.b();
    }

    public b.c.a.d.l.h getHideMotionSpec() {
        return getImpl().m();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.h;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.h;
    }

    public b.c.a.d.l.h getShowMotionSpec() {
        return getImpl().q();
    }

    public int getSize() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public int getSizeDimension() {
        return j(this.i);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f10784e;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f10785f;
    }

    public boolean getUseCompatPadding() {
        return this.m;
    }

    @Deprecated
    public boolean h(Rect rect) {
        if (!t.I(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        m(rect);
        return true;
    }

    public void i(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        m(rect);
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().u();
    }

    /* access modifiers changed from: package-private */
    public void k(b bVar, boolean z) {
        getImpl().r(s(bVar), z);
    }

    public boolean l() {
        return getImpl().t();
    }

    public void o(Animator.AnimatorListener animatorListener) {
        getImpl().E(animatorListener);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().x();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().z();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int sizeDimension = getSizeDimension();
        this.k = (sizeDimension - this.l) / 2;
        getImpl().W();
        int min = Math.min(q(sizeDimension, i2), q(sizeDimension, i3));
        Rect rect = this.n;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.a());
        this.q.d(extendableSavedState.f10890d.get("expandableWidgetHelper"));
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(super.onSaveInstanceState());
        extendableSavedState.f10890d.put("expandableWidgetHelper", this.q.e());
        return extendableSavedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !h(this.o) || this.o.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void p(Animator.AnimatorListener animatorListener) {
        getImpl().F(animatorListener);
    }

    /* access modifiers changed from: package-private */
    public void r(b bVar, boolean z) {
        getImpl().T(s(bVar), z);
    }

    public void setBackgroundColor(int i2) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i2) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f10782c != colorStateList) {
            this.f10782c = colorStateList;
            getImpl().I(colorStateList);
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f10783d != mode) {
            this.f10783d = mode;
            getImpl().J(mode);
        }
    }

    public void setCompatElevation(float f2) {
        getImpl().K(f2);
    }

    public void setCompatElevationResource(int i2) {
        setCompatElevation(getResources().getDimension(i2));
    }

    public void setCompatHoveredFocusedTranslationZ(float f2) {
        getImpl().M(f2);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i2) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i2));
    }

    public void setCompatPressedTranslationZ(float f2) {
        getImpl().P(f2);
    }

    public void setCompatPressedTranslationZResource(int i2) {
        setCompatPressedTranslationZ(getResources().getDimension(i2));
    }

    public void setCustomSize(int i2) {
        if (i2 >= 0) {
            this.j = i2;
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    public void setExpandedComponentIdHint(int i2) {
        this.q.f(i2);
    }

    public void setHideMotionSpec(b.c.a.d.l.h hVar) {
        getImpl().L(hVar);
    }

    public void setHideMotionSpecResource(int i2) {
        setHideMotionSpec(b.c.a.d.l.h.c(getContext(), i2));
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        getImpl().V();
    }

    public void setImageResource(int i2) {
        this.p.g(i2);
    }

    public void setRippleColor(int i2) {
        setRippleColor(ColorStateList.valueOf(i2));
    }

    public void setShowMotionSpec(b.c.a.d.l.h hVar) {
        getImpl().R(hVar);
    }

    public void setShowMotionSpecResource(int i2) {
        setShowMotionSpec(b.c.a.d.l.h.c(getContext(), i2));
    }

    public void setSize(int i2) {
        this.j = 0;
        if (i2 != this.i) {
            this.i = i2;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f10784e != colorStateList) {
            this.f10784e = colorStateList;
            n();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f10785f != mode) {
            this.f10785f = mode;
            n();
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.m != z) {
            this.m = z;
            getImpl().y();
        }
    }

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a  reason: collision with root package name */
        private Rect f10786a;

        /* renamed from: b  reason: collision with root package name */
        private b f10787b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f10788c;

        public BaseBehavior() {
            this.f10788c = true;
        }

        private static boolean E(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private void F(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            int i;
            Rect rect = floatingActionButton.n;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
                int i2 = 0;
                if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - fVar.rightMargin) {
                    i = rect.right;
                } else {
                    i = floatingActionButton.getLeft() <= fVar.leftMargin ? -rect.left : 0;
                }
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - fVar.bottomMargin) {
                    i2 = rect.bottom;
                } else if (floatingActionButton.getTop() <= fVar.topMargin) {
                    i2 = -rect.top;
                }
                if (i2 != 0) {
                    t.O(floatingActionButton, i2);
                }
                if (i != 0) {
                    t.N(floatingActionButton, i);
                }
            }
        }

        private boolean I(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            if (this.f10788c && fVar.e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0) {
                return true;
            }
            return false;
        }

        private boolean J(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!I(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f10786a == null) {
                this.f10786a = new Rect();
            }
            Rect rect = this.f10786a;
            com.google.android.material.internal.d.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.k(this.f10787b, false);
                return true;
            }
            floatingActionButton.r(this.f10787b, false);
            return true;
        }

        private boolean K(View view, FloatingActionButton floatingActionButton) {
            if (!I(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.k(this.f10787b, false);
                return true;
            }
            floatingActionButton.r(this.f10787b, false);
            return true;
        }

        /* renamed from: D */
        public boolean b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.n;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: G */
        public boolean h(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                J(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (!E(view)) {
                return false;
            } else {
                K(view, floatingActionButton);
                return false;
            }
        }

        /* renamed from: H */
        public boolean l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List<View> v = coordinatorLayout.v(floatingActionButton);
            int size = v.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = v.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (E(view) && K(view, floatingActionButton)) {
                        break;
                    }
                } else if (J(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.M(floatingActionButton, i);
            F(coordinatorLayout, floatingActionButton);
            return true;
        }

        public void g(CoordinatorLayout.f fVar) {
            if (fVar.h == 0) {
                fVar.h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.c.a.d.k.FloatingActionButton_Behavior_Layout);
            this.f10788c = obtainStyledAttributes.getBoolean(b.c.a.d.k.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.c.a.d.b.floatingActionButtonStyle);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.h != colorStateList) {
            this.h = colorStateList;
            getImpl().Q(this.h);
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.n = new Rect();
        this.o = new Rect();
        TypedArray h2 = com.google.android.material.internal.k.h(context, attributeSet, b.c.a.d.k.FloatingActionButton, i2, j.Widget_Design_FloatingActionButton, new int[0]);
        this.f10782c = b.c.a.d.q.a.a(context, h2, b.c.a.d.k.FloatingActionButton_backgroundTint);
        this.f10783d = l.b(h2.getInt(b.c.a.d.k.FloatingActionButton_backgroundTintMode, -1), (PorterDuff.Mode) null);
        this.h = b.c.a.d.q.a.a(context, h2, b.c.a.d.k.FloatingActionButton_rippleColor);
        this.i = h2.getInt(b.c.a.d.k.FloatingActionButton_fabSize, -1);
        this.j = h2.getDimensionPixelSize(b.c.a.d.k.FloatingActionButton_fabCustomSize, 0);
        this.g = h2.getDimensionPixelSize(b.c.a.d.k.FloatingActionButton_borderWidth, 0);
        float dimension = h2.getDimension(b.c.a.d.k.FloatingActionButton_elevation, 0.0f);
        float dimension2 = h2.getDimension(b.c.a.d.k.FloatingActionButton_hoveredFocusedTranslationZ, 0.0f);
        float dimension3 = h2.getDimension(b.c.a.d.k.FloatingActionButton_pressedTranslationZ, 0.0f);
        this.m = h2.getBoolean(b.c.a.d.k.FloatingActionButton_useCompatPadding, false);
        this.l = h2.getDimensionPixelSize(b.c.a.d.k.FloatingActionButton_maxImageSize, 0);
        b.c.a.d.l.h b2 = b.c.a.d.l.h.b(context, h2, b.c.a.d.k.FloatingActionButton_showMotionSpec);
        b.c.a.d.l.h b3 = b.c.a.d.l.h.b(context, h2, b.c.a.d.k.FloatingActionButton_hideMotionSpec);
        h2.recycle();
        h hVar = new h(this);
        this.p = hVar;
        hVar.f(attributeSet, i2);
        this.q = new b.c.a.d.o.b(this);
        getImpl().H(this.f10782c, this.f10783d, this.h, this.g);
        getImpl().K(dimension);
        getImpl().M(dimension2);
        getImpl().P(dimension3);
        getImpl().O(this.l);
        getImpl().R(b2);
        getImpl().L(b3);
        setScaleType(ImageView.ScaleType.MATRIX);
    }
}
