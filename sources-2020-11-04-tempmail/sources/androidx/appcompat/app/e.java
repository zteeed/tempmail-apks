package androidx.appcompat.app;

import a.a.n.b;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.g0;
import androidx.core.app.a;
import androidx.core.app.l;
import androidx.fragment.app.c;

/* compiled from: AppCompatActivity */
public class e extends c implements f, l.a, b.c {
    private g t;
    private int u = 0;
    private Resources v;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r2 = getWindow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean z0(int r2, android.view.KeyEvent r3) {
        /*
            r1 = this;
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r2 >= r0) goto L_0x003e
            boolean r2 = r3.isCtrlPressed()
            if (r2 != 0) goto L_0x003e
            int r2 = r3.getMetaState()
            boolean r2 = android.view.KeyEvent.metaStateHasNoModifiers(r2)
            if (r2 != 0) goto L_0x003e
            int r2 = r3.getRepeatCount()
            if (r2 != 0) goto L_0x003e
            int r2 = r3.getKeyCode()
            boolean r2 = android.view.KeyEvent.isModifierKey(r2)
            if (r2 != 0) goto L_0x003e
            android.view.Window r2 = r1.getWindow()
            if (r2 == 0) goto L_0x003e
            android.view.View r0 = r2.getDecorView()
            if (r0 == 0) goto L_0x003e
            android.view.View r2 = r2.getDecorView()
            boolean r2 = r2.dispatchKeyShortcutEvent(r3)
            if (r2 == 0) goto L_0x003e
            r2 = 1
            return r2
        L_0x003e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.e.z0(int, android.view.KeyEvent):boolean");
    }

    public void A0(Toolbar toolbar) {
        t0().A(toolbar);
    }

    public void B0(Intent intent) {
        androidx.core.app.e.e(this, intent);
    }

    public boolean C0(Intent intent) {
        return androidx.core.app.e.f(this, intent);
    }

    public a.a.n.b F(b.a aVar) {
        return null;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        t0().c(view, layoutParams);
    }

    public void closeOptionsMenu() {
        a u0 = u0();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (u0 == null || !u0.f()) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a u0 = u0();
        if (keyCode != 82 || u0 == null || !u0.q(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public <T extends View> T findViewById(int i) {
        return t0().g(i);
    }

    public MenuInflater getMenuInflater() {
        return t0().j();
    }

    public Resources getResources() {
        if (this.v == null && g0.b()) {
            this.v = new g0(this, super.getResources());
        }
        Resources resources = this.v;
        return resources == null ? super.getResources() : resources;
    }

    public void invalidateOptionsMenu() {
        t0().m();
    }

    public void m(a.a.n.b bVar) {
    }

    public b.C0032b n() {
        return t0().i();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        t0().n(configuration);
        if (this.v != null) {
            this.v.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    public void onContentChanged() {
        x0();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        int i;
        g t0 = t0();
        t0.l();
        t0.o(bundle);
        if (t0.d() && (i = this.u) != 0) {
            if (Build.VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.u, false);
            } else {
                setTheme(i);
            }
        }
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        t0().p();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (z0(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        a u0 = u0();
        if (menuItem.getItemId() != 16908332 || u0 == null || (u0.i() & 4) == 0) {
            return false;
        }
        return y0();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        t0().q(bundle);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        t0().r();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        t0().s(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        t0().t();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        t0().u();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        t0().B(charSequence);
    }

    public void openOptionsMenu() {
        a u0 = u0();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (u0 == null || !u0.r()) {
            super.openOptionsMenu();
        }
    }

    public void s(a.a.n.b bVar) {
    }

    public void s0() {
        t0().m();
    }

    public void setContentView(int i) {
        t0().w(i);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        this.u = i;
    }

    public g t0() {
        if (this.t == null) {
            this.t = g.e(this, this);
        }
        return this.t;
    }

    public a u0() {
        return t0().k();
    }

    public void v0(l lVar) {
        lVar.h(this);
    }

    public void w0(l lVar) {
    }

    @Deprecated
    public void x0() {
    }

    public boolean y0() {
        Intent z = z();
        if (z == null) {
            return false;
        }
        if (C0(z)) {
            l j = l.j(this);
            v0(j);
            w0(j);
            j.q();
            try {
                a.l(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            B0(z);
            return true;
        }
    }

    public Intent z() {
        return androidx.core.app.e.a(this);
    }

    public void setContentView(View view) {
        t0().x(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        t0().y(view, layoutParams);
    }
}
