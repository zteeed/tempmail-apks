package a.a.n;

import a.a.n.b;
import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: StandaloneActionMode */
public class e extends b implements h.a {

    /* renamed from: d  reason: collision with root package name */
    private Context f42d;

    /* renamed from: e  reason: collision with root package name */
    private ActionBarContextView f43e;

    /* renamed from: f  reason: collision with root package name */
    private b.a f44f;
    private WeakReference<View> g;
    private boolean h;
    private h i;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z) {
        this.f42d = context;
        this.f43e = actionBarContextView;
        this.f44f = aVar;
        h hVar = new h(actionBarContextView.getContext());
        hVar.W(1);
        this.i = hVar;
        hVar.V(this);
    }

    public boolean a(h hVar, MenuItem menuItem) {
        return this.f44f.d(this, menuItem);
    }

    public void b(h hVar) {
        k();
        this.f43e.l();
    }

    public void c() {
        if (!this.h) {
            this.h = true;
            this.f43e.sendAccessibilityEvent(32);
            this.f44f.a(this);
        }
    }

    public View d() {
        WeakReference<View> weakReference = this.g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public Menu e() {
        return this.i;
    }

    public MenuInflater f() {
        return new g(this.f43e.getContext());
    }

    public CharSequence g() {
        return this.f43e.getSubtitle();
    }

    public CharSequence i() {
        return this.f43e.getTitle();
    }

    public void k() {
        this.f44f.c(this, this.i);
    }

    public boolean l() {
        return this.f43e.j();
    }

    public void m(View view) {
        this.f43e.setCustomView(view);
        this.g = view != null ? new WeakReference<>(view) : null;
    }

    public void n(int i2) {
        o(this.f42d.getString(i2));
    }

    public void o(CharSequence charSequence) {
        this.f43e.setSubtitle(charSequence);
    }

    public void q(int i2) {
        r(this.f42d.getString(i2));
    }

    public void r(CharSequence charSequence) {
        this.f43e.setTitle(charSequence);
    }

    public void s(boolean z) {
        super.s(z);
        this.f43e.setTitleOptional(z);
    }
}
