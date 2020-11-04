package androidx.appcompat.widget;

import a.a.j;
import a.h.k.u;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: AppCompatBackgroundHelper */
class d {

    /* renamed from: a  reason: collision with root package name */
    private final View f1109a;

    /* renamed from: b  reason: collision with root package name */
    private final f f1110b;

    /* renamed from: c  reason: collision with root package name */
    private int f1111c = -1;

    /* renamed from: d  reason: collision with root package name */
    private z f1112d;

    /* renamed from: e  reason: collision with root package name */
    private z f1113e;

    /* renamed from: f  reason: collision with root package name */
    private z f1114f;

    d(View view) {
        this.f1109a = view;
        this.f1110b = f.n();
    }

    private boolean a(Drawable drawable) {
        if (this.f1114f == null) {
            this.f1114f = new z();
        }
        z zVar = this.f1114f;
        zVar.a();
        ColorStateList k = u.k(this.f1109a);
        if (k != null) {
            zVar.f1208d = true;
            zVar.f1205a = k;
        }
        PorterDuff.Mode l = u.l(this.f1109a);
        if (l != null) {
            zVar.f1207c = true;
            zVar.f1206b = l;
        }
        if (!zVar.f1208d && !zVar.f1207c) {
            return false;
        }
        f.C(drawable, zVar, this.f1109a.getDrawableState());
        return true;
    }

    private boolean k() {
        int i = Build.VERSION.SDK_INT;
        if (i <= 21) {
            return i == 21;
        }
        if (this.f1112d != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        Drawable background = this.f1109a.getBackground();
        if (background == null) {
            return;
        }
        if (!k() || !a(background)) {
            z zVar = this.f1113e;
            if (zVar != null) {
                f.C(background, zVar, this.f1109a.getDrawableState());
                return;
            }
            z zVar2 = this.f1112d;
            if (zVar2 != null) {
                f.C(background, zVar2, this.f1109a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList c() {
        z zVar = this.f1113e;
        if (zVar != null) {
            return zVar.f1205a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        z zVar = this.f1113e;
        if (zVar != null) {
            return zVar.f1206b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void e(AttributeSet attributeSet, int i) {
        b0 u = b0.u(this.f1109a.getContext(), attributeSet, j.ViewBackgroundHelper, i, 0);
        try {
            if (u.r(j.ViewBackgroundHelper_android_background)) {
                this.f1111c = u.n(j.ViewBackgroundHelper_android_background, -1);
                ColorStateList s = this.f1110b.s(this.f1109a.getContext(), this.f1111c);
                if (s != null) {
                    h(s);
                }
            }
            if (u.r(j.ViewBackgroundHelper_backgroundTint)) {
                u.c0(this.f1109a, u.c(j.ViewBackgroundHelper_backgroundTint));
            }
            if (u.r(j.ViewBackgroundHelper_backgroundTintMode)) {
                u.d0(this.f1109a, o.e(u.k(j.ViewBackgroundHelper_backgroundTintMode, -1), (PorterDuff.Mode) null));
            }
        } finally {
            u.v();
        }
    }

    /* access modifiers changed from: package-private */
    public void f(Drawable drawable) {
        this.f1111c = -1;
        h((ColorStateList) null);
        b();
    }

    /* access modifiers changed from: package-private */
    public void g(int i) {
        this.f1111c = i;
        f fVar = this.f1110b;
        h(fVar != null ? fVar.s(this.f1109a.getContext(), i) : null);
        b();
    }

    /* access modifiers changed from: package-private */
    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1112d == null) {
                this.f1112d = new z();
            }
            z zVar = this.f1112d;
            zVar.f1205a = colorStateList;
            zVar.f1208d = true;
        } else {
            this.f1112d = null;
        }
        b();
    }

    /* access modifiers changed from: package-private */
    public void i(ColorStateList colorStateList) {
        if (this.f1113e == null) {
            this.f1113e = new z();
        }
        z zVar = this.f1113e;
        zVar.f1205a = colorStateList;
        zVar.f1208d = true;
        b();
    }

    /* access modifiers changed from: package-private */
    public void j(PorterDuff.Mode mode) {
        if (this.f1113e == null) {
            this.f1113e = new z();
        }
        z zVar = this.f1113e;
        zVar.f1206b = mode;
        zVar.f1207c = true;
        b();
    }
}
