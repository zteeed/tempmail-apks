package androidx.cardview.widget;

import a.d.b;
import a.d.c;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* compiled from: RoundRectDrawableWithShadow */
class g extends Drawable {
    private static final double q = Math.cos(Math.toRadians(45.0d));
    static a r;

    /* renamed from: a  reason: collision with root package name */
    private final int f1199a;

    /* renamed from: b  reason: collision with root package name */
    private Paint f1200b;

    /* renamed from: c  reason: collision with root package name */
    private Paint f1201c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f1202d;

    /* renamed from: e  reason: collision with root package name */
    private final RectF f1203e;

    /* renamed from: f  reason: collision with root package name */
    private float f1204f;
    private Path g;
    private float h;
    private float i;
    private float j;
    private ColorStateList k;
    private boolean l = true;
    private final int m;
    private final int n;
    private boolean o = true;
    private boolean p = false;

    /* compiled from: RoundRectDrawableWithShadow */
    interface a {
        void a(Canvas canvas, RectF rectF, float f2, Paint paint);
    }

    g(Resources resources, ColorStateList colorStateList, float f2, float f3, float f4) {
        this.m = resources.getColor(b.cardview_shadow_start_color);
        this.n = resources.getColor(b.cardview_shadow_end_color);
        this.f1199a = resources.getDimensionPixelSize(c.cardview_compat_inset_shadow);
        this.f1200b = new Paint(5);
        n(colorStateList);
        Paint paint = new Paint(5);
        this.f1201c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f1204f = (float) ((int) (f2 + 0.5f));
        this.f1203e = new RectF();
        Paint paint2 = new Paint(this.f1201c);
        this.f1202d = paint2;
        paint2.setAntiAlias(false);
        s(f3, f4);
    }

    private void a(Rect rect) {
        float f2 = this.h;
        float f3 = 1.5f * f2;
        this.f1203e.set(((float) rect.left) + f2, ((float) rect.top) + f3, ((float) rect.right) - f2, ((float) rect.bottom) - f3);
        b();
    }

    private void b() {
        float f2 = this.f1204f;
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
        this.g.moveTo(-this.f1204f, 0.0f);
        this.g.rLineTo(-this.i, 0.0f);
        this.g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.g.arcTo(rectF, 270.0f, -90.0f, false);
        this.g.close();
        float f4 = this.f1204f;
        float f5 = f4 / (this.i + f4);
        Paint paint = this.f1201c;
        float f6 = this.f1204f + this.i;
        int i2 = this.m;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f6, new int[]{i2, i2, this.n}, new float[]{0.0f, f5, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f1202d;
        float f7 = this.f1204f;
        float f8 = this.i;
        int i3 = this.m;
        paint2.setShader(new LinearGradient(0.0f, (-f7) + f8, 0.0f, (-f7) - f8, new int[]{i3, i3, this.n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f1202d.setAntiAlias(false);
    }

    static float c(float f2, float f3, boolean z) {
        return z ? (float) (((double) f2) + ((1.0d - q) * ((double) f3))) : f2;
    }

    static float d(float f2, float f3, boolean z) {
        return z ? (float) (((double) (f2 * 1.5f)) + ((1.0d - q) * ((double) f3))) : f2 * 1.5f;
    }

    private void e(Canvas canvas) {
        float f2 = this.f1204f;
        float f3 = (-f2) - this.i;
        float f4 = f2 + ((float) this.f1199a) + (this.j / 2.0f);
        float f5 = f4 * 2.0f;
        boolean z = this.f1203e.width() - f5 > 0.0f;
        boolean z2 = this.f1203e.height() - f5 > 0.0f;
        int save = canvas.save();
        RectF rectF = this.f1203e;
        canvas.translate(rectF.left + f4, rectF.top + f4);
        canvas.drawPath(this.g, this.f1201c);
        if (z) {
            canvas.drawRect(0.0f, f3, this.f1203e.width() - f5, -this.f1204f, this.f1202d);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.f1203e;
        canvas.translate(rectF2.right - f4, rectF2.bottom - f4);
        canvas.rotate(180.0f);
        canvas.drawPath(this.g, this.f1201c);
        if (z) {
            canvas.drawRect(0.0f, f3, this.f1203e.width() - f5, (-this.f1204f) + this.i, this.f1202d);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.f1203e;
        canvas.translate(rectF3.left + f4, rectF3.bottom - f4);
        canvas.rotate(270.0f);
        canvas.drawPath(this.g, this.f1201c);
        if (z2) {
            canvas.drawRect(0.0f, f3, this.f1203e.height() - f5, -this.f1204f, this.f1202d);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.f1203e;
        canvas.translate(rectF4.right - f4, rectF4.top + f4);
        canvas.rotate(90.0f);
        canvas.drawPath(this.g, this.f1201c);
        if (z2) {
            canvas.drawRect(0.0f, f3, this.f1203e.height() - f5, -this.f1204f, this.f1202d);
        }
        canvas.restoreToCount(save4);
    }

    private void n(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.k = colorStateList;
        this.f1200b.setColor(colorStateList.getColorForState(getState(), this.k.getDefaultColor()));
    }

    private void s(float f2, float f3) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f2 + ". Must be >= 0");
        } else if (f3 >= 0.0f) {
            float t = (float) t(f2);
            float t2 = (float) t(f3);
            if (t > t2) {
                if (!this.p) {
                    this.p = true;
                }
                t = t2;
            }
            if (this.j != t || this.h != t2) {
                this.j = t;
                this.h = t2;
                this.i = (float) ((int) ((t * 1.5f) + ((float) this.f1199a) + 0.5f));
                this.l = true;
                invalidateSelf();
            }
        } else {
            throw new IllegalArgumentException("Invalid max shadow size " + f3 + ". Must be >= 0");
        }
    }

    private int t(float f2) {
        int i2 = (int) (f2 + 0.5f);
        return i2 % 2 == 1 ? i2 - 1 : i2;
    }

    public void draw(Canvas canvas) {
        if (this.l) {
            a(getBounds());
            this.l = false;
        }
        canvas.translate(0.0f, this.j / 2.0f);
        e(canvas);
        canvas.translate(0.0f, (-this.j) / 2.0f);
        r.a(canvas, this.f1203e, this.f1204f, this.f1200b);
    }

    /* access modifiers changed from: package-private */
    public ColorStateList f() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public float g() {
        return this.f1204f;
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) d(this.h, this.f1204f, this.o));
        int ceil2 = (int) Math.ceil((double) c(this.h, this.f1204f, this.o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void h(Rect rect) {
        getPadding(rect);
    }

    /* access modifiers changed from: package-private */
    public float i() {
        return this.h;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: package-private */
    public float j() {
        float f2 = this.h;
        return (Math.max(f2, this.f1204f + ((float) this.f1199a) + ((f2 * 1.5f) / 2.0f)) * 2.0f) + (((this.h * 1.5f) + ((float) this.f1199a)) * 2.0f);
    }

    /* access modifiers changed from: package-private */
    public float k() {
        float f2 = this.h;
        return (Math.max(f2, this.f1204f + ((float) this.f1199a) + (f2 / 2.0f)) * 2.0f) + ((this.h + ((float) this.f1199a)) * 2.0f);
    }

    /* access modifiers changed from: package-private */
    public float l() {
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public void m(boolean z) {
        this.o = z;
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public void o(ColorStateList colorStateList) {
        n(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.l = true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f1200b.getColor() == colorForState) {
            return false;
        }
        this.f1200b.setColor(colorForState);
        this.l = true;
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: package-private */
    public void p(float f2) {
        if (f2 >= 0.0f) {
            float f3 = (float) ((int) (f2 + 0.5f));
            if (this.f1204f != f3) {
                this.f1204f = f3;
                this.l = true;
                invalidateSelf();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid radius " + f2 + ". Must be >= 0");
    }

    /* access modifiers changed from: package-private */
    public void q(float f2) {
        s(this.j, f2);
    }

    /* access modifiers changed from: package-private */
    public void r(float f2) {
        s(f2, this.h);
    }

    public void setAlpha(int i2) {
        this.f1200b.setAlpha(i2);
        this.f1201c.setAlpha(i2);
        this.f1202d.setAlpha(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1200b.setColorFilter(colorFilter);
    }
}
