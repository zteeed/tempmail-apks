package com.google.android.material.circularreveal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.GridLayout;
import com.google.android.material.circularreveal.c;

public class CircularRevealGridLayout extends GridLayout implements c {

    /* renamed from: b  reason: collision with root package name */
    private final b f10951b;

    public CircularRevealGridLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public void a() {
        this.f10951b.a();
    }

    public void b() {
        this.f10951b.b();
    }

    public void c(Canvas canvas) {
        super.draw(canvas);
    }

    public boolean d() {
        return super.isOpaque();
    }

    public void draw(Canvas canvas) {
        b bVar = this.f10951b;
        if (bVar != null) {
            bVar.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f10951b.e();
    }

    public int getCircularRevealScrimColor() {
        return this.f10951b.f();
    }

    public c.e getRevealInfo() {
        return this.f10951b.h();
    }

    public boolean isOpaque() {
        b bVar = this.f10951b;
        if (bVar != null) {
            return bVar.j();
        }
        return super.isOpaque();
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f10951b.k(drawable);
    }

    public void setCircularRevealScrimColor(int i) {
        this.f10951b.l(i);
    }

    public void setRevealInfo(c.e eVar) {
        this.f10951b.m(eVar);
    }

    public CircularRevealGridLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10951b = new b(this);
    }
}
