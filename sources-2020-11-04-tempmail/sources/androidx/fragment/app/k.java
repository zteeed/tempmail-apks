package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;
import androidx.fragment.app.r;
import androidx.lifecycle.g;
import androidx.lifecycle.y;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: FragmentManager */
public abstract class k {
    private static boolean F = false;
    private ArrayList<Boolean> A;
    private ArrayList<Fragment> B;
    private ArrayList<j> C;
    private m D;
    private Runnable E = new d();

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<h> f1538a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private boolean f1539b;

    /* renamed from: c  reason: collision with root package name */
    private final p f1540c = new p();

    /* renamed from: d  reason: collision with root package name */
    ArrayList<a> f1541d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<Fragment> f1542e;

    /* renamed from: f  reason: collision with root package name */
    private final i f1543f = new i(this);
    private OnBackPressedDispatcher g;
    private final androidx.activity.b h = new a(false);
    private final AtomicInteger i = new AtomicInteger();
    private ArrayList<g> j;
    private ConcurrentHashMap<Fragment, HashSet<androidx.core.os.a>> k = new ConcurrentHashMap<>();
    private final r.g l = new b();
    private final j m = new j(this);
    int n = -1;
    h<?> o;
    e p;
    private Fragment q;
    Fragment r;
    private g s = null;
    private g t = new c();
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private ArrayList<a> z;

    /* compiled from: FragmentManager */
    class a extends androidx.activity.b {
        a(boolean z) {
            super(z);
        }

        public void b() {
            k.this.o0();
        }
    }

    /* compiled from: FragmentManager */
    class b implements r.g {
        b() {
        }

        public void a(Fragment fragment, androidx.core.os.a aVar) {
            if (!aVar.b()) {
                k.this.L0(fragment, aVar);
            }
        }

        public void b(Fragment fragment, androidx.core.os.a aVar) {
            k.this.c(fragment, aVar);
        }
    }

    /* compiled from: FragmentManager */
    class c extends g {
        c() {
        }

        public Fragment a(ClassLoader classLoader, String str) {
            h<?> hVar = k.this.o;
            return hVar.a(hVar.g(), str, (Bundle) null);
        }
    }

    /* compiled from: FragmentManager */
    class d implements Runnable {
        d() {
        }

        public void run() {
            k.this.R(true);
        }
    }

    /* compiled from: FragmentManager */
    class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f1548a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f1549b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Fragment f1550c;

        e(k kVar, ViewGroup viewGroup, View view, Fragment fragment) {
            this.f1548a = viewGroup;
            this.f1549b = view;
            this.f1550c = fragment;
        }

        public void onAnimationEnd(Animator animator) {
            this.f1548a.endViewTransition(this.f1549b);
            animator.removeListener(this);
            Fragment fragment = this.f1550c;
            View view = fragment.H;
            if (view != null && fragment.z) {
                view.setVisibility(8);
            }
        }
    }

    /* compiled from: FragmentManager */
    public static abstract class f {
        public abstract void a(k kVar, Fragment fragment, Bundle bundle);

        public abstract void b(k kVar, Fragment fragment, Context context);

        public abstract void c(k kVar, Fragment fragment, Bundle bundle);

        public abstract void d(k kVar, Fragment fragment);

        public abstract void e(k kVar, Fragment fragment);

        public abstract void f(k kVar, Fragment fragment);

        public abstract void g(k kVar, Fragment fragment, Context context);

        public abstract void h(k kVar, Fragment fragment, Bundle bundle);

        public abstract void i(k kVar, Fragment fragment);

        public abstract void j(k kVar, Fragment fragment, Bundle bundle);

        public abstract void k(k kVar, Fragment fragment);

        public abstract void l(k kVar, Fragment fragment);

        public abstract void m(k kVar, Fragment fragment, View view, Bundle bundle);

        public abstract void n(k kVar, Fragment fragment);
    }

    /* compiled from: FragmentManager */
    public interface g {
        void a();
    }

    /* compiled from: FragmentManager */
    interface h {
        boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* compiled from: FragmentManager */
    private class i implements h {

        /* renamed from: a  reason: collision with root package name */
        final String f1551a;

        /* renamed from: b  reason: collision with root package name */
        final int f1552b;

        /* renamed from: c  reason: collision with root package name */
        final int f1553c;

        i(String str, int i, int i2) {
            this.f1551a = str;
            this.f1552b = i;
            this.f1553c = i2;
        }

        public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = k.this.r;
            if (fragment != null && this.f1552b < 0 && this.f1551a == null && fragment.K().H0()) {
                return false;
            }
            return k.this.J0(arrayList, arrayList2, this.f1551a, this.f1552b, this.f1553c);
        }
    }

    /* compiled from: FragmentManager */
    static class j implements Fragment.d {

        /* renamed from: a  reason: collision with root package name */
        final boolean f1555a;

        /* renamed from: b  reason: collision with root package name */
        final a f1556b;

        /* renamed from: c  reason: collision with root package name */
        private int f1557c;

        j(a aVar, boolean z) {
            this.f1555a = z;
            this.f1556b = aVar;
        }

        public void a() {
            this.f1557c++;
        }

        public void b() {
            int i = this.f1557c - 1;
            this.f1557c = i;
            if (i == 0) {
                this.f1556b.r.T0();
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            a aVar = this.f1556b;
            aVar.r.o(aVar, this.f1555a, false, false);
        }

        /* access modifiers changed from: package-private */
        public void d() {
            boolean z = this.f1557c > 0;
            for (Fragment next : this.f1556b.r.h0()) {
                next.b2((Fragment.d) null);
                if (z && next.z0()) {
                    next.l2();
                }
            }
            a aVar = this.f1556b;
            aVar.r.o(aVar, this.f1555a, !z, true);
        }

        public boolean e() {
            return this.f1557c == 0;
        }
    }

    private void D(Fragment fragment) {
        if (fragment != null && fragment.equals(X(fragment.f1472f))) {
            fragment.H1();
        }
    }

    private boolean I0(String str, int i2, int i3) {
        R(false);
        Q(true);
        Fragment fragment = this.r;
        if (fragment != null && i2 < 0 && str == null && fragment.K().H0()) {
            return true;
        }
        boolean J0 = J0(this.z, this.A, str, i2, i3);
        if (J0) {
            this.f1539b = true;
            try {
                N0(this.z, this.A);
            } finally {
                n();
            }
        }
        a1();
        M();
        this.f1540c.b();
        return J0;
    }

    /* JADX INFO: finally extract failed */
    private void K(int i2) {
        try {
            this.f1539b = true;
            this.f1540c.d(i2);
            A0(i2, false);
            this.f1539b = false;
            R(true);
        } catch (Throwable th) {
            this.f1539b = false;
            throw th;
        }
    }

    private int K0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, a.e.b<Fragment> bVar) {
        int i4 = i3;
        for (int i5 = i3 - 1; i5 >= i2; i5--) {
            a aVar = arrayList.get(i5);
            boolean booleanValue = arrayList2.get(i5).booleanValue();
            if (aVar.E() && !aVar.C(arrayList, i5 + 1, i3)) {
                if (this.C == null) {
                    this.C = new ArrayList<>();
                }
                j jVar = new j(aVar, booleanValue);
                this.C.add(jVar);
                aVar.G(jVar);
                if (booleanValue) {
                    aVar.x();
                } else {
                    aVar.y(false);
                }
                i4--;
                if (i5 != i4) {
                    arrayList.remove(i5);
                    arrayList.add(i4, aVar);
                }
                a(bVar);
            }
        }
        return i4;
    }

    private void M() {
        if (this.y) {
            this.y = false;
            Z0();
        }
    }

    private void N0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                W(arrayList, arrayList2);
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (i2 < size) {
                    if (!arrayList.get(i2).p) {
                        if (i3 != i2) {
                            U(arrayList, arrayList2, i3, i2);
                        }
                        i3 = i2 + 1;
                        if (arrayList2.get(i2).booleanValue()) {
                            while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).p) {
                                i3++;
                            }
                        }
                        U(arrayList, arrayList2, i2, i3);
                        i2 = i3 - 1;
                    }
                    i2++;
                }
                if (i3 != size) {
                    U(arrayList, arrayList2, i3, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    private void O() {
        if (!this.k.isEmpty()) {
            for (Fragment next : this.k.keySet()) {
                k(next);
                C0(next, next.j0());
            }
        }
    }

    private void P0() {
        if (this.j != null) {
            for (int i2 = 0; i2 < this.j.size(); i2++) {
                this.j.get(i2).a();
            }
        }
    }

    private void Q(boolean z2) {
        if (this.f1539b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.o == null) {
            if (this.x) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() == this.o.h().getLooper()) {
            if (!z2) {
                m();
            }
            if (this.z == null) {
                this.z = new ArrayList<>();
                this.A = new ArrayList<>();
            }
            this.f1539b = true;
            try {
                W((ArrayList<a>) null, (ArrayList<Boolean>) null);
            } finally {
                this.f1539b = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    static int R0(int i2) {
        if (i2 == 4097) {
            return 8194;
        }
        if (i2 != 4099) {
            return i2 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    private static void T(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            a aVar = arrayList.get(i2);
            boolean z2 = true;
            if (arrayList2.get(i2).booleanValue()) {
                aVar.t(-1);
                if (i2 != i3 - 1) {
                    z2 = false;
                }
                aVar.y(z2);
            } else {
                aVar.t(1);
                aVar.x();
            }
            i2++;
        }
    }

    private void U(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        int i4;
        ArrayList<a> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i5 = i2;
        int i6 = i3;
        boolean z2 = arrayList3.get(i5).p;
        ArrayList<Fragment> arrayList5 = this.B;
        if (arrayList5 == null) {
            this.B = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.B.addAll(this.f1540c.m());
        Fragment l0 = l0();
        boolean z3 = false;
        for (int i7 = i5; i7 < i6; i7++) {
            a aVar = arrayList3.get(i7);
            if (!arrayList4.get(i7).booleanValue()) {
                l0 = aVar.z(this.B, l0);
            } else {
                l0 = aVar.H(this.B, l0);
            }
            z3 = z3 || aVar.g;
        }
        this.B.clear();
        if (!z2) {
            r.C(this, arrayList, arrayList2, i2, i3, false, this.l);
        }
        T(arrayList, arrayList2, i2, i3);
        if (z2) {
            a.e.b bVar = new a.e.b();
            a(bVar);
            int K0 = K0(arrayList, arrayList2, i2, i3, bVar);
            y0(bVar);
            i4 = K0;
        } else {
            i4 = i6;
        }
        if (i4 != i5 && z2) {
            r.C(this, arrayList, arrayList2, i2, i4, true, this.l);
            A0(this.n, true);
        }
        while (i5 < i6) {
            a aVar2 = arrayList3.get(i5);
            if (arrayList4.get(i5).booleanValue() && aVar2.t >= 0) {
                aVar2.t = -1;
            }
            aVar2.F();
            i5++;
        }
        if (z3) {
            P0();
        }
    }

    private void W(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<j> arrayList3 = this.C;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            j jVar = this.C.get(i2);
            if (arrayList != null && !jVar.f1555a && (indexOf2 = arrayList.indexOf(jVar.f1556b)) != -1 && arrayList2 != null && arrayList2.get(indexOf2).booleanValue()) {
                this.C.remove(i2);
                i2--;
                size--;
                jVar.c();
            } else if (jVar.e() || (arrayList != null && jVar.f1556b.C(arrayList, 0, arrayList.size()))) {
                this.C.remove(i2);
                i2--;
                size--;
                if (arrayList == null || jVar.f1555a || (indexOf = arrayList.indexOf(jVar.f1556b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                    jVar.d();
                } else {
                    jVar.c();
                }
            }
            i2++;
        }
    }

    private void X0(Fragment fragment) {
        ViewGroup f0 = f0(fragment);
        if (f0 != null) {
            if (f0.getTag(a.k.b.visible_removing_fragment_view_tag) == null) {
                f0.setTag(a.k.b.visible_removing_fragment_view_tag, fragment);
            }
            ((Fragment) f0.getTag(a.k.b.visible_removing_fragment_view_tag)).Z1(fragment.Y());
        }
    }

    private void Z0() {
        for (Fragment next : this.f1540c.k()) {
            if (next != null) {
                E0(next);
            }
        }
    }

    private void a(a.e.b<Fragment> bVar) {
        int i2 = this.n;
        if (i2 >= 1) {
            int min = Math.min(i2, 3);
            for (Fragment next : this.f1540c.m()) {
                if (next.f1468b < min) {
                    C0(next, min);
                    if (next.H != null && !next.z && next.L) {
                        bVar.add(next);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (d0() <= 0) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (t0(r3.q) == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r0.f(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r0 = r3.h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a1() {
        /*
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.k$h> r0 = r3.f1538a
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.k$h> r1 = r3.f1538a     // Catch:{ all -> 0x002a }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002a }
            r2 = 1
            if (r1 != 0) goto L_0x0013
            androidx.activity.b r1 = r3.h     // Catch:{ all -> 0x002a }
            r1.f(r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            androidx.activity.b r0 = r3.h
            int r1 = r3.d0()
            if (r1 <= 0) goto L_0x0025
            androidx.fragment.app.Fragment r1 = r3.q
            boolean r1 = r3.t0(r1)
            if (r1 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            r0.f(r2)
            return
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.k.a1():void");
    }

    private void b0() {
        if (this.C != null) {
            while (!this.C.isEmpty()) {
                this.C.remove(0).d();
            }
        }
    }

    private boolean c0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f1538a) {
            if (this.f1538a.isEmpty()) {
                return false;
            }
            int size = this.f1538a.size();
            boolean z2 = false;
            for (int i2 = 0; i2 < size; i2++) {
                z2 |= this.f1538a.get(i2).a(arrayList, arrayList2);
            }
            this.f1538a.clear();
            this.o.h().removeCallbacks(this.E);
            return z2;
        }
    }

    private m e0(Fragment fragment) {
        return this.D.i(fragment);
    }

    private ViewGroup f0(Fragment fragment) {
        if (fragment.x > 0 && this.p.d()) {
            View b2 = this.p.b(fragment.x);
            if (b2 instanceof ViewGroup) {
                return (ViewGroup) b2;
            }
        }
        return null;
    }

    private void k(Fragment fragment) {
        HashSet hashSet = this.k.get(fragment);
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((androidx.core.os.a) it.next()).a();
            }
            hashSet.clear();
            q(fragment);
            this.k.remove(fragment);
        }
    }

    private void m() {
        if (v0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    static Fragment m0(View view) {
        Object tag = view.getTag(a.k.b.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    private void n() {
        this.f1539b = false;
        this.A.clear();
        this.z.clear();
    }

    private void p(Fragment fragment) {
        Animator animator;
        if (fragment.H != null) {
            d.C0045d b2 = d.b(this.o.g(), this.p, fragment, !fragment.z);
            if (b2 == null || (animator = b2.f1521b) == null) {
                if (b2 != null) {
                    fragment.H.startAnimation(b2.f1520a);
                    b2.f1520a.start();
                }
                fragment.H.setVisibility((!fragment.z || fragment.w0()) ? 0 : 8);
                if (fragment.w0()) {
                    fragment.X1(false);
                }
            } else {
                animator.setTarget(fragment.H);
                if (!fragment.z) {
                    fragment.H.setVisibility(0);
                } else if (fragment.w0()) {
                    fragment.X1(false);
                } else {
                    ViewGroup viewGroup = fragment.G;
                    View view = fragment.H;
                    viewGroup.startViewTransition(view);
                    b2.f1521b.addListener(new e(this, viewGroup, view, fragment));
                }
                b2.f1521b.start();
            }
        }
        if (fragment.l && s0(fragment)) {
            this.u = true;
        }
        fragment.M = false;
        fragment.W0(fragment.z);
    }

    private void q(Fragment fragment) {
        fragment.x1();
        this.m.n(fragment, false);
        fragment.G = null;
        fragment.H = null;
        fragment.S = null;
        fragment.T.l(null);
        fragment.o = false;
    }

    static boolean r0(int i2) {
        return F || Log.isLoggable("FragmentManager", i2);
    }

    private boolean s0(Fragment fragment) {
        return (fragment.D && fragment.E) || fragment.u.l();
    }

    private void x0(o oVar) {
        Fragment i2 = oVar.i();
        if (this.f1540c.c(i2.f1472f)) {
            if (r0(2)) {
                Log.v("FragmentManager", "Removed fragment from active set " + i2);
            }
            this.f1540c.o(oVar);
            O0(i2);
        }
    }

    private void y0(a.e.b<Fragment> bVar) {
        int size = bVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment s2 = bVar.s(i2);
            if (!s2.l) {
                View Q1 = s2.Q1();
                s2.N = Q1.getAlpha();
                Q1.setAlpha(0.0f);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void A(boolean z2) {
        for (Fragment next : this.f1540c.m()) {
            if (next != null) {
                next.B1(z2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void A0(int i2, boolean z2) {
        h<?> hVar;
        if (this.o == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        } else if (z2 || i2 != this.n) {
            this.n = i2;
            for (Fragment z0 : this.f1540c.m()) {
                z0(z0);
            }
            for (Fragment next : this.f1540c.k()) {
                if (next != null && !next.L) {
                    z0(next);
                }
            }
            Z0();
            if (this.u && (hVar = this.o) != null && this.n == 4) {
                hVar.p();
                this.u = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean B(MenuItem menuItem) {
        if (this.n < 1) {
            return false;
        }
        for (Fragment next : this.f1540c.m()) {
            if (next != null && next.C1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void B0(Fragment fragment) {
        C0(fragment, this.n);
    }

    /* access modifiers changed from: package-private */
    public void C(Menu menu) {
        if (this.n >= 1) {
            for (Fragment next : this.f1540c.m()) {
                if (next != null) {
                    next.D1(menu);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        if (r2 != 3) goto L_0x01f5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C0(androidx.fragment.app.Fragment r13, int r14) {
        /*
            r12 = this;
            androidx.fragment.app.p r0 = r12.f1540c
            java.lang.String r1 = r13.f1472f
            androidx.fragment.app.o r0 = r0.l(r1)
            r1 = 1
            if (r0 != 0) goto L_0x0015
            androidx.fragment.app.o r0 = new androidx.fragment.app.o
            androidx.fragment.app.j r2 = r12.m
            r0.<init>(r2, r13)
            r0.q(r1)
        L_0x0015:
            int r2 = r0.c()
            int r14 = java.lang.Math.min(r14, r2)
            int r2 = r13.f1468b
            r3 = 0
            java.lang.String r4 = "FragmentManager"
            r5 = -1
            r6 = 2
            r7 = 3
            if (r2 > r14) goto L_0x0102
            if (r2 >= r14) goto L_0x0034
            java.util.concurrent.ConcurrentHashMap<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.a>> r2 = r12.k
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0034
            r12.k(r13)
        L_0x0034:
            int r2 = r13.f1468b
            if (r2 == r5) goto L_0x0042
            if (r2 == 0) goto L_0x00df
            if (r2 == r1) goto L_0x00e4
            if (r2 == r6) goto L_0x00f6
            if (r2 == r7) goto L_0x00fb
            goto L_0x01f5
        L_0x0042:
            if (r14 <= r5) goto L_0x00df
            boolean r2 = r0(r7)
            if (r2 == 0) goto L_0x005e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r8 = "moveto ATTACHED: "
            r2.append(r8)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r4, r2)
        L_0x005e:
            androidx.fragment.app.Fragment r2 = r13.h
            java.lang.String r8 = " that does not belong to this FragmentManager!"
            java.lang.String r9 = " declared target fragment "
            java.lang.String r10 = "Fragment "
            if (r2 == 0) goto L_0x00a6
            java.lang.String r11 = r2.f1472f
            androidx.fragment.app.Fragment r11 = r12.X(r11)
            boolean r2 = r2.equals(r11)
            if (r2 == 0) goto L_0x0086
            androidx.fragment.app.Fragment r2 = r13.h
            int r11 = r2.f1468b
            if (r11 >= r1) goto L_0x007d
            r12.C0(r2, r1)
        L_0x007d:
            androidx.fragment.app.Fragment r2 = r13.h
            java.lang.String r2 = r2.f1472f
            r13.i = r2
            r13.h = r3
            goto L_0x00a6
        L_0x0086:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            r0.append(r13)
            r0.append(r9)
            androidx.fragment.app.Fragment r13 = r13.h
            r0.append(r13)
            r0.append(r8)
            java.lang.String r13 = r0.toString()
            r14.<init>(r13)
            throw r14
        L_0x00a6:
            java.lang.String r2 = r13.i
            if (r2 == 0) goto L_0x00d8
            androidx.fragment.app.Fragment r2 = r12.X(r2)
            if (r2 == 0) goto L_0x00b8
            int r3 = r2.f1468b
            if (r3 >= r1) goto L_0x00d8
            r12.C0(r2, r1)
            goto L_0x00d8
        L_0x00b8:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            r0.append(r13)
            r0.append(r9)
            java.lang.String r13 = r13.i
            r0.append(r13)
            r0.append(r8)
            java.lang.String r13 = r0.toString()
            r14.<init>(r13)
            throw r14
        L_0x00d8:
            androidx.fragment.app.h<?> r2 = r12.o
            androidx.fragment.app.Fragment r3 = r12.q
            r0.b(r2, r12, r3)
        L_0x00df:
            if (r14 <= 0) goto L_0x00e4
            r0.d()
        L_0x00e4:
            if (r14 <= r5) goto L_0x00e9
            r0.h()
        L_0x00e9:
            if (r14 <= r1) goto L_0x00f6
            androidx.fragment.app.e r1 = r12.p
            r0.e(r1)
            r0.a()
            r0.l()
        L_0x00f6:
            if (r14 <= r6) goto L_0x00fb
            r0.r()
        L_0x00fb:
            if (r14 <= r7) goto L_0x01f5
            r0.m()
            goto L_0x01f5
        L_0x0102:
            if (r2 <= r14) goto L_0x01f5
            if (r2 == 0) goto L_0x01ec
            r8 = 0
            if (r2 == r1) goto L_0x01ab
            if (r2 == r6) goto L_0x011c
            if (r2 == r7) goto L_0x0117
            r9 = 4
            if (r2 == r9) goto L_0x0112
            goto L_0x01f5
        L_0x0112:
            if (r14 >= r9) goto L_0x0117
            r0.j()
        L_0x0117:
            if (r14 >= r7) goto L_0x011c
            r0.s()
        L_0x011c:
            if (r14 >= r6) goto L_0x01ab
            boolean r2 = r0(r7)
            if (r2 == 0) goto L_0x0138
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "movefrom ACTIVITY_CREATED: "
            r2.append(r6)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r4, r2)
        L_0x0138:
            android.view.View r2 = r13.H
            if (r2 == 0) goto L_0x014b
            androidx.fragment.app.h<?> r2 = r12.o
            boolean r2 = r2.m(r13)
            if (r2 == 0) goto L_0x014b
            android.util.SparseArray<android.os.Parcelable> r2 = r13.f1470d
            if (r2 != 0) goto L_0x014b
            r0.p()
        L_0x014b:
            android.view.View r2 = r13.H
            if (r2 == 0) goto L_0x019c
            android.view.ViewGroup r6 = r13.G
            if (r6 == 0) goto L_0x019c
            r6.endViewTransition(r2)
            android.view.View r2 = r13.H
            r2.clearAnimation()
            boolean r2 = r13.B0()
            if (r2 != 0) goto L_0x019c
            int r2 = r12.n
            r6 = 0
            if (r2 <= r5) goto L_0x0184
            boolean r2 = r12.x
            if (r2 != 0) goto L_0x0184
            android.view.View r2 = r13.H
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x0184
            float r2 = r13.N
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x0184
            androidx.fragment.app.h<?> r2 = r12.o
            android.content.Context r2 = r2.g()
            androidx.fragment.app.e r3 = r12.p
            androidx.fragment.app.d$d r3 = androidx.fragment.app.d.b(r2, r3, r13, r8)
        L_0x0184:
            r13.N = r6
            android.view.ViewGroup r2 = r13.G
            android.view.View r5 = r13.H
            if (r3 == 0) goto L_0x0194
            r13.e2(r14)
            androidx.fragment.app.r$g r6 = r12.l
            androidx.fragment.app.d.a(r13, r3, r6)
        L_0x0194:
            r2.removeView(r5)
            android.view.ViewGroup r3 = r13.G
            if (r2 == r3) goto L_0x019c
            return
        L_0x019c:
            java.util.concurrent.ConcurrentHashMap<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.a>> r2 = r12.k
            java.lang.Object r2 = r2.get(r13)
            if (r2 != 0) goto L_0x01a8
            r12.q(r13)
            goto L_0x01ab
        L_0x01a8:
            r13.e2(r14)
        L_0x01ab:
            if (r14 >= r1) goto L_0x01ec
            boolean r2 = r13.m
            if (r2 == 0) goto L_0x01b8
            boolean r2 = r13.x0()
            if (r2 != 0) goto L_0x01b8
            r8 = 1
        L_0x01b8:
            if (r8 != 0) goto L_0x01d6
            androidx.fragment.app.m r2 = r12.D
            boolean r2 = r2.o(r13)
            if (r2 == 0) goto L_0x01c3
            goto L_0x01d6
        L_0x01c3:
            java.lang.String r2 = r13.i
            if (r2 == 0) goto L_0x01d9
            androidx.fragment.app.Fragment r2 = r12.X(r2)
            if (r2 == 0) goto L_0x01d9
            boolean r3 = r2.f0()
            if (r3 == 0) goto L_0x01d9
            r13.h = r2
            goto L_0x01d9
        L_0x01d6:
            r12.x0(r0)
        L_0x01d9:
            java.util.concurrent.ConcurrentHashMap<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.a>> r2 = r12.k
            java.lang.Object r2 = r2.get(r13)
            if (r2 == 0) goto L_0x01e5
            r13.e2(r14)
            goto L_0x01ed
        L_0x01e5:
            androidx.fragment.app.h<?> r1 = r12.o
            androidx.fragment.app.m r2 = r12.D
            r0.f(r1, r2)
        L_0x01ec:
            r1 = r14
        L_0x01ed:
            if (r1 >= 0) goto L_0x01f4
            androidx.fragment.app.m r14 = r12.D
            r0.g(r14)
        L_0x01f4:
            r14 = r1
        L_0x01f5:
            int r0 = r13.f1468b
            if (r0 == r14) goto L_0x0227
            boolean r0 = r0(r7)
            if (r0 == 0) goto L_0x0225
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveToState: Fragment state for "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r1 = " not updated inline; expected state "
            r0.append(r1)
            r0.append(r14)
            java.lang.String r1 = " found "
            r0.append(r1)
            int r1 = r13.f1468b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r4, r0)
        L_0x0225:
            r13.f1468b = r14
        L_0x0227:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.k.C0(androidx.fragment.app.Fragment, int):void");
    }

    /* access modifiers changed from: package-private */
    public void D0() {
        this.v = false;
        this.w = false;
        for (Fragment next : this.f1540c.m()) {
            if (next != null) {
                next.F0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void E() {
        K(3);
    }

    /* access modifiers changed from: package-private */
    public void E0(Fragment fragment) {
        if (!fragment.I) {
            return;
        }
        if (this.f1539b) {
            this.y = true;
            return;
        }
        fragment.I = false;
        C0(fragment, this.n);
    }

    /* access modifiers changed from: package-private */
    public void F(boolean z2) {
        for (Fragment next : this.f1540c.m()) {
            if (next != null) {
                next.F1(z2);
            }
        }
    }

    public void F0() {
        P(new i((String) null, -1, 0), false);
    }

    /* access modifiers changed from: package-private */
    public boolean G(Menu menu) {
        boolean z2 = false;
        if (this.n < 1) {
            return false;
        }
        for (Fragment next : this.f1540c.m()) {
            if (next != null && next.G1(menu)) {
                z2 = true;
            }
        }
        return z2;
    }

    public void G0(int i2, int i3) {
        if (i2 >= 0) {
            P(new i((String) null, i2, i3), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    /* access modifiers changed from: package-private */
    public void H() {
        a1();
        D(this.r);
    }

    public boolean H0() {
        return I0((String) null, -1, 0);
    }

    /* access modifiers changed from: package-private */
    public void I() {
        this.v = false;
        this.w = false;
        K(4);
    }

    /* access modifiers changed from: package-private */
    public void J() {
        this.v = false;
        this.w = false;
        K(3);
    }

    /* access modifiers changed from: package-private */
    public boolean J0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        int i4;
        ArrayList<a> arrayList3 = this.f1541d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f1541d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i2 >= 0) {
                int size2 = this.f1541d.size() - 1;
                while (size2 >= 0) {
                    a aVar = this.f1541d.get(size2);
                    if ((str != null && str.equals(aVar.A())) || (i2 >= 0 && i2 == aVar.t)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        a aVar2 = this.f1541d.get(size2);
                        if ((str == null || !str.equals(aVar2.A())) && (i2 < 0 || i2 != aVar2.t)) {
                            break;
                        }
                    }
                }
                i4 = size2;
            } else {
                i4 = -1;
            }
            if (i4 == this.f1541d.size() - 1) {
                return false;
            }
            for (int size3 = this.f1541d.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.f1541d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void L() {
        this.w = true;
        K(2);
    }

    /* access modifiers changed from: package-private */
    public void L0(Fragment fragment, androidx.core.os.a aVar) {
        HashSet hashSet = this.k.get(fragment);
        if (hashSet != null && hashSet.remove(aVar) && hashSet.isEmpty()) {
            this.k.remove(fragment);
            if (fragment.f1468b < 3) {
                q(fragment);
                C0(fragment, fragment.j0());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void M0(Fragment fragment) {
        if (r0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.r);
        }
        boolean z2 = !fragment.x0();
        if (!fragment.A || z2) {
            this.f1540c.p(fragment);
            if (s0(fragment)) {
                this.u = true;
            }
            fragment.m = true;
            X0(fragment);
        }
    }

    public void N(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f1540c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f1542e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.f1542e.get(i2).toString());
            }
        }
        ArrayList<a> arrayList2 = this.f1541d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                a aVar = this.f1541d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.v(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.f1538a) {
            int size3 = this.f1538a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size3; i4++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(this.f1538a.get(i4));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.o);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.p);
        if (this.q != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.q);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.n);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.v);
        printWriter.print(" mStopped=");
        printWriter.print(this.w);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.x);
        if (this.u) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.u);
        }
    }

    /* access modifiers changed from: package-private */
    public void O0(Fragment fragment) {
        if (v0()) {
            if (r0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.D.n(fragment) && r0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    /* access modifiers changed from: package-private */
    public void P(h hVar, boolean z2) {
        if (!z2) {
            if (this.o != null) {
                m();
            } else if (this.x) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.f1538a) {
            if (this.o != null) {
                this.f1538a.add(hVar);
                T0();
            } else if (!z2) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void Q0(Parcelable parcelable) {
        o oVar;
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            if (fragmentManagerState.f1485b != null) {
                this.f1540c.q();
                Iterator<FragmentState> it = fragmentManagerState.f1485b.iterator();
                while (it.hasNext()) {
                    FragmentState next = it.next();
                    if (next != null) {
                        Fragment h2 = this.D.h(next.f1491c);
                        if (h2 != null) {
                            if (r0(2)) {
                                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + h2);
                            }
                            oVar = new o(this.m, h2, next);
                        } else {
                            oVar = new o(this.m, this.o.g().getClassLoader(), g0(), next);
                        }
                        Fragment i2 = oVar.i();
                        i2.s = this;
                        if (r0(2)) {
                            Log.v("FragmentManager", "restoreSaveState: active (" + i2.f1472f + "): " + i2);
                        }
                        oVar.k(this.o.g().getClassLoader());
                        this.f1540c.n(oVar);
                        oVar.q(this.n);
                    }
                }
                for (Fragment next2 : this.D.k()) {
                    if (!this.f1540c.c(next2.f1472f)) {
                        if (r0(2)) {
                            Log.v("FragmentManager", "Discarding retained Fragment " + next2 + " that was not found in the set of active Fragments " + fragmentManagerState.f1485b);
                        }
                        C0(next2, 1);
                        next2.m = true;
                        C0(next2, -1);
                    }
                }
                this.f1540c.r(fragmentManagerState.f1486c);
                if (fragmentManagerState.f1487d != null) {
                    this.f1541d = new ArrayList<>(fragmentManagerState.f1487d.length);
                    int i3 = 0;
                    while (true) {
                        BackStackState[] backStackStateArr = fragmentManagerState.f1487d;
                        if (i3 >= backStackStateArr.length) {
                            break;
                        }
                        a a2 = backStackStateArr[i3].a(this);
                        if (r0(2)) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i3 + " (index " + a2.t + "): " + a2);
                            PrintWriter printWriter = new PrintWriter(new a.h.j.b("FragmentManager"));
                            a2.w("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f1541d.add(a2);
                        i3++;
                    }
                } else {
                    this.f1541d = null;
                }
                this.i.set(fragmentManagerState.f1488e);
                String str = fragmentManagerState.f1489f;
                if (str != null) {
                    Fragment X = X(str);
                    this.r = X;
                    D(X);
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public boolean R(boolean z2) {
        Q(z2);
        boolean z3 = false;
        while (c0(this.z, this.A)) {
            this.f1539b = true;
            try {
                N0(this.z, this.A);
                n();
                z3 = true;
            } catch (Throwable th) {
                n();
                throw th;
            }
        }
        a1();
        M();
        this.f1540c.b();
        return z3;
    }

    /* access modifiers changed from: package-private */
    public void S(h hVar, boolean z2) {
        if (!z2 || (this.o != null && !this.x)) {
            Q(z2);
            if (hVar.a(this.z, this.A)) {
                this.f1539b = true;
                try {
                    N0(this.z, this.A);
                } finally {
                    n();
                }
            }
            a1();
            M();
            this.f1540c.b();
        }
    }

    /* access modifiers changed from: package-private */
    public Parcelable S0() {
        int size;
        b0();
        O();
        R(true);
        this.v = true;
        ArrayList<FragmentState> s2 = this.f1540c.s();
        BackStackState[] backStackStateArr = null;
        if (s2.isEmpty()) {
            if (r0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList<String> t2 = this.f1540c.t();
        ArrayList<a> arrayList = this.f1541d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            backStackStateArr = new BackStackState[size];
            for (int i2 = 0; i2 < size; i2++) {
                backStackStateArr[i2] = new BackStackState(this.f1541d.get(i2));
                if (r0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i2 + ": " + this.f1541d.get(i2));
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f1485b = s2;
        fragmentManagerState.f1486c = t2;
        fragmentManagerState.f1487d = backStackStateArr;
        fragmentManagerState.f1488e = this.i.get();
        Fragment fragment = this.r;
        if (fragment != null) {
            fragmentManagerState.f1489f = fragment.f1472f;
        }
        return fragmentManagerState;
    }

    /* access modifiers changed from: package-private */
    public void T0() {
        synchronized (this.f1538a) {
            boolean z2 = false;
            boolean z3 = this.C != null && !this.C.isEmpty();
            if (this.f1538a.size() == 1) {
                z2 = true;
            }
            if (z3 || z2) {
                this.o.h().removeCallbacks(this.E);
                this.o.h().post(this.E);
                a1();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void U0(Fragment fragment, boolean z2) {
        ViewGroup f0 = f0(fragment);
        if (f0 != null && (f0 instanceof FragmentContainerView)) {
            ((FragmentContainerView) f0).setDrawDisappearingViewsLast(!z2);
        }
    }

    public boolean V() {
        boolean R = R(true);
        b0();
        return R;
    }

    /* access modifiers changed from: package-private */
    public void V0(Fragment fragment, g.b bVar) {
        if (!fragment.equals(X(fragment.f1472f)) || !(fragment.t == null || fragment.s == this)) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        fragment.Q = bVar;
    }

    /* access modifiers changed from: package-private */
    public void W0(Fragment fragment) {
        if (fragment == null || (fragment.equals(X(fragment.f1472f)) && (fragment.t == null || fragment.s == this))) {
            Fragment fragment2 = this.r;
            this.r = fragment;
            D(fragment2);
            D(this.r);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* access modifiers changed from: package-private */
    public Fragment X(String str) {
        return this.f1540c.f(str);
    }

    public Fragment Y(int i2) {
        return this.f1540c.g(i2);
    }

    /* access modifiers changed from: package-private */
    public void Y0(Fragment fragment) {
        if (r0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.z) {
            fragment.z = false;
            fragment.M = !fragment.M;
        }
    }

    public Fragment Z(String str) {
        return this.f1540c.h(str);
    }

    /* access modifiers changed from: package-private */
    public Fragment a0(String str) {
        return this.f1540c.i(str);
    }

    /* access modifiers changed from: package-private */
    public void b(a aVar) {
        if (this.f1541d == null) {
            this.f1541d = new ArrayList<>();
        }
        this.f1541d.add(aVar);
    }

    /* access modifiers changed from: package-private */
    public void c(Fragment fragment, androidx.core.os.a aVar) {
        if (this.k.get(fragment) == null) {
            this.k.put(fragment, new HashSet());
        }
        this.k.get(fragment).add(aVar);
    }

    /* access modifiers changed from: package-private */
    public void d(Fragment fragment) {
        if (r0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        w0(fragment);
        if (!fragment.A) {
            this.f1540c.a(fragment);
            fragment.m = false;
            if (fragment.H == null) {
                fragment.M = false;
            }
            if (s0(fragment)) {
                this.u = true;
            }
        }
    }

    public int d0() {
        ArrayList<a> arrayList = this.f1541d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public void e(g gVar) {
        if (this.j == null) {
            this.j = new ArrayList<>();
        }
        this.j.add(gVar);
    }

    /* access modifiers changed from: package-private */
    public void f(Fragment fragment) {
        if (v0()) {
            if (r0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (this.D.f(fragment) && r0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.i.getAndIncrement();
    }

    public g g0() {
        g gVar = this.s;
        if (gVar != null) {
            return gVar;
        }
        Fragment fragment = this.q;
        if (fragment != null) {
            return fragment.s.g0();
        }
        return this.t;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: androidx.activity.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: androidx.fragment.app.Fragment} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(androidx.fragment.app.h<?> r3, androidx.fragment.app.e r4, androidx.fragment.app.Fragment r5) {
        /*
            r2 = this;
            androidx.fragment.app.h<?> r0 = r2.o
            if (r0 != 0) goto L_0x004b
            r2.o = r3
            r2.p = r4
            r2.q = r5
            if (r5 == 0) goto L_0x000f
            r2.a1()
        L_0x000f:
            boolean r4 = r3 instanceof androidx.activity.c
            if (r4 == 0) goto L_0x0026
            r4 = r3
            androidx.activity.c r4 = (androidx.activity.c) r4
            androidx.activity.OnBackPressedDispatcher r0 = r4.f()
            r2.g = r0
            if (r5 == 0) goto L_0x001f
            r4 = r5
        L_0x001f:
            androidx.activity.OnBackPressedDispatcher r0 = r2.g
            androidx.activity.b r1 = r2.h
            r0.a(r4, r1)
        L_0x0026:
            if (r5 == 0) goto L_0x0031
            androidx.fragment.app.k r3 = r5.s
            androidx.fragment.app.m r3 = r3.e0(r5)
            r2.D = r3
            goto L_0x004a
        L_0x0031:
            boolean r4 = r3 instanceof androidx.lifecycle.z
            if (r4 == 0) goto L_0x0042
            androidx.lifecycle.z r3 = (androidx.lifecycle.z) r3
            androidx.lifecycle.y r3 = r3.B()
            androidx.fragment.app.m r3 = androidx.fragment.app.m.j(r3)
            r2.D = r3
            goto L_0x004a
        L_0x0042:
            androidx.fragment.app.m r3 = new androidx.fragment.app.m
            r4 = 0
            r3.<init>(r4)
            r2.D = r3
        L_0x004a:
            return
        L_0x004b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Already attached"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.k.h(androidx.fragment.app.h, androidx.fragment.app.e, androidx.fragment.app.Fragment):void");
    }

    public List<Fragment> h0() {
        return this.f1540c.m();
    }

    /* access modifiers changed from: package-private */
    public void i(Fragment fragment) {
        if (r0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.A) {
            fragment.A = false;
            if (!fragment.l) {
                this.f1540c.a(fragment);
                if (r0(2)) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                if (s0(fragment)) {
                    this.u = true;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater.Factory2 i0() {
        return this.f1543f;
    }

    public q j() {
        return new a(this);
    }

    /* access modifiers changed from: package-private */
    public j j0() {
        return this.m;
    }

    /* access modifiers changed from: package-private */
    public Fragment k0() {
        return this.q;
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        boolean z2 = false;
        for (Fragment next : this.f1540c.k()) {
            if (next != null) {
                z2 = s0(next);
                continue;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public Fragment l0() {
        return this.r;
    }

    /* access modifiers changed from: package-private */
    public y n0(Fragment fragment) {
        return this.D.l(fragment);
    }

    /* access modifiers changed from: package-private */
    public void o(a aVar, boolean z2, boolean z3, boolean z4) {
        if (z2) {
            aVar.y(z4);
        } else {
            aVar.x();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z2));
        if (z3) {
            r.C(this, arrayList, arrayList2, 0, 1, true, this.l);
        }
        if (z4) {
            A0(this.n, true);
        }
        for (Fragment next : this.f1540c.k()) {
            if (next != null && next.H != null && next.L && aVar.B(next.x)) {
                float f2 = next.N;
                if (f2 > 0.0f) {
                    next.H.setAlpha(f2);
                }
                if (z4) {
                    next.N = 0.0f;
                } else {
                    next.N = -1.0f;
                    next.L = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void o0() {
        R(true);
        if (this.h.c()) {
            H0();
        } else {
            this.g.c();
        }
    }

    /* access modifiers changed from: package-private */
    public void p0(Fragment fragment) {
        if (r0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.z) {
            fragment.z = true;
            fragment.M = true ^ fragment.M;
            X0(fragment);
        }
    }

    public boolean q0() {
        return this.x;
    }

    /* access modifiers changed from: package-private */
    public void r(Fragment fragment) {
        if (r0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.A) {
            fragment.A = true;
            if (fragment.l) {
                if (r0(2)) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                this.f1540c.p(fragment);
                if (s0(fragment)) {
                    this.u = true;
                }
                X0(fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void s() {
        this.v = false;
        this.w = false;
        K(2);
    }

    /* access modifiers changed from: package-private */
    public void t(Configuration configuration) {
        for (Fragment next : this.f1540c.m()) {
            if (next != null) {
                next.r1(configuration);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean t0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        k kVar = fragment.s;
        if (!fragment.equals(kVar.l0()) || !t0(kVar.q)) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.q;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.q)));
            sb.append("}");
        } else {
            sb.append(this.o.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.o)));
            sb.append("}");
        }
        sb.append("}}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public boolean u(MenuItem menuItem) {
        if (this.n < 1) {
            return false;
        }
        for (Fragment next : this.f1540c.m()) {
            if (next != null && next.s1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean u0(int i2) {
        return this.n >= i2;
    }

    /* access modifiers changed from: package-private */
    public void v() {
        this.v = false;
        this.w = false;
        K(1);
    }

    public boolean v0() {
        return this.v || this.w;
    }

    /* access modifiers changed from: package-private */
    public boolean w(Menu menu, MenuInflater menuInflater) {
        if (this.n < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z2 = false;
        for (Fragment next : this.f1540c.m()) {
            if (next != null && next.u1(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(next);
                z2 = true;
            }
        }
        if (this.f1542e != null) {
            for (int i2 = 0; i2 < this.f1542e.size(); i2++) {
                Fragment fragment = this.f1542e.get(i2);
                if (arrayList == null || !arrayList.contains(fragment)) {
                    fragment.S0();
                }
            }
        }
        this.f1542e = arrayList;
        return z2;
    }

    /* access modifiers changed from: package-private */
    public void w0(Fragment fragment) {
        if (!this.f1540c.c(fragment.f1472f)) {
            o oVar = new o(this.m, fragment);
            oVar.k(this.o.g().getClassLoader());
            this.f1540c.n(oVar);
            if (fragment.C) {
                if (fragment.B) {
                    f(fragment);
                } else {
                    O0(fragment);
                }
                fragment.C = false;
            }
            oVar.q(this.n);
            if (r0(2)) {
                Log.v("FragmentManager", "Added fragment to active set " + fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void x() {
        this.x = true;
        R(true);
        O();
        K(-1);
        this.o = null;
        this.p = null;
        this.q = null;
        if (this.g != null) {
            this.h.d();
            this.g = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void y() {
        K(1);
    }

    /* access modifiers changed from: package-private */
    public void z() {
        for (Fragment next : this.f1540c.m()) {
            if (next != null) {
                next.A1();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0049, code lost:
        r0 = r0.H;
        r1 = r4.G;
        r0 = r1.indexOfChild(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void z0(androidx.fragment.app.Fragment r4) {
        /*
            r3 = this;
            androidx.fragment.app.p r0 = r3.f1540c
            java.lang.String r1 = r4.f1472f
            boolean r0 = r0.c(r1)
            if (r0 != 0) goto L_0x003a
            r0 = 3
            boolean r0 = r0(r0)
            if (r0 == 0) goto L_0x0039
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Ignoring moving "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " to state "
            r0.append(r4)
            int r4 = r3.n
            r0.append(r4)
            java.lang.String r4 = "since it is not added to "
            r0.append(r4)
            r0.append(r3)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.d(r0, r4)
        L_0x0039:
            return
        L_0x003a:
            r3.B0(r4)
            android.view.View r0 = r4.H
            if (r0 == 0) goto L_0x009f
            androidx.fragment.app.p r0 = r3.f1540c
            androidx.fragment.app.Fragment r0 = r0.j(r4)
            if (r0 == 0) goto L_0x0061
            android.view.View r0 = r0.H
            android.view.ViewGroup r1 = r4.G
            int r0 = r1.indexOfChild(r0)
            android.view.View r2 = r4.H
            int r2 = r1.indexOfChild(r2)
            if (r2 >= r0) goto L_0x0061
            r1.removeViewAt(r2)
            android.view.View r2 = r4.H
            r1.addView(r2, r0)
        L_0x0061:
            boolean r0 = r4.L
            if (r0 == 0) goto L_0x009f
            android.view.ViewGroup r0 = r4.G
            if (r0 == 0) goto L_0x009f
            float r0 = r4.N
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x0075
            android.view.View r2 = r4.H
            r2.setAlpha(r0)
        L_0x0075:
            r4.N = r1
            r0 = 0
            r4.L = r0
            androidx.fragment.app.h<?> r0 = r3.o
            android.content.Context r0 = r0.g()
            androidx.fragment.app.e r1 = r3.p
            r2 = 1
            androidx.fragment.app.d$d r0 = androidx.fragment.app.d.b(r0, r1, r4, r2)
            if (r0 == 0) goto L_0x009f
            android.view.animation.Animation r1 = r0.f1520a
            if (r1 == 0) goto L_0x0093
            android.view.View r0 = r4.H
            r0.startAnimation(r1)
            goto L_0x009f
        L_0x0093:
            android.animation.Animator r1 = r0.f1521b
            android.view.View r2 = r4.H
            r1.setTarget(r2)
            android.animation.Animator r0 = r0.f1521b
            r0.start()
        L_0x009f:
            boolean r0 = r4.M
            if (r0 == 0) goto L_0x00a6
            r3.p(r4)
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.k.z0(androidx.fragment.app.Fragment):void");
    }
}
