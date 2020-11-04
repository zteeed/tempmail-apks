package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.widget.LinearLayoutCompat;

public class ActionMenuView extends LinearLayoutCompat implements h.b, p {
    private int A;
    e B;
    private h q;
    private Context r;
    private int s;
    private boolean t;
    private ActionMenuPresenter u;
    private o.a v;
    h.a w;
    private boolean x;
    private int y;
    private int z;

    public interface a {
        boolean a();

        boolean b();
    }

    private static class b implements o.a {
        b() {
        }

        public void a(h hVar, boolean z) {
        }

        public boolean b(h hVar) {
            return false;
        }
    }

    public static class c extends LinearLayoutCompat.a {
        @ViewDebug.ExportedProperty

        /* renamed from: c  reason: collision with root package name */
        public boolean f935c;
        @ViewDebug.ExportedProperty

        /* renamed from: d  reason: collision with root package name */
        public int f936d;
        @ViewDebug.ExportedProperty

        /* renamed from: e  reason: collision with root package name */
        public int f937e;
        @ViewDebug.ExportedProperty

        /* renamed from: f  reason: collision with root package name */
        public boolean f938f;
        @ViewDebug.ExportedProperty
        public boolean g;
        boolean h;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f935c = cVar.f935c;
        }

        public c(int i, int i2) {
            super(i, i2);
            this.f935c = false;
        }
    }

    private class d implements h.a {
        d() {
        }

        public boolean a(h hVar, MenuItem menuItem) {
            e eVar = ActionMenuView.this.B;
            return eVar != null && eVar.onMenuItemClick(menuItem);
        }

        public void b(h hVar) {
            h.a aVar = ActionMenuView.this.w;
            if (aVar != null) {
                aVar.b(hVar);
            }
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    static int L(View view, int i, int i2, int i3, int i4) {
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z2 = true;
        boolean z3 = actionMenuItemView != null && actionMenuItemView.f();
        int i5 = 2;
        if (i2 <= 0 || (z3 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z3 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (cVar.f935c || !z3) {
            z2 = false;
        }
        cVar.f938f = z2;
        cVar.f936d = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    private void M(int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        boolean z3;
        boolean z4;
        int i6;
        boolean z5;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int i7 = size - paddingLeft;
        int i8 = this.z;
        int i9 = i7 / i8;
        int i10 = i7 % i8;
        if (i9 == 0) {
            setMeasuredDimension(i7, 0);
            return;
        }
        int i11 = i8 + (i10 / i9);
        int childCount = getChildCount();
        int i12 = 0;
        int i13 = 0;
        boolean z6 = false;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        long j = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            int i17 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z7 = childAt instanceof ActionMenuItemView;
                int i18 = i14 + 1;
                if (z7) {
                    int i19 = this.A;
                    i6 = i18;
                    z5 = false;
                    childAt.setPadding(i19, 0, i19, 0);
                } else {
                    i6 = i18;
                    z5 = false;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.h = z5;
                cVar.f937e = z5 ? 1 : 0;
                cVar.f936d = z5;
                cVar.f938f = z5;
                cVar.leftMargin = z5;
                cVar.rightMargin = z5;
                cVar.g = z7 && ((ActionMenuItemView) childAt).f();
                int L = L(childAt, i11, cVar.f935c ? 1 : i9, childMeasureSpec, paddingTop);
                i15 = Math.max(i15, L);
                if (cVar.f938f) {
                    i16++;
                }
                if (cVar.f935c) {
                    z6 = true;
                }
                i9 -= L;
                i12 = Math.max(i12, childAt.getMeasuredHeight());
                if (L == 1) {
                    j |= (long) (1 << i13);
                    i12 = i12;
                } else {
                    int i20 = i12;
                }
                i14 = i6;
            }
            i13++;
            size2 = i17;
        }
        int i21 = size2;
        boolean z8 = z6 && i14 == 2;
        boolean z9 = false;
        while (true) {
            if (i16 <= 0 || i9 <= 0) {
                i5 = mode;
                i3 = i7;
                z2 = z9;
                i4 = i12;
            } else {
                int i22 = 0;
                int i23 = 0;
                int i24 = Integer.MAX_VALUE;
                long j2 = 0;
                while (i23 < childCount) {
                    boolean z10 = z9;
                    c cVar2 = (c) getChildAt(i23).getLayoutParams();
                    int i25 = i12;
                    if (cVar2.f938f) {
                        int i26 = cVar2.f936d;
                        if (i26 < i24) {
                            j2 = 1 << i23;
                            i24 = i26;
                            i22 = 1;
                        } else if (i26 == i24) {
                            i22++;
                            j2 |= 1 << i23;
                        }
                    }
                    i23++;
                    i12 = i25;
                    z9 = z10;
                }
                z2 = z9;
                i4 = i12;
                j |= j2;
                if (i22 > i9) {
                    i5 = mode;
                    i3 = i7;
                    break;
                }
                int i27 = i24 + 1;
                int i28 = 0;
                while (i28 < childCount) {
                    View childAt2 = getChildAt(i28);
                    c cVar3 = (c) childAt2.getLayoutParams();
                    int i29 = i7;
                    int i30 = mode;
                    long j3 = (long) (1 << i28);
                    if ((j2 & j3) == 0) {
                        if (cVar3.f936d == i27) {
                            j |= j3;
                        }
                        z4 = z8;
                    } else {
                        if (!z8 || !cVar3.g || i9 != 1) {
                            z4 = z8;
                        } else {
                            int i31 = this.A;
                            z4 = z8;
                            childAt2.setPadding(i31 + i11, 0, i31, 0);
                        }
                        cVar3.f936d++;
                        cVar3.h = true;
                        i9--;
                    }
                    i28++;
                    mode = i30;
                    i7 = i29;
                    z8 = z4;
                }
                i12 = i4;
                z9 = true;
            }
        }
        boolean z11 = !z6 && i14 == 1;
        if (i9 <= 0 || j == 0 || (i9 >= i14 - 1 && !z11 && i15 <= 1)) {
            z3 = z2;
        } else {
            float bitCount = (float) Long.bitCount(j);
            if (!z11) {
                if ((j & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).g) {
                    bitCount -= 0.5f;
                }
                int i32 = childCount - 1;
                if ((j & ((long) (1 << i32))) != 0 && !((c) getChildAt(i32).getLayoutParams()).g) {
                    bitCount -= 0.5f;
                }
            }
            int i33 = bitCount > 0.0f ? (int) (((float) (i9 * i11)) / bitCount) : 0;
            z3 = z2;
            for (int i34 = 0; i34 < childCount; i34++) {
                if ((j & ((long) (1 << i34))) != 0) {
                    View childAt3 = getChildAt(i34);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f937e = i33;
                        cVar4.h = true;
                        if (i34 == 0 && !cVar4.g) {
                            cVar4.leftMargin = (-i33) / 2;
                        }
                    } else if (cVar4.f935c) {
                        cVar4.f937e = i33;
                        cVar4.h = true;
                        cVar4.rightMargin = (-i33) / 2;
                    } else {
                        if (i34 != 0) {
                            cVar4.leftMargin = i33 / 2;
                        }
                        if (i34 != childCount - 1) {
                            cVar4.rightMargin = i33 / 2;
                        }
                    }
                    z3 = true;
                }
            }
        }
        if (z3) {
            for (int i35 = 0; i35 < childCount; i35++) {
                View childAt4 = getChildAt(i35);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.h) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f936d * i11) + cVar5.f937e, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i3, i5 != 1073741824 ? i4 : i21);
    }

    public void B() {
        ActionMenuPresenter actionMenuPresenter = this.u;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.B();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public c m() {
        c cVar = new c(-2, -2);
        cVar.f1009b = 16;
        return cVar;
    }

    /* renamed from: D */
    public c n(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public c o(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return m();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (cVar.f1009b <= 0) {
            cVar.f1009b = 16;
        }
        return cVar;
    }

    public c F() {
        c C = m();
        C.f935c = true;
        return C;
    }

    /* access modifiers changed from: protected */
    public boolean G(int i) {
        boolean z2 = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof a)) {
            z2 = false | ((a) childAt).a();
        }
        return (i <= 0 || !(childAt2 instanceof a)) ? z2 : z2 | ((a) childAt2).b();
    }

    public boolean H() {
        ActionMenuPresenter actionMenuPresenter = this.u;
        return actionMenuPresenter != null && actionMenuPresenter.E();
    }

    public boolean I() {
        ActionMenuPresenter actionMenuPresenter = this.u;
        return actionMenuPresenter != null && actionMenuPresenter.G();
    }

    public boolean J() {
        ActionMenuPresenter actionMenuPresenter = this.u;
        return actionMenuPresenter != null && actionMenuPresenter.H();
    }

    public boolean K() {
        return this.t;
    }

    public h N() {
        return this.q;
    }

    public boolean O() {
        ActionMenuPresenter actionMenuPresenter = this.u;
        return actionMenuPresenter != null && actionMenuPresenter.N();
    }

    public boolean a(j jVar) {
        return this.q.N(jVar, 0);
    }

    public void b(h hVar) {
        this.q = hVar;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof c);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.q == null) {
            Context context = getContext();
            h hVar = new h(context);
            this.q = hVar;
            hVar.V(new d());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.u = actionMenuPresenter;
            actionMenuPresenter.M(true);
            ActionMenuPresenter actionMenuPresenter2 = this.u;
            o.a aVar = this.v;
            if (aVar == null) {
                aVar = new b();
            }
            actionMenuPresenter2.m(aVar);
            this.q.c(this.u, this.r);
            this.u.K(this);
        }
        return this.q;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.u.D();
    }

    public int getPopupTheme() {
        return this.s;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.u;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.i(false);
            if (this.u.H()) {
                this.u.E();
                this.u.N();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        B();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (!this.x) {
            super.onLayout(z2, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean b2 = h0.b(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f935c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (G(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b2) {
                        i5 = getPaddingLeft() + cVar.leftMargin;
                        i6 = i5 + measuredWidth;
                    } else {
                        i6 = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i5 = i6 - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i5, i12, i6, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    boolean G = G(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (b2) {
            int width = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f935c) {
                    int i17 = width - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width = i17 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f935c) {
                int i20 = paddingLeft + cVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = i20 + measuredWidth4 + cVar3.rightMargin + max;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        h hVar;
        boolean z2 = this.x;
        boolean z3 = View.MeasureSpec.getMode(i) == 1073741824;
        this.x = z3;
        if (z2 != z3) {
            this.y = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.x || (hVar = this.q) == null || size == this.y)) {
            this.y = size;
            hVar.M(true);
        }
        int childCount = getChildCount();
        if (!this.x || childCount <= 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                c cVar = (c) getChildAt(i3).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        M(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.u.J(z2);
    }

    public void setMenuCallbacks(o.a aVar, h.a aVar2) {
        this.v = aVar;
        this.w = aVar2;
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.B = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.u.L(drawable);
    }

    public void setOverflowReserved(boolean z2) {
        this.t = z2;
    }

    public void setPopupTheme(int i) {
        if (this.s != i) {
            this.s = i;
            if (i == 0) {
                this.r = getContext();
            } else {
                this.r = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.u = actionMenuPresenter;
        actionMenuPresenter.K(this);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.z = (int) (56.0f * f2);
        this.A = (int) (f2 * 4.0f);
        this.r = context;
        this.s = 0;
    }
}
