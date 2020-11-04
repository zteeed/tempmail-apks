package com.google.android.material.circularreveal.cardview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;
import com.google.android.material.circularreveal.b;
import com.google.android.material.circularreveal.c;

public class CircularRevealCardView extends CardView implements c {
    private final b k;

    public CircularRevealCardView(Context context) {
        this(context, (AttributeSet) null);
    }

    public void a() {
        this.k.a();
    }

    public void b() {
        this.k.b();
    }

    public void c(Canvas canvas) {
        super.draw(canvas);
    }

    public boolean d() {
        return super.isOpaque();
    }

    public void draw(Canvas canvas) {
        b bVar = this.k;
        if (bVar != null) {
            bVar.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.k.e();
    }

    public int getCircularRevealScrimColor() {
        return this.k.f();
    }

    public c.e getRevealInfo() {
        return this.k.h();
    }

    public boolean isOpaque() {
        b bVar = this.k;
        if (bVar != null) {
            return bVar.j();
        }
        return super.isOpaque();
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.k.k(drawable);
    }

    public void setCircularRevealScrimColor(int i) {
        this.k.l(i);
    }

    public void setRevealInfo(c.e eVar) {
        this.k.m(eVar);
    }

    public CircularRevealCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = new b(this);
    }
}
