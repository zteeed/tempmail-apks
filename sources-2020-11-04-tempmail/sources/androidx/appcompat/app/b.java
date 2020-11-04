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
    private final C0032b f727a;

    /* renamed from: b  reason: collision with root package name */
    private final DrawerLayout f728b;

    /* renamed from: c  reason: collision with root package name */
    private a.a.l.a.d f729c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f730d;

    /* renamed from: e  reason: collision with root package name */
    boolean f731e;

    /* renamed from: f  reason: collision with root package name */
    private final int f732f;
    private final int g;
    View.OnClickListener h;
    private boolean i;

    /* compiled from: ActionBarDrawerToggle */
    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            b bVar = b.this;
            if (bVar.f731e) {
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
        C0032b n();
    }

    /* compiled from: ActionBarDrawerToggle */
    private static class d implements C0032b {

        /* renamed from: a  reason: collision with root package name */
        private final Activity f734a;

        /* renamed from: b  reason: collision with root package name */
        private c.a f735b;

        d(Activity activity) {
            this.f734a = activity;
        }

        public boolean a() {
            ActionBar actionBar = this.f734a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        public Context b() {
            ActionBar actionBar = this.f734a.getActionBar();
            if (actionBar != null) {
                return actionBar.getThemedContext();
            }
            return this.f734a;
        }

        public void c(Drawable drawable, int i) {
            ActionBar actionBar = this.f734a.getActionBar();
            if (actionBar == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 18) {
                actionBar.setHomeAsUpIndicator(drawable);
                actionBar.setHomeActionContentDescription(i);
                return;
            }
            actionBar.setDisplayShowHomeEnabled(true);
            this.f735b = c.c(this.f735b, this.f734a, drawable, i);
            actionBar.setDisplayShowHomeEnabled(false);
        }

        public Drawable d() {
            if (Build.VERSION.SDK_INT < 18) {
                return c.a(this.f734a);
            }
            TypedArray obtainStyledAttributes = b().obtainStyledAttributes((AttributeSet) null, new int[]{16843531}, 16843470, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }

        public void e(int i) {
            if (Build.VERSION.SDK_INT >= 18) {
                ActionBar actionBar = this.f734a.getActionBar();
                if (actionBar != null) {
                    actionBar.setHomeActionContentDescription(i);
                    return;
                }
                return;
            }
            this.f735b = c.b(this.f735b, this.f734a, i);
        }
    }

    /* compiled from: ActionBarDrawerToggle */
    static class e implements C0032b {

        /* renamed from: a  reason: collision with root package name */
        final Toolbar f736a;

        /* renamed from: b  reason: collision with root package name */
        final Drawable f737b;

        /* renamed from: c  reason: collision with root package name */
        final CharSequence f738c;

        e(Toolbar toolbar) {
            this.f736a = toolbar;
            this.f737b = toolbar.getNavigationIcon();
            this.f738c = toolbar.getNavigationContentDescription();
        }

        public boolean a() {
            return true;
        }

        public Context b() {
            return this.f736a.getContext();
        }

        public void c(Drawable drawable, int i) {
            this.f736a.setNavigationIcon(drawable);
            e(i);
        }

        public Drawable d() {
            return this.f737b;
        }

        public void e(int i) {
            if (i == 0) {
                this.f736a.setNavigationContentDescription(this.f738c);
            } else {
                this.f736a.setNavigationContentDescription(i);
            }
        }
    }

    public b(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, int i2, int i3) {
        this(activity, toolbar, drawerLayout, (a.a.l.a.d) null, i2, i3);
    }

    private void h(float f2) {
        if (f2 == 1.0f) {
            this.f729c.g(true);
        } else if (f2 == 0.0f) {
            this.f729c.g(false);
        }
        this.f729c.e(f2);
    }

    public void a(View view) {
        h(1.0f);
        if (this.f731e) {
            f(this.g);
        }
    }

    public void b(View view) {
        h(0.0f);
        if (this.f731e) {
            f(this.f732f);
        }
    }

    public void c(int i2) {
    }

    public void d(View view, float f2) {
        if (this.f730d) {
            h(Math.min(1.0f, Math.max(0.0f, f2)));
        } else {
            h(0.0f);
        }
    }

    /* access modifiers changed from: package-private */
    public Drawable e() {
        return this.f727a.d();
    }

    /* access modifiers changed from: package-private */
    public void f(int i2) {
        this.f727a.e(i2);
    }

    /* access modifiers changed from: package-private */
    public void g(Drawable drawable, int i2) {
        if (!this.i && !this.f727a.a()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.i = true;
        }
        this.f727a.c(drawable, i2);
    }

    public void i() {
        if (this.f728b.C(8388611)) {
            h(1.0f);
        } else {
            h(0.0f);
        }
        if (this.f731e) {
            g(this.f729c, this.f728b.C(8388611) ? this.g : this.f732f);
        }
    }

    /* access modifiers changed from: package-private */
    public void j() {
        int q = this.f728b.q(8388611);
        if (this.f728b.F(8388611) && q != 2) {
            this.f728b.d(8388611);
        } else if (q != 1) {
            this.f728b.K(8388611);
        }
    }

    b(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, a.a.l.a.d dVar, int i2, int i3) {
        this.f730d = true;
        this.f731e = true;
        this.i = false;
        if (toolbar != null) {
            this.f727a = new e(toolbar);
            toolbar.setNavigationOnClickListener(new a());
        } else if (activity instanceof c) {
            this.f727a = ((c) activity).n();
        } else {
            this.f727a = new d(activity);
        }
        this.f728b = drawerLayout;
        this.f732f = i2;
        this.g = i3;
        if (dVar == null) {
            this.f729c = new a.a.l.a.d(this.f727a.b());
        } else {
            this.f729c = dVar;
        }
        e();
    }
}
