package androidx.appcompat.view.menu;

import a.a.g;
import a.h.k.u;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.appcompat.widget.s;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CascadingMenuPopup */
final class e extends m implements o, View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int C = g.abc_cascading_menu_item_layout;
    private PopupWindow.OnDismissListener A;
    boolean B;

    /* renamed from: c  reason: collision with root package name */
    private final Context f850c;

    /* renamed from: d  reason: collision with root package name */
    private final int f851d;

    /* renamed from: e  reason: collision with root package name */
    private final int f852e;

    /* renamed from: f  reason: collision with root package name */
    private final int f853f;
    private final boolean g;
    final Handler h;
    private final List<h> i = new ArrayList();
    final List<d> j = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener k = new a();
    private final View.OnAttachStateChangeListener l = new b();
    private final s m = new c();
    private int n = 0;
    private int o = 0;
    private View p;
    View q;
    private int r;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private boolean w;
    private boolean x;
    private o.a y;
    ViewTreeObserver z;

    /* compiled from: CascadingMenuPopup */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        public void onGlobalLayout() {
            if (e.this.b() && e.this.j.size() > 0 && !e.this.j.get(0).f861a.o()) {
                View view = e.this.q;
                if (view == null || !view.isShown()) {
                    e.this.dismiss();
                    return;
                }
                for (d dVar : e.this.j) {
                    dVar.f861a.show();
                }
            }
        }
    }

    /* compiled from: CascadingMenuPopup */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = e.this.z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    e.this.z = view.getViewTreeObserver();
                }
                e eVar = e.this;
                eVar.z.removeGlobalOnLayoutListener(eVar.k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* compiled from: CascadingMenuPopup */
    class c implements s {

        /* compiled from: CascadingMenuPopup */
        class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ d f857b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ MenuItem f858c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ h f859d;

            a(d dVar, MenuItem menuItem, h hVar) {
                this.f857b = dVar;
                this.f858c = menuItem;
                this.f859d = hVar;
            }

            public void run() {
                d dVar = this.f857b;
                if (dVar != null) {
                    e.this.B = true;
                    dVar.f862b.e(false);
                    e.this.B = false;
                }
                if (this.f858c.isEnabled() && this.f858c.hasSubMenu()) {
                    this.f859d.N(this.f858c, 4);
                }
            }
        }

        c() {
        }

        public void a(h hVar, MenuItem menuItem) {
            d dVar = null;
            e.this.h.removeCallbacksAndMessages((Object) null);
            int size = e.this.j.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (hVar == e.this.j.get(i).f862b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < e.this.j.size()) {
                    dVar = e.this.j.get(i2);
                }
                e.this.h.postAtTime(new a(dVar, menuItem, hVar), hVar, SystemClock.uptimeMillis() + 200);
            }
        }

        public void c(h hVar, MenuItem menuItem) {
            e.this.h.removeCallbacksAndMessages(hVar);
        }
    }

    /* compiled from: CascadingMenuPopup */
    private static class d {

        /* renamed from: a  reason: collision with root package name */
        public final MenuPopupWindow f861a;

        /* renamed from: b  reason: collision with root package name */
        public final h f862b;

        /* renamed from: c  reason: collision with root package name */
        public final int f863c;

        public d(MenuPopupWindow menuPopupWindow, h hVar, int i) {
            this.f861a = menuPopupWindow;
            this.f862b = hVar;
            this.f863c = i;
        }

        public ListView a() {
            return this.f861a.d();
        }
    }

    public e(Context context, View view, int i2, int i3, boolean z2) {
        this.f850c = context;
        this.p = view;
        this.f852e = i2;
        this.f853f = i3;
        this.g = z2;
        this.w = false;
        this.r = F();
        Resources resources = context.getResources();
        this.f851d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(a.a.d.abc_config_prefDialogWidth));
        this.h = new Handler();
    }

    private MenuPopupWindow B() {
        MenuPopupWindow menuPopupWindow = new MenuPopupWindow(this.f850c, (AttributeSet) null, this.f852e, this.f853f);
        menuPopupWindow.K(this.m);
        menuPopupWindow.B(this);
        menuPopupWindow.A(this);
        menuPopupWindow.r(this.p);
        menuPopupWindow.v(this.o);
        menuPopupWindow.z(true);
        menuPopupWindow.y(2);
        return menuPopupWindow;
    }

    private int C(h hVar) {
        int size = this.j.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (hVar == this.j.get(i2).f862b) {
                return i2;
            }
        }
        return -1;
    }

    private MenuItem D(h hVar, h hVar2) {
        int size = hVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = hVar.getItem(i2);
            if (item.hasSubMenu() && hVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View E(d dVar, h hVar) {
        int i2;
        g gVar;
        int firstVisiblePosition;
        MenuItem D = D(dVar.f862b, hVar);
        if (D == null) {
            return null;
        }
        ListView a2 = dVar.a();
        ListAdapter adapter = a2.getAdapter();
        int i3 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i2 = headerViewListAdapter.getHeadersCount();
            gVar = (g) headerViewListAdapter.getWrappedAdapter();
        } else {
            gVar = (g) adapter;
            i2 = 0;
        }
        int count = gVar.getCount();
        while (true) {
            if (i3 >= count) {
                i3 = -1;
                break;
            } else if (D == gVar.getItem(i3)) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 != -1 && (firstVisiblePosition = (i3 + i2) - a2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a2.getChildCount()) {
            return a2.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int F() {
        return u.t(this.p) == 1 ? 0 : 1;
    }

    private int G(int i2) {
        List<d> list = this.j;
        ListView a2 = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        a2.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.q.getWindowVisibleDisplayFrame(rect);
        if (this.r == 1) {
            if (iArr[0] + a2.getWidth() + i2 > rect.right) {
                return 0;
            }
            return 1;
        } else if (iArr[0] - i2 < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    private void H(h hVar) {
        View view;
        d dVar;
        int i2;
        int i3;
        int i4;
        LayoutInflater from = LayoutInflater.from(this.f850c);
        g gVar = new g(hVar, from, this.g, C);
        if (!b() && this.w) {
            gVar.d(true);
        } else if (b()) {
            gVar.d(m.z(hVar));
        }
        int g2 = m.g(gVar, (ViewGroup) null, this.f850c, this.f851d);
        MenuPopupWindow B2 = B();
        B2.q(gVar);
        B2.u(g2);
        B2.v(this.o);
        if (this.j.size() > 0) {
            List<d> list = this.j;
            dVar = list.get(list.size() - 1);
            view = E(dVar, hVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            B2.L(false);
            B2.I((Object) null);
            int G = G(g2);
            boolean z2 = G == 1;
            this.r = G;
            if (Build.VERSION.SDK_INT >= 26) {
                B2.r(view);
                i3 = 0;
                i2 = 0;
            } else {
                int[] iArr = new int[2];
                this.p.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.o & 7) == 5) {
                    iArr[0] = iArr[0] + this.p.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i2 = iArr2[0] - iArr[0];
                i3 = iArr2[1] - iArr[1];
            }
            if ((this.o & 5) != 5) {
                if (z2) {
                    g2 = view.getWidth();
                }
                i4 = i2 - g2;
                B2.x(i4);
                B2.C(true);
                B2.G(i3);
            } else if (!z2) {
                g2 = view.getWidth();
                i4 = i2 - g2;
                B2.x(i4);
                B2.C(true);
                B2.G(i3);
            }
            i4 = i2 + g2;
            B2.x(i4);
            B2.C(true);
            B2.G(i3);
        } else {
            if (this.s) {
                B2.x(this.u);
            }
            if (this.t) {
                B2.G(this.v);
            }
            B2.w(f());
        }
        this.j.add(new d(B2, hVar, this.r));
        B2.show();
        ListView d2 = B2.d();
        d2.setOnKeyListener(this);
        if (dVar == null && this.x && hVar.z() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(g.abc_popup_menu_header_item_layout, d2, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(hVar.z());
            d2.addHeaderView(frameLayout, (Object) null, false);
            B2.show();
        }
    }

    public void a(h hVar, boolean z2) {
        int C2 = C(hVar);
        if (C2 >= 0) {
            int i2 = C2 + 1;
            if (i2 < this.j.size()) {
                this.j.get(i2).f862b.e(false);
            }
            d remove = this.j.remove(C2);
            remove.f862b.Q(this);
            if (this.B) {
                remove.f861a.J((Object) null);
                remove.f861a.s(0);
            }
            remove.f861a.dismiss();
            int size = this.j.size();
            if (size > 0) {
                this.r = this.j.get(size - 1).f863c;
            } else {
                this.r = F();
            }
            if (size == 0) {
                dismiss();
                o.a aVar = this.y;
                if (aVar != null) {
                    aVar.a(hVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.z;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.z.removeGlobalOnLayoutListener(this.k);
                    }
                    this.z = null;
                }
                this.q.removeOnAttachStateChangeListener(this.l);
                this.A.onDismiss();
            } else if (z2) {
                this.j.get(0).f862b.e(false);
            }
        }
    }

    public boolean b() {
        return this.j.size() > 0 && this.j.get(0).f861a.b();
    }

    public void c(h hVar) {
        hVar.c(this, this.f850c);
        if (b()) {
            H(hVar);
        } else {
            this.i.add(hVar);
        }
    }

    public ListView d() {
        if (this.j.isEmpty()) {
            return null;
        }
        List<d> list = this.j;
        return list.get(list.size() - 1).a();
    }

    public void dismiss() {
        int size = this.j.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.j.toArray(new d[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                d dVar = dVarArr[i2];
                if (dVar.f861a.b()) {
                    dVar.f861a.dismiss();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean e() {
        return false;
    }

    public void i(boolean z2) {
        for (d a2 : this.j) {
            m.A(a2.a().getAdapter()).notifyDataSetChanged();
        }
    }

    public boolean j() {
        return false;
    }

    public void m(o.a aVar) {
        this.y = aVar;
    }

    public void o(Parcelable parcelable) {
    }

    public void onDismiss() {
        d dVar;
        int size = this.j.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                dVar = null;
                break;
            }
            dVar = this.j.get(i2);
            if (!dVar.f861a.b()) {
                break;
            }
            i2++;
        }
        if (dVar != null) {
            dVar.f862b.e(false);
        }
    }

    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public boolean p(u uVar) {
        for (d next : this.j) {
            if (uVar == next.f862b) {
                next.a().requestFocus();
                return true;
            }
        }
        if (!uVar.hasVisibleItems()) {
            return false;
        }
        c(uVar);
        o.a aVar = this.y;
        if (aVar != null) {
            aVar.b(uVar);
        }
        return true;
    }

    public Parcelable q() {
        return null;
    }

    public void r(View view) {
        if (this.p != view) {
            this.p = view;
            this.o = a.h.k.d.b(this.n, u.t(view));
        }
    }

    public void show() {
        if (!b()) {
            for (h H : this.i) {
                H(H);
            }
            this.i.clear();
            View view = this.p;
            this.q = view;
            if (view != null) {
                boolean z2 = this.z == null;
                ViewTreeObserver viewTreeObserver = this.q.getViewTreeObserver();
                this.z = viewTreeObserver;
                if (z2) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.k);
                }
                this.q.addOnAttachStateChangeListener(this.l);
            }
        }
    }

    public void t(boolean z2) {
        this.w = z2;
    }

    public void u(int i2) {
        if (this.n != i2) {
            this.n = i2;
            this.o = a.h.k.d.b(i2, u.t(this.p));
        }
    }

    public void v(int i2) {
        this.s = true;
        this.u = i2;
    }

    public void w(PopupWindow.OnDismissListener onDismissListener) {
        this.A = onDismissListener;
    }

    public void x(boolean z2) {
        this.x = z2;
    }

    public void y(int i2) {
        this.t = true;
        this.v = i2;
    }
}
