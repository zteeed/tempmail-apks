package androidx.appcompat.widget;

import a.a.f;
import a.a.j;
import a.h.k.t;
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
    private boolean f887b;

    /* renamed from: c  reason: collision with root package name */
    private View f888c;

    /* renamed from: d  reason: collision with root package name */
    private View f889d;

    /* renamed from: e  reason: collision with root package name */
    private View f890e;

    /* renamed from: f  reason: collision with root package name */
    Drawable f891f;
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
        Drawable drawable = this.f891f;
        if (drawable != null && drawable.isStateful()) {
            this.f891f.setState(getDrawableState());
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
        return this.f888c;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f891f;
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
        this.f889d = findViewById(f.action_bar);
        this.f890e = findViewById(f.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f887b || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        Drawable drawable;
        super.onLayout(z, i2, i3, i4, i5);
        View view = this.f888c;
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
            if (this.f891f != null) {
                if (this.f889d.getVisibility() == 0) {
                    this.f891f.setBounds(this.f889d.getLeft(), this.f889d.getTop(), this.f889d.getRight(), this.f889d.getBottom());
                } else {
                    View view2 = this.f890e;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f891f.setBounds(0, 0, 0, 0);
                    } else {
                        this.f891f.setBounds(this.f890e.getLeft(), this.f890e.getTop(), this.f890e.getRight(), this.f890e.getBottom());
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
        if (this.f889d == null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && (i5 = this.k) >= 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i5, View.MeasureSpec.getSize(i3)), Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i3);
        if (this.f889d != null) {
            int mode = View.MeasureSpec.getMode(i3);
            View view = this.f888c;
            if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
                if (!b(this.f889d)) {
                    i4 = a(this.f889d);
                } else {
                    i4 = !b(this.f890e) ? a(this.f890e) : 0;
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(i4 + a(this.f888c), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i3) : Integer.MAX_VALUE));
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f891f;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f891f);
        }
        this.f891f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f889d;
            if (view != null) {
                this.f891f.setBounds(view.getLeft(), this.f889d.getTop(), this.f889d.getRight(), this.f889d.getBottom());
            }
        }
        boolean z = true;
        if (!this.i ? !(this.f891f == null && this.g == null) : this.h != null) {
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
        if (!this.i ? this.f891f == null && this.g == null : this.h == null) {
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
                drawable2.setBounds(this.f888c.getLeft(), this.f888c.getTop(), this.f888c.getRight(), this.f888c.getBottom());
            }
        }
        boolean z = true;
        if (!this.i ? !(this.f891f == null && this.g == null) : this.h != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.f888c;
        if (view != null) {
            removeView(view);
        }
        this.f888c = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            ViewGroup.LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f887b = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.f891f;
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
        return (drawable == this.f891f && !this.i) || (drawable == this.g && this.j) || ((drawable == this.h && this.i) || super.verifyDrawable(drawable));
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        t.b0(this, new b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.ActionBar);
        this.f891f = obtainStyledAttributes.getDrawable(j.ActionBar_background);
        this.g = obtainStyledAttributes.getDrawable(j.ActionBar_backgroundStacked);
        this.k = obtainStyledAttributes.getDimensionPixelSize(j.ActionBar_height, -1);
        boolean z = true;
        if (getId() == f.split_action_bar) {
            this.i = true;
            this.h = obtainStyledAttributes.getDrawable(j.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        if (!this.i ? !(this.f891f == null && this.g == null) : this.h != null) {
            z = false;
        }
        setWillNotDraw(z);
    }
}
