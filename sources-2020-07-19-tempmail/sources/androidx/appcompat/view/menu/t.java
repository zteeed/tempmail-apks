package androidx.appcompat.view.menu;

import a.a.d;
import a.a.g;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.MenuPopupWindow;

/* compiled from: StandardMenuPopup */
final class t extends m implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, o, View.OnKeyListener {
    private static final int w = g.abc_popup_menu_item_layout;

    /* renamed from: c  reason: collision with root package name */
    private final Context f881c;

    /* renamed from: d  reason: collision with root package name */
    private final h f882d;

    /* renamed from: e  reason: collision with root package name */
    private final g f883e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f884f;
    private final int g;
    private final int h;
    private final int i;
    final MenuPopupWindow j;
    final ViewTreeObserver.OnGlobalLayoutListener k = new a();
    private final View.OnAttachStateChangeListener l = new b();
    private PopupWindow.OnDismissListener m;
    private View n;
    View o;
    private o.a p;
    ViewTreeObserver q;
    private boolean r;
    private boolean s;
    private int t;
    private int u = 0;
    private boolean v;

    /* compiled from: StandardMenuPopup */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        public void onGlobalLayout() {
            if (t.this.b() && !t.this.j.o()) {
                View view = t.this.o;
                if (view == null || !view.isShown()) {
                    t.this.dismiss();
                } else {
                    t.this.j.show();
                }
            }
        }
    }

    /* compiled from: StandardMenuPopup */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = t.this.q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    t.this.q = view.getViewTreeObserver();
                }
                t tVar = t.this;
                tVar.q.removeGlobalOnLayoutListener(tVar.k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public t(Context context, h hVar, View view, int i2, int i3, boolean z) {
        this.f881c = context;
        this.f882d = hVar;
        this.f884f = z;
        this.f883e = new g(hVar, LayoutInflater.from(context), this.f884f, w);
        this.h = i2;
        this.i = i3;
        Resources resources = context.getResources();
        this.g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(d.abc_config_prefDialogWidth));
        this.n = view;
        this.j = new MenuPopupWindow(this.f881c, (AttributeSet) null, this.h, this.i);
        hVar.c(this, context);
    }

    private boolean B() {
        View view;
        if (b()) {
            return true;
        }
        if (this.r || (view = this.n) == null) {
            return false;
        }
        this.o = view;
        this.j.A(this);
        this.j.B(this);
        this.j.z(true);
        View view2 = this.o;
        boolean z = this.q == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.q = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.k);
        }
        view2.addOnAttachStateChangeListener(this.l);
        this.j.r(view2);
        this.j.v(this.u);
        if (!this.s) {
            this.t = m.q(this.f883e, (ViewGroup) null, this.f881c, this.g);
            this.s = true;
        }
        this.j.u(this.t);
        this.j.y(2);
        this.j.w(f());
        this.j.show();
        ListView d2 = this.j.d();
        d2.setOnKeyListener(this);
        if (this.v && this.f882d.z() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f881c).inflate(g.abc_popup_menu_header_item_layout, d2, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f882d.z());
            }
            frameLayout.setEnabled(false);
            d2.addHeaderView(frameLayout, (Object) null, false);
        }
        this.j.q(this.f883e);
        this.j.show();
        return true;
    }

    public void a(h hVar, boolean z) {
        if (hVar == this.f882d) {
            dismiss();
            o.a aVar = this.p;
            if (aVar != null) {
                aVar.a(hVar, z);
            }
        }
    }

    public boolean b() {
        return !this.r && this.j.b();
    }

    public void c(h hVar) {
    }

    public ListView d() {
        return this.j.d();
    }

    public void dismiss() {
        if (b()) {
            this.j.dismiss();
        }
    }

    public void h(boolean z) {
        this.s = false;
        g gVar = this.f883e;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    public boolean i() {
        return false;
    }

    public void l(o.a aVar) {
        this.p = aVar;
    }

    public void n(Parcelable parcelable) {
    }

    public boolean o(u uVar) {
        if (uVar.hasVisibleItems()) {
            n nVar = new n(this.f881c, uVar, this.o, this.f884f, this.h, this.i);
            nVar.j(this.p);
            nVar.g(m.z(uVar));
            nVar.i(this.m);
            this.m = null;
            this.f882d.e(false);
            int j2 = this.j.j();
            int l2 = this.j.l();
            if ((Gravity.getAbsoluteGravity(this.u, a.h.k.t.t(this.n)) & 7) == 5) {
                j2 += this.n.getWidth();
            }
            if (nVar.n(j2, l2)) {
                o.a aVar = this.p;
                if (aVar == null) {
                    return true;
                }
                aVar.b(uVar);
                return true;
            }
        }
        return false;
    }

    public void onDismiss() {
        this.r = true;
        this.f882d.close();
        ViewTreeObserver viewTreeObserver = this.q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.q = this.o.getViewTreeObserver();
            }
            this.q.removeGlobalOnLayoutListener(this.k);
            this.q = null;
        }
        this.o.removeOnAttachStateChangeListener(this.l);
        PopupWindow.OnDismissListener onDismissListener = this.m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public Parcelable p() {
        return null;
    }

    public void r(View view) {
        this.n = view;
    }

    public void show() {
        if (!B()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    public void t(boolean z) {
        this.f883e.d(z);
    }

    public void u(int i2) {
        this.u = i2;
    }

    public void v(int i2) {
        this.j.x(i2);
    }

    public void w(PopupWindow.OnDismissListener onDismissListener) {
        this.m = onDismissListener;
    }

    public void x(boolean z) {
        this.v = z;
    }

    public void y(int i2) {
        this.j.G(i2);
    }
}
