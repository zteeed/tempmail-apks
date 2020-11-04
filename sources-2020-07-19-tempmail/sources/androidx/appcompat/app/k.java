package androidx.appcompat.app;

import a.a.n.i;
import a.h.k.t;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.n;
import java.util.ArrayList;

/* compiled from: ToolbarActionBar */
class k extends a {

    /* renamed from: a  reason: collision with root package name */
    n f760a;

    /* renamed from: b  reason: collision with root package name */
    boolean f761b;

    /* renamed from: c  reason: collision with root package name */
    Window.Callback f762c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f763d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f764e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<a.b> f765f = new ArrayList<>();
    private final Runnable g = new a();
    private final Toolbar.f h = new b();

    /* compiled from: ToolbarActionBar */
    class a implements Runnable {
        a() {
        }

        public void run() {
            k.this.C();
        }
    }

    /* compiled from: ToolbarActionBar */
    class b implements Toolbar.f {
        b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return k.this.f762c.onMenuItemSelected(0, menuItem);
        }
    }

    /* compiled from: ToolbarActionBar */
    private final class c implements o.a {

        /* renamed from: b  reason: collision with root package name */
        private boolean f768b;

        c() {
        }

        public void a(h hVar, boolean z) {
            if (!this.f768b) {
                this.f768b = true;
                k.this.f760a.f();
                Window.Callback callback = k.this.f762c;
                if (callback != null) {
                    callback.onPanelClosed(108, hVar);
                }
                this.f768b = false;
            }
        }

        public boolean b(h hVar) {
            Window.Callback callback = k.this.f762c;
            if (callback == null) {
                return false;
            }
            callback.onMenuOpened(108, hVar);
            return true;
        }
    }

    /* compiled from: ToolbarActionBar */
    private final class d implements h.a {
        d() {
        }

        public boolean a(h hVar, MenuItem menuItem) {
            return false;
        }

        public void b(h hVar) {
            k kVar = k.this;
            if (kVar.f762c == null) {
                return;
            }
            if (kVar.f760a.a()) {
                k.this.f762c.onPanelClosed(108, hVar);
            } else if (k.this.f762c.onPreparePanel(0, (View) null, hVar)) {
                k.this.f762c.onMenuOpened(108, hVar);
            }
        }
    }

    /* compiled from: ToolbarActionBar */
    private class e extends i {
        public e(Window.Callback callback) {
            super(callback);
        }

        public View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(k.this.f760a.getContext());
            }
            return super.onCreatePanelView(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onPreparePanel) {
                k kVar = k.this;
                if (!kVar.f761b) {
                    kVar.f760a.setMenuPrepared();
                    k.this.f761b = true;
                }
            }
            return onPreparePanel;
        }
    }

    k(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        this.f760a = new c0(toolbar, false);
        e eVar = new e(callback);
        this.f762c = eVar;
        this.f760a.setWindowCallback(eVar);
        toolbar.setOnMenuItemClickListener(this.h);
        this.f760a.setWindowTitle(charSequence);
    }

    private Menu A() {
        if (!this.f763d) {
            this.f760a.n(new c(), new d());
            this.f763d = true;
        }
        return this.f760a.j();
    }

    public Window.Callback B() {
        return this.f762c;
    }

    /* access modifiers changed from: package-private */
    public void C() {
        Menu A = A();
        h hVar = A instanceof h ? (h) A : null;
        if (hVar != null) {
            hVar.h0();
        }
        try {
            A.clear();
            if (!this.f762c.onCreatePanelMenu(0, A) || !this.f762c.onPreparePanel(0, (View) null, A)) {
                A.clear();
            }
        } finally {
            if (hVar != null) {
                hVar.g0();
            }
        }
    }

    public boolean f() {
        return this.f760a.d();
    }

    public boolean g() {
        if (!this.f760a.h()) {
            return false;
        }
        this.f760a.collapseActionView();
        return true;
    }

    public void h(boolean z) {
        if (z != this.f764e) {
            this.f764e = z;
            int size = this.f765f.size();
            for (int i = 0; i < size; i++) {
                this.f765f.get(i).a(z);
            }
        }
    }

    public int i() {
        return this.f760a.r();
    }

    public Context j() {
        return this.f760a.getContext();
    }

    public CharSequence k() {
        return this.f760a.getTitle();
    }

    public void l() {
        this.f760a.o(8);
    }

    public boolean m() {
        this.f760a.p().removeCallbacks(this.g);
        t.V(this.f760a.p(), this.g);
        return true;
    }

    public void n(Configuration configuration) {
        super.n(configuration);
    }

    /* access modifiers changed from: package-private */
    public void o() {
        this.f760a.p().removeCallbacks(this.g);
    }

    public boolean p(int i, KeyEvent keyEvent) {
        Menu A = A();
        if (A == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        A.setQwertyMode(z);
        return A.performShortcut(i, keyEvent, 0);
    }

    public boolean q(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            r();
        }
        return true;
    }

    public boolean r() {
        return this.f760a.e();
    }

    public void s(boolean z) {
    }

    public void t(int i) {
        this.f760a.s(i);
    }

    public void u(Drawable drawable) {
        this.f760a.v(drawable);
    }

    public void v(boolean z) {
    }

    public void w(int i) {
        n nVar = this.f760a;
        nVar.setTitle(i != 0 ? nVar.getContext().getText(i) : null);
    }

    public void x(CharSequence charSequence) {
        this.f760a.setWindowTitle(charSequence);
    }

    public void y() {
        this.f760a.o(0);
    }
}
