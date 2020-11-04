package androidx.core.app;

import a.h.k.e;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import androidx.lifecycle.h;
import androidx.lifecycle.o;

/* compiled from: ComponentActivity */
public class d extends Activity implements g, e.a {

    /* renamed from: b  reason: collision with root package name */
    private a.e.g<Class<? extends a>, a> f1270b = new a.e.g<>();

    /* renamed from: c  reason: collision with root package name */
    private h f1271c = new h(this);

    /* compiled from: ComponentActivity */
    public static class a {
    }

    public boolean N(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
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

    public androidx.lifecycle.e e() {
        return this.f1271c;
    }

    public <T extends a> T f0(Class<T> cls) {
        return (a) this.f1270b.get(cls);
    }

    public void g0(a aVar) {
        this.f1270b.put(aVar.getClass(), aVar);
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        o.e(this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.f1271c.k(e.b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
