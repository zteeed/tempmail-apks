package androidx.appcompat.widget;

import a.a.f;
import a.a.j;
import a.h.k.u;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    private boolean f914b;

    /* renamed from: c  reason: collision with root package name */
    private View f915c;

    /* renamed from: d  reason: collision with root package name */
    private View f916d;

    /* renamed from: e  reason: collision with root package name */
    private View f917e;

    /* renamed from: f  reason: collision with root package name */
    Drawable f918f;
    Drawable g;
    Drawable h;
    boolean i;
    boolean j;
    private int k;

    public ActionBarContainer(Context context) {
        this(context, (AttributeSet) null);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f918f;
        if (drawable != null && drawable.isStateful()) {
            this.f918f.setState(getDrawableState());
        }
        Drawable drawable2 = this.g;
        if (drawable2 != null && drawable2.isStateful()) {
            this.g.setState(getDrawableState());
        }
        Drawable drawable3 = this.h;
        if (drawable3 != null && drawable3.isStateful()) {
            this.h.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f915c;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f918f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.h;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f916d = findViewById(f.action_bar);
        this.f917e = findViewById(f.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f914b || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        Drawable drawable;
        super.onLayout(z, i2, i3, i4, i5);
        View view = this.f915c;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view == null || view.getVisibility() == 8) ? false : true;
        if (!(view == null || view.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            int i6 = ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin;
            view.layout(i2, (measuredHeight - view.getMeasuredHeight()) - i6, i4, measuredHeight - i6);
        }
        if (this.i) {
            Drawable drawable2 = this.h;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f918f != null) {
                if (this.f916d.getVisibility() == 0) {
                    this.f918f.setBounds(this.f916d.getLeft(), this.f916d.getTop(), this.f916d.getRight(), this.f916d.getBottom());
                } else {
                    View view2 = this.f917e;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f918f.setBounds(0, 0, 0, 0);
                    } else {
                        this.f918f.setBounds(this.f917e.getLeft(), this.f917e.getTop(), this.f917e.getRight(), this.f917e.getBottom());
                    }
                }
                z3 = true;
            }
            this.j = z4;
            if (!z4 || (drawable = this.g) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        if (this.f916d == null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && (i5 = this.k) >= 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i5, View.MeasureSpec.getSize(i3)), Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i3);
        if (this.f916d != null) {
            int mode = View.MeasureSpec.getMode(i3);
            View view = this.f915c;
            if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
                if (!b(this.f916d)) {
                    i4 = a(this.f916d);
                } else {
                    i4 = !b(this.f917e) ? a(this.f917e) : 0;
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(i4 + a(this.f915c), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i3) : Integer.MAX_VALUE));
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f918f;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f918f);
        }
        this.f918f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f916d;
            if (view != null) {
                this.f918f.setBounds(view.getLeft(), this.f916d.getTop(), this.f916d.getRight(), this.f916d.getBottom());
            }
        }
        boolean z = true;
        if (!this.i ? !(this.f918f == null && this.g == null) : this.h != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.h;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.h);
        }
        this.h = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.i && (drawable2 = this.h) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.i ? this.f918f == null && this.g == null : this.h == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.g;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.g);
        }
        this.g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.j && (drawable2 = this.g) != null) {
                drawable2.setBounds(this.f915c.getLeft(), this.f915c.getTop(), this.f915c.getRight(), this.f915c.getBottom());
            }
        }
        boolean z = true;
        if (!this.i ? !(this.f918f == null && this.g == null) : this.h != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.f915c;
        if (view != null) {
            removeView(view);
        }
        this.f915c = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            ViewGroup.LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f914b = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.f918f;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.g;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.h;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f918f && !this.i) || (drawable == this.g && this.j) || ((drawable == this.h && this.i) || super.verifyDrawable(drawable));
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        u.b0(this, new b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.ActionBar);
        this.f918f = obtainStyledAttributes.getDrawable(j.ActionBar_background);
        this.g = obtainStyledAttributes.getDrawable(j.ActionBar_backgroundStacked);
        this.k = obtainStyledAttributes.getDimensionPixelSize(j.ActionBar_height, -1);
        boolean z = true;
        if (getId() == f.split_action_bar) {
            this.i = true;
            this.h = obtainStyledAttributes.getDrawable(j.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        if (!this.i ? !(this.f918f == null && this.g == null) : this.h != null) {
            z = false;
        }
        setWillNotDraw(z);
    }
}
