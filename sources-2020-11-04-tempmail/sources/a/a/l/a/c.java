package a.a.l.a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;

/* compiled from: DrawableWrapper */
public class c extends Drawable implements Drawable.Callback {

    /* renamed from: b  reason: collision with root package name */
    private Drawable f26b;

    public c(Drawable drawable) {
        b(drawable);
    }

    public Drawable a() {
        return this.f26b;
    }

    public void b(Drawable drawable) {
        Drawable drawable2 = this.f26b;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f26b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f26b.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f26b.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f26b.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f26b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f26b.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f26b.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f26b.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f26b.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f26b.getPadding(rect);
    }

    public int[] getState() {
        return this.f26b.getState();
    }

    public Region getTransparentRegion() {
        return this.f26b.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return a.h(this.f26b);
    }

    public boolean isStateful() {
        return this.f26b.isStateful();
    }

    public void jumpToCurrentState() {
        a.i(this.f26b);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f26b.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f26b.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f26b.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        a.j(this.f26b, z);
    }

    public void setChangingConfigurations(int i) {
        this.f26b.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f26b.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f26b.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f26b.setFilterBitmap(z);
    }

    public void setHotspot(float f2, float f3) {
        a.k(this.f26b, f2, f3);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        a.l(this.f26b, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f26b.setState(iArr);
    }

    public void setTint(int i) {
        a.n(this.f26b, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        a.o(this.f26b, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        a.p(this.f26b, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f26b.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
