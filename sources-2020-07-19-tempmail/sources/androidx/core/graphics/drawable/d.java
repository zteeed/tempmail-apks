package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* compiled from: WrappedDrawableApi14 */
class d extends Drawable implements Drawable.Callback, c, b {
    static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    private int f1339b;

    /* renamed from: c  reason: collision with root package name */
    private PorterDuff.Mode f1340c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1341d;

    /* renamed from: e  reason: collision with root package name */
    f f1342e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1343f;
    Drawable g;

    d(f fVar, Resources resources) {
        this.f1342e = fVar;
        e(resources);
    }

    private f d() {
        return new f(this.f1342e);
    }

    private void e(Resources resources) {
        Drawable.ConstantState constantState;
        f fVar = this.f1342e;
        if (fVar != null && (constantState = fVar.f1345b) != null) {
            a(constantState.newDrawable(resources));
        }
    }

    private boolean f(int[] iArr) {
        if (!c()) {
            return false;
        }
        f fVar = this.f1342e;
        ColorStateList colorStateList = fVar.f1346c;
        PorterDuff.Mode mode = fVar.f1347d;
        if (colorStateList == null || mode == null) {
            this.f1341d = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f1341d && colorForState == this.f1339b && mode == this.f1340c)) {
                setColorFilter(colorForState, mode);
                this.f1339b = colorForState;
                this.f1340c = mode;
                this.f1341d = true;
                return true;
            }
        }
        return false;
    }

    public final void a(Drawable drawable) {
        Drawable drawable2 = this.g;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            f fVar = this.f1342e;
            if (fVar != null) {
                fVar.f1345b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public final Drawable b() {
        return this.g;
    }

    /* access modifiers changed from: protected */
    public boolean c() {
        return true;
    }

    public void draw(Canvas canvas) {
        this.g.draw(canvas);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        f fVar = this.f1342e;
        return changingConfigurations | (fVar != null ? fVar.getChangingConfigurations() : 0) | this.g.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        f fVar = this.f1342e;
        if (fVar == null || !fVar.a()) {
            return null;
        }
        this.f1342e.f1344a = getChangingConfigurations();
        return this.f1342e;
    }

    public Drawable getCurrent() {
        return this.g.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.g.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.g.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.g.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.g.getMinimumWidth();
    }

    public int getOpacity() {
        return this.g.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.g.getPadding(rect);
    }

    public int[] getState() {
        return this.g.getState();
    }

    public Region getTransparentRegion() {
        return this.g.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return this.g.isAutoMirrored();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f1342e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = r1.c()
            if (r0 == 0) goto L_0x000d
            androidx.core.graphics.drawable.f r0 = r1.f1342e
            if (r0 == 0) goto L_0x000d
            android.content.res.ColorStateList r0 = r0.f1346c
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001e
        L_0x0016:
            android.graphics.drawable.Drawable r0 = r1.g
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0020
        L_0x001e:
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.d.isStateful():boolean");
    }

    public void jumpToCurrentState() {
        this.g.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.f1343f && super.mutate() == this) {
            this.f1342e = d();
            Drawable drawable = this.g;
            if (drawable != null) {
                drawable.mutate();
            }
            f fVar = this.f1342e;
            if (fVar != null) {
                Drawable drawable2 = this.g;
                fVar.f1345b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f1343f = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.g.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.g.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        this.g.setAutoMirrored(z);
    }

    public void setChangingConfigurations(int i) {
        this.g.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.g.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.g.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.g.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        return f(iArr) || this.g.setState(iArr);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f1342e.f1346c = colorStateList;
        f(getState());
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f1342e.f1347d = mode;
        f(getState());
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.g.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    d(Drawable drawable) {
        this.f1342e = d();
        a(drawable);
    }
}
