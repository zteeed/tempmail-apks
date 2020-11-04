package a.h.k;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: ActionProvider */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private a f361a;

    /* renamed from: b  reason: collision with root package name */
    private C0013b f362b;

    /* compiled from: ActionProvider */
    public interface a {
        void b(boolean z);
    }

    /* renamed from: a.h.k.b$b  reason: collision with other inner class name */
    /* compiled from: ActionProvider */
    public interface C0013b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public b(Context context) {
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public void f(SubMenu subMenu) {
    }

    public boolean g() {
        return false;
    }

    public void h() {
        this.f362b = null;
        this.f361a = null;
    }

    public void i(a aVar) {
        this.f361a = aVar;
    }

    public void j(C0013b bVar) {
        if (!(this.f362b == null || bVar == null)) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f362b = bVar;
    }

    public void k(boolean z) {
        a aVar = this.f361a;
        if (aVar != null) {
            aVar.b(z);
        }
    }
}
