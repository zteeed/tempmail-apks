package androidx.appcompat.widget;

import a.a.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public class LinearLayoutCompat extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    private boolean f1003b;

    /* renamed from: c  reason: collision with root package name */
    private int f1004c;

    /* renamed from: d  reason: collision with root package name */
    private int f1005d;

    /* renamed from: e  reason: collision with root package name */
    private int f1006e;

    /* renamed from: f  reason: collision with root package name */
    private int f1007f;
    private int g;
    private float h;
    private boolean i;
    private int[] j;
    private int[] k;
    private Drawable l;
    private int m;
    private int n;
    private int o;
    private int p;

    public LinearLayoutCompat(Context context) {
        this(context, (AttributeSet) null);
    }

    private void A(View view, int i2, int i3, int i4, int i5) {
        view.layout(i2, i3, i4 + i2, i5 + i3);
    }

    private void k(int i2, int i3) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i4 = 0; i4 < i2; i4++) {
            View s = s(i4);
            if (s.getVisibility() != 8) {
                a aVar = (a) s.getLayoutParams();
                if (aVar.height == -1) {
                    int i5 = aVar.width;
                    aVar.width = s.getMeasuredWidth();
                    measureChildWithMargins(s, i3, 0, makeMeasureSpec, 0);
                    aVar.width = i5;
                }
            }
        }
    }

    private void l(int i2, int i3) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i4 = 0; i4 < i2; i4++) {
            View s = s(i4);
            if (s.getVisibility() != 8) {
                a aVar = (a) s.getLayoutParams();
                if (aVar.width == -1) {
                    int i5 = aVar.height;
                    aVar.height = s.getMeasuredHeight();
                    measureChildWithMargins(s, makeMeasureSpec, 0, i3, 0);
                    aVar.height = i5;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    /* access modifiers changed from: package-private */
    public void g(Canvas canvas) {
        int i2;
        int i3;
        int i4;
        int i5;
        int virtualChildCount = getVirtualChildCount();
        boolean b2 = h0.b(this);
        for (int i6 = 0; i6 < virtualChildCount; i6++) {
            View s = s(i6);
            if (!(s == null || s.getVisibility() == 8 || !t(i6))) {
                a aVar = (a) s.getLayoutParams();
                if (b2) {
                    i5 = s.getRight() + aVar.rightMargin;
                } else {
                    i5 = (s.getLeft() - aVar.leftMargin) - this.m;
                }
                j(canvas, i5);
            }
        }
        if (t(virtualChildCount)) {
            View s2 = s(virtualChildCount - 1);
            if (s2 != null) {
                a aVar2 = (a) s2.getLayoutParams();
                if (b2) {
                    i4 = s2.getLeft() - aVar2.leftMargin;
                    i3 = this.m;
                } else {
                    i2 = s2.getRight() + aVar2.rightMargin;
                    j(canvas, i2);
                }
            } else if (b2) {
                i2 = getPaddingLeft();
                j(canvas, i2);
            } else {
                i4 = getWidth() - getPaddingRight();
                i3 = this.m;
            }
            i2 = i4 - i3;
            j(canvas, i2);
        }
    }

    public int getBaseline() {
        int i2;
        if (this.f1004c < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.f1004c;
        if (childCount > i3) {
            View childAt = getChildAt(i3);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i4 = this.f1005d;
                if (this.f1006e == 1 && (i2 = this.f1007f & 112) != 48) {
                    if (i2 == 16) {
                        i4 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.g) / 2;
                    } else if (i2 == 80) {
                        i4 = ((getBottom() - getTop()) - getPaddingBottom()) - this.g;
                    }
                }
                return i4 + ((a) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.f1004c == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1004c;
    }

    public Drawable getDividerDrawable() {
        return this.l;
    }

    public int getDividerPadding() {
        return this.p;
    }

    public int getDividerWidth() {
        return this.m;
    }

    public int getGravity() {
        return this.f1007f;
    }

    public int getOrientation() {
        return this.f1006e;
    }

    public int getShowDividers() {
        return this.o;
    }

    /* access modifiers changed from: package-private */
    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public void h(Canvas canvas) {
        int i2;
        int virtualChildCount = getVirtualChildCount();
        for (int i3 = 0; i3 < virtualChildCount; i3++) {
            View s = s(i3);
            if (!(s == null || s.getVisibility() == 8 || !t(i3))) {
                i(canvas, (s.getTop() - ((a) s.getLayoutParams()).topMargin) - this.n);
            }
        }
        if (t(virtualChildCount)) {
            View s2 = s(virtualChildCount - 1);
            if (s2 == null) {
                i2 = (getHeight() - getPaddingBottom()) - this.n;
            } else {
                i2 = s2.getBottom() + ((a) s2.getLayoutParams()).bottomMargin;
            }
            i(canvas, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void i(Canvas canvas, int i2) {
        this.l.setBounds(getPaddingLeft() + this.p, i2, (getWidth() - getPaddingRight()) - this.p, this.n + i2);
        this.l.draw(canvas);
    }

    /* access modifiers changed from: package-private */
    public void j(Canvas canvas, int i2) {
        this.l.setBounds(i2, getPaddingTop() + this.p, this.m + i2, (getHeight() - getPaddingBottom()) - this.p);
        this.l.draw(canvas);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public a generateDefaultLayoutParams() {
        int i2 = this.f1006e;
        if (i2 == 0) {
            return new a(-2, -2);
        }
        if (i2 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    /* renamed from: n */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.l != null) {
            if (this.f1006e == 1) {
                h(canvas);
            } else {
                g(canvas);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(LinearLayoutCompat.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(LinearLayoutCompat.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (this.f1006e == 1) {
            v(i2, i3, i4, i5);
        } else {
            u(i2, i3, i4, i5);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        if (this.f1006e == 1) {
            z(i2, i3);
        } else {
            x(i2, i3);
        }
    }

    /* access modifiers changed from: package-private */
    public int p(View view, int i2) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int q(View view) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int r(View view) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public View s(int i2) {
        return getChildAt(i2);
    }

    public void setBaselineAligned(boolean z) {
        this.f1003b = z;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 < 0 || i2 >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.f1004c = i2;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.l) {
            this.l = drawable;
            boolean z = false;
            if (drawable != null) {
                this.m = drawable.getIntrinsicWidth();
                this.n = drawable.getIntrinsicHeight();
            } else {
                this.m = 0;
                this.n = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i2) {
        this.p = i2;
    }

    public void setGravity(int i2) {
        if (this.f1007f != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f1007f = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        int i4 = this.f1007f;
        if ((8388615 & i4) != i3) {
            this.f1007f = i3 | (-8388616 & i4);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.i = z;
    }

    public void setOrientation(int i2) {
        if (this.f1006e != i2) {
            this.f1006e = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.o) {
            requestLayout();
        }
        this.o = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & 112;
        int i4 = this.f1007f;
        if ((i4 & 112) != i3) {
            this.f1007f = i3 | (i4 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.h = Math.max(0.0f, f2);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean t(int i2) {
        if (i2 == 0) {
            return (this.o & 1) != 0;
        }
        if (i2 == getChildCount()) {
            if ((this.o & 4) != 0) {
                return true;
            }
            return false;
        } else if ((this.o & 2) == 0) {
            return false;
        } else {
            for (int i3 = i2 - 1; i3 >= 0; i3--) {
                if (getChildAt(i3).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void u(int r25, int r26, int r27, int r28) {
        /*
            r24 = this;
            r6 = r24
            boolean r0 = androidx.appcompat.widget.h0.b(r24)
            int r7 = r24.getPaddingTop()
            int r1 = r28 - r26
            int r2 = r24.getPaddingBottom()
            int r8 = r1 - r2
            int r1 = r1 - r7
            int r2 = r24.getPaddingBottom()
            int r9 = r1 - r2
            int r10 = r24.getVirtualChildCount()
            int r1 = r6.f1007f
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r1
            r11 = r1 & 112(0x70, float:1.57E-43)
            boolean r12 = r6.f1003b
            int[] r13 = r6.j
            int[] r14 = r6.k
            int r1 = a.h.k.u.t(r24)
            int r1 = a.h.k.d.b(r2, r1)
            r15 = 2
            r5 = 1
            if (r1 == r5) goto L_0x004b
            r2 = 5
            if (r1 == r2) goto L_0x003f
            int r1 = r24.getPaddingLeft()
            goto L_0x0056
        L_0x003f:
            int r1 = r24.getPaddingLeft()
            int r1 = r1 + r27
            int r1 = r1 - r25
            int r2 = r6.g
            int r1 = r1 - r2
            goto L_0x0056
        L_0x004b:
            int r1 = r24.getPaddingLeft()
            int r2 = r27 - r25
            int r3 = r6.g
            int r2 = r2 - r3
            int r2 = r2 / r15
            int r1 = r1 + r2
        L_0x0056:
            r2 = 0
            if (r0 == 0) goto L_0x0060
            int r0 = r10 + -1
            r16 = r0
            r17 = -1
            goto L_0x0064
        L_0x0060:
            r16 = 0
            r17 = 1
        L_0x0064:
            r3 = 0
        L_0x0065:
            if (r3 >= r10) goto L_0x013f
            int r0 = r17 * r3
            int r2 = r16 + r0
            android.view.View r0 = r6.s(r2)
            if (r0 != 0) goto L_0x0078
            int r0 = r6.y(r2)
            int r1 = r1 + r0
            goto L_0x0129
        L_0x0078:
            int r5 = r0.getVisibility()
            r15 = 8
            if (r5 == r15) goto L_0x0127
            int r15 = r0.getMeasuredWidth()
            int r5 = r0.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r18 = r0.getLayoutParams()
            r4 = r18
            androidx.appcompat.widget.LinearLayoutCompat$a r4 = (androidx.appcompat.widget.LinearLayoutCompat.a) r4
            r18 = r3
            if (r12 == 0) goto L_0x00a0
            int r3 = r4.height
            r19 = r10
            r10 = -1
            if (r3 == r10) goto L_0x00a2
            int r10 = r0.getBaseline()
            goto L_0x00a3
        L_0x00a0:
            r19 = r10
        L_0x00a2:
            r10 = -1
        L_0x00a3:
            int r3 = r4.f1009b
            if (r3 >= 0) goto L_0x00a8
            r3 = r11
        L_0x00a8:
            r3 = r3 & 112(0x70, float:1.57E-43)
            r20 = r11
            r11 = 16
            if (r3 == r11) goto L_0x00e3
            r11 = 48
            if (r3 == r11) goto L_0x00d1
            r11 = 80
            if (r3 == r11) goto L_0x00bb
            r3 = r7
            r11 = -1
            goto L_0x00e0
        L_0x00bb:
            int r3 = r8 - r5
            int r11 = r4.bottomMargin
            int r3 = r3 - r11
            r11 = -1
            if (r10 == r11) goto L_0x00e0
            int r21 = r0.getMeasuredHeight()
            int r21 = r21 - r10
            r10 = 2
            r22 = r14[r10]
            int r22 = r22 - r21
            int r3 = r3 - r22
            goto L_0x00e0
        L_0x00d1:
            r11 = -1
            int r3 = r4.topMargin
            int r3 = r3 + r7
            if (r10 == r11) goto L_0x00e0
            r21 = 1
            r22 = r13[r21]
            int r22 = r22 - r10
            int r3 = r3 + r22
            goto L_0x00f1
        L_0x00e0:
            r21 = 1
            goto L_0x00f1
        L_0x00e3:
            r11 = -1
            r21 = 1
            int r3 = r9 - r5
            r10 = 2
            int r3 = r3 / r10
            int r3 = r3 + r7
            int r10 = r4.topMargin
            int r3 = r3 + r10
            int r10 = r4.bottomMargin
            int r3 = r3 - r10
        L_0x00f1:
            boolean r10 = r6.t(r2)
            if (r10 == 0) goto L_0x00fa
            int r10 = r6.m
            int r1 = r1 + r10
        L_0x00fa:
            int r10 = r4.leftMargin
            int r10 = r10 + r1
            int r1 = r6.q(r0)
            int r22 = r10 + r1
            r1 = r0
            r0 = r24
            r25 = r1
            r11 = r2
            r2 = r22
            r22 = r7
            r23 = -1
            r7 = r4
            r4 = r15
            r0.A(r1, r2, r3, r4, r5)
            int r0 = r7.rightMargin
            int r15 = r15 + r0
            r0 = r25
            int r1 = r6.r(r0)
            int r15 = r15 + r1
            int r10 = r10 + r15
            int r0 = r6.p(r0, r11)
            int r3 = r18 + r0
            r1 = r10
            goto L_0x0133
        L_0x0127:
            r18 = r3
        L_0x0129:
            r22 = r7
            r19 = r10
            r20 = r11
            r21 = 1
            r23 = -1
        L_0x0133:
            int r3 = r3 + 1
            r10 = r19
            r11 = r20
            r7 = r22
            r5 = 1
            r15 = 2
            goto L_0x0065
        L_0x013f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.u(int, int, int, int):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void v(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r20 - r18
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r10 = r17.getVirtualChildCount()
            int r0 = r6.f1007f
            r1 = r0 & 112(0x70, float:1.57E-43)
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r0 & r2
            r0 = 16
            if (r1 == r0) goto L_0x003b
            r0 = 80
            if (r1 == r0) goto L_0x002f
            int r0 = r17.getPaddingTop()
            goto L_0x0047
        L_0x002f:
            int r0 = r17.getPaddingTop()
            int r0 = r0 + r21
            int r0 = r0 - r19
            int r1 = r6.g
            int r0 = r0 - r1
            goto L_0x0047
        L_0x003b:
            int r0 = r17.getPaddingTop()
            int r1 = r21 - r19
            int r2 = r6.g
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L_0x0047:
            r1 = 0
            r12 = 0
        L_0x0049:
            if (r12 >= r10) goto L_0x00c8
            android.view.View r13 = r6.s(r12)
            r14 = 1
            if (r13 != 0) goto L_0x0059
            int r1 = r6.y(r12)
            int r0 = r0 + r1
            goto L_0x00c5
        L_0x0059:
            int r1 = r13.getVisibility()
            r2 = 8
            if (r1 == r2) goto L_0x00c5
            int r4 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            r5 = r1
            androidx.appcompat.widget.LinearLayoutCompat$a r5 = (androidx.appcompat.widget.LinearLayoutCompat.a) r5
            int r1 = r5.f1009b
            if (r1 >= 0) goto L_0x0075
            r1 = r11
        L_0x0075:
            int r2 = a.h.k.u.t(r17)
            int r1 = a.h.k.d.b(r1, r2)
            r1 = r1 & 7
            if (r1 == r14) goto L_0x008d
            r2 = 5
            if (r1 == r2) goto L_0x0088
            int r1 = r5.leftMargin
            int r1 = r1 + r7
            goto L_0x0098
        L_0x0088:
            int r1 = r8 - r4
            int r2 = r5.rightMargin
            goto L_0x0097
        L_0x008d:
            int r1 = r9 - r4
            int r1 = r1 / 2
            int r1 = r1 + r7
            int r2 = r5.leftMargin
            int r1 = r1 + r2
            int r2 = r5.rightMargin
        L_0x0097:
            int r1 = r1 - r2
        L_0x0098:
            r2 = r1
            boolean r1 = r6.t(r12)
            if (r1 == 0) goto L_0x00a2
            int r1 = r6.n
            int r0 = r0 + r1
        L_0x00a2:
            int r1 = r5.topMargin
            int r16 = r0 + r1
            int r0 = r6.q(r13)
            int r3 = r16 + r0
            r0 = r17
            r1 = r13
            r14 = r5
            r5 = r15
            r0.A(r1, r2, r3, r4, r5)
            int r0 = r14.bottomMargin
            int r15 = r15 + r0
            int r0 = r6.r(r13)
            int r15 = r15 + r0
            int r16 = r16 + r15
            int r0 = r6.p(r13, r12)
            int r12 = r12 + r0
            r0 = r16
        L_0x00c5:
            r1 = 1
            int r12 = r12 + r1
            goto L_0x0049
        L_0x00c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.v(int, int, int, int):void");
    }

    /* access modifiers changed from: package-private */
    public void w(View view, int i2, int i3, int i4, int i5, int i6) {
        measureChildWithMargins(view, i3, i4, i5, i6);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x044f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void x(int r38, int r39) {
        /*
            r37 = this;
            r7 = r37
            r8 = r38
            r9 = r39
            r10 = 0
            r7.g = r10
            int r11 = r37.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r38)
            int r13 = android.view.View.MeasureSpec.getMode(r39)
            int[] r0 = r7.j
            r14 = 4
            if (r0 == 0) goto L_0x001e
            int[] r0 = r7.k
            if (r0 != 0) goto L_0x0026
        L_0x001e:
            int[] r0 = new int[r14]
            r7.j = r0
            int[] r0 = new int[r14]
            r7.k = r0
        L_0x0026:
            int[] r15 = r7.j
            int[] r6 = r7.k
            r16 = 3
            r5 = -1
            r15[r16] = r5
            r17 = 2
            r15[r17] = r5
            r18 = 1
            r15[r18] = r5
            r15[r10] = r5
            r6[r16] = r5
            r6[r17] = r5
            r6[r18] = r5
            r6[r10] = r5
            boolean r4 = r7.f1003b
            boolean r3 = r7.i
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 != r2) goto L_0x004c
            r19 = 1
            goto L_0x004e
        L_0x004c:
            r19 = 0
        L_0x004e:
            r20 = 0
            r0 = 0
            r1 = 0
            r14 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 1
            r27 = 0
        L_0x0061:
            r28 = r6
            r5 = 8
            if (r1 >= r11) goto L_0x01ff
            android.view.View r6 = r7.s(r1)
            if (r6 != 0) goto L_0x007f
            int r5 = r7.g
            int r6 = r7.y(r1)
            int r5 = r5 + r6
            r7.g = r5
        L_0x0076:
            r2 = r1
            r32 = r3
            r36 = r4
            r1 = 1073741824(0x40000000, float:2.0)
            goto L_0x01ee
        L_0x007f:
            int r10 = r6.getVisibility()
            if (r10 != r5) goto L_0x008b
            int r5 = r7.p(r6, r1)
            int r1 = r1 + r5
            goto L_0x0076
        L_0x008b:
            boolean r5 = r7.t(r1)
            if (r5 == 0) goto L_0x0098
            int r5 = r7.g
            int r10 = r7.m
            int r5 = r5 + r10
            r7.g = r5
        L_0x0098:
            android.view.ViewGroup$LayoutParams r5 = r6.getLayoutParams()
            r10 = r5
            androidx.appcompat.widget.LinearLayoutCompat$a r10 = (androidx.appcompat.widget.LinearLayoutCompat.a) r10
            float r5 = r10.f1008a
            float r31 = r0 + r5
            if (r12 != r2) goto L_0x00ec
            int r0 = r10.width
            if (r0 != 0) goto L_0x00ec
            int r0 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ec
            if (r19 == 0) goto L_0x00ba
            int r0 = r7.g
            int r5 = r10.leftMargin
            int r2 = r10.rightMargin
            int r5 = r5 + r2
            int r0 = r0 + r5
            r7.g = r0
            goto L_0x00c8
        L_0x00ba:
            int r0 = r7.g
            int r2 = r10.leftMargin
            int r2 = r2 + r0
            int r5 = r10.rightMargin
            int r2 = r2 + r5
            int r0 = java.lang.Math.max(r0, r2)
            r7.g = r0
        L_0x00c8:
            if (r4 == 0) goto L_0x00dd
            r0 = 0
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r6.measure(r2, r2)
            r34 = r1
            r32 = r3
            r36 = r4
            r3 = r6
            r30 = -2
            goto L_0x0168
        L_0x00dd:
            r34 = r1
            r32 = r3
            r36 = r4
            r3 = r6
            r1 = 1073741824(0x40000000, float:2.0)
            r24 = 1
            r30 = -2
            goto L_0x016a
        L_0x00ec:
            int r0 = r10.width
            if (r0 != 0) goto L_0x00fb
            float r0 = r10.f1008a
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x00fb
            r5 = -2
            r10.width = r5
            r2 = 0
            goto L_0x00fe
        L_0x00fb:
            r5 = -2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00fe:
            int r0 = (r31 > r20 ? 1 : (r31 == r20 ? 0 : -1))
            if (r0 != 0) goto L_0x0107
            int r0 = r7.g
            r29 = r0
            goto L_0x0109
        L_0x0107:
            r29 = 0
        L_0x0109:
            r33 = 0
            r0 = r37
            r34 = r1
            r1 = r6
            r35 = r2
            r2 = r34
            r32 = r3
            r3 = r38
            r36 = r4
            r4 = r29
            r9 = -1
            r29 = -2
            r5 = r39
            r29 = r6
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r30 = -2
            r6 = r33
            r0.w(r1, r2, r3, r4, r5, r6)
            r0 = r35
            if (r0 == r9) goto L_0x0132
            r10.width = r0
        L_0x0132:
            int r0 = r29.getMeasuredWidth()
            if (r19 == 0) goto L_0x014b
            int r1 = r7.g
            int r2 = r10.leftMargin
            int r2 = r2 + r0
            int r3 = r10.rightMargin
            int r2 = r2 + r3
            r3 = r29
            int r4 = r7.r(r3)
            int r2 = r2 + r4
            int r1 = r1 + r2
            r7.g = r1
            goto L_0x0162
        L_0x014b:
            r3 = r29
            int r1 = r7.g
            int r2 = r1 + r0
            int r4 = r10.leftMargin
            int r2 = r2 + r4
            int r4 = r10.rightMargin
            int r2 = r2 + r4
            int r4 = r7.r(r3)
            int r2 = r2 + r4
            int r1 = java.lang.Math.max(r1, r2)
            r7.g = r1
        L_0x0162:
            if (r32 == 0) goto L_0x0168
            int r14 = java.lang.Math.max(r0, r14)
        L_0x0168:
            r1 = 1073741824(0x40000000, float:2.0)
        L_0x016a:
            if (r13 == r1) goto L_0x0175
            int r0 = r10.height
            r2 = -1
            if (r0 != r2) goto L_0x0175
            r0 = 1
            r27 = 1
            goto L_0x0176
        L_0x0175:
            r0 = 0
        L_0x0176:
            int r2 = r10.topMargin
            int r4 = r10.bottomMargin
            int r2 = r2 + r4
            int r4 = r3.getMeasuredHeight()
            int r4 = r4 + r2
            int r5 = r3.getMeasuredState()
            r6 = r25
            int r25 = android.view.View.combineMeasuredStates(r6, r5)
            if (r36 == 0) goto L_0x01b3
            int r5 = r3.getBaseline()
            r6 = -1
            if (r5 == r6) goto L_0x01b3
            int r6 = r10.f1009b
            if (r6 >= 0) goto L_0x0199
            int r6 = r7.f1007f
        L_0x0199:
            r6 = r6 & 112(0x70, float:1.57E-43)
            r9 = 4
            int r6 = r6 >> r9
            r6 = r6 & -2
            int r6 = r6 >> 1
            r9 = r15[r6]
            int r9 = java.lang.Math.max(r9, r5)
            r15[r6] = r9
            r9 = r28[r6]
            int r5 = r4 - r5
            int r5 = java.lang.Math.max(r9, r5)
            r28[r6] = r5
        L_0x01b3:
            r5 = r21
            int r21 = java.lang.Math.max(r5, r4)
            if (r26 == 0) goto L_0x01c3
            int r5 = r10.height
            r6 = -1
            if (r5 != r6) goto L_0x01c3
            r26 = 1
            goto L_0x01c5
        L_0x01c3:
            r26 = 0
        L_0x01c5:
            float r5 = r10.f1008a
            int r5 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r5 <= 0) goto L_0x01d6
            if (r0 == 0) goto L_0x01ce
            goto L_0x01cf
        L_0x01ce:
            r2 = r4
        L_0x01cf:
            r10 = r23
            int r23 = java.lang.Math.max(r10, r2)
            goto L_0x01e4
        L_0x01d6:
            r10 = r23
            if (r0 == 0) goto L_0x01db
            goto L_0x01dc
        L_0x01db:
            r2 = r4
        L_0x01dc:
            r4 = r22
            int r22 = java.lang.Math.max(r4, r2)
            r23 = r10
        L_0x01e4:
            r10 = r34
            int r0 = r7.p(r3, r10)
            int r0 = r0 + r10
            r2 = r0
            r0 = r31
        L_0x01ee:
            int r2 = r2 + 1
            r9 = r39
            r1 = r2
            r6 = r28
            r3 = r32
            r4 = r36
            r2 = 1073741824(0x40000000, float:2.0)
            r5 = -1
            r10 = 0
            goto L_0x0061
        L_0x01ff:
            r32 = r3
            r36 = r4
            r2 = r21
            r4 = r22
            r10 = r23
            r6 = r25
            r1 = 1073741824(0x40000000, float:2.0)
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r30 = -2
            int r3 = r7.g
            if (r3 <= 0) goto L_0x0222
            boolean r3 = r7.t(r11)
            if (r3 == 0) goto L_0x0222
            int r3 = r7.g
            int r1 = r7.m
            int r3 = r3 + r1
            r7.g = r3
        L_0x0222:
            r1 = r15[r18]
            r3 = -1
            if (r1 != r3) goto L_0x0239
            r1 = 0
            r5 = r15[r1]
            if (r5 != r3) goto L_0x0239
            r1 = r15[r17]
            if (r1 != r3) goto L_0x0239
            r1 = r15[r16]
            if (r1 == r3) goto L_0x0235
            goto L_0x0239
        L_0x0235:
            r1 = r2
            r23 = r6
            goto L_0x026a
        L_0x0239:
            r1 = r15[r16]
            r3 = 0
            r5 = r15[r3]
            r9 = r15[r18]
            r3 = r15[r17]
            int r3 = java.lang.Math.max(r9, r3)
            int r3 = java.lang.Math.max(r5, r3)
            int r1 = java.lang.Math.max(r1, r3)
            r3 = r28[r16]
            r5 = 0
            r9 = r28[r5]
            r5 = r28[r18]
            r23 = r6
            r6 = r28[r17]
            int r5 = java.lang.Math.max(r5, r6)
            int r5 = java.lang.Math.max(r9, r5)
            int r3 = java.lang.Math.max(r3, r5)
            int r1 = r1 + r3
            int r1 = java.lang.Math.max(r2, r1)
        L_0x026a:
            if (r32 == 0) goto L_0x02cd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r12 == r2) goto L_0x0272
            if (r12 != 0) goto L_0x02cd
        L_0x0272:
            r2 = 0
            r7.g = r2
            r2 = 0
        L_0x0276:
            if (r2 >= r11) goto L_0x02cd
            android.view.View r3 = r7.s(r2)
            if (r3 != 0) goto L_0x0288
            int r3 = r7.g
            int r5 = r7.y(r2)
            int r3 = r3 + r5
            r7.g = r3
            goto L_0x0295
        L_0x0288:
            int r5 = r3.getVisibility()
            r6 = 8
            if (r5 != r6) goto L_0x0298
            int r3 = r7.p(r3, r2)
            int r2 = r2 + r3
        L_0x0295:
            r22 = r1
            goto L_0x02c8
        L_0x0298:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$a r5 = (androidx.appcompat.widget.LinearLayoutCompat.a) r5
            if (r19 == 0) goto L_0x02b1
            int r6 = r7.g
            int r9 = r5.leftMargin
            int r9 = r9 + r14
            int r5 = r5.rightMargin
            int r9 = r9 + r5
            int r3 = r7.r(r3)
            int r9 = r9 + r3
            int r6 = r6 + r9
            r7.g = r6
            goto L_0x0295
        L_0x02b1:
            int r6 = r7.g
            int r9 = r6 + r14
            r22 = r1
            int r1 = r5.leftMargin
            int r9 = r9 + r1
            int r1 = r5.rightMargin
            int r9 = r9 + r1
            int r1 = r7.r(r3)
            int r9 = r9 + r1
            int r1 = java.lang.Math.max(r6, r9)
            r7.g = r1
        L_0x02c8:
            int r2 = r2 + 1
            r1 = r22
            goto L_0x0276
        L_0x02cd:
            r22 = r1
            int r1 = r7.g
            int r2 = r37.getPaddingLeft()
            int r3 = r37.getPaddingRight()
            int r2 = r2 + r3
            int r1 = r1 + r2
            r7.g = r1
            int r2 = r37.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r1, r2)
            r2 = 0
            int r1 = android.view.View.resolveSizeAndState(r1, r8, r2)
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r1
            int r3 = r7.g
            int r2 = r2 - r3
            if (r24 != 0) goto L_0x033e
            if (r2 == 0) goto L_0x02fa
            int r5 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r5 <= 0) goto L_0x02fa
            goto L_0x033e
        L_0x02fa:
            int r0 = java.lang.Math.max(r4, r10)
            if (r32 == 0) goto L_0x0336
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 == r2) goto L_0x0336
            r10 = 0
        L_0x0305:
            if (r10 >= r11) goto L_0x0336
            android.view.View r2 = r7.s(r10)
            if (r2 == 0) goto L_0x0333
            int r4 = r2.getVisibility()
            r5 = 8
            if (r4 != r5) goto L_0x0316
            goto L_0x0333
        L_0x0316:
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$a r4 = (androidx.appcompat.widget.LinearLayoutCompat.a) r4
            float r4 = r4.f1008a
            int r4 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r4 <= 0) goto L_0x0333
            r4 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r4)
            int r6 = r2.getMeasuredHeight()
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r4)
            r2.measure(r5, r6)
        L_0x0333:
            int r10 = r10 + 1
            goto L_0x0305
        L_0x0336:
            r2 = r39
            r25 = r11
            r3 = r22
            goto L_0x04d8
        L_0x033e:
            float r5 = r7.h
            int r6 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r6 <= 0) goto L_0x0345
            r0 = r5
        L_0x0345:
            r5 = -1
            r15[r16] = r5
            r15[r17] = r5
            r15[r18] = r5
            r6 = 0
            r15[r6] = r5
            r28[r16] = r5
            r28[r17] = r5
            r28[r18] = r5
            r28[r6] = r5
            r7.g = r6
            r6 = r4
            r9 = r23
            r4 = -1
            r10 = 0
        L_0x035e:
            if (r10 >= r11) goto L_0x047f
            android.view.View r14 = r7.s(r10)
            if (r14 == 0) goto L_0x0470
            int r5 = r14.getVisibility()
            r3 = 8
            if (r5 != r3) goto L_0x0370
            goto L_0x0470
        L_0x0370:
            android.view.ViewGroup$LayoutParams r5 = r14.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$a r5 = (androidx.appcompat.widget.LinearLayoutCompat.a) r5
            float r3 = r5.f1008a
            int r23 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r23 <= 0) goto L_0x03d9
            float r8 = (float) r2
            float r8 = r8 * r3
            float r8 = r8 / r0
            int r8 = (int) r8
            float r0 = r0 - r3
            int r2 = r2 - r8
            int r3 = r37.getPaddingTop()
            int r23 = r37.getPaddingBottom()
            int r3 = r3 + r23
            r23 = r0
            int r0 = r5.topMargin
            int r3 = r3 + r0
            int r0 = r5.bottomMargin
            int r3 = r3 + r0
            int r0 = r5.height
            r24 = r2
            r25 = r11
            r11 = -1
            r2 = r39
            int r0 = android.view.ViewGroup.getChildMeasureSpec(r2, r3, r0)
            int r3 = r5.width
            if (r3 != 0) goto L_0x03b7
            r3 = 1073741824(0x40000000, float:2.0)
            if (r12 == r3) goto L_0x03ab
            goto L_0x03b9
        L_0x03ab:
            if (r8 <= 0) goto L_0x03ae
            goto L_0x03af
        L_0x03ae:
            r8 = 0
        L_0x03af:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r3)
            r14.measure(r8, r0)
            goto L_0x03c9
        L_0x03b7:
            r3 = 1073741824(0x40000000, float:2.0)
        L_0x03b9:
            int r29 = r14.getMeasuredWidth()
            int r8 = r29 + r8
            if (r8 >= 0) goto L_0x03c2
            r8 = 0
        L_0x03c2:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r3)
            r14.measure(r8, r0)
        L_0x03c9:
            int r0 = r14.getMeasuredState()
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r3
            int r9 = android.view.View.combineMeasuredStates(r9, r0)
            r0 = r23
            r3 = r24
            goto L_0x03df
        L_0x03d9:
            r3 = r2
            r25 = r11
            r11 = -1
            r2 = r39
        L_0x03df:
            if (r19 == 0) goto L_0x03fc
            int r8 = r7.g
            int r23 = r14.getMeasuredWidth()
            int r11 = r5.leftMargin
            int r23 = r23 + r11
            int r11 = r5.rightMargin
            int r23 = r23 + r11
            int r11 = r7.r(r14)
            int r23 = r23 + r11
            int r8 = r8 + r23
            r7.g = r8
            r23 = r0
            goto L_0x0416
        L_0x03fc:
            int r8 = r7.g
            int r11 = r14.getMeasuredWidth()
            int r11 = r11 + r8
            r23 = r0
            int r0 = r5.leftMargin
            int r11 = r11 + r0
            int r0 = r5.rightMargin
            int r11 = r11 + r0
            int r0 = r7.r(r14)
            int r11 = r11 + r0
            int r0 = java.lang.Math.max(r8, r11)
            r7.g = r0
        L_0x0416:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r13 == r0) goto L_0x0421
            int r0 = r5.height
            r8 = -1
            if (r0 != r8) goto L_0x0421
            r0 = 1
            goto L_0x0422
        L_0x0421:
            r0 = 0
        L_0x0422:
            int r8 = r5.topMargin
            int r11 = r5.bottomMargin
            int r8 = r8 + r11
            int r11 = r14.getMeasuredHeight()
            int r11 = r11 + r8
            int r4 = java.lang.Math.max(r4, r11)
            if (r0 == 0) goto L_0x0433
            goto L_0x0434
        L_0x0433:
            r8 = r11
        L_0x0434:
            int r0 = java.lang.Math.max(r6, r8)
            if (r26 == 0) goto L_0x0441
            int r6 = r5.height
            r8 = -1
            if (r6 != r8) goto L_0x0442
            r6 = 1
            goto L_0x0443
        L_0x0441:
            r8 = -1
        L_0x0442:
            r6 = 0
        L_0x0443:
            if (r36 == 0) goto L_0x046a
            int r14 = r14.getBaseline()
            if (r14 == r8) goto L_0x046a
            int r5 = r5.f1009b
            if (r5 >= 0) goto L_0x0451
            int r5 = r7.f1007f
        L_0x0451:
            r5 = r5 & 112(0x70, float:1.57E-43)
            r8 = 4
            int r5 = r5 >> r8
            r5 = r5 & -2
            int r5 = r5 >> 1
            r8 = r15[r5]
            int r8 = java.lang.Math.max(r8, r14)
            r15[r5] = r8
            r8 = r28[r5]
            int r11 = r11 - r14
            int r8 = java.lang.Math.max(r8, r11)
            r28[r5] = r8
        L_0x046a:
            r26 = r6
            r6 = r0
            r0 = r23
            goto L_0x0475
        L_0x0470:
            r3 = r2
            r25 = r11
            r2 = r39
        L_0x0475:
            int r10 = r10 + 1
            r8 = r38
            r2 = r3
            r11 = r25
            r5 = -1
            goto L_0x035e
        L_0x047f:
            r2 = r39
            r25 = r11
            int r0 = r7.g
            int r3 = r37.getPaddingLeft()
            int r5 = r37.getPaddingRight()
            int r3 = r3 + r5
            int r0 = r0 + r3
            r7.g = r0
            r0 = r15[r18]
            r3 = -1
            if (r0 != r3) goto L_0x04a6
            r0 = 0
            r5 = r15[r0]
            if (r5 != r3) goto L_0x04a6
            r0 = r15[r17]
            if (r0 != r3) goto L_0x04a6
            r0 = r15[r16]
            if (r0 == r3) goto L_0x04a4
            goto L_0x04a6
        L_0x04a4:
            r0 = r4
            goto L_0x04d4
        L_0x04a6:
            r0 = r15[r16]
            r3 = 0
            r5 = r15[r3]
            r8 = r15[r18]
            r10 = r15[r17]
            int r8 = java.lang.Math.max(r8, r10)
            int r5 = java.lang.Math.max(r5, r8)
            int r0 = java.lang.Math.max(r0, r5)
            r5 = r28[r16]
            r3 = r28[r3]
            r8 = r28[r18]
            r10 = r28[r17]
            int r8 = java.lang.Math.max(r8, r10)
            int r3 = java.lang.Math.max(r3, r8)
            int r3 = java.lang.Math.max(r5, r3)
            int r0 = r0 + r3
            int r0 = java.lang.Math.max(r4, r0)
        L_0x04d4:
            r3 = r0
            r0 = r6
            r23 = r9
        L_0x04d8:
            if (r26 != 0) goto L_0x04df
            r4 = 1073741824(0x40000000, float:2.0)
            if (r13 == r4) goto L_0x04df
            goto L_0x04e0
        L_0x04df:
            r0 = r3
        L_0x04e0:
            int r3 = r37.getPaddingTop()
            int r4 = r37.getPaddingBottom()
            int r3 = r3 + r4
            int r0 = r0 + r3
            int r3 = r37.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r0, r3)
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3 = r23 & r3
            r1 = r1 | r3
            int r3 = r23 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r2, r3)
            r7.setMeasuredDimension(r1, r0)
            if (r27 == 0) goto L_0x0509
            r0 = r38
            r1 = r25
            r7.k(r1, r0)
        L_0x0509:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.x(int, int):void");
    }

    /* access modifiers changed from: package-private */
    public int y(int i2) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0332  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void z(int r34, int r35) {
        /*
            r33 = this;
            r7 = r33
            r8 = r34
            r9 = r35
            r10 = 0
            r7.g = r10
            int r11 = r33.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r34)
            int r13 = android.view.View.MeasureSpec.getMode(r35)
            int r14 = r7.f1004c
            boolean r15 = r7.i
            r16 = 0
            r17 = 1
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r18 = 0
            r19 = 1
            r20 = 0
        L_0x002a:
            r10 = 8
            r22 = r4
            if (r6 >= r11) goto L_0x0199
            android.view.View r4 = r7.s(r6)
            if (r4 != 0) goto L_0x0047
            int r4 = r7.g
            int r10 = r7.y(r6)
            int r4 = r4 + r10
            r7.g = r4
            r26 = r11
            r24 = r13
            r4 = r22
            goto L_0x018d
        L_0x0047:
            r24 = r1
            int r1 = r4.getVisibility()
            if (r1 != r10) goto L_0x005e
            int r1 = r7.p(r4, r6)
            int r6 = r6 + r1
            r26 = r11
            r4 = r22
            r1 = r24
            r24 = r13
            goto L_0x018d
        L_0x005e:
            boolean r1 = r7.t(r6)
            if (r1 == 0) goto L_0x006b
            int r1 = r7.g
            int r10 = r7.n
            int r1 = r1 + r10
            r7.g = r1
        L_0x006b:
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            r10 = r1
            androidx.appcompat.widget.LinearLayoutCompat$a r10 = (androidx.appcompat.widget.LinearLayoutCompat.a) r10
            float r1 = r10.f1008a
            float r25 = r0 + r1
            r0 = 1073741824(0x40000000, float:2.0)
            if (r13 != r0) goto L_0x00a5
            int r0 = r10.height
            if (r0 != 0) goto L_0x00a5
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a5
            int r0 = r7.g
            int r1 = r10.topMargin
            int r1 = r1 + r0
            r26 = r2
            int r2 = r10.bottomMargin
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            r7.g = r0
            r0 = r3
            r3 = r4
            r31 = r5
            r8 = r24
            r29 = r26
            r18 = 1
            r26 = r11
            r24 = r13
            r13 = r22
            r11 = r6
            goto L_0x0115
        L_0x00a5:
            r26 = r2
            int r0 = r10.height
            if (r0 != 0) goto L_0x00b6
            float r0 = r10.f1008a
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b6
            r0 = -2
            r10.height = r0
            r2 = 0
            goto L_0x00b8
        L_0x00b6:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00b8:
            r27 = 0
            int r0 = (r25 > r16 ? 1 : (r25 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x00c3
            int r0 = r7.g
            r23 = r0
            goto L_0x00c5
        L_0x00c3:
            r23 = 0
        L_0x00c5:
            r28 = 1073741824(0x40000000, float:2.0)
            r0 = r33
            r8 = r24
            r1 = r4
            r30 = r2
            r29 = r26
            r2 = r6
            r9 = r3
            r3 = r34
            r26 = r11
            r24 = r13
            r13 = r22
            r11 = 1073741824(0x40000000, float:2.0)
            r22 = r4
            r4 = r27
            r31 = r5
            r5 = r35
            r11 = r6
            r6 = r23
            r0.w(r1, r2, r3, r4, r5, r6)
            r0 = r30
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x00f2
            r10.height = r0
        L_0x00f2:
            int r0 = r22.getMeasuredHeight()
            int r1 = r7.g
            int r2 = r1 + r0
            int r3 = r10.topMargin
            int r2 = r2 + r3
            int r3 = r10.bottomMargin
            int r2 = r2 + r3
            r3 = r22
            int r4 = r7.r(r3)
            int r2 = r2 + r4
            int r1 = java.lang.Math.max(r1, r2)
            r7.g = r1
            if (r15 == 0) goto L_0x0114
            int r0 = java.lang.Math.max(r0, r9)
            goto L_0x0115
        L_0x0114:
            r0 = r9
        L_0x0115:
            if (r14 < 0) goto L_0x011f
            int r6 = r11 + 1
            if (r14 != r6) goto L_0x011f
            int r1 = r7.g
            r7.f1005d = r1
        L_0x011f:
            if (r11 >= r14) goto L_0x0130
            float r1 = r10.f1008a
            int r1 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r1 > 0) goto L_0x0128
            goto L_0x0130
        L_0x0128:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x0130:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r12 == r1) goto L_0x013d
            int r1 = r10.width
            r2 = -1
            if (r1 != r2) goto L_0x013d
            r1 = 1
            r20 = 1
            goto L_0x013e
        L_0x013d:
            r1 = 0
        L_0x013e:
            int r2 = r10.leftMargin
            int r4 = r10.rightMargin
            int r2 = r2 + r4
            int r4 = r3.getMeasuredWidth()
            int r4 = r4 + r2
            r5 = r29
            int r5 = java.lang.Math.max(r5, r4)
            int r6 = r3.getMeasuredState()
            int r6 = android.view.View.combineMeasuredStates(r8, r6)
            if (r19 == 0) goto L_0x0160
            int r8 = r10.width
            r9 = -1
            if (r8 != r9) goto L_0x0160
            r19 = 1
            goto L_0x0162
        L_0x0160:
            r19 = 0
        L_0x0162:
            float r8 = r10.f1008a
            int r8 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r8 <= 0) goto L_0x0173
            if (r1 == 0) goto L_0x016b
            goto L_0x016c
        L_0x016b:
            r2 = r4
        L_0x016c:
            int r4 = java.lang.Math.max(r13, r2)
            r1 = r31
            goto L_0x017e
        L_0x0173:
            if (r1 == 0) goto L_0x0176
            goto L_0x0177
        L_0x0176:
            r2 = r4
        L_0x0177:
            r1 = r31
            int r1 = java.lang.Math.max(r1, r2)
            r4 = r13
        L_0x017e:
            int r2 = r7.p(r3, r11)
            int r2 = r2 + r11
            r3 = r0
            r0 = r25
            r32 = r5
            r5 = r1
            r1 = r6
            r6 = r2
            r2 = r32
        L_0x018d:
            int r6 = r6 + 1
            r8 = r34
            r9 = r35
            r13 = r24
            r11 = r26
            goto L_0x002a
        L_0x0199:
            r8 = r1
            r9 = r3
            r1 = r5
            r26 = r11
            r24 = r13
            r13 = r22
            r5 = r2
            int r2 = r7.g
            if (r2 <= 0) goto L_0x01b7
            r2 = r26
            boolean r3 = r7.t(r2)
            if (r3 == 0) goto L_0x01b9
            int r3 = r7.g
            int r4 = r7.n
            int r3 = r3 + r4
            r7.g = r3
            goto L_0x01b9
        L_0x01b7:
            r2 = r26
        L_0x01b9:
            r3 = r24
            if (r15 == 0) goto L_0x0208
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r4) goto L_0x01c3
            if (r3 != 0) goto L_0x0208
        L_0x01c3:
            r4 = 0
            r7.g = r4
            r4 = 0
        L_0x01c7:
            if (r4 >= r2) goto L_0x0208
            android.view.View r6 = r7.s(r4)
            if (r6 != 0) goto L_0x01d9
            int r6 = r7.g
            int r11 = r7.y(r4)
            int r6 = r6 + r11
            r7.g = r6
            goto L_0x0203
        L_0x01d9:
            int r11 = r6.getVisibility()
            if (r11 != r10) goto L_0x01e5
            int r6 = r7.p(r6, r4)
            int r4 = r4 + r6
            goto L_0x0203
        L_0x01e5:
            android.view.ViewGroup$LayoutParams r11 = r6.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$a r11 = (androidx.appcompat.widget.LinearLayoutCompat.a) r11
            int r14 = r7.g
            int r21 = r14 + r9
            int r10 = r11.topMargin
            int r21 = r21 + r10
            int r10 = r11.bottomMargin
            int r21 = r21 + r10
            int r6 = r7.r(r6)
            int r6 = r21 + r6
            int r6 = java.lang.Math.max(r14, r6)
            r7.g = r6
        L_0x0203:
            int r4 = r4 + 1
            r10 = 8
            goto L_0x01c7
        L_0x0208:
            int r4 = r7.g
            int r6 = r33.getPaddingTop()
            int r10 = r33.getPaddingBottom()
            int r6 = r6 + r10
            int r4 = r4 + r6
            r7.g = r4
            int r6 = r33.getSuggestedMinimumHeight()
            int r4 = java.lang.Math.max(r4, r6)
            r6 = r35
            r10 = r9
            r9 = 0
            int r4 = android.view.View.resolveSizeAndState(r4, r6, r9)
            r9 = 16777215(0xffffff, float:2.3509886E-38)
            r9 = r9 & r4
            int r11 = r7.g
            int r9 = r9 - r11
            if (r18 != 0) goto L_0x0277
            if (r9 == 0) goto L_0x0236
            int r11 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r11 <= 0) goto L_0x0236
            goto L_0x0277
        L_0x0236:
            int r0 = java.lang.Math.max(r1, r13)
            if (r15 == 0) goto L_0x0272
            r1 = 1073741824(0x40000000, float:2.0)
            if (r3 == r1) goto L_0x0272
            r1 = 0
        L_0x0241:
            if (r1 >= r2) goto L_0x0272
            android.view.View r3 = r7.s(r1)
            if (r3 == 0) goto L_0x026f
            int r9 = r3.getVisibility()
            r11 = 8
            if (r9 != r11) goto L_0x0252
            goto L_0x026f
        L_0x0252:
            android.view.ViewGroup$LayoutParams r9 = r3.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$a r9 = (androidx.appcompat.widget.LinearLayoutCompat.a) r9
            float r9 = r9.f1008a
            int r9 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r9 <= 0) goto L_0x026f
            int r9 = r3.getMeasuredWidth()
            r11 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r11)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11)
            r3.measure(r9, r13)
        L_0x026f:
            int r1 = r1 + 1
            goto L_0x0241
        L_0x0272:
            r11 = r34
            r1 = r8
            goto L_0x036a
        L_0x0277:
            float r10 = r7.h
            int r11 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r11 <= 0) goto L_0x027e
            r0 = r10
        L_0x027e:
            r10 = 0
            r7.g = r10
            r11 = r9
            r9 = r1
            r1 = r8
            r8 = 0
        L_0x0285:
            if (r8 >= r2) goto L_0x0359
            android.view.View r13 = r7.s(r8)
            int r14 = r13.getVisibility()
            r15 = 8
            if (r14 != r15) goto L_0x0299
            r21 = r11
            r11 = r34
            goto L_0x0352
        L_0x0299:
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$a r14 = (androidx.appcompat.widget.LinearLayoutCompat.a) r14
            float r10 = r14.f1008a
            int r18 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r18 <= 0) goto L_0x02fc
            float r15 = (float) r11
            float r15 = r15 * r10
            float r15 = r15 / r0
            int r15 = (int) r15
            float r0 = r0 - r10
            int r11 = r11 - r15
            int r10 = r33.getPaddingLeft()
            int r18 = r33.getPaddingRight()
            int r10 = r10 + r18
            r18 = r0
            int r0 = r14.leftMargin
            int r10 = r10 + r0
            int r0 = r14.rightMargin
            int r10 = r10 + r0
            int r0 = r14.width
            r21 = r11
            r11 = r34
            int r0 = android.view.ViewGroup.getChildMeasureSpec(r11, r10, r0)
            int r10 = r14.height
            if (r10 != 0) goto L_0x02dd
            r10 = 1073741824(0x40000000, float:2.0)
            if (r3 == r10) goto L_0x02d1
            goto L_0x02df
        L_0x02d1:
            if (r15 <= 0) goto L_0x02d4
            goto L_0x02d5
        L_0x02d4:
            r15 = 0
        L_0x02d5:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r10)
            r13.measure(r0, r15)
            goto L_0x02ef
        L_0x02dd:
            r10 = 1073741824(0x40000000, float:2.0)
        L_0x02df:
            int r23 = r13.getMeasuredHeight()
            int r15 = r23 + r15
            if (r15 >= 0) goto L_0x02e8
            r15 = 0
        L_0x02e8:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r10)
            r13.measure(r0, r15)
        L_0x02ef:
            int r0 = r13.getMeasuredState()
            r0 = r0 & -256(0xffffffffffffff00, float:NaN)
            int r1 = android.view.View.combineMeasuredStates(r1, r0)
            r0 = r18
            goto L_0x0301
        L_0x02fc:
            r10 = r11
            r11 = r34
            r21 = r10
        L_0x0301:
            int r10 = r14.leftMargin
            int r15 = r14.rightMargin
            int r10 = r10 + r15
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r10
            int r5 = java.lang.Math.max(r5, r15)
            r18 = r0
            r0 = 1073741824(0x40000000, float:2.0)
            if (r12 == r0) goto L_0x031e
            int r0 = r14.width
            r23 = r1
            r1 = -1
            if (r0 != r1) goto L_0x0321
            r0 = 1
            goto L_0x0322
        L_0x031e:
            r23 = r1
            r1 = -1
        L_0x0321:
            r0 = 0
        L_0x0322:
            if (r0 == 0) goto L_0x0325
            goto L_0x0326
        L_0x0325:
            r10 = r15
        L_0x0326:
            int r0 = java.lang.Math.max(r9, r10)
            if (r19 == 0) goto L_0x0332
            int r9 = r14.width
            if (r9 != r1) goto L_0x0332
            r9 = 1
            goto L_0x0333
        L_0x0332:
            r9 = 0
        L_0x0333:
            int r10 = r7.g
            int r15 = r13.getMeasuredHeight()
            int r15 = r15 + r10
            int r1 = r14.topMargin
            int r15 = r15 + r1
            int r1 = r14.bottomMargin
            int r15 = r15 + r1
            int r1 = r7.r(r13)
            int r15 = r15 + r1
            int r1 = java.lang.Math.max(r10, r15)
            r7.g = r1
            r19 = r9
            r1 = r23
            r9 = r0
            r0 = r18
        L_0x0352:
            int r8 = r8 + 1
            r11 = r21
            r10 = 0
            goto L_0x0285
        L_0x0359:
            r11 = r34
            int r0 = r7.g
            int r3 = r33.getPaddingTop()
            int r8 = r33.getPaddingBottom()
            int r3 = r3 + r8
            int r0 = r0 + r3
            r7.g = r0
            r0 = r9
        L_0x036a:
            if (r19 != 0) goto L_0x0371
            r3 = 1073741824(0x40000000, float:2.0)
            if (r12 == r3) goto L_0x0371
            goto L_0x0372
        L_0x0371:
            r0 = r5
        L_0x0372:
            int r3 = r33.getPaddingLeft()
            int r5 = r33.getPaddingRight()
            int r3 = r3 + r5
            int r0 = r0 + r3
            int r3 = r33.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r0, r3)
            int r0 = android.view.View.resolveSizeAndState(r0, r11, r1)
            r7.setMeasuredDimension(r0, r4)
            if (r20 == 0) goto L_0x0390
            r7.l(r2, r6)
        L_0x0390:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.z(int, int):void");
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1003b = true;
        this.f1004c = -1;
        this.f1005d = 0;
        this.f1007f = 8388659;
        b0 u = b0.u(context, attributeSet, j.LinearLayoutCompat, i2, 0);
        int k2 = u.k(j.LinearLayoutCompat_android_orientation, -1);
        if (k2 >= 0) {
            setOrientation(k2);
        }
        int k3 = u.k(j.LinearLayoutCompat_android_gravity, -1);
        if (k3 >= 0) {
            setGravity(k3);
        }
        boolean a2 = u.a(j.LinearLayoutCompat_android_baselineAligned, true);
        if (!a2) {
            setBaselineAligned(a2);
        }
        this.h = u.i(j.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f1004c = u.k(j.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.i = u.a(j.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(u.g(j.LinearLayoutCompat_divider));
        this.o = u.k(j.LinearLayoutCompat_showDividers, 0);
        this.p = u.f(j.LinearLayoutCompat_dividerPadding, 0);
        u.v();
    }

    public static class a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public float f1008a;

        /* renamed from: b  reason: collision with root package name */
        public int f1009b;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1009b = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.LinearLayoutCompat_Layout);
            this.f1008a = obtainStyledAttributes.getFloat(j.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.f1009b = obtainStyledAttributes.getInt(j.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            obtainStyledAttributes.recycle();
        }

        public a(int i, int i2) {
            super(i, i2);
            this.f1009b = -1;
            this.f1008a = 0.0f;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1009b = -1;
        }
    }
}
