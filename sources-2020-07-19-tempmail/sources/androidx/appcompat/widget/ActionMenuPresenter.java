package androidx.appcompat.widget;

import a.a.g;
import a.h.k.b;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.view.menu.s;
import androidx.appcompat.view.menu.u;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;

class ActionMenuPresenter extends androidx.appcompat.view.menu.b implements b.a {
    a A;
    c B;
    private b C;
    final f D = new f();
    int E;
    d k;
    private Drawable l;
    private boolean m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private int w;
    private final SparseBooleanArray x = new SparseBooleanArray();
    private View y;
    e z;

    private static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        public int f902b;

        static class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f902b);
        }

        SavedState(Parcel parcel) {
            this.f902b = parcel.readInt();
        }
    }

    private class a extends n {
        public a(Context context, u uVar, View view) {
            super(context, uVar, view, false, a.a.a.actionOverflowMenuStyle);
            if (!((j) uVar.getItem()).l()) {
                View view2 = ActionMenuPresenter.this.k;
                f(view2 == null ? (View) ActionMenuPresenter.this.i : view2);
            }
            j(ActionMenuPresenter.this.D);
        }

        /* access modifiers changed from: protected */
        public void e() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.A = null;
            actionMenuPresenter.E = 0;
            super.e();
        }
    }

    private class b extends ActionMenuItemView.b {
        b() {
        }

        public s a() {
            a aVar = ActionMenuPresenter.this.A;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    private class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private e f904b;

        public c(e eVar) {
            this.f904b = eVar;
        }

        public void run() {
            if (ActionMenuPresenter.this.f816d != null) {
                ActionMenuPresenter.this.f816d.d();
            }
            View view = (View) ActionMenuPresenter.this.i;
            if (!(view == null || view.getWindowToken() == null || !this.f904b.m())) {
                ActionMenuPresenter.this.z = this.f904b;
            }
            ActionMenuPresenter.this.B = null;
        }
    }

    private class d extends AppCompatImageView implements ActionMenuView.a {

        class a extends r {
            a(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
            }

            public s b() {
                e eVar = ActionMenuPresenter.this.z;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            public boolean c() {
                ActionMenuPresenter.this.N();
                return true;
            }

            public boolean d() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.B != null) {
                    return false;
                }
                actionMenuPresenter.E();
                return true;
            }
        }

        public d(Context context) {
            super(context, (AttributeSet) null, a.a.a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            d0.a(this, getContentDescription());
            setOnTouchListener(new a(this, ActionMenuPresenter.this));
        }

        public boolean a() {
            return false;
        }

        public boolean b() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.N();
            return true;
        }

        /* access modifiers changed from: protected */
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    private class e extends n {
        public e(Context context, h hVar, View view, boolean z) {
            super(context, hVar, view, z, a.a.a.actionOverflowMenuStyle);
            h(8388613);
            j(ActionMenuPresenter.this.D);
        }

        /* access modifiers changed from: protected */
        public void e() {
            if (ActionMenuPresenter.this.f816d != null) {
                ActionMenuPresenter.this.f816d.close();
            }
            ActionMenuPresenter.this.z = null;
            super.e();
        }
    }

    private class f implements o.a {
        f() {
        }

        public void a(h hVar, boolean z) {
            if (hVar instanceof u) {
                hVar.F().e(false);
            }
            o.a q = ActionMenuPresenter.this.q();
            if (q != null) {
                q.a(hVar, z);
            }
        }

        public boolean b(h hVar) {
            if (hVar == null) {
                return false;
            }
            ActionMenuPresenter.this.E = ((u) hVar).getItem().getItemId();
            o.a q = ActionMenuPresenter.this.q();
            if (q != null) {
                return q.b(hVar);
            }
            return false;
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, g.abc_action_menu_layout, g.abc_action_menu_item_layout);
    }

    private View C(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof p.a) && ((p.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public boolean B() {
        return E() | F();
    }

    public Drawable D() {
        d dVar = this.k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.m) {
            return this.l;
        }
        return null;
    }

    public boolean E() {
        p pVar;
        c cVar = this.B;
        if (cVar == null || (pVar = this.i) == null) {
            e eVar = this.z;
            if (eVar == null) {
                return false;
            }
            eVar.b();
            return true;
        }
        ((View) pVar).removeCallbacks(cVar);
        this.B = null;
        return true;
    }

    public boolean F() {
        a aVar = this.A;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean G() {
        return this.B != null || H();
    }

    public boolean H() {
        e eVar = this.z;
        return eVar != null && eVar.d();
    }

    public void I(Configuration configuration) {
        if (!this.s) {
            this.r = a.a.n.a.b(this.f815c).d();
        }
        h hVar = this.f816d;
        if (hVar != null) {
            hVar.M(true);
        }
    }

    public void J(boolean z2) {
        this.v = z2;
    }

    public void K(ActionMenuView actionMenuView) {
        this.i = actionMenuView;
        actionMenuView.b(this.f816d);
    }

    public void L(Drawable drawable) {
        d dVar = this.k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.m = true;
        this.l = drawable;
    }

    public void M(boolean z2) {
        this.n = z2;
        this.o = true;
    }

    public boolean N() {
        h hVar;
        if (!this.n || H() || (hVar = this.f816d) == null || this.i == null || this.B != null || hVar.B().isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.f815c, this.f816d, this.k, true));
        this.B = cVar;
        ((View) this.i).post(cVar);
        super.o((u) null);
        return true;
    }

    public void a(h hVar, boolean z2) {
        B();
        super.a(hVar, z2);
    }

    public void b(boolean z2) {
        if (z2) {
            super.o((u) null);
            return;
        }
        h hVar = this.f816d;
        if (hVar != null) {
            hVar.e(false);
        }
    }

    public void d(j jVar, p.a aVar) {
        aVar.e(jVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.i);
        if (this.C == null) {
            this.C = new b();
        }
        actionMenuItemView.setPopupCallback(this.C);
    }

    public boolean f(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.k) {
            return false;
        }
        return super.f(viewGroup, i);
    }

    public void h(boolean z2) {
        p pVar;
        super.h(z2);
        ((View) this.i).requestLayout();
        h hVar = this.f816d;
        boolean z3 = false;
        if (hVar != null) {
            ArrayList<j> u2 = hVar.u();
            int size = u2.size();
            for (int i = 0; i < size; i++) {
                a.h.k.b b2 = u2.get(i).b();
                if (b2 != null) {
                    b2.i(this);
                }
            }
        }
        h hVar2 = this.f816d;
        ArrayList<j> B2 = hVar2 != null ? hVar2.B() : null;
        if (this.n && B2 != null) {
            int size2 = B2.size();
            if (size2 == 1) {
                z3 = !B2.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z3 = true;
            }
        }
        if (z3) {
            if (this.k == null) {
                this.k = new d(this.f814b);
            }
            ViewGroup viewGroup = (ViewGroup) this.k.getParent();
            if (viewGroup != this.i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.i;
                actionMenuView.addView(this.k, actionMenuView.F());
            }
        } else {
            d dVar = this.k;
            if (dVar != null && dVar.getParent() == (pVar = this.i)) {
                ((ViewGroup) pVar).removeView(this.k);
            }
        }
        ((ActionMenuView) this.i).setOverflowReserved(this.n);
    }

    public boolean i() {
        int i;
        ArrayList<j> arrayList;
        int i2;
        int i3;
        int i4;
        ActionMenuPresenter actionMenuPresenter = this;
        h hVar = actionMenuPresenter.f816d;
        int i5 = 0;
        if (hVar != null) {
            arrayList = hVar.G();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i6 = actionMenuPresenter.r;
        int i7 = actionMenuPresenter.q;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.i;
        boolean z2 = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            j jVar = arrayList.get(i10);
            if (jVar.o()) {
                i8++;
            } else if (jVar.n()) {
                i9++;
            } else {
                z2 = true;
            }
            if (actionMenuPresenter.v && jVar.isActionViewExpanded()) {
                i6 = 0;
            }
        }
        if (actionMenuPresenter.n && (z2 || i9 + i8 > i6)) {
            i6--;
        }
        int i11 = i6 - i8;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.x;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.t) {
            int i12 = actionMenuPresenter.w;
            i2 = i7 / i12;
            i3 = i12 + ((i7 % i12) / i2);
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < i) {
            j jVar2 = arrayList.get(i13);
            if (jVar2.o()) {
                View r2 = actionMenuPresenter.r(jVar2, actionMenuPresenter.y, viewGroup);
                if (actionMenuPresenter.y == null) {
                    actionMenuPresenter.y = r2;
                }
                if (actionMenuPresenter.t) {
                    i2 -= ActionMenuView.L(r2, i3, i2, makeMeasureSpec, i5);
                } else {
                    r2.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = r2.getMeasuredWidth();
                i7 -= measuredWidth;
                if (i14 == 0) {
                    i14 = measuredWidth;
                }
                int groupId = jVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                jVar2.u(true);
                i4 = i;
            } else if (jVar2.n()) {
                int groupId2 = jVar2.getGroupId();
                boolean z3 = sparseBooleanArray.get(groupId2);
                boolean z4 = (i11 > 0 || z3) && i7 > 0 && (!actionMenuPresenter.t || i2 > 0);
                boolean z5 = z4;
                if (z4) {
                    View r3 = actionMenuPresenter.r(jVar2, actionMenuPresenter.y, viewGroup);
                    i4 = i;
                    if (actionMenuPresenter.y == null) {
                        actionMenuPresenter.y = r3;
                    }
                    if (actionMenuPresenter.t) {
                        int L = ActionMenuView.L(r3, i3, i2, makeMeasureSpec, 0);
                        i2 -= L;
                        if (L == 0) {
                            z5 = false;
                        }
                    } else {
                        r3.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    int measuredWidth2 = r3.getMeasuredWidth();
                    i7 -= measuredWidth2;
                    if (i14 == 0) {
                        i14 = measuredWidth2;
                    }
                    z4 = z5 & (!actionMenuPresenter.t ? i7 + i14 > 0 : i7 >= 0);
                } else {
                    i4 = i;
                }
                if (z4 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z3) {
                    sparseBooleanArray.put(groupId2, false);
                    int i15 = 0;
                    while (i15 < i13) {
                        j jVar3 = arrayList.get(i15);
                        if (jVar3.getGroupId() == groupId2) {
                            if (jVar3.l()) {
                                i11++;
                            }
                            jVar3.u(false);
                        }
                        i15++;
                    }
                }
                if (z4) {
                    i11--;
                }
                jVar2.u(z4);
            } else {
                i4 = i;
                jVar2.u(false);
                i13++;
                actionMenuPresenter = this;
                i = i4;
                i5 = 0;
            }
            i13++;
            actionMenuPresenter = this;
            i = i4;
            i5 = 0;
        }
        return true;
    }

    public void m(Context context, h hVar) {
        super.m(context, hVar);
        Resources resources = context.getResources();
        a.a.n.a b2 = a.a.n.a.b(context);
        if (!this.o) {
            this.n = b2.h();
        }
        if (!this.u) {
            this.p = b2.c();
        }
        if (!this.s) {
            this.r = b2.d();
        }
        int i = this.p;
        if (this.n) {
            if (this.k == null) {
                d dVar = new d(this.f814b);
                this.k = dVar;
                if (this.m) {
                    dVar.setImageDrawable(this.l);
                    this.l = null;
                    this.m = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.k.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.k.getMeasuredWidth();
        } else {
            this.k = null;
        }
        this.q = i;
        this.w = (int) (resources.getDisplayMetrics().density * 56.0f);
        this.y = null;
    }

    public void n(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof SavedState) && (i = ((SavedState) parcelable).f902b) > 0 && (findItem = this.f816d.findItem(i)) != null) {
            o((u) findItem.getSubMenu());
        }
    }

    public boolean o(u uVar) {
        boolean z2 = false;
        if (!uVar.hasVisibleItems()) {
            return false;
        }
        u uVar2 = uVar;
        while (uVar2.i0() != this.f816d) {
            uVar2 = (u) uVar2.i0();
        }
        View C2 = C(uVar2.getItem());
        if (C2 == null) {
            return false;
        }
        this.E = uVar.getItem().getItemId();
        int size = uVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = uVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i++;
        }
        a aVar = new a(this.f815c, uVar, C2);
        this.A = aVar;
        aVar.g(z2);
        this.A.k();
        super.o(uVar);
        return true;
    }

    public Parcelable p() {
        SavedState savedState = new SavedState();
        savedState.f902b = this.E;
        return savedState;
    }

    public View r(j jVar, View view, ViewGroup viewGroup) {
        View actionView = jVar.getActionView();
        if (actionView == null || jVar.j()) {
            actionView = super.r(jVar, view, viewGroup);
        }
        actionView.setVisibility(jVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.o(layoutParams));
        }
        return actionView;
    }

    public p s(ViewGroup viewGroup) {
        p pVar = this.i;
        p s2 = super.s(viewGroup);
        if (pVar != s2) {
            ((ActionMenuView) s2).setPresenter(this);
        }
        return s2;
    }

    public boolean u(int i, j jVar) {
        return jVar.l();
    }
}
