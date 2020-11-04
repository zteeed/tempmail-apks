package com.google.android.gms.internal.base;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

public final class zae extends Drawable implements Drawable.Callback {

    /* renamed from: b  reason: collision with root package name */
    private int f9467b;

    /* renamed from: c  reason: collision with root package name */
    private long f9468c;

    /* renamed from: d  reason: collision with root package name */
    private int f9469d;

    /* renamed from: e  reason: collision with root package name */
    private int f9470e;

    /* renamed from: f  reason: collision with root package name */
    private int f9471f;
    private int g;
    private boolean h;
    private boolean i;
    private a j;
    private Drawable k;
    private Drawable l;
    private boolean m;
    private boolean n;
    private boolean o;
    private int p;

    private final boolean a() {
        if (!this.m) {
            this.n = (this.k.getConstantState() == null || this.l.getConstantState() == null) ? false : true;
            this.m = true;
        }
        return this.n;
    }

    public final void draw(Canvas canvas) {
        int i2 = this.f9467b;
        boolean z = false;
        boolean z2 = true;
        if (i2 == 1) {
            this.f9468c = SystemClock.uptimeMillis();
            this.f9467b = 2;
        } else if (i2 == 2 && this.f9468c >= 0) {
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.f9468c)) / ((float) this.f9471f);
            if (uptimeMillis < 1.0f) {
                z2 = false;
            }
            if (z2) {
                this.f9467b = 0;
            }
            this.g = (int) ((((float) this.f9469d) * Math.min(uptimeMillis, 1.0f)) + 0.0f);
            z = z2;
        } else {
            z = true;
        }
        int i3 = this.g;
        boolean z3 = this.h;
        Drawable drawable = this.k;
        Drawable drawable2 = this.l;
        if (z) {
            if (!z3 || i3 == 0) {
                drawable.draw(canvas);
            }
            int i4 = this.f9470e;
            if (i3 == i4) {
                drawable2.setAlpha(i4);
                drawable2.draw(canvas);
                return;
            }
            return;
        }
        if (z3) {
            drawable.setAlpha(this.f9470e - i3);
        }
        drawable.draw(canvas);
        if (z3) {
            drawable.setAlpha(this.f9470e);
        }
        if (i3 > 0) {
            drawable2.setAlpha(i3);
            drawable2.draw(canvas);
            drawable2.setAlpha(this.f9470e);
        }
        invalidateSelf();
    }

    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        a aVar = this.j;
        return changingConfigurations | aVar.f9463a | aVar.f9464b;
    }

    public final Drawable.ConstantState getConstantState() {
        if (!a()) {
            return null;
        }
        this.j.f9463a = getChangingConfigurations();
        return this.j;
    }

    public final int getIntrinsicHeight() {
        return Math.max(this.k.getIntrinsicHeight(), this.l.getIntrinsicHeight());
    }

    public final int getIntrinsicWidth() {
        return Math.max(this.k.getIntrinsicWidth(), this.l.getIntrinsicWidth());
    }

    public final int getOpacity() {
        if (!this.o) {
            this.p = Drawable.resolveOpacity(this.k.getOpacity(), this.l.getOpacity());
            this.o = true;
        }
        return this.p;
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public final Drawable mutate() {
        if (!this.i && super.mutate() == this) {
            if (a()) {
                this.k.mutate();
                this.l.mutate();
                this.i = true;
            } else {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        this.k.setBounds(rect);
        this.l.setBounds(rect);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    public final void setAlpha(int i2) {
        if (this.g == this.f9470e) {
            this.g = i2;
        }
        this.f9470e = i2;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.k.setColorFilter(colorFilter);
        this.l.setColorFilter(colorFilter);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
