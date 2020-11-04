package androidx.fragment.app;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.g;
import androidx.lifecycle.z;

/* compiled from: FragmentStateManager */
class o {

    /* renamed from: a  reason: collision with root package name */
    private final j f1566a;

    /* renamed from: b  reason: collision with root package name */
    private final Fragment f1567b;

    /* renamed from: c  reason: collision with root package name */
    private int f1568c = -1;

    /* compiled from: FragmentStateManager */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f1569a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.lifecycle.g$b[] r0 = androidx.lifecycle.g.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1569a = r0
                androidx.lifecycle.g$b r1 = androidx.lifecycle.g.b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1569a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.g$b r1 = androidx.lifecycle.g.b.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1569a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.g$b r1 = androidx.lifecycle.g.b.CREATED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.o.a.<clinit>():void");
        }
    }

    o(j jVar, Fragment fragment) {
        this.f1566a = jVar;
        this.f1567b = fragment;
    }

    private Bundle n() {
        Bundle bundle = new Bundle();
        this.f1567b.J1(bundle);
        this.f1566a.j(this.f1567b, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f1567b.H != null) {
            p();
        }
        if (this.f1567b.f1470d != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f1567b.f1470d);
        }
        if (!this.f1567b.J) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f1567b.J);
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (k.r0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f1567b);
        }
        Fragment fragment = this.f1567b;
        fragment.p1(fragment.f1469c);
        j jVar = this.f1566a;
        Fragment fragment2 = this.f1567b;
        jVar.a(fragment2, fragment2.f1469c, false);
    }

    /* access modifiers changed from: package-private */
    public void b(h<?> hVar, k kVar, Fragment fragment) {
        Fragment fragment2 = this.f1567b;
        fragment2.t = hVar;
        fragment2.v = fragment;
        fragment2.s = kVar;
        this.f1566a.g(fragment2, hVar.g(), false);
        this.f1567b.q1();
        Fragment fragment3 = this.f1567b;
        Fragment fragment4 = fragment3.v;
        if (fragment4 == null) {
            hVar.i(fragment3);
        } else {
            fragment4.K0(fragment3);
        }
        this.f1566a.b(this.f1567b, hVar.g(), false);
    }

    /* access modifiers changed from: package-private */
    public int c() {
        int i = this.f1568c;
        Fragment fragment = this.f1567b;
        if (fragment.n) {
            if (fragment.o) {
                i = Math.max(i, 1);
            } else {
                i = Math.min(i, 1);
            }
        }
        if (!this.f1567b.l) {
            i = Math.min(i, 1);
        }
        Fragment fragment2 = this.f1567b;
        if (fragment2.m) {
            if (fragment2.x0()) {
                i = Math.min(i, 1);
            } else {
                i = Math.min(i, -1);
            }
        }
        Fragment fragment3 = this.f1567b;
        if (fragment3.I && fragment3.f1468b < 3) {
            i = Math.min(i, 2);
        }
        int i2 = a.f1569a[this.f1567b.Q.ordinal()];
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return Math.min(i, 3);
        }
        if (i2 != 3) {
            return Math.min(i, -1);
        }
        return Math.min(i, 1);
    }

    /* access modifiers changed from: package-private */
    public void d() {
        if (k.r0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f1567b);
        }
        Fragment fragment = this.f1567b;
        if (!fragment.P) {
            this.f1566a.h(fragment, fragment.f1469c, false);
            Fragment fragment2 = this.f1567b;
            fragment2.t1(fragment2.f1469c);
            j jVar = this.f1566a;
            Fragment fragment3 = this.f1567b;
            jVar.c(fragment3, fragment3.f1469c, false);
            return;
        }
        fragment.R1(fragment.f1469c);
        this.f1567b.f1468b = 1;
    }

    /* JADX WARNING: type inference failed for: r5v15, types: [android.view.View] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(androidx.fragment.app.e r5) {
        /*
            r4 = this;
            androidx.fragment.app.Fragment r0 = r4.f1567b
            boolean r0 = r0.n
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            r0 = 3
            boolean r0 = androidx.fragment.app.k.r0(r0)
            if (r0 == 0) goto L_0x0026
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto CREATE_VIEW: "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r4.f1567b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L_0x0026:
            r0 = 0
            androidx.fragment.app.Fragment r1 = r4.f1567b
            android.view.ViewGroup r2 = r1.G
            if (r2 == 0) goto L_0x0030
            r0 = r2
            goto L_0x00a5
        L_0x0030:
            int r1 = r1.x
            if (r1 == 0) goto L_0x00a5
            r0 = -1
            if (r1 == r0) goto L_0x0087
            android.view.View r5 = r5.b(r1)
            r0 = r5
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto L_0x00a5
            androidx.fragment.app.Fragment r5 = r4.f1567b
            boolean r1 = r5.p
            if (r1 == 0) goto L_0x0047
            goto L_0x00a5
        L_0x0047:
            android.content.res.Resources r5 = r5.e0()     // Catch:{ NotFoundException -> 0x0054 }
            androidx.fragment.app.Fragment r0 = r4.f1567b     // Catch:{ NotFoundException -> 0x0054 }
            int r0 = r0.x     // Catch:{ NotFoundException -> 0x0054 }
            java.lang.String r5 = r5.getResourceName(r0)     // Catch:{ NotFoundException -> 0x0054 }
            goto L_0x0056
        L_0x0054:
            java.lang.String r5 = "unknown"
        L_0x0056:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No view found for id 0x"
            r1.append(r2)
            androidx.fragment.app.Fragment r2 = r4.f1567b
            int r2 = r2.x
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r1.append(r2)
            java.lang.String r2 = " ("
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = ") for fragment "
            r1.append(r5)
            androidx.fragment.app.Fragment r5 = r4.f1567b
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L_0x0087:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot create fragment "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r4.f1567b
            r0.append(r1)
            java.lang.String r1 = " for a container view with no id"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x00a5:
            androidx.fragment.app.Fragment r5 = r4.f1567b
            r5.G = r0
            android.os.Bundle r1 = r5.f1469c
            android.view.LayoutInflater r1 = r5.z1(r1)
            androidx.fragment.app.Fragment r2 = r4.f1567b
            android.os.Bundle r2 = r2.f1469c
            r5.v1(r1, r0, r2)
            androidx.fragment.app.Fragment r5 = r4.f1567b
            android.view.View r5 = r5.H
            if (r5 == 0) goto L_0x010d
            r1 = 0
            r5.setSaveFromParentEnabled(r1)
            androidx.fragment.app.Fragment r5 = r4.f1567b
            android.view.View r2 = r5.H
            int r3 = a.k.b.fragment_container_view_tag
            r2.setTag(r3, r5)
            if (r0 == 0) goto L_0x00d2
            androidx.fragment.app.Fragment r5 = r4.f1567b
            android.view.View r5 = r5.H
            r0.addView(r5)
        L_0x00d2:
            androidx.fragment.app.Fragment r5 = r4.f1567b
            boolean r0 = r5.z
            if (r0 == 0) goto L_0x00df
            android.view.View r5 = r5.H
            r0 = 8
            r5.setVisibility(r0)
        L_0x00df:
            androidx.fragment.app.Fragment r5 = r4.f1567b
            android.view.View r5 = r5.H
            a.h.k.u.X(r5)
            androidx.fragment.app.Fragment r5 = r4.f1567b
            android.view.View r0 = r5.H
            android.os.Bundle r2 = r5.f1469c
            r5.n1(r0, r2)
            androidx.fragment.app.j r5 = r4.f1566a
            androidx.fragment.app.Fragment r0 = r4.f1567b
            android.view.View r2 = r0.H
            android.os.Bundle r3 = r0.f1469c
            r5.m(r0, r2, r3, r1)
            androidx.fragment.app.Fragment r5 = r4.f1567b
            android.view.View r0 = r5.H
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x010b
            androidx.fragment.app.Fragment r0 = r4.f1567b
            android.view.ViewGroup r0 = r0.G
            if (r0 == 0) goto L_0x010b
            r1 = 1
        L_0x010b:
            r5.L = r1
        L_0x010d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.o.e(androidx.fragment.app.e):void");
    }

    /* access modifiers changed from: package-private */
    public void f(h<?> hVar, m mVar) {
        if (k.r0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f1567b);
        }
        Fragment fragment = this.f1567b;
        boolean z = true;
        boolean z2 = fragment.m && !fragment.x0();
        if (z2 || mVar.o(this.f1567b)) {
            if (hVar instanceof z) {
                z = mVar.m();
            } else if (hVar.g() instanceof Activity) {
                z = true ^ ((Activity) hVar.g()).isChangingConfigurations();
            }
            if (z2 || z) {
                mVar.g(this.f1567b);
            }
            this.f1567b.w1();
            this.f1566a.d(this.f1567b, false);
            return;
        }
        this.f1567b.f1468b = 0;
    }

    /* access modifiers changed from: package-private */
    public void g(m mVar) {
        if (k.r0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f1567b);
        }
        this.f1567b.y1();
        boolean z = false;
        this.f1566a.e(this.f1567b, false);
        Fragment fragment = this.f1567b;
        fragment.f1468b = -1;
        fragment.t = null;
        fragment.v = null;
        fragment.s = null;
        if (fragment.m && !fragment.x0()) {
            z = true;
        }
        if (z || mVar.o(this.f1567b)) {
            if (k.r0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f1567b);
            }
            this.f1567b.r0();
        }
    }

    /* access modifiers changed from: package-private */
    public void h() {
        Fragment fragment = this.f1567b;
        if (fragment.n && fragment.o && !fragment.q) {
            if (k.r0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f1567b);
            }
            Fragment fragment2 = this.f1567b;
            fragment2.v1(fragment2.z1(fragment2.f1469c), (ViewGroup) null, this.f1567b.f1469c);
            View view = this.f1567b.H;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f1567b;
                if (fragment3.z) {
                    fragment3.H.setVisibility(8);
                }
                Fragment fragment4 = this.f1567b;
                fragment4.n1(fragment4.H, fragment4.f1469c);
                j jVar = this.f1566a;
                Fragment fragment5 = this.f1567b;
                jVar.m(fragment5, fragment5.H, fragment5.f1469c, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment i() {
        return this.f1567b;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        if (k.r0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f1567b);
        }
        this.f1567b.E1();
        this.f1566a.f(this.f1567b, false);
    }

    /* access modifiers changed from: package-private */
    public void k(ClassLoader classLoader) {
        Bundle bundle = this.f1567b.f1469c;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            Fragment fragment = this.f1567b;
            fragment.f1470d = fragment.f1469c.getSparseParcelableArray("android:view_state");
            Fragment fragment2 = this.f1567b;
            fragment2.i = fragment2.f1469c.getString("android:target_state");
            Fragment fragment3 = this.f1567b;
            if (fragment3.i != null) {
                fragment3.j = fragment3.f1469c.getInt("android:target_req_state", 0);
            }
            Fragment fragment4 = this.f1567b;
            Boolean bool = fragment4.f1471e;
            if (bool != null) {
                fragment4.J = bool.booleanValue();
                this.f1567b.f1471e = null;
            } else {
                fragment4.J = fragment4.f1469c.getBoolean("android:user_visible_hint", true);
            }
            Fragment fragment5 = this.f1567b;
            if (!fragment5.J) {
                fragment5.I = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void l() {
        if (k.r0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this.f1567b);
        }
        Fragment fragment = this.f1567b;
        if (fragment.H != null) {
            fragment.S1(fragment.f1469c);
        }
        this.f1567b.f1469c = null;
    }

    /* access modifiers changed from: package-private */
    public void m() {
        if (k.r0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f1567b);
        }
        this.f1567b.I1();
        this.f1566a.i(this.f1567b, false);
        Fragment fragment = this.f1567b;
        fragment.f1469c = null;
        fragment.f1470d = null;
    }

    /* access modifiers changed from: package-private */
    public FragmentState o() {
        FragmentState fragmentState = new FragmentState(this.f1567b);
        if (this.f1567b.f1468b <= -1 || fragmentState.n != null) {
            fragmentState.n = this.f1567b.f1469c;
        } else {
            Bundle n = n();
            fragmentState.n = n;
            if (this.f1567b.i != null) {
                if (n == null) {
                    fragmentState.n = new Bundle();
                }
                fragmentState.n.putString("android:target_state", this.f1567b.i);
                int i = this.f1567b.j;
                if (i != 0) {
                    fragmentState.n.putInt("android:target_req_state", i);
                }
            }
        }
        return fragmentState;
    }

    /* access modifiers changed from: package-private */
    public void p() {
        if (this.f1567b.H != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f1567b.H.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f1567b.f1470d = sparseArray;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void q(int i) {
        this.f1568c = i;
    }

    /* access modifiers changed from: package-private */
    public void r() {
        if (k.r0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f1567b);
        }
        this.f1567b.K1();
        this.f1566a.k(this.f1567b, false);
    }

    /* access modifiers changed from: package-private */
    public void s() {
        if (k.r0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f1567b);
        }
        this.f1567b.L1();
        this.f1566a.l(this.f1567b, false);
    }

    o(j jVar, ClassLoader classLoader, g gVar, FragmentState fragmentState) {
        this.f1566a = jVar;
        this.f1567b = gVar.a(classLoader, fragmentState.f1490b);
        Bundle bundle = fragmentState.k;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        this.f1567b.V1(fragmentState.k);
        Fragment fragment = this.f1567b;
        fragment.f1472f = fragmentState.f1491c;
        fragment.n = fragmentState.f1492d;
        fragment.p = true;
        fragment.w = fragmentState.f1493e;
        fragment.x = fragmentState.f1494f;
        fragment.y = fragmentState.g;
        fragment.B = fragmentState.h;
        fragment.m = fragmentState.i;
        fragment.A = fragmentState.j;
        fragment.z = fragmentState.l;
        fragment.Q = g.b.values()[fragmentState.m];
        Bundle bundle2 = fragmentState.n;
        if (bundle2 != null) {
            this.f1567b.f1469c = bundle2;
        } else {
            this.f1567b.f1469c = new Bundle();
        }
        if (k.r0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + this.f1567b);
        }
    }

    o(j jVar, Fragment fragment, FragmentState fragmentState) {
        this.f1566a = jVar;
        this.f1567b = fragment;
        fragment.f1470d = null;
        fragment.r = 0;
        fragment.o = false;
        fragment.l = false;
        Fragment fragment2 = fragment.h;
        fragment.i = fragment2 != null ? fragment2.f1472f : null;
        Fragment fragment3 = this.f1567b;
        fragment3.h = null;
        Bundle bundle = fragmentState.n;
        if (bundle != null) {
            fragment3.f1469c = bundle;
        } else {
            fragment3.f1469c = new Bundle();
        }
    }
}
