package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* compiled from: WrappedDrawableState */
final class f extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    int f1344a;

    /* renamed from: b  reason: collision with root package name */
    Drawable.ConstantState f1345b;

    /* renamed from: c  reason: collision with root package name */
    ColorStateList f1346c = null;

    /* renamed from: d  reason: collision with root package name */
    PorterDuff.Mode f1347d = d.h;

    f(f fVar) {
        if (fVar != null) {
            this.f1344a = fVar.f1344a;
            this.f1345b = fVar.f1345b;
            this.f1346c = fVar.f1346c;
            this.f1347d = fVar.f1347d;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        return this.f1345b != null;
    }

    public int getChangingConfigurations() {
        int i = this.f1344a;
        Drawable.ConstantState constantState = this.f1345b;
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
