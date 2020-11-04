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
    final Context f846b;

    /* renamed from: c  reason: collision with root package name */
    private Map<b, MenuItem> f847c;

    /* renamed from: d  reason: collision with root package name */
    private Map<a.h.f.a.c, SubMenu> f848d;

    c(Context context, T t) {
        super(t);
        this.f846b = context;
    }

    /* access modifiers changed from: package-private */
    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof b)) {
            return menuItem;
        }
        b bVar = (b) menuItem;
        if (this.f847c == null) {
            this.f847c = new a();
        }
        MenuItem menuItem2 = this.f847c.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItem b2 = q.b(this.f846b, bVar);
        this.f847c.put(bVar, b2);
        return b2;
    }

    /* access modifiers changed from: package-private */
    public final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof a.h.f.a.c)) {
            return subMenu;
        }
        a.h.f.a.c cVar = (a.h.f.a.c) subMenu;
        if (this.f848d == null) {
            this.f848d = new a();
        }
        SubMenu subMenu2 = this.f848d.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenu c2 = q.c(this.f846b, cVar);
        this.f848d.put(cVar, c2);
        return c2;
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        Map<b, MenuItem> map = this.f847c;
        if (map != null) {
            map.clear();
        }
        Map<a.h.f.a.c, SubMenu> map2 = this.f848d;
        if (map2 != null) {
            map2.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public final void f(int i) {
        Map<b, MenuItem> map = this.f847c;
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
        Map<b, MenuItem> map = this.f847c;
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
