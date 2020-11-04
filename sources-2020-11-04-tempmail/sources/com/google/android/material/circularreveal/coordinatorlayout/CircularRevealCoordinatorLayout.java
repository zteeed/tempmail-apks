package com.google.android.material.circularreveal.coordinatorlayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.circularreveal.b;
import com.google.android.material.circularreveal.c;

public class CircularRevealCoordinatorLayout extends CoordinatorLayout implements c {
    private final b z;

    public CircularRevealCoordinatorLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public void a() {
        this.z.a();
    }

    public void b() {
        this.z.b();
    }

    public void c(Canvas canvas) {
        super.draw(canvas);
    }

    public boolean d() {
        return super.isOpaque();
    }

    public void draw(Canvas canvas) {
        b bVar = this.z;
        if (bVar != null) {
            bVar.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.z.e();
    }

    public int getCircularRevealScrimColor() {
        return this.z.f();
    }

    public c.e getRevealInfo() {
        return this.z.h();
    }

    public boolean isOpaque() {
        b bVar = this.z;
        if (bVar != null) {
            return bVar.j();
        }
        return super.isOpaque();
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.z.k(drawable);
    }

    public void setCircularRevealScrimColor(int i) {
        this.z.l(i);
    }

    public void setRevealInfo(c.e eVar) {
        this.z.m(eVar);
    }

    public CircularRevealCoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.z = new b(this);
    }
}
