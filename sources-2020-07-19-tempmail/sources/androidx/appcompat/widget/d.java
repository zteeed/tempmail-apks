package androidx.appcompat.widget;

import a.a.j;
import a.h.k.t;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: AppCompatBackgroundHelper */
class d {

    /* renamed from: a  reason: collision with root package name */
    private final View f1082a;

    /* renamed from: b  reason: collision with root package name */
    private final f f1083b;

    /* renamed from: c  reason: collision with root package name */
    private int f1084c = -1;

    /* renamed from: d  reason: collision with root package name */
    private z f1085d;

    /* renamed from: e  reason: collision with root package name */
    private z f1086e;

    /* renamed from: f  reason: collision with root package name */
    private z f1087f;

    d(View view) {
        this.f1082a = view;
        this.f1083b = f.n();
    }

    private boolean a(Drawable drawable) {
        if (this.f1087f == null) {
            this.f1087f = new z();
        }
        z zVar = this.f1087f;
        zVar.a();
        ColorStateList k = t.k(this.f1082a);
        if (k != null) {
            zVar.f1181d = true;
            zVar.f1178a = k;
        }
        PorterDuff.Mode l = t.l(this.f1082a);
        if (l != null) {
            zVar.f1180c = true;
            zVar.f1179b = l;
        }
        if (!zVar.f1181d && !zVar.f1180c) {
            return false;
        }
        f.C(drawable, zVar, this.f1082a.getDrawableState());
        return true;
    }

    private boolean k() {
        int i = Build.VERSION.SDK_INT;
        if (i <= 21) {
            return i == 21;
        }
        if (this.f1085d != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        Drawable background = this.f1082a.getBackground();
        if (background == null) {
            return;
        }
        if (!k() || !a(background)) {
            z zVar = this.f1086e;
            if (zVar != null) {
                f.C(background, zVar, this.f1082a.getDrawableState());
                return;
            }
            z zVar2 = this.f1085d;
            if (zVar2 != null) {
                f.C(background, zVar2, this.f1082a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList c() {
        z zVar = this.f1086e;
        if (zVar != null) {
            return zVar.f1178a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        z zVar = this.f1086e;
        if (zVar != null) {
            return zVar.f1179b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void e(AttributeSet attributeSet, int i) {
        b0 u = b0.u(this.f1082a.getContext(), attributeSet, j.ViewBackgroundHelper, i, 0);
        try {
            if (u.r(j.ViewBackgroundHelper_android_background)) {
                this.f1084c = u.n(j.ViewBackgroundHelper_android_background, -1);
                ColorStateList s = this.f1083b.s(this.f1082a.getContext(), this.f1084c);
                if (s != null) {
                    h(s);
                }
            }
            if (u.r(j.ViewBackgroundHelper_backgroundTint)) {
                t.c0(this.f1082a, u.c(j.ViewBackgroundHelper_backgroundTint));
            }
            if (u.r(j.ViewBackgroundHelper_backgroundTintMode)) {
                t.d0(this.f1082a, o.e(u.k(j.ViewBackgroundHelper_backgroundTintMode, -1), (PorterDuff.Mode) null));
            }
        } finally {
            u.v();
        }
    }

    /* access modifiers changed from: package-private */
    public void f(Drawable drawable) {
        this.f1084c = -1;
        h((ColorStateList) null);
        b();
    }

    /* access modifiers changed from: package-private */
    public void g(int i) {
        this.f1084c = i;
        f fVar = this.f1083b;
        h(fVar != null ? fVar.s(this.f1082a.getContext(), i) : null);
        b();
    }

    /* access modifiers changed from: package-private */
    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1085d == null) {
                this.f1085d = new z();
            }
            z zVar = this.f1085d;
            zVar.f1178a = colorStateList;
            zVar.f1181d = true;
        } else {
            this.f1085d = null;
        }
        b();
    }

    /* access modifiers changed from: package-private */
    public void i(ColorStateList colorStateList) {
        if (this.f1086e == null) {
            this.f1086e = new z();
        }
        z zVar = this.f1086e;
        zVar.f1178a = colorStateList;
        zVar.f1181d = true;
        b();
    }

    /* access modifiers changed from: package-private */
    public void j(PorterDuff.Mode mode) {
        if (this.f1086e == null) {
            this.f1086e = new z();
        }
        z zVar = this.f1086e;
        zVar.f1179b = mode;
        zVar.f1180c = true;
        b();
    }
}
