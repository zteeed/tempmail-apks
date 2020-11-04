package androidx.appcompat.widget;

import a.h.k.u;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.a;

/* compiled from: AppCompatSeekBarHelper */
class j extends i {

    /* renamed from: d  reason: collision with root package name */
    private final SeekBar f1150d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f1151e;

    /* renamed from: f  reason: collision with root package name */
    private ColorStateList f1152f = null;
    private PorterDuff.Mode g = null;
    private boolean h = false;
    private boolean i = false;

    j(SeekBar seekBar) {
        super(seekBar);
        this.f1150d = seekBar;
    }

    private void f() {
        if (this.f1151e == null) {
            return;
        }
        if (this.h || this.i) {
            Drawable r = a.r(this.f1151e.mutate());
            this.f1151e = r;
            if (this.h) {
                a.o(r, this.f1152f);
            }
            if (this.i) {
                a.p(this.f1151e, this.g);
            }
            if (this.f1151e.isStateful()) {
                this.f1151e.setState(this.f1150d.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(AttributeSet attributeSet, int i2) {
        super.c(attributeSet, i2);
        b0 u = b0.u(this.f1150d.getContext(), attributeSet, a.a.j.AppCompatSeekBar, i2, 0);
        Drawable h2 = u.h(a.a.j.AppCompatSeekBar_android_thumb);
        if (h2 != null) {
            this.f1150d.setThumb(h2);
        }
        j(u.g(a.a.j.AppCompatSeekBar_tickMark));
        if (u.r(a.a.j.AppCompatSeekBar_tickMarkTintMode)) {
            this.g = o.e(u.k(a.a.j.AppCompatSeekBar_tickMarkTintMode, -1), this.g);
            this.i = true;
        }
        if (u.r(a.a.j.AppCompatSeekBar_tickMarkTint)) {
            this.f1152f = u.c(a.a.j.AppCompatSeekBar_tickMarkTint);
            this.h = true;
        }
        u.v();
        f();
    }

    /* access modifiers changed from: package-private */
    public void g(Canvas canvas) {
        if (this.f1151e != null) {
            int max = this.f1150d.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f1151e.getIntrinsicWidth();
                int intrinsicHeight = this.f1151e.getIntrinsicHeight();
                int i3 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight / 2;
                }
                this.f1151e.setBounds(-i3, -i2, i3, i2);
                float width = ((float) ((this.f1150d.getWidth() - this.f1150d.getPaddingLeft()) - this.f1150d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f1150d.getPaddingLeft(), (float) (this.f1150d.getHeight() / 2));
                for (int i4 = 0; i4 <= max; i4++) {
                    this.f1151e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void h() {
        Drawable drawable = this.f1151e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1150d.getDrawableState())) {
            this.f1150d.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    public void i() {
        Drawable drawable = this.f1151e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: package-private */
    public void j(Drawable drawable) {
        Drawable drawable2 = this.f1151e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1151e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1150d);
            a.m(drawable, u.t(this.f1150d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1150d.getDrawableState());
            }
            f();
        }
        this.f1150d.invalidate();
    }
}
