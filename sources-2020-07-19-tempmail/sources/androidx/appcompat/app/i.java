package androidx.appcompat.app;

import a.a.n.b;
import a.h.k.e;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: AppCompatDialog */
public class i extends Dialog implements f {

    /* renamed from: b  reason: collision with root package name */
    private g f751b;

    /* renamed from: c  reason: collision with root package name */
    private final e.a f752c = new a();

    /* compiled from: AppCompatDialog */
    class a implements e.a {
        a() {
        }

        public boolean N(KeyEvent keyEvent) {
            return i.this.c(keyEvent);
        }
    }

    public i(Context context, int i) {
        super(context, b(context, i));
        a().o((Bundle) null);
        a().d();
    }

    private static int b(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(a.a.a.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public b I(b.a aVar) {
        return null;
    }

    public g a() {
        if (this.f751b == null) {
            this.f751b = g.f(this, this);
        }
        return this.f751b;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().c(view, layoutParams);
    }

    /* access modifiers changed from: package-private */
    public boolean c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean d(int i) {
        return a().v(i);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return e.e(this.f752c, getWindow().getDecorView(), this, keyEvent);
    }

    public <T extends View> T findViewById(int i) {
        return a().g(i);
    }

    public void invalidateOptionsMenu() {
        a().m();
    }

    public void n(b bVar) {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        a().l();
        super.onCreate(bundle);
        a().o(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        a().u();
    }

    public void s(b bVar) {
    }

    public void setContentView(int i) {
        a().w(i);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().B(charSequence);
    }

    public void setContentView(View view) {
        a().x(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().y(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        a().B(getContext().getString(i));
    }
}
