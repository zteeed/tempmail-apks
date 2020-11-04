package androidx.appcompat.widget;

import a.a.j;
import a.a.k.a.a;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.widget.e;

/* compiled from: AppCompatImageHelper */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private final ImageView f1115a;

    /* renamed from: b  reason: collision with root package name */
    private z f1116b;

    /* renamed from: c  reason: collision with root package name */
    private z f1117c;

    /* renamed from: d  reason: collision with root package name */
    private z f1118d;

    public h(ImageView imageView) {
        this.f1115a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f1118d == null) {
            this.f1118d = new z();
        }
        z zVar = this.f1118d;
        zVar.a();
        ColorStateList a2 = e.a(this.f1115a);
        if (a2 != null) {
            zVar.f1181d = true;
            zVar.f1178a = a2;
        }
        PorterDuff.Mode b2 = e.b(this.f1115a);
        if (b2 != null) {
            zVar.f1180c = true;
            zVar.f1179b = b2;
        }
        if (!zVar.f1181d && !zVar.f1180c) {
            return false;
        }
        f.C(drawable, zVar, this.f1115a.getDrawableState());
        return true;
    }

    private boolean j() {
        int i = Build.VERSION.SDK_INT;
        if (i <= 21) {
            return i == 21;
        }
        if (this.f1116b != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        Drawable drawable = this.f1115a.getDrawable();
        if (drawable != null) {
            o.b(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (!j() || !a(drawable)) {
            z zVar = this.f1117c;
            if (zVar != null) {
                f.C(drawable, zVar, this.f1115a.getDrawableState());
                return;
            }
            z zVar2 = this.f1116b;
            if (zVar2 != null) {
                f.C(drawable, zVar2, this.f1115a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList c() {
        z zVar = this.f1117c;
        if (zVar != null) {
            return zVar.f1178a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        z zVar = this.f1117c;
        if (zVar != null) {
            return zVar.f1179b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return Build.VERSION.SDK_INT < 21 || !(this.f1115a.getBackground() instanceof RippleDrawable);
    }

    public void f(AttributeSet attributeSet, int i) {
        int n;
        b0 u = b0.u(this.f1115a.getContext(), attributeSet, j.AppCompatImageView, i, 0);
        try {
            Drawable drawable = this.f1115a.getDrawable();
            if (!(drawable != null || (n = u.n(j.AppCompatImageView_srcCompat, -1)) == -1 || (drawable = a.d(this.f1115a.getContext(), n)) == null)) {
                this.f1115a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                o.b(drawable);
            }
            if (u.r(j.AppCompatImageView_tint)) {
                e.c(this.f1115a, u.c(j.AppCompatImageView_tint));
            }
            if (u.r(j.AppCompatImageView_tintMode)) {
                e.d(this.f1115a, o.e(u.k(j.AppCompatImageView_tintMode, -1), (PorterDuff.Mode) null));
            }
        } finally {
            u.v();
        }
    }

    public void g(int i) {
        if (i != 0) {
            Drawable d2 = a.d(this.f1115a.getContext(), i);
            if (d2 != null) {
                o.b(d2);
            }
            this.f1115a.setImageDrawable(d2);
        } else {
            this.f1115a.setImageDrawable((Drawable) null);
        }
        b();
    }

    /* access modifiers changed from: package-private */
    public void h(ColorStateList colorStateList) {
        if (this.f1117c == null) {
            this.f1117c = new z();
        }
        z zVar = this.f1117c;
        zVar.f1178a = colorStateList;
        zVar.f1181d = true;
        b();
    }

    /* access modifiers changed from: package-private */
    public void i(PorterDuff.Mode mode) {
        if (this.f1117c == null) {
            this.f1117c = new z();
        }
        z zVar = this.f1117c;
        zVar.f1179b = mode;
        zVar.f1180c = true;
        b();
    }
}
