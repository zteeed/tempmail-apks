package com.google.android.material.bottomnavigation;

import a.a.n.g;
import a.h.k.u;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.b0;
import androidx.customview.view.AbsSavedState;
import b.c.a.d.d;
import b.c.a.d.j;
import com.google.android.material.internal.k;

public class BottomNavigationView extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    private final h f10904b;

    /* renamed from: c  reason: collision with root package name */
    private final BottomNavigationMenuView f10905c;

    /* renamed from: d  reason: collision with root package name */
    private final BottomNavigationPresenter f10906d;

    /* renamed from: e  reason: collision with root package name */
    private MenuInflater f10907e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public c f10908f;
    /* access modifiers changed from: private */
    public b g;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        Bundle f10909d;

        static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel, ClassLoader classLoader) {
            this.f10909d = parcel.readBundle(classLoader);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f10909d);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel, classLoader);
        }
    }

    class a implements h.a {
        a() {
        }

        public boolean a(h hVar, MenuItem menuItem) {
            if (BottomNavigationView.this.g != null && menuItem.getItemId() == BottomNavigationView.this.getSelectedItemId()) {
                BottomNavigationView.this.g.a(menuItem);
                return true;
            } else if (BottomNavigationView.this.f10908f == null || BottomNavigationView.this.f10908f.a(menuItem)) {
                return false;
            } else {
                return true;
            }
        }

        public void b(h hVar) {
        }
    }

    public interface b {
        void a(MenuItem menuItem);
    }

    public interface c {
        boolean a(MenuItem menuItem);
    }

    public BottomNavigationView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void c(Context context) {
        View view = new View(context);
        view.setBackgroundColor(androidx.core.content.a.d(context, b.c.a.d.c.design_bottom_navigation_shadow_color));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(d.design_bottom_navigation_shadow_height)));
        addView(view);
    }

    private MenuInflater getMenuInflater() {
        if (this.f10907e == null) {
            this.f10907e = new g(getContext());
        }
        return this.f10907e;
    }

    public void d(int i) {
        this.f10906d.d(true);
        getMenuInflater().inflate(i, this.f10904b);
        this.f10906d.d(false);
        this.f10906d.i(true);
    }

    public Drawable getItemBackground() {
        return this.f10905c.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f10905c.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f10905c.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f10905c.getIconTintList();
    }

    public int getItemTextAppearanceActive() {
        return this.f10905c.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f10905c.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f10905c.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f10905c.getLabelVisibilityMode();
    }

    public int getMaxItemCount() {
        return 5;
    }

    public Menu getMenu() {
        return this.f10904b;
    }

    public int getSelectedItemId() {
        return this.f10905c.getSelectedItemId();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        this.f10904b.S(savedState.f10909d);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f10909d = bundle;
        this.f10904b.U(bundle);
        return savedState;
    }

    public void setItemBackground(Drawable drawable) {
        this.f10905c.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i) {
        this.f10905c.setItemBackgroundRes(i);
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        if (this.f10905c.f() != z) {
            this.f10905c.setItemHorizontalTranslationEnabled(z);
            this.f10906d.i(false);
        }
    }

    public void setItemIconSize(int i) {
        this.f10905c.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f10905c.setIconTintList(colorStateList);
    }

    public void setItemTextAppearanceActive(int i) {
        this.f10905c.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f10905c.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f10905c.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f10905c.getLabelVisibilityMode() != i) {
            this.f10905c.setLabelVisibilityMode(i);
            this.f10906d.i(false);
        }
    }

    public void setOnNavigationItemReselectedListener(b bVar) {
        this.g = bVar;
    }

    public void setOnNavigationItemSelectedListener(c cVar) {
        this.f10908f = cVar;
    }

    public void setSelectedItemId(int i) {
        MenuItem findItem = this.f10904b.findItem(i);
        if (findItem != null && !this.f10904b.O(findItem, this.f10906d, 0)) {
            findItem.setChecked(true);
        }
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.c.a.d.b.bottomNavigationStyle);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10906d = new BottomNavigationPresenter();
        this.f10904b = new a(context);
        this.f10905c = new BottomNavigationMenuView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.f10905c.setLayoutParams(layoutParams);
        this.f10906d.b(this.f10905c);
        this.f10906d.c(1);
        this.f10905c.setPresenter(this.f10906d);
        this.f10904b.b(this.f10906d);
        this.f10906d.n(getContext(), this.f10904b);
        b0 i2 = k.i(context, attributeSet, b.c.a.d.k.BottomNavigationView, i, j.Widget_Design_BottomNavigationView, b.c.a.d.k.BottomNavigationView_itemTextAppearanceInactive, b.c.a.d.k.BottomNavigationView_itemTextAppearanceActive);
        if (i2.r(b.c.a.d.k.BottomNavigationView_itemIconTint)) {
            this.f10905c.setIconTintList(i2.c(b.c.a.d.k.BottomNavigationView_itemIconTint));
        } else {
            BottomNavigationMenuView bottomNavigationMenuView = this.f10905c;
            bottomNavigationMenuView.setIconTintList(bottomNavigationMenuView.e(16842808));
        }
        setItemIconSize(i2.f(b.c.a.d.k.BottomNavigationView_itemIconSize, getResources().getDimensionPixelSize(d.design_bottom_navigation_icon_size)));
        if (i2.r(b.c.a.d.k.BottomNavigationView_itemTextAppearanceInactive)) {
            setItemTextAppearanceInactive(i2.n(b.c.a.d.k.BottomNavigationView_itemTextAppearanceInactive, 0));
        }
        if (i2.r(b.c.a.d.k.BottomNavigationView_itemTextAppearanceActive)) {
            setItemTextAppearanceActive(i2.n(b.c.a.d.k.BottomNavigationView_itemTextAppearanceActive, 0));
        }
        if (i2.r(b.c.a.d.k.BottomNavigationView_itemTextColor)) {
            setItemTextColor(i2.c(b.c.a.d.k.BottomNavigationView_itemTextColor));
        }
        if (i2.r(b.c.a.d.k.BottomNavigationView_elevation)) {
            u.f0(this, (float) i2.f(b.c.a.d.k.BottomNavigationView_elevation, 0));
        }
        setLabelVisibilityMode(i2.l(b.c.a.d.k.BottomNavigationView_labelVisibilityMode, -1));
        setItemHorizontalTranslationEnabled(i2.a(b.c.a.d.k.BottomNavigationView_itemHorizontalTranslationEnabled, true));
        this.f10905c.setItemBackgroundRes(i2.n(b.c.a.d.k.BottomNavigationView_itemBackground, 0));
        if (i2.r(b.c.a.d.k.BottomNavigationView_menu)) {
            d(i2.n(b.c.a.d.k.BottomNavigationView_menu, 0));
        }
        i2.v();
        addView(this.f10905c, layoutParams);
        if (Build.VERSION.SDK_INT < 21) {
            c(context);
        }
        this.f10904b.V(new a());
    }
}
