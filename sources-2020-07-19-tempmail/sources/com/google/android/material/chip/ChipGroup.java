package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import b.c.a.d.j;
import com.google.android.material.internal.FlowLayout;
import com.google.android.material.internal.k;

public class ChipGroup extends FlowLayout {

    /* renamed from: e  reason: collision with root package name */
    private int f10753e;

    /* renamed from: f  reason: collision with root package name */
    private int f10754f;
    /* access modifiers changed from: private */
    public boolean g;
    private d h;
    /* access modifiers changed from: private */
    public final b i;
    private e j;
    /* access modifiers changed from: private */
    public int k;
    /* access modifiers changed from: private */
    public boolean l;

    private class b implements CompoundButton.OnCheckedChangeListener {
        private b() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!ChipGroup.this.l) {
                int id = compoundButton.getId();
                if (z) {
                    if (!(ChipGroup.this.k == -1 || ChipGroup.this.k == id || !ChipGroup.this.g)) {
                        ChipGroup chipGroup = ChipGroup.this;
                        chipGroup.k(chipGroup.k, false);
                    }
                    ChipGroup.this.setCheckedId(id);
                } else if (ChipGroup.this.k == id) {
                    ChipGroup.this.setCheckedId(-1);
                }
            }
        }
    }

    public static class c extends ViewGroup.MarginLayoutParams {
        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(int i, int i2) {
            super(i, i2);
        }
    }

    public interface d {
        void a(ChipGroup chipGroup, int i);
    }

    private class e implements ViewGroup.OnHierarchyChangeListener {
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public ViewGroup.OnHierarchyChangeListener f10756b;

        private e() {
        }

        public void onChildViewAdded(View view, View view2) {
            int i;
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    if (Build.VERSION.SDK_INT >= 17) {
                        i = View.generateViewId();
                    } else {
                        i = view2.hashCode();
                    }
                    view2.setId(i);
                }
                ((Chip) view2).setOnCheckedChangeListenerInternal(ChipGroup.this.i);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f10756b;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal((CompoundButton.OnCheckedChangeListener) null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f10756b;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: private */
    public void k(int i2, boolean z) {
        View findViewById = findViewById(i2);
        if (findViewById instanceof Chip) {
            this.l = true;
            ((Chip) findViewById).setChecked(z);
            this.l = false;
        }
    }

    /* access modifiers changed from: private */
    public void setCheckedId(int i2) {
        this.k = i2;
        d dVar = this.h;
        if (dVar != null && this.g) {
            dVar.a(this, i2);
        }
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i3 = this.k;
                if (i3 != -1 && this.g) {
                    k(i3, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i2, layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof c);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        if (this.g) {
            return this.k;
        }
        return -1;
    }

    public int getChipSpacingHorizontal() {
        return this.f10753e;
    }

    public int getChipSpacingVertical() {
        return this.f10754f;
    }

    public void j() {
        this.l = true;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof Chip) {
                ((Chip) childAt).setChecked(false);
            }
        }
        this.l = false;
        setCheckedId(-1);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        int i2 = this.k;
        if (i2 != -1) {
            k(i2, true);
            setCheckedId(this.k);
        }
    }

    public void setChipSpacing(int i2) {
        setChipSpacingHorizontal(i2);
        setChipSpacingVertical(i2);
    }

    public void setChipSpacingHorizontal(int i2) {
        if (this.f10753e != i2) {
            this.f10753e = i2;
            setItemSpacing(i2);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i2) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i2));
    }

    public void setChipSpacingResource(int i2) {
        setChipSpacing(getResources().getDimensionPixelOffset(i2));
    }

    public void setChipSpacingVertical(int i2) {
        if (this.f10754f != i2) {
            this.f10754f = i2;
            setLineSpacing(i2);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i2) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i2));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i2) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(d dVar) {
        this.h = dVar;
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        ViewGroup.OnHierarchyChangeListener unused = this.j.f10756b = onHierarchyChangeListener;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i2) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i2) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i2) {
        setSingleLine(getResources().getBoolean(i2));
    }

    public void setSingleSelection(boolean z) {
        if (this.g != z) {
            this.g = z;
            j();
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.c.a.d.b.chipGroupStyle);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.i = new b();
        this.j = new e();
        this.k = -1;
        this.l = false;
        TypedArray h2 = k.h(context, attributeSet, b.c.a.d.k.ChipGroup, i2, j.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = h2.getDimensionPixelOffset(b.c.a.d.k.ChipGroup_chipSpacing, 0);
        setChipSpacingHorizontal(h2.getDimensionPixelOffset(b.c.a.d.k.ChipGroup_chipSpacingHorizontal, dimensionPixelOffset));
        setChipSpacingVertical(h2.getDimensionPixelOffset(b.c.a.d.k.ChipGroup_chipSpacingVertical, dimensionPixelOffset));
        setSingleLine(h2.getBoolean(b.c.a.d.k.ChipGroup_singleLine, false));
        setSingleSelection(h2.getBoolean(b.c.a.d.k.ChipGroup_singleSelection, false));
        int resourceId = h2.getResourceId(b.c.a.d.k.ChipGroup_checkedChip, -1);
        if (resourceId != -1) {
            this.k = resourceId;
        }
        h2.recycle();
        super.setOnHierarchyChangeListener(this.j);
    }

    public void setSingleSelection(int i2) {
        setSingleSelection(getResources().getBoolean(i2));
    }
}
