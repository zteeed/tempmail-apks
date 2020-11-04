package androidx.appcompat.view.menu;

import a.a.g;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.view.menu.p;
import java.util.ArrayList;

/* compiled from: ListMenuPresenter */
public class f implements o, AdapterView.OnItemClickListener {

    /* renamed from: b  reason: collision with root package name */
    Context f864b;

    /* renamed from: c  reason: collision with root package name */
    LayoutInflater f865c;

    /* renamed from: d  reason: collision with root package name */
    h f866d;

    /* renamed from: e  reason: collision with root package name */
    ExpandedMenuView f867e;

    /* renamed from: f  reason: collision with root package name */
    int f868f;
    int g;
    int h;
    private o.a i;
    a j;
    private int k;

    /* compiled from: ListMenuPresenter */
    private class a extends BaseAdapter {

        /* renamed from: b  reason: collision with root package name */
        private int f869b = -1;

        public a() {
            a();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            j x = f.this.f866d.x();
            if (x != null) {
                ArrayList<j> B = f.this.f866d.B();
                int size = B.size();
                for (int i = 0; i < size; i++) {
                    if (B.get(i) == x) {
                        this.f869b = i;
                        return;
                    }
                }
            }
            this.f869b = -1;
        }

        /* renamed from: b */
        public j getItem(int i) {
            ArrayList<j> B = f.this.f866d.B();
            int i2 = i + f.this.f868f;
            int i3 = this.f869b;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return B.get(i2);
        }

        public int getCount() {
            int size = f.this.f866d.B().size() - f.this.f868f;
            return this.f869b < 0 ? size : size - 1;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                f fVar = f.this;
                view = fVar.f865c.inflate(fVar.h, viewGroup, false);
            }
            ((p.a) view).e(getItem(i), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public f(Context context, int i2) {
        this(i2, 0);
        this.f864b = context;
        this.f865c = LayoutInflater.from(context);
    }

    public void a(h hVar, boolean z) {
        o.a aVar = this.i;
        if (aVar != null) {
            aVar.a(hVar, z);
        }
    }

    public ListAdapter b() {
        if (this.j == null) {
            this.j = new a();
        }
        return this.j;
    }

    public p c(ViewGroup viewGroup) {
        if (this.f867e == null) {
            this.f867e = (ExpandedMenuView) this.f865c.inflate(g.abc_expanded_menu_layout, viewGroup, false);
            if (this.j == null) {
                this.j = new a();
            }
            this.f867e.setAdapter(this.j);
            this.f867e.setOnItemClickListener(this);
        }
        return this.f867e;
    }

    public void d(Bundle bundle) {
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f867e.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public void e(Bundle bundle) {
        SparseArray sparseArray = new SparseArray();
        ExpandedMenuView expandedMenuView = this.f867e;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    public int h() {
        return this.k;
    }

    public void i(boolean z) {
        a aVar = this.j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public boolean j() {
        return false;
    }

    public boolean k(h hVar, j jVar) {
        return false;
    }

    public boolean l(h hVar, j jVar) {
        return false;
    }

    public void m(o.a aVar) {
        this.i = aVar;
    }

    public void n(Context context, h hVar) {
        if (this.g != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.g);
            this.f864b = contextThemeWrapper;
            this.f865c = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f864b != null) {
            this.f864b = context;
            if (this.f865c == null) {
                this.f865c = LayoutInflater.from(context);
            }
        }
        this.f866d = hVar;
        a aVar = this.j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public void o(Parcelable parcelable) {
        d((Bundle) parcelable);
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        this.f866d.O(this.j.getItem(i2), this, 0);
    }

    public boolean p(u uVar) {
        if (!uVar.hasVisibleItems()) {
            return false;
        }
        new i(uVar).d((IBinder) null);
        o.a aVar = this.i;
        if (aVar == null) {
            return true;
        }
        aVar.b(uVar);
        return true;
    }

    public Parcelable q() {
        if (this.f867e == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        e(bundle);
        return bundle;
    }

    public f(int i2, int i3) {
        this.h = i2;
        this.g = i3;
    }
}
