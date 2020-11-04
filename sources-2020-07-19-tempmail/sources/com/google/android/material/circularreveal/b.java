package com.google.android.material.circularreveal;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import com.google.android.material.circularreveal.c;

/* compiled from: CircularRevealHelper */
public class b {
    public static final int j;

    /* renamed from: a  reason: collision with root package name */
    private final a f10769a;

    /* renamed from: b  reason: collision with root package name */
    private final View f10770b;

    /* renamed from: c  reason: collision with root package name */
    private final Path f10771c = new Path();

    /* renamed from: d  reason: collision with root package name */
    private final Paint f10772d = new Paint(7);

    /* renamed from: e  reason: collision with root package name */
    private final Paint f10773e;

    /* renamed from: f  reason: collision with root package name */
    private c.e f10774f;
    private Drawable g;
    private boolean h;
    private boolean i;

    /* compiled from: CircularRevealHelper */
    interface a {
        void c(Canvas canvas);

        boolean d();
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            j = 2;
        } else if (i2 >= 18) {
            j = 1;
        } else {
            j = 0;
        }
    }

    public b(a aVar) {
        this.f10769a = aVar;
        View view = (View) aVar;
        this.f10770b = view;
        view.setWillNotDraw(false);
        Paint paint = new Paint(1);
        this.f10773e = paint;
        paint.setColor(0);
    }

    private void d(Canvas canvas) {
        if (o()) {
            Rect bounds = this.g.getBounds();
            float width = this.f10774f.f10779a - (((float) bounds.width()) / 2.0f);
            float height = this.f10774f.f10780b - (((float) bounds.height()) / 2.0f);
            canvas.translate(width, height);
            this.g.draw(canvas);
            canvas.translate(-width, -height);
        }
    }

    private float g(c.e eVar) {
        return b.c.a.d.p.a.b(eVar.f10779a, eVar.f10780b, 0.0f, 0.0f, (float) this.f10770b.getWidth(), (float) this.f10770b.getHeight());
    }

    private void i() {
        if (j == 1) {
            this.f10771c.rewind();
            c.e eVar = this.f10774f;
            if (eVar != null) {
                this.f10771c.addCircle(eVar.f10779a, eVar.f10780b, eVar.f10781c, Path.Direction.CW);
            }
        }
        this.f10770b.invalidate();
    }

    private boolean n() {
        c.e eVar = this.f10774f;
        boolean z = eVar == null || eVar.a();
        if (j != 0) {
            return !z;
        }
        if (z || !this.i) {
            return false;
        }
        return true;
    }

    private boolean o() {
        return (this.h || this.g == null || this.f10774f == null) ? false : true;
    }

    private boolean p() {
        return !this.h && Color.alpha(this.f10773e.getColor()) != 0;
    }

    public void a() {
        if (j == 0) {
            this.h = true;
            this.i = false;
            this.f10770b.buildDrawingCache();
            Bitmap drawingCache = this.f10770b.getDrawingCache();
            if (!(drawingCache != null || this.f10770b.getWidth() == 0 || this.f10770b.getHeight() == 0)) {
                drawingCache = Bitmap.createBitmap(this.f10770b.getWidth(), this.f10770b.getHeight(), Bitmap.Config.ARGB_8888);
                this.f10770b.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                Paint paint = this.f10772d;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.h = false;
            this.i = true;
        }
    }

    public void b() {
        if (j == 0) {
            this.i = false;
            this.f10770b.destroyDrawingCache();
            this.f10772d.setShader((Shader) null);
            this.f10770b.invalidate();
        }
    }

    public void c(Canvas canvas) {
        if (n()) {
            int i2 = j;
            if (i2 == 0) {
                c.e eVar = this.f10774f;
                canvas.drawCircle(eVar.f10779a, eVar.f10780b, eVar.f10781c, this.f10772d);
                if (p()) {
                    c.e eVar2 = this.f10774f;
                    canvas.drawCircle(eVar2.f10779a, eVar2.f10780b, eVar2.f10781c, this.f10773e);
                }
            } else if (i2 == 1) {
                int save = canvas.save();
                canvas.clipPath(this.f10771c);
                this.f10769a.c(canvas);
                if (p()) {
                    canvas.drawRect(0.0f, 0.0f, (float) this.f10770b.getWidth(), (float) this.f10770b.getHeight(), this.f10773e);
                }
                canvas.restoreToCount(save);
            } else if (i2 == 2) {
                this.f10769a.c(canvas);
                if (p()) {
                    canvas.drawRect(0.0f, 0.0f, (float) this.f10770b.getWidth(), (float) this.f10770b.getHeight(), this.f10773e);
                }
            } else {
                throw new IllegalStateException("Unsupported strategy " + j);
            }
        } else {
            this.f10769a.c(canvas);
            if (p()) {
                canvas.drawRect(0.0f, 0.0f, (float) this.f10770b.getWidth(), (float) this.f10770b.getHeight(), this.f10773e);
            }
        }
        d(canvas);
    }

    public Drawable e() {
        return this.g;
    }

    public int f() {
        return this.f10773e.getColor();
    }

    public c.e h() {
        c.e eVar = this.f10774f;
        if (eVar == null) {
            return null;
        }
        c.e eVar2 = new c.e(eVar);
        if (eVar2.a()) {
            eVar2.f10781c = g(eVar2);
        }
        return eVar2;
    }

    public boolean j() {
        return this.f10769a.d() && !n();
    }

    public void k(Drawable drawable) {
        this.g = drawable;
        this.f10770b.invalidate();
    }

    public void l(int i2) {
        this.f10773e.setColor(i2);
        this.f10770b.invalidate();
    }

    public void m(c.e eVar) {
        if (eVar == null) {
            this.f10774f = null;
        } else {
            c.e eVar2 = this.f10774f;
            if (eVar2 == null) {
                this.f10774f = new c.e(eVar);
            } else {
                eVar2.c(eVar);
            }
            if (b.c.a.d.p.a.c(eVar.f10781c, g(eVar), 1.0E-4f)) {
                this.f10774f.f10781c = Float.MAX_VALUE;
            }
        }
        i();
    }
}
