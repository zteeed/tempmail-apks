package androidx.swiperefreshlayout.widget;

import a.h.j.h;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: CircularProgressDrawable */
public class b extends Drawable implements Animatable {
    private static final Interpolator h = new LinearInterpolator();
    private static final Interpolator i = new a.l.a.a.b();
    private static final int[] j = {-16777216};

    /* renamed from: b  reason: collision with root package name */
    private final c f1996b;

    /* renamed from: c  reason: collision with root package name */
    private float f1997c;

    /* renamed from: d  reason: collision with root package name */
    private Resources f1998d;

    /* renamed from: e  reason: collision with root package name */
    private Animator f1999e;

    /* renamed from: f  reason: collision with root package name */
    float f2000f;
    boolean g;

    /* compiled from: CircularProgressDrawable */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f2001a;

        a(c cVar) {
            this.f2001a = cVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.n(floatValue, this.f2001a);
            b.this.b(floatValue, this.f2001a, false);
            b.this.invalidateSelf();
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.b$b  reason: collision with other inner class name */
    /* compiled from: CircularProgressDrawable */
    class C0054b implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f2003a;

        C0054b(c cVar) {
            this.f2003a = cVar;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
            b.this.b(1.0f, this.f2003a, true);
            this.f2003a.A();
            this.f2003a.l();
            b bVar = b.this;
            if (bVar.g) {
                bVar.g = false;
                animator.cancel();
                animator.setDuration(1332);
                animator.start();
                this.f2003a.x(false);
                return;
            }
            bVar.f2000f += 1.0f;
        }

        public void onAnimationStart(Animator animator) {
            b.this.f2000f = 0.0f;
        }
    }

    /* compiled from: CircularProgressDrawable */
    private static class c {

        /* renamed from: a  reason: collision with root package name */
        final RectF f2005a = new RectF();

        /* renamed from: b  reason: collision with root package name */
        final Paint f2006b = new Paint();

        /* renamed from: c  reason: collision with root package name */
        final Paint f2007c = new Paint();

        /* renamed from: d  reason: collision with root package name */
        final Paint f2008d = new Paint();

        /* renamed from: e  reason: collision with root package name */
        float f2009e = 0.0f;

        /* renamed from: f  reason: collision with root package name */
        float f2010f = 0.0f;
        float g = 0.0f;
        float h = 5.0f;
        int[] i;
        int j;
        float k;
        float l;
        float m;
        boolean n;
        Path o;
        float p = 1.0f;
        float q;
        int r;
        int s;
        int t = 255;
        int u;

        c() {
            this.f2006b.setStrokeCap(Paint.Cap.SQUARE);
            this.f2006b.setAntiAlias(true);
            this.f2006b.setStyle(Paint.Style.STROKE);
            this.f2007c.setStyle(Paint.Style.FILL);
            this.f2007c.setAntiAlias(true);
            this.f2008d.setColor(0);
        }

        /* access modifiers changed from: package-private */
        public void A() {
            this.k = this.f2009e;
            this.l = this.f2010f;
            this.m = this.g;
        }

        /* access modifiers changed from: package-private */
        public void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f2005a;
            float f2 = this.q;
            float f3 = (this.h / 2.0f) + f2;
            if (f2 <= 0.0f) {
                f3 = (((float) Math.min(rect.width(), rect.height())) / 2.0f) - Math.max((((float) this.r) * this.p) / 2.0f, this.h / 2.0f);
            }
            rectF.set(((float) rect.centerX()) - f3, ((float) rect.centerY()) - f3, ((float) rect.centerX()) + f3, ((float) rect.centerY()) + f3);
            float f4 = this.f2009e;
            float f5 = this.g;
            float f6 = (f4 + f5) * 360.0f;
            float f7 = ((this.f2010f + f5) * 360.0f) - f6;
            this.f2006b.setColor(this.u);
            this.f2006b.setAlpha(this.t);
            float f8 = this.h / 2.0f;
            rectF.inset(f8, f8);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f2008d);
            float f9 = -f8;
            rectF.inset(f9, f9);
            canvas.drawArc(rectF, f6, f7, false, this.f2006b);
            b(canvas, f6, f7, rectF);
        }

        /* access modifiers changed from: package-private */
        public void b(Canvas canvas, float f2, float f3, RectF rectF) {
            if (this.n) {
                Path path = this.o;
                if (path == null) {
                    Path path2 = new Path();
                    this.o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                this.o.moveTo(0.0f, 0.0f);
                this.o.lineTo(((float) this.r) * this.p, 0.0f);
                Path path3 = this.o;
                float f4 = this.p;
                path3.lineTo((((float) this.r) * f4) / 2.0f, ((float) this.s) * f4);
                this.o.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((((float) this.r) * this.p) / 2.0f), rectF.centerY() + (this.h / 2.0f));
                this.o.close();
                this.f2007c.setColor(this.u);
                this.f2007c.setAlpha(this.t);
                canvas.save();
                canvas.rotate(f2 + f3, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.o, this.f2007c);
                canvas.restore();
            }
        }

        /* access modifiers changed from: package-private */
        public int c() {
            return this.t;
        }

        /* access modifiers changed from: package-private */
        public float d() {
            return this.f2010f;
        }

        /* access modifiers changed from: package-private */
        public int e() {
            return this.i[f()];
        }

        /* access modifiers changed from: package-private */
        public int f() {
            return (this.j + 1) % this.i.length;
        }

        /* access modifiers changed from: package-private */
        public float g() {
            return this.f2009e;
        }

        /* access modifiers changed from: package-private */
        public int h() {
            return this.i[this.j];
        }

        /* access modifiers changed from: package-private */
        public float i() {
            return this.l;
        }

        /* access modifiers changed from: package-private */
        public float j() {
            return this.m;
        }

        /* access modifiers changed from: package-private */
        public float k() {
            return this.k;
        }

        /* access modifiers changed from: package-private */
        public void l() {
            t(f());
        }

        /* access modifiers changed from: package-private */
        public void m() {
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 0.0f;
            y(0.0f);
            v(0.0f);
            w(0.0f);
        }

        /* access modifiers changed from: package-private */
        public void n(int i2) {
            this.t = i2;
        }

        /* access modifiers changed from: package-private */
        public void o(float f2, float f3) {
            this.r = (int) f2;
            this.s = (int) f3;
        }

        /* access modifiers changed from: package-private */
        public void p(float f2) {
            if (f2 != this.p) {
                this.p = f2;
            }
        }

        /* access modifiers changed from: package-private */
        public void q(float f2) {
            this.q = f2;
        }

        /* access modifiers changed from: package-private */
        public void r(int i2) {
            this.u = i2;
        }

        /* access modifiers changed from: package-private */
        public void s(ColorFilter colorFilter) {
            this.f2006b.setColorFilter(colorFilter);
        }

        /* access modifiers changed from: package-private */
        public void t(int i2) {
            this.j = i2;
            this.u = this.i[i2];
        }

        /* access modifiers changed from: package-private */
        public void u(int[] iArr) {
            this.i = iArr;
            t(0);
        }

        /* access modifiers changed from: package-private */
        public void v(float f2) {
            this.f2010f = f2;
        }

        /* access modifiers changed from: package-private */
        public void w(float f2) {
            this.g = f2;
        }

        /* access modifiers changed from: package-private */
        public void x(boolean z) {
            if (this.n != z) {
                this.n = z;
            }
        }

        /* access modifiers changed from: package-private */
        public void y(float f2) {
            this.f2009e = f2;
        }

        /* access modifiers changed from: package-private */
        public void z(float f2) {
            this.h = f2;
            this.f2006b.setStrokeWidth(f2);
        }
    }

    public b(Context context) {
        h.b(context);
        this.f1998d = context.getResources();
        c cVar = new c();
        this.f1996b = cVar;
        cVar.u(j);
        k(2.5f);
        m();
    }

    private void a(float f2, c cVar) {
        n(f2, cVar);
        cVar.y(cVar.k() + (((cVar.i() - 0.01f) - cVar.k()) * f2));
        cVar.v(cVar.i());
        cVar.w(cVar.j() + ((((float) (Math.floor((double) (cVar.j() / 0.8f)) + 1.0d)) - cVar.j()) * f2));
    }

    private int c(float f2, int i2, int i3) {
        int i4 = (i2 >> 24) & 255;
        int i5 = (i2 >> 16) & 255;
        int i6 = (i2 >> 8) & 255;
        int i7 = i2 & 255;
        return ((i4 + ((int) (((float) (((i3 >> 24) & 255) - i4)) * f2))) << 24) | ((i5 + ((int) (((float) (((i3 >> 16) & 255) - i5)) * f2))) << 16) | ((i6 + ((int) (((float) (((i3 >> 8) & 255) - i6)) * f2))) << 8) | (i7 + ((int) (f2 * ((float) ((i3 & 255) - i7)))));
    }

    private void h(float f2) {
        this.f1997c = f2;
    }

    private void i(float f2, float f3, float f4, float f5) {
        c cVar = this.f1996b;
        float f6 = this.f1998d.getDisplayMetrics().density;
        cVar.z(f3 * f6);
        cVar.q(f2 * f6);
        cVar.t(0);
        cVar.o(f4 * f6, f5 * f6);
    }

    private void m() {
        c cVar = this.f1996b;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new a(cVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(h);
        ofFloat.addListener(new C0054b(cVar));
        this.f1999e = ofFloat;
    }

    /* access modifiers changed from: package-private */
    public void b(float f2, c cVar, boolean z) {
        float f3;
        float f4;
        if (this.g) {
            a(f2, cVar);
        } else if (f2 != 1.0f || z) {
            float j2 = cVar.j();
            if (f2 < 0.5f) {
                f3 = cVar.k();
                f4 = (i.getInterpolation(f2 / 0.5f) * 0.79f) + 0.01f + f3;
            } else {
                float k = cVar.k() + 0.79f;
                float f5 = k;
                f3 = k - (((1.0f - i.getInterpolation((f2 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f4 = f5;
            }
            cVar.y(f3);
            cVar.v(f4);
            cVar.w(j2 + (0.20999998f * f2));
            h((f2 + this.f2000f) * 216.0f);
        }
    }

    public void d(boolean z) {
        this.f1996b.x(z);
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f1997c, bounds.exactCenterX(), bounds.exactCenterY());
        this.f1996b.a(canvas, bounds);
        canvas.restore();
    }

    public void e(float f2) {
        this.f1996b.p(f2);
        invalidateSelf();
    }

    public void f(int... iArr) {
        this.f1996b.u(iArr);
        this.f1996b.t(0);
        invalidateSelf();
    }

    public void g(float f2) {
        this.f1996b.w(f2);
        invalidateSelf();
    }

    public int getAlpha() {
        return this.f1996b.c();
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return this.f1999e.isRunning();
    }

    public void j(float f2, float f3) {
        this.f1996b.y(f2);
        this.f1996b.v(f3);
        invalidateSelf();
    }

    public void k(float f2) {
        this.f1996b.z(f2);
        invalidateSelf();
    }

    public void l(int i2) {
        if (i2 == 0) {
            i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public void n(float f2, c cVar) {
        if (f2 > 0.75f) {
            cVar.r(c((f2 - 0.75f) / 0.25f, cVar.h(), cVar.e()));
        } else {
            cVar.r(cVar.h());
        }
    }

    public void setAlpha(int i2) {
        this.f1996b.n(i2);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1996b.s(colorFilter);
        invalidateSelf();
    }

    public void start() {
        this.f1999e.cancel();
        this.f1996b.A();
        if (this.f1996b.d() != this.f1996b.g()) {
            this.g = true;
            this.f1999e.setDuration(666);
            this.f1999e.start();
            return;
        }
        this.f1996b.t(0);
        this.f1996b.m();
        this.f1999e.setDuration(1332);
        this.f1999e.start();
    }

    public void stop() {
        this.f1999e.cancel();
        h(0.0f);
        this.f1996b.x(false);
        this.f1996b.t(0);
        this.f1996b.m();
        invalidateSelf();
    }
}
