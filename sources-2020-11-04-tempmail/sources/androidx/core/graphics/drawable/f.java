package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* compiled from: WrappedDrawableState */
final class f extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    int f1371a;

    /* renamed from: b  reason: collision with root package name */
    Drawable.ConstantState f1372b;

    /* renamed from: c  reason: collision with root package name */
    ColorStateList f1373c = null;

    /* renamed from: d  reason: collision with root package name */
    PorterDuff.Mode f1374d = d.h;

    f(f fVar) {
        if (fVar != null) {
            this.f1371a = fVar.f1371a;
            this.f1372b = fVar.f1372b;
            this.f1373c = fVar.f1373c;
            this.f1374d = fVar.f1374d;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        return this.f1372b != null;
    }

    public int getChangingConfigurations() {
        int i = this.f1371a;
        Drawable.ConstantState constantState = this.f1372b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    public Drawable newDrawable() {
        return newDrawable((Resources) null);
    }

    public Drawable newDrawable(Resources resources) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new e(this, resources);
        }
        return new d(this, resources);
    }
}
