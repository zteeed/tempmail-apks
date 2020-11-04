package com.google.android.material.appbar;

import a.h.k.t;
import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: HeaderBehavior */
abstract class a<V extends View> extends c<V> {

    /* renamed from: d  reason: collision with root package name */
    private Runnable f10649d;

    /* renamed from: e  reason: collision with root package name */
    OverScroller f10650e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f10651f;
    private int g = -1;
    private int h;
    private int i = -1;
    private VelocityTracker j;

    /* renamed from: com.google.android.material.appbar.a$a  reason: collision with other inner class name */
    /* compiled from: HeaderBehavior */
    private class C0093a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final CoordinatorLayout f10652b;

        /* renamed from: c  reason: collision with root package name */
        private final V f10653c;

        C0093a(CoordinatorLayout coordinatorLayout, V v) {
            this.f10652b = coordinatorLayout;
            this.f10653c = v;
        }

        public void run() {
            OverScroller overScroller;
            if (this.f10653c != null && (overScroller = a.this.f10650e) != null) {
                if (overScroller.computeScrollOffset()) {
                    a aVar = a.this;
                    aVar.O(this.f10652b, this.f10653c, aVar.f10650e.getCurrY());
                    t.V(this.f10653c, this);
                    return;
                }
                a.this.M(this.f10652b, this.f10653c);
            }
        }
    }

    public a() {
    }

    private void H() {
        if (this.j == null) {
            this.j = VelocityTracker.obtain();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r0 != 3) goto L_0x00ae;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean C(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r11.i
            if (r0 >= 0) goto L_0x0012
            android.content.Context r0 = r12.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r11.i = r0
        L_0x0012:
            int r0 = r14.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x008d
            r3 = -1
            if (r0 == r1) goto L_0x005c
            r4 = 2
            if (r0 == r4) goto L_0x0025
            r12 = 3
            if (r0 == r12) goto L_0x007e
            goto L_0x00ae
        L_0x0025:
            int r0 = r11.g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r3) goto L_0x002e
            return r2
        L_0x002e:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r2 = r11.h
            int r2 = r2 - r0
            boolean r3 = r11.f10651f
            if (r3 != 0) goto L_0x0049
            int r3 = java.lang.Math.abs(r2)
            int r4 = r11.i
            if (r3 <= r4) goto L_0x0049
            r11.f10651f = r1
            if (r2 <= 0) goto L_0x0048
            int r2 = r2 - r4
            goto L_0x0049
        L_0x0048:
            int r2 = r2 + r4
        L_0x0049:
            r6 = r2
            boolean r2 = r11.f10651f
            if (r2 == 0) goto L_0x00ae
            r11.h = r0
            int r7 = r11.J(r13)
            r8 = 0
            r3 = r11
            r4 = r12
            r5 = r13
            r3.N(r4, r5, r6, r7, r8)
            goto L_0x00ae
        L_0x005c:
            android.view.VelocityTracker r0 = r11.j
            if (r0 == 0) goto L_0x007e
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.j
            int r4 = r11.g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.K(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.I(r6, r7, r8, r9, r10)
        L_0x007e:
            r11.f10651f = r2
            r11.g = r3
            android.view.VelocityTracker r12 = r11.j
            if (r12 == 0) goto L_0x00ae
            r12.recycle()
            r12 = 0
            r11.j = r12
            goto L_0x00ae
        L_0x008d:
            float r0 = r14.getX()
            int r0 = (int) r0
            float r3 = r14.getY()
            int r3 = (int) r3
            boolean r12 = r12.F(r13, r0, r3)
            if (r12 == 0) goto L_0x00b6
            boolean r12 = r11.G(r13)
            if (r12 == 0) goto L_0x00b6
            r11.h = r3
            int r12 = r14.getPointerId(r2)
            r11.g = r12
            r11.H()
        L_0x00ae:
            android.view.VelocityTracker r12 = r11.j
            if (r12 == 0) goto L_0x00b5
            r12.addMovement(r14)
        L_0x00b5:
            return r1
        L_0x00b6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.a.C(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public abstract boolean G(V v);

    /* access modifiers changed from: package-private */
    public final boolean I(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, float f2) {
        V v2 = v;
        Runnable runnable = this.f10649d;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.f10649d = null;
        }
        if (this.f10650e == null) {
            this.f10650e = new OverScroller(v.getContext());
        }
        this.f10650e.fling(0, D(), 0, Math.round(f2), 0, 0, i2, i3);
        if (this.f10650e.computeScrollOffset()) {
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            C0093a aVar = new C0093a(coordinatorLayout, v);
            this.f10649d = aVar;
            t.V(v, aVar);
            return true;
        }
        CoordinatorLayout coordinatorLayout3 = coordinatorLayout;
        M(coordinatorLayout, v);
        return false;
    }

    /* access modifiers changed from: package-private */
    public abstract int J(V v);

    /* access modifiers changed from: package-private */
    public abstract int K(V v);

    /* access modifiers changed from: package-private */
    public abstract int L();

    /* access modifiers changed from: package-private */
    public abstract void M(CoordinatorLayout coordinatorLayout, V v);

    /* access modifiers changed from: package-private */
    public final int N(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4) {
        return P(coordinatorLayout, v, L() - i2, i3, i4);
    }

    /* access modifiers changed from: package-private */
    public int O(CoordinatorLayout coordinatorLayout, V v, int i2) {
        return P(coordinatorLayout, v, i2, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* access modifiers changed from: package-private */
    public abstract int P(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4);

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r0 != 3) goto L_0x0083;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout r5, V r6, android.view.MotionEvent r7) {
        /*
            r4 = this;
            int r0 = r4.i
            if (r0 >= 0) goto L_0x0012
            android.content.Context r0 = r5.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r4.i = r0
        L_0x0012:
            int r0 = r7.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L_0x001f
            boolean r0 = r4.f10651f
            if (r0 == 0) goto L_0x001f
            return r2
        L_0x001f:
            int r0 = r7.getActionMasked()
            r3 = 0
            if (r0 == 0) goto L_0x0060
            r5 = -1
            if (r0 == r2) goto L_0x0051
            if (r0 == r1) goto L_0x002f
            r6 = 3
            if (r0 == r6) goto L_0x0051
            goto L_0x0083
        L_0x002f:
            int r6 = r4.g
            if (r6 != r5) goto L_0x0034
            goto L_0x0083
        L_0x0034:
            int r6 = r7.findPointerIndex(r6)
            if (r6 != r5) goto L_0x003b
            goto L_0x0083
        L_0x003b:
            float r5 = r7.getY(r6)
            int r5 = (int) r5
            int r6 = r4.h
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r0 = r4.i
            if (r6 <= r0) goto L_0x0083
            r4.f10651f = r2
            r4.h = r5
            goto L_0x0083
        L_0x0051:
            r4.f10651f = r3
            r4.g = r5
            android.view.VelocityTracker r5 = r4.j
            if (r5 == 0) goto L_0x0083
            r5.recycle()
            r5 = 0
            r4.j = r5
            goto L_0x0083
        L_0x0060:
            r4.f10651f = r3
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            boolean r2 = r4.G(r6)
            if (r2 == 0) goto L_0x0083
            boolean r5 = r5.F(r6, r0, r1)
            if (r5 == 0) goto L_0x0083
            r4.h = r1
            int r5 = r7.getPointerId(r3)
            r4.g = r5
            r4.H()
        L_0x0083:
            android.view.VelocityTracker r5 = r4.j
            if (r5 == 0) goto L_0x008a
            r5.addMovement(r7)
        L_0x008a:
            boolean r5 = r4.f10651f
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.a.k(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
