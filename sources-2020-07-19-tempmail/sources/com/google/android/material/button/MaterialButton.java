package com.google.android.material.button;

import a.h.k.t;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.drawable.a;
import androidx.core.widget.i;
import b.c.a.d.b;
import b.c.a.d.j;
import com.google.android.material.internal.k;
import com.google.android.material.internal.l;

public class MaterialButton extends AppCompatButton {

    /* renamed from: d  reason: collision with root package name */
    private final b f10736d;

    /* renamed from: e  reason: collision with root package name */
    private int f10737e;

    /* renamed from: f  reason: collision with root package name */
    private PorterDuff.Mode f10738f;
    private ColorStateList g;
    private Drawable h;
    private int i;
    private int j;
    private int k;

    public MaterialButton(Context context) {
        this(context, (AttributeSet) null);
    }

    private boolean a() {
        return t.t(this) == 1;
    }

    private boolean b() {
        b bVar = this.f10736d;
        return bVar != null && !bVar.j();
    }

    private void c() {
        Drawable drawable = this.h;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.h = mutate;
            a.o(mutate, this.g);
            PorterDuff.Mode mode = this.f10738f;
            if (mode != null) {
                a.p(this.h, mode);
            }
            int i2 = this.i;
            if (i2 == 0) {
                i2 = this.h.getIntrinsicWidth();
            }
            int i3 = this.i;
            if (i3 == 0) {
                i3 = this.h.getIntrinsicHeight();
            }
            Drawable drawable2 = this.h;
            int i4 = this.j;
            drawable2.setBounds(i4, 0, i2 + i4, i3);
        }
        i.j(this, this.h, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (b()) {
            return this.f10736d.d();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.h;
    }

    public int getIconGravity() {
        return this.k;
    }

    public int getIconPadding() {
        return this.f10737e;
    }

    public int getIconSize() {
        return this.i;
    }

    public ColorStateList getIconTint() {
        return this.g;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f10738f;
    }

    public ColorStateList getRippleColor() {
        if (b()) {
            return this.f10736d.e();
        }
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (b()) {
            return this.f10736d.f();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (b()) {
            return this.f10736d.g();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (b()) {
            return this.f10736d.h();
        }
        return super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (b()) {
            return this.f10736d.i();
        }
        return super.getSupportBackgroundTintMode();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (Build.VERSION.SDK_INT < 21 && b()) {
            this.f10736d.c(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        b bVar;
        super.onLayout(z, i2, i3, i4, i5);
        if (Build.VERSION.SDK_INT == 21 && (bVar = this.f10736d) != null) {
            bVar.v(i5 - i3, i4 - i2);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.h != null && this.k == 2) {
            int measureText = (int) getPaint().measureText(getText().toString());
            int i4 = this.i;
            if (i4 == 0) {
                i4 = this.h.getIntrinsicWidth();
            }
            int measuredWidth = (((((getMeasuredWidth() - measureText) - t.w(this)) - i4) - this.f10737e) - t.x(this)) / 2;
            if (a()) {
                measuredWidth = -measuredWidth;
            }
            if (this.j != measuredWidth) {
                this.j = measuredWidth;
                c();
            }
        }
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i2) {
        if (b()) {
            this.f10736d.l(i2);
        } else {
            super.setBackgroundColor(i2);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!b()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            Log.i("MaterialButton", "Setting a custom background is not supported.");
            this.f10736d.m();
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    public void setBackgroundResource(int i2) {
        setBackgroundDrawable(i2 != 0 ? a.a.k.a.a.d(getContext(), i2) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCornerRadius(int i2) {
        if (b()) {
            this.f10736d.n(i2);
        }
    }

    public void setCornerRadiusResource(int i2) {
        if (b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i2));
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.h != drawable) {
            this.h = drawable;
            c();
        }
    }

    public void setIconGravity(int i2) {
        this.k = i2;
    }

    public void setIconPadding(int i2) {
        if (this.f10737e != i2) {
            this.f10737e = i2;
            setCompoundDrawablePadding(i2);
        }
    }

    public void setIconResource(int i2) {
        setIcon(i2 != 0 ? a.a.k.a.a.d(getContext(), i2) : null);
    }

    public void setIconSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.i != i2) {
            this.i = i2;
            c();
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.g != colorStateList) {
            this.g = colorStateList;
            c();
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f10738f != mode) {
            this.f10738f = mode;
            c();
        }
    }

    public void setIconTintResource(int i2) {
        setIconTint(a.a.k.a.a.c(getContext(), i2));
    }

    /* access modifiers changed from: package-private */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (b()) {
            this.f10736d.o(colorStateList);
        }
    }

    public void setRippleColorResource(int i2) {
        if (b()) {
            setRippleColor(a.a.k.a.a.c(getContext(), i2));
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (b()) {
            this.f10736d.p(colorStateList);
        }
    }

    public void setStrokeColorResource(int i2) {
        if (b()) {
            setStrokeColor(a.a.k.a.a.c(getContext(), i2));
        }
    }

    public void setStrokeWidth(int i2) {
        if (b()) {
            this.f10736d.q(i2);
        }
    }

    public void setStrokeWidthResource(int i2) {
        if (b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i2));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (b()) {
            this.f10736d.r(colorStateList);
        } else if (this.f10736d != null) {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (b()) {
            this.f10736d.s(mode);
        } else if (this.f10736d != null) {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.materialButtonStyle);
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TypedArray h2 = k.h(context, attributeSet, b.c.a.d.k.MaterialButton, i2, j.Widget_MaterialComponents_Button, new int[0]);
        this.f10737e = h2.getDimensionPixelSize(b.c.a.d.k.MaterialButton_iconPadding, 0);
        this.f10738f = l.b(h2.getInt(b.c.a.d.k.MaterialButton_iconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.g = b.c.a.d.q.a.a(getContext(), h2, b.c.a.d.k.MaterialButton_iconTint);
        this.h = b.c.a.d.q.a.b(getContext(), h2, b.c.a.d.k.MaterialButton_icon);
        this.k = h2.getInteger(b.c.a.d.k.MaterialButton_iconGravity, 1);
        this.i = h2.getDimensionPixelSize(b.c.a.d.k.MaterialButton_iconSize, 0);
        b bVar = new b(this);
        this.f10736d = bVar;
        bVar.k(h2);
        h2.recycle();
        setCompoundDrawablePadding(this.f10737e);
        c();
    }
}
