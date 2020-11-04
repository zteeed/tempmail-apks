package com.google.android.material.circularreveal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.material.circularreveal.c;

public class CircularRevealFrameLayout extends FrameLayout implements c {

    /* renamed from: b  reason: collision with root package name */
    private final b f10764b;

    public CircularRevealFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public void a() {
        this.f10764b.a();
    }

    public void b() {
        this.f10764b.b();
    }

    public void c(Canvas canvas) {
        super.draw(canvas);
    }

    public boolean d() {
        return super.isOpaque();
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
        b bVar = this.f10764b;
        if (bVar != null) {
            bVar.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f10764b.e();
    }

    public int getCircularRevealScrimColor() {
        return this.f10764b.f();
    }

    public c.e getRevealInfo() {
        return this.f10764b.h();
    }

    public boolean isOpaque() {
        b bVar = this.f10764b;
        if (bVar != null) {
            return bVar.j();
        }
        return super.isOpaque();
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f10764b.k(drawable);
    }

    public void setCircularRevealScrimColor(int i) {
        this.f10764b.l(i);
    }

    public void setRevealInfo(c.e eVar) {
        this.f10764b.m(eVar);
    }

    public CircularRevealFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10764b = new b(this);
    }
}
