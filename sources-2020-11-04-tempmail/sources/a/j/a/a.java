package a.j.a;

import a.e.h;
import a.h.k.d0.d;
import a.h.k.d0.e;
import a.h.k.d0.f;
import a.h.k.u;
import a.h.k.x;
import a.j.a.b;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ExploreByTouchHelper */
public abstract class a extends a.h.k.a {
    private static final Rect n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    private static final b.a<d> o = new C0017a();
    private static final b.C0018b<h<d>, d> p = new b();

    /* renamed from: d  reason: collision with root package name */
    private final Rect f446d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    private final Rect f447e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private final Rect f448f = new Rect();
    private final int[] g = new int[2];
    private final AccessibilityManager h;
    private final View i;
    private c j;
    int k = Integer.MIN_VALUE;
    int l = Integer.MIN_VALUE;
    private int m = Integer.MIN_VALUE;

    /* renamed from: a.j.a.a$a  reason: collision with other inner class name */
    /* compiled from: ExploreByTouchHelper */
    static class C0017a implements b.a<d> {
        C0017a() {
        }

        /* renamed from: b */
        public void a(d dVar, Rect rect) {
            dVar.k(rect);
        }
    }

    /* compiled from: ExploreByTouchHelper */
    static class b implements b.C0018b<h<d>, d> {
        b() {
        }

        /* renamed from: c */
        public d a(h<d> hVar, int i) {
            return hVar.p(i);
        }

        /* renamed from: d */
        public int b(h<d> hVar) {
            return hVar.o();
        }
    }

    /* compiled from: ExploreByTouchHelper */
    private class c extends e {
        c() {
        }

        public d a(int i) {
            return d.N(a.this.F(i));
        }

        public d c(int i) {
            int i2 = i == 2 ? a.this.k : a.this.l;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return a(i2);
        }

        public boolean e(int i, int i2, Bundle bundle) {
            return a.this.N(i, i2, bundle);
        }
    }

    public a(View view) {
        if (view != null) {
            this.i = view;
            this.h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (u.r(view) == 0) {
                u.i0(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    private static Rect B(View view, int i2, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i2 == 17) {
            rect.set(width, 0, width, height);
        } else if (i2 == 33) {
            rect.set(0, height, width, height);
        } else if (i2 == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i2 == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    private boolean C(Rect rect) {
        if (rect == null || rect.isEmpty() || this.i.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        if (parent != null) {
            return true;
        }
        return false;
    }

    private static int D(int i2) {
        if (i2 == 19) {
            return 33;
        }
        if (i2 != 21) {
            return i2 != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean E(int i2, Rect rect) {
        d dVar;
        d dVar2;
        h<d> x = x();
        int i3 = this.l;
        int i4 = Integer.MIN_VALUE;
        if (i3 == Integer.MIN_VALUE) {
            dVar = null;
        } else {
            dVar = x.f(i3);
        }
        d dVar3 = dVar;
        if (i2 == 1 || i2 == 2) {
            dVar2 = (d) b.d(x, p, o, dVar3, i2, u.t(this.i) == 1, false);
        } else if (i2 == 17 || i2 == 33 || i2 == 66 || i2 == 130) {
            Rect rect2 = new Rect();
            int i5 = this.l;
            if (i5 != Integer.MIN_VALUE) {
                y(i5, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                B(this.i, i2, rect2);
            }
            dVar2 = (d) b.c(x, p, o, dVar3, rect2, i2);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        if (dVar2 != null) {
            i4 = x.k(x.j(dVar2));
        }
        return R(i4);
    }

    private boolean O(int i2, int i3, Bundle bundle) {
        if (i3 == 1) {
            return R(i2);
        }
        if (i3 == 2) {
            return o(i2);
        }
        if (i3 == 64) {
            return Q(i2);
        }
        if (i3 != 128) {
            return H(i2, i3, bundle);
        }
        return n(i2);
    }

    private boolean P(int i2, Bundle bundle) {
        return u.S(this.i, i2, bundle);
    }

    private boolean Q(int i2) {
        int i3;
        if (!this.h.isEnabled() || !this.h.isTouchExplorationEnabled() || (i3 = this.k) == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            n(i3);
        }
        this.k = i2;
        this.i.invalidate();
        S(i2, 32768);
        return true;
    }

    private void T(int i2) {
        int i3 = this.m;
        if (i3 != i2) {
            this.m = i2;
            S(i2, 128);
            S(i3, 256);
        }
    }

    private boolean n(int i2) {
        if (this.k != i2) {
            return false;
        }
        this.k = Integer.MIN_VALUE;
        this.i.invalidate();
        S(i2, 65536);
        return true;
    }

    private boolean p() {
        int i2 = this.l;
        return i2 != Integer.MIN_VALUE && H(i2, 16, (Bundle) null);
    }

    private AccessibilityEvent q(int i2, int i3) {
        if (i2 != -1) {
            return r(i2, i3);
        }
        return s(i3);
    }

    private AccessibilityEvent r(int i2, int i3) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i3);
        d F = F(i2);
        obtain.getText().add(F.v());
        obtain.setContentDescription(F.p());
        obtain.setScrollable(F.I());
        obtain.setPassword(F.H());
        obtain.setEnabled(F.D());
        obtain.setChecked(F.B());
        J(i2, obtain);
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            obtain.setClassName(F.n());
            f.c(obtain, this.i, i2);
            obtain.setPackageName(this.i.getContext().getPackageName());
            return obtain;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    private AccessibilityEvent s(int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        this.i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    private d t(int i2) {
        d L = d.L();
        L.g0(true);
        L.i0(true);
        L.Z("android.view.View");
        L.U(n);
        L.V(n);
        L.q0(this.i);
        L(i2, L);
        if (L.v() == null && L.p() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        L.k(this.f447e);
        if (!this.f447e.equals(n)) {
            int j2 = L.j();
            if ((j2 & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((j2 & 128) == 0) {
                L.o0(this.i.getContext().getPackageName());
                L.x0(this.i, i2);
                if (this.k == i2) {
                    L.S(true);
                    L.a(128);
                } else {
                    L.S(false);
                    L.a(64);
                }
                boolean z = this.l == i2;
                if (z) {
                    L.a(2);
                } else if (L.E()) {
                    L.a(1);
                }
                L.j0(z);
                this.i.getLocationOnScreen(this.g);
                L.l(this.f446d);
                if (this.f446d.equals(n)) {
                    L.k(this.f446d);
                    if (L.f380b != -1) {
                        d L2 = d.L();
                        for (int i3 = L.f380b; i3 != -1; i3 = L2.f380b) {
                            L2.r0(this.i, -1);
                            L2.U(n);
                            L(i3, L2);
                            L2.k(this.f447e);
                            Rect rect = this.f446d;
                            Rect rect2 = this.f447e;
                            rect.offset(rect2.left, rect2.top);
                        }
                        L2.P();
                    }
                    this.f446d.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
                }
                if (this.i.getLocalVisibleRect(this.f448f)) {
                    this.f448f.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
                    if (this.f446d.intersect(this.f448f)) {
                        L.V(this.f446d);
                        if (C(this.f446d)) {
                            L.z0(true);
                        }
                    }
                }
                return L;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    private d u() {
        d M = d.M(this.i);
        u.Q(this.i, M);
        ArrayList arrayList = new ArrayList();
        A(arrayList);
        if (M.m() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                M.d(this.i, ((Integer) arrayList.get(i2)).intValue());
            }
            return M;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    private h<d> x() {
        ArrayList arrayList = new ArrayList();
        A(arrayList);
        h<d> hVar = new h<>();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            hVar.l(i2, t(i2));
        }
        return hVar;
    }

    private void y(int i2, Rect rect) {
        F(i2).k(rect);
    }

    /* access modifiers changed from: protected */
    public abstract void A(List<Integer> list);

    /* access modifiers changed from: package-private */
    public d F(int i2) {
        if (i2 == -1) {
            return u();
        }
        return t(i2);
    }

    public final void G(boolean z, int i2, Rect rect) {
        int i3 = this.l;
        if (i3 != Integer.MIN_VALUE) {
            o(i3);
        }
        if (z) {
            E(i2, rect);
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean H(int i2, int i3, Bundle bundle);

    /* access modifiers changed from: protected */
    public void I(AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    public void J(int i2, AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    public void K(d dVar) {
    }

    /* access modifiers changed from: protected */
    public abstract void L(int i2, d dVar);

    /* access modifiers changed from: protected */
    public void M(int i2, boolean z) {
    }

    /* access modifiers changed from: package-private */
    public boolean N(int i2, int i3, Bundle bundle) {
        if (i2 != -1) {
            return O(i2, i3, bundle);
        }
        return P(i3, bundle);
    }

    public final boolean R(int i2) {
        int i3;
        if ((!this.i.isFocused() && !this.i.requestFocus()) || (i3 = this.l) == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            o(i3);
        }
        this.l = i2;
        M(i2, true);
        S(i2, 8);
        return true;
    }

    public final boolean S(int i2, int i3) {
        ViewParent parent;
        if (i2 == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = this.i.getParent()) == null) {
            return false;
        }
        return x.h(parent, this.i, q(i2, i3));
    }

    public e b(View view) {
        if (this.j == null) {
            this.j = new c();
        }
        return this.j;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        I(accessibilityEvent);
    }

    public void g(View view, d dVar) {
        super.g(view, dVar);
        K(dVar);
    }

    public final boolean o(int i2) {
        if (this.l != i2) {
            return false;
        }
        this.l = Integer.MIN_VALUE;
        M(i2, false);
        S(i2, 8);
        return true;
    }

    public final boolean v(MotionEvent motionEvent) {
        if (!this.h.isEnabled() || !this.h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int z = z(motionEvent.getX(), motionEvent.getY());
            T(z);
            if (z != Integer.MIN_VALUE) {
                return true;
            }
            return false;
        } else if (action != 10 || this.m == Integer.MIN_VALUE) {
            return false;
        } else {
            T(Integer.MIN_VALUE);
            return true;
        }
    }

    public final boolean w(KeyEvent keyEvent) {
        int i2 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int D = D(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z = false;
                        while (i2 < repeatCount && E(D, (Rect) null)) {
                            i2++;
                            z = true;
                        }
                        return z;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            p();
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return E(2, (Rect) null);
        } else {
            if (keyEvent.hasModifiers(1)) {
                return E(1, (Rect) null);
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public abstract int z(float f2, float f3);
}
