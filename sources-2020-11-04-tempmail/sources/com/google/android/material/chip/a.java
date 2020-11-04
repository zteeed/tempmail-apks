package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.content.c.f;
import b.c.a.d.l.h;
import com.google.android.material.internal.k;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: ChipDrawable */
public class a extends Drawable implements androidx.core.graphics.drawable.b, Drawable.Callback {
    private static final int[] i0 = {16842910};
    private float A;
    private float B;
    private float C;
    private float D;
    private float E;
    private float F;
    private float G;
    private final Context H;
    private final TextPaint I = new TextPaint(1);
    private final Paint J = new Paint(1);
    private final Paint K;
    private final Paint.FontMetrics L = new Paint.FontMetrics();
    private final RectF M = new RectF();
    private final PointF N = new PointF();
    private int O;
    private int P;
    private int Q;
    private int R;
    private boolean S;
    private int T;
    private int U = 255;
    private ColorFilter V;
    private PorterDuffColorFilter W;
    private ColorStateList X;
    private PorterDuff.Mode Y = PorterDuff.Mode.SRC_IN;
    private int[] Z;
    private boolean a0;

    /* renamed from: b  reason: collision with root package name */
    private ColorStateList f10944b;
    private ColorStateList b0;

    /* renamed from: c  reason: collision with root package name */
    private float f10945c;
    private WeakReference<b> c0;

    /* renamed from: d  reason: collision with root package name */
    private float f10946d;
    /* access modifiers changed from: private */
    public boolean d0;

    /* renamed from: e  reason: collision with root package name */
    private ColorStateList f10947e;
    private float e0;

    /* renamed from: f  reason: collision with root package name */
    private float f10948f;
    private TextUtils.TruncateAt f0;
    private ColorStateList g;
    private boolean g0;
    private CharSequence h;
    private int h0;
    private CharSequence i;
    private b.c.a.d.q.b j;
    private final f.a k = new C0093a();
    private boolean l;
    private Drawable m;
    private ColorStateList n;
    private float o;
    private boolean p;
    private Drawable q;
    private ColorStateList r;
    private float s;
    private CharSequence t;
    private boolean u;
    private boolean v;
    private Drawable w;
    private h x;
    private h y;
    private float z;

    /* renamed from: com.google.android.material.chip.a$a  reason: collision with other inner class name */
    /* compiled from: ChipDrawable */
    class C0093a extends f.a {
        C0093a() {
        }

        public void c(int i) {
        }

        public void d(Typeface typeface) {
            boolean unused = a.this.d0 = true;
            a.this.l0();
            a.this.invalidateSelf();
        }
    }

    /* compiled from: ChipDrawable */
    public interface b {
        void a();
    }

    private a(Context context) {
        Paint paint = null;
        this.c0 = new WeakReference<>(paint);
        this.d0 = true;
        this.H = context;
        this.h = "";
        this.I.density = context.getResources().getDisplayMetrics().density;
        this.K = paint;
        if (paint != null) {
            paint.setStyle(Paint.Style.STROKE);
        }
        setState(i0);
        Y0(i0);
        this.g0 = true;
    }

    private boolean A1() {
        return this.v && this.w != null && this.S;
    }

    private boolean B1() {
        return this.l && this.m != null;
    }

    private boolean C1() {
        return this.p && this.q != null;
    }

    private void D1(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    private void E1() {
        this.b0 = this.a0 ? b.c.a.d.r.a.a(this.g) : null;
    }

    private float Z() {
        if (!this.d0) {
            return this.e0;
        }
        float l2 = l(this.i);
        this.e0 = l2;
        this.d0 = false;
        return l2;
    }

    private ColorFilter a0() {
        ColorFilter colorFilter = this.V;
        return colorFilter != null ? colorFilter : this.W;
    }

    private void b(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            androidx.core.graphics.drawable.a.m(drawable, androidx.core.graphics.drawable.a.f(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.q) {
                if (drawable.isStateful()) {
                    drawable.setState(M());
                }
                androidx.core.graphics.drawable.a.o(drawable, this.r);
            } else if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    private static boolean b0(int[] iArr, int i2) {
        if (iArr == null) {
            return false;
        }
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    private void c(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (B1() || A1()) {
            float f2 = this.z + this.A;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f3 = ((float) rect.left) + f2;
                rectF.left = f3;
                rectF.right = f3 + this.o;
            } else {
                float f4 = ((float) rect.right) - f2;
                rectF.right = f4;
                rectF.left = f4 - this.o;
            }
            float exactCenterY = rect.exactCenterY();
            float f5 = this.o;
            float f6 = exactCenterY - (f5 / 2.0f);
            rectF.top = f6;
            rectF.bottom = f6 + f5;
        }
    }

    private void e(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (C1()) {
            float f2 = this.G + this.F + this.s + this.E + this.D;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                rectF.right = ((float) rect.right) - f2;
            } else {
                rectF.left = ((float) rect.left) + f2;
            }
        }
    }

    private void f(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (C1()) {
            float f2 = this.G + this.F;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f3 = ((float) rect.right) - f2;
                rectF.right = f3;
                rectF.left = f3 - this.s;
            } else {
                float f4 = ((float) rect.left) + f2;
                rectF.left = f4;
                rectF.right = f4 + this.s;
            }
            float exactCenterY = rect.exactCenterY();
            float f5 = this.s;
            float f6 = exactCenterY - (f5 / 2.0f);
            rectF.top = f6;
            rectF.bottom = f6 + f5;
        }
    }

    private void g(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (C1()) {
            float f2 = this.G + this.F + this.s + this.E + this.D;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f3 = (float) rect.right;
                rectF.right = f3;
                rectF.left = f3 - f2;
            } else {
                int i2 = rect.left;
                rectF.left = (float) i2;
                rectF.right = ((float) i2) + f2;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    private float h() {
        if (C1()) {
            return this.E + this.s + this.F;
        }
        return 0.0f;
    }

    private static boolean h0(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private void i(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.i != null) {
            float d2 = this.z + d() + this.C;
            float h2 = this.G + h() + this.D;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                rectF.left = ((float) rect.left) + d2;
                rectF.right = ((float) rect.right) - h2;
            } else {
                rectF.left = ((float) rect.left) + h2;
                rectF.right = ((float) rect.right) - d2;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    private static boolean i0(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private float j() {
        this.I.getFontMetrics(this.L);
        Paint.FontMetrics fontMetrics = this.L;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = r0.f2389b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean j0(b.c.a.d.q.b r0) {
        /*
            if (r0 == 0) goto L_0x000e
            android.content.res.ColorStateList r0 = r0.f2389b
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.a.j0(b.c.a.d.q.b):boolean");
    }

    private void k0(AttributeSet attributeSet, int i2, int i3) {
        TypedArray h2 = k.h(this.H, attributeSet, b.c.a.d.k.Chip, i2, i3, new int[0]);
        t0(b.c.a.d.q.a.a(this.H, h2, b.c.a.d.k.Chip_chipBackgroundColor));
        H0(h2.getDimension(b.c.a.d.k.Chip_chipMinHeight, 0.0f));
        v0(h2.getDimension(b.c.a.d.k.Chip_chipCornerRadius, 0.0f));
        L0(b.c.a.d.q.a.a(this.H, h2, b.c.a.d.k.Chip_chipStrokeColor));
        N0(h2.getDimension(b.c.a.d.k.Chip_chipStrokeWidth, 0.0f));
        m1(b.c.a.d.q.a.a(this.H, h2, b.c.a.d.k.Chip_rippleColor));
        r1(h2.getText(b.c.a.d.k.Chip_android_text));
        s1(b.c.a.d.q.a.d(this.H, h2, b.c.a.d.k.Chip_android_textAppearance));
        int i4 = h2.getInt(b.c.a.d.k.Chip_android_ellipsize, 0);
        if (i4 == 1) {
            e1(TextUtils.TruncateAt.START);
        } else if (i4 == 2) {
            e1(TextUtils.TruncateAt.MIDDLE);
        } else if (i4 == 3) {
            e1(TextUtils.TruncateAt.END);
        }
        G0(h2.getBoolean(b.c.a.d.k.Chip_chipIconVisible, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") != null)) {
            G0(h2.getBoolean(b.c.a.d.k.Chip_chipIconEnabled, false));
        }
        z0(b.c.a.d.q.a.b(this.H, h2, b.c.a.d.k.Chip_chipIcon));
        D0(b.c.a.d.q.a.a(this.H, h2, b.c.a.d.k.Chip_chipIconTint));
        B0(h2.getDimension(b.c.a.d.k.Chip_chipIconSize, 0.0f));
        c1(h2.getBoolean(b.c.a.d.k.Chip_closeIconVisible, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") != null)) {
            c1(h2.getBoolean(b.c.a.d.k.Chip_closeIconEnabled, false));
        }
        P0(b.c.a.d.q.a.b(this.H, h2, b.c.a.d.k.Chip_closeIcon));
        Z0(b.c.a.d.q.a.a(this.H, h2, b.c.a.d.k.Chip_closeIconTint));
        U0(h2.getDimension(b.c.a.d.k.Chip_closeIconSize, 0.0f));
        n0(h2.getBoolean(b.c.a.d.k.Chip_android_checkable, false));
        s0(h2.getBoolean(b.c.a.d.k.Chip_checkedIconVisible, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") != null)) {
            s0(h2.getBoolean(b.c.a.d.k.Chip_checkedIconEnabled, false));
        }
        p0(b.c.a.d.q.a.b(this.H, h2, b.c.a.d.k.Chip_checkedIcon));
        p1(h.b(this.H, h2, b.c.a.d.k.Chip_showMotionSpec));
        f1(h.b(this.H, h2, b.c.a.d.k.Chip_hideMotionSpec));
        J0(h2.getDimension(b.c.a.d.k.Chip_chipStartPadding, 0.0f));
        j1(h2.getDimension(b.c.a.d.k.Chip_iconStartPadding, 0.0f));
        h1(h2.getDimension(b.c.a.d.k.Chip_iconEndPadding, 0.0f));
        w1(h2.getDimension(b.c.a.d.k.Chip_textStartPadding, 0.0f));
        u1(h2.getDimension(b.c.a.d.k.Chip_textEndPadding, 0.0f));
        W0(h2.getDimension(b.c.a.d.k.Chip_closeIconStartPadding, 0.0f));
        R0(h2.getDimension(b.c.a.d.k.Chip_closeIconEndPadding, 0.0f));
        x0(h2.getDimension(b.c.a.d.k.Chip_chipEndPadding, 0.0f));
        l1(h2.getDimensionPixelSize(b.c.a.d.k.Chip_android_maxWidth, Integer.MAX_VALUE));
        h2.recycle();
    }

    private float l(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.I.measureText(charSequence, 0, charSequence.length());
    }

    private boolean m() {
        return this.v && this.w != null && this.u;
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m0(int[] r6, int[] r7) {
        /*
            r5 = this;
            boolean r0 = super.onStateChange(r6)
            android.content.res.ColorStateList r1 = r5.f10944b
            r2 = 0
            if (r1 == 0) goto L_0x0010
            int r3 = r5.O
            int r1 = r1.getColorForState(r6, r3)
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            int r3 = r5.O
            r4 = 1
            if (r3 == r1) goto L_0x0019
            r5.O = r1
            r0 = 1
        L_0x0019:
            android.content.res.ColorStateList r1 = r5.f10947e
            if (r1 == 0) goto L_0x0024
            int r3 = r5.P
            int r1 = r1.getColorForState(r6, r3)
            goto L_0x0025
        L_0x0024:
            r1 = 0
        L_0x0025:
            int r3 = r5.P
            if (r3 == r1) goto L_0x002c
            r5.P = r1
            r0 = 1
        L_0x002c:
            android.content.res.ColorStateList r1 = r5.b0
            if (r1 == 0) goto L_0x0037
            int r3 = r5.Q
            int r1 = r1.getColorForState(r6, r3)
            goto L_0x0038
        L_0x0037:
            r1 = 0
        L_0x0038:
            int r3 = r5.Q
            if (r3 == r1) goto L_0x0043
            r5.Q = r1
            boolean r1 = r5.a0
            if (r1 == 0) goto L_0x0043
            r0 = 1
        L_0x0043:
            b.c.a.d.q.b r1 = r5.j
            if (r1 == 0) goto L_0x0052
            android.content.res.ColorStateList r1 = r1.f2389b
            if (r1 == 0) goto L_0x0052
            int r3 = r5.R
            int r1 = r1.getColorForState(r6, r3)
            goto L_0x0053
        L_0x0052:
            r1 = 0
        L_0x0053:
            int r3 = r5.R
            if (r3 == r1) goto L_0x005a
            r5.R = r1
            r0 = 1
        L_0x005a:
            int[] r1 = r5.getState()
            r3 = 16842912(0x10100a0, float:2.3694006E-38)
            boolean r1 = b0(r1, r3)
            if (r1 == 0) goto L_0x006d
            boolean r1 = r5.u
            if (r1 == 0) goto L_0x006d
            r1 = 1
            goto L_0x006e
        L_0x006d:
            r1 = 0
        L_0x006e:
            boolean r3 = r5.S
            if (r3 == r1) goto L_0x0088
            android.graphics.drawable.Drawable r3 = r5.w
            if (r3 == 0) goto L_0x0088
            float r0 = r5.d()
            r5.S = r1
            float r1 = r5.d()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0087
            r0 = 1
            r1 = 1
            goto L_0x0089
        L_0x0087:
            r0 = 1
        L_0x0088:
            r1 = 0
        L_0x0089:
            android.content.res.ColorStateList r3 = r5.X
            if (r3 == 0) goto L_0x0093
            int r2 = r5.T
            int r2 = r3.getColorForState(r6, r2)
        L_0x0093:
            int r3 = r5.T
            if (r3 == r2) goto L_0x00a4
            r5.T = r2
            android.content.res.ColorStateList r0 = r5.X
            android.graphics.PorterDuff$Mode r2 = r5.Y
            android.graphics.PorterDuffColorFilter r0 = b.c.a.d.n.a.a(r5, r0, r2)
            r5.W = r0
            goto L_0x00a5
        L_0x00a4:
            r4 = r0
        L_0x00a5:
            android.graphics.drawable.Drawable r0 = r5.m
            boolean r0 = i0(r0)
            if (r0 == 0) goto L_0x00b4
            android.graphics.drawable.Drawable r0 = r5.m
            boolean r0 = r0.setState(r6)
            r4 = r4 | r0
        L_0x00b4:
            android.graphics.drawable.Drawable r0 = r5.w
            boolean r0 = i0(r0)
            if (r0 == 0) goto L_0x00c3
            android.graphics.drawable.Drawable r0 = r5.w
            boolean r6 = r0.setState(r6)
            r4 = r4 | r6
        L_0x00c3:
            android.graphics.drawable.Drawable r6 = r5.q
            boolean r6 = i0(r6)
            if (r6 == 0) goto L_0x00d2
            android.graphics.drawable.Drawable r6 = r5.q
            boolean r6 = r6.setState(r7)
            r4 = r4 | r6
        L_0x00d2:
            if (r4 == 0) goto L_0x00d7
            r5.invalidateSelf()
        L_0x00d7:
            if (r1 == 0) goto L_0x00dc
            r5.l0()
        L_0x00dc:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.a.m0(int[], int[]):boolean");
    }

    public static a n(Context context, AttributeSet attributeSet, int i2, int i3) {
        a aVar = new a(context);
        aVar.k0(attributeSet, i2, i3);
        return aVar;
    }

    private void o(Canvas canvas, Rect rect) {
        if (A1()) {
            c(rect, this.M);
            RectF rectF = this.M;
            float f2 = rectF.left;
            float f3 = rectF.top;
            canvas.translate(f2, f3);
            this.w.setBounds(0, 0, (int) this.M.width(), (int) this.M.height());
            this.w.draw(canvas);
            canvas.translate(-f2, -f3);
        }
    }

    private void p(Canvas canvas, Rect rect) {
        this.J.setColor(this.O);
        this.J.setStyle(Paint.Style.FILL);
        this.J.setColorFilter(a0());
        this.M.set(rect);
        RectF rectF = this.M;
        float f2 = this.f10946d;
        canvas.drawRoundRect(rectF, f2, f2, this.J);
    }

    private void q(Canvas canvas, Rect rect) {
        if (B1()) {
            c(rect, this.M);
            RectF rectF = this.M;
            float f2 = rectF.left;
            float f3 = rectF.top;
            canvas.translate(f2, f3);
            this.m.setBounds(0, 0, (int) this.M.width(), (int) this.M.height());
            this.m.draw(canvas);
            canvas.translate(-f2, -f3);
        }
    }

    private void r(Canvas canvas, Rect rect) {
        if (this.f10948f > 0.0f) {
            this.J.setColor(this.P);
            this.J.setStyle(Paint.Style.STROKE);
            this.J.setColorFilter(a0());
            RectF rectF = this.M;
            float f2 = this.f10948f;
            rectF.set(((float) rect.left) + (f2 / 2.0f), ((float) rect.top) + (f2 / 2.0f), ((float) rect.right) - (f2 / 2.0f), ((float) rect.bottom) - (f2 / 2.0f));
            float f3 = this.f10946d - (this.f10948f / 2.0f);
            canvas.drawRoundRect(this.M, f3, f3, this.J);
        }
    }

    private void s(Canvas canvas, Rect rect) {
        if (C1()) {
            f(rect, this.M);
            RectF rectF = this.M;
            float f2 = rectF.left;
            float f3 = rectF.top;
            canvas.translate(f2, f3);
            this.q.setBounds(0, 0, (int) this.M.width(), (int) this.M.height());
            this.q.draw(canvas);
            canvas.translate(-f2, -f3);
        }
    }

    private void t(Canvas canvas, Rect rect) {
        this.J.setColor(this.Q);
        this.J.setStyle(Paint.Style.FILL);
        this.M.set(rect);
        RectF rectF = this.M;
        float f2 = this.f10946d;
        canvas.drawRoundRect(rectF, f2, f2, this.J);
    }

    private void u(Canvas canvas, Rect rect) {
        Paint paint = this.K;
        if (paint != null) {
            paint.setColor(a.h.e.a.d(-16777216, 127));
            canvas.drawRect(rect, this.K);
            if (B1() || A1()) {
                c(rect, this.M);
                canvas.drawRect(this.M, this.K);
            }
            if (this.i != null) {
                canvas.drawLine((float) rect.left, rect.exactCenterY(), (float) rect.right, rect.exactCenterY(), this.K);
            }
            if (C1()) {
                f(rect, this.M);
                canvas.drawRect(this.M, this.K);
            }
            this.K.setColor(a.h.e.a.d(-65536, 127));
            e(rect, this.M);
            canvas.drawRect(this.M, this.K);
            this.K.setColor(a.h.e.a.d(-16711936, 127));
            g(rect, this.M);
            canvas.drawRect(this.M, this.K);
        }
    }

    private void v(Canvas canvas, Rect rect) {
        if (this.i != null) {
            Paint.Align k2 = k(rect, this.N);
            i(rect, this.M);
            if (this.j != null) {
                this.I.drawableState = getState();
                this.j.g(this.H, this.I, this.k);
            }
            this.I.setTextAlign(k2);
            int i2 = 0;
            boolean z2 = Math.round(Z()) > Math.round(this.M.width());
            if (z2) {
                i2 = canvas.save();
                canvas.clipRect(this.M);
            }
            CharSequence charSequence = this.i;
            if (z2 && this.f0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.I, this.M.width(), this.f0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.N;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.I);
            if (z2) {
                canvas.restoreToCount(i2);
            }
        }
    }

    public Drawable A() {
        Drawable drawable = this.m;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.q(drawable);
        }
        return null;
    }

    public void A0(int i2) {
        z0(a.a.k.a.a.d(this.H, i2));
    }

    public float B() {
        return this.o;
    }

    public void B0(float f2) {
        if (this.o != f2) {
            float d2 = d();
            this.o = f2;
            float d3 = d();
            invalidateSelf();
            if (d2 != d3) {
                l0();
            }
        }
    }

    public ColorStateList C() {
        return this.n;
    }

    public void C0(int i2) {
        B0(this.H.getResources().getDimension(i2));
    }

    public float D() {
        return this.f10945c;
    }

    public void D0(ColorStateList colorStateList) {
        if (this.n != colorStateList) {
            this.n = colorStateList;
            if (B1()) {
                androidx.core.graphics.drawable.a.o(this.m, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public float E() {
        return this.z;
    }

    public void E0(int i2) {
        D0(a.a.k.a.a.c(this.H, i2));
    }

    public ColorStateList F() {
        return this.f10947e;
    }

    public void F0(int i2) {
        G0(this.H.getResources().getBoolean(i2));
    }

    public float G() {
        return this.f10948f;
    }

    public void G0(boolean z2) {
        if (this.l != z2) {
            boolean B1 = B1();
            this.l = z2;
            boolean B12 = B1();
            if (B1 != B12) {
                if (B12) {
                    b(this.m);
                } else {
                    D1(this.m);
                }
                invalidateSelf();
                l0();
            }
        }
    }

    public Drawable H() {
        Drawable drawable = this.q;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.q(drawable);
        }
        return null;
    }

    public void H0(float f2) {
        if (this.f10945c != f2) {
            this.f10945c = f2;
            invalidateSelf();
            l0();
        }
    }

    public CharSequence I() {
        return this.t;
    }

    public void I0(int i2) {
        H0(this.H.getResources().getDimension(i2));
    }

    public float J() {
        return this.F;
    }

    public void J0(float f2) {
        if (this.z != f2) {
            this.z = f2;
            invalidateSelf();
            l0();
        }
    }

    public float K() {
        return this.s;
    }

    public void K0(int i2) {
        J0(this.H.getResources().getDimension(i2));
    }

    public float L() {
        return this.E;
    }

    public void L0(ColorStateList colorStateList) {
        if (this.f10947e != colorStateList) {
            this.f10947e = colorStateList;
            onStateChange(getState());
        }
    }

    public int[] M() {
        return this.Z;
    }

    public void M0(int i2) {
        L0(a.a.k.a.a.c(this.H, i2));
    }

    public ColorStateList N() {
        return this.r;
    }

    public void N0(float f2) {
        if (this.f10948f != f2) {
            this.f10948f = f2;
            this.J.setStrokeWidth(f2);
            invalidateSelf();
        }
    }

    public void O(RectF rectF) {
        g(getBounds(), rectF);
    }

    public void O0(int i2) {
        N0(this.H.getResources().getDimension(i2));
    }

    public TextUtils.TruncateAt P() {
        return this.f0;
    }

    public void P0(Drawable drawable) {
        Drawable H2 = H();
        if (H2 != drawable) {
            float h2 = h();
            this.q = drawable != null ? androidx.core.graphics.drawable.a.r(drawable).mutate() : null;
            float h3 = h();
            D1(H2);
            if (C1()) {
                b(this.q);
            }
            invalidateSelf();
            if (h2 != h3) {
                l0();
            }
        }
    }

    public h Q() {
        return this.y;
    }

    public void Q0(CharSequence charSequence) {
        if (this.t != charSequence) {
            this.t = a.h.i.a.c().h(charSequence);
            invalidateSelf();
        }
    }

    public float R() {
        return this.B;
    }

    public void R0(float f2) {
        if (this.F != f2) {
            this.F = f2;
            invalidateSelf();
            if (C1()) {
                l0();
            }
        }
    }

    public float S() {
        return this.A;
    }

    public void S0(int i2) {
        R0(this.H.getResources().getDimension(i2));
    }

    public ColorStateList T() {
        return this.g;
    }

    public void T0(int i2) {
        P0(a.a.k.a.a.d(this.H, i2));
    }

    public h U() {
        return this.x;
    }

    public void U0(float f2) {
        if (this.s != f2) {
            this.s = f2;
            invalidateSelf();
            if (C1()) {
                l0();
            }
        }
    }

    public CharSequence V() {
        return this.h;
    }

    public void V0(int i2) {
        U0(this.H.getResources().getDimension(i2));
    }

    public b.c.a.d.q.b W() {
        return this.j;
    }

    public void W0(float f2) {
        if (this.E != f2) {
            this.E = f2;
            invalidateSelf();
            if (C1()) {
                l0();
            }
        }
    }

    public float X() {
        return this.D;
    }

    public void X0(int i2) {
        W0(this.H.getResources().getDimension(i2));
    }

    public float Y() {
        return this.C;
    }

    public boolean Y0(int[] iArr) {
        if (Arrays.equals(this.Z, iArr)) {
            return false;
        }
        this.Z = iArr;
        if (C1()) {
            return m0(getState(), iArr);
        }
        return false;
    }

    public void Z0(ColorStateList colorStateList) {
        if (this.r != colorStateList) {
            this.r = colorStateList;
            if (C1()) {
                androidx.core.graphics.drawable.a.o(this.q, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void a1(int i2) {
        Z0(a.a.k.a.a.c(this.H, i2));
    }

    public void b1(int i2) {
        c1(this.H.getResources().getBoolean(i2));
    }

    public boolean c0() {
        return this.u;
    }

    public void c1(boolean z2) {
        if (this.p != z2) {
            boolean C1 = C1();
            this.p = z2;
            boolean C12 = C1();
            if (C1 != C12) {
                if (C12) {
                    b(this.q);
                } else {
                    D1(this.q);
                }
                invalidateSelf();
                l0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public float d() {
        if (B1() || A1()) {
            return this.A + this.o + this.B;
        }
        return 0.0f;
    }

    public boolean d0() {
        return this.v;
    }

    public void d1(b bVar) {
        this.c0 = new WeakReference<>(bVar);
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i2 = 0;
            int i3 = this.U;
            if (i3 < 255) {
                i2 = b.c.a.d.m.a.a(canvas, (float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i3);
            }
            p(canvas, bounds);
            r(canvas, bounds);
            t(canvas, bounds);
            q(canvas, bounds);
            o(canvas, bounds);
            if (this.g0) {
                v(canvas, bounds);
            }
            s(canvas, bounds);
            u(canvas, bounds);
            if (this.U < 255) {
                canvas.restoreToCount(i2);
            }
        }
    }

    public boolean e0() {
        return this.l;
    }

    public void e1(TextUtils.TruncateAt truncateAt) {
        this.f0 = truncateAt;
    }

    public boolean f0() {
        return i0(this.q);
    }

    public void f1(h hVar) {
        this.y = hVar;
    }

    public boolean g0() {
        return this.p;
    }

    public void g1(int i2) {
        f1(h.c(this.H, i2));
    }

    public int getAlpha() {
        return this.U;
    }

    public ColorFilter getColorFilter() {
        return this.V;
    }

    public int getIntrinsicHeight() {
        return (int) this.f10945c;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.z + d() + this.C + Z() + this.D + h() + this.G), this.h0);
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f10946d);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f10946d);
        }
        outline.setAlpha(((float) getAlpha()) / 255.0f);
    }

    public void h1(float f2) {
        if (this.B != f2) {
            float d2 = d();
            this.B = f2;
            float d3 = d();
            invalidateSelf();
            if (d2 != d3) {
                l0();
            }
        }
    }

    public void i1(int i2) {
        h1(this.H.getResources().getDimension(i2));
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isStateful() {
        return h0(this.f10944b) || h0(this.f10947e) || (this.a0 && h0(this.b0)) || j0(this.j) || m() || i0(this.m) || i0(this.w) || h0(this.X);
    }

    public void j1(float f2) {
        if (this.A != f2) {
            float d2 = d();
            this.A = f2;
            float d3 = d();
            invalidateSelf();
            if (d2 != d3) {
                l0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Paint.Align k(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.i != null) {
            float d2 = this.z + d() + this.C;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                pointF.x = ((float) rect.left) + d2;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = ((float) rect.right) - d2;
                align = Paint.Align.RIGHT;
            }
            pointF.y = ((float) rect.centerY()) - j();
        }
        return align;
    }

    public void k1(int i2) {
        j1(this.H.getResources().getDimension(i2));
    }

    /* access modifiers changed from: protected */
    public void l0() {
        b bVar = (b) this.c0.get();
        if (bVar != null) {
            bVar.a();
        }
    }

    public void l1(int i2) {
        this.h0 = i2;
    }

    public void m1(ColorStateList colorStateList) {
        if (this.g != colorStateList) {
            this.g = colorStateList;
            E1();
            onStateChange(getState());
        }
    }

    public void n0(boolean z2) {
        if (this.u != z2) {
            this.u = z2;
            float d2 = d();
            if (!z2 && this.S) {
                this.S = false;
            }
            float d3 = d();
            invalidateSelf();
            if (d2 != d3) {
                l0();
            }
        }
    }

    public void n1(int i2) {
        m1(a.a.k.a.a.c(this.H, i2));
    }

    public void o0(int i2) {
        n0(this.H.getResources().getBoolean(i2));
    }

    /* access modifiers changed from: package-private */
    public void o1(boolean z2) {
        this.g0 = z2;
    }

    @TargetApi(23)
    public boolean onLayoutDirectionChanged(int i2) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i2);
        if (B1()) {
            onLayoutDirectionChanged |= this.m.setLayoutDirection(i2);
        }
        if (A1()) {
            onLayoutDirectionChanged |= this.w.setLayoutDirection(i2);
        }
        if (C1()) {
            onLayoutDirectionChanged |= this.q.setLayoutDirection(i2);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i2) {
        boolean onLevelChange = super.onLevelChange(i2);
        if (B1()) {
            onLevelChange |= this.m.setLevel(i2);
        }
        if (A1()) {
            onLevelChange |= this.w.setLevel(i2);
        }
        if (C1()) {
            onLevelChange |= this.q.setLevel(i2);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        return m0(iArr, M());
    }

    public void p0(Drawable drawable) {
        if (this.w != drawable) {
            float d2 = d();
            this.w = drawable;
            float d3 = d();
            D1(this.w);
            b(this.w);
            invalidateSelf();
            if (d2 != d3) {
                l0();
            }
        }
    }

    public void p1(h hVar) {
        this.x = hVar;
    }

    public void q0(int i2) {
        p0(a.a.k.a.a.d(this.H, i2));
    }

    public void q1(int i2) {
        p1(h.c(this.H, i2));
    }

    public void r0(int i2) {
        s0(this.H.getResources().getBoolean(i2));
    }

    public void r1(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (this.h != charSequence) {
            this.h = charSequence;
            this.i = a.h.i.a.c().h(charSequence);
            this.d0 = true;
            invalidateSelf();
            l0();
        }
    }

    public void s0(boolean z2) {
        if (this.v != z2) {
            boolean A1 = A1();
            this.v = z2;
            boolean A12 = A1();
            if (A1 != A12) {
                if (A12) {
                    b(this.w);
                } else {
                    D1(this.w);
                }
                invalidateSelf();
                l0();
            }
        }
    }

    public void s1(b.c.a.d.q.b bVar) {
        if (this.j != bVar) {
            this.j = bVar;
            if (bVar != null) {
                bVar.h(this.H, this.I, this.k);
                this.d0 = true;
            }
            onStateChange(getState());
            l0();
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    public void setAlpha(int i2) {
        if (this.U != i2) {
            this.U = i2;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.V != colorFilter) {
            this.V = colorFilter;
            invalidateSelf();
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.X != colorStateList) {
            this.X = colorStateList;
            onStateChange(getState());
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.Y != mode) {
            this.Y = mode;
            this.W = b.c.a.d.n.a.a(this, this.X, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        if (B1()) {
            visible |= this.m.setVisible(z2, z3);
        }
        if (A1()) {
            visible |= this.w.setVisible(z2, z3);
        }
        if (C1()) {
            visible |= this.q.setVisible(z2, z3);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public void t0(ColorStateList colorStateList) {
        if (this.f10944b != colorStateList) {
            this.f10944b = colorStateList;
            onStateChange(getState());
        }
    }

    public void t1(int i2) {
        s1(new b.c.a.d.q.b(this.H, i2));
    }

    public void u0(int i2) {
        t0(a.a.k.a.a.c(this.H, i2));
    }

    public void u1(float f2) {
        if (this.D != f2) {
            this.D = f2;
            invalidateSelf();
            l0();
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void v0(float f2) {
        if (this.f10946d != f2) {
            this.f10946d = f2;
            invalidateSelf();
        }
    }

    public void v1(int i2) {
        u1(this.H.getResources().getDimension(i2));
    }

    public Drawable w() {
        return this.w;
    }

    public void w0(int i2) {
        v0(this.H.getResources().getDimension(i2));
    }

    public void w1(float f2) {
        if (this.C != f2) {
            this.C = f2;
            invalidateSelf();
            l0();
        }
    }

    public ColorStateList x() {
        return this.f10944b;
    }

    public void x0(float f2) {
        if (this.G != f2) {
            this.G = f2;
            invalidateSelf();
            l0();
        }
    }

    public void x1(int i2) {
        w1(this.H.getResources().getDimension(i2));
    }

    public float y() {
        return this.f10946d;
    }

    public void y0(int i2) {
        x0(this.H.getResources().getDimension(i2));
    }

    public void y1(boolean z2) {
        if (this.a0 != z2) {
            this.a0 = z2;
            E1();
            onStateChange(getState());
        }
    }

    public float z() {
        return this.G;
    }

    public void z0(Drawable drawable) {
        Drawable A2 = A();
        if (A2 != drawable) {
            float d2 = d();
            this.m = drawable != null ? androidx.core.graphics.drawable.a.r(drawable).mutate() : null;
            float d3 = d();
            D1(A2);
            if (B1()) {
                b(this.m);
            }
            invalidateSelf();
            if (d2 != d3) {
                l0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean z1() {
        return this.g0;
    }
}
