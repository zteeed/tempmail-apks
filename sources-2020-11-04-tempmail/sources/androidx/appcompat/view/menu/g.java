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
    h f871b;

    /* renamed from: c  reason: collision with root package name */
    private int f872c = -1;

    /* renamed from: d  reason: collision with root package name */
    private boolean f873d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f874e;

    /* renamed from: f  reason: collision with root package name */
    private final LayoutInflater f875f;
    private final int g;

    public g(h hVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f874e = z;
        this.f875f = layoutInflater;
        this.f871b = hVar;
        this.g = i;
        a();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        j x = this.f871b.x();
        if (x != null) {
            ArrayList<j> B = this.f871b.B();
            int size = B.size();
            for (int i = 0; i < size; i++) {
                if (B.get(i) == x) {
                    this.f872c = i;
                    return;
                }
            }
        }
        this.f872c = -1;
    }

    public h b() {
        return this.f871b;
    }

    /* renamed from: c */
    public j getItem(int i) {
        ArrayList<j> B = this.f874e ? this.f871b.B() : this.f871b.G();
        int i2 = this.f872c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return B.get(i);
    }

    public void d(boolean z) {
        this.f873d = z;
    }

    public int getCount() {
        ArrayList<j> B = this.f874e ? this.f871b.B() : this.f871b.G();
        if (this.f872c < 0) {
            return B.size();
        }
        return B.size() - 1;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f875f.inflate(this.g, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f871b.H() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        p.a aVar = (p.a) view;
        if (this.f873d) {
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
