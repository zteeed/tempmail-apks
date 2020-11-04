package androidx.appcompat.widget;

import a.a.j;
import a.h.k.t;
import a.h.k.x;
import a.h.k.y;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: AbsActionBarView */
abstract class a extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    protected final C0035a f1058b;

    /* renamed from: c  reason: collision with root package name */
    protected final Context f1059c;

    /* renamed from: d  reason: collision with root package name */
    protected ActionMenuView f1060d;

    /* renamed from: e  reason: collision with root package name */
    protected ActionMenuPresenter f1061e;

    /* renamed from: f  reason: collision with root package name */
    protected int f1062f;
    protected x g;
    private boolean h;
    private boolean i;

    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    /* compiled from: AbsActionBarView */
    protected class C0035a implements y {

        /* renamed from: a  reason: collision with root package name */
        private boolean f1063a = false;

        /* renamed from: b  reason: collision with root package name */
        int f1064b;

        protected C0035a() {
        }

        public void a(View view) {
            this.f1063a = true;
        }

        public void b(View view) {
            if (!this.f1063a) {
                a aVar = a.this;
                aVar.g = null;
                a.super.setVisibility(this.f1064b);
            }
        }

        public void c(View view) {
            a.super.setVisibility(0);
            this.f1063a = false;
        }

        public C0035a d(x xVar, int i) {
            a.this.g = xVar;
            this.f1064b = i;
            return this;
        }
    }

    a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    protected static int d(int i2, int i3, boolean z) {
        return z ? i2 - i3 : i2 + i3;
    }

    /* access modifiers changed from: protected */
    public int c(View view, int i2, int i3, int i4) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), i3);
        return Math.max(0, (i2 - view.getMeasuredWidth()) - i4);
    }

    /* access modifiers changed from: protected */
    public int e(View view, int i2, int i3, int i4, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = i3 + ((i4 - measuredHeight) / 2);
        if (z) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
        } else {
            view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public x f(int i2, long j) {
        x xVar = this.g;
        if (xVar != null) {
            xVar.b();
        }
        if (i2 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            x b2 = t.b(this);
            b2.a(1.0f);
            b2.d(j);
            C0035a aVar = this.f1058b;
            aVar.d(b2, i2);
            b2.f(aVar);
            return b2;
        }
        x b3 = t.b(this);
        b3.a(0.0f);
        b3.d(j);
        C0035a aVar2 = this.f1058b;
        aVar2.d(b3, i2);
        b3.f(aVar2);
        return b3;
    }

    public int getAnimatedVisibility() {
        if (this.g != null) {
            return this.f1058b.f1064b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f1062f;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, j.ActionBar, a.a.a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(j.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f1061e;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.I(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.i = false;
        }
        if (!this.i) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.i = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.i = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.h = false;
        }
        if (!this.h) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.h = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i2);

    public void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            x xVar = this.g;
            if (xVar != null) {
                xVar.b();
            }
            super.setVisibility(i2);
        }
    }

    a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1058b = new C0035a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(a.a.a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f1059c = context;
        } else {
            this.f1059c = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
