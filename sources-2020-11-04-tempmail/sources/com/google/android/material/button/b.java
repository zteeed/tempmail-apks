package com.google.android.material.button;

import a.h.k.u;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.core.graphics.drawable.a;
import b.c.a.d.k;
import com.google.android.material.internal.l;

/* compiled from: MaterialButtonHelper */
class b {
    private static final boolean w = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: a  reason: collision with root package name */
    private final MaterialButton f10925a;

    /* renamed from: b  reason: collision with root package name */
    private int f10926b;

    /* renamed from: c  reason: collision with root package name */
    private int f10927c;

    /* renamed from: d  reason: collision with root package name */
    private int f10928d;

    /* renamed from: e  reason: collision with root package name */
    private int f10929e;

    /* renamed from: f  reason: collision with root package name */
    private int f10930f;
    private int g;
    private PorterDuff.Mode h;
    private ColorStateList i;
    private ColorStateList j;
    private ColorStateList k;
    private final Paint l = new Paint(1);
    private final Rect m = new Rect();
    private final RectF n = new RectF();
    private GradientDrawable o;
    private Drawable p;
    private GradientDrawable q;
    private Drawable r;
    private GradientDrawable s;
    private GradientDrawable t;
    private GradientDrawable u;
    private boolean v = false;

    public b(MaterialButton materialButton) {
        this.f10925a = materialButton;
    }

    private Drawable a() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.o = gradientDrawable;
        gradientDrawable.setCornerRadius(((float) this.f10930f) + 1.0E-5f);
        this.o.setColor(-1);
        Drawable r2 = a.r(this.o);
        this.p = r2;
        a.o(r2, this.i);
        PorterDuff.Mode mode = this.h;
        if (mode != null) {
            a.p(this.p, mode);
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        this.q = gradientDrawable2;
        gradientDrawable2.setCornerRadius(((float) this.f10930f) + 1.0E-5f);
        this.q.setColor(-1);
        Drawable r3 = a.r(this.q);
        this.r = r3;
        a.o(r3, this.k);
        return y(new LayerDrawable(new Drawable[]{this.p, this.r}));
    }

    @TargetApi(21)
    private Drawable b() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.s = gradientDrawable;
        gradientDrawable.setCornerRadius(((float) this.f10930f) + 1.0E-5f);
        this.s.setColor(-1);
        x();
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        this.t = gradientDrawable2;
        gradientDrawable2.setCornerRadius(((float) this.f10930f) + 1.0E-5f);
        this.t.setColor(0);
        this.t.setStroke(this.g, this.j);
        InsetDrawable y = y(new LayerDrawable(new Drawable[]{this.s, this.t}));
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        this.u = gradientDrawable3;
        gradientDrawable3.setCornerRadius(((float) this.f10930f) + 1.0E-5f);
        this.u.setColor(-1);
        return new a(b.c.a.d.r.a.a(this.k), y, this.u);
    }

    private GradientDrawable t() {
        if (!w || this.f10925a.getBackground() == null) {
            return null;
        }
        return (GradientDrawable) ((LayerDrawable) ((InsetDrawable) ((RippleDrawable) this.f10925a.getBackground()).getDrawable(0)).getDrawable()).getDrawable(0);
    }

    private GradientDrawable u() {
        if (!w || this.f10925a.getBackground() == null) {
            return null;
        }
        return (GradientDrawable) ((LayerDrawable) ((InsetDrawable) ((RippleDrawable) this.f10925a.getBackground()).getDrawable(0)).getDrawable()).getDrawable(1);
    }

    private void w() {
        if (w && this.t != null) {
            this.f10925a.setInternalBackground(b());
        } else if (!w) {
            this.f10925a.invalidate();
        }
    }

    private void x() {
        GradientDrawable gradientDrawable = this.s;
        if (gradientDrawable != null) {
            a.o(gradientDrawable, this.i);
            PorterDuff.Mode mode = this.h;
            if (mode != null) {
                a.p(this.s, mode);
            }
        }
    }

    private InsetDrawable y(Drawable drawable) {
        return new InsetDrawable(drawable, this.f10926b, this.f10928d, this.f10927c, this.f10929e);
    }

    /* access modifiers changed from: package-private */
    public void c(Canvas canvas) {
        if (canvas != null && this.j != null && this.g > 0) {
            this.m.set(this.f10925a.getBackground().getBounds());
            RectF rectF = this.n;
            Rect rect = this.m;
            int i2 = this.g;
            rectF.set(((float) rect.left) + (((float) i2) / 2.0f) + ((float) this.f10926b), ((float) rect.top) + (((float) i2) / 2.0f) + ((float) this.f10928d), (((float) rect.right) - (((float) i2) / 2.0f)) - ((float) this.f10927c), (((float) rect.bottom) - (((float) i2) / 2.0f)) - ((float) this.f10929e));
            float f2 = ((float) this.f10930f) - (((float) this.g) / 2.0f);
            canvas.drawRoundRect(this.n, f2, f2, this.l);
        }
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f10930f;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList e() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList f() {
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList h() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode i() {
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public boolean j() {
        return this.v;
    }

    public void k(TypedArray typedArray) {
        int i2 = 0;
        this.f10926b = typedArray.getDimensionPixelOffset(k.MaterialButton_android_insetLeft, 0);
        this.f10927c = typedArray.getDimensionPixelOffset(k.MaterialButton_android_insetRight, 0);
        this.f10928d = typedArray.getDimensionPixelOffset(k.MaterialButton_android_insetTop, 0);
        this.f10929e = typedArray.getDimensionPixelOffset(k.MaterialButton_android_insetBottom, 0);
        this.f10930f = typedArray.getDimensionPixelSize(k.MaterialButton_cornerRadius, 0);
        this.g = typedArray.getDimensionPixelSize(k.MaterialButton_strokeWidth, 0);
        this.h = l.b(typedArray.getInt(k.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.i = b.c.a.d.q.a.a(this.f10925a.getContext(), typedArray, k.MaterialButton_backgroundTint);
        this.j = b.c.a.d.q.a.a(this.f10925a.getContext(), typedArray, k.MaterialButton_strokeColor);
        this.k = b.c.a.d.q.a.a(this.f10925a.getContext(), typedArray, k.MaterialButton_rippleColor);
        this.l.setStyle(Paint.Style.STROKE);
        this.l.setStrokeWidth((float) this.g);
        Paint paint = this.l;
        ColorStateList colorStateList = this.j;
        if (colorStateList != null) {
            i2 = colorStateList.getColorForState(this.f10925a.getDrawableState(), 0);
        }
        paint.setColor(i2);
        int x = u.x(this.f10925a);
        int paddingTop = this.f10925a.getPaddingTop();
        int w2 = u.w(this.f10925a);
        int paddingBottom = this.f10925a.getPaddingBottom();
        this.f10925a.setInternalBackground(w ? b() : a());
        u.m0(this.f10925a, x + this.f10926b, paddingTop + this.f10928d, w2 + this.f10927c, paddingBottom + this.f10929e);
    }

    /* access modifiers changed from: package-private */
    public void l(int i2) {
        GradientDrawable gradientDrawable;
        GradientDrawable gradientDrawable2;
        if (w && (gradientDrawable2 = this.s) != null) {
            gradientDrawable2.setColor(i2);
        } else if (!w && (gradientDrawable = this.o) != null) {
            gradientDrawable.setColor(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void m() {
        this.v = true;
        this.f10925a.setSupportBackgroundTintList(this.i);
        this.f10925a.setSupportBackgroundTintMode(this.h);
    }

    /* access modifiers changed from: package-private */
    public void n(int i2) {
        GradientDrawable gradientDrawable;
        if (this.f10930f != i2) {
            this.f10930f = i2;
            if (w && this.s != null && this.t != null && this.u != null) {
                if (Build.VERSION.SDK_INT == 21) {
                    float f2 = ((float) i2) + 1.0E-5f;
                    t().setCornerRadius(f2);
                    u().setCornerRadius(f2);
                }
                float f3 = ((float) i2) + 1.0E-5f;
                this.s.setCornerRadius(f3);
                this.t.setCornerRadius(f3);
                this.u.setCornerRadius(f3);
            } else if (!w && (gradientDrawable = this.o) != null && this.q != null) {
                float f4 = ((float) i2) + 1.0E-5f;
                gradientDrawable.setCornerRadius(f4);
                this.q.setCornerRadius(f4);
                this.f10925a.invalidate();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void o(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.k != colorStateList) {
            this.k = colorStateList;
            if (w && (this.f10925a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f10925a.getBackground()).setColor(colorStateList);
            } else if (!w && (drawable = this.r) != null) {
                a.o(drawable, colorStateList);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void p(ColorStateList colorStateList) {
        if (this.j != colorStateList) {
            this.j = colorStateList;
            Paint paint = this.l;
            int i2 = 0;
            if (colorStateList != null) {
                i2 = colorStateList.getColorForState(this.f10925a.getDrawableState(), 0);
            }
            paint.setColor(i2);
            w();
        }
    }

    /* access modifiers changed from: package-private */
    public void q(int i2) {
        if (this.g != i2) {
            this.g = i2;
            this.l.setStrokeWidth((float) i2);
            w();
        }
    }

    /* access modifiers changed from: package-private */
    public void r(ColorStateList colorStateList) {
        if (this.i != colorStateList) {
            this.i = colorStateList;
            if (w) {
                x();
                return;
            }
            Drawable drawable = this.p;
            if (drawable != null) {
                a.o(drawable, colorStateList);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void s(PorterDuff.Mode mode) {
        if (this.h != mode) {
            this.h = mode;
            if (w) {
                x();
                return;
            }
            Drawable drawable = this.p;
            if (drawable != null && mode != null) {
                a.p(drawable, mode);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void v(int i2, int i3) {
        GradientDrawable gradientDrawable = this.u;
        if (gradientDrawable != null) {
            gradientDrawable.setBounds(this.f10926b, this.f10928d, i3 - this.f10927c, i2 - this.f10929e);
        }
    }
}
