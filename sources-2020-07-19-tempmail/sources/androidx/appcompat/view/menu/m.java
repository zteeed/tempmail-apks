package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* compiled from: MenuPopup */
abstract class m implements s, o, AdapterView.OnItemClickListener {

    /* renamed from: b  reason: collision with root package name */
    private Rect f873b;

    m() {
    }

    protected static g A(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (g) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (g) listAdapter;
    }

    protected static int q(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    protected static boolean z(h hVar) {
        int size = hVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = hVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public abstract void c(h hVar);

    /* access modifiers changed from: protected */
    public boolean e() {
        return true;
    }

    public Rect f() {
        return this.f873b;
    }

    public int g() {
        return 0;
    }

    public boolean j(h hVar, j jVar) {
        return false;
    }

    public boolean k(h hVar, j jVar) {
        return false;
    }

    public void m(Context context, h hVar) {
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        A(listAdapter).f844b.O((MenuItem) listAdapter.getItem(i), this, e() ? 0 : 4);
    }

    public abstract void r(View view);

    public void s(Rect rect) {
        this.f873b = rect;
    }

    public abstract void t(boolean z);

    public abstract void u(int i);

    public abstract void v(int i);

    public abstract void w(PopupWindow.OnDismissListener onDismissListener);

    public abstract void x(boolean z);

    public abstract void y(int i);
}
