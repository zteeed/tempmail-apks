package com.google.android.material.internal;

import a.h.k.d0.d;
import a.h.k.u;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.d0;
import androidx.core.widget.i;
import b.c.a.d.e;
import b.c.a.d.f;
import b.c.a.d.h;

public class NavigationMenuItemView extends ForegroundLinearLayout implements p.a {
    private static final int[] G = {16842912};
    private FrameLayout A;
    private j B;
    private ColorStateList C;
    private boolean D;
    private Drawable E;
    private final a.h.k.a F;
    private final int w;
    private boolean x;
    boolean y;
    private final CheckedTextView z;

    class a extends a.h.k.a {
        a() {
        }

        public void g(View view, d dVar) {
            super.g(view, dVar);
            dVar.X(NavigationMenuItemView.this.y);
        }
    }

    public NavigationMenuItemView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void B() {
        if (E()) {
            this.z.setVisibility(8);
            FrameLayout frameLayout = this.A;
            if (frameLayout != null) {
                LinearLayoutCompat.a aVar = (LinearLayoutCompat.a) frameLayout.getLayoutParams();
                aVar.width = -1;
                this.A.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.z.setVisibility(0);
        FrameLayout frameLayout2 = this.A;
        if (frameLayout2 != null) {
            LinearLayoutCompat.a aVar2 = (LinearLayoutCompat.a) frameLayout2.getLayoutParams();
            aVar2.width = -2;
            this.A.setLayoutParams(aVar2);
        }
    }

    private StateListDrawable C() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(a.a.a.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(G, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private boolean E() {
        return this.B.getTitle() == null && this.B.getIcon() == null && this.B.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.A == null) {
                this.A = (FrameLayout) ((ViewStub) findViewById(f.design_menu_item_action_area_stub)).inflate();
            }
            this.A.removeAllViews();
            this.A.addView(view);
        }
    }

    public void D() {
        FrameLayout frameLayout = this.A;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.z.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public boolean d() {
        return false;
    }

    public void e(j jVar, int i) {
        this.B = jVar;
        setVisibility(jVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            u.b0(this, C());
        }
        setCheckable(jVar.isCheckable());
        setChecked(jVar.isChecked());
        setEnabled(jVar.isEnabled());
        setTitle(jVar.getTitle());
        setIcon(jVar.getIcon());
        setActionView(jVar.getActionView());
        setContentDescription(jVar.getContentDescription());
        d0.a(this, jVar.getTooltipText());
        B();
    }

    public j getItemData() {
        return this.B;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        j jVar = this.B;
        if (jVar != null && jVar.isCheckable() && this.B.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, G);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.y != z2) {
            this.y = z2;
            this.F.l(this.z, 2048);
        }
    }

    public void setChecked(boolean z2) {
        refreshDrawableState();
        this.z.setChecked(z2);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
                androidx.core.graphics.drawable.a.o(drawable, this.C);
            }
            int i = this.w;
            drawable.setBounds(0, 0, i, i);
        } else if (this.x) {
            if (this.E == null) {
                Drawable a2 = androidx.core.content.c.f.a(getResources(), e.navigation_empty_icon, getContext().getTheme());
                this.E = a2;
                if (a2 != null) {
                    int i2 = this.w;
                    a2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.E;
        }
        i.j(this.z, drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i) {
        this.z.setCompoundDrawablePadding(i);
    }

    /* access modifiers changed from: package-private */
    public void setIconTintList(ColorStateList colorStateList) {
        this.C = colorStateList;
        this.D = colorStateList != null;
        j jVar = this.B;
        if (jVar != null) {
            setIcon(jVar.getIcon());
        }
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.x = z2;
    }

    public void setShortcut(boolean z2, char c2) {
    }

    public void setTextAppearance(int i) {
        i.o(this.z, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.z.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.F = new a();
        setOrientation(0);
        LayoutInflater.from(context).inflate(h.design_navigation_menu_item, this, true);
        this.w = context.getResources().getDimensionPixelSize(b.c.a.d.d.design_navigation_icon_size);
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(f.design_menu_item_text);
        this.z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        u.Z(this.z, this.F);
    }
}
