package androidx.appcompat.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

/* compiled from: ActionBarDrawerToggle */
public class b implements DrawerLayout.d {

    /* renamed from: a  reason: collision with root package name */
    private final C0032b f700a;

    /* renamed from: b  reason: collision with root package name */
    private final DrawerLayout f701b;

    /* renamed from: c  reason: collision with root package name */
    private a.a.l.a.d f702c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f703d;

    /* renamed from: e  reason: collision with root package name */
    boolean f704e;

    /* renamed from: f  reason: collision with root package name */
    private final int f705f;
    private final int g;
    View.OnClickListener h;
    private boolean i;

    /* compiled from: ActionBarDrawerToggle */
    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            b bVar = b.this;
            if (bVar.f704e) {
                bVar.j();
                return;
            }
            View.OnClickListener onClickListener = bVar.h;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.b$b  reason: collision with other inner class name */
    /* compiled from: ActionBarDrawerToggle */
    public interface C0032b {
        boolean a();

        Context b();

        void c(Drawable drawable, int i);

        Drawable d();

        void e(int i);
    }

    /* compiled from: ActionBarDrawerToggle */
    public interface c {
        C0032b o();
    }

    /* compiled from: ActionBarDrawerToggle */
    private static class d implements C0032b {

        /* renamed from: a  reason: collision with root package name */
        private final Activity f707a;

        /* renamed from: b  reason: collision with root package name */
        private c.a f708b;

        d(Activity activity) {
            this.f707a = activity;
        }

        public boolean a() {
            ActionBar actionBar = this.f707a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        public Context b() {
            ActionBar actionBar = this.f707a.getActionBar();
            if (actionBar != null) {
                return actionBar.getThemedContext();
            }
            return this.f707a;
        }

        public void c(Drawable drawable, int i) {
            ActionBar actionBar = this.f707a.getActionBar();
            if (actionBar == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 18) {
                actionBar.setHomeAsUpIndicator(drawable);
                actionBar.setHomeActionContentDescription(i);
                return;
            }
            actionBar.setDisplayShowHomeEnabled(true);
            this.f708b = c.c(this.f708b, this.f707a, drawable, i);
            actionBar.setDisplayShowHomeEnabled(false);
        }

        public Drawable d() {
            if (Build.VERSION.SDK_INT < 18) {
                return c.a(this.f707a);
            }
            TypedArray obtainStyledAttributes = b().obtainStyledAttributes((AttributeSet) null, new int[]{16843531}, 16843470, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }

        public void e(int i) {
            if (Build.VERSION.SDK_INT >= 18) {
                ActionBar actionBar = this.f707a.getActionBar();
                if (actionBar != null) {
                    actionBar.setHomeActionContentDescription(i);
                    return;
                }
                return;
            }
            this.f708b = c.b(this.f708b, this.f707a, i);
        }
    }

    /* compiled from: ActionBarDrawerToggle */
    static class e implements C0032b {

        /* renamed from: a  reason: collision with root package name */
        final Toolbar f709a;

        /* renamed from: b  reason: collision with root package name */
        final Drawable f710b;

        /* renamed from: c  reason: collision with root package name */
        final CharSequence f711c;

        e(Toolbar toolbar) {
            this.f709a = toolbar;
            this.f710b = toolbar.getNavigationIcon();
            this.f711c = toolbar.getNavigationContentDescription();
        }

        public boolean a() {
            return true;
        }

        public Context b() {
            return this.f709a.getContext();
        }

        public void c(Drawable drawable, int i) {
            this.f709a.setNavigationIcon(drawable);
            e(i);
        }

        public Drawable d() {
            return this.f710b;
        }

        public void e(int i) {
            if (i == 0) {
                this.f709a.setNavigationContentDescription(this.f711c);
            } else {
                this.f709a.setNavigationContentDescription(i);
            }
        }
    }

    public b(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, int i2, int i3) {
        this(activity, toolbar, drawerLayout, (a.a.l.a.d) null, i2, i3);
    }

    private void h(float f2) {
        if (f2 == 1.0f) {
            this.f702c.g(true);
        } else if (f2 == 0.0f) {
            this.f702c.g(false);
        }
        this.f702c.e(f2);
    }

    public void a(View view) {
        h(1.0f);
        if (this.f704e) {
            f(this.g);
        }
    }

    public void b(View view) {
        h(0.0f);
        if (this.f704e) {
            f(this.f705f);
        }
    }

    public void c(int i2) {
    }

    public void d(View view, float f2) {
        if (this.f703d) {
            h(Math.min(1.0f, Math.max(0.0f, f2)));
        } else {
            h(0.0f);
        }
    }

    /* access modifiers changed from: package-private */
    public Drawable e() {
        return this.f700a.d();
    }

    /* access modifiers changed from: package-private */
    public void f(int i2) {
        this.f700a.e(i2);
    }

    /* access modifiers changed from: package-private */
    public void g(Drawable drawable, int i2) {
        if (!this.i && !this.f700a.a()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.i = true;
        }
        this.f700a.c(drawable, i2);
    }

    public void i() {
        if (this.f701b.C(8388611)) {
            h(1.0f);
        } else {
            h(0.0f);
        }
        if (this.f704e) {
            g(this.f702c, this.f701b.C(8388611) ? this.g : this.f705f);
        }
    }

    /* access modifiers changed from: package-private */
    public void j() {
        int q = this.f701b.q(8388611);
        if (this.f701b.F(8388611) && q != 2) {
            this.f701b.d(8388611);
        } else if (q != 1) {
            this.f701b.K(8388611);
        }
    }

    b(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, a.a.l.a.d dVar, int i2, int i3) {
        this.f703d = true;
        this.f704e = true;
        this.i = false;
        if (toolbar != null) {
            this.f700a = new e(toolbar);
            toolbar.setNavigationOnClickListener(new a());
        } else if (activity instanceof c) {
            this.f700a = ((c) activity).o();
        } else {
            this.f700a = new d(activity);
        }
        this.f701b = drawerLayout;
        this.f705f = i2;
        this.g = i3;
        if (dVar == null) {
            this.f702c = new a.a.l.a.d(this.f700a.b());
        } else {
            this.f702c = dVar;
        }
        e();
    }
}
