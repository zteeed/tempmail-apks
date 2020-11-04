package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.p;
import java.util.ArrayList;

/* compiled from: MenuAdapter */
public class g extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    h f844b;

    /* renamed from: c  reason: collision with root package name */
    private int f845c = -1;

    /* renamed from: d  reason: collision with root package name */
    private boolean f846d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f847e;

    /* renamed from: f  reason: collision with root package name */
    private final LayoutInflater f848f;
    private final int g;

    public g(h hVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f847e = z;
        this.f848f = layoutInflater;
        this.f844b = hVar;
        this.g = i;
        a();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        j x = this.f844b.x();
        if (x != null) {
            ArrayList<j> B = this.f844b.B();
            int size = B.size();
            for (int i = 0; i < size; i++) {
                if (B.get(i) == x) {
                    this.f845c = i;
                    return;
                }
            }
        }
        this.f845c = -1;
    }

    public h b() {
        return this.f844b;
    }

    /* renamed from: c */
    public j getItem(int i) {
        ArrayList<j> B = this.f847e ? this.f844b.B() : this.f844b.G();
        int i2 = this.f845c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return B.get(i);
    }

    public void d(boolean z) {
        this.f846d = z;
    }

    public int getCount() {
        ArrayList<j> B = this.f847e ? this.f844b.B() : this.f844b.G();
        if (this.f845c < 0) {
            return B.size();
        }
        return B.size() - 1;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f848f.inflate(this.g, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f844b.H() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        p.a aVar = (p.a) view;
        if (this.f846d) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.e(getItem(i), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
