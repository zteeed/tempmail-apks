package com.google.android.material.snackbar;

import a.h.k.u;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import b.c.a.d.f;
import b.c.a.d.k;

public class SnackbarContentLayout extends LinearLayout implements a {

    /* renamed from: b  reason: collision with root package name */
    private TextView f11085b;

    /* renamed from: c  reason: collision with root package name */
    private Button f11086c;

    /* renamed from: d  reason: collision with root package name */
    private int f11087d;

    /* renamed from: e  reason: collision with root package name */
    private int f11088e;

    public SnackbarContentLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private static void c(View view, int i, int i2) {
        if (u.K(view)) {
            u.m0(view, u.x(view), i, u.w(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    private boolean d(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f11085b.getPaddingTop() == i2 && this.f11085b.getPaddingBottom() == i3) {
            return z;
        }
        c(this.f11085b, i2, i3);
        return true;
    }

    public void a(int i, int i2) {
        this.f11085b.setAlpha(0.0f);
        long j = (long) i2;
        long j2 = (long) i;
        this.f11085b.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f11086c.getVisibility() == 0) {
            this.f11086c.setAlpha(0.0f);
            this.f11086c.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    public void b(int i, int i2) {
        this.f11085b.setAlpha(1.0f);
        long j = (long) i2;
        long j2 = (long) i;
        this.f11085b.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f11086c.getVisibility() == 0) {
            this.f11086c.setAlpha(1.0f);
            this.f11086c.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    public Button getActionView() {
        return this.f11086c;
    }

    public TextView getMessageView() {
        return this.f11085b;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f11085b = (TextView) findViewById(f.snackbar_text);
        this.f11086c = (Button) findViewById(f.snackbar_action);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (d(1, r0, r0 - r1) != false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (d(0, r0, r0) != false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f11087d
            if (r0 <= 0) goto L_0x0018
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.f11087d
            if (r0 <= r1) goto L_0x0018
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L_0x0018:
            android.content.res.Resources r0 = r7.getResources()
            int r1 = b.c.a.d.d.design_snackbar_padding_vertical_2lines
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = b.c.a.d.d.design_snackbar_padding_vertical
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f11085b
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L_0x003c
            r2 = 1
            goto L_0x003d
        L_0x003c:
            r2 = 0
        L_0x003d:
            if (r2 == 0) goto L_0x0056
            int r5 = r7.f11088e
            if (r5 <= 0) goto L_0x0056
            android.widget.Button r5 = r7.f11086c
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f11088e
            if (r5 <= r6) goto L_0x0056
            int r1 = r0 - r1
            boolean r0 = r7.d(r4, r0, r1)
            if (r0 == 0) goto L_0x0061
            goto L_0x0060
        L_0x0056:
            if (r2 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r0 = r1
        L_0x005a:
            boolean r0 = r7.d(r3, r0, r0)
            if (r0 == 0) goto L_0x0061
        L_0x0060:
            r3 = 1
        L_0x0061:
            if (r3 == 0) goto L_0x0066
            super.onMeasure(r8, r9)
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.SnackbarLayout);
        this.f11087d = obtainStyledAttributes.getDimensionPixelSize(k.SnackbarLayout_android_maxWidth, -1);
        this.f11088e = obtainStyledAttributes.getDimensionPixelSize(k.SnackbarLayout_maxActionInlineWidth, -1);
        obtainStyledAttributes.recycle();
    }
}
