package com.google.android.material.internal;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* compiled from: CircularBorderDrawable */
public class a extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    final Paint f10826a;

    /* renamed from: b  reason: collision with root package name */
    final Rect f10827b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    final RectF f10828c = new RectF();

    /* renamed from: d  reason: collision with root package name */
    final b f10829d = new b();

    /* renamed from: e  reason: collision with root package name */
    float f10830e;

    /* renamed from: f  reason: collision with root package name */
    private int f10831f;
    private int g;
    private int h;
    private int i;
    private ColorStateList j;
    private int k;
    private boolean l = true;
    private float m;

    /* compiled from: CircularBorderDrawable */
    private class b extends Drawable.ConstantState {
        private b() {
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            return a.this;
        }
    }

    public a() {
        Paint paint = new Paint(1);
        this.f10826a = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    private Shader a() {
        Rect rect = this.f10827b;
        copyBounds(rect);
        float height = this.f10830e / ((float) rect.height());
        return new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{a.h.e.a.b(this.f10831f, this.k), a.h.e.a.b(this.g, this.k), a.h.e.a.b(a.h.e.a.d(this.g, 0), this.k), a.h.e.a.b(a.h.e.a.d(this.i, 0), this.k), a.h.e.a.b(this.i, this.k), a.h.e.a.b(this.h, this.k)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP);
    }

    public void b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.k = colorStateList.getColorForState(getState(), this.k);
        }
        this.j = colorStateList;
        this.l = true;
        invalidateSelf();
    }

    public void c(float f2) {
        if (this.f10830e != f2) {
            this.f10830e = f2;
            this.f10826a.setStrokeWidth(f2 * 1.3333f);
            this.l = true;
            invalidateSelf();
        }
    }

    public void d(int i2, int i3, int i4, int i5) {
        this.f10831f = i2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
    }

    public void draw(Canvas canvas) {
        if (this.l) {
            this.f10826a.setShader(a());
            this.l = false;
        }
        float strokeWidth = this.f10826a.getStrokeWidth() / 2.0f;
        RectF rectF = this.f10828c;
        copyBounds(this.f10827b);
        rectF.set(this.f10827b);
        rectF.left += strokeWidth;
        rectF.top += strokeWidth;
        rectF.right -= strokeWidth;
        rectF.bottom -= strokeWidth;
        canvas.save();
        canvas.rotate(this.m, rectF.centerX(), rectF.centerY());
        canvas.drawOval(rectF, this.f10826a);
        canvas.restore();
    }

    public final void e(float f2) {
        if (f2 != this.m) {
            this.m = f2;
            invalidateSelf();
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.f10829d;
    }

    public int getOpacity() {
        return this.f10830e > 0.0f ? -3 : -2;
    }

    public boolean getPadding(Rect rect) {
        int round = Math.round(this.f10830e);
        rect.set(round, round, round, round);
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.j;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.l = true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.j;
        if (!(colorStateList == null || (colorForState = colorStateList.getColorForState(iArr, this.k)) == this.k)) {
            this.l = true;
            this.k = colorForState;
        }
        if (this.l) {
            invalidateSelf();
        }
        return this.l;
    }

    public void setAlpha(int i2) {
        this.f10826a.setAlpha(i2);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f10826a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
