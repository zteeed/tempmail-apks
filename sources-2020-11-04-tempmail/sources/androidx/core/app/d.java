package androidx.core.app;

import a.e.g;
import a.h.k.e;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.g;
import androidx.lifecycle.k;
import androidx.lifecycle.l;
import androidx.lifecycle.t;

/* compiled from: ComponentActivity */
public class d extends Activity implements k, e.a {

    /* renamed from: b  reason: collision with root package name */
    private g<Class<? extends a>, a> f1297b = new g<>();

    /* renamed from: c  reason: collision with root package name */
    private l f1298c = new l(this);

    /* compiled from: ComponentActivity */
    public static class a {
    }

    public boolean M(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public androidx.lifecycle.g c() {
        return this.f1298c;
    }

    public <T extends a> T d0(Class<T> cls) {
        return (a) this.f1297b.get(cls);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !e.d(decorView, keyEvent)) {
            return e.e(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !e.d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    public void e0(a aVar) {
        this.f1297b.put(aVar.getClass(), aVar);
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        t.g(this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.f1298c.k(g.b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
