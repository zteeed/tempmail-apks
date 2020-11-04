package b.c.a.d.t;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.b;

/* compiled from: MaterialShapeDrawable */
public class c extends Drawable implements b {
    private ColorStateList A;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f2408b = new Paint();

    /* renamed from: c  reason: collision with root package name */
    private final Matrix[] f2409c = new Matrix[4];

    /* renamed from: d  reason: collision with root package name */
    private final Matrix[] f2410d = new Matrix[4];

    /* renamed from: e  reason: collision with root package name */
    private final d[] f2411e = new d[4];

    /* renamed from: f  reason: collision with root package name */
    private final Matrix f2412f = new Matrix();
    private final Path g = new Path();
    private final PointF h = new PointF();
    private final d i = new d();
    private final Region j = new Region();
    private final Region k = new Region();
    private final float[] l = new float[2];
    private final float[] m = new float[2];
    private e n = null;
    private boolean o;
    private boolean p;
    private float q;
    private int r;
    private int s;
    private int t;
    private int u;
    private float v;
    private float w;
    private Paint.Style x;
    private PorterDuffColorFilter y;
    private PorterDuff.Mode z;

    public c(e eVar) {
        this.o = false;
        this.p = false;
        this.q = 1.0f;
        this.r = -16777216;
        this.s = 5;
        this.t = 10;
        this.u = 255;
        this.v = 1.0f;
        this.w = 0.0f;
        this.x = Paint.Style.FILL_AND_STROKE;
        this.z = PorterDuff.Mode.SRC_IN;
        this.A = null;
        this.n = eVar;
        for (int i2 = 0; i2 < 4; i2++) {
            this.f2409c[i2] = new Matrix();
            this.f2410d[i2] = new Matrix();
            this.f2411e[i2] = new d();
        }
    }

    private float a(int i2, int i3, int i4) {
        e(((i2 - 1) + 4) % 4, i3, i4, this.h);
        PointF pointF = this.h;
        float f2 = pointF.x;
        float f3 = pointF.y;
        e((i2 + 1) % 4, i3, i4, pointF);
        PointF pointF2 = this.h;
        float f4 = pointF2.x;
        float f5 = pointF2.y;
        e(i2, i3, i4, pointF2);
        PointF pointF3 = this.h;
        float f6 = pointF3.x;
        float f7 = pointF3.y;
        float atan2 = ((float) Math.atan2((double) (f3 - f7), (double) (f2 - f6))) - ((float) Math.atan2((double) (f5 - f7), (double) (f4 - f6)));
        return atan2 < 0.0f ? (float) (((double) atan2) + 6.283185307179586d) : atan2;
    }

    private float b(int i2, int i3, int i4) {
        e(i2, i3, i4, this.h);
        PointF pointF = this.h;
        float f2 = pointF.x;
        float f3 = pointF.y;
        e((i2 + 1) % 4, i3, i4, pointF);
        PointF pointF2 = this.h;
        return (float) Math.atan2((double) (pointF2.y - f3), (double) (pointF2.x - f2));
    }

    private void c(int i2, Path path) {
        float[] fArr = this.l;
        d[] dVarArr = this.f2411e;
        fArr[0] = dVarArr[i2].f2413a;
        fArr[1] = dVarArr[i2].f2414b;
        this.f2409c[i2].mapPoints(fArr);
        if (i2 == 0) {
            float[] fArr2 = this.l;
            path.moveTo(fArr2[0], fArr2[1]);
        } else {
            float[] fArr3 = this.l;
            path.lineTo(fArr3[0], fArr3[1]);
        }
        this.f2411e[i2].b(this.f2409c[i2], path);
    }

    private void d(int i2, Path path) {
        int i3 = (i2 + 1) % 4;
        float[] fArr = this.l;
        d[] dVarArr = this.f2411e;
        fArr[0] = dVarArr[i2].f2415c;
        fArr[1] = dVarArr[i2].f2416d;
        this.f2409c[i2].mapPoints(fArr);
        float[] fArr2 = this.m;
        d[] dVarArr2 = this.f2411e;
        fArr2[0] = dVarArr2[i3].f2413a;
        fArr2[1] = dVarArr2[i3].f2414b;
        this.f2409c[i3].mapPoints(fArr2);
        float[] fArr3 = this.l;
        float f2 = fArr3[0];
        float[] fArr4 = this.m;
        this.i.d(0.0f, 0.0f);
        g(i2).a((float) Math.hypot((double) (f2 - fArr4[0]), (double) (fArr3[1] - fArr4[1])), this.q, this.i);
        this.i.b(this.f2410d[i2], path);
    }

    private void e(int i2, int i3, int i4, PointF pointF) {
        if (i2 == 1) {
            pointF.set((float) i3, 0.0f);
        } else if (i2 == 2) {
            pointF.set((float) i3, (float) i4);
        } else if (i2 != 3) {
            pointF.set(0.0f, 0.0f);
        } else {
            pointF.set(0.0f, (float) i4);
        }
    }

    private a f(int i2) {
        if (i2 == 1) {
            return this.n.h();
        }
        if (i2 == 2) {
            return this.n.c();
        }
        if (i2 != 3) {
            return this.n.g();
        }
        return this.n.b();
    }

    private b g(int i2) {
        if (i2 == 1) {
            return this.n.e();
        }
        if (i2 == 2) {
            return this.n.a();
        }
        if (i2 != 3) {
            return this.n.f();
        }
        return this.n.d();
    }

    private void i(int i2, int i3, Path path) {
        j(i2, i3, path);
        if (this.v != 1.0f) {
            this.f2412f.reset();
            Matrix matrix = this.f2412f;
            float f2 = this.v;
            matrix.setScale(f2, f2, (float) (i2 / 2), (float) (i3 / 2));
            path.transform(this.f2412f);
        }
    }

    private static int l(int i2, int i3) {
        return (i2 * (i3 + (i3 >>> 7))) >>> 8;
    }

    private void m(int i2, int i3, int i4) {
        e(i2, i3, i4, this.h);
        f(i2).a(a(i2, i3, i4), this.q, this.f2411e[i2]);
        this.f2409c[i2].reset();
        Matrix matrix = this.f2409c[i2];
        PointF pointF = this.h;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f2409c[i2].preRotate((float) Math.toDegrees((double) (b(((i2 - 1) + 4) % 4, i3, i4) + 1.5707964f)));
    }

    private void n(int i2, int i3, int i4) {
        float[] fArr = this.l;
        d[] dVarArr = this.f2411e;
        fArr[0] = dVarArr[i2].f2415c;
        fArr[1] = dVarArr[i2].f2416d;
        this.f2409c[i2].mapPoints(fArr);
        float b2 = b(i2, i3, i4);
        this.f2410d[i2].reset();
        Matrix matrix = this.f2410d[i2];
        float[] fArr2 = this.l;
        matrix.setTranslate(fArr2[0], fArr2[1]);
        this.f2410d[i2].preRotate((float) Math.toDegrees((double) b2));
    }

    private void r() {
        ColorStateList colorStateList = this.A;
        if (colorStateList == null || this.z == null) {
            this.y = null;
            return;
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        this.y = new PorterDuffColorFilter(colorForState, this.z);
        if (this.p) {
            this.r = colorForState;
        }
    }

    public void draw(Canvas canvas) {
        this.f2408b.setColorFilter(this.y);
        int alpha = this.f2408b.getAlpha();
        this.f2408b.setAlpha(l(alpha, this.u));
        this.f2408b.setStrokeWidth(this.w);
        this.f2408b.setStyle(this.x);
        int i2 = this.s;
        if (i2 > 0 && this.o) {
            this.f2408b.setShadowLayer((float) this.t, 0.0f, (float) i2, this.r);
        }
        if (this.n != null) {
            i(canvas.getWidth(), canvas.getHeight(), this.g);
            canvas.drawPath(this.g, this.f2408b);
        } else {
            canvas.drawRect(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), this.f2408b);
        }
        this.f2408b.setAlpha(alpha);
    }

    public int getOpacity() {
        return -3;
    }

    public Region getTransparentRegion() {
        Rect bounds = getBounds();
        this.j.set(bounds);
        i(bounds.width(), bounds.height(), this.g);
        this.k.setPath(this.g, this.j);
        this.j.op(this.k, Region.Op.DIFFERENCE);
        return this.j;
    }

    public float h() {
        return this.q;
    }

    public void j(int i2, int i3, Path path) {
        path.rewind();
        if (this.n != null) {
            for (int i4 = 0; i4 < 4; i4++) {
                m(i4, i2, i3);
                n(i4, i2, i3);
            }
            for (int i5 = 0; i5 < 4; i5++) {
                c(i5, path);
                d(i5, path);
            }
            path.close();
        }
    }

    public ColorStateList k() {
        return this.A;
    }

    public void o(float f2) {
        this.q = f2;
        invalidateSelf();
    }

    public void p(Paint.Style style) {
        this.x = style;
        invalidateSelf();
    }

    public void q(boolean z2) {
        this.o = z2;
        invalidateSelf();
    }

    public void setAlpha(int i2) {
        this.u = i2;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2408b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.A = colorStateList;
        r();
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.z = mode;
        r();
        invalidateSelf();
    }
}
