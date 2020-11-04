package b.c.a.d.s;

import a.a.l.a.c;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* compiled from: ShadowDrawableWrapper */
public class a extends c {
    static final double r = Math.cos(Math.toRadians(45.0d));

    /* renamed from: c  reason: collision with root package name */
    final Paint f2404c;

    /* renamed from: d  reason: collision with root package name */
    final Paint f2405d;

    /* renamed from: e  reason: collision with root package name */
    final RectF f2406e;

    /* renamed from: f  reason: collision with root package name */
    float f2407f;
    Path g;
    float h;
    float i;
    float j;
    private boolean k = true;
    private final int l;
    private final int m;
    private final int n;
    private boolean o = true;
    private float p;
    private boolean q = false;

    public a(Context context, Drawable drawable, float f2, float f3, float f4) {
        super(drawable);
        this.l = androidx.core.content.a.d(context, b.c.a.d.c.design_fab_shadow_start_color);
        this.m = androidx.core.content.a.d(context, b.c.a.d.c.design_fab_shadow_mid_color);
        this.n = androidx.core.content.a.d(context, b.c.a.d.c.design_fab_shadow_end_color);
        Paint paint = new Paint(5);
        this.f2404c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f2407f = (float) Math.round(f2);
        this.f2406e = new RectF();
        Paint paint2 = new Paint(this.f2404c);
        this.f2405d = paint2;
        paint2.setAntiAlias(false);
        l(f3, f4);
    }

    private void c(Rect rect) {
        float f2 = this.h;
        float f3 = 1.5f * f2;
        this.f2406e.set(((float) rect.left) + f2, ((float) rect.top) + f3, ((float) rect.right) - f2, ((float) rect.bottom) - f3);
        Drawable a2 = a();
        RectF rectF = this.f2406e;
        a2.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        d();
    }

    private void d() {
        float f2 = this.f2407f;
        RectF rectF = new RectF(-f2, -f2, f2, f2);
        RectF rectF2 = new RectF(rectF);
        float f3 = this.i;
        rectF2.inset(-f3, -f3);
        Path path = this.g;
        if (path == null) {
            this.g = new Path();
        } else {
            path.reset();
        }
        this.g.setFillType(Path.FillType.EVEN_ODD);
        this.g.moveTo(-this.f2407f, 0.0f);
        this.g.rLineTo(-this.i, 0.0f);
        this.g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.g.arcTo(rectF, 270.0f, -90.0f, false);
        this.g.close();
        float f4 = -rectF2.top;
        if (f4 > 0.0f) {
            float f5 = this.f2407f / f4;
            Paint paint = this.f2404c;
            RadialGradient radialGradient = r8;
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, f4, new int[]{0, this.l, this.m, this.n}, new float[]{0.0f, f5, ((1.0f - f5) / 2.0f) + f5, 1.0f}, Shader.TileMode.CLAMP);
            paint.setShader(radialGradient);
        }
        this.f2405d.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, new int[]{this.l, this.m, this.n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f2405d.setAntiAlias(false);
    }

    public static float e(float f2, float f3, boolean z) {
        return z ? (float) (((double) f2) + ((1.0d - r) * ((double) f3))) : f2;
    }

    public static float f(float f2, float f3, boolean z) {
        return z ? (float) (((double) (f2 * 1.5f)) + ((1.0d - r) * ((double) f3))) : f2 * 1.5f;
    }

    private void g(Canvas canvas) {
        float f2;
        int i2;
        int i3;
        float f3;
        float f4;
        float f5;
        Canvas canvas2 = canvas;
        int save = canvas.save();
        canvas2.rotate(this.p, this.f2406e.centerX(), this.f2406e.centerY());
        float f6 = this.f2407f;
        float f7 = (-f6) - this.i;
        float f8 = f6 * 2.0f;
        boolean z = this.f2406e.width() - f8 > 0.0f;
        boolean z2 = this.f2406e.height() - f8 > 0.0f;
        float f9 = this.j;
        float f10 = f6 / ((f9 - (0.5f * f9)) + f6);
        float f11 = f6 / ((f9 - (0.25f * f9)) + f6);
        float f12 = f6 / ((f9 - (f9 * 1.0f)) + f6);
        int save2 = canvas.save();
        RectF rectF = this.f2406e;
        canvas2.translate(rectF.left + f6, rectF.top + f6);
        canvas2.scale(f10, f11);
        canvas2.drawPath(this.g, this.f2404c);
        if (z) {
            canvas2.scale(1.0f / f10, 1.0f);
            i3 = save2;
            f2 = f12;
            i2 = save;
            f3 = f11;
            canvas.drawRect(0.0f, f7, this.f2406e.width() - f8, -this.f2407f, this.f2405d);
        } else {
            i3 = save2;
            f2 = f12;
            i2 = save;
            f3 = f11;
        }
        canvas2.restoreToCount(i3);
        int save3 = canvas.save();
        RectF rectF2 = this.f2406e;
        canvas2.translate(rectF2.right - f6, rectF2.bottom - f6);
        float f13 = f2;
        canvas2.scale(f10, f13);
        canvas2.rotate(180.0f);
        canvas2.drawPath(this.g, this.f2404c);
        if (z) {
            canvas2.scale(1.0f / f10, 1.0f);
            f4 = f3;
            f5 = f13;
            canvas.drawRect(0.0f, f7, this.f2406e.width() - f8, (-this.f2407f) + this.i, this.f2405d);
        } else {
            f4 = f3;
            f5 = f13;
        }
        canvas2.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF3 = this.f2406e;
        canvas2.translate(rectF3.left + f6, rectF3.bottom - f6);
        canvas2.scale(f10, f5);
        canvas2.rotate(270.0f);
        canvas2.drawPath(this.g, this.f2404c);
        if (z2) {
            canvas2.scale(1.0f / f5, 1.0f);
            canvas.drawRect(0.0f, f7, this.f2406e.height() - f8, -this.f2407f, this.f2405d);
        }
        canvas2.restoreToCount(save4);
        int save5 = canvas.save();
        RectF rectF4 = this.f2406e;
        canvas2.translate(rectF4.right - f6, rectF4.top + f6);
        float f14 = f4;
        canvas2.scale(f10, f14);
        canvas2.rotate(90.0f);
        canvas2.drawPath(this.g, this.f2404c);
        if (z2) {
            canvas2.scale(1.0f / f14, 1.0f);
            canvas.drawRect(0.0f, f7, this.f2406e.height() - f8, -this.f2407f, this.f2405d);
        }
        canvas2.restoreToCount(save5);
        canvas2.restoreToCount(i2);
    }

    private static int m(float f2) {
        int round = Math.round(f2);
        return round % 2 == 1 ? round - 1 : round;
    }

    public void draw(Canvas canvas) {
        if (this.k) {
            c(getBounds());
            this.k = false;
        }
        g(canvas);
        super.draw(canvas);
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) f(this.h, this.f2407f, this.o));
        int ceil2 = (int) Math.ceil((double) e(this.h, this.f2407f, this.o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public float h() {
        return this.j;
    }

    public void i(boolean z) {
        this.o = z;
        invalidateSelf();
    }

    public final void j(float f2) {
        if (this.p != f2) {
            this.p = f2;
            invalidateSelf();
        }
    }

    public void k(float f2) {
        l(f2, this.h);
    }

    public void l(float f2, float f3) {
        if (f2 < 0.0f || f3 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float m2 = (float) m(f2);
        float m3 = (float) m(f3);
        if (m2 > m3) {
            if (!this.q) {
                this.q = true;
            }
            m2 = m3;
        }
        if (this.j != m2 || this.h != m3) {
            this.j = m2;
            this.h = m3;
            this.i = (float) Math.round(m2 * 1.5f);
            this.k = true;
            invalidateSelf();
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.k = true;
    }

    public void setAlpha(int i2) {
        super.setAlpha(i2);
        this.f2404c.setAlpha(i2);
        this.f2405d.setAlpha(i2);
    }
}
