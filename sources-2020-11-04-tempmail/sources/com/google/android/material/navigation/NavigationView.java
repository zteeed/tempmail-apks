package com.google.android.material.navigation;

import a.h.k.c0;
import a.h.k.u;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.b0;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.internal.f;
import com.google.android.material.internal.g;
import com.google.android.material.internal.k;

public class NavigationView extends ScrimInsetsFrameLayout {
    private static final int[] j = {16842912};
    private static final int[] k = {-16842910};

    /* renamed from: e  reason: collision with root package name */
    private final f f11053e;

    /* renamed from: f  reason: collision with root package name */
    private final g f11054f;
    b g;
    private final int h;
    private MenuInflater i;

    class a implements h.a {
        a() {
        }

        public boolean a(h hVar, MenuItem menuItem) {
            b bVar = NavigationView.this.g;
            return bVar != null && bVar.a(menuItem);
        }

        public void b(h hVar) {
        }
    }

    public interface b {
        boolean a(MenuItem menuItem);
    }

    public NavigationView(Context context) {
        this(context, (AttributeSet) null);
    }

    private ColorStateList b(int i2) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i2, typedValue, true)) {
            return null;
        }
        ColorStateList c2 = a.a.k.a.a.c(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(a.a.a.colorPrimary, typedValue, true)) {
            return null;
        }
        int i3 = typedValue.data;
        int defaultColor = c2.getDefaultColor();
        return new ColorStateList(new int[][]{k, j, FrameLayout.EMPTY_STATE_SET}, new int[]{c2.getColorForState(k, defaultColor), i3, defaultColor});
    }

    private MenuInflater getMenuInflater() {
        if (this.i == null) {
            this.i = new a.a.n.g(getContext());
        }
        return this.i;
    }

    /* access modifiers changed from: protected */
    public void a(c0 c0Var) {
        this.f11054f.c(c0Var);
    }

    public View c(int i2) {
        return this.f11054f.v(i2);
    }

    public void d(int i2) {
        this.f11054f.E(true);
        getMenuInflater().inflate(i2, this.f11053e);
        this.f11054f.E(false);
        this.f11054f.i(false);
    }

    public MenuItem getCheckedItem() {
        return this.f11054f.d();
    }

    public int getHeaderCount() {
        return this.f11054f.e();
    }

    public Drawable getItemBackground() {
        return this.f11054f.f();
    }

    public int getItemHorizontalPadding() {
        return this.f11054f.g();
    }

    public int getItemIconPadding() {
        return this.f11054f.r();
    }

    public ColorStateList getItemIconTintList() {
        return this.f11054f.t();
    }

    public ColorStateList getItemTextColor() {
        return this.f11054f.s();
    }

    public Menu getMenu() {
        return this.f11053e;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), this.h), 1073741824);
        } else if (mode == 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(this.h, 1073741824);
        }
        super.onMeasure(i2, i3);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        this.f11053e.S(savedState.f11055d);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f11055d = bundle;
        this.f11053e.U(bundle);
        return savedState;
    }

    public void setCheckedItem(int i2) {
        MenuItem findItem = this.f11053e.findItem(i2);
        if (findItem != null) {
            this.f11054f.w((j) findItem);
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f11054f.y(drawable);
    }

    public void setItemBackgroundResource(int i2) {
        setItemBackground(androidx.core.content.a.f(getContext(), i2));
    }

    public void setItemHorizontalPadding(int i2) {
        this.f11054f.z(i2);
    }

    public void setItemHorizontalPaddingResource(int i2) {
        this.f11054f.z(getResources().getDimensionPixelSize(i2));
    }

    public void setItemIconPadding(int i2) {
        this.f11054f.A(i2);
    }

    public void setItemIconPaddingResource(int i2) {
        this.f11054f.A(getResources().getDimensionPixelSize(i2));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f11054f.B(colorStateList);
    }

    public void setItemTextAppearance(int i2) {
        this.f11054f.C(i2);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f11054f.D(colorStateList);
    }

    public void setNavigationItemSelectedListener(b bVar) {
        this.g = bVar;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        public Bundle f11055d;

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

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f11055d = parcel.readBundle(classLoader);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f11055d);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.c.a.d.b.navigationViewStyle);
    }

    public NavigationView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        ColorStateList colorStateList;
        boolean z;
        int i3;
        this.f11054f = new g();
        this.f11053e = new f(context);
        b0 i4 = k.i(context, attributeSet, b.c.a.d.k.NavigationView, i2, b.c.a.d.j.Widget_Design_NavigationView, new int[0]);
        u.b0(this, i4.g(b.c.a.d.k.NavigationView_android_background));
        if (i4.r(b.c.a.d.k.NavigationView_elevation)) {
            u.f0(this, (float) i4.f(b.c.a.d.k.NavigationView_elevation, 0));
        }
        u.g0(this, i4.a(b.c.a.d.k.NavigationView_android_fitsSystemWindows, false));
        this.h = i4.f(b.c.a.d.k.NavigationView_android_maxWidth, 0);
        if (i4.r(b.c.a.d.k.NavigationView_itemIconTint)) {
            colorStateList = i4.c(b.c.a.d.k.NavigationView_itemIconTint);
        } else {
            colorStateList = b(16842808);
        }
        if (i4.r(b.c.a.d.k.NavigationView_itemTextAppearance)) {
            i3 = i4.n(b.c.a.d.k.NavigationView_itemTextAppearance, 0);
            z = true;
        } else {
            i3 = 0;
            z = false;
        }
        ColorStateList c2 = i4.r(b.c.a.d.k.NavigationView_itemTextColor) ? i4.c(b.c.a.d.k.NavigationView_itemTextColor) : null;
        if (!z && c2 == null) {
            c2 = b(16842806);
        }
        Drawable g2 = i4.g(b.c.a.d.k.NavigationView_itemBackground);
        if (i4.r(b.c.a.d.k.NavigationView_itemHorizontalPadding)) {
            this.f11054f.z(i4.f(b.c.a.d.k.NavigationView_itemHorizontalPadding, 0));
        }
        int f2 = i4.f(b.c.a.d.k.NavigationView_itemIconPadding, 0);
        this.f11053e.V(new a());
        this.f11054f.x(1);
        this.f11054f.n(context, this.f11053e);
        this.f11054f.B(colorStateList);
        if (z) {
            this.f11054f.C(i3);
        }
        this.f11054f.D(c2);
        this.f11054f.y(g2);
        this.f11054f.A(f2);
        this.f11053e.b(this.f11054f);
        addView((View) this.f11054f.u(this));
        if (i4.r(b.c.a.d.k.NavigationView_menu)) {
            d(i4.n(b.c.a.d.k.NavigationView_menu, 0));
        }
        if (i4.r(b.c.a.d.k.NavigationView_headerLayout)) {
            c(i4.n(b.c.a.d.k.NavigationView_headerLayout, 0));
        }
        i4.v();
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.f11053e.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.f11054f.w((j) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
