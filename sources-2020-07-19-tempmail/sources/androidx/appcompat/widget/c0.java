package androidx.appcompat.widget;

import a.a.e;
import a.a.f;
import a.a.h;
import a.a.j;
import a.h.k.t;
import a.h.k.x;
import a.h.k.z;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.Toolbar;

/* compiled from: ToolbarWidgetWrapper */
public class c0 implements n {

    /* renamed from: a  reason: collision with root package name */
    Toolbar f1071a;

    /* renamed from: b  reason: collision with root package name */
    private int f1072b;

    /* renamed from: c  reason: collision with root package name */
    private View f1073c;

    /* renamed from: d  reason: collision with root package name */
    private View f1074d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f1075e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f1076f;
    private Drawable g;
    private boolean h;
    CharSequence i;
    private CharSequence j;
    private CharSequence k;
    Window.Callback l;
    boolean m;
    private ActionMenuPresenter n;
    private int o;
    private int p;
    private Drawable q;

    /* compiled from: ToolbarWidgetWrapper */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final androidx.appcompat.view.menu.a f1077b = new androidx.appcompat.view.menu.a(c0.this.f1071a.getContext(), 0, 16908332, 0, 0, c0.this.i);

        a() {
        }

        public void onClick(View view) {
            c0 c0Var = c0.this;
            Window.Callback callback = c0Var.l;
            if (callback != null && c0Var.m) {
                callback.onMenuItemSelected(0, this.f1077b);
            }
        }
    }

    /* compiled from: ToolbarWidgetWrapper */
    class b extends z {

        /* renamed from: a  reason: collision with root package name */
        private boolean f1079a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1080b;

        b(int i) {
            this.f1080b = i;
        }

        public void a(View view) {
            this.f1079a = true;
        }

        public void b(View view) {
            if (!this.f1079a) {
                c0.this.f1071a.setVisibility(this.f1080b);
            }
        }

        public void c(View view) {
            c0.this.f1071a.setVisibility(0);
        }
    }

    public c0(Toolbar toolbar, boolean z) {
        this(toolbar, z, h.abc_action_bar_up_description, e.abc_ic_ab_back_material);
    }

    private void D(CharSequence charSequence) {
        this.i = charSequence;
        if ((this.f1072b & 8) != 0) {
            this.f1071a.setTitle(charSequence);
        }
    }

    private void E() {
        if ((this.f1072b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.k)) {
            this.f1071a.setNavigationContentDescription(this.p);
        } else {
            this.f1071a.setNavigationContentDescription(this.k);
        }
    }

    private void F() {
        if ((this.f1072b & 4) != 0) {
            Toolbar toolbar = this.f1071a;
            Drawable drawable = this.g;
            if (drawable == null) {
                drawable = this.q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f1071a.setNavigationIcon((Drawable) null);
    }

    private void G() {
        Drawable drawable;
        int i2 = this.f1072b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) != 0) {
            drawable = this.f1076f;
            if (drawable == null) {
                drawable = this.f1075e;
            }
        } else {
            drawable = this.f1075e;
        }
        this.f1071a.setLogo(drawable);
    }

    private int x() {
        if (this.f1071a.getNavigationIcon() == null) {
            return 11;
        }
        this.q = this.f1071a.getNavigationIcon();
        return 15;
    }

    public void A(Drawable drawable) {
        this.f1076f = drawable;
        G();
    }

    public void B(CharSequence charSequence) {
        this.k = charSequence;
        E();
    }

    public void C(CharSequence charSequence) {
        this.j = charSequence;
        if ((this.f1072b & 8) != 0) {
            this.f1071a.setSubtitle(charSequence);
        }
    }

    public boolean a() {
        return this.f1071a.z();
    }

    public boolean b() {
        return this.f1071a.d();
    }

    public boolean c() {
        return this.f1071a.y();
    }

    public void collapseActionView() {
        this.f1071a.e();
    }

    public boolean d() {
        return this.f1071a.w();
    }

    public boolean e() {
        return this.f1071a.I();
    }

    public void f() {
        this.f1071a.f();
    }

    public void g(ScrollingTabContainerView scrollingTabContainerView) {
        Toolbar toolbar;
        View view = this.f1073c;
        if (view != null && view.getParent() == (toolbar = this.f1071a)) {
            toolbar.removeView(this.f1073c);
        }
        this.f1073c = scrollingTabContainerView;
        if (scrollingTabContainerView != null && this.o == 2) {
            this.f1071a.addView(scrollingTabContainerView, 0);
            Toolbar.e eVar = (Toolbar.e) this.f1073c.getLayoutParams();
            eVar.width = -2;
            eVar.height = -2;
            eVar.f699a = 8388691;
            scrollingTabContainerView.setAllowCollapse(true);
        }
    }

    public Context getContext() {
        return this.f1071a.getContext();
    }

    public CharSequence getTitle() {
        return this.f1071a.getTitle();
    }

    public boolean h() {
        return this.f1071a.v();
    }

    public void i(int i2) {
        View view;
        int i3 = this.f1072b ^ i2;
        this.f1072b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    E();
                }
                F();
            }
            if ((i3 & 3) != 0) {
                G();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    this.f1071a.setTitle(this.i);
                    this.f1071a.setSubtitle(this.j);
                } else {
                    this.f1071a.setTitle((CharSequence) null);
                    this.f1071a.setSubtitle((CharSequence) null);
                }
            }
            if ((i3 & 16) != 0 && (view = this.f1074d) != null) {
                if ((i2 & 16) != 0) {
                    this.f1071a.addView(view);
                } else {
                    this.f1071a.removeView(view);
                }
            }
        }
    }

    public Menu j() {
        return this.f1071a.getMenu();
    }

    public void k(int i2) {
        A(i2 != 0 ? a.a.k.a.a.d(getContext(), i2) : null);
    }

    public int l() {
        return this.o;
    }

    public x m(int i2, long j2) {
        x b2 = t.b(this.f1071a);
        b2.a(i2 == 0 ? 1.0f : 0.0f);
        b2.d(j2);
        b2.f(new b(i2));
        return b2;
    }

    public void n(o.a aVar, h.a aVar2) {
        this.f1071a.setMenuCallbacks(aVar, aVar2);
    }

    public void o(int i2) {
        this.f1071a.setVisibility(i2);
    }

    public ViewGroup p() {
        return this.f1071a;
    }

    public void q(boolean z) {
    }

    public int r() {
        return this.f1072b;
    }

    public void s(int i2) {
        B(i2 == 0 ? null : getContext().getString(i2));
    }

    public void setIcon(int i2) {
        setIcon(i2 != 0 ? a.a.k.a.a.d(getContext(), i2) : null);
    }

    public void setMenu(Menu menu, o.a aVar) {
        if (this.n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f1071a.getContext());
            this.n = actionMenuPresenter;
            actionMenuPresenter.t(f.action_menu_presenter);
        }
        this.n.l(aVar);
        this.f1071a.setMenu((androidx.appcompat.view.menu.h) menu, this.n);
    }

    public void setMenuPrepared() {
        this.m = true;
    }

    public void setTitle(CharSequence charSequence) {
        this.h = true;
        D(charSequence);
    }

    public void setWindowCallback(Window.Callback callback) {
        this.l = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.h) {
            D(charSequence);
        }
    }

    public void t() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void u() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void v(Drawable drawable) {
        this.g = drawable;
        F();
    }

    public void w(boolean z) {
        this.f1071a.setCollapsible(z);
    }

    public void y(View view) {
        View view2 = this.f1074d;
        if (!(view2 == null || (this.f1072b & 16) == 0)) {
            this.f1071a.removeView(view2);
        }
        this.f1074d = view;
        if (view != null && (this.f1072b & 16) != 0) {
            this.f1071a.addView(view);
        }
    }

    public void z(int i2) {
        if (i2 != this.p) {
            this.p = i2;
            if (TextUtils.isEmpty(this.f1071a.getNavigationContentDescription())) {
                s(this.p);
            }
        }
    }

    public c0(Toolbar toolbar, boolean z, int i2, int i3) {
        Drawable drawable;
        this.o = 0;
        this.p = 0;
        this.f1071a = toolbar;
        this.i = toolbar.getTitle();
        this.j = toolbar.getSubtitle();
        this.h = this.i != null;
        this.g = toolbar.getNavigationIcon();
        b0 u = b0.u(toolbar.getContext(), (AttributeSet) null, j.ActionBar, a.a.a.actionBarStyle, 0);
        this.q = u.g(j.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence p2 = u.p(j.ActionBar_title);
            if (!TextUtils.isEmpty(p2)) {
                setTitle(p2);
            }
            CharSequence p3 = u.p(j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(p3)) {
                C(p3);
            }
            Drawable g2 = u.g(j.ActionBar_logo);
            if (g2 != null) {
                A(g2);
            }
            Drawable g3 = u.g(j.ActionBar_icon);
            if (g3 != null) {
                setIcon(g3);
            }
            if (this.g == null && (drawable = this.q) != null) {
                v(drawable);
            }
            i(u.k(j.ActionBar_displayOptions, 0));
            int n2 = u.n(j.ActionBar_customNavigationLayout, 0);
            if (n2 != 0) {
                y(LayoutInflater.from(this.f1071a.getContext()).inflate(n2, this.f1071a, false));
                i(this.f1072b | 16);
            }
            int m2 = u.m(j.ActionBar_height, 0);
            if (m2 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1071a.getLayoutParams();
                layoutParams.height = m2;
                this.f1071a.setLayoutParams(layoutParams);
            }
            int e2 = u.e(j.ActionBar_contentInsetStart, -1);
            int e3 = u.e(j.ActionBar_contentInsetEnd, -1);
            if (e2 >= 0 || e3 >= 0) {
                this.f1071a.setContentInsetsRelative(Math.max(e2, 0), Math.max(e3, 0));
            }
            int n3 = u.n(j.ActionBar_titleTextStyle, 0);
            if (n3 != 0) {
                Toolbar toolbar2 = this.f1071a;
                toolbar2.setTitleTextAppearance(toolbar2.getContext(), n3);
            }
            int n4 = u.n(j.ActionBar_subtitleTextStyle, 0);
            if (n4 != 0) {
                Toolbar toolbar3 = this.f1071a;
                toolbar3.setSubtitleTextAppearance(toolbar3.getContext(), n4);
            }
            int n5 = u.n(j.ActionBar_popupTheme, 0);
            if (n5 != 0) {
                this.f1071a.setPopupTheme(n5);
            }
        } else {
            this.f1072b = x();
        }
        u.v();
        z(i2);
        this.k = this.f1071a.getNavigationContentDescription();
        this.f1071a.setNavigationOnClickListener(new a());
    }

    public void setIcon(Drawable drawable) {
        this.f1075e = drawable;
        G();
    }
}
