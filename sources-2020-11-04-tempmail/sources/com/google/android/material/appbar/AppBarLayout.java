package com.google.android.material.appbar;

import a.h.k.c0;
import a.h.k.q;
import a.h.k.u;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import b.c.a.d.j;
import b.c.a.d.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@CoordinatorLayout.d(Behavior.class)
public class AppBarLayout extends LinearLayout {

    /* renamed from: b  reason: collision with root package name */
    private int f10811b;

    /* renamed from: c  reason: collision with root package name */
    private int f10812c;

    /* renamed from: d  reason: collision with root package name */
    private int f10813d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f10814e;

    /* renamed from: f  reason: collision with root package name */
    private int f10815f;
    private c0 g;
    private List<b> h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private int[] m;

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends b {
        public ScrollingViewBehavior() {
        }

        private static int P(AppBarLayout appBarLayout) {
            CoordinatorLayout.c f2 = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f();
            if (f2 instanceof BaseBehavior) {
                return ((BaseBehavior) f2).L();
            }
            return 0;
        }

        private void Q(View view, View view2) {
            CoordinatorLayout.c f2 = ((CoordinatorLayout.f) view2.getLayoutParams()).f();
            if (f2 instanceof BaseBehavior) {
                u.O(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) f2).k) + L()) - H(view2));
            }
        }

        private void R(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.k()) {
                    appBarLayout.r(view.getScrollY() > 0);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public float I(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int P = P(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + P > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (((float) P) / ((float) i)) + 1.0f;
                }
            }
            return 0.0f;
        }

        /* access modifiers changed from: package-private */
        public int K(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.K(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: O */
        public AppBarLayout G(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            Q(view, view2);
            R(view, view2);
            return false;
        }

        public boolean v(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout O = G(coordinatorLayout.v(view));
            if (O != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f10841d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    O.setExpanded(false, !z);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.ScrollingViewBehavior_Layout);
            N(obtainStyledAttributes.getDimensionPixelSize(k.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }
    }

    class a implements q {
        a() {
        }

        public c0 a(View view, c0 c0Var) {
            AppBarLayout.this.l(c0Var);
            return c0Var;
        }
    }

    public interface b<T extends AppBarLayout> {
        void a(T t, int i);
    }

    public interface d extends b<AppBarLayout> {
    }

    public AppBarLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private boolean h() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (((c) getChildAt(i2).getLayoutParams()).c()) {
                return true;
            }
        }
        return false;
    }

    private void j() {
        this.f10811b = -1;
        this.f10812c = -1;
        this.f10813d = -1;
    }

    private void p(boolean z, boolean z2, boolean z3) {
        int i2 = 0;
        int i3 = (z ? 1 : 2) | (z2 ? 4 : 0);
        if (z3) {
            i2 = 8;
        }
        this.f10815f = i3 | i2;
        requestLayout();
    }

    private boolean q(boolean z) {
        if (this.j == z) {
            return false;
        }
        this.j = z;
        refreshDrawableState();
        return true;
    }

    public void a(b bVar) {
        if (this.h == null) {
            this.h = new ArrayList();
        }
        if (bVar != null && !this.h.contains(bVar)) {
            this.h.add(bVar);
        }
    }

    public void b(d dVar) {
        a(dVar);
    }

    /* access modifiers changed from: package-private */
    public void c(int i2) {
        List<b> list = this.h;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                b bVar = this.h.get(i3);
                if (bVar != null) {
                    bVar.a(this, i2);
                }
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
        return new c(-1, -2);
    }

    /* renamed from: e */
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (Build.VERSION.SDK_INT >= 19 && (layoutParams instanceof LinearLayout.LayoutParams)) {
            return new c((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c(layoutParams);
    }

    /* access modifiers changed from: package-private */
    public boolean g() {
        return this.f10814e;
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedPreScrollRange() {
        int i2;
        int i3 = this.f10812c;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            c cVar = (c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = cVar.f10823a;
            if ((i5 & 5) == 5) {
                int i6 = i4 + cVar.topMargin + cVar.bottomMargin;
                if ((i5 & 8) != 0) {
                    i4 = i6 + u.u(childAt);
                } else {
                    if ((i5 & 2) != 0) {
                        i2 = u.u(childAt);
                    } else {
                        i2 = getTopInset();
                    }
                    i4 = i6 + (measuredHeight - i2);
                }
            } else if (i4 > 0) {
                break;
            }
        }
        int max = Math.max(0, i4);
        this.f10812c = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedScrollRange() {
        int i2 = this.f10813d;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            c cVar = (c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + cVar.topMargin + cVar.bottomMargin;
            int i5 = cVar.f10823a;
            if ((i5 & 1) == 0) {
                break;
            }
            i4 += measuredHeight;
            if ((i5 & 2) != 0) {
                i4 -= u.u(childAt) + getTopInset();
                break;
            }
            i3++;
        }
        int max = Math.max(0, i4);
        this.f10813d = max;
        return max;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int u = u.u(this);
        if (u == 0) {
            int childCount = getChildCount();
            u = childCount >= 1 ? u.u(getChildAt(childCount - 1)) : 0;
            if (u == 0) {
                return getHeight() / 3;
            }
        }
        return (u * 2) + topInset;
    }

    /* access modifiers changed from: package-private */
    public int getPendingAction() {
        return this.f10815f;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    public final int getTopInset() {
        c0 c0Var = this.g;
        if (c0Var != null) {
            return c0Var.e();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i2 = this.f10811b;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            c cVar = (c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = cVar.f10823a;
            if ((i5 & 1) == 0) {
                break;
            }
            i4 += measuredHeight + cVar.topMargin + cVar.bottomMargin;
            if ((i5 & 2) != 0) {
                i4 -= u.u(childAt);
                break;
            }
            i3++;
        }
        int max = Math.max(0, i4 - getTopInset());
        this.f10811b = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        return getTotalScrollRange() != 0;
    }

    public boolean k() {
        return this.l;
    }

    /* access modifiers changed from: package-private */
    public c0 l(c0 c0Var) {
        c0 c0Var2 = u.q(this) ? c0Var : null;
        if (!a.h.j.c.a(this.g, c0Var2)) {
            this.g = c0Var2;
            j();
        }
        return c0Var;
    }

    public void m(b bVar) {
        List<b> list = this.h;
        if (list != null && bVar != null) {
            list.remove(bVar);
        }
    }

    public void n(d dVar) {
        m(dVar);
    }

    /* access modifiers changed from: package-private */
    public void o() {
        this.f10815f = 0;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i2) {
        if (this.m == null) {
            this.m = new int[4];
        }
        int[] iArr = this.m;
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + iArr.length);
        iArr[0] = this.j ? b.c.a.d.b.state_liftable : -b.c.a.d.b.state_liftable;
        iArr[1] = (!this.j || !this.k) ? -b.c.a.d.b.state_lifted : b.c.a.d.b.state_lifted;
        iArr[2] = this.j ? b.c.a.d.b.state_collapsible : -b.c.a.d.b.state_collapsible;
        iArr[3] = (!this.j || !this.k) ? -b.c.a.d.b.state_collapsed : b.c.a.d.b.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        j();
        boolean z2 = false;
        this.f10814e = false;
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            if (i6 >= childCount) {
                break;
            } else if (((c) getChildAt(i6).getLayoutParams()).b() != null) {
                this.f10814e = true;
                break;
            } else {
                i6++;
            }
        }
        if (!this.i) {
            if (this.l || h()) {
                z2 = true;
            }
            q(z2);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        j();
    }

    /* access modifiers changed from: package-private */
    public boolean r(boolean z) {
        if (this.k == z) {
            return false;
        }
        this.k = z;
        refreshDrawableState();
        return true;
    }

    public void setExpanded(boolean z) {
        setExpanded(z, u.I(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.l = z;
    }

    public void setOrientation(int i2) {
        if (i2 == 1) {
            super.setOrientation(i2);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    @Deprecated
    public void setTargetElevation(float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            e.b(this, f2);
        }
    }

    protected static class BaseBehavior<T extends AppBarLayout> extends a<T> {
        /* access modifiers changed from: private */
        public int k;
        private int l;
        private ValueAnimator m;
        private int n = -1;
        private boolean o;
        private float p;
        private WeakReference<View> q;
        private b r;

        class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f10819a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AppBarLayout f10820b;

            a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f10819a = coordinatorLayout;
                this.f10820b = appBarLayout;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.O(this.f10819a, this.f10820b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        public static abstract class b<T extends AppBarLayout> {
            public abstract boolean a(T t);
        }

        public BaseBehavior() {
        }

        private void R(CoordinatorLayout coordinatorLayout, T t, int i, float f2) {
            int i2;
            int abs = Math.abs(L() - i);
            float abs2 = Math.abs(f2);
            if (abs2 > 0.0f) {
                i2 = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                i2 = (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f);
            }
            S(coordinatorLayout, t, i, i2);
        }

        private void S(CoordinatorLayout coordinatorLayout, T t, int i, int i2) {
            int L = L();
            if (L == i) {
                ValueAnimator valueAnimator = this.m;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.m.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.m = valueAnimator3;
                valueAnimator3.setInterpolator(b.c.a.d.l.a.f2367e);
                this.m.addUpdateListener(new a(coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.m.setDuration((long) Math.min(i2, 600));
            this.m.setIntValues(new int[]{L, i});
            this.m.start();
        }

        private boolean U(CoordinatorLayout coordinatorLayout, T t, View view) {
            return t.i() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        private static boolean V(int i, int i2) {
            return (i & i2) == i2;
        }

        private View W(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt instanceof a.h.k.k) {
                    return childAt;
                }
            }
            return null;
        }

        private static View X(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int Y(T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                c cVar = (c) childAt.getLayoutParams();
                if (V(cVar.a(), 32)) {
                    top -= cVar.topMargin;
                    bottom += cVar.bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        private int b0(T t, int i) {
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                c cVar = (c) childAt.getLayoutParams();
                Interpolator b2 = cVar.b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (b2 != null) {
                    int a2 = cVar.a();
                    if ((a2 & 1) != 0) {
                        i2 = 0 + childAt.getHeight() + cVar.topMargin + cVar.bottomMargin;
                        if ((a2 & 2) != 0) {
                            i2 -= u.u(childAt);
                        }
                    }
                    if (u.q(childAt)) {
                        i2 -= t.getTopInset();
                    }
                    if (i2 > 0) {
                        float f2 = (float) i2;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f2 * b2.getInterpolation(((float) (abs - childAt.getTop())) / f2)));
                    }
                }
            }
            return i;
        }

        private boolean m0(CoordinatorLayout coordinatorLayout, T t) {
            List<View> w = coordinatorLayout.w(t);
            int size = w.size();
            int i = 0;
            while (i < size) {
                CoordinatorLayout.c f2 = ((CoordinatorLayout.f) w.get(i).getLayoutParams()).f();
                if (!(f2 instanceof ScrollingViewBehavior)) {
                    i++;
                } else if (((ScrollingViewBehavior) f2).J() != 0) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }

        private void n0(CoordinatorLayout coordinatorLayout, T t) {
            int L = L();
            int Y = Y(t, L);
            if (Y >= 0) {
                View childAt = t.getChildAt(Y);
                c cVar = (c) childAt.getLayoutParams();
                int a2 = cVar.a();
                if ((a2 & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (Y == t.getChildCount() - 1) {
                        i2 += t.getTopInset();
                    }
                    if (V(a2, 2)) {
                        i2 += u.u(childAt);
                    } else if (V(a2, 5)) {
                        int u = u.u(childAt) + i2;
                        if (L < u) {
                            i = u;
                        } else {
                            i2 = u;
                        }
                    }
                    if (V(a2, 32)) {
                        i += cVar.topMargin;
                        i2 -= cVar.bottomMargin;
                    }
                    if (L < (i2 + i) / 2) {
                        i = i2;
                    }
                    R(coordinatorLayout, t, a.h.g.a.b(i, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void o0(int i, T t, View view, int i2) {
            if (i2 == 1) {
                int L = L();
                if ((i < 0 && L == 0) || (i > 0 && L == (-t.getDownNestedScrollRange()))) {
                    u.r0(view, 1);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0055  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void p0(androidx.coordinatorlayout.widget.CoordinatorLayout r6, T r7, int r8, int r9, boolean r10) {
            /*
                r5 = this;
                android.view.View r0 = X(r7, r8)
                if (r0 == 0) goto L_0x006e
                android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$c r1 = (com.google.android.material.appbar.AppBarLayout.c) r1
                int r1 = r1.a()
                r2 = r1 & 1
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x0041
                int r2 = a.h.k.u.u(r0)
                if (r9 <= 0) goto L_0x002f
                r9 = r1 & 12
                if (r9 == 0) goto L_0x002f
                int r8 = -r8
                int r9 = r0.getBottom()
                int r9 = r9 - r2
                int r0 = r7.getTopInset()
                int r9 = r9 - r0
                if (r8 < r9) goto L_0x0041
            L_0x002d:
                r8 = 1
                goto L_0x0042
            L_0x002f:
                r9 = r1 & 2
                if (r9 == 0) goto L_0x0041
                int r8 = -r8
                int r9 = r0.getBottom()
                int r9 = r9 - r2
                int r0 = r7.getTopInset()
                int r9 = r9 - r0
                if (r8 < r9) goto L_0x0041
                goto L_0x002d
            L_0x0041:
                r8 = 0
            L_0x0042:
                boolean r9 = r7.k()
                if (r9 == 0) goto L_0x0057
                android.view.View r9 = r5.W(r6)
                if (r9 == 0) goto L_0x0057
                int r8 = r9.getScrollY()
                if (r8 <= 0) goto L_0x0055
                goto L_0x0056
            L_0x0055:
                r3 = 0
            L_0x0056:
                r8 = r3
            L_0x0057:
                boolean r8 = r7.r(r8)
                int r9 = android.os.Build.VERSION.SDK_INT
                r0 = 11
                if (r9 < r0) goto L_0x006e
                if (r10 != 0) goto L_0x006b
                if (r8 == 0) goto L_0x006e
                boolean r6 = r5.m0(r6, r7)
                if (r6 == 0) goto L_0x006e
            L_0x006b:
                r7.jumpDrawablesToCurrentState()
            L_0x006e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.p0(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        /* access modifiers changed from: package-private */
        public int L() {
            return D() + this.k;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: T */
        public boolean G(T t) {
            b bVar = this.r;
            if (bVar != null) {
                return bVar.a(t);
            }
            WeakReference<View> weakReference = this.q;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            if (view == null || !view.isShown() || view.canScrollVertically(-1)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Z */
        public int J(T t) {
            return -t.getDownNestedScrollRange();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a0 */
        public int K(T t) {
            return t.getTotalScrollRange();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c0 */
        public void M(CoordinatorLayout coordinatorLayout, T t) {
            n0(coordinatorLayout, t);
        }

        /* renamed from: d0 */
        public boolean l(CoordinatorLayout coordinatorLayout, T t, int i) {
            int i2;
            boolean l2 = super.l(coordinatorLayout, t, i);
            int pendingAction = t.getPendingAction();
            int i3 = this.n;
            if (i3 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t.getChildAt(i3);
                int i4 = -childAt.getBottom();
                if (this.o) {
                    i2 = u.u(childAt) + t.getTopInset();
                } else {
                    i2 = Math.round(((float) childAt.getHeight()) * this.p);
                }
                O(coordinatorLayout, t, i4 + i2);
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i5 = -t.getUpNestedPreScrollRange();
                    if (z) {
                        R(coordinatorLayout, t, i5, 0.0f);
                    } else {
                        O(coordinatorLayout, t, i5);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        R(coordinatorLayout, t, 0, 0.0f);
                    } else {
                        O(coordinatorLayout, t, 0);
                    }
                }
            }
            t.o();
            this.n = -1;
            F(a.h.g.a.b(D(), -t.getTotalScrollRange(), 0));
            p0(coordinatorLayout, t, D(), 0, true);
            t.c(D());
            return l2;
        }

        /* renamed from: e0 */
        public boolean m(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((CoordinatorLayout.f) t.getLayoutParams()).height != -2) {
                return super.m(coordinatorLayout, t, i, i2, i3, i4);
            }
            coordinatorLayout.N(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: f0 */
        public void q(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i6 = -t.getTotalScrollRange();
                    i5 = i6;
                    i4 = t.getDownNestedPreScrollRange() + i6;
                } else {
                    i5 = -t.getUpNestedPreScrollRange();
                    i4 = 0;
                }
                if (i5 != i4) {
                    iArr[1] = N(coordinatorLayout, t, i2, i5, i4);
                    o0(i2, t, view, i3);
                }
            }
        }

        /* renamed from: g0 */
        public void s(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5) {
            if (i4 < 0) {
                N(coordinatorLayout, t, i4, -t.getDownNestedScrollRange(), 0);
                o0(i4, t, view, i5);
            }
            if (t.k()) {
                t.r(view.getScrollY() > 0);
            }
        }

        /* renamed from: h0 */
        public void w(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                SavedState savedState = (SavedState) parcelable;
                super.w(coordinatorLayout, t, savedState.a());
                this.n = savedState.f10816d;
                this.p = savedState.f10817e;
                this.o = savedState.f10818f;
                return;
            }
            super.w(coordinatorLayout, t, parcelable);
            this.n = -1;
        }

        /* renamed from: i0 */
        public Parcelable x(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable x = super.x(coordinatorLayout, t);
            int D = D();
            int childCount = t.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + D;
                if (childAt.getTop() + D > 0 || bottom < 0) {
                    i++;
                } else {
                    SavedState savedState = new SavedState(x);
                    savedState.f10816d = i;
                    if (bottom == u.u(childAt) + t.getTopInset()) {
                        z = true;
                    }
                    savedState.f10818f = z;
                    savedState.f10817e = ((float) bottom) / ((float) childAt.getHeight());
                    return savedState;
                }
            }
            return x;
        }

        /* renamed from: j0 */
        public boolean z(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = (i & 2) != 0 && (t.k() || U(coordinatorLayout, t, view));
            if (z && (valueAnimator = this.m) != null) {
                valueAnimator.cancel();
            }
            this.q = null;
            this.l = i2;
            return z;
        }

        /* renamed from: k0 */
        public void B(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.l == 0 || i == 1) {
                n0(coordinatorLayout, t);
            }
            this.q = new WeakReference<>(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l0 */
        public int P(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3) {
            int L = L();
            int i4 = 0;
            if (i2 == 0 || L < i2 || L > i3) {
                this.k = 0;
            } else {
                int b2 = a.h.g.a.b(i, i2, i3);
                if (L != b2) {
                    int b0 = t.g() ? b0(t, b2) : b2;
                    boolean F = F(b0);
                    i4 = L - b2;
                    this.k = b2 - b0;
                    if (!F && t.g()) {
                        coordinatorLayout.p(t);
                    }
                    t.c(D());
                    p0(coordinatorLayout, t, b2, b2 < L ? -1 : 1, false);
                }
            }
            return i4;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        protected static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();

            /* renamed from: d  reason: collision with root package name */
            int f10816d;

            /* renamed from: e  reason: collision with root package name */
            float f10817e;

            /* renamed from: f  reason: collision with root package name */
            boolean f10818f;

            static class a implements Parcelable.ClassLoaderCreator<SavedState> {
                a() {
                }

                /* renamed from: a */
                public SavedState createFromParcel(Parcel parcel) {
                    return new SavedState(parcel, (ClassLoader) null);
                }

                /* renamed from: b */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                /* renamed from: c */
                public SavedState[] newArray(int i) {
                    return new SavedState[i];
                }
            }

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f10816d = parcel.readInt();
                this.f10817e = parcel.readFloat();
                this.f10818f = parcel.readByte() != 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.f10816d);
                parcel.writeFloat(this.f10817e);
                parcel.writeByte(this.f10818f ? (byte) 1 : 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10811b = -1;
        this.f10812c = -1;
        this.f10813d = -1;
        this.f10815f = 0;
        setOrientation(1);
        if (Build.VERSION.SDK_INT >= 21) {
            e.a(this);
            e.c(this, attributeSet, 0, j.Widget_Design_AppBarLayout);
        }
        TypedArray h2 = com.google.android.material.internal.k.h(context, attributeSet, k.AppBarLayout, 0, j.Widget_Design_AppBarLayout, new int[0]);
        u.b0(this, h2.getDrawable(k.AppBarLayout_android_background));
        if (h2.hasValue(k.AppBarLayout_expanded)) {
            p(h2.getBoolean(k.AppBarLayout_expanded, false), false, false);
        }
        if (Build.VERSION.SDK_INT >= 21 && h2.hasValue(k.AppBarLayout_elevation)) {
            e.b(this, (float) h2.getDimensionPixelSize(k.AppBarLayout_elevation, 0));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (h2.hasValue(k.AppBarLayout_android_keyboardNavigationCluster)) {
                setKeyboardNavigationCluster(h2.getBoolean(k.AppBarLayout_android_keyboardNavigationCluster, false));
            }
            if (h2.hasValue(k.AppBarLayout_android_touchscreenBlocksFocus)) {
                setTouchscreenBlocksFocus(h2.getBoolean(k.AppBarLayout_android_touchscreenBlocksFocus, false));
            }
        }
        this.l = h2.getBoolean(k.AppBarLayout_liftOnScroll, false);
        h2.recycle();
        u.l0(this, new a());
    }

    public void setExpanded(boolean z, boolean z2) {
        p(z, z2, true);
    }

    public static class c extends LinearLayout.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        int f10823a = 1;

        /* renamed from: b  reason: collision with root package name */
        Interpolator f10824b;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.AppBarLayout_Layout);
            this.f10823a = obtainStyledAttributes.getInt(k.AppBarLayout_Layout_layout_scrollFlags, 0);
            if (obtainStyledAttributes.hasValue(k.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.f10824b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(k.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public int a() {
            return this.f10823a;
        }

        public Interpolator b() {
            return this.f10824b;
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            int i = this.f10823a;
            return (i & 1) == 1 && (i & 10) != 0;
        }

        public c(int i, int i2) {
            super(i, i2);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
