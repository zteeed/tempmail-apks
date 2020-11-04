package com.google.android.material.internal;

import a.h.k.c0;
import a.h.k.q;
import a.h.k.u;
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
    Drawable f11007b;

    /* renamed from: c  reason: collision with root package name */
    Rect f11008c;

    /* renamed from: d  reason: collision with root package name */
    private Rect f11009d;

    class a implements q {
        a() {
        }

        public c0 a(View view, c0 c0Var) {
            ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
            if (scrimInsetsFrameLayout.f11008c == null) {
                scrimInsetsFrameLayout.f11008c = new Rect();
            }
            ScrimInsetsFrameLayout.this.f11008c.set(c0Var.c(), c0Var.e(), c0Var.d(), c0Var.b());
            ScrimInsetsFrameLayout.this.a(c0Var);
            ScrimInsetsFrameLayout.this.setWillNotDraw(!c0Var.f() || ScrimInsetsFrameLayout.this.f11007b == null);
            u.T(ScrimInsetsFrameLayout.this);
            return c0Var.a();
        }
    }

    public ScrimInsetsFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public void a(c0 c0Var) {
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f11008c != null && this.f11007b != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            this.f11009d.set(0, 0, width, this.f11008c.top);
            this.f11007b.setBounds(this.f11009d);
            this.f11007b.draw(canvas);
            this.f11009d.set(0, height - this.f11008c.bottom, width, height);
            this.f11007b.setBounds(this.f11009d);
            this.f11007b.draw(canvas);
            Rect rect = this.f11009d;
            Rect rect2 = this.f11008c;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.f11007b.setBounds(this.f11009d);
            this.f11007b.draw(canvas);
            Rect rect3 = this.f11009d;
            Rect rect4 = this.f11008c;
            rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
            this.f11007b.setBounds(this.f11009d);
            this.f11007b.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f11007b;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f11007b;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11009d = new Rect();
        TypedArray h = k.h(context, attributeSet, k.ScrimInsetsFrameLayout, i, j.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.f11007b = h.getDrawable(k.ScrimInsetsFrameLayout_insetForeground);
        h.recycle();
        setWillNotDraw(true);
        u.l0(this, new a());
    }
}
