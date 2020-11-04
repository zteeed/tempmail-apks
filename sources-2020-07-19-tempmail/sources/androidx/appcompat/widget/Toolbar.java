package androidx.appcompat.widget;

import a.a.n.g;
import a.h.k.t;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.view.menu.u;
import androidx.appcompat.widget.ActionMenuView;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.List;

public class Toolbar extends ViewGroup {
    private int A;
    private int B;
    private boolean C;
    private boolean D;
    private final ArrayList<View> E;
    private final ArrayList<View> F;
    private final int[] G;
    f H;
    private final ActionMenuView.e I;
    private c0 J;
    private ActionMenuPresenter K;
    private d L;
    private o.a M;
    private h.a N;
    private boolean O;
    private final Runnable P;

    /* renamed from: b  reason: collision with root package name */
    private ActionMenuView f1039b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f1040c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f1041d;

    /* renamed from: e  reason: collision with root package name */
    private ImageButton f1042e;

    /* renamed from: f  reason: collision with root package name */
    private ImageView f1043f;
    private Drawable g;
    private CharSequence h;
    ImageButton i;
    View j;
    private Context k;
    private int l;
    private int m;
    private int n;
    int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private u u;
    private int v;
    private int w;
    private int x;
    private CharSequence y;
    private CharSequence z;

    class a implements ActionMenuView.e {
        a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            f fVar = Toolbar.this.H;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            Toolbar.this.I();
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    private class d implements o {

        /* renamed from: b  reason: collision with root package name */
        h f1049b;

        /* renamed from: c  reason: collision with root package name */
        j f1050c;

        d() {
        }

        public void a(h hVar, boolean z) {
        }

        public int g() {
            return 0;
        }

        public void h(boolean z) {
            if (this.f1050c != null) {
                h hVar = this.f1049b;
                boolean z2 = false;
                if (hVar != null) {
                    int size = hVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f1049b.getItem(i) == this.f1050c) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    j(this.f1049b, this.f1050c);
                }
            }
        }

        public boolean i() {
            return false;
        }

        public boolean j(h hVar, j jVar) {
            View view = Toolbar.this.j;
            if (view instanceof a.a.n.c) {
                ((a.a.n.c) view).f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.j);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.i);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.j = null;
            toolbar3.a();
            this.f1050c = null;
            Toolbar.this.requestLayout();
            jVar.r(false);
            return true;
        }

        public boolean k(h hVar, j jVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.i.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.i);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.i);
            }
            Toolbar.this.j = jVar.getActionView();
            this.f1050c = jVar;
            ViewParent parent2 = Toolbar.this.j.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.j);
                }
                e m = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                m.f699a = 8388611 | (toolbar4.o & 112);
                m.f1052b = 2;
                toolbar4.j.setLayoutParams(m);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.j);
            }
            Toolbar.this.F();
            Toolbar.this.requestLayout();
            jVar.r(true);
            View view = Toolbar.this.j;
            if (view instanceof a.a.n.c) {
                ((a.a.n.c) view).c();
            }
            return true;
        }

        public void l(o.a aVar) {
        }

        public void m(Context context, h hVar) {
            j jVar;
            h hVar2 = this.f1049b;
            if (!(hVar2 == null || (jVar = this.f1050c) == null)) {
                hVar2.f(jVar);
            }
            this.f1049b = hVar;
        }

        public void n(Parcelable parcelable) {
        }

        public boolean o(u uVar) {
            return false;
        }

        public Parcelable p() {
            return null;
        }
    }

    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context) {
        this(context, (AttributeSet) null);
    }

    private int A(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = eVar.leftMargin - iArr[0];
        int max = i2 + Math.max(0, i4);
        iArr[0] = Math.max(0, -i4);
        int q2 = q(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q2, max + measuredWidth, view.getMeasuredHeight() + q2);
        return max + measuredWidth + eVar.rightMargin;
    }

    private int B(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = eVar.rightMargin - iArr[1];
        int max = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int q2 = q(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q2, max, view.getMeasuredHeight() + q2);
        return max - (measuredWidth + eVar.leftMargin);
    }

    private int C(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i7);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + max + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void D(View view, int i2, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void E() {
        removeCallbacks(this.P);
        post(this.P);
    }

    private boolean G() {
        if (!this.O) {
            return false;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (H(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean H(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List<View> list, int i2) {
        boolean z2 = t.t(this) == 1;
        int childCount = getChildCount();
        int b2 = a.h.k.d.b(i2, t.t(this));
        list.clear();
        if (z2) {
            for (int i3 = childCount - 1; i3 >= 0; i3--) {
                View childAt = getChildAt(i3);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f1052b == 0 && H(childAt) && p(eVar.f699a) == b2) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f1052b == 0 && H(childAt2) && p(eVar2.f699a) == b2) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z2) {
        e eVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            eVar = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            eVar = generateLayoutParams(layoutParams);
        } else {
            eVar = (e) layoutParams;
        }
        eVar.f1052b = 1;
        if (!z2 || this.j == null) {
            addView(view, eVar);
            return;
        }
        view.setLayoutParams(eVar);
        this.F.add(view);
    }

    private MenuInflater getMenuInflater() {
        return new g(getContext());
    }

    private void h() {
        if (this.u == null) {
            this.u = new u();
        }
    }

    private void i() {
        if (this.f1043f == null) {
            this.f1043f = new AppCompatImageView(getContext());
        }
    }

    private void j() {
        k();
        if (this.f1039b.N() == null) {
            h hVar = (h) this.f1039b.getMenu();
            if (this.L == null) {
                this.L = new d();
            }
            this.f1039b.setExpandedActionViewsExclusive(true);
            hVar.c(this.L, this.k);
        }
    }

    private void k() {
        if (this.f1039b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1039b = actionMenuView;
            actionMenuView.setPopupTheme(this.l);
            this.f1039b.setOnMenuItemClickListener(this.I);
            this.f1039b.setMenuCallbacks(this.M, this.N);
            e m2 = generateDefaultLayoutParams();
            m2.f699a = 8388613 | (this.o & 112);
            this.f1039b.setLayoutParams(m2);
            c(this.f1039b, false);
        }
    }

    private void l() {
        if (this.f1042e == null) {
            this.f1042e = new AppCompatImageButton(getContext(), (AttributeSet) null, a.a.a.toolbarNavigationButtonStyle);
            e m2 = generateDefaultLayoutParams();
            m2.f699a = 8388611 | (this.o & 112);
            this.f1042e.setLayoutParams(m2);
        }
    }

    private int p(int i2) {
        int t2 = t.t(this);
        int b2 = a.h.k.d.b(i2, t2) & 7;
        if (b2 == 1 || b2 == 3 || b2 == 5) {
            return b2;
        }
        return t2 == 1 ? 5 : 3;
    }

    private int q(View view, int i2) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int r2 = r(eVar.f699a);
        if (r2 == 48) {
            return getPaddingTop() - i3;
        }
        if (r2 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - eVar.bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = eVar.topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = eVar.bottomMargin;
            if (i6 < i7) {
                i4 = Math.max(0, i4 - (i7 - i6));
            }
        }
        return paddingTop + i4;
    }

    private int r(int i2) {
        int i3 = i2 & 112;
        return (i3 == 16 || i3 == 48 || i3 == 80) ? i3 : this.x & 112;
    }

    private int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return a.h.k.g.b(marginLayoutParams) + a.h.k.g.a(marginLayoutParams);
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int u(List<View> list, int[] iArr) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int size = list.size();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            View view = list.get(i4);
            e eVar = (e) view.getLayoutParams();
            int i6 = eVar.leftMargin - i2;
            int i7 = eVar.rightMargin - i3;
            int max = Math.max(0, i6);
            int max2 = Math.max(0, i7);
            int max3 = Math.max(0, -i6);
            int max4 = Math.max(0, -i7);
            i5 += max + view.getMeasuredWidth() + max2;
            i4++;
            i3 = max4;
            i2 = max3;
        }
        return i5;
    }

    private boolean x(View view) {
        return view.getParent() == this || this.F.contains(view);
    }

    /* access modifiers changed from: package-private */
    public void F() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((e) childAt.getLayoutParams()).f1052b == 2 || childAt == this.f1039b)) {
                removeViewAt(childCount);
                this.F.add(childAt);
            }
        }
    }

    public boolean I() {
        ActionMenuView actionMenuView = this.f1039b;
        return actionMenuView != null && actionMenuView.O();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        for (int size = this.F.size() - 1; size >= 0; size--) {
            addView(this.F.get(size));
        }
        this.F.clear();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f1039b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d() {
        /*
            r1 = this;
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0012
            androidx.appcompat.widget.ActionMenuView r0 = r1.f1039b
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.K()
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.d():boolean");
    }

    public void e() {
        d dVar = this.L;
        j jVar = dVar == null ? null : dVar.f1050c;
        if (jVar != null) {
            jVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f1039b;
        if (actionMenuView != null) {
            actionMenuView.B();
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        if (this.i == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), (AttributeSet) null, a.a.a.toolbarNavigationButtonStyle);
            this.i = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.g);
            this.i.setContentDescription(this.h);
            e m2 = generateDefaultLayoutParams();
            m2.f699a = 8388611 | (this.o & 112);
            m2.f1052b = 2;
            this.i.setLayoutParams(m2);
            this.i.setOnClickListener(new c());
        }
    }

    public int getContentInsetEnd() {
        u uVar = this.u;
        if (uVar != null) {
            return uVar.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.w;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        u uVar = this.u;
        if (uVar != null) {
            return uVar.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        u uVar = this.u;
        if (uVar != null) {
            return uVar.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        u uVar = this.u;
        if (uVar != null) {
            return uVar.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.v;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.N();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f1039b
            r1 = 0
            if (r0 == 0) goto L_0x0013
            androidx.appcompat.view.menu.h r0 = r0.N()
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 == 0) goto L_0x0025
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.w
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0029
        L_0x0025:
            int r0 = r3.getContentInsetEnd()
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        if (t.t(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (t.t(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.v, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1043f;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1043f;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f1039b.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1042e;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1042e;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.K;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f1039b.getOverflowIcon();
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.k;
    }

    public int getPopupTheme() {
        return this.l;
    }

    public CharSequence getSubtitle() {
        return this.z;
    }

    public CharSequence getTitle() {
        return this.y;
    }

    public int getTitleMarginBottom() {
        return this.t;
    }

    public int getTitleMarginEnd() {
        return this.r;
    }

    public int getTitleMarginStart() {
        return this.q;
    }

    public int getTitleMarginTop() {
        return this.s;
    }

    public n getWrapper() {
        if (this.J == null) {
            this.J = new c0(this, true);
        }
        return this.J;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    /* renamed from: n */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            return new e((e) layoutParams);
        }
        if (layoutParams instanceof a.C0031a) {
            return new e((a.C0031a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new e(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.P);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.D = false;
        }
        if (!this.D) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.D = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02a3 A[LOOP:0: B:101:0x02a1->B:102:0x02a3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02c5 A[LOOP:1: B:104:0x02c3->B:105:0x02c5, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02fe A[LOOP:2: B:112:0x02fc->B:113:0x02fe, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0229  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            int r1 = a.h.k.t.t(r19)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.G
            r11[r2] = r3
            r11[r3] = r3
            int r12 = a.h.k.t.u(r19)
            if (r12 < 0) goto L_0x003a
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = 0
        L_0x003b:
            android.widget.ImageButton r13 = r0.f1042e
            boolean r13 = r0.H(r13)
            if (r13 == 0) goto L_0x0055
            if (r1 == 0) goto L_0x004e
            android.widget.ImageButton r13 = r0.f1042e
            int r13 = r0.B(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0057
        L_0x004e:
            android.widget.ImageButton r13 = r0.f1042e
            int r13 = r0.A(r13, r6, r11, r12)
            goto L_0x0056
        L_0x0055:
            r13 = r6
        L_0x0056:
            r14 = r10
        L_0x0057:
            android.widget.ImageButton r15 = r0.i
            boolean r15 = r0.H(r15)
            if (r15 == 0) goto L_0x006e
            if (r1 == 0) goto L_0x0068
            android.widget.ImageButton r15 = r0.i
            int r14 = r0.B(r15, r14, r11, r12)
            goto L_0x006e
        L_0x0068:
            android.widget.ImageButton r15 = r0.i
            int r13 = r0.A(r15, r13, r11, r12)
        L_0x006e:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1039b
            boolean r15 = r0.H(r15)
            if (r15 == 0) goto L_0x0085
            if (r1 == 0) goto L_0x007f
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1039b
            int r13 = r0.A(r15, r13, r11, r12)
            goto L_0x0085
        L_0x007f:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1039b
            int r14 = r0.B(r15, r14, r11, r12)
        L_0x0085:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.j
            boolean r13 = r0.H(r13)
            if (r13 == 0) goto L_0x00c2
            if (r1 == 0) goto L_0x00bc
            android.view.View r13 = r0.j
            int r10 = r0.B(r13, r10, r11, r12)
            goto L_0x00c2
        L_0x00bc:
            android.view.View r13 = r0.j
            int r2 = r0.A(r13, r2, r11, r12)
        L_0x00c2:
            android.widget.ImageView r13 = r0.f1043f
            boolean r13 = r0.H(r13)
            if (r13 == 0) goto L_0x00d9
            if (r1 == 0) goto L_0x00d3
            android.widget.ImageView r13 = r0.f1043f
            int r10 = r0.B(r13, r10, r11, r12)
            goto L_0x00d9
        L_0x00d3:
            android.widget.ImageView r13 = r0.f1043f
            int r2 = r0.A(r13, r2, r11, r12)
        L_0x00d9:
            android.widget.TextView r13 = r0.f1040c
            boolean r13 = r0.H(r13)
            android.widget.TextView r14 = r0.f1041d
            boolean r14 = r0.H(r14)
            if (r13 == 0) goto L_0x0100
            android.widget.TextView r15 = r0.f1040c
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r15 = (androidx.appcompat.widget.Toolbar.e) r15
            int r3 = r15.topMargin
            r23 = r7
            android.widget.TextView r7 = r0.f1040c
            int r7 = r7.getMeasuredHeight()
            int r3 = r3 + r7
            int r7 = r15.bottomMargin
            int r3 = r3 + r7
            r7 = 0
            int r3 = r3 + r7
            goto L_0x0103
        L_0x0100:
            r23 = r7
            r3 = 0
        L_0x0103:
            if (r14 == 0) goto L_0x011d
            android.widget.TextView r7 = r0.f1041d
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r7 = (androidx.appcompat.widget.Toolbar.e) r7
            int r15 = r7.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f1041d
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r7.bottomMargin
            int r15 = r15 + r4
            int r3 = r3 + r15
            goto L_0x011f
        L_0x011d:
            r16 = r4
        L_0x011f:
            if (r13 != 0) goto L_0x012b
            if (r14 == 0) goto L_0x0124
            goto L_0x012b
        L_0x0124:
            r18 = r6
            r22 = r12
        L_0x0128:
            r1 = 0
            goto L_0x0294
        L_0x012b:
            if (r13 == 0) goto L_0x0130
            android.widget.TextView r4 = r0.f1040c
            goto L_0x0132
        L_0x0130:
            android.widget.TextView r4 = r0.f1041d
        L_0x0132:
            if (r14 == 0) goto L_0x0137
            android.widget.TextView r7 = r0.f1041d
            goto L_0x0139
        L_0x0137:
            android.widget.TextView r7 = r0.f1040c
        L_0x0139:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r4 = (androidx.appcompat.widget.Toolbar.e) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r7 = (androidx.appcompat.widget.Toolbar.e) r7
            if (r13 == 0) goto L_0x014f
            android.widget.TextView r15 = r0.f1040c
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x0159
        L_0x014f:
            if (r14 == 0) goto L_0x015c
            android.widget.TextView r15 = r0.f1041d
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x015c
        L_0x0159:
            r17 = 1
            goto L_0x015e
        L_0x015c:
            r17 = 0
        L_0x015e:
            int r15 = r0.x
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x01a6
            r6 = 80
            if (r15 == r6) goto L_0x0198
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r3
            int r6 = r6 / 2
            int r15 = r4.topMargin
            r22 = r12
            int r12 = r0.s
            r24 = r2
            int r2 = r15 + r12
            if (r6 >= r2) goto L_0x0181
            int r6 = r15 + r12
            goto L_0x0196
        L_0x0181:
            int r5 = r5 - r9
            int r5 = r5 - r3
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.t
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x0196
            int r2 = r7.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x0196:
            int r8 = r8 + r6
            goto L_0x01b5
        L_0x0198:
            r24 = r2
            r22 = r12
            int r5 = r5 - r9
            int r2 = r7.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.t
            int r5 = r5 - r2
            int r8 = r5 - r3
            goto L_0x01b5
        L_0x01a6:
            r24 = r2
            r22 = r12
            int r2 = r19.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.s
            int r8 = r2 + r3
        L_0x01b5:
            if (r1 == 0) goto L_0x0229
            if (r17 == 0) goto L_0x01bc
            int r1 = r0.q
            goto L_0x01bd
        L_0x01bc:
            r1 = 0
        L_0x01bd:
            r2 = 1
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x01f4
            android.widget.TextView r1 = r0.f1040c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            android.widget.TextView r2 = r0.f1040c
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f1040c
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f1040c
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.r
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01f5
        L_0x01f4:
            r2 = r10
        L_0x01f5:
            if (r14 == 0) goto L_0x021d
            android.widget.TextView r1 = r0.f1041d
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            int r3 = r1.topMargin
            int r8 = r8 + r3
            android.widget.TextView r3 = r0.f1041d
            int r3 = r3.getMeasuredWidth()
            int r3 = r10 - r3
            android.widget.TextView r4 = r0.f1041d
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f1041d
            r5.layout(r3, r8, r10, r4)
            int r3 = r0.r
            int r3 = r10 - r3
            int r1 = r1.bottomMargin
            goto L_0x021e
        L_0x021d:
            r3 = r10
        L_0x021e:
            if (r17 == 0) goto L_0x0225
            int r1 = java.lang.Math.min(r2, r3)
            r10 = r1
        L_0x0225:
            r2 = r24
            goto L_0x0128
        L_0x0229:
            if (r17 == 0) goto L_0x022f
            int r7 = r0.q
            r1 = 0
            goto L_0x0231
        L_0x022f:
            r1 = 0
            r7 = 0
        L_0x0231:
            r2 = r11[r1]
            int r7 = r7 - r2
            int r2 = java.lang.Math.max(r1, r7)
            int r2 = r24 + r2
            int r3 = -r7
            int r3 = java.lang.Math.max(r1, r3)
            r11[r1] = r3
            if (r13 == 0) goto L_0x0266
            android.widget.TextView r3 = r0.f1040c
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.e) r3
            android.widget.TextView r4 = r0.f1040c
            int r4 = r4.getMeasuredWidth()
            int r4 = r4 + r2
            android.widget.TextView r5 = r0.f1040c
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f1040c
            r6.layout(r2, r8, r4, r5)
            int r6 = r0.r
            int r4 = r4 + r6
            int r3 = r3.bottomMargin
            int r8 = r5 + r3
            goto L_0x0267
        L_0x0266:
            r4 = r2
        L_0x0267:
            if (r14 == 0) goto L_0x028d
            android.widget.TextView r3 = r0.f1041d
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.e) r3
            int r5 = r3.topMargin
            int r8 = r8 + r5
            android.widget.TextView r5 = r0.f1041d
            int r5 = r5.getMeasuredWidth()
            int r5 = r5 + r2
            android.widget.TextView r6 = r0.f1041d
            int r6 = r6.getMeasuredHeight()
            int r6 = r6 + r8
            android.widget.TextView r7 = r0.f1041d
            r7.layout(r2, r8, r5, r6)
            int r6 = r0.r
            int r5 = r5 + r6
            int r3 = r3.bottomMargin
            goto L_0x028e
        L_0x028d:
            r5 = r2
        L_0x028e:
            if (r17 == 0) goto L_0x0294
            int r2 = java.lang.Math.max(r4, r5)
        L_0x0294:
            java.util.ArrayList<android.view.View> r3 = r0.E
            r4 = 3
            r0.b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.E
            int r3 = r3.size()
            r7 = 0
        L_0x02a1:
            if (r7 >= r3) goto L_0x02b4
            java.util.ArrayList<android.view.View> r4 = r0.E
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            r12 = r22
            int r2 = r0.A(r4, r2, r11, r12)
            int r7 = r7 + 1
            goto L_0x02a1
        L_0x02b4:
            r12 = r22
            java.util.ArrayList<android.view.View> r3 = r0.E
            r4 = 5
            r0.b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.E
            int r3 = r3.size()
            r7 = 0
        L_0x02c3:
            if (r7 >= r3) goto L_0x02d4
            java.util.ArrayList<android.view.View> r4 = r0.E
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.B(r4, r10, r11, r12)
            int r7 = r7 + 1
            goto L_0x02c3
        L_0x02d4:
            java.util.ArrayList<android.view.View> r3 = r0.E
            r4 = 1
            r0.b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.E
            int r3 = r0.u(r3, r11)
            int r4 = r16 - r18
            int r4 = r4 - r23
            int r4 = r4 / 2
            int r6 = r18 + r4
            int r4 = r3 / 2
            int r6 = r6 - r4
            int r3 = r3 + r6
            if (r6 >= r2) goto L_0x02ef
            goto L_0x02f6
        L_0x02ef:
            if (r3 <= r10) goto L_0x02f5
            int r3 = r3 - r10
            int r2 = r6 - r3
            goto L_0x02f6
        L_0x02f5:
            r2 = r6
        L_0x02f6:
            java.util.ArrayList<android.view.View> r3 = r0.E
            int r3 = r3.size()
        L_0x02fc:
            if (r1 >= r3) goto L_0x030d
            java.util.ArrayList<android.view.View> r4 = r0.E
            java.lang.Object r4 = r4.get(r1)
            android.view.View r4 = (android.view.View) r4
            int r2 = r0.A(r4, r2, r11, r12)
            int r1 = r1 + 1
            goto L_0x02fc
        L_0x030d:
            java.util.ArrayList<android.view.View> r1 = r0.E
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        char c2;
        char c3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr = this.G;
        int i11 = 0;
        if (h0.b(this)) {
            c3 = 1;
            c2 = 0;
        } else {
            c3 = 0;
            c2 = 1;
        }
        if (H(this.f1042e)) {
            D(this.f1042e, i2, 0, i3, 0, this.p);
            i6 = this.f1042e.getMeasuredWidth() + s(this.f1042e);
            i5 = Math.max(0, this.f1042e.getMeasuredHeight() + t(this.f1042e));
            i4 = View.combineMeasuredStates(0, this.f1042e.getMeasuredState());
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
        }
        if (H(this.i)) {
            D(this.i, i2, 0, i3, 0, this.p);
            i6 = this.i.getMeasuredWidth() + s(this.i);
            i5 = Math.max(i5, this.i.getMeasuredHeight() + t(this.i));
            i4 = View.combineMeasuredStates(i4, this.i.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i6);
        iArr[c3] = Math.max(0, currentContentInsetStart - i6);
        if (H(this.f1039b)) {
            D(this.f1039b, i2, max, i3, 0, this.p);
            i7 = this.f1039b.getMeasuredWidth() + s(this.f1039b);
            i5 = Math.max(i5, this.f1039b.getMeasuredHeight() + t(this.f1039b));
            i4 = View.combineMeasuredStates(i4, this.f1039b.getMeasuredState());
        } else {
            i7 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i7);
        iArr[c2] = Math.max(0, currentContentInsetEnd - i7);
        if (H(this.j)) {
            max2 += C(this.j, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, this.j.getMeasuredHeight() + t(this.j));
            i4 = View.combineMeasuredStates(i4, this.j.getMeasuredState());
        }
        if (H(this.f1043f)) {
            max2 += C(this.f1043f, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, this.f1043f.getMeasuredHeight() + t(this.f1043f));
            i4 = View.combineMeasuredStates(i4, this.f1043f.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((e) childAt.getLayoutParams()).f1052b == 0 && H(childAt)) {
                max2 += C(childAt, i2, max2, i3, 0, iArr);
                i5 = Math.max(i5, childAt.getMeasuredHeight() + t(childAt));
                i4 = View.combineMeasuredStates(i4, childAt.getMeasuredState());
            }
        }
        int i13 = this.s + this.t;
        int i14 = this.q + this.r;
        if (H(this.f1040c)) {
            C(this.f1040c, i2, max2 + i14, i3, i13, iArr);
            int measuredWidth = this.f1040c.getMeasuredWidth() + s(this.f1040c);
            i8 = this.f1040c.getMeasuredHeight() + t(this.f1040c);
            i10 = View.combineMeasuredStates(i4, this.f1040c.getMeasuredState());
            i9 = measuredWidth;
        } else {
            i10 = i4;
            i9 = 0;
            i8 = 0;
        }
        if (H(this.f1041d)) {
            int i15 = i8 + i13;
            i9 = Math.max(i9, C(this.f1041d, i2, max2 + i14, i3, i15, iArr));
            i8 += this.f1041d.getMeasuredHeight() + t(this.f1041d);
            i10 = View.combineMeasuredStates(i10, this.f1041d.getMeasuredState());
        } else {
            int i16 = i10;
        }
        int max3 = Math.max(i5, i8);
        int paddingLeft = max2 + i9 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i2, -16777216 & i10);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i3, i10 << 16);
        if (!G()) {
            i11 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i11);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        ActionMenuView actionMenuView = this.f1039b;
        h N2 = actionMenuView != null ? actionMenuView.N() : null;
        int i2 = savedState.f1044d;
        if (!(i2 == 0 || this.L == null || N2 == null || (findItem = N2.findItem(i2)) == null)) {
            findItem.expandActionView();
        }
        if (savedState.f1045e) {
            E();
        }
    }

    public void onRtlPropertiesChanged(int i2) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i2);
        }
        h();
        u uVar = this.u;
        boolean z2 = true;
        if (i2 != 1) {
            z2 = false;
        }
        uVar.f(z2);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        j jVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        d dVar = this.L;
        if (!(dVar == null || (jVar = dVar.f1050c) == null)) {
            savedState.f1044d = jVar.getItemId();
        }
        savedState.f1045e = z();
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.C = false;
        }
        if (!this.C) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    public void setCollapsible(boolean z2) {
        this.O = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.w) {
            this.w = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.v) {
            this.v = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetsAbsolute(int i2, int i3) {
        h();
        this.u.e(i2, i3);
    }

    public void setContentInsetsRelative(int i2, int i3) {
        h();
        this.u.g(i2, i3);
    }

    public void setLogo(int i2) {
        setLogo(a.a.k.a.a.d(getContext(), i2));
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setMenu(h hVar, ActionMenuPresenter actionMenuPresenter) {
        if (hVar != null || this.f1039b != null) {
            k();
            h N2 = this.f1039b.N();
            if (N2 != hVar) {
                if (N2 != null) {
                    N2.Q(this.K);
                    N2.Q(this.L);
                }
                if (this.L == null) {
                    this.L = new d();
                }
                actionMenuPresenter.J(true);
                if (hVar != null) {
                    hVar.c(actionMenuPresenter, this.k);
                    hVar.c(this.L, this.k);
                } else {
                    actionMenuPresenter.m(this.k, (h) null);
                    this.L.m(this.k, (h) null);
                    actionMenuPresenter.h(true);
                    this.L.h(true);
                }
                this.f1039b.setPopupTheme(this.l);
                this.f1039b.setPresenter(actionMenuPresenter);
                this.K = actionMenuPresenter;
            }
        }
    }

    public void setMenuCallbacks(o.a aVar, h.a aVar2) {
        this.M = aVar;
        this.N = aVar2;
        ActionMenuView actionMenuView = this.f1039b;
        if (actionMenuView != null) {
            actionMenuView.setMenuCallbacks(aVar, aVar2);
        }
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(a.a.k.a.a.d(getContext(), i2));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f1042e.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.H = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f1039b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.l != i2) {
            this.l = i2;
            if (i2 == 0) {
                this.k = getContext();
            } else {
                this.k = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitleTextAppearance(Context context, int i2) {
        this.n = i2;
        TextView textView = this.f1041d;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public void setSubtitleTextColor(int i2) {
        this.B = i2;
        TextView textView = this.f1041d;
        if (textView != null) {
            textView.setTextColor(i2);
        }
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitleMargin(int i2, int i3, int i4, int i5) {
        this.q = i2;
        this.s = i3;
        this.r = i4;
        this.t = i5;
        requestLayout();
    }

    public void setTitleMarginBottom(int i2) {
        this.t = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.r = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.q = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.s = i2;
        requestLayout();
    }

    public void setTitleTextAppearance(Context context, int i2) {
        this.m = i2;
        TextView textView = this.f1040c;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public void setTitleTextColor(int i2) {
        this.A = i2;
        TextView textView = this.f1040c;
        if (textView != null) {
            textView.setTextColor(i2);
        }
    }

    public boolean v() {
        d dVar = this.L;
        return (dVar == null || dVar.f1050c == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f1039b;
        return actionMenuView != null && actionMenuView.H();
    }

    public boolean y() {
        ActionMenuView actionMenuView = this.f1039b;
        return actionMenuView != null && actionMenuView.I();
    }

    public boolean z() {
        ActionMenuView actionMenuView = this.f1039b;
        return actionMenuView != null && actionMenuView.J();
    }

    public static class e extends a.C0031a {

        /* renamed from: b  reason: collision with root package name */
        int f1052b = 0;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* access modifiers changed from: package-private */
        public void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public e(int i, int i2) {
            super(i, i2);
            this.f699a = 8388627;
        }

        public e(e eVar) {
            super((a.C0031a) eVar);
            this.f1052b = eVar.f1052b;
        }

        public e(a.C0031a aVar) {
            super(aVar);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            a(marginLayoutParams);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.a.a.toolbarStyle);
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!x(this.f1043f)) {
                c(this.f1043f, true);
            }
        } else {
            ImageView imageView = this.f1043f;
            if (imageView != null && x(imageView)) {
                removeView(this.f1043f);
                this.F.remove(this.f1043f);
            }
        }
        ImageView imageView2 = this.f1043f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f1043f;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f1042e;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!x(this.f1042e)) {
                c(this.f1042e, true);
            }
        } else {
            ImageButton imageButton = this.f1042e;
            if (imageButton != null && x(imageButton)) {
                removeView(this.f1042e);
                this.F.remove(this.f1042e);
            }
        }
        ImageButton imageButton2 = this.f1042e;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1041d == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1041d = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1041d.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.n;
                if (i2 != 0) {
                    this.f1041d.setTextAppearance(context, i2);
                }
                int i3 = this.B;
                if (i3 != 0) {
                    this.f1041d.setTextColor(i3);
                }
            }
            if (!x(this.f1041d)) {
                c(this.f1041d, true);
            }
        } else {
            TextView textView = this.f1041d;
            if (textView != null && x(textView)) {
                removeView(this.f1041d);
                this.F.remove(this.f1041d);
            }
        }
        TextView textView2 = this.f1041d;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.z = charSequence;
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1040c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1040c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1040c.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.m;
                if (i2 != 0) {
                    this.f1040c.setTextAppearance(context, i2);
                }
                int i3 = this.A;
                if (i3 != 0) {
                    this.f1040c.setTextColor(i3);
                }
            }
            if (!x(this.f1040c)) {
                c(this.f1040c, true);
            }
        } else {
            TextView textView = this.f1040c;
            if (textView != null && x(textView)) {
                removeView(this.f1040c);
                this.F.remove(this.f1040c);
            }
        }
        TextView textView2 = this.f1040c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.y = charSequence;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        int f1044d;

        /* renamed from: e  reason: collision with root package name */
        boolean f1045e;

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
            this.f1044d = parcel.readInt();
            this.f1045e = parcel.readInt() != 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1044d);
            parcel.writeInt(this.f1045e ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.x = 8388627;
        this.E = new ArrayList<>();
        this.F = new ArrayList<>();
        this.G = new int[2];
        this.I = new a();
        this.P = new b();
        b0 u2 = b0.u(getContext(), attributeSet, a.a.j.Toolbar, i2, 0);
        this.m = u2.n(a.a.j.Toolbar_titleTextAppearance, 0);
        this.n = u2.n(a.a.j.Toolbar_subtitleTextAppearance, 0);
        this.x = u2.l(a.a.j.Toolbar_android_gravity, this.x);
        this.o = u2.l(a.a.j.Toolbar_buttonGravity, 48);
        int e2 = u2.e(a.a.j.Toolbar_titleMargin, 0);
        e2 = u2.r(a.a.j.Toolbar_titleMargins) ? u2.e(a.a.j.Toolbar_titleMargins, e2) : e2;
        this.t = e2;
        this.s = e2;
        this.r = e2;
        this.q = e2;
        int e3 = u2.e(a.a.j.Toolbar_titleMarginStart, -1);
        if (e3 >= 0) {
            this.q = e3;
        }
        int e4 = u2.e(a.a.j.Toolbar_titleMarginEnd, -1);
        if (e4 >= 0) {
            this.r = e4;
        }
        int e5 = u2.e(a.a.j.Toolbar_titleMarginTop, -1);
        if (e5 >= 0) {
            this.s = e5;
        }
        int e6 = u2.e(a.a.j.Toolbar_titleMarginBottom, -1);
        if (e6 >= 0) {
            this.t = e6;
        }
        this.p = u2.f(a.a.j.Toolbar_maxButtonHeight, -1);
        int e7 = u2.e(a.a.j.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int e8 = u2.e(a.a.j.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int f2 = u2.f(a.a.j.Toolbar_contentInsetLeft, 0);
        int f3 = u2.f(a.a.j.Toolbar_contentInsetRight, 0);
        h();
        this.u.e(f2, f3);
        if (!(e7 == Integer.MIN_VALUE && e8 == Integer.MIN_VALUE)) {
            this.u.g(e7, e8);
        }
        this.v = u2.e(a.a.j.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.w = u2.e(a.a.j.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.g = u2.g(a.a.j.Toolbar_collapseIcon);
        this.h = u2.p(a.a.j.Toolbar_collapseContentDescription);
        CharSequence p2 = u2.p(a.a.j.Toolbar_title);
        if (!TextUtils.isEmpty(p2)) {
            setTitle(p2);
        }
        CharSequence p3 = u2.p(a.a.j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(p3)) {
            setSubtitle(p3);
        }
        this.k = getContext();
        setPopupTheme(u2.n(a.a.j.Toolbar_popupTheme, 0));
        Drawable g2 = u2.g(a.a.j.Toolbar_navigationIcon);
        if (g2 != null) {
            setNavigationIcon(g2);
        }
        CharSequence p4 = u2.p(a.a.j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(p4)) {
            setNavigationContentDescription(p4);
        }
        Drawable g3 = u2.g(a.a.j.Toolbar_logo);
        if (g3 != null) {
            setLogo(g3);
        }
        CharSequence p5 = u2.p(a.a.j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(p5)) {
            setLogoDescription(p5);
        }
        if (u2.r(a.a.j.Toolbar_titleTextColor)) {
            setTitleTextColor(u2.b(a.a.j.Toolbar_titleTextColor, -1));
        }
        if (u2.r(a.a.j.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(u2.b(a.a.j.Toolbar_subtitleTextColor, -1));
        }
        u2.v();
    }
}
