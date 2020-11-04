package com.google.android.material.bottomnavigation;

import a.h.k.r;
import a.h.k.t;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.widget.d0;
import androidx.core.graphics.drawable.a;
import androidx.core.widget.i;
import b.c.a.d.d;
import b.c.a.d.e;
import b.c.a.d.f;
import b.c.a.d.h;

public class BottomNavigationItemView extends FrameLayout implements p.a {
    private static final int[] n = {16842912};

    /* renamed from: b  reason: collision with root package name */
    private final int f10702b;

    /* renamed from: c  reason: collision with root package name */
    private float f10703c;

    /* renamed from: d  reason: collision with root package name */
    private float f10704d;

    /* renamed from: e  reason: collision with root package name */
    private float f10705e;

    /* renamed from: f  reason: collision with root package name */
    private int f10706f;
    private boolean g;
    private ImageView h;
    private final TextView i;
    private final TextView j;
    private int k;
    private j l;
    private ColorStateList m;

    public BottomNavigationItemView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void a(float f2, float f3) {
        this.f10703c = f2 - f3;
        this.f10704d = (f3 * 1.0f) / f2;
        this.f10705e = (f2 * 1.0f) / f3;
    }

    private void b(View view, int i2, int i3) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i2;
        layoutParams.gravity = i3;
        view.setLayoutParams(layoutParams);
    }

    private void c(View view, float f2, float f3, int i2) {
        view.setScaleX(f2);
        view.setScaleY(f3);
        view.setVisibility(i2);
    }

    public boolean d() {
        return false;
    }

    public void e(j jVar, int i2) {
        this.l = jVar;
        setCheckable(jVar.isCheckable());
        setChecked(jVar.isChecked());
        setEnabled(jVar.isEnabled());
        setIcon(jVar.getIcon());
        setTitle(jVar.getTitle());
        setId(jVar.getItemId());
        if (!TextUtils.isEmpty(jVar.getContentDescription())) {
            setContentDescription(jVar.getContentDescription());
        }
        d0.a(this, jVar.getTooltipText());
        setVisibility(jVar.isVisible() ? 0 : 8);
    }

    public j getItemData() {
        return this.l;
    }

    public int getItemPosition() {
        return this.k;
    }

    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        j jVar = this.l;
        if (jVar != null && jVar.isCheckable() && this.l.isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, n);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        TextView textView = this.j;
        textView.setPivotX((float) (textView.getWidth() / 2));
        TextView textView2 = this.j;
        textView2.setPivotY((float) textView2.getBaseline());
        TextView textView3 = this.i;
        textView3.setPivotX((float) (textView3.getWidth() / 2));
        TextView textView4 = this.i;
        textView4.setPivotY((float) textView4.getBaseline());
        int i2 = this.f10706f;
        if (i2 != -1) {
            if (i2 == 0) {
                if (z) {
                    b(this.h, this.f10702b, 49);
                    c(this.j, 1.0f, 1.0f, 0);
                } else {
                    b(this.h, this.f10702b, 17);
                    c(this.j, 0.5f, 0.5f, 4);
                }
                this.i.setVisibility(4);
            } else if (i2 != 1) {
                if (i2 == 2) {
                    b(this.h, this.f10702b, 17);
                    this.j.setVisibility(8);
                    this.i.setVisibility(8);
                }
            } else if (z) {
                b(this.h, (int) (((float) this.f10702b) + this.f10703c), 49);
                c(this.j, 1.0f, 1.0f, 0);
                TextView textView5 = this.i;
                float f2 = this.f10704d;
                c(textView5, f2, f2, 4);
            } else {
                b(this.h, this.f10702b, 49);
                TextView textView6 = this.j;
                float f3 = this.f10705e;
                c(textView6, f3, f3, 4);
                c(this.i, 1.0f, 1.0f, 0);
            }
        } else if (this.g) {
            if (z) {
                b(this.h, this.f10702b, 49);
                c(this.j, 1.0f, 1.0f, 0);
            } else {
                b(this.h, this.f10702b, 17);
                c(this.j, 0.5f, 0.5f, 4);
            }
            this.i.setVisibility(4);
        } else if (z) {
            b(this.h, (int) (((float) this.f10702b) + this.f10703c), 49);
            c(this.j, 1.0f, 1.0f, 0);
            TextView textView7 = this.i;
            float f4 = this.f10704d;
            c(textView7, f4, f4, 4);
        } else {
            b(this.h, this.f10702b, 49);
            TextView textView8 = this.j;
            float f5 = this.f10705e;
            c(textView8, f5, f5, 4);
            c(this.i, 1.0f, 1.0f, 0);
        }
        refreshDrawableState();
        setSelected(z);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.i.setEnabled(z);
        this.j.setEnabled(z);
        this.h.setEnabled(z);
        if (z) {
            t.n0(this, r.b(getContext(), 1002));
        } else {
            t.n0(this, (r) null);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = a.r(drawable).mutate();
            a.o(drawable, this.m);
        }
        this.h.setImageDrawable(drawable);
    }

    public void setIconSize(int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        layoutParams.width = i2;
        layoutParams.height = i2;
        this.h.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.m = colorStateList;
        j jVar = this.l;
        if (jVar != null) {
            setIcon(jVar.getIcon());
        }
    }

    public void setItemBackground(int i2) {
        setItemBackground(i2 == 0 ? null : androidx.core.content.a.f(getContext(), i2));
    }

    public void setItemPosition(int i2) {
        this.k = i2;
    }

    public void setLabelVisibilityMode(int i2) {
        if (this.f10706f != i2) {
            this.f10706f = i2;
            if (this.l != null) {
                setChecked(this.l.isChecked());
            }
        }
    }

    public void setShifting(boolean z) {
        if (this.g != z) {
            this.g = z;
            if (this.l != null) {
                setChecked(this.l.isChecked());
            }
        }
    }

    public void setShortcut(boolean z, char c2) {
    }

    public void setTextAppearanceActive(int i2) {
        i.o(this.j, i2);
        a(this.i.getTextSize(), this.j.getTextSize());
    }

    public void setTextAppearanceInactive(int i2) {
        i.o(this.i, i2);
        a(this.i.getTextSize(), this.j.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.i.setTextColor(colorStateList);
            this.j.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.i.setText(charSequence);
        this.j.setText(charSequence);
        j jVar = this.l;
        if (jVar == null || TextUtils.isEmpty(jVar.getContentDescription())) {
            setContentDescription(charSequence);
        }
    }

    public BottomNavigationItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BottomNavigationItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.k = -1;
        Resources resources = getResources();
        LayoutInflater.from(context).inflate(h.design_bottom_navigation_item, this, true);
        setBackgroundResource(e.design_bottom_navigation_item_background);
        this.f10702b = resources.getDimensionPixelSize(d.design_bottom_navigation_margin);
        this.h = (ImageView) findViewById(f.icon);
        this.i = (TextView) findViewById(f.smallLabel);
        this.j = (TextView) findViewById(f.largeLabel);
        t.i0(this.i, 2);
        t.i0(this.j, 2);
        setFocusable(true);
        a(this.i.getTextSize(), this.j.getTextSize());
    }

    public void setItemBackground(Drawable drawable) {
        t.b0(this, drawable);
    }
}
