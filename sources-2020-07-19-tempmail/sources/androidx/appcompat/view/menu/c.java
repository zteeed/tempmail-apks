package androidx.appcompat.view.menu;

import a.e.a;
import a.h.f.a.b;
import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;

/* compiled from: BaseMenuWrapper */
abstract class c<T> extends d<T> {

    /* renamed from: b  reason: collision with root package name */
    final Context f819b;

    /* renamed from: c  reason: collision with root package name */
    private Map<b, MenuItem> f820c;

    /* renamed from: d  reason: collision with root package name */
    private Map<a.h.f.a.c, SubMenu> f821d;

    c(Context context, T t) {
        super(t);
        this.f819b = context;
    }

    /* access modifiers changed from: package-private */
    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof b)) {
            return menuItem;
        }
        b bVar = (b) menuItem;
        if (this.f820c == null) {
            this.f820c = new a();
        }
        MenuItem menuItem2 = this.f820c.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItem b2 = q.b(this.f819b, bVar);
        this.f820c.put(bVar, b2);
        return b2;
    }

    /* access modifiers changed from: package-private */
    public final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof a.h.f.a.c)) {
            return subMenu;
        }
        a.h.f.a.c cVar = (a.h.f.a.c) subMenu;
        if (this.f821d == null) {
            this.f821d = new a();
        }
        SubMenu subMenu2 = this.f821d.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenu c2 = q.c(this.f819b, cVar);
        this.f821d.put(cVar, c2);
        return c2;
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        Map<b, MenuItem> map = this.f820c;
        if (map != null) {
            map.clear();
        }
        Map<a.h.f.a.c, SubMenu> map2 = this.f821d;
        if (map2 != null) {
            map2.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public final void f(int i) {
        Map<b, MenuItem> map = this.f820c;
        if (map != null) {
            Iterator<b> it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getGroupId()) {
                    it.remove();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void g(int i) {
        Map<b, MenuItem> map = this.f820c;
        if (map != null) {
            Iterator<b> it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getItemId()) {
                    it.remove();
                    return;
                }
            }
        }
    }
}
