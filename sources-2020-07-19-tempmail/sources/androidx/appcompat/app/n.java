package androidx.appcompat.app;

import a.a.f;
import a.a.j;
import a.a.n.b;
import a.a.n.g;
import a.a.n.h;
import a.h.k.a0;
import a.h.k.t;
import a.h.k.x;
import a.h.k.y;
import a.h.k.z;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: WindowDecorActionBar */
public class n extends a implements ActionBarOverlayLayout.d {
    private static final Interpolator D = new AccelerateInterpolator();
    private static final Interpolator E = new DecelerateInterpolator();
    final y A = new a();
    final y B = new b();
    final a0 C = new c();

    /* renamed from: a  reason: collision with root package name */
    Context f786a;

    /* renamed from: b  reason: collision with root package name */
    private Context f787b;

    /* renamed from: c  reason: collision with root package name */
    private Activity f788c;

    /* renamed from: d  reason: collision with root package name */
    private Dialog f789d;

    /* renamed from: e  reason: collision with root package name */
    ActionBarOverlayLayout f790e;

    /* renamed from: f  reason: collision with root package name */
    ActionBarContainer f791f;
    androidx.appcompat.widget.n g;
    ActionBarContextView h;
    View i;
    ScrollingTabContainerView j;
    private boolean k;
    d l;
    a.a.n.b m;
    b.a n;
    private boolean o;
    private ArrayList<a.b> p = new ArrayList<>();
    private boolean q;
    private int r = 0;
    boolean s = true;
    boolean t;
    boolean u;
    private boolean v;
    private boolean w = true;
    h x;
    private boolean y;
    boolean z;

    /* compiled from: WindowDecorActionBar */
    class a extends z {
        a() {
        }

        public void b(View view) {
            View view2;
            n nVar = n.this;
            if (nVar.s && (view2 = nVar.i) != null) {
                view2.setTranslationY(0.0f);
                n.this.f791f.setTranslationY(0.0f);
            }
            n.this.f791f.setVisibility(8);
            n.this.f791f.setTransitioning(false);
            n nVar2 = n.this;
            nVar2.x = null;
            nVar2.C();
            ActionBarOverlayLayout actionBarOverlayLayout = n.this.f790e;
            if (actionBarOverlayLayout != null) {
                t.X(actionBarOverlayLayout);
            }
        }
    }

    /* compiled from: WindowDecorActionBar */
    class b extends z {
        b() {
        }

        public void b(View view) {
            n nVar = n.this;
            nVar.x = null;
            nVar.f791f.requestLayout();
        }
    }

    /* compiled from: WindowDecorActionBar */
    class c implements a0 {
        c() {
        }

        public void a(View view) {
            ((View) n.this.f791f.getParent()).invalidate();
        }
    }

    /* compiled from: WindowDecorActionBar */
    public class d extends a.a.n.b implements h.a {

        /* renamed from: d  reason: collision with root package name */
        private final Context f795d;

        /* renamed from: e  reason: collision with root package name */
        private final androidx.appcompat.view.menu.h f796e;

        /* renamed from: f  reason: collision with root package name */
        private b.a f797f;
        private WeakReference<View> g;

        public d(Context context, b.a aVar) {
            this.f795d = context;
            this.f797f = aVar;
            androidx.appcompat.view.menu.h hVar = new androidx.appcompat.view.menu.h(context);
            hVar.W(1);
            this.f796e = hVar;
            hVar.V(this);
        }

        public boolean a(androidx.appcompat.view.menu.h hVar, MenuItem menuItem) {
            b.a aVar = this.f797f;
            if (aVar != null) {
                return aVar.d(this, menuItem);
            }
            return false;
        }

        public void b(androidx.appcompat.view.menu.h hVar) {
            if (this.f797f != null) {
                k();
                n.this.h.l();
            }
        }

        public void c() {
            n nVar = n.this;
            if (nVar.l == this) {
                if (!n.B(nVar.t, nVar.u, false)) {
                    n nVar2 = n.this;
                    nVar2.m = this;
                    nVar2.n = this.f797f;
                } else {
                    this.f797f.a(this);
                }
                this.f797f = null;
                n.this.A(false);
                n.this.h.g();
                n.this.g.p().sendAccessibilityEvent(32);
                n nVar3 = n.this;
                nVar3.f790e.setHideOnContentScrollEnabled(nVar3.z);
                n.this.l = null;
            }
        }

        public View d() {
            WeakReference<View> weakReference = this.g;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        public Menu e() {
            return this.f796e;
        }

        public MenuInflater f() {
            return new g(this.f795d);
        }

        public CharSequence g() {
            return n.this.h.getSubtitle();
        }

        public CharSequence i() {
            return n.this.h.getTitle();
        }

        public void k() {
            if (n.this.l == this) {
                this.f796e.h0();
                try {
                    this.f797f.c(this, this.f796e);
                } finally {
                    this.f796e.g0();
                }
            }
        }

        public boolean l() {
            return n.this.h.j();
        }

        public void m(View view) {
            n.this.h.setCustomView(view);
            this.g = new WeakReference<>(view);
        }

        public void n(int i) {
            o(n.this.f786a.getResources().getString(i));
        }

        public void o(CharSequence charSequence) {
            n.this.h.setSubtitle(charSequence);
        }

        public void q(int i) {
            r(n.this.f786a.getResources().getString(i));
        }

        public void r(CharSequence charSequence) {
            n.this.h.setTitle(charSequence);
        }

        public void s(boolean z) {
            super.s(z);
            n.this.h.setTitleOptional(z);
        }

        public boolean t() {
            this.f796e.h0();
            try {
                return this.f797f.b(this, this.f796e);
            } finally {
                this.f796e.g0();
            }
        }
    }

    public n(Activity activity, boolean z2) {
        new ArrayList();
        this.f788c = activity;
        View decorView = activity.getWindow().getDecorView();
        I(decorView);
        if (!z2) {
            this.i = decorView.findViewById(16908290);
        }
    }

    static boolean B(boolean z2, boolean z3, boolean z4) {
        if (z4) {
            return true;
        }
        return !z2 && !z3;
    }

    private androidx.appcompat.widget.n F(View view) {
        if (view instanceof androidx.appcompat.widget.n) {
            return (androidx.appcompat.widget.n) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    private void H() {
        if (this.v) {
            this.v = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f790e;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            S(false);
        }
    }

    private void I(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(f.decor_content_parent);
        this.f790e = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.g = F(view.findViewById(f.action_bar));
        this.h = (ActionBarContextView) view.findViewById(f.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(f.action_bar_container);
        this.f791f = actionBarContainer;
        androidx.appcompat.widget.n nVar = this.g;
        if (nVar == null || this.h == null || actionBarContainer == null) {
            throw new IllegalStateException(n.class.getSimpleName() + " can only be used " + "with a compatible window decor layout");
        }
        this.f786a = nVar.getContext();
        boolean z2 = (this.g.r() & 4) != 0;
        if (z2) {
            this.k = true;
        }
        a.a.n.a b2 = a.a.n.a.b(this.f786a);
        O(b2.a() || z2);
        M(b2.g());
        TypedArray obtainStyledAttributes = this.f786a.obtainStyledAttributes((AttributeSet) null, j.ActionBar, a.a.a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(j.ActionBar_hideOnContentScroll, false)) {
            N(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            L((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private void M(boolean z2) {
        this.q = z2;
        if (!z2) {
            this.g.g((ScrollingTabContainerView) null);
            this.f791f.setTabContainer(this.j);
        } else {
            this.f791f.setTabContainer((ScrollingTabContainerView) null);
            this.g.g(this.j);
        }
        boolean z3 = true;
        boolean z4 = G() == 2;
        ScrollingTabContainerView scrollingTabContainerView = this.j;
        if (scrollingTabContainerView != null) {
            if (z4) {
                scrollingTabContainerView.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f790e;
                if (actionBarOverlayLayout != null) {
                    t.X(actionBarOverlayLayout);
                }
            } else {
                scrollingTabContainerView.setVisibility(8);
            }
        }
        this.g.w(!this.q && z4);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f790e;
        if (this.q || !z4) {
            z3 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z3);
    }

    private boolean Q() {
        return t.I(this.f791f);
    }

    private void R() {
        if (!this.v) {
            this.v = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f790e;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            S(false);
        }
    }

    private void S(boolean z2) {
        if (B(this.t, this.u, this.v)) {
            if (!this.w) {
                this.w = true;
                E(z2);
            }
        } else if (this.w) {
            this.w = false;
            D(z2);
        }
    }

    public void A(boolean z2) {
        x xVar;
        x xVar2;
        if (z2) {
            R();
        } else {
            H();
        }
        if (Q()) {
            if (z2) {
                xVar = this.g.m(4, 100);
                xVar2 = this.h.f(0, 200);
            } else {
                xVar2 = this.g.m(0, 200);
                xVar = this.h.f(8, 100);
            }
            a.a.n.h hVar = new a.a.n.h();
            hVar.d(xVar, xVar2);
            hVar.h();
        } else if (z2) {
            this.g.o(4);
            this.h.setVisibility(0);
        } else {
            this.g.o(0);
            this.h.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    public void C() {
        b.a aVar = this.n;
        if (aVar != null) {
            aVar.a(this.m);
            this.m = null;
            this.n = null;
        }
    }

    public void D(boolean z2) {
        View view;
        a.a.n.h hVar = this.x;
        if (hVar != null) {
            hVar.a();
        }
        if (this.r != 0 || (!this.y && !z2)) {
            this.A.b((View) null);
            return;
        }
        this.f791f.setAlpha(1.0f);
        this.f791f.setTransitioning(true);
        a.a.n.h hVar2 = new a.a.n.h();
        float f2 = (float) (-this.f791f.getHeight());
        if (z2) {
            int[] iArr = {0, 0};
            this.f791f.getLocationInWindow(iArr);
            f2 -= (float) iArr[1];
        }
        x b2 = t.b(this.f791f);
        b2.k(f2);
        b2.i(this.C);
        hVar2.c(b2);
        if (this.s && (view = this.i) != null) {
            x b3 = t.b(view);
            b3.k(f2);
            hVar2.c(b3);
        }
        hVar2.f(D);
        hVar2.e(250);
        hVar2.g(this.A);
        this.x = hVar2;
        hVar2.h();
    }

    public void E(boolean z2) {
        View view;
        View view2;
        a.a.n.h hVar = this.x;
        if (hVar != null) {
            hVar.a();
        }
        this.f791f.setVisibility(0);
        if (this.r != 0 || (!this.y && !z2)) {
            this.f791f.setAlpha(1.0f);
            this.f791f.setTranslationY(0.0f);
            if (this.s && (view = this.i) != null) {
                view.setTranslationY(0.0f);
            }
            this.B.b((View) null);
        } else {
            this.f791f.setTranslationY(0.0f);
            float f2 = (float) (-this.f791f.getHeight());
            if (z2) {
                int[] iArr = {0, 0};
                this.f791f.getLocationInWindow(iArr);
                f2 -= (float) iArr[1];
            }
            this.f791f.setTranslationY(f2);
            a.a.n.h hVar2 = new a.a.n.h();
            x b2 = t.b(this.f791f);
            b2.k(0.0f);
            b2.i(this.C);
            hVar2.c(b2);
            if (this.s && (view2 = this.i) != null) {
                view2.setTranslationY(f2);
                x b3 = t.b(this.i);
                b3.k(0.0f);
                hVar2.c(b3);
            }
            hVar2.f(E);
            hVar2.e(250);
            hVar2.g(this.B);
            this.x = hVar2;
            hVar2.h();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f790e;
        if (actionBarOverlayLayout != null) {
            t.X(actionBarOverlayLayout);
        }
    }

    public int G() {
        return this.g.l();
    }

    public void J(boolean z2) {
        K(z2 ? 4 : 0, 4);
    }

    public void K(int i2, int i3) {
        int r2 = this.g.r();
        if ((i3 & 4) != 0) {
            this.k = true;
        }
        this.g.i((i2 & i3) | ((~i3) & r2));
    }

    public void L(float f2) {
        t.f0(this.f791f, f2);
    }

    public void N(boolean z2) {
        if (!z2 || this.f790e.u()) {
            this.z = z2;
            this.f790e.setHideOnContentScrollEnabled(z2);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    public void O(boolean z2) {
        this.g.q(z2);
    }

    public void P(CharSequence charSequence) {
        this.g.setTitle(charSequence);
    }

    public void a() {
        if (this.u) {
            this.u = false;
            S(true);
        }
    }

    public void b() {
    }

    public void c(boolean z2) {
        this.s = z2;
    }

    public void d() {
        if (!this.u) {
            this.u = true;
            S(true);
        }
    }

    public void e() {
        a.a.n.h hVar = this.x;
        if (hVar != null) {
            hVar.a();
            this.x = null;
        }
    }

    public boolean g() {
        androidx.appcompat.widget.n nVar = this.g;
        if (nVar == null || !nVar.h()) {
            return false;
        }
        this.g.collapseActionView();
        return true;
    }

    public void h(boolean z2) {
        if (z2 != this.o) {
            this.o = z2;
            int size = this.p.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.p.get(i2).a(z2);
            }
        }
    }

    public int i() {
        return this.g.r();
    }

    public Context j() {
        if (this.f787b == null) {
            TypedValue typedValue = new TypedValue();
            this.f786a.getTheme().resolveAttribute(a.a.a.actionBarWidgetTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.f787b = new ContextThemeWrapper(this.f786a, i2);
            } else {
                this.f787b = this.f786a;
            }
        }
        return this.f787b;
    }

    public CharSequence k() {
        return this.g.getTitle();
    }

    public void l() {
        if (!this.t) {
            this.t = true;
            S(false);
        }
    }

    public void n(Configuration configuration) {
        M(a.a.n.a.b(this.f786a).g());
    }

    public void onWindowVisibilityChanged(int i2) {
        this.r = i2;
    }

    public boolean p(int i2, KeyEvent keyEvent) {
        Menu e2;
        d dVar = this.l;
        if (dVar == null || (e2 = dVar.e()) == null) {
            return false;
        }
        boolean z2 = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z2 = false;
        }
        e2.setQwertyMode(z2);
        return e2.performShortcut(i2, keyEvent, 0);
    }

    public void s(boolean z2) {
        if (!this.k) {
            J(z2);
        }
    }

    public void t(int i2) {
        this.g.s(i2);
    }

    public void u(Drawable drawable) {
        this.g.v(drawable);
    }

    public void v(boolean z2) {
        a.a.n.h hVar;
        this.y = z2;
        if (!z2 && (hVar = this.x) != null) {
            hVar.a();
        }
    }

    public void w(int i2) {
        P(this.f786a.getString(i2));
    }

    public void x(CharSequence charSequence) {
        this.g.setWindowTitle(charSequence);
    }

    public void y() {
        if (this.t) {
            this.t = false;
            S(false);
        }
    }

    public a.a.n.b z(b.a aVar) {
        d dVar = this.l;
        if (dVar != null) {
            dVar.c();
        }
        this.f790e.setHideOnContentScrollEnabled(false);
        this.h.k();
        d dVar2 = new d(this.h.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.l = dVar2;
        dVar2.k();
        this.h.h(dVar2);
        A(true);
        this.h.sendAccessibilityEvent(32);
        return dVar2;
    }

    public n(Dialog dialog) {
        new ArrayList();
        this.f789d = dialog;
        I(dialog.getWindow().getDecorView());
    }
}
