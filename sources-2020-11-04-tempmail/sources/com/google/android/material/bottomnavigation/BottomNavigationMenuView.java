package com.google.android.material.bottomnavigation;

import a.h.j.e;
import a.h.j.g;
import a.h.k.u;
import a.q.b;
import a.q.o;
import a.q.q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.p;
import b.c.a.d.d;

public class BottomNavigationMenuView extends ViewGroup implements p {
    private static final int[] A = {-16842910};
    private static final int[] z = {16842912};

    /* renamed from: b  reason: collision with root package name */
    private final q f10893b;

    /* renamed from: c  reason: collision with root package name */
    private final int f10894c;

    /* renamed from: d  reason: collision with root package name */
    private final int f10895d;

    /* renamed from: e  reason: collision with root package name */
    private final int f10896e;

    /* renamed from: f  reason: collision with root package name */
    private final int f10897f;
    private final int g;
    private final View.OnClickListener h;
    private final e<BottomNavigationItemView> i;
    private boolean j;
    private int k;
    private BottomNavigationItemView[] l;
    private int m;
    private int n;
    private ColorStateList o;
    private int p;
    private ColorStateList q;
    private final ColorStateList r;
    private int s;
    private int t;
    private Drawable u;
    private int v;
    private int[] w;
    /* access modifiers changed from: private */
    public BottomNavigationPresenter x;
    /* access modifiers changed from: private */
    public h y;

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            j itemData = ((BottomNavigationItemView) view).getItemData();
            if (!BottomNavigationMenuView.this.y.O(itemData, BottomNavigationMenuView.this.x, 0)) {
                itemData.setChecked(true);
            }
        }
    }

    public BottomNavigationMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    private boolean g(int i2, int i3) {
        if (i2 == -1) {
            if (i3 > 3) {
                return true;
            }
        } else if (i2 == 0) {
            return true;
        }
        return false;
    }

    private BottomNavigationItemView getNewItem() {
        BottomNavigationItemView b2 = this.i.b();
        return b2 == null ? new BottomNavigationItemView(getContext()) : b2;
    }

    public void b(h hVar) {
        this.y = hVar;
    }

    public void d() {
        removeAllViews();
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.l;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                if (bottomNavigationItemView != null) {
                    this.i.a(bottomNavigationItemView);
                }
            }
        }
        if (this.y.size() == 0) {
            this.m = 0;
            this.n = 0;
            this.l = null;
            return;
        }
        this.l = new BottomNavigationItemView[this.y.size()];
        boolean g2 = g(this.k, this.y.G().size());
        for (int i2 = 0; i2 < this.y.size(); i2++) {
            this.x.d(true);
            this.y.getItem(i2).setCheckable(true);
            this.x.d(false);
            BottomNavigationItemView newItem = getNewItem();
            this.l[i2] = newItem;
            newItem.setIconTintList(this.o);
            newItem.setIconSize(this.p);
            newItem.setTextColor(this.r);
            newItem.setTextAppearanceInactive(this.s);
            newItem.setTextAppearanceActive(this.t);
            newItem.setTextColor(this.q);
            Drawable drawable = this.u;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.v);
            }
            newItem.setShifting(g2);
            newItem.setLabelVisibilityMode(this.k);
            newItem.e((j) this.y.getItem(i2), 0);
            newItem.setItemPosition(i2);
            newItem.setOnClickListener(this.h);
            addView(newItem);
        }
        int min = Math.min(this.y.size() - 1, this.n);
        this.n = min;
        this.y.getItem(min).setChecked(true);
    }

    public ColorStateList e(int i2) {
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
        return new ColorStateList(new int[][]{A, z, ViewGroup.EMPTY_STATE_SET}, new int[]{c2.getColorForState(A, defaultColor), i3, defaultColor});
    }

    public boolean f() {
        return this.j;
    }

    public ColorStateList getIconTintList() {
        return this.o;
    }

    public Drawable getItemBackground() {
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.l;
        if (bottomNavigationItemViewArr == null || bottomNavigationItemViewArr.length <= 0) {
            return this.u;
        }
        return bottomNavigationItemViewArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.v;
    }

    public int getItemIconSize() {
        return this.p;
    }

    public int getItemTextAppearanceActive() {
        return this.t;
    }

    public int getItemTextAppearanceInactive() {
        return this.s;
    }

    public ColorStateList getItemTextColor() {
        return this.q;
    }

    public int getLabelVisibilityMode() {
        return this.k;
    }

    public int getSelectedItemId() {
        return this.m;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public void h(int i2) {
        int size = this.y.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItem item = this.y.getItem(i3);
            if (i2 == item.getItemId()) {
                this.m = i2;
                this.n = i3;
                item.setChecked(true);
                return;
            }
        }
    }

    public void i() {
        h hVar = this.y;
        if (hVar != null && this.l != null) {
            int size = hVar.size();
            if (size != this.l.length) {
                d();
                return;
            }
            int i2 = this.m;
            for (int i3 = 0; i3 < size; i3++) {
                MenuItem item = this.y.getItem(i3);
                if (item.isChecked()) {
                    this.m = item.getItemId();
                    this.n = i3;
                }
            }
            if (i2 != this.m) {
                o.a(this, this.f10893b);
            }
            boolean g2 = g(this.k, this.y.G().size());
            for (int i4 = 0; i4 < size; i4++) {
                this.x.d(true);
                this.l[i4].setLabelVisibilityMode(this.k);
                this.l[i4].setShifting(g2);
                this.l[i4].e((j) this.y.getItem(i4), 0);
                this.x.d(false);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                if (u.t(this) == 1) {
                    int i10 = i6 - i8;
                    childAt.layout(i10 - childAt.getMeasuredWidth(), 0, i10, i7);
                } else {
                    childAt.layout(i8, 0, childAt.getMeasuredWidth() + i8, i7);
                }
                i8 += childAt.getMeasuredWidth();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = this.y.G().size();
        int childCount = getChildCount();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.g, 1073741824);
        if (!g(this.k, size2) || !this.j) {
            int min = Math.min(size / (size2 == 0 ? 1 : size2), this.f10896e);
            int i4 = size - (size2 * min);
            for (int i5 = 0; i5 < childCount; i5++) {
                if (getChildAt(i5).getVisibility() != 8) {
                    int[] iArr = this.w;
                    iArr[i5] = min;
                    if (i4 > 0) {
                        iArr[i5] = iArr[i5] + 1;
                        i4--;
                    }
                } else {
                    this.w[i5] = 0;
                }
            }
        } else {
            View childAt = getChildAt(this.n);
            int i6 = this.f10897f;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.f10896e, Integer.MIN_VALUE), makeMeasureSpec);
                i6 = Math.max(i6, childAt.getMeasuredWidth());
            }
            int i7 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min2 = Math.min(size - (this.f10895d * i7), Math.min(i6, this.f10896e));
            int i8 = size - min2;
            int min3 = Math.min(i8 / (i7 == 0 ? 1 : i7), this.f10894c);
            int i9 = i8 - (i7 * min3);
            int i10 = 0;
            while (i10 < childCount) {
                if (getChildAt(i10).getVisibility() != 8) {
                    this.w[i10] = i10 == this.n ? min2 : min3;
                    if (i9 > 0) {
                        int[] iArr2 = this.w;
                        iArr2[i10] = iArr2[i10] + 1;
                        i9--;
                    }
                } else {
                    this.w[i10] = 0;
                }
                i10++;
            }
        }
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.w[i12], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i11 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i11, View.MeasureSpec.makeMeasureSpec(i11, 1073741824), 0), View.resolveSizeAndState(this.g, makeMeasureSpec, 0));
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.o = colorStateList;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.l;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView iconTintList : bottomNavigationItemViewArr) {
                iconTintList.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.u = drawable;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.l;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView itemBackground : bottomNavigationItemViewArr) {
                itemBackground.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i2) {
        this.v = i2;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.l;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView itemBackground : bottomNavigationItemViewArr) {
                itemBackground.setItemBackground(i2);
            }
        }
    }

    public void setItemHorizontalTranslationEnabled(boolean z2) {
        this.j = z2;
    }

    public void setItemIconSize(int i2) {
        this.p = i2;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.l;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView iconSize : bottomNavigationItemViewArr) {
                iconSize.setIconSize(i2);
            }
        }
    }

    public void setItemTextAppearanceActive(int i2) {
        this.t = i2;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.l;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setTextAppearanceActive(i2);
                ColorStateList colorStateList = this.q;
                if (colorStateList != null) {
                    bottomNavigationItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i2) {
        this.s = i2;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.l;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setTextAppearanceInactive(i2);
                ColorStateList colorStateList = this.q;
                if (colorStateList != null) {
                    bottomNavigationItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.q = colorStateList;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.l;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView textColor : bottomNavigationItemViewArr) {
                textColor.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i2) {
        this.k = i2;
    }

    public void setPresenter(BottomNavigationPresenter bottomNavigationPresenter) {
        this.x = bottomNavigationPresenter;
    }

    public BottomNavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = new g(5);
        this.m = 0;
        this.n = 0;
        Resources resources = getResources();
        this.f10894c = resources.getDimensionPixelSize(d.design_bottom_navigation_item_max_width);
        this.f10895d = resources.getDimensionPixelSize(d.design_bottom_navigation_item_min_width);
        this.f10896e = resources.getDimensionPixelSize(d.design_bottom_navigation_active_item_max_width);
        this.f10897f = resources.getDimensionPixelSize(d.design_bottom_navigation_active_item_min_width);
        this.g = resources.getDimensionPixelSize(d.design_bottom_navigation_height);
        this.r = e(16842808);
        b bVar = new b();
        this.f10893b = bVar;
        bVar.x0(0);
        this.f10893b.v0(115);
        this.f10893b.i0(new a.l.a.a.b());
        this.f10893b.q0(new com.google.android.material.internal.j());
        this.h = new a();
        this.w = new int[5];
    }
}
