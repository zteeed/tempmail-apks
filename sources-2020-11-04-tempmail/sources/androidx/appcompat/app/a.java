package androidx.appcompat.app;

import a.a.j;
import a.a.n.b;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: ActionBar */
public abstract class a {

    /* compiled from: ActionBar */
    public interface b {
        void a(boolean z);
    }

    @Deprecated
    /* compiled from: ActionBar */
    public static abstract class c {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public abstract void h(boolean z);

    public abstract int i();

    public abstract Context j();

    public abstract CharSequence k();

    public abstract void l();

    public boolean m() {
        return false;
    }

    public void n(Configuration configuration) {
    }

    /* access modifiers changed from: package-private */
    public void o() {
    }

    public abstract boolean p(int i, KeyEvent keyEvent);

    public boolean q(KeyEvent keyEvent) {
        return false;
    }

    public boolean r() {
        return false;
    }

    public abstract void s(boolean z);

    public abstract void t(int i);

    public abstract void u(Drawable drawable);

    public abstract void v(boolean z);

    public abstract void w(int i);

    public abstract void x(CharSequence charSequence);

    public abstract void y();

    public a.a.n.b z(b.a aVar) {
        return null;
    }

    /* renamed from: androidx.appcompat.app.a$a  reason: collision with other inner class name */
    /* compiled from: ActionBar */
    public static class C0031a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f726a;

        public C0031a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f726a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.ActionBarLayout);
            this.f726a = obtainStyledAttributes.getInt(j.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public C0031a(int i, int i2) {
            super(i, i2);
            this.f726a = 0;
            this.f726a = 8388627;
        }

        public C0031a(C0031a aVar) {
            super(aVar);
            this.f726a = 0;
            this.f726a = aVar.f726a;
        }

        public C0031a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f726a = 0;
        }
    }
}
