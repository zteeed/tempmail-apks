package com.google.android.material.internal;

import a.a.j;
import a.h.i.e;
import a.h.k.d;
import a.h.k.t;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.widget.b0;
import b.c.a.d.l.a;

/* compiled from: CollapsingTextHelper */
public final class c {
    private static final boolean T = (Build.VERSION.SDK_INT < 18);
    private static final Paint U;
    private Paint A;
    private float B;
    private float C;
    private float D;
    private float E;
    private int[] F;
    private boolean G;
    private final TextPaint H;
    private final TextPaint I;
    private TimeInterpolator J;
    private TimeInterpolator K;
    private float L;
    private float M;
    private float N;
    private int O;
    private float P;
    private float Q;
    private float R;
    private int S;

    /* renamed from: a  reason: collision with root package name */
    private final View f10833a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f10834b;

    /* renamed from: c  reason: collision with root package name */
    private float f10835c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f10836d;

    /* renamed from: e  reason: collision with root package name */
    private final Rect f10837e;

    /* renamed from: f  reason: collision with root package name */
    private final RectF f10838f;
    private int g = 16;
    private int h = 16;
    private float i = 15.0f;
    private float j = 15.0f;
    private ColorStateList k;
    private ColorStateList l;
    private float m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private Typeface s;
    private Typeface t;
    private Typeface u;
    private CharSequence v;
    private CharSequence w;
    private boolean x;
    private boolean y;
    private Bitmap z;

    static {
        Paint paint = null;
        U = paint;
        if (paint != null) {
            paint.setAntiAlias(true);
            U.setColor(-65281);
        }
    }

    public c(View view) {
        this.f10833a = view;
        this.H = new TextPaint(129);
        this.I = new TextPaint(this.H);
        this.f10837e = new Rect();
        this.f10836d = new Rect();
        this.f10838f = new RectF();
    }

    private Typeface B(int i2) {
        TypedArray obtainStyledAttributes = this.f10833a.getContext().obtainStyledAttributes(i2, new int[]{16843692});
        try {
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                return Typeface.create(string, 0);
            }
            obtainStyledAttributes.recycle();
            return null;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private static boolean D(Rect rect, int i2, int i3, int i4, int i5) {
        return rect.left == i2 && rect.top == i3 && rect.right == i4 && rect.bottom == i5;
    }

    private void Q(float f2) {
        g(f2);
        boolean z2 = T && this.D != 1.0f;
        this.y = z2;
        if (z2) {
            j();
        }
        t.T(this.f10833a);
    }

    private static int a(int i2, int i3, float f2) {
        float f3 = 1.0f - f2;
        return Color.argb((int) ((((float) Color.alpha(i2)) * f3) + (((float) Color.alpha(i3)) * f2)), (int) ((((float) Color.red(i2)) * f3) + (((float) Color.red(i3)) * f2)), (int) ((((float) Color.green(i2)) * f3) + (((float) Color.green(i3)) * f2)), (int) ((((float) Color.blue(i2)) * f3) + (((float) Color.blue(i3)) * f2)));
    }

    private void b() {
        float f2 = this.E;
        g(this.j);
        CharSequence charSequence = this.w;
        float f3 = 0.0f;
        float measureText = charSequence != null ? this.H.measureText(charSequence, 0, charSequence.length()) : 0.0f;
        int b2 = d.b(this.h, this.x ? 1 : 0);
        int i2 = b2 & 112;
        if (i2 == 48) {
            this.n = ((float) this.f10837e.top) - this.H.ascent();
        } else if (i2 != 80) {
            this.n = ((float) this.f10837e.centerY()) + (((this.H.descent() - this.H.ascent()) / 2.0f) - this.H.descent());
        } else {
            this.n = (float) this.f10837e.bottom;
        }
        int i3 = b2 & 8388615;
        if (i3 == 1) {
            this.p = ((float) this.f10837e.centerX()) - (measureText / 2.0f);
        } else if (i3 != 5) {
            this.p = (float) this.f10837e.left;
        } else {
            this.p = ((float) this.f10837e.right) - measureText;
        }
        g(this.i);
        CharSequence charSequence2 = this.w;
        if (charSequence2 != null) {
            f3 = this.H.measureText(charSequence2, 0, charSequence2.length());
        }
        int b3 = d.b(this.g, this.x ? 1 : 0);
        int i4 = b3 & 112;
        if (i4 == 48) {
            this.m = ((float) this.f10836d.top) - this.H.ascent();
        } else if (i4 != 80) {
            this.m = ((float) this.f10836d.centerY()) + (((this.H.descent() - this.H.ascent()) / 2.0f) - this.H.descent());
        } else {
            this.m = (float) this.f10836d.bottom;
        }
        int i5 = b3 & 8388615;
        if (i5 == 1) {
            this.o = ((float) this.f10836d.centerX()) - (f3 / 2.0f);
        } else if (i5 != 5) {
            this.o = (float) this.f10836d.left;
        } else {
            this.o = ((float) this.f10836d.right) - f3;
        }
        h();
        Q(f2);
    }

    private void d() {
        f(this.f10835c);
    }

    private boolean e(CharSequence charSequence) {
        boolean z2 = true;
        if (t.t(this.f10833a) != 1) {
            z2 = false;
        }
        return (z2 ? e.f342d : e.f341c).a(charSequence, 0, charSequence.length());
    }

    private void f(float f2) {
        w(f2);
        this.q = z(this.o, this.p, f2, this.J);
        this.r = z(this.m, this.n, f2, this.J);
        Q(z(this.i, this.j, f2, this.K));
        if (this.l != this.k) {
            this.H.setColor(a(q(), p(), f2));
        } else {
            this.H.setColor(p());
        }
        this.H.setShadowLayer(z(this.P, this.L, f2, (TimeInterpolator) null), z(this.Q, this.M, f2, (TimeInterpolator) null), z(this.R, this.N, f2, (TimeInterpolator) null), a(this.S, this.O, f2));
        t.T(this.f10833a);
    }

    private void g(float f2) {
        float f3;
        boolean z2;
        boolean z3;
        if (this.v != null) {
            float width = (float) this.f10837e.width();
            float width2 = (float) this.f10836d.width();
            boolean z4 = true;
            if (x(f2, this.j)) {
                f3 = this.j;
                this.D = 1.0f;
                Typeface typeface = this.u;
                Typeface typeface2 = this.s;
                if (typeface != typeface2) {
                    this.u = typeface2;
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                float f4 = this.i;
                Typeface typeface3 = this.u;
                Typeface typeface4 = this.t;
                if (typeface3 != typeface4) {
                    this.u = typeface4;
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x(f2, this.i)) {
                    this.D = 1.0f;
                } else {
                    this.D = f2 / this.i;
                }
                float f5 = this.j / this.i;
                width = width2 * f5 > width ? Math.min(width / f5, width2) : width2;
                f3 = f4;
                z2 = z3;
            }
            if (width > 0.0f) {
                z2 = this.E != f3 || this.G || z2;
                this.E = f3;
                this.G = false;
            }
            if (this.w == null || z2) {
                this.H.setTextSize(this.E);
                this.H.setTypeface(this.u);
                TextPaint textPaint = this.H;
                if (this.D == 1.0f) {
                    z4 = false;
                }
                textPaint.setLinearText(z4);
                CharSequence ellipsize = TextUtils.ellipsize(this.v, this.H, width, TextUtils.TruncateAt.END);
                if (!TextUtils.equals(ellipsize, this.w)) {
                    this.w = ellipsize;
                    this.x = e(ellipsize);
                }
            }
        }
    }

    private void h() {
        Bitmap bitmap = this.z;
        if (bitmap != null) {
            bitmap.recycle();
            this.z = null;
        }
    }

    private void j() {
        if (this.z == null && !this.f10836d.isEmpty() && !TextUtils.isEmpty(this.w)) {
            f(0.0f);
            this.B = this.H.ascent();
            this.C = this.H.descent();
            TextPaint textPaint = this.H;
            CharSequence charSequence = this.w;
            int round = Math.round(textPaint.measureText(charSequence, 0, charSequence.length()));
            int round2 = Math.round(this.C - this.B);
            if (round > 0 && round2 > 0) {
                this.z = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(this.z);
                CharSequence charSequence2 = this.w;
                canvas.drawText(charSequence2, 0, charSequence2.length(), 0.0f, ((float) round2) - this.H.descent(), this.H);
                if (this.A == null) {
                    this.A = new Paint(3);
                }
            }
        }
    }

    private int q() {
        int[] iArr = this.F;
        if (iArr != null) {
            return this.k.getColorForState(iArr, 0);
        }
        return this.k.getDefaultColor();
    }

    private void v(TextPaint textPaint) {
        textPaint.setTextSize(this.j);
        textPaint.setTypeface(this.s);
    }

    private void w(float f2) {
        this.f10838f.left = z((float) this.f10836d.left, (float) this.f10837e.left, f2, this.J);
        this.f10838f.top = z(this.m, this.n, f2, this.J);
        this.f10838f.right = z((float) this.f10836d.right, (float) this.f10837e.right, f2, this.J);
        this.f10838f.bottom = z((float) this.f10836d.bottom, (float) this.f10837e.bottom, f2, this.J);
    }

    private static boolean x(float f2, float f3) {
        return Math.abs(f2 - f3) < 0.001f;
    }

    private static float z(float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        return a.a(f2, f3, f4);
    }

    /* access modifiers changed from: package-private */
    public void A() {
        this.f10834b = this.f10837e.width() > 0 && this.f10837e.height() > 0 && this.f10836d.width() > 0 && this.f10836d.height() > 0;
    }

    public void C() {
        if (this.f10833a.getHeight() > 0 && this.f10833a.getWidth() > 0) {
            b();
            d();
        }
    }

    public void E(int i2, int i3, int i4, int i5) {
        if (!D(this.f10837e, i2, i3, i4, i5)) {
            this.f10837e.set(i2, i3, i4, i5);
            this.G = true;
            A();
        }
    }

    public void F(int i2) {
        b0 s2 = b0.s(this.f10833a.getContext(), i2, j.TextAppearance);
        if (s2.r(j.TextAppearance_android_textColor)) {
            this.l = s2.c(j.TextAppearance_android_textColor);
        }
        if (s2.r(j.TextAppearance_android_textSize)) {
            this.j = (float) s2.f(j.TextAppearance_android_textSize, (int) this.j);
        }
        this.O = s2.k(j.TextAppearance_android_shadowColor, 0);
        this.M = s2.i(j.TextAppearance_android_shadowDx, 0.0f);
        this.N = s2.i(j.TextAppearance_android_shadowDy, 0.0f);
        this.L = s2.i(j.TextAppearance_android_shadowRadius, 0.0f);
        s2.v();
        if (Build.VERSION.SDK_INT >= 16) {
            this.s = B(i2);
        }
        C();
    }

    public void G(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            C();
        }
    }

    public void H(int i2) {
        if (this.h != i2) {
            this.h = i2;
            C();
        }
    }

    public void I(Typeface typeface) {
        if (this.s != typeface) {
            this.s = typeface;
            C();
        }
    }

    public void J(int i2, int i3, int i4, int i5) {
        if (!D(this.f10836d, i2, i3, i4, i5)) {
            this.f10836d.set(i2, i3, i4, i5);
            this.G = true;
            A();
        }
    }

    public void K(int i2) {
        b0 s2 = b0.s(this.f10833a.getContext(), i2, j.TextAppearance);
        if (s2.r(j.TextAppearance_android_textColor)) {
            this.k = s2.c(j.TextAppearance_android_textColor);
        }
        if (s2.r(j.TextAppearance_android_textSize)) {
            this.i = (float) s2.f(j.TextAppearance_android_textSize, (int) this.i);
        }
        this.S = s2.k(j.TextAppearance_android_shadowColor, 0);
        this.Q = s2.i(j.TextAppearance_android_shadowDx, 0.0f);
        this.R = s2.i(j.TextAppearance_android_shadowDy, 0.0f);
        this.P = s2.i(j.TextAppearance_android_shadowRadius, 0.0f);
        s2.v();
        if (Build.VERSION.SDK_INT >= 16) {
            this.t = B(i2);
        }
        C();
    }

    public void L(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            C();
        }
    }

    public void M(int i2) {
        if (this.g != i2) {
            this.g = i2;
            C();
        }
    }

    public void N(float f2) {
        if (this.i != f2) {
            this.i = f2;
            C();
        }
    }

    public void O(Typeface typeface) {
        if (this.t != typeface) {
            this.t = typeface;
            C();
        }
    }

    public void P(float f2) {
        float a2 = a.h.g.a.a(f2, 0.0f, 1.0f);
        if (a2 != this.f10835c) {
            this.f10835c = a2;
            d();
        }
    }

    public void R(TimeInterpolator timeInterpolator) {
        this.J = timeInterpolator;
        C();
    }

    public final boolean S(int[] iArr) {
        this.F = iArr;
        if (!y()) {
            return false;
        }
        C();
        return true;
    }

    public void T(CharSequence charSequence) {
        if (charSequence == null || !charSequence.equals(this.v)) {
            this.v = charSequence;
            this.w = null;
            h();
            C();
        }
    }

    public void U(TimeInterpolator timeInterpolator) {
        this.K = timeInterpolator;
        C();
    }

    public void V(Typeface typeface) {
        this.t = typeface;
        this.s = typeface;
        C();
    }

    public float c() {
        if (this.v == null) {
            return 0.0f;
        }
        v(this.I);
        TextPaint textPaint = this.I;
        CharSequence charSequence = this.v;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public void i(Canvas canvas) {
        float f2;
        int save = canvas.save();
        if (this.w != null && this.f10834b) {
            float f3 = this.q;
            float f4 = this.r;
            boolean z2 = this.y && this.z != null;
            if (z2) {
                f2 = this.B * this.D;
            } else {
                f2 = this.H.ascent() * this.D;
                this.H.descent();
            }
            if (z2) {
                f4 += f2;
            }
            float f5 = f4;
            float f6 = this.D;
            if (f6 != 1.0f) {
                canvas.scale(f6, f6, f3, f5);
            }
            if (z2) {
                canvas.drawBitmap(this.z, f3, f5, this.A);
            } else {
                CharSequence charSequence = this.w;
                canvas.drawText(charSequence, 0, charSequence.length(), f3, f5, this.H);
            }
        }
        canvas.restoreToCount(save);
    }

    public void k(RectF rectF) {
        float f2;
        boolean e2 = e(this.v);
        Rect rect = this.f10837e;
        if (!e2) {
            f2 = (float) rect.left;
        } else {
            f2 = ((float) rect.right) - c();
        }
        rectF.left = f2;
        Rect rect2 = this.f10837e;
        rectF.top = (float) rect2.top;
        rectF.right = !e2 ? f2 + c() : (float) rect2.right;
        rectF.bottom = ((float) this.f10837e.top) + n();
    }

    public ColorStateList l() {
        return this.l;
    }

    public int m() {
        return this.h;
    }

    public float n() {
        v(this.I);
        return -this.I.ascent();
    }

    public Typeface o() {
        Typeface typeface = this.s;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int p() {
        int[] iArr = this.F;
        if (iArr != null) {
            return this.l.getColorForState(iArr, 0);
        }
        return this.l.getDefaultColor();
    }

    public int r() {
        return this.g;
    }

    public Typeface s() {
        Typeface typeface = this.t;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public float t() {
        return this.f10835c;
    }

    public CharSequence u() {
        return this.v;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.k;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean y() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.l
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0014
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.k
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0016
        L_0x0014:
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.c.y():boolean");
    }
}
