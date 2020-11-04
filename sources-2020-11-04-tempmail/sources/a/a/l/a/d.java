package a.a.l.a;

import a.a.a;
import a.a.i;
import a.a.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* compiled from: DrawerArrowDrawable */
public class d extends Drawable {
    private static final float m = ((float) Math.toRadians(45.0d));

    /* renamed from: a  reason: collision with root package name */
    private final Paint f27a = new Paint();

    /* renamed from: b  reason: collision with root package name */
    private float f28b;

    /* renamed from: c  reason: collision with root package name */
    private float f29c;

    /* renamed from: d  reason: collision with root package name */
    private float f30d;

    /* renamed from: e  reason: collision with root package name */
    private float f31e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f32f;
    private final Path g = new Path();
    private final int h;
    private boolean i = false;
    private float j;
    private float k;
    private int l = 2;

    public d(Context context) {
        this.f27a.setStyle(Paint.Style.STROKE);
        this.f27a.setStrokeJoin(Paint.Join.MITER);
        this.f27a.setStrokeCap(Paint.Cap.BUTT);
        this.f27a.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, j.DrawerArrowToggle, a.drawerArrowStyle, i.Base_Widget_AppCompat_DrawerArrowToggle);
        c(obtainStyledAttributes.getColor(j.DrawerArrowToggle_color, 0));
        b(obtainStyledAttributes.getDimension(j.DrawerArrowToggle_thickness, 0.0f));
        f(obtainStyledAttributes.getBoolean(j.DrawerArrowToggle_spinBars, true));
        d((float) Math.round(obtainStyledAttributes.getDimension(j.DrawerArrowToggle_gapBetweenBars, 0.0f)));
        this.h = obtainStyledAttributes.getDimensionPixelSize(j.DrawerArrowToggle_drawableSize, 0);
        this.f29c = (float) Math.round(obtainStyledAttributes.getDimension(j.DrawerArrowToggle_barLength, 0.0f));
        this.f28b = (float) Math.round(obtainStyledAttributes.getDimension(j.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.f30d = obtainStyledAttributes.getDimension(j.DrawerArrowToggle_arrowShaftLength, 0.0f);
        obtainStyledAttributes.recycle();
    }

    private static float a(float f2, float f3, float f4) {
        return f2 + ((f3 - f2) * f4);
    }

    public void b(float f2) {
        if (this.f27a.getStrokeWidth() != f2) {
            this.f27a.setStrokeWidth(f2);
            this.k = (float) (((double) (f2 / 2.0f)) * Math.cos((double) m));
            invalidateSelf();
        }
    }

    public void c(int i2) {
        if (i2 != this.f27a.getColor()) {
            this.f27a.setColor(i2);
            invalidateSelf();
        }
    }

    public void d(float f2) {
        if (f2 != this.f31e) {
            this.f31e = f2;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int i2 = this.l;
        boolean z = false;
        if (i2 != 0 && (i2 == 1 || (i2 == 3 ? androidx.core.graphics.drawable.a.f(this) == 0 : androidx.core.graphics.drawable.a.f(this) == 1))) {
            z = true;
        }
        float f2 = this.f28b;
        float a2 = a(this.f29c, (float) Math.sqrt((double) (f2 * f2 * 2.0f)), this.j);
        float a3 = a(this.f29c, this.f30d, this.j);
        float round = (float) Math.round(a(0.0f, this.k, this.j));
        float a4 = a(0.0f, m, this.j);
        double d2 = (double) a2;
        float a5 = a(z ? 0.0f : -180.0f, z ? 180.0f : 0.0f, this.j);
        double d3 = (double) a4;
        boolean z2 = z;
        float round2 = (float) Math.round(Math.cos(d3) * d2);
        float round3 = (float) Math.round(d2 * Math.sin(d3));
        this.g.rewind();
        float a6 = a(this.f31e + this.f27a.getStrokeWidth(), -this.k, this.j);
        float f3 = (-a3) / 2.0f;
        this.g.moveTo(f3 + round, 0.0f);
        this.g.rLineTo(a3 - (round * 2.0f), 0.0f);
        this.g.moveTo(f3, a6);
        this.g.rLineTo(round2, round3);
        this.g.moveTo(f3, -a6);
        this.g.rLineTo(round2, -round3);
        this.g.close();
        canvas.save();
        float strokeWidth = this.f27a.getStrokeWidth();
        float height = ((float) bounds.height()) - (3.0f * strokeWidth);
        float f4 = this.f31e;
        canvas2.translate((float) bounds.centerX(), ((float) ((((int) (height - (2.0f * f4))) / 4) * 2)) + (strokeWidth * 1.5f) + f4);
        if (this.f32f) {
            canvas2.rotate(a5 * ((float) (this.i ^ z2 ? -1 : 1)));
        } else if (z2) {
            canvas2.rotate(180.0f);
        }
        canvas2.drawPath(this.g, this.f27a);
        canvas.restore();
    }

    public void e(float f2) {
        if (this.j != f2) {
            this.j = f2;
            invalidateSelf();
        }
    }

    public void f(boolean z) {
        if (this.f32f != z) {
            this.f32f = z;
            invalidateSelf();
        }
    }

    public void g(boolean z) {
        if (this.i != z) {
            this.i = z;
            invalidateSelf();
        }
    }

    public int getIntrinsicHeight() {
        return this.h;
    }

    public int getIntrinsicWidth() {
        return this.h;
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i2) {
        if (i2 != this.f27a.getAlpha()) {
            this.f27a.setAlpha(i2);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f27a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
