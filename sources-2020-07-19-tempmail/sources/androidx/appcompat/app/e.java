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
    private g o;
    private int p = 0;
    private Resources q;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r2 = getWindow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A0(int r2, android.view.KeyEvent r3) {
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.e.A0(int, android.view.KeyEvent):boolean");
    }

    public Intent A() {
        return androidx.core.app.e.a(this);
    }

    public void B0(Toolbar toolbar) {
        u0().A(toolbar);
    }

    public void C0(Intent intent) {
        androidx.core.app.e.e(this, intent);
    }

    public boolean D0(Intent intent) {
        return androidx.core.app.e.f(this, intent);
    }

    public a.a.n.b I(b.a aVar) {
        return null;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        u0().c(view, layoutParams);
    }

    public void closeOptionsMenu() {
        a v0 = v0();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (v0 == null || !v0.f()) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a v0 = v0();
        if (keyCode != 82 || v0 == null || !v0.q(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public <T extends View> T findViewById(int i) {
        return u0().g(i);
    }

    public MenuInflater getMenuInflater() {
        return u0().j();
    }

    public Resources getResources() {
        if (this.q == null && g0.b()) {
            this.q = new g0(this, super.getResources());
        }
        Resources resources = this.q;
        return resources == null ? super.getResources() : resources;
    }

    public void invalidateOptionsMenu() {
        u0().m();
    }

    public void n(a.a.n.b bVar) {
    }

    public b.C0032b o() {
        return u0().i();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        u0().n(configuration);
        if (this.q != null) {
            this.q.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    public void onContentChanged() {
        y0();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        int i;
        g u0 = u0();
        u0.l();
        u0.o(bundle);
        if (u0.d() && (i = this.p) != 0) {
            if (Build.VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.p, false);
            } else {
                setTheme(i);
            }
        }
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        u0().p();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (A0(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        a v0 = v0();
        if (menuItem.getItemId() != 16908332 || v0 == null || (v0.i() & 4) == 0) {
            return false;
        }
        return z0();
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
        u0().q(bundle);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        u0().r();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        u0().s(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        u0().t();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        u0().u();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        u0().B(charSequence);
    }

    public void openOptionsMenu() {
        a v0 = v0();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (v0 == null || !v0.r()) {
            super.openOptionsMenu();
        }
    }

    public void s(a.a.n.b bVar) {
    }

    public void setContentView(int i) {
        u0().w(i);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        this.p = i;
    }

    public void t0() {
        u0().m();
    }

    public g u0() {
        if (this.o == null) {
            this.o = g.e(this, this);
        }
        return this.o;
    }

    public a v0() {
        return u0().k();
    }

    public void w0(l lVar) {
        lVar.h(this);
    }

    public void x0(l lVar) {
    }

    @Deprecated
    public void y0() {
    }

    public boolean z0() {
        Intent A = A();
        if (A == null) {
            return false;
        }
        if (D0(A)) {
            l j = l.j(this);
            w0(j);
            x0(j);
            j.q();
            try {
                a.l(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            C0(A);
            return true;
        }
    }

    public void setContentView(View view) {
        u0().x(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        u0().y(view, layoutParams);
    }
}
