package com.google.android.material.internal;

import a.h.k.b0;
import a.h.k.q;
import a.h.k.t;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import b.c.a.d.j;
import b.c.a.d.k;

public class ScrimInsetsFrameLayout extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    Drawable f10821b;

    /* renamed from: c  reason: collision with root package name */
    Rect f10822c;

    /* renamed from: d  reason: collision with root package name */
    private Rect f10823d;

    class a implements q {
        a() {
        }

        public b0 a(View view, b0 b0Var) {
            ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
            if (scrimInsetsFrameLayout.f10822c == null) {
                scrimInsetsFrameLayout.f10822c = new Rect();
            }
            ScrimInsetsFrameLayout.this.f10822c.set(b0Var.c(), b0Var.e(), b0Var.d(), b0Var.b());
            ScrimInsetsFrameLayout.this.a(b0Var);
            ScrimInsetsFrameLayout.this.setWillNotDraw(!b0Var.f() || ScrimInsetsFrameLayout.this.f10821b == null);
            t.T(ScrimInsetsFrameLayout.this);
            return b0Var.a();
        }
    }

    public ScrimInsetsFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public void a(b0 b0Var) {
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f10822c != null && this.f10821b != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            this.f10823d.set(0, 0, width, this.f10822c.top);
            this.f10821b.setBounds(this.f10823d);
            this.f10821b.draw(canvas);
            this.f10823d.set(0, height - this.f10822c.bottom, width, height);
            this.f10821b.setBounds(this.f10823d);
            this.f10821b.draw(canvas);
            Rect rect = this.f10823d;
            Rect rect2 = this.f10822c;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.f10821b.setBounds(this.f10823d);
            this.f10821b.draw(canvas);
            Rect rect3 = this.f10823d;
            Rect rect4 = this.f10822c;
            rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
            this.f10821b.setBounds(this.f10823d);
            this.f10821b.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f10821b;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f10821b;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10823d = new Rect();
        TypedArray h = k.h(context, attributeSet, k.ScrimInsetsFrameLayout, i, j.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.f10821b = h.getDrawable(k.ScrimInsetsFrameLayout_insetForeground);
        h.recycle();
        setWillNotDraw(true);
        t.l0(this, new a());
    }
}
