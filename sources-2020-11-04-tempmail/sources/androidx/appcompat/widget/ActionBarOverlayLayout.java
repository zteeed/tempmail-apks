package androidx.appcompat.widget;

import a.a.f;
import a.h.k.o;
import a.h.k.p;
import a.h.k.u;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.o;

public class ActionBarOverlayLayout extends ViewGroup implements m, o {
    static final int[] C = {a.a.a.actionBarSize, 16842841};
    private final Runnable A;
    private final p B;

    /* renamed from: b  reason: collision with root package name */
    private int f921b;

    /* renamed from: c  reason: collision with root package name */
    private int f922c;

    /* renamed from: d  reason: collision with root package name */
    private ContentFrameLayout f923d;

    /* renamed from: e  reason: collision with root package name */
    ActionBarContainer f924e;

    /* renamed from: f  reason: collision with root package name */
    private n f925f;
    private Drawable g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    boolean l;
    private int m;
    private int n;
    private final Rect o;
    private final Rect p;
    private final Rect q;
    private final Rect r;
    private final Rect s;
    private final Rect t;
    private final Rect u;
    private d v;
    private OverScroller w;
    ViewPropertyAnimator x;
    final AnimatorListenerAdapter y;
    private final Runnable z;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.x = null;
            actionBarOverlayLayout.l = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.x = null;
            actionBarOverlayLayout.l = false;
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.s();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.x = actionBarOverlayLayout.f924e.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.y);
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.s();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.x = actionBarOverlayLayout.f924e.animate().translationY((float) (-ActionBarOverlayLayout.this.f924e.getHeight())).setListener(ActionBarOverlayLayout.this.y);
        }
    }

    public interface d {
        void a();

        void b();

        void c(boolean z);

        void d();

        void e();

        void onWindowVisibilityChanged(int i);
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i, int i2) {
            super(i, i2);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private void n() {
        s();
        this.A.run();
    }

    private boolean o(View view, Rect rect, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        int i2;
        int i3;
        int i4;
        int i5;
        e eVar = (e) view.getLayoutParams();
        if (!z2 || eVar.leftMargin == (i5 = rect.left)) {
            z6 = false;
        } else {
            eVar.leftMargin = i5;
            z6 = true;
        }
        if (z3 && eVar.topMargin != (i4 = rect.top)) {
            eVar.topMargin = i4;
            z6 = true;
        }
        if (z5 && eVar.rightMargin != (i3 = rect.right)) {
            eVar.rightMargin = i3;
            z6 = true;
        }
        if (!z4 || eVar.bottomMargin == (i2 = rect.bottom)) {
            return z6;
        }
        eVar.bottomMargin = i2;
        return true;
    }

    private n r(View view) {
        if (view instanceof n) {
            return (n) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void t(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(C);
        boolean z2 = false;
        this.f921b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.g = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        }
        this.h = z2;
        this.w = new OverScroller(context);
    }

    private void v() {
        s();
        postDelayed(this.A, 600);
    }

    private void w() {
        s();
        postDelayed(this.z, 600);
    }

    private void y() {
        s();
        this.z.run();
    }

    private boolean z(float f2, float f3) {
        this.w.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.w.getFinalY() > this.f924e.getHeight();
    }

    public boolean a() {
        x();
        return this.f925f.a();
    }

    public boolean b() {
        x();
        return this.f925f.b();
    }

    public boolean c() {
        x();
        return this.f925f.c();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    public boolean d() {
        x();
        return this.f925f.d();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.g != null && !this.h) {
            int bottom = this.f924e.getVisibility() == 0 ? (int) (((float) this.f924e.getBottom()) + this.f924e.getTranslationY() + 0.5f) : 0;
            this.g.setBounds(0, bottom, getWidth(), this.g.getIntrinsicHeight() + bottom);
            this.g.draw(canvas);
        }
    }

    public boolean e() {
        x();
        return this.f925f.e();
    }

    public void f(int i2) {
        x();
        if (i2 == 2) {
            this.f925f.t();
        } else if (i2 == 5) {
            this.f925f.u();
        } else if (i2 == 109) {
            setOverlayMode(true);
        }
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        x();
        int A2 = u.A(this) & 256;
        boolean o2 = o(this.f924e, rect, true, true, false, true);
        this.r.set(rect);
        h0.a(this, this.r, this.o);
        if (!this.s.equals(this.r)) {
            this.s.set(this.r);
            o2 = true;
        }
        if (!this.p.equals(this.o)) {
            this.p.set(this.o);
            o2 = true;
        }
        if (o2) {
            requestLayout();
        }
        return true;
    }

    public void g() {
        x();
        this.f925f.f();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f924e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.B.a();
    }

    public CharSequence getTitle() {
        x();
        return this.f925f.getTitle();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        t(getContext());
        u.X(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        s();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = eVar.leftMargin + paddingLeft;
                int i8 = eVar.topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int i4;
        x();
        measureChildWithMargins(this.f924e, i2, 0, i3, 0);
        e eVar = (e) this.f924e.getLayoutParams();
        int max = Math.max(0, this.f924e.getMeasuredWidth() + eVar.leftMargin + eVar.rightMargin);
        int max2 = Math.max(0, this.f924e.getMeasuredHeight() + eVar.topMargin + eVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f924e.getMeasuredState());
        boolean z2 = (u.A(this) & 256) != 0;
        if (z2) {
            i4 = this.f921b;
            if (this.j && this.f924e.getTabContainer() != null) {
                i4 += this.f921b;
            }
        } else {
            i4 = this.f924e.getVisibility() != 8 ? this.f924e.getMeasuredHeight() : 0;
        }
        this.q.set(this.o);
        this.t.set(this.r);
        if (this.i || z2) {
            Rect rect = this.t;
            rect.top += i4;
            rect.bottom += 0;
        } else {
            Rect rect2 = this.q;
            rect2.top += i4;
            rect2.bottom += 0;
        }
        o(this.f923d, this.q, true, true, true, true);
        if (!this.u.equals(this.t)) {
            this.u.set(this.t);
            this.f923d.a(this.t);
        }
        measureChildWithMargins(this.f923d, i2, 0, i3, 0);
        e eVar2 = (e) this.f923d.getLayoutParams();
        int max3 = Math.max(max, this.f923d.getMeasuredWidth() + eVar2.leftMargin + eVar2.rightMargin);
        int max4 = Math.max(max2, this.f923d.getMeasuredHeight() + eVar2.topMargin + eVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f923d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.k || !z2) {
            return false;
        }
        if (z(f2, f3)) {
            n();
        } else {
            y();
        }
        this.l = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.m + i3;
        this.m = i6;
        setActionBarHideOffset(i6);
    }

    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.B.b(view, view2, i2);
        this.m = getActionBarHideOffset();
        s();
        d dVar = this.v;
        if (dVar != null) {
            dVar.e();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.f924e.getVisibility() != 0) {
            return false;
        }
        return this.k;
    }

    public void onStopNestedScroll(View view) {
        if (this.k && !this.l) {
            if (this.m <= this.f924e.getHeight()) {
                w();
            } else {
                v();
            }
        }
        d dVar = this.v;
        if (dVar != null) {
            dVar.b();
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i2) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i2);
        }
        x();
        int i3 = this.n ^ i2;
        this.n = i2;
        boolean z2 = false;
        boolean z3 = (i2 & 4) == 0;
        if ((i2 & 256) != 0) {
            z2 = true;
        }
        d dVar = this.v;
        if (dVar != null) {
            dVar.c(!z2);
            if (z3 || !z2) {
                this.v.a();
            } else {
                this.v.d();
            }
        }
        if ((i3 & 256) != 0 && this.v != null) {
            u.X(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.f922c = i2;
        d dVar = this.v;
        if (dVar != null) {
            dVar.onWindowVisibilityChanged(i2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    /* renamed from: q */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* access modifiers changed from: package-private */
    public void s() {
        removeCallbacks(this.z);
        removeCallbacks(this.A);
        ViewPropertyAnimator viewPropertyAnimator = this.x;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public void setActionBarHideOffset(int i2) {
        s();
        this.f924e.setTranslationY((float) (-Math.max(0, Math.min(i2, this.f924e.getHeight()))));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.v = dVar;
        if (getWindowToken() != null) {
            this.v.onWindowVisibilityChanged(this.f922c);
            int i2 = this.n;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                u.X(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.j = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.k) {
            this.k = z2;
            if (!z2) {
                s();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i2) {
        x();
        this.f925f.setIcon(i2);
    }

    public void setLogo(int i2) {
        x();
        this.f925f.k(i2);
    }

    public void setMenu(Menu menu, o.a aVar) {
        x();
        this.f925f.setMenu(menu, aVar);
    }

    public void setMenuPrepared() {
        x();
        this.f925f.setMenuPrepared();
    }

    public void setOverlayMode(boolean z2) {
        this.i = z2;
        this.h = z2 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i2) {
    }

    public void setWindowCallback(Window.Callback callback) {
        x();
        this.f925f.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        x();
        this.f925f.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public boolean u() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public void x() {
        if (this.f923d == null) {
            this.f923d = (ContentFrameLayout) findViewById(f.action_bar_activity_content);
            this.f924e = (ActionBarContainer) findViewById(f.action_bar_container);
            this.f925f = r(findViewById(f.action_bar));
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f922c = 0;
        this.o = new Rect();
        this.p = new Rect();
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        this.y = new a();
        this.z = new b();
        this.A = new c();
        t(context);
        this.B = new p(this);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        x();
        this.f925f.setIcon(drawable);
    }
}
