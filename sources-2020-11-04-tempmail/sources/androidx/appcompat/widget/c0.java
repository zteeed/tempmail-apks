package androidx.appcompat.widget;

import a.a.e;
import a.a.f;
import a.a.h;
import a.a.j;
import a.h.k.a0;
import a.h.k.u;
import a.h.k.y;
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
    Toolbar f1098a;

    /* renamed from: b  reason: collision with root package name */
    private int f1099b;

    /* renamed from: c  reason: collision with root package name */
    private View f1100c;

    /* renamed from: d  reason: collision with root package name */
    private View f1101d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f1102e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f1103f;
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
        final androidx.appcompat.view.menu.a f1104b = new androidx.appcompat.view.menu.a(c0.this.f1098a.getContext(), 0, 16908332, 0, 0, c0.this.i);

        a() {
        }

        public void onClick(View view) {
            c0 c0Var = c0.this;
            Window.Callback callback = c0Var.l;
            if (callback != null && c0Var.m) {
                callback.onMenuItemSelected(0, this.f1104b);
            }
        }
    }

    /* compiled from: ToolbarWidgetWrapper */
    class b extends a0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f1106a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1107b;

        b(int i) {
            this.f1107b = i;
        }

        public void a(View view) {
            this.f1106a = true;
        }

        public void b(View view) {
            if (!this.f1106a) {
                c0.this.f1098a.setVisibility(this.f1107b);
            }
        }

        public void c(View view) {
            c0.this.f1098a.setVisibility(0);
        }
    }

    public c0(Toolbar toolbar, boolean z) {
        this(toolbar, z, h.abc_action_bar_up_description, e.abc_ic_ab_back_material);
    }

    private void D(CharSequence charSequence) {
        this.i = charSequence;
        if ((this.f1099b & 8) != 0) {
            this.f1098a.setTitle(charSequence);
        }
    }

    private void E() {
        if ((this.f1099b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.k)) {
            this.f1098a.setNavigationContentDescription(this.p);
        } else {
            this.f1098a.setNavigationContentDescription(this.k);
        }
    }

    private void F() {
        if ((this.f1099b & 4) != 0) {
            Toolbar toolbar = this.f1098a;
            Drawable drawable = this.g;
            if (drawable == null) {
                drawable = this.q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f1098a.setNavigationIcon((Drawable) null);
    }

    private void G() {
        Drawable drawable;
        int i2 = this.f1099b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) != 0) {
            drawable = this.f1103f;
            if (drawable == null) {
                drawable = this.f1102e;
            }
        } else {
            drawable = this.f1102e;
        }
        this.f1098a.setLogo(drawable);
    }

    private int x() {
        if (this.f1098a.getNavigationIcon() == null) {
            return 11;
        }
        this.q = this.f1098a.getNavigationIcon();
        return 15;
    }

    public void A(Drawable drawable) {
        this.f1103f = drawable;
        G();
    }

    public void B(CharSequence charSequence) {
        this.k = charSequence;
        E();
    }

    public void C(CharSequence charSequence) {
        this.j = charSequence;
        if ((this.f1099b & 8) != 0) {
            this.f1098a.setSubtitle(charSequence);
        }
    }

    public boolean a() {
        return this.f1098a.z();
    }

    public boolean b() {
        return this.f1098a.d();
    }

    public boolean c() {
        return this.f1098a.y();
    }

    public void collapseActionView() {
        this.f1098a.e();
    }

    public boolean d() {
        return this.f1098a.w();
    }

    public boolean e() {
        return this.f1098a.I();
    }

    public void f() {
        this.f1098a.f();
    }

    public void g(ScrollingTabContainerView scrollingTabContainerView) {
        Toolbar toolbar;
        View view = this.f1100c;
        if (view != null && view.getParent() == (toolbar = this.f1098a)) {
            toolbar.removeView(this.f1100c);
        }
        this.f1100c = scrollingTabContainerView;
        if (scrollingTabContainerView != null && this.o == 2) {
            this.f1098a.addView(scrollingTabContainerView, 0);
            Toolbar.e eVar = (Toolbar.e) this.f1100c.getLayoutParams();
            eVar.width = -2;
            eVar.height = -2;
            eVar.f726a = 8388691;
            scrollingTabContainerView.setAllowCollapse(true);
        }
    }

    public Context getContext() {
        return this.f1098a.getContext();
    }

    public CharSequence getTitle() {
        return this.f1098a.getTitle();
    }

    public boolean h() {
        return this.f1098a.v();
    }

    public void i(int i2) {
        View view;
        int i3 = this.f1099b ^ i2;
        this.f1099b = i2;
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
                    this.f1098a.setTitle(this.i);
                    this.f1098a.setSubtitle(this.j);
                } else {
                    this.f1098a.setTitle((CharSequence) null);
                    this.f1098a.setSubtitle((CharSequence) null);
                }
            }
            if ((i3 & 16) != 0 && (view = this.f1101d) != null) {
                if ((i2 & 16) != 0) {
                    this.f1098a.addView(view);
                } else {
                    this.f1098a.removeView(view);
                }
            }
        }
    }

    public Menu j() {
        return this.f1098a.getMenu();
    }

    public void k(int i2) {
        A(i2 != 0 ? a.a.k.a.a.d(getContext(), i2) : null);
    }

    public int l() {
        return this.o;
    }

    public y m(int i2, long j2) {
        y b2 = u.b(this.f1098a);
        b2.a(i2 == 0 ? 1.0f : 0.0f);
        b2.d(j2);
        b2.f(new b(i2));
        return b2;
    }

    public void n(o.a aVar, h.a aVar2) {
        this.f1098a.setMenuCallbacks(aVar, aVar2);
    }

    public void o(int i2) {
        this.f1098a.setVisibility(i2);
    }

    public ViewGroup p() {
        return this.f1098a;
    }

    public void q(boolean z) {
    }

    public int r() {
        return this.f1099b;
    }

    public void s(int i2) {
        B(i2 == 0 ? null : getContext().getString(i2));
    }

    public void setIcon(int i2) {
        setIcon(i2 != 0 ? a.a.k.a.a.d(getContext(), i2) : null);
    }

    public void setMenu(Menu menu, o.a aVar) {
        if (this.n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f1098a.getContext());
            this.n = actionMenuPresenter;
            actionMenuPresenter.t(f.action_menu_presenter);
        }
        this.n.m(aVar);
        this.f1098a.setMenu((androidx.appcompat.view.menu.h) menu, this.n);
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
        this.f1098a.setCollapsible(z);
    }

    public void y(View view) {
        View view2 = this.f1101d;
        if (!(view2 == null || (this.f1099b & 16) == 0)) {
            this.f1098a.removeView(view2);
        }
        this.f1101d = view;
        if (view != null && (this.f1099b & 16) != 0) {
            this.f1098a.addView(view);
        }
    }

    public void z(int i2) {
        if (i2 != this.p) {
            this.p = i2;
            if (TextUtils.isEmpty(this.f1098a.getNavigationContentDescription())) {
                s(this.p);
            }
        }
    }

    public c0(Toolbar toolbar, boolean z, int i2, int i3) {
        Drawable drawable;
        this.o = 0;
        this.p = 0;
        this.f1098a = toolbar;
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
                y(LayoutInflater.from(this.f1098a.getContext()).inflate(n2, this.f1098a, false));
                i(this.f1099b | 16);
            }
            int m2 = u.m(j.ActionBar_height, 0);
            if (m2 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1098a.getLayoutParams();
                layoutParams.height = m2;
                this.f1098a.setLayoutParams(layoutParams);
            }
            int e2 = u.e(j.ActionBar_contentInsetStart, -1);
            int e3 = u.e(j.ActionBar_contentInsetEnd, -1);
            if (e2 >= 0 || e3 >= 0) {
                this.f1098a.setContentInsetsRelative(Math.max(e2, 0), Math.max(e3, 0));
            }
            int n3 = u.n(j.ActionBar_titleTextStyle, 0);
            if (n3 != 0) {
                Toolbar toolbar2 = this.f1098a;
                toolbar2.setTitleTextAppearance(toolbar2.getContext(), n3);
            }
            int n4 = u.n(j.ActionBar_subtitleTextStyle, 0);
            if (n4 != 0) {
                Toolbar toolbar3 = this.f1098a;
                toolbar3.setSubtitleTextAppearance(toolbar3.getContext(), n4);
            }
            int n5 = u.n(j.ActionBar_popupTheme, 0);
            if (n5 != 0) {
                this.f1098a.setPopupTheme(n5);
            }
        } else {
            this.f1099b = x();
        }
        u.v();
        z(i2);
        this.k = this.f1098a.getNavigationContentDescription();
        this.f1098a.setNavigationOnClickListener(new a());
    }

    public void setIcon(Drawable drawable) {
        this.f1102e = drawable;
        G();
    }
}
