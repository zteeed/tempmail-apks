package com.google.android.material.circularreveal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.google.android.material.circularreveal.c;

public class CircularRevealRelativeLayout extends RelativeLayout implements c {

    /* renamed from: b  reason: collision with root package name */
    private final b f10953b;

    public CircularRevealRelativeLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public void a() {
        this.f10953b.a();
    }

    public void b() {
        this.f10953b.b();
    }

    public void c(Canvas canvas) {
        super.draw(canvas);
    }

    public boolean d() {
        return super.isOpaque();
    }

    public void draw(Canvas canvas) {
        b bVar = this.f10953b;
        if (bVar != null) {
            bVar.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f10953b.e();
    }

    public int getCircularRevealScrimColor() {
        return this.f10953b.f();
    }

    public c.e getRevealInfo() {
        return this.f10953b.h();
    }

    public boolean isOpaque() {
        b bVar = this.f10953b;
        if (bVar != null) {
            return bVar.j();
        }
        return super.isOpaque();
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f10953b.k(drawable);
    }

    public void setCircularRevealScrimColor(int i) {
        this.f10953b.l(i);
    }

    public void setRevealInfo(c.e eVar) {
        this.f10953b.m(eVar);
    }

    public CircularRevealRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10953b = new b(this);
    }
}
