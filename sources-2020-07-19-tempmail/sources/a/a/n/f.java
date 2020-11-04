package a.a.n;

import a.a.n.b;
import a.e.g;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.q;
import java.util.ArrayList;

/* compiled from: SupportActionModeWrapper */
public class f extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    final Context f45a;

    /* renamed from: b  reason: collision with root package name */
    final b f46b;

    /* compiled from: SupportActionModeWrapper */
    public static class a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final ActionMode.Callback f47a;

        /* renamed from: b  reason: collision with root package name */
        final Context f48b;

        /* renamed from: c  reason: collision with root package name */
        final ArrayList<f> f49c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        final g<Menu, Menu> f50d = new g<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f48b = context;
            this.f47a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = this.f50d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            Menu a2 = q.a(this.f48b, (a.h.f.a.a) menu);
            this.f50d.put(menu, a2);
            return a2;
        }

        public void a(b bVar) {
            this.f47a.onDestroyActionMode(e(bVar));
        }

        public boolean b(b bVar, Menu menu) {
            return this.f47a.onCreateActionMode(e(bVar), f(menu));
        }

        public boolean c(b bVar, Menu menu) {
            return this.f47a.onPrepareActionMode(e(bVar), f(menu));
        }

        public boolean d(b bVar, MenuItem menuItem) {
            return this.f47a.onActionItemClicked(e(bVar), q.b(this.f48b, (a.h.f.a.b) menuItem));
        }

        public ActionMode e(b bVar) {
            int size = this.f49c.size();
            for (int i = 0; i < size; i++) {
                f fVar = this.f49c.get(i);
                if (fVar != null && fVar.f46b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f48b, bVar);
            this.f49c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f45a = context;
        this.f46b = bVar;
    }

    public void finish() {
        this.f46b.c();
    }

    public View getCustomView() {
        return this.f46b.d();
    }

    public Menu getMenu() {
        return q.a(this.f45a, (a.h.f.a.a) this.f46b.e());
    }

    public MenuInflater getMenuInflater() {
        return this.f46b.f();
    }

    public CharSequence getSubtitle() {
        return this.f46b.g();
    }

    public Object getTag() {
        return this.f46b.h();
    }

    public CharSequence getTitle() {
        return this.f46b.i();
    }

    public boolean getTitleOptionalHint() {
        return this.f46b.j();
    }

    public void invalidate() {
        this.f46b.k();
    }

    public boolean isTitleOptional() {
        return this.f46b.l();
    }

    public void setCustomView(View view) {
        this.f46b.m(view);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f46b.o(charSequence);
    }

    public void setTag(Object obj) {
        this.f46b.p(obj);
    }

    public void setTitle(CharSequence charSequence) {
        this.f46b.r(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.f46b.s(z);
    }

    public void setSubtitle(int i) {
        this.f46b.n(i);
    }

    public void setTitle(int i) {
        this.f46b.q(i);
    }
}
