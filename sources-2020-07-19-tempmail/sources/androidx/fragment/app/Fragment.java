package androidx.fragment.app;

import a.h.k.f;
import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.k;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import androidx.lifecycle.h;
import androidx.lifecycle.l;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, g, s {
    private static final a.e.g<String, Class<?>> X = new a.e.g<>();
    static final Object Y = new Object();
    String A;
    boolean B;
    boolean C;
    boolean D;
    boolean E;
    boolean F;
    boolean G = true;
    boolean H;
    ViewGroup I;
    View J;
    View K;
    boolean L;
    boolean M = true;
    d N;
    boolean O;
    boolean P;
    float Q;
    LayoutInflater R;
    boolean S;
    h T = new h(this);
    h U;
    g V;
    l<g> W = new l<>();

    /* renamed from: b  reason: collision with root package name */
    int f1437b = 0;

    /* renamed from: c  reason: collision with root package name */
    Bundle f1438c;

    /* renamed from: d  reason: collision with root package name */
    SparseArray<Parcelable> f1439d;

    /* renamed from: e  reason: collision with root package name */
    Boolean f1440e;

    /* renamed from: f  reason: collision with root package name */
    int f1441f = -1;
    String g;
    Bundle h;
    Fragment i;
    int j = -1;
    int k;
    boolean l;
    boolean m;
    boolean n;
    boolean o;
    boolean p;
    boolean q;
    int r;
    h s;
    f t;
    h u;
    i v;
    r w;
    Fragment x;
    int y;
    int z;

    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    class a implements Runnable {
        a() {
        }

        public void run() {
            Fragment.this.q();
        }
    }

    class b extends d {
        b() {
        }

        public Fragment a(Context context, String str, Bundle bundle) {
            return Fragment.this.t.a(context, str, bundle);
        }

        public View b(int i) {
            View view = Fragment.this.J;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment does not have a view");
        }

        public boolean c() {
            return Fragment.this.J != null;
        }
    }

    class c implements g {
        c() {
        }

        public androidx.lifecycle.e e() {
            Fragment fragment = Fragment.this;
            if (fragment.U == null) {
                fragment.U = new h(fragment.V);
            }
            return Fragment.this.U;
        }
    }

    static class d {

        /* renamed from: a  reason: collision with root package name */
        View f1445a;

        /* renamed from: b  reason: collision with root package name */
        Animator f1446b;

        /* renamed from: c  reason: collision with root package name */
        int f1447c;

        /* renamed from: d  reason: collision with root package name */
        int f1448d;

        /* renamed from: e  reason: collision with root package name */
        int f1449e;

        /* renamed from: f  reason: collision with root package name */
        int f1450f;
        Object g = null;
        Object h;
        Object i;
        Object j;
        Object k;
        Object l;
        Boolean m;
        Boolean n;
        k o;
        k p;
        boolean q;
        e r;
        boolean s;

        d() {
            Object obj = Fragment.Y;
            this.h = obj;
            this.i = null;
            this.j = obj;
            this.k = null;
            this.l = obj;
            this.o = null;
            this.p = null;
        }
    }

    interface e {
        void a();

        void b();
    }

    static boolean A0(Context context, String str) {
        try {
            Class<?> cls = X.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                X.put(str, cls);
            }
            return Fragment.class.isAssignableFrom(cls);
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static Fragment o0(Context context, String str, Bundle bundle) {
        try {
            Class<?> cls = X.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                X.put(str, cls);
            }
            Fragment fragment = (Fragment) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.O1(bundle);
            }
            return fragment;
        } catch (ClassNotFoundException e2) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e3);
        } catch (IllegalAccessException e4) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e4);
        } catch (NoSuchMethodException e5) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e5);
        } catch (InvocationTargetException e6) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e6);
        }
    }

    private d s() {
        if (this.N == null) {
            this.N = new d();
        }
        return this.N;
    }

    /* access modifiers changed from: package-private */
    public Animator A() {
        d dVar = this.N;
        if (dVar == null) {
            return null;
        }
        return dVar.f1446b;
    }

    /* access modifiers changed from: package-private */
    public void A1() {
        if (this.J != null) {
            this.U.i(e.a.ON_PAUSE);
        }
        this.T.i(e.a.ON_PAUSE);
        h hVar = this.u;
        if (hVar != null) {
            hVar.Y();
        }
        this.f1437b = 3;
        this.H = false;
        Z0();
        if (!this.H) {
            throw new o("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r1.J;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean B0() {
        /*
            r1 = this;
            boolean r0 = r1.q0()
            if (r0 == 0) goto L_0x0020
            boolean r0 = r1.s0()
            if (r0 != 0) goto L_0x0020
            android.view.View r0 = r1.J
            if (r0 == 0) goto L_0x0020
            android.os.IBinder r0 = r0.getWindowToken()
            if (r0 == 0) goto L_0x0020
            android.view.View r0 = r1.J
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0020
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.B0():boolean");
    }

    /* access modifiers changed from: package-private */
    public void B1(boolean z2) {
        b1(z2);
        h hVar = this.u;
        if (hVar != null) {
            hVar.Z(z2);
        }
    }

    public r C() {
        if (H() != null) {
            if (this.w == null) {
                this.w = new r();
            }
            return this.w;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* access modifiers changed from: package-private */
    public void C0() {
        h hVar = this.u;
        if (hVar != null) {
            hVar.L0();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean C1(Menu menu) {
        boolean z2 = false;
        if (this.B) {
            return false;
        }
        if (this.F && this.G) {
            c1(menu);
            z2 = true;
        }
        h hVar = this.u;
        return hVar != null ? z2 | hVar.a0(menu) : z2;
    }

    public final Bundle D() {
        return this.h;
    }

    public void D0(Bundle bundle) {
        this.H = true;
    }

    /* access modifiers changed from: package-private */
    public void D1() {
        h hVar = this.u;
        if (hVar != null) {
            hVar.L0();
            this.u.k0();
        }
        this.f1437b = 4;
        this.H = false;
        f1();
        if (this.H) {
            h hVar2 = this.u;
            if (hVar2 != null) {
                hVar2.b0();
                this.u.k0();
            }
            this.T.i(e.a.ON_RESUME);
            if (this.J != null) {
                this.U.i(e.a.ON_RESUME);
                return;
            }
            return;
        }
        throw new o("Fragment " + this + " did not call through to super.onResume()");
    }

    public void E0(int i2, int i3, Intent intent) {
    }

    /* access modifiers changed from: package-private */
    public void E1(Bundle bundle) {
        Parcelable X0;
        g1(bundle);
        h hVar = this.u;
        if (hVar != null && (X0 = hVar.X0()) != null) {
            bundle.putParcelable("android:support:fragments", X0);
        }
    }

    @Deprecated
    public void F0(Activity activity) {
        this.H = true;
    }

    /* access modifiers changed from: package-private */
    public void F1() {
        h hVar = this.u;
        if (hVar != null) {
            hVar.L0();
            this.u.k0();
        }
        this.f1437b = 3;
        this.H = false;
        h1();
        if (this.H) {
            h hVar2 = this.u;
            if (hVar2 != null) {
                hVar2.c0();
            }
            this.T.i(e.a.ON_START);
            if (this.J != null) {
                this.U.i(e.a.ON_START);
                return;
            }
            return;
        }
        throw new o("Fragment " + this + " did not call through to super.onStart()");
    }

    public final g G() {
        if (this.u == null) {
            p0();
            int i2 = this.f1437b;
            if (i2 >= 4) {
                this.u.b0();
            } else if (i2 >= 3) {
                this.u.c0();
            } else if (i2 >= 2) {
                this.u.z();
            } else if (i2 >= 1) {
                this.u.C();
            }
        }
        return this.u;
    }

    public void G0(Context context) {
        this.H = true;
        f fVar = this.t;
        Activity d2 = fVar == null ? null : fVar.d();
        if (d2 != null) {
            this.H = false;
            F0(d2);
        }
    }

    /* access modifiers changed from: package-private */
    public void G1() {
        if (this.J != null) {
            this.U.i(e.a.ON_STOP);
        }
        this.T.i(e.a.ON_STOP);
        h hVar = this.u;
        if (hVar != null) {
            hVar.e0();
        }
        this.f1437b = 2;
        this.H = false;
        i1();
        if (!this.H) {
            throw new o("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    public Context H() {
        f fVar = this.t;
        if (fVar == null) {
            return null;
        }
        return fVar.e();
    }

    public void H0(Fragment fragment) {
    }

    public void H1(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    public Object I() {
        d dVar = this.N;
        if (dVar == null) {
            return null;
        }
        return dVar.g;
    }

    public boolean I0(MenuItem menuItem) {
        return false;
    }

    public final void I1(String[] strArr, int i2) {
        f fVar = this.t;
        if (fVar != null) {
            fVar.m(this, strArr, i2);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public void J0(Bundle bundle) {
        this.H = true;
        K1(bundle);
        h hVar = this.u;
        if (hVar != null && !hVar.y0(1)) {
            this.u.C();
        }
    }

    public final Context J1() {
        Context H2 = H();
        if (H2 != null) {
            return H2;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* access modifiers changed from: package-private */
    public k K() {
        d dVar = this.N;
        if (dVar == null) {
            return null;
        }
        return dVar.o;
    }

    public Animation K0(int i2, boolean z2, int i3) {
        return null;
    }

    /* access modifiers changed from: package-private */
    public void K1(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            if (this.u == null) {
                p0();
            }
            this.u.U0(parcelable, this.v);
            this.v = null;
            this.u.C();
        }
    }

    public Object L() {
        d dVar = this.N;
        if (dVar == null) {
            return null;
        }
        return dVar.i;
    }

    public Animator L0(int i2, boolean z2, int i3) {
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void L1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f1439d;
        if (sparseArray != null) {
            this.K.restoreHierarchyState(sparseArray);
            this.f1439d = null;
        }
        this.H = false;
        k1(bundle);
        if (!this.H) {
            throw new o("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.J != null) {
            this.U.i(e.a.ON_CREATE);
        }
    }

    /* access modifiers changed from: package-private */
    public k M() {
        d dVar = this.N;
        if (dVar == null) {
            return null;
        }
        return dVar.p;
    }

    public void M0(Menu menu, MenuInflater menuInflater) {
    }

    /* access modifiers changed from: package-private */
    public void M1(View view) {
        s().f1445a = view;
    }

    public final g N() {
        return this.s;
    }

    public View N0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    /* access modifiers changed from: package-private */
    public void N1(Animator animator) {
        s().f1446b = animator;
    }

    public final int O() {
        return this.y;
    }

    public void O0() {
        boolean z2 = true;
        this.H = true;
        c u2 = u();
        if (u2 == null || !u2.isChangingConfigurations()) {
            z2 = false;
        }
        r rVar = this.w;
        if (rVar != null && !z2) {
            rVar.a();
        }
    }

    public void O1(Bundle bundle) {
        if (this.f1441f < 0 || !z0()) {
            this.h = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already active and state has been saved");
    }

    public void P0() {
    }

    public void P1(boolean z2) {
        if (this.F != z2) {
            this.F = z2;
            if (q0() && !s0()) {
                this.t.q();
            }
        }
    }

    public void Q0() {
        this.H = true;
    }

    /* access modifiers changed from: package-private */
    public void Q1(boolean z2) {
        s().s = z2;
    }

    @Deprecated
    public LayoutInflater R(Bundle bundle) {
        f fVar = this.t;
        if (fVar != null) {
            LayoutInflater j2 = fVar.j();
            G();
            h hVar = this.u;
            hVar.v0();
            f.b(j2, hVar);
            return j2;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void R0() {
        this.H = true;
    }

    /* access modifiers changed from: package-private */
    public final void R1(int i2, Fragment fragment) {
        this.f1441f = i2;
        if (fragment != null) {
            this.g = fragment.g + ":" + this.f1441f;
            return;
        }
        this.g = "android:fragment:" + this.f1441f;
    }

    /* access modifiers changed from: package-private */
    public int S() {
        d dVar = this.N;
        if (dVar == null) {
            return 0;
        }
        return dVar.f1448d;
    }

    public LayoutInflater S0(Bundle bundle) {
        return R(bundle);
    }

    public void S1(boolean z2) {
        if (this.G != z2) {
            this.G = z2;
            if (this.F && q0() && !s0()) {
                this.t.q();
            }
        }
    }

    public void T0(boolean z2) {
    }

    /* access modifiers changed from: package-private */
    public void T1(int i2) {
        if (this.N != null || i2 != 0) {
            s().f1448d = i2;
        }
    }

    @Deprecated
    public void U0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.H = true;
    }

    /* access modifiers changed from: package-private */
    public int V() {
        d dVar = this.N;
        if (dVar == null) {
            return 0;
        }
        return dVar.f1449e;
    }

    public void V0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.H = true;
        f fVar = this.t;
        Activity d2 = fVar == null ? null : fVar.d();
        if (d2 != null) {
            this.H = false;
            U0(d2, attributeSet, bundle);
        }
    }

    /* access modifiers changed from: package-private */
    public void V1(int i2, int i3) {
        if (this.N != null || i2 != 0 || i3 != 0) {
            s();
            d dVar = this.N;
            dVar.f1449e = i2;
            dVar.f1450f = i3;
        }
    }

    /* access modifiers changed from: package-private */
    public int W() {
        d dVar = this.N;
        if (dVar == null) {
            return 0;
        }
        return dVar.f1450f;
    }

    public void W0(boolean z2) {
    }

    /* access modifiers changed from: package-private */
    public void W1(e eVar) {
        s();
        e eVar2 = this.N.r;
        if (eVar != eVar2) {
            if (eVar == null || eVar2 == null) {
                d dVar = this.N;
                if (dVar.q) {
                    dVar.r = eVar;
                }
                if (eVar != null) {
                    eVar.a();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    public boolean X0(MenuItem menuItem) {
        return false;
    }

    public void X1(boolean z2) {
        this.D = z2;
    }

    public final Fragment Y() {
        return this.x;
    }

    public void Y0(Menu menu) {
    }

    /* access modifiers changed from: package-private */
    public void Y1(int i2) {
        s().f1447c = i2;
    }

    public Object Z() {
        d dVar = this.N;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.j;
        return obj == Y ? L() : obj;
    }

    public void Z0() {
        this.H = true;
    }

    public void Z1(Fragment fragment, int i2) {
        g N2 = N();
        g N3 = fragment != null ? fragment.N() : null;
        if (N2 == null || N3 == null || N2 == N3) {
            Fragment fragment2 = fragment;
            while (fragment2 != null) {
                if (fragment2 != this) {
                    fragment2 = fragment2.j0();
                } else {
                    throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
                }
            }
            this.i = fragment;
            this.k = i2;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
    }

    public final Resources a0() {
        return J1().getResources();
    }

    public void a2(boolean z2) {
        if (!this.M && z2 && this.f1437b < 3 && this.s != null && q0() && this.S) {
            this.s.M0(this);
        }
        this.M = z2;
        this.L = this.f1437b < 3 && !z2;
        if (this.f1438c != null) {
            this.f1440e = Boolean.valueOf(z2);
        }
    }

    public final boolean b0() {
        return this.D;
    }

    public void b1(boolean z2) {
    }

    public boolean b2(String str) {
        f fVar = this.t;
        if (fVar != null) {
            return fVar.o(str);
        }
        return false;
    }

    public Object c0() {
        d dVar = this.N;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.h;
        return obj == Y ? I() : obj;
    }

    public void c1(Menu menu) {
    }

    public void c2(Intent intent) {
        d2(intent, (Bundle) null);
    }

    public Object d0() {
        d dVar = this.N;
        if (dVar == null) {
            return null;
        }
        return dVar.k;
    }

    public void d2(Intent intent, Bundle bundle) {
        f fVar = this.t;
        if (fVar != null) {
            fVar.p(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public androidx.lifecycle.e e() {
        return this.T;
    }

    public void e1(int i2, String[] strArr, int[] iArr) {
    }

    public void e2(Intent intent, int i2, Bundle bundle) {
        f fVar = this.t;
        if (fVar != null) {
            fVar.p(this, intent, i2, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Object f0() {
        d dVar = this.N;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.l;
        return obj == Y ? d0() : obj;
    }

    public void f1() {
        this.H = true;
    }

    public void f2() {
        h hVar = this.s;
        if (hVar == null || hVar.n == null) {
            s().q = false;
        } else if (Looper.myLooper() != this.s.n.g().getLooper()) {
            this.s.n.g().postAtFrontOfQueue(new a());
        } else {
            q();
        }
    }

    /* access modifiers changed from: package-private */
    public int g0() {
        d dVar = this.N;
        if (dVar == null) {
            return 0;
        }
        return dVar.f1447c;
    }

    public void g1(Bundle bundle) {
    }

    public void g2(View view) {
        view.setOnCreateContextMenuListener((View.OnCreateContextMenuListener) null);
    }

    public final String h0(int i2) {
        return a0().getString(i2);
    }

    public void h1() {
        this.H = true;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String i0() {
        return this.A;
    }

    public void i1() {
        this.H = true;
    }

    public final Fragment j0() {
        return this.i;
    }

    public void j1(View view, Bundle bundle) {
    }

    public final int k0() {
        return this.k;
    }

    public void k1(Bundle bundle) {
        this.H = true;
    }

    public boolean l0() {
        return this.M;
    }

    /* access modifiers changed from: package-private */
    public g l1() {
        return this.u;
    }

    public View m0() {
        return this.J;
    }

    /* access modifiers changed from: package-private */
    public void m1(Bundle bundle) {
        h hVar = this.u;
        if (hVar != null) {
            hVar.L0();
        }
        this.f1437b = 2;
        this.H = false;
        D0(bundle);
        if (this.H) {
            h hVar2 = this.u;
            if (hVar2 != null) {
                hVar2.z();
                return;
            }
            return;
        }
        throw new o("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    /* access modifiers changed from: package-private */
    public void n0() {
        this.f1441f = -1;
        this.g = null;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.r = 0;
        this.s = null;
        this.u = null;
        this.t = null;
        this.y = 0;
        this.z = 0;
        this.A = null;
        this.B = false;
        this.C = false;
        this.E = false;
    }

    /* access modifiers changed from: package-private */
    public void n1(Configuration configuration) {
        onConfigurationChanged(configuration);
        h hVar = this.u;
        if (hVar != null) {
            hVar.A(configuration);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean o1(MenuItem menuItem) {
        if (this.B) {
            return false;
        }
        if (I0(menuItem)) {
            return true;
        }
        h hVar = this.u;
        if (hVar == null || !hVar.B(menuItem)) {
            return false;
        }
        return true;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.H = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        u().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.H = true;
    }

    /* access modifiers changed from: package-private */
    public void p0() {
        if (this.t != null) {
            h hVar = new h();
            this.u = hVar;
            hVar.r(this.t, new b(), this);
            return;
        }
        throw new IllegalStateException("Fragment has not been attached yet.");
    }

    /* access modifiers changed from: package-private */
    public void p1(Bundle bundle) {
        h hVar = this.u;
        if (hVar != null) {
            hVar.L0();
        }
        this.f1437b = 1;
        this.H = false;
        J0(bundle);
        this.S = true;
        if (this.H) {
            this.T.i(e.a.ON_CREATE);
            return;
        }
        throw new o("Fragment " + this + " did not call through to super.onCreate()");
    }

    /* access modifiers changed from: package-private */
    public void q() {
        d dVar = this.N;
        e eVar = null;
        if (dVar != null) {
            dVar.q = false;
            e eVar2 = dVar.r;
            dVar.r = null;
            eVar = eVar2;
        }
        if (eVar != null) {
            eVar.b();
        }
    }

    public final boolean q0() {
        return this.t != null && this.l;
    }

    /* access modifiers changed from: package-private */
    public boolean q1(Menu menu, MenuInflater menuInflater) {
        boolean z2 = false;
        if (this.B) {
            return false;
        }
        if (this.F && this.G) {
            M0(menu, menuInflater);
            z2 = true;
        }
        h hVar = this.u;
        return hVar != null ? z2 | hVar.D(menu, menuInflater) : z2;
    }

    public void r(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.y));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.z));
        printWriter.print(" mTag=");
        printWriter.println(this.A);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f1437b);
        printWriter.print(" mIndex=");
        printWriter.print(this.f1441f);
        printWriter.print(" mWho=");
        printWriter.print(this.g);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.r);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.m);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.n);
        printWriter.print(" mInLayout=");
        printWriter.println(this.o);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.B);
        printWriter.print(" mDetached=");
        printWriter.print(this.C);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.G);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.F);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.D);
        printWriter.print(" mRetaining=");
        printWriter.print(this.E);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.M);
        if (this.s != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.s);
        }
        if (this.t != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.t);
        }
        if (this.x != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.x);
        }
        if (this.h != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.h);
        }
        if (this.f1438c != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f1438c);
        }
        if (this.f1439d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f1439d);
        }
        if (this.i != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.i);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.k);
        }
        if (S() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(S());
        }
        if (this.I != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.I);
        }
        if (this.J != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.J);
        }
        if (this.K != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.J);
        }
        if (z() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(z());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(g0());
        }
        if (H() != null) {
            a.m.a.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        if (this.u != null) {
            printWriter.print(str);
            printWriter.println("Child " + this.u + ":");
            h hVar = this.u;
            hVar.c(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    public final boolean r0() {
        return this.C;
    }

    /* access modifiers changed from: package-private */
    public void r1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h hVar = this.u;
        if (hVar != null) {
            hVar.L0();
        }
        this.q = true;
        this.V = new c();
        this.U = null;
        View N0 = N0(layoutInflater, viewGroup, bundle);
        this.J = N0;
        if (N0 != null) {
            this.V.e();
            this.W.j(this.V);
        } else if (this.U == null) {
            this.V = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public final boolean s0() {
        return this.B;
    }

    /* access modifiers changed from: package-private */
    public void s1() {
        this.T.i(e.a.ON_DESTROY);
        h hVar = this.u;
        if (hVar != null) {
            hVar.E();
        }
        this.f1437b = 0;
        this.H = false;
        this.S = false;
        O0();
        if (this.H) {
            this.u = null;
            return;
        }
        throw new o("Fragment " + this + " did not call through to super.onDestroy()");
    }

    public void startActivityForResult(Intent intent, int i2) {
        e2(intent, i2, (Bundle) null);
    }

    /* access modifiers changed from: package-private */
    public Fragment t(String str) {
        if (str.equals(this.g)) {
            return this;
        }
        h hVar = this.u;
        if (hVar != null) {
            return hVar.o0(str);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean t0() {
        d dVar = this.N;
        if (dVar == null) {
            return false;
        }
        return dVar.s;
    }

    /* access modifiers changed from: package-private */
    public void t1() {
        if (this.J != null) {
            this.U.i(e.a.ON_DESTROY);
        }
        h hVar = this.u;
        if (hVar != null) {
            hVar.F();
        }
        this.f1437b = 1;
        this.H = false;
        Q0();
        if (this.H) {
            a.m.a.a.b(this).c();
            this.q = false;
            return;
        }
        throw new o("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        a.h.j.a.a(this, sb);
        if (this.f1441f >= 0) {
            sb.append(" #");
            sb.append(this.f1441f);
        }
        if (this.y != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.y));
        }
        if (this.A != null) {
            sb.append(" ");
            sb.append(this.A);
        }
        sb.append('}');
        return sb.toString();
    }

    public final c u() {
        f fVar = this.t;
        if (fVar == null) {
            return null;
        }
        return (c) fVar.d();
    }

    /* access modifiers changed from: package-private */
    public final boolean u0() {
        return this.r > 0;
    }

    /* access modifiers changed from: package-private */
    public void u1() {
        this.H = false;
        R0();
        this.R = null;
        if (this.H) {
            h hVar = this.u;
            if (hVar == null) {
                return;
            }
            if (this.E) {
                hVar.E();
                this.u = null;
                return;
            }
            throw new IllegalStateException("Child FragmentManager of " + this + " was not " + " destroyed and this fragment is not retaining instance");
        }
        throw new o("Fragment " + this + " did not call through to super.onDetach()");
    }

    public boolean v() {
        Boolean bool;
        d dVar = this.N;
        if (dVar == null || (bool = dVar.n) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final boolean v0() {
        return this.o;
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater v1(Bundle bundle) {
        LayoutInflater S0 = S0(bundle);
        this.R = S0;
        return S0;
    }

    public boolean w() {
        Boolean bool;
        d dVar = this.N;
        if (dVar == null || (bool = dVar.m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public boolean w0() {
        d dVar = this.N;
        if (dVar == null) {
            return false;
        }
        return dVar.q;
    }

    /* access modifiers changed from: package-private */
    public void w1() {
        onLowMemory();
        h hVar = this.u;
        if (hVar != null) {
            hVar.G();
        }
    }

    public final boolean x0() {
        return this.m;
    }

    /* access modifiers changed from: package-private */
    public void x1(boolean z2) {
        W0(z2);
        h hVar = this.u;
        if (hVar != null) {
            hVar.H(z2);
        }
    }

    public final boolean y0() {
        return this.f1437b >= 4;
    }

    /* access modifiers changed from: package-private */
    public boolean y1(MenuItem menuItem) {
        if (this.B) {
            return false;
        }
        if (this.F && this.G && X0(menuItem)) {
            return true;
        }
        h hVar = this.u;
        if (hVar == null || !hVar.W(menuItem)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public View z() {
        d dVar = this.N;
        if (dVar == null) {
            return null;
        }
        return dVar.f1445a;
    }

    public final boolean z0() {
        h hVar = this.s;
        if (hVar == null) {
            return false;
        }
        return hVar.i();
    }

    /* access modifiers changed from: package-private */
    public void z1(Menu menu) {
        if (!this.B) {
            if (this.F && this.G) {
                Y0(menu);
            }
            h hVar = this.u;
            if (hVar != null) {
                hVar.X(menu);
            }
        }
    }
}
