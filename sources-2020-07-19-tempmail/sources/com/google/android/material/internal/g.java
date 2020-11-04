package com.google.android.material.internal;

import a.h.k.b0;
import a.h.k.t;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.view.menu.u;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: NavigationMenuPresenter */
public class g implements o {

    /* renamed from: b  reason: collision with root package name */
    private NavigationMenuView f10843b;

    /* renamed from: c  reason: collision with root package name */
    LinearLayout f10844c;

    /* renamed from: d  reason: collision with root package name */
    private o.a f10845d;

    /* renamed from: e  reason: collision with root package name */
    androidx.appcompat.view.menu.h f10846e;

    /* renamed from: f  reason: collision with root package name */
    private int f10847f;
    c g;
    LayoutInflater h;
    int i;
    boolean j;
    ColorStateList k;
    ColorStateList l;
    Drawable m;
    int n;
    int o;
    private int p;
    int q;
    final View.OnClickListener r = new a();

    /* compiled from: NavigationMenuPresenter */
    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            g.this.E(true);
            androidx.appcompat.view.menu.j itemData = ((NavigationMenuItemView) view).getItemData();
            g gVar = g.this;
            boolean O = gVar.f10846e.O(itemData, gVar, 0);
            if (itemData != null && itemData.isCheckable() && O) {
                g.this.g.C(itemData);
            }
            g.this.E(false);
            g.this.h(false);
        }
    }

    /* compiled from: NavigationMenuPresenter */
    private static class b extends k {
        public b(View view) {
            super(view);
        }
    }

    /* compiled from: NavigationMenuPresenter */
    private class c extends RecyclerView.g<k> {

        /* renamed from: c  reason: collision with root package name */
        private final ArrayList<e> f10849c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        private androidx.appcompat.view.menu.j f10850d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f10851e;

        c() {
            A();
        }

        private void A() {
            if (!this.f10851e) {
                this.f10851e = true;
                this.f10849c.clear();
                this.f10849c.add(new d());
                int i = -1;
                int size = g.this.f10846e.G().size();
                boolean z = false;
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    androidx.appcompat.view.menu.j jVar = g.this.f10846e.G().get(i3);
                    if (jVar.isChecked()) {
                        C(jVar);
                    }
                    if (jVar.isCheckable()) {
                        jVar.t(false);
                    }
                    if (jVar.hasSubMenu()) {
                        SubMenu subMenu = jVar.getSubMenu();
                        if (subMenu.hasVisibleItems()) {
                            if (i3 != 0) {
                                this.f10849c.add(new f(g.this.q, 0));
                            }
                            this.f10849c.add(new C0099g(jVar));
                            int size2 = this.f10849c.size();
                            int size3 = subMenu.size();
                            boolean z2 = false;
                            for (int i4 = 0; i4 < size3; i4++) {
                                androidx.appcompat.view.menu.j jVar2 = (androidx.appcompat.view.menu.j) subMenu.getItem(i4);
                                if (jVar2.isVisible()) {
                                    if (!z2 && jVar2.getIcon() != null) {
                                        z2 = true;
                                    }
                                    if (jVar2.isCheckable()) {
                                        jVar2.t(false);
                                    }
                                    if (jVar.isChecked()) {
                                        C(jVar);
                                    }
                                    this.f10849c.add(new C0099g(jVar2));
                                }
                            }
                            if (z2) {
                                u(size2, this.f10849c.size());
                            }
                        }
                    } else {
                        int groupId = jVar.getGroupId();
                        if (groupId != i) {
                            i2 = this.f10849c.size();
                            z = jVar.getIcon() != null;
                            if (i3 != 0) {
                                i2++;
                                ArrayList<e> arrayList = this.f10849c;
                                int i5 = g.this.q;
                                arrayList.add(new f(i5, i5));
                            }
                        } else if (!z && jVar.getIcon() != null) {
                            u(i2, this.f10849c.size());
                            z = true;
                        }
                        C0099g gVar = new C0099g(jVar);
                        gVar.f10856b = z;
                        this.f10849c.add(gVar);
                        i = groupId;
                    }
                }
                this.f10851e = false;
            }
        }

        private void u(int i, int i2) {
            while (i < i2) {
                ((C0099g) this.f10849c.get(i)).f10856b = true;
                i++;
            }
        }

        public void B(Bundle bundle) {
            androidx.appcompat.view.menu.j a2;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            androidx.appcompat.view.menu.j a3;
            int i = bundle.getInt("android:menu:checked", 0);
            if (i != 0) {
                this.f10851e = true;
                int size = this.f10849c.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    e eVar = this.f10849c.get(i2);
                    if ((eVar instanceof C0099g) && (a3 = ((C0099g) eVar).a()) != null && a3.getItemId() == i) {
                        C(a3);
                        break;
                    }
                    i2++;
                }
                this.f10851e = false;
                A();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.f10849c.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    e eVar2 = this.f10849c.get(i3);
                    if (!(!(eVar2 instanceof C0099g) || (a2 = ((C0099g) eVar2).a()) == null || (actionView = a2.getActionView()) == null || (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(a2.getItemId())) == null)) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        public void C(androidx.appcompat.view.menu.j jVar) {
            if (this.f10850d != jVar && jVar.isCheckable()) {
                androidx.appcompat.view.menu.j jVar2 = this.f10850d;
                if (jVar2 != null) {
                    jVar2.setChecked(false);
                }
                this.f10850d = jVar;
                jVar.setChecked(true);
            }
        }

        public void D(boolean z) {
            this.f10851e = z;
        }

        public void E() {
            A();
            g();
        }

        public int c() {
            return this.f10849c.size();
        }

        public long d(int i) {
            return (long) i;
        }

        public int e(int i) {
            e eVar = this.f10849c.get(i);
            if (eVar instanceof f) {
                return 2;
            }
            if (eVar instanceof d) {
                return 3;
            }
            if (eVar instanceof C0099g) {
                return ((C0099g) eVar).a().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        public Bundle v() {
            Bundle bundle = new Bundle();
            androidx.appcompat.view.menu.j jVar = this.f10850d;
            if (jVar != null) {
                bundle.putInt("android:menu:checked", jVar.getItemId());
            }
            SparseArray sparseArray = new SparseArray();
            int size = this.f10849c.size();
            for (int i = 0; i < size; i++) {
                e eVar = this.f10849c.get(i);
                if (eVar instanceof C0099g) {
                    androidx.appcompat.view.menu.j a2 = ((C0099g) eVar).a();
                    View actionView = a2 != null ? a2.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(a2.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        public androidx.appcompat.view.menu.j w() {
            return this.f10850d;
        }

        /* renamed from: x */
        public void k(k kVar, int i) {
            int e2 = e(i);
            if (e2 == 0) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) kVar.f1686a;
                navigationMenuItemView.setIconTintList(g.this.l);
                g gVar = g.this;
                if (gVar.j) {
                    navigationMenuItemView.setTextAppearance(gVar.i);
                }
                ColorStateList colorStateList = g.this.k;
                if (colorStateList != null) {
                    navigationMenuItemView.setTextColor(colorStateList);
                }
                Drawable drawable = g.this.m;
                t.b0(navigationMenuItemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
                C0099g gVar2 = (C0099g) this.f10849c.get(i);
                navigationMenuItemView.setNeedsEmptyIcon(gVar2.f10856b);
                navigationMenuItemView.setHorizontalPadding(g.this.n);
                navigationMenuItemView.setIconPadding(g.this.o);
                navigationMenuItemView.e(gVar2.a(), 0);
            } else if (e2 == 1) {
                ((TextView) kVar.f1686a).setText(((C0099g) this.f10849c.get(i)).a().getTitle());
            } else if (e2 == 2) {
                f fVar = (f) this.f10849c.get(i);
                kVar.f1686a.setPadding(0, fVar.b(), 0, fVar.a());
            }
        }

        /* renamed from: y */
        public k m(ViewGroup viewGroup, int i) {
            if (i == 0) {
                g gVar = g.this;
                return new h(gVar.h, viewGroup, gVar.r);
            } else if (i == 1) {
                return new j(g.this.h, viewGroup);
            } else {
                if (i == 2) {
                    return new i(g.this.h, viewGroup);
                }
                if (i != 3) {
                    return null;
                }
                return new b(g.this.f10844c);
            }
        }

        /* renamed from: z */
        public void r(k kVar) {
            if (kVar instanceof h) {
                ((NavigationMenuItemView) kVar.f1686a).D();
            }
        }
    }

    /* compiled from: NavigationMenuPresenter */
    private static class d implements e {
        d() {
        }
    }

    /* compiled from: NavigationMenuPresenter */
    private interface e {
    }

    /* compiled from: NavigationMenuPresenter */
    private static class f implements e {

        /* renamed from: a  reason: collision with root package name */
        private final int f10853a;

        /* renamed from: b  reason: collision with root package name */
        private final int f10854b;

        public f(int i, int i2) {
            this.f10853a = i;
            this.f10854b = i2;
        }

        public int a() {
            return this.f10854b;
        }

        public int b() {
            return this.f10853a;
        }
    }

    /* renamed from: com.google.android.material.internal.g$g  reason: collision with other inner class name */
    /* compiled from: NavigationMenuPresenter */
    private static class C0099g implements e {

        /* renamed from: a  reason: collision with root package name */
        private final androidx.appcompat.view.menu.j f10855a;

        /* renamed from: b  reason: collision with root package name */
        boolean f10856b;

        C0099g(androidx.appcompat.view.menu.j jVar) {
            this.f10855a = jVar;
        }

        public androidx.appcompat.view.menu.j a() {
            return this.f10855a;
        }
    }

    /* compiled from: NavigationMenuPresenter */
    private static class h extends k {
        public h(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(b.c.a.d.h.design_navigation_item, viewGroup, false));
            this.f1686a.setOnClickListener(onClickListener);
        }
    }

    /* compiled from: NavigationMenuPresenter */
    private static class i extends k {
        public i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(b.c.a.d.h.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* compiled from: NavigationMenuPresenter */
    private static class j extends k {
        public j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(b.c.a.d.h.design_navigation_item_subheader, viewGroup, false));
        }
    }

    /* compiled from: NavigationMenuPresenter */
    private static abstract class k extends RecyclerView.b0 {
        public k(View view) {
            super(view);
        }
    }

    public void A(int i2) {
        this.o = i2;
        h(false);
    }

    public void B(ColorStateList colorStateList) {
        this.l = colorStateList;
        h(false);
    }

    public void C(int i2) {
        this.i = i2;
        this.j = true;
        h(false);
    }

    public void D(ColorStateList colorStateList) {
        this.k = colorStateList;
        h(false);
    }

    public void E(boolean z) {
        c cVar = this.g;
        if (cVar != null) {
            cVar.D(z);
        }
    }

    public void a(androidx.appcompat.view.menu.h hVar, boolean z) {
        o.a aVar = this.f10845d;
        if (aVar != null) {
            aVar.a(hVar, z);
        }
    }

    public void b(View view) {
        this.f10844c.addView(view);
        NavigationMenuView navigationMenuView = this.f10843b;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    public void c(b0 b0Var) {
        int e2 = b0Var.e();
        if (this.p != e2) {
            this.p = e2;
            if (this.f10844c.getChildCount() == 0) {
                NavigationMenuView navigationMenuView = this.f10843b;
                navigationMenuView.setPadding(0, this.p, 0, navigationMenuView.getPaddingBottom());
            }
        }
        t.e(this.f10844c, b0Var);
    }

    public androidx.appcompat.view.menu.j d() {
        return this.g.w();
    }

    public int e() {
        return this.f10844c.getChildCount();
    }

    public Drawable f() {
        return this.m;
    }

    public int g() {
        return this.f10847f;
    }

    public void h(boolean z) {
        c cVar = this.g;
        if (cVar != null) {
            cVar.E();
        }
    }

    public boolean i() {
        return false;
    }

    public boolean j(androidx.appcompat.view.menu.h hVar, androidx.appcompat.view.menu.j jVar) {
        return false;
    }

    public boolean k(androidx.appcompat.view.menu.h hVar, androidx.appcompat.view.menu.j jVar) {
        return false;
    }

    public void l(o.a aVar) {
        this.f10845d = aVar;
    }

    public void m(Context context, androidx.appcompat.view.menu.h hVar) {
        this.h = LayoutInflater.from(context);
        this.f10846e = hVar;
        this.q = context.getResources().getDimensionPixelOffset(b.c.a.d.d.design_navigation_separator_vertical_padding);
    }

    public void n(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f10843b.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.g.B(bundle2);
            }
            SparseArray sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.f10844c.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    public boolean o(u uVar) {
        return false;
    }

    public Parcelable p() {
        Bundle bundle = new Bundle();
        if (this.f10843b != null) {
            SparseArray sparseArray = new SparseArray();
            this.f10843b.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        c cVar = this.g;
        if (cVar != null) {
            bundle.putBundle("android:menu:adapter", cVar.v());
        }
        if (this.f10844c != null) {
            SparseArray sparseArray2 = new SparseArray();
            this.f10844c.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    public int q() {
        return this.n;
    }

    public int r() {
        return this.o;
    }

    public ColorStateList s() {
        return this.k;
    }

    public ColorStateList t() {
        return this.l;
    }

    public p u(ViewGroup viewGroup) {
        if (this.f10843b == null) {
            this.f10843b = (NavigationMenuView) this.h.inflate(b.c.a.d.h.design_navigation_menu, viewGroup, false);
            if (this.g == null) {
                this.g = new c();
            }
            this.f10844c = (LinearLayout) this.h.inflate(b.c.a.d.h.design_navigation_item_header, this.f10843b, false);
            this.f10843b.setAdapter(this.g);
        }
        return this.f10843b;
    }

    public View v(int i2) {
        View inflate = this.h.inflate(i2, this.f10844c, false);
        b(inflate);
        return inflate;
    }

    public void w(androidx.appcompat.view.menu.j jVar) {
        this.g.C(jVar);
    }

    public void x(int i2) {
        this.f10847f = i2;
    }

    public void y(Drawable drawable) {
        this.m = drawable;
        h(false);
    }

    public void z(int i2) {
        this.n = i2;
        h(false);
    }
}
