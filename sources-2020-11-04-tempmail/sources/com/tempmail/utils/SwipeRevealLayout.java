package com.tempmail.utils;

import a.h.k.u;
import a.j.a.c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.tempmail.j;

@SuppressLint({"RtlHardcoded"})
public class SwipeRevealLayout extends ViewGroup {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public View f13097b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public View f13098c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public Rect f13099d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    private Rect f13100e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private Rect f13101f = new Rect();
    private Rect g = new Rect();
    /* access modifiers changed from: private */
    public int h = 0;
    private boolean i = false;
    /* access modifiers changed from: private */
    public volatile boolean j = false;
    /* access modifiers changed from: private */
    public volatile boolean k = false;
    /* access modifiers changed from: private */
    public int l = 300;
    /* access modifiers changed from: private */
    public int m = 0;
    /* access modifiers changed from: private */
    public int n = 1;
    private final GestureDetector.OnGestureListener o = new a();
    private float p = 0.0f;
    private float q = -1.0f;
    /* access modifiers changed from: private */
    public c r;
    private final c.C0019c s = new b();
    private a.h.k.c t;

    class a extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: b  reason: collision with root package name */
        boolean f13102b = false;

        a() {
        }

        public boolean onDown(MotionEvent motionEvent) {
            boolean unused = SwipeRevealLayout.this.j = false;
            this.f13102b = false;
            return true;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            boolean unused = SwipeRevealLayout.this.j = true;
            return false;
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            boolean z = true;
            boolean unused = SwipeRevealLayout.this.j = true;
            if (SwipeRevealLayout.this.getParent() != null) {
                if (!this.f13102b) {
                    boolean z2 = SwipeRevealLayout.this.getDistToClosestEdge() >= SwipeRevealLayout.this.h;
                    if (z2) {
                        this.f13102b = true;
                    }
                    z = z2;
                }
                SwipeRevealLayout.this.getParent().requestDisallowInterceptTouchEvent(z);
            }
            return false;
        }
    }

    class b extends c.C0019c {
        b() {
        }

        public int a(View view, int i, int i2) {
            int j = SwipeRevealLayout.this.n;
            if (j == 1) {
                return Math.max(Math.min(i, SwipeRevealLayout.this.f13099d.left + SwipeRevealLayout.this.f13098c.getWidth()), SwipeRevealLayout.this.f13099d.left);
            }
            if (j != 2) {
                return view.getLeft();
            }
            return Math.max(Math.min(i, SwipeRevealLayout.this.f13099d.left), SwipeRevealLayout.this.f13099d.left - SwipeRevealLayout.this.f13098c.getWidth());
        }

        public void f(int i, int i2) {
            super.f(i, i2);
            if (!SwipeRevealLayout.this.k) {
                boolean z = false;
                boolean z2 = SwipeRevealLayout.this.n == 2 && i == 1;
                if (SwipeRevealLayout.this.n == 1 && i == 2) {
                    z = true;
                }
                if (z2 || z) {
                    SwipeRevealLayout.this.r.c(SwipeRevealLayout.this.f13097b, i2);
                }
            }
        }

        public void k(View view, int i, int i2, int i3, int i4) {
            super.k(view, i, i2, i3, i4);
            if (SwipeRevealLayout.this.m == 1) {
                if (SwipeRevealLayout.this.n == 1 || SwipeRevealLayout.this.n == 2) {
                    SwipeRevealLayout.this.f13098c.offsetLeftAndRight(i3);
                } else {
                    SwipeRevealLayout.this.f13098c.offsetTopAndBottom(i4);
                }
            }
            u.T(SwipeRevealLayout.this);
        }

        public void l(View view, float f2, float f3) {
            int i = (int) f2;
            boolean z = false;
            boolean z2 = SwipeRevealLayout.this.v(i) >= SwipeRevealLayout.this.l;
            if (SwipeRevealLayout.this.v(i) <= (-SwipeRevealLayout.this.l)) {
                z = true;
            }
            int d2 = SwipeRevealLayout.this.getHalfwayPivotHorizontal();
            int j = SwipeRevealLayout.this.n;
            if (j != 1) {
                if (j == 2) {
                    if (z2) {
                        SwipeRevealLayout.this.o(true);
                    } else if (z) {
                        SwipeRevealLayout.this.u(true);
                    } else if (SwipeRevealLayout.this.f13097b.getRight() < d2) {
                        SwipeRevealLayout.this.u(true);
                    } else {
                        SwipeRevealLayout.this.o(true);
                    }
                }
            } else if (z2) {
                SwipeRevealLayout.this.u(true);
            } else if (z) {
                SwipeRevealLayout.this.o(true);
            } else if (SwipeRevealLayout.this.f13097b.getLeft() < d2) {
                SwipeRevealLayout.this.o(true);
            } else {
                SwipeRevealLayout.this.u(true);
            }
        }

        public boolean m(View view, int i) {
            if (SwipeRevealLayout.this.k) {
                return false;
            }
            SwipeRevealLayout.this.r.c(SwipeRevealLayout.this.f13097b, i);
            return false;
        }
    }

    public SwipeRevealLayout(Context context) {
        super(context);
        q(context, (AttributeSet) null);
    }

    /* access modifiers changed from: private */
    public int getDistToClosestEdge() {
        int i2 = this.n;
        if (i2 == 1) {
            return Math.min(this.f13097b.getLeft() - this.f13099d.left, (this.f13099d.left + this.f13098c.getWidth()) - this.f13097b.getLeft());
        } else if (i2 != 2) {
            return 0;
        } else {
            return Math.min(this.f13097b.getRight() - (this.f13099d.right - this.f13098c.getWidth()), this.f13099d.right - this.f13097b.getRight());
        }
    }

    /* access modifiers changed from: private */
    public int getHalfwayPivotHorizontal() {
        if (this.n == 1) {
            return this.f13099d.left + (this.f13098c.getWidth() / 2);
        }
        return this.f13099d.right - (this.f13098c.getWidth() / 2);
    }

    private int getMainOpenLeft() {
        int i2 = this.n;
        if (i2 == 1) {
            return this.f13099d.left + this.f13098c.getWidth();
        }
        if (i2 != 2) {
            return 0;
        }
        return this.f13099d.left - this.f13098c.getWidth();
    }

    private int getMainOpenTop() {
        int i2 = this.n;
        if (i2 == 1) {
            return this.f13099d.top;
        }
        if (i2 != 2) {
            return 0;
        }
        return this.f13099d.top;
    }

    private int getSecOpenLeft() {
        return this.f13101f.left;
    }

    private int getSecOpenTop() {
        return this.f13101f.top;
    }

    private void n(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.p = 0.0f;
            return;
        }
        this.p += Math.abs(motionEvent.getX() - this.q);
    }

    private boolean p(MotionEvent motionEvent) {
        return t(motionEvent) && !w();
    }

    private void q(Context context, AttributeSet attributeSet) {
        if (!(attributeSet == null || context == null)) {
            int integer = context.getTheme().obtainStyledAttributes(attributeSet, j.SwipeRevealLayout, 0, 0).getInteger(0, 1);
            this.n = integer;
            int i2 = 2;
            if (integer == 3) {
                if (!x.t(context)) {
                    i2 = 1;
                }
                this.n = i2;
            } else if (integer == 4) {
                if (x.t(context)) {
                    i2 = 1;
                }
                this.n = i2;
            }
            this.m = 0;
            this.l = 300;
            this.h = 1;
        }
        c o2 = c.o(this, 1.0f, this.s);
        this.r = o2;
        o2.L(15);
        this.t = new a.h.k.c(context, this.o);
    }

    private void r() {
        this.f13099d.set(this.f13097b.getLeft(), this.f13097b.getTop(), this.f13097b.getRight(), this.f13097b.getBottom());
        this.f13101f.set(this.f13098c.getLeft(), this.f13098c.getTop(), this.f13098c.getRight(), this.f13098c.getBottom());
        this.f13100e.set(getMainOpenLeft(), getMainOpenTop(), getMainOpenLeft() + this.f13097b.getWidth(), getMainOpenTop() + this.f13097b.getHeight());
        this.g.set(getSecOpenLeft(), getSecOpenTop(), getSecOpenLeft() + this.f13098c.getWidth(), getSecOpenTop() + this.f13098c.getHeight());
    }

    private boolean t(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z = ((float) this.f13097b.getTop()) <= y && y <= ((float) this.f13097b.getBottom());
        boolean z2 = ((float) this.f13097b.getLeft()) <= x && x <= ((float) this.f13097b.getRight());
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public int v(int i2) {
        return (int) (((float) i2) / (((float) getContext().getResources().getDisplayMetrics().densityDpi) / 160.0f));
    }

    private boolean w() {
        return this.p >= ((float) this.r.z());
    }

    public void computeScroll() {
        if (this.r.n(true)) {
            u.T(this);
        }
    }

    public void o(boolean z) {
        this.i = false;
        if (z) {
            c cVar = this.r;
            View view = this.f13097b;
            Rect rect = this.f13099d;
            cVar.P(view, rect.left, rect.top);
        } else {
            this.r.a();
            View view2 = this.f13097b;
            Rect rect2 = this.f13099d;
            view2.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
            View view3 = this.f13098c;
            Rect rect3 = this.f13101f;
            view3.layout(rect3.left, rect3.top, rect3.right, rect3.bottom);
        }
        u.T(this);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() >= 2) {
            this.f13098c = getChildAt(0);
            this.f13097b = getChildAt(1);
        } else if (getChildCount() == 1) {
            this.f13097b = getChildAt(0);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (s()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        this.r.F(motionEvent);
        this.t.a(motionEvent);
        n(motionEvent);
        boolean p2 = p(motionEvent);
        boolean z = this.r.A() == 2;
        boolean z2 = this.r.A() == 0 && this.j;
        this.q = motionEvent.getX();
        if (p2 || (!z && !z2)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = 0
            r2 = 0
        L_0x0004:
            int r3 = r16.getChildCount()
            r4 = 2
            r5 = 1
            if (r2 >= r3) goto L_0x00be
            android.view.View r3 = r0.getChildAt(r2)
            int r6 = r16.getPaddingLeft()
            int r7 = r16.getPaddingRight()
            int r7 = r20 - r7
            int r7 = r7 - r18
            int r7 = java.lang.Math.max(r7, r1)
            int r8 = r16.getPaddingTop()
            int r9 = r16.getPaddingBottom()
            int r9 = r21 - r9
            int r9 = r9 - r19
            int r9 = java.lang.Math.max(r9, r1)
            int r10 = r3.getMeasuredHeight()
            int r11 = r3.getMeasuredWidth()
            android.view.ViewGroup$LayoutParams r12 = r3.getLayoutParams()
            if (r12 == 0) goto L_0x0051
            int r13 = r12.height
            r14 = -1
            if (r13 == r14) goto L_0x0048
            if (r13 != r14) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            r13 = 0
            goto L_0x0049
        L_0x0048:
            r13 = 1
        L_0x0049:
            int r15 = r12.width
            if (r15 == r14) goto L_0x004f
            if (r15 != r14) goto L_0x0052
        L_0x004f:
            r14 = 1
            goto L_0x0053
        L_0x0051:
            r13 = 0
        L_0x0052:
            r14 = 0
        L_0x0053:
            if (r13 == 0) goto L_0x0059
            int r10 = r9 - r8
            r12.height = r10
        L_0x0059:
            if (r14 == 0) goto L_0x005f
            int r11 = r7 - r6
            r12.width = r11
        L_0x005f:
            int r8 = r0.n
            if (r8 == r5) goto L_0x0095
            if (r8 == r4) goto L_0x006a
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            goto L_0x00b7
        L_0x006a:
            int r4 = r20 - r11
            int r5 = r16.getPaddingRight()
            int r4 = r4 - r5
            int r4 = r4 - r18
            int r4 = java.lang.Math.max(r4, r6)
            int r5 = r16.getPaddingTop()
            int r5 = java.lang.Math.min(r5, r9)
            int r7 = r16.getPaddingRight()
            int r7 = r20 - r7
            int r7 = r7 - r18
            int r6 = java.lang.Math.max(r7, r6)
            int r7 = r16.getPaddingTop()
            int r10 = r10 + r7
            int r7 = java.lang.Math.min(r10, r9)
            goto L_0x00b7
        L_0x0095:
            int r4 = r16.getPaddingLeft()
            int r4 = java.lang.Math.min(r4, r7)
            int r5 = r16.getPaddingTop()
            int r5 = java.lang.Math.min(r5, r9)
            int r6 = r16.getPaddingLeft()
            int r11 = r11 + r6
            int r6 = java.lang.Math.min(r11, r7)
            int r7 = r16.getPaddingTop()
            int r10 = r10 + r7
            int r7 = java.lang.Math.min(r10, r9)
        L_0x00b7:
            r3.layout(r4, r5, r6, r7)
            int r2 = r2 + 1
            goto L_0x0004
        L_0x00be:
            int r2 = r0.m
            if (r2 != r5) goto L_0x00dd
            int r2 = r0.n
            if (r2 == r5) goto L_0x00d3
            if (r2 == r4) goto L_0x00c9
            goto L_0x00dd
        L_0x00c9:
            android.view.View r2 = r0.f13098c
            int r3 = r2.getWidth()
            r2.offsetLeftAndRight(r3)
            goto L_0x00dd
        L_0x00d3:
            android.view.View r2 = r0.f13098c
            int r3 = r2.getWidth()
            int r3 = -r3
            r2.offsetLeftAndRight(r3)
        L_0x00dd:
            r16.r()
            boolean r2 = r0.i
            if (r2 == 0) goto L_0x00e8
            r0.u(r1)
            goto L_0x00eb
        L_0x00e8:
            r0.o(r1)
        L_0x00eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tempmail.utils.SwipeRevealLayout.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        if (getChildCount() >= 2) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < getChildCount(); i6++) {
                View childAt = getChildAt(i6);
                measureChild(childAt, i2, i3);
                i4 = Math.max(childAt.getMeasuredWidth(), i4);
                i5 = Math.max(childAt.getMeasuredHeight(), i5);
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, mode);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, mode2);
            int size = View.MeasureSpec.getSize(makeMeasureSpec);
            int size2 = View.MeasureSpec.getSize(makeMeasureSpec2);
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt2 = getChildAt(i7);
                ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                if (layoutParams2 != null) {
                    if (layoutParams2.height == -1) {
                        childAt2.setMinimumHeight(size2);
                    }
                    if (layoutParams2.width == -1) {
                        childAt2.setMinimumWidth(size);
                    }
                }
                measureChild(childAt2, makeMeasureSpec, makeMeasureSpec2);
                i4 = Math.max(childAt2.getMeasuredWidth(), i4);
                i5 = Math.max(childAt2.getMeasuredHeight(), i5);
            }
            int paddingLeft = i4 + getPaddingLeft() + getPaddingRight();
            int paddingTop = i5 + getPaddingTop() + getPaddingBottom();
            if (mode != 1073741824) {
                if (layoutParams.width == -1) {
                    paddingLeft = size;
                }
                if (mode != Integer.MIN_VALUE || paddingLeft <= size) {
                    size = paddingLeft;
                }
            }
            if (mode2 != 1073741824) {
                if (layoutParams.height == -1) {
                    paddingTop = size2;
                }
                if (mode2 != Integer.MIN_VALUE || paddingTop <= size2) {
                    size2 = paddingTop;
                }
            }
            setMeasuredDimension(size, size2);
            return;
        }
        throw new RuntimeException("Layout must have two children");
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(((Bundle) parcelable).getParcelable("saved_instance_state_parcelable"));
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        new Bundle().putParcelable("saved_instance_state_parcelable", super.onSaveInstanceState());
        return super.onSaveInstanceState();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.t.a(motionEvent);
        this.r.F(motionEvent);
        return true;
    }

    public boolean s() {
        return this.k;
    }

    public void u(boolean z) {
        this.i = true;
        if (z) {
            c cVar = this.r;
            View view = this.f13097b;
            Rect rect = this.f13100e;
            cVar.P(view, rect.left, rect.top);
        } else {
            this.r.a();
            View view2 = this.f13097b;
            Rect rect2 = this.f13100e;
            view2.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
            View view3 = this.f13098c;
            Rect rect3 = this.g;
            view3.layout(rect3.left, rect3.top, rect3.right, rect3.bottom);
        }
        u.T(this);
    }

    public SwipeRevealLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q(context, attributeSet);
    }

    public SwipeRevealLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
