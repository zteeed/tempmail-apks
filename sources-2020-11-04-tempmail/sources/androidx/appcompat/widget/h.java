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
    private final ImageView f1142a;

    /* renamed from: b  reason: collision with root package name */
    private z f1143b;

    /* renamed from: c  reason: collision with root package name */
    private z f1144c;

    /* renamed from: d  reason: collision with root package name */
    private z f1145d;

    public h(ImageView imageView) {
        this.f1142a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f1145d == null) {
            this.f1145d = new z();
        }
        z zVar = this.f1145d;
        zVar.a();
        ColorStateList a2 = e.a(this.f1142a);
        if (a2 != null) {
            zVar.f1208d = true;
            zVar.f1205a = a2;
        }
        PorterDuff.Mode b2 = e.b(this.f1142a);
        if (b2 != null) {
            zVar.f1207c = true;
            zVar.f1206b = b2;
        }
        if (!zVar.f1208d && !zVar.f1207c) {
            return false;
        }
        f.C(drawable, zVar, this.f1142a.getDrawableState());
        return true;
    }

    private boolean j() {
        int i = Build.VERSION.SDK_INT;
        if (i <= 21) {
            return i == 21;
        }
        if (this.f1143b != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        Drawable drawable = this.f1142a.getDrawable();
        if (drawable != null) {
            o.b(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (!j() || !a(drawable)) {
            z zVar = this.f1144c;
            if (zVar != null) {
                f.C(drawable, zVar, this.f1142a.getDrawableState());
                return;
            }
            z zVar2 = this.f1143b;
            if (zVar2 != null) {
                f.C(drawable, zVar2, this.f1142a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList c() {
        z zVar = this.f1144c;
        if (zVar != null) {
            return zVar.f1205a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        z zVar = this.f1144c;
        if (zVar != null) {
            return zVar.f1206b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return Build.VERSION.SDK_INT < 21 || !(this.f1142a.getBackground() instanceof RippleDrawable);
    }

    public void f(AttributeSet attributeSet, int i) {
        int n;
        b0 u = b0.u(this.f1142a.getContext(), attributeSet, j.AppCompatImageView, i, 0);
        try {
            Drawable drawable = this.f1142a.getDrawable();
            if (!(drawable != null || (n = u.n(j.AppCompatImageView_srcCompat, -1)) == -1 || (drawable = a.d(this.f1142a.getContext(), n)) == null)) {
                this.f1142a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                o.b(drawable);
            }
            if (u.r(j.AppCompatImageView_tint)) {
                e.c(this.f1142a, u.c(j.AppCompatImageView_tint));
            }
            if (u.r(j.AppCompatImageView_tintMode)) {
                e.d(this.f1142a, o.e(u.k(j.AppCompatImageView_tintMode, -1), (PorterDuff.Mode) null));
            }
        } finally {
            u.v();
        }
    }

    public void g(int i) {
        if (i != 0) {
            Drawable d2 = a.d(this.f1142a.getContext(), i);
            if (d2 != null) {
                o.b(d2);
            }
            this.f1142a.setImageDrawable(d2);
        } else {
            this.f1142a.setImageDrawable((Drawable) null);
        }
        b();
    }

    /* access modifiers changed from: package-private */
    public void h(ColorStateList colorStateList) {
        if (this.f1144c == null) {
            this.f1144c = new z();
        }
        z zVar = this.f1144c;
        zVar.f1205a = colorStateList;
        zVar.f1208d = true;
        b();
    }

    /* access modifiers changed from: package-private */
    public void i(PorterDuff.Mode mode) {
        if (this.f1144c == null) {
            this.f1144c = new z();
        }
        z zVar = this.f1144c;
        zVar.f1206b = mode;
        zVar.f1207c = true;
        b();
    }
}
