package androidx.appcompat.widget;

import a.a.j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.core.content.c.f;
import androidx.core.widget.b;
import androidx.core.widget.i;
import java.lang.ref.WeakReference;

/* compiled from: AppCompatTextHelper */
class k {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f1126a;

    /* renamed from: b  reason: collision with root package name */
    private z f1127b;

    /* renamed from: c  reason: collision with root package name */
    private z f1128c;

    /* renamed from: d  reason: collision with root package name */
    private z f1129d;

    /* renamed from: e  reason: collision with root package name */
    private z f1130e;

    /* renamed from: f  reason: collision with root package name */
    private z f1131f;
    private z g;
    private final l h;
    private int i = 0;
    private Typeface j;
    private boolean k;

    /* compiled from: AppCompatTextHelper */
    class a extends f.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WeakReference f1132a;

        a(WeakReference weakReference) {
            this.f1132a = weakReference;
        }

        public void c(int i) {
        }

        public void d(Typeface typeface) {
            k.this.l(this.f1132a, typeface);
        }
    }

    k(TextView textView) {
        this.f1126a = textView;
        this.h = new l(this.f1126a);
    }

    private void a(Drawable drawable, z zVar) {
        if (drawable != null && zVar != null) {
            f.C(drawable, zVar, this.f1126a.getDrawableState());
        }
    }

    private static z d(Context context, f fVar, int i2) {
        ColorStateList s = fVar.s(context, i2);
        if (s == null) {
            return null;
        }
        z zVar = new z();
        zVar.f1181d = true;
        zVar.f1178a = s;
        return zVar;
    }

    private void t(int i2, float f2) {
        this.h.t(i2, f2);
    }

    private void u(Context context, b0 b0Var) {
        String o;
        this.i = b0Var.k(j.TextAppearance_android_textStyle, this.i);
        boolean z = false;
        if (b0Var.r(j.TextAppearance_android_fontFamily) || b0Var.r(j.TextAppearance_fontFamily)) {
            this.j = null;
            int i2 = b0Var.r(j.TextAppearance_fontFamily) ? j.TextAppearance_fontFamily : j.TextAppearance_android_fontFamily;
            if (!context.isRestricted()) {
                try {
                    Typeface j2 = b0Var.j(i2, this.i, new a(new WeakReference(this.f1126a)));
                    this.j = j2;
                    if (j2 == null) {
                        z = true;
                    }
                    this.k = z;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.j == null && (o = b0Var.o(i2)) != null) {
                this.j = Typeface.create(o, this.i);
            }
        } else if (b0Var.r(j.TextAppearance_android_typeface)) {
            this.k = false;
            int k2 = b0Var.k(j.TextAppearance_android_typeface, 1);
            if (k2 == 1) {
                this.j = Typeface.SANS_SERIF;
            } else if (k2 == 2) {
                this.j = Typeface.SERIF;
            } else if (k2 == 3) {
                this.j = Typeface.MONOSPACE;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (!(this.f1127b == null && this.f1128c == null && this.f1129d == null && this.f1130e == null)) {
            Drawable[] compoundDrawables = this.f1126a.getCompoundDrawables();
            a(compoundDrawables[0], this.f1127b);
            a(compoundDrawables[1], this.f1128c);
            a(compoundDrawables[2], this.f1129d);
            a(compoundDrawables[3], this.f1130e);
        }
        if (Build.VERSION.SDK_INT < 17) {
            return;
        }
        if (this.f1131f != null || this.g != null) {
            Drawable[] compoundDrawablesRelative = this.f1126a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f1131f);
            a(compoundDrawablesRelative[2], this.g);
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.h.a();
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.h.g();
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.h.h();
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.h.i();
    }

    /* access modifiers changed from: package-private */
    public int[] h() {
        return this.h.j();
    }

    /* access modifiers changed from: package-private */
    public int i() {
        return this.h.k();
    }

    /* access modifiers changed from: package-private */
    public boolean j() {
        return this.h.n();
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"NewApi"})
    public void k(AttributeSet attributeSet, int i2) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        boolean z;
        boolean z2;
        AttributeSet attributeSet2 = attributeSet;
        int i3 = i2;
        Context context = this.f1126a.getContext();
        f n = f.n();
        b0 u = b0.u(context, attributeSet2, j.AppCompatTextHelper, i3, 0);
        int n2 = u.n(j.AppCompatTextHelper_android_textAppearance, -1);
        if (u.r(j.AppCompatTextHelper_android_drawableLeft)) {
            this.f1127b = d(context, n, u.n(j.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (u.r(j.AppCompatTextHelper_android_drawableTop)) {
            this.f1128c = d(context, n, u.n(j.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (u.r(j.AppCompatTextHelper_android_drawableRight)) {
            this.f1129d = d(context, n, u.n(j.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (u.r(j.AppCompatTextHelper_android_drawableBottom)) {
            this.f1130e = d(context, n, u.n(j.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (u.r(j.AppCompatTextHelper_android_drawableStart)) {
                this.f1131f = d(context, n, u.n(j.AppCompatTextHelper_android_drawableStart, 0));
            }
            if (u.r(j.AppCompatTextHelper_android_drawableEnd)) {
                this.g = d(context, n, u.n(j.AppCompatTextHelper_android_drawableEnd, 0));
            }
        }
        u.v();
        boolean z3 = this.f1126a.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean z4 = true;
        ColorStateList colorStateList3 = null;
        if (n2 != -1) {
            b0 s = b0.s(context, n2, j.TextAppearance);
            if (z3 || !s.r(j.TextAppearance_textAllCaps)) {
                z2 = false;
                z = false;
            } else {
                z2 = s.a(j.TextAppearance_textAllCaps, false);
                z = true;
            }
            u(context, s);
            if (Build.VERSION.SDK_INT < 23) {
                ColorStateList c2 = s.r(j.TextAppearance_android_textColor) ? s.c(j.TextAppearance_android_textColor) : null;
                colorStateList = s.r(j.TextAppearance_android_textColorHint) ? s.c(j.TextAppearance_android_textColorHint) : null;
                if (s.r(j.TextAppearance_android_textColorLink)) {
                    colorStateList3 = s.c(j.TextAppearance_android_textColorLink);
                }
                ColorStateList colorStateList4 = c2;
                colorStateList2 = colorStateList3;
                colorStateList3 = colorStateList4;
            } else {
                colorStateList2 = null;
                colorStateList = null;
            }
            s.v();
        } else {
            colorStateList2 = null;
            colorStateList = null;
            z2 = false;
            z = false;
        }
        b0 u2 = b0.u(context, attributeSet2, j.TextAppearance, i3, 0);
        if (z3 || !u2.r(j.TextAppearance_textAllCaps)) {
            z4 = z;
        } else {
            z2 = u2.a(j.TextAppearance_textAllCaps, false);
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (u2.r(j.TextAppearance_android_textColor)) {
                colorStateList3 = u2.c(j.TextAppearance_android_textColor);
            }
            if (u2.r(j.TextAppearance_android_textColorHint)) {
                colorStateList = u2.c(j.TextAppearance_android_textColorHint);
            }
            if (u2.r(j.TextAppearance_android_textColorLink)) {
                colorStateList2 = u2.c(j.TextAppearance_android_textColorLink);
            }
        }
        if (Build.VERSION.SDK_INT >= 28 && u2.r(j.TextAppearance_android_textSize) && u2.f(j.TextAppearance_android_textSize, -1) == 0) {
            this.f1126a.setTextSize(0, 0.0f);
        }
        u(context, u2);
        u2.v();
        if (colorStateList3 != null) {
            this.f1126a.setTextColor(colorStateList3);
        }
        if (colorStateList != null) {
            this.f1126a.setHintTextColor(colorStateList);
        }
        if (colorStateList2 != null) {
            this.f1126a.setLinkTextColor(colorStateList2);
        }
        if (!z3 && z4) {
            o(z2);
        }
        Typeface typeface = this.j;
        if (typeface != null) {
            this.f1126a.setTypeface(typeface, this.i);
        }
        this.h.o(attributeSet2, i3);
        if (b.f1373a && this.h.k() != 0) {
            int[] j2 = this.h.j();
            if (j2.length > 0) {
                if (((float) this.f1126a.getAutoSizeStepGranularity()) != -1.0f) {
                    this.f1126a.setAutoSizeTextTypeUniformWithConfiguration(this.h.h(), this.h.g(), this.h.i(), 0);
                } else {
                    this.f1126a.setAutoSizeTextTypeUniformWithPresetSizes(j2, 0);
                }
            }
        }
        b0 t = b0.t(context, attributeSet2, j.AppCompatTextView);
        int f2 = t.f(j.AppCompatTextView_firstBaselineToTopHeight, -1);
        int f3 = t.f(j.AppCompatTextView_lastBaselineToBottomHeight, -1);
        int f4 = t.f(j.AppCompatTextView_lineHeight, -1);
        t.v();
        if (f2 != -1) {
            i.k(this.f1126a, f2);
        }
        if (f3 != -1) {
            i.l(this.f1126a, f3);
        }
        if (f4 != -1) {
            i.m(this.f1126a, f4);
        }
    }

    /* access modifiers changed from: package-private */
    public void l(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.k) {
            this.j = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void m(boolean z, int i2, int i3, int i4, int i5) {
        if (!b.f1373a) {
            c();
        }
    }

    /* access modifiers changed from: package-private */
    public void n(Context context, int i2) {
        ColorStateList c2;
        b0 s = b0.s(context, i2, j.TextAppearance);
        if (s.r(j.TextAppearance_textAllCaps)) {
            o(s.a(j.TextAppearance_textAllCaps, false));
        }
        if (Build.VERSION.SDK_INT < 23 && s.r(j.TextAppearance_android_textColor) && (c2 = s.c(j.TextAppearance_android_textColor)) != null) {
            this.f1126a.setTextColor(c2);
        }
        if (s.r(j.TextAppearance_android_textSize) && s.f(j.TextAppearance_android_textSize, -1) == 0) {
            this.f1126a.setTextSize(0, 0.0f);
        }
        u(context, s);
        s.v();
        Typeface typeface = this.j;
        if (typeface != null) {
            this.f1126a.setTypeface(typeface, this.i);
        }
    }

    /* access modifiers changed from: package-private */
    public void o(boolean z) {
        this.f1126a.setAllCaps(z);
    }

    /* access modifiers changed from: package-private */
    public void p(int i2, int i3, int i4, int i5) throws IllegalArgumentException {
        this.h.p(i2, i3, i4, i5);
    }

    /* access modifiers changed from: package-private */
    public void q(int[] iArr, int i2) throws IllegalArgumentException {
        this.h.q(iArr, i2);
    }

    /* access modifiers changed from: package-private */
    public void r(int i2) {
        this.h.r(i2);
    }

    /* access modifiers changed from: package-private */
    public void s(int i2, float f2) {
        if (!b.f1373a && !j()) {
            t(i2, f2);
        }
    }
}
