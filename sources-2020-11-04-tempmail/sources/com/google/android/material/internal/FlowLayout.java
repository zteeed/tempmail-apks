package com.google.android.material.internal;

import a.h.k.g;
import a.h.k.u;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import b.c.a.d.k;

public class FlowLayout extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    private int f11003b;

    /* renamed from: c  reason: collision with root package name */
    private int f11004c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f11005d;

    public FlowLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private static int a(int i, int i2, int i3) {
        if (i2 != Integer.MIN_VALUE) {
            return i2 != 1073741824 ? i3 : i;
        }
        return Math.min(i3, i);
    }

    private void c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, k.FlowLayout, 0, 0);
        this.f11003b = obtainStyledAttributes.getDimensionPixelSize(k.FlowLayout_lineSpacing, 0);
        this.f11004c = obtainStyledAttributes.getDimensionPixelSize(k.FlowLayout_itemSpacing, 0);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public boolean b() {
        return this.f11005d;
    }

    /* access modifiers changed from: protected */
    public int getItemSpacing() {
        return this.f11004c;
    }

    /* access modifiers changed from: protected */
    public int getLineSpacing() {
        return this.f11003b;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (getChildCount() != 0) {
            boolean z2 = true;
            if (u.t(this) != 1) {
                z2 = false;
            }
            int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
            int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
            int paddingTop = getPaddingTop();
            int i7 = (i3 - i) - paddingLeft;
            int i8 = paddingRight;
            int i9 = paddingTop;
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt.getVisibility() != 8) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        i5 = g.b(marginLayoutParams);
                        i6 = g.a(marginLayoutParams);
                    } else {
                        i6 = 0;
                        i5 = 0;
                    }
                    int measuredWidth = i8 + i5 + childAt.getMeasuredWidth();
                    if (!this.f11005d && measuredWidth > i7) {
                        i9 = this.f11003b + paddingTop;
                        i8 = paddingRight;
                    }
                    int i11 = i8 + i5;
                    int measuredWidth2 = childAt.getMeasuredWidth() + i11;
                    int measuredHeight = childAt.getMeasuredHeight() + i9;
                    if (z2) {
                        childAt.layout(i7 - measuredWidth2, i9, (i7 - i8) - i5, measuredHeight);
                    } else {
                        childAt.layout(i11, i9, measuredWidth2, measuredHeight);
                    }
                    i8 += i5 + i6 + childAt.getMeasuredWidth() + this.f11004c;
                    paddingTop = measuredHeight;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i6 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i6 - getPaddingRight();
        int i7 = paddingTop;
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 8) {
                int i10 = i;
                int i11 = i2;
            } else {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i4 = marginLayoutParams.leftMargin + 0;
                    i3 = marginLayoutParams.rightMargin + 0;
                } else {
                    i4 = 0;
                    i3 = 0;
                }
                int i12 = paddingLeft;
                if (paddingLeft + i4 + childAt.getMeasuredWidth() <= paddingRight || b()) {
                    i5 = i12;
                } else {
                    i5 = getPaddingLeft();
                    i7 = this.f11003b + paddingTop;
                }
                int measuredWidth = i5 + i4 + childAt.getMeasuredWidth();
                int measuredHeight = i7 + childAt.getMeasuredHeight();
                if (measuredWidth > i8) {
                    i8 = measuredWidth;
                }
                paddingLeft = i5 + i4 + i3 + childAt.getMeasuredWidth() + this.f11004c;
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(a(size, mode, i8), a(size2, mode2, paddingTop));
    }

    /* access modifiers changed from: protected */
    public void setItemSpacing(int i) {
        this.f11004c = i;
    }

    /* access modifiers changed from: protected */
    public void setLineSpacing(int i) {
        this.f11003b = i;
    }

    public void setSingleLine(boolean z) {
        this.f11005d = z;
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11005d = false;
        c(context, attributeSet);
    }
}
