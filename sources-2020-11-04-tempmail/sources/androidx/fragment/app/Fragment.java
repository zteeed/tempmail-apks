package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
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
import androidx.lifecycle.f;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.l;
import androidx.lifecycle.p;
import androidx.lifecycle.v;
import androidx.lifecycle.x;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, k, z, f, androidx.savedstate.b {
    static final Object X = new Object();
    boolean A;
    boolean B;
    boolean C;
    boolean D;
    boolean E = true;
    private boolean F;
    ViewGroup G;
    View H;
    boolean I;
    boolean J = true;
    c K;
    boolean L;
    boolean M;
    float N;
    LayoutInflater O;
    boolean P;
    g.b Q = g.b.RESUMED;
    l R;
    u S;
    p<k> T = new p<>();
    private x.b U;
    androidx.savedstate.a V;
    private int W;

    /* renamed from: b  reason: collision with root package name */
    int f1468b = -1;

    /* renamed from: c  reason: collision with root package name */
    Bundle f1469c;

    /* renamed from: d  reason: collision with root package name */
    SparseArray<Parcelable> f1470d;

    /* renamed from: e  reason: collision with root package name */
    Boolean f1471e;

    /* renamed from: f  reason: collision with root package name */
    String f1472f = UUID.randomUUID().toString();
    Bundle g;
    Fragment h;
    String i = null;
    int j;
    private Boolean k = null;
    boolean l;
    boolean m;
    boolean n;
    boolean o;
    boolean p;
    boolean q;
    int r;
    k s;
    h<?> t;
    k u = new l();
    Fragment v;
    int w;
    int x;
    String y;
    boolean z;

    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    class a implements Runnable {
        a() {
        }

        public void run() {
            Fragment.this.s();
        }
    }

    class b extends e {
        b() {
        }

        public View b(int i) {
            View view = Fragment.this.H;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment " + this + " does not have a view");
        }

        public boolean d() {
            return Fragment.this.H != null;
        }
    }

    static class c {

        /* renamed from: a  reason: collision with root package name */
        View f1476a;

        /* renamed from: b  reason: collision with root package name */
        Animator f1477b;

        /* renamed from: c  reason: collision with root package name */
        int f1478c;

        /* renamed from: d  reason: collision with root package name */
        int f1479d;

        /* renamed from: e  reason: collision with root package name */
        int f1480e;

        /* renamed from: f  reason: collision with root package name */
        Object f1481f = null;
        Object g;
        Object h;
        Object i;
        Object j;
        Object k;
        Boolean l;
        Boolean m;
        androidx.core.app.k n;
        androidx.core.app.k o;
        boolean p;
        d q;
        boolean r;

        c() {
            Object obj = Fragment.X;
            this.g = obj;
            this.h = null;
            this.i = obj;
            this.j = null;
            this.k = obj;
            this.n = null;
            this.o = null;
        }
    }

    interface d {
        void a();

        void b();
    }

    public Fragment() {
        q0();
    }

    private void q0() {
        this.R = new l(this);
        this.V = androidx.savedstate.a.a(this);
        if (Build.VERSION.SDK_INT >= 19) {
            this.R.a(new i() {
                public void c(k kVar, g.a aVar) {
                    View view;
                    if (aVar == g.a.ON_STOP && (view = Fragment.this.H) != null) {
                        view.cancelPendingInputEvents();
                    }
                }
            });
        }
    }

    @Deprecated
    public static Fragment s0(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) g.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.V1(bundle);
            }
            return fragment;
        } catch (InstantiationException e2) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (IllegalAccessException e3) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }

    private c v() {
        if (this.K == null) {
            this.K = new c();
        }
        return this.K;
    }

    public final boolean A0() {
        return this.m;
    }

    /* access modifiers changed from: package-private */
    public void A1() {
        onLowMemory();
        this.u.z();
    }

    public y B() {
        k kVar = this.s;
        if (kVar != null) {
            return kVar.n0(this);
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* access modifiers changed from: package-private */
    public final boolean B0() {
        Fragment a0 = a0();
        return a0 != null && (a0.A0() || a0.B0());
    }

    /* access modifiers changed from: package-private */
    public void B1(boolean z2) {
        Z0(z2);
        this.u.A(z2);
    }

    public boolean C() {
        Boolean bool;
        c cVar = this.K;
        if (cVar == null || (bool = cVar.m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final boolean C0() {
        return this.f1468b >= 4;
    }

    /* access modifiers changed from: package-private */
    public boolean C1(MenuItem menuItem) {
        if (this.z) {
            return false;
        }
        if ((!this.D || !this.E || !a1(menuItem)) && !this.u.B(menuItem)) {
            return false;
        }
        return true;
    }

    public boolean D() {
        Boolean bool;
        c cVar = this.K;
        if (cVar == null || (bool = cVar.l) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final boolean D0() {
        k kVar = this.s;
        if (kVar == null) {
            return false;
        }
        return kVar.v0();
    }

    /* access modifiers changed from: package-private */
    public void D1(Menu menu) {
        if (!this.z) {
            if (this.D && this.E) {
                b1(menu);
            }
            this.u.C(menu);
        }
    }

    /* access modifiers changed from: package-private */
    public View E() {
        c cVar = this.K;
        if (cVar == null) {
            return null;
        }
        return cVar.f1476a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r1.H;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean E0() {
        /*
            r1 = this;
            boolean r0 = r1.t0()
            if (r0 == 0) goto L_0x0020
            boolean r0 = r1.v0()
            if (r0 != 0) goto L_0x0020
            android.view.View r0 = r1.H
            if (r0 == 0) goto L_0x0020
            android.os.IBinder r0 = r0.getWindowToken()
            if (r0 == 0) goto L_0x0020
            android.view.View r0 = r1.H
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0020
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.E0():boolean");
    }

    /* access modifiers changed from: package-private */
    public void E1() {
        this.u.E();
        if (this.H != null) {
            this.S.a(g.a.ON_PAUSE);
        }
        this.R.i(g.a.ON_PAUSE);
        this.f1468b = 3;
        this.F = false;
        c1();
        if (!this.F) {
            throw new v("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    /* access modifiers changed from: package-private */
    public Animator F() {
        c cVar = this.K;
        if (cVar == null) {
            return null;
        }
        return cVar.f1477b;
    }

    /* access modifiers changed from: package-private */
    public void F0() {
        this.u.D0();
    }

    /* access modifiers changed from: package-private */
    public void F1(boolean z2) {
        d1(z2);
        this.u.F(z2);
    }

    public void G0(Bundle bundle) {
        this.F = true;
    }

    /* access modifiers changed from: package-private */
    public boolean G1(Menu menu) {
        boolean z2 = false;
        if (this.z) {
            return false;
        }
        if (this.D && this.E) {
            z2 = true;
            e1(menu);
        }
        return z2 | this.u.G(menu);
    }

    public void H0(int i2, int i3, Intent intent) {
    }

    /* access modifiers changed from: package-private */
    public void H1() {
        boolean t0 = this.s.t0(this);
        Boolean bool = this.k;
        if (bool == null || bool.booleanValue() != t0) {
            this.k = Boolean.valueOf(t0);
            f1(t0);
            this.u.H();
        }
    }

    public final SavedStateRegistry I() {
        return this.V.b();
    }

    @Deprecated
    public void I0(Activity activity) {
        this.F = true;
    }

    /* access modifiers changed from: package-private */
    public void I1() {
        this.u.D0();
        this.u.R(true);
        this.f1468b = 4;
        this.F = false;
        i1();
        if (this.F) {
            this.R.i(g.a.ON_RESUME);
            if (this.H != null) {
                this.S.a(g.a.ON_RESUME);
            }
            this.u.I();
            return;
        }
        throw new v("Fragment " + this + " did not call through to super.onResume()");
    }

    public final Bundle J() {
        return this.g;
    }

    public void J0(Context context) {
        this.F = true;
        h<?> hVar = this.t;
        Activity e2 = hVar == null ? null : hVar.e();
        if (e2 != null) {
            this.F = false;
            I0(e2);
        }
    }

    /* access modifiers changed from: package-private */
    public void J1(Bundle bundle) {
        k1(bundle);
        this.V.d(bundle);
        Parcelable S0 = this.u.S0();
        if (S0 != null) {
            bundle.putParcelable("android:support:fragments", S0);
        }
    }

    public final k K() {
        if (this.t != null) {
            return this.u;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public void K0(Fragment fragment) {
    }

    /* access modifiers changed from: package-private */
    public void K1() {
        this.u.D0();
        this.u.R(true);
        this.f1468b = 3;
        this.F = false;
        l1();
        if (this.F) {
            this.R.i(g.a.ON_START);
            if (this.H != null) {
                this.S.a(g.a.ON_START);
            }
            this.u.J();
            return;
        }
        throw new v("Fragment " + this + " did not call through to super.onStart()");
    }

    public Context L() {
        h<?> hVar = this.t;
        if (hVar == null) {
            return null;
        }
        return hVar.g();
    }

    public boolean L0(MenuItem menuItem) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void L1() {
        this.u.L();
        if (this.H != null) {
            this.S.a(g.a.ON_STOP);
        }
        this.R.i(g.a.ON_STOP);
        this.f1468b = 2;
        this.F = false;
        m1();
        if (!this.F) {
            throw new v("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    public Object M() {
        c cVar = this.K;
        if (cVar == null) {
            return null;
        }
        return cVar.f1481f;
    }

    public void M0(Bundle bundle) {
        this.F = true;
        R1(bundle);
        if (!this.u.u0(1)) {
            this.u.v();
        }
    }

    public void M1(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    /* access modifiers changed from: package-private */
    public androidx.core.app.k N() {
        c cVar = this.K;
        if (cVar == null) {
            return null;
        }
        return cVar.n;
    }

    public Animation N0(int i2, boolean z2, int i3) {
        return null;
    }

    public final void N1(String[] strArr, int i2) {
        h<?> hVar = this.t;
        if (hVar != null) {
            hVar.l(this, strArr, i2);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public Animator O0(int i2, boolean z2, int i3) {
        return null;
    }

    public final c O1() {
        c z2 = z();
        if (z2 != null) {
            return z2;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public Object P() {
        c cVar = this.K;
        if (cVar == null) {
            return null;
        }
        return cVar.h;
    }

    public void P0(Menu menu, MenuInflater menuInflater) {
    }

    public final Context P1() {
        Context L2 = L();
        if (L2 != null) {
            return L2;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* access modifiers changed from: package-private */
    public androidx.core.app.k Q() {
        c cVar = this.K;
        if (cVar == null) {
            return null;
        }
        return cVar.o;
    }

    public View Q0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = this.W;
        if (i2 != 0) {
            return layoutInflater.inflate(i2, viewGroup, false);
        }
        return null;
    }

    public final View Q1() {
        View p0 = p0();
        if (p0 != null) {
            return p0;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public void R0() {
        this.F = true;
    }

    /* access modifiers changed from: package-private */
    public void R1(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.u.Q0(parcelable);
            this.u.v();
        }
    }

    public void S0() {
    }

    /* access modifiers changed from: package-private */
    public final void S1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f1470d;
        if (sparseArray != null) {
            this.H.restoreHierarchyState(sparseArray);
            this.f1470d = null;
        }
        this.F = false;
        o1(bundle);
        if (!this.F) {
            throw new v("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.H != null) {
            this.S.a(g.a.ON_CREATE);
        }
    }

    public final Object T() {
        h<?> hVar = this.t;
        if (hVar == null) {
            return null;
        }
        return hVar.j();
    }

    public void T0() {
        this.F = true;
    }

    /* access modifiers changed from: package-private */
    public void T1(View view) {
        v().f1476a = view;
    }

    public final int U() {
        return this.w;
    }

    public void U0() {
        this.F = true;
    }

    /* access modifiers changed from: package-private */
    public void U1(Animator animator) {
        v().f1477b = animator;
    }

    public LayoutInflater V0(Bundle bundle) {
        return X(bundle);
    }

    public void V1(Bundle bundle) {
        if (this.s == null || !D0()) {
            this.g = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public void W0(boolean z2) {
    }

    public void W1(boolean z2) {
        if (this.D != z2) {
            this.D = z2;
            if (t0() && !v0()) {
                this.t.p();
            }
        }
    }

    @Deprecated
    public LayoutInflater X(Bundle bundle) {
        h<?> hVar = this.t;
        if (hVar != null) {
            LayoutInflater k2 = hVar.k();
            a.h.k.f.b(k2, this.u.i0());
            return k2;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void X0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.F = true;
    }

    /* access modifiers changed from: package-private */
    public void X1(boolean z2) {
        v().r = z2;
    }

    /* access modifiers changed from: package-private */
    public int Y() {
        c cVar = this.K;
        if (cVar == null) {
            return 0;
        }
        return cVar.f1479d;
    }

    public void Y0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.F = true;
        h<?> hVar = this.t;
        Activity e2 = hVar == null ? null : hVar.e();
        if (e2 != null) {
            this.F = false;
            X0(e2, attributeSet, bundle);
        }
    }

    public void Y1(boolean z2) {
        if (this.E != z2) {
            this.E = z2;
            if (this.D && t0() && !v0()) {
                this.t.p();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int Z() {
        c cVar = this.K;
        if (cVar == null) {
            return 0;
        }
        return cVar.f1480e;
    }

    public void Z0(boolean z2) {
    }

    /* access modifiers changed from: package-private */
    public void Z1(int i2) {
        if (this.K != null || i2 != 0) {
            v().f1479d = i2;
        }
    }

    public final Fragment a0() {
        return this.v;
    }

    public boolean a1(MenuItem menuItem) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void a2(int i2) {
        if (this.K != null || i2 != 0) {
            v();
            this.K.f1480e = i2;
        }
    }

    public final k b0() {
        k kVar = this.s;
        if (kVar != null) {
            return kVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public void b1(Menu menu) {
    }

    /* access modifiers changed from: package-private */
    public void b2(d dVar) {
        v();
        d dVar2 = this.K.q;
        if (dVar != dVar2) {
            if (dVar == null || dVar2 == null) {
                c cVar = this.K;
                if (cVar.p) {
                    cVar.q = dVar;
                }
                if (dVar != null) {
                    dVar.a();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    public g c() {
        return this.R;
    }

    public void c1() {
        this.F = true;
    }

    public void c2(boolean z2) {
        this.B = z2;
        k kVar = this.s;
        if (kVar == null) {
            this.C = true;
        } else if (z2) {
            kVar.f(this);
        } else {
            kVar.O0(this);
        }
    }

    public Object d0() {
        c cVar = this.K;
        if (cVar == null) {
            return null;
        }
        Object obj = cVar.i;
        return obj == X ? P() : obj;
    }

    public void d1(boolean z2) {
    }

    public final Resources e0() {
        return P1().getResources();
    }

    public void e1(Menu menu) {
    }

    /* access modifiers changed from: package-private */
    public void e2(int i2) {
        v().f1478c = i2;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final boolean f0() {
        return this.B;
    }

    public void f1(boolean z2) {
    }

    public void f2(Fragment fragment, int i2) {
        k kVar = this.s;
        k kVar2 = fragment != null ? fragment.s : null;
        if (kVar == null || kVar2 == null || kVar == kVar2) {
            Fragment fragment2 = fragment;
            while (fragment2 != null) {
                if (fragment2 != this) {
                    fragment2 = fragment2.m0();
                } else {
                    throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
                }
            }
            if (fragment == null) {
                this.i = null;
                this.h = null;
            } else if (this.s == null || fragment.s == null) {
                this.i = null;
                this.h = fragment;
            } else {
                this.i = fragment.f1472f;
                this.h = null;
            }
            this.j = i2;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
    }

    public Object g0() {
        c cVar = this.K;
        if (cVar == null) {
            return null;
        }
        Object obj = cVar.g;
        return obj == X ? M() : obj;
    }

    @Deprecated
    public void g2(boolean z2) {
        if (!this.J && z2 && this.f1468b < 3 && this.s != null && t0() && this.P) {
            this.s.E0(this);
        }
        this.J = z2;
        this.I = this.f1468b < 3 && !z2;
        if (this.f1469c != null) {
            this.f1471e = Boolean.valueOf(z2);
        }
    }

    public Object h0() {
        c cVar = this.K;
        if (cVar == null) {
            return null;
        }
        return cVar.j;
    }

    public void h1(int i2, String[] strArr, int[] iArr) {
    }

    public boolean h2(String str) {
        h<?> hVar = this.t;
        if (hVar != null) {
            return hVar.n(str);
        }
        return false;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public Object i0() {
        c cVar = this.K;
        if (cVar == null) {
            return null;
        }
        Object obj = cVar.k;
        return obj == X ? h0() : obj;
    }

    public void i1() {
        this.F = true;
    }

    public void i2(@SuppressLint({"UnknownNullness"}) Intent intent) {
        j2(intent, (Bundle) null);
    }

    /* access modifiers changed from: package-private */
    public int j0() {
        c cVar = this.K;
        if (cVar == null) {
            return 0;
        }
        return cVar.f1478c;
    }

    public void j2(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
        h<?> hVar = this.t;
        if (hVar != null) {
            hVar.o(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final String k0(int i2) {
        return e0().getString(i2);
    }

    public void k1(Bundle bundle) {
    }

    public void k2(@SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        h<?> hVar = this.t;
        if (hVar != null) {
            hVar.o(this, intent, i2, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final String l0() {
        return this.y;
    }

    public void l1() {
        this.F = true;
    }

    public void l2() {
        k kVar = this.s;
        if (kVar == null || kVar.o == null) {
            v().p = false;
        } else if (Looper.myLooper() != this.s.o.h().getLooper()) {
            this.s.o.h().postAtFrontOfQueue(new a());
        } else {
            s();
        }
    }

    public final Fragment m0() {
        String str;
        Fragment fragment = this.h;
        if (fragment != null) {
            return fragment;
        }
        k kVar = this.s;
        if (kVar == null || (str = this.i) == null) {
            return null;
        }
        return kVar.X(str);
    }

    public void m1() {
        this.F = true;
    }

    public void m2(View view) {
        view.setOnCreateContextMenuListener((View.OnCreateContextMenuListener) null);
    }

    public final int n0() {
        return this.j;
    }

    public void n1(View view, Bundle bundle) {
    }

    @Deprecated
    public boolean o0() {
        return this.J;
    }

    public void o1(Bundle bundle) {
        this.F = true;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.F = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        O1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.F = true;
    }

    public View p0() {
        return this.H;
    }

    /* access modifiers changed from: package-private */
    public void p1(Bundle bundle) {
        this.u.D0();
        this.f1468b = 2;
        this.F = false;
        G0(bundle);
        if (this.F) {
            this.u.s();
            return;
        }
        throw new v("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    /* access modifiers changed from: package-private */
    public void q1() {
        this.u.h(this.t, new b(), this);
        this.f1468b = 0;
        this.F = false;
        J0(this.t.g());
        if (!this.F) {
            throw new v("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    /* access modifiers changed from: package-private */
    public void r0() {
        q0();
        this.f1472f = UUID.randomUUID().toString();
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.r = 0;
        this.s = null;
        this.u = new l();
        this.t = null;
        this.w = 0;
        this.x = 0;
        this.y = null;
        this.z = false;
        this.A = false;
    }

    /* access modifiers changed from: package-private */
    public void r1(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.u.t(configuration);
    }

    /* access modifiers changed from: package-private */
    public void s() {
        c cVar = this.K;
        d dVar = null;
        if (cVar != null) {
            cVar.p = false;
            d dVar2 = cVar.q;
            cVar.q = null;
            dVar = dVar2;
        }
        if (dVar != null) {
            dVar.b();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean s1(MenuItem menuItem) {
        if (this.z) {
            return false;
        }
        if (!L0(menuItem) && !this.u.u(menuItem)) {
            return false;
        }
        return true;
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2) {
        k2(intent, i2, (Bundle) null);
    }

    public void t(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.w));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.x));
        printWriter.print(" mTag=");
        printWriter.println(this.y);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f1468b);
        printWriter.print(" mWho=");
        printWriter.print(this.f1472f);
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
        printWriter.print(this.z);
        printWriter.print(" mDetached=");
        printWriter.print(this.A);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.E);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.D);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.B);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.J);
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
        if (this.v != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.v);
        }
        if (this.g != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.g);
        }
        if (this.f1469c != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f1469c);
        }
        if (this.f1470d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f1470d);
        }
        Fragment m0 = m0();
        if (m0 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(m0);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.j);
        }
        if (Y() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(Y());
        }
        if (this.G != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.G);
        }
        if (this.H != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.H);
        }
        if (E() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(E());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(j0());
        }
        if (L() != null) {
            a.n.a.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.u + ":");
        k kVar = this.u;
        kVar.N(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final boolean t0() {
        return this.t != null && this.l;
    }

    /* access modifiers changed from: package-private */
    public void t1(Bundle bundle) {
        this.u.D0();
        this.f1468b = 1;
        this.F = false;
        this.V.c(bundle);
        M0(bundle);
        this.P = true;
        if (this.F) {
            this.R.i(g.a.ON_CREATE);
            return;
        }
        throw new v("Fragment " + this + " did not call through to super.onCreate()");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f1472f);
        sb.append(")");
        if (this.w != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.w));
        }
        if (this.y != null) {
            sb.append(" ");
            sb.append(this.y);
        }
        sb.append('}');
        return sb.toString();
    }

    public x.b u() {
        if (this.s != null) {
            if (this.U == null) {
                this.U = new v(O1().getApplication(), this, J());
            }
            return this.U;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final boolean u0() {
        return this.A;
    }

    /* access modifiers changed from: package-private */
    public boolean u1(Menu menu, MenuInflater menuInflater) {
        boolean z2 = false;
        if (this.z) {
            return false;
        }
        if (this.D && this.E) {
            z2 = true;
            P0(menu, menuInflater);
        }
        return z2 | this.u.w(menu, menuInflater);
    }

    public final boolean v0() {
        return this.z;
    }

    /* access modifiers changed from: package-private */
    public void v1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.u.D0();
        this.q = true;
        this.S = new u();
        View Q0 = Q0(layoutInflater, viewGroup, bundle);
        this.H = Q0;
        if (Q0 != null) {
            this.S.b();
            this.T.l(this.S);
        } else if (!this.S.d()) {
            this.S = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    /* access modifiers changed from: package-private */
    public boolean w0() {
        c cVar = this.K;
        if (cVar == null) {
            return false;
        }
        return cVar.r;
    }

    /* access modifiers changed from: package-private */
    public void w1() {
        this.u.x();
        this.R.i(g.a.ON_DESTROY);
        this.f1468b = 0;
        this.F = false;
        this.P = false;
        R0();
        if (!this.F) {
            throw new v("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean x0() {
        return this.r > 0;
    }

    /* access modifiers changed from: package-private */
    public void x1() {
        this.u.y();
        if (this.H != null) {
            this.S.a(g.a.ON_DESTROY);
        }
        this.f1468b = 1;
        this.F = false;
        T0();
        if (this.F) {
            a.n.a.a.b(this).c();
            this.q = false;
            return;
        }
        throw new v("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    /* access modifiers changed from: package-private */
    public Fragment y(String str) {
        if (str.equals(this.f1472f)) {
            return this;
        }
        return this.u.a0(str);
    }

    public final boolean y0() {
        return this.o;
    }

    /* access modifiers changed from: package-private */
    public void y1() {
        this.f1468b = -1;
        this.F = false;
        U0();
        this.O = null;
        if (!this.F) {
            throw new v("Fragment " + this + " did not call through to super.onDetach()");
        } else if (!this.u.q0()) {
            this.u.x();
            this.u = new l();
        }
    }

    public final c z() {
        h<?> hVar = this.t;
        if (hVar == null) {
            return null;
        }
        return (c) hVar.e();
    }

    /* access modifiers changed from: package-private */
    public boolean z0() {
        c cVar = this.K;
        if (cVar == null) {
            return false;
        }
        return cVar.p;
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater z1(Bundle bundle) {
        LayoutInflater V0 = V0(bundle);
        this.O = V0;
        return V0;
    }
}
