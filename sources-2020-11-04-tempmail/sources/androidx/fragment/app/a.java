package androidx.fragment.app;

import a.h.j.b;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.k;
import androidx.fragment.app.q;
import androidx.lifecycle.g;
import java.io.PrintWriter;
import java.util.ArrayList;

/* compiled from: BackStackRecord */
final class a extends q implements k.h {
    final k r;
    boolean s;
    int t;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    a(androidx.fragment.app.k r3) {
        /*
            r2 = this;
            androidx.fragment.app.g r0 = r3.g0()
            androidx.fragment.app.h<?> r1 = r3.o
            if (r1 == 0) goto L_0x0011
            android.content.Context r1 = r1.g()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L_0x0012
        L_0x0011:
            r1 = 0
        L_0x0012:
            r2.<init>(r0, r1)
            r0 = -1
            r2.t = r0
            r2.r = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a.<init>(androidx.fragment.app.k):void");
    }

    private static boolean D(q.a aVar) {
        Fragment fragment = aVar.f1579b;
        return fragment != null && fragment.l && fragment.H != null && !fragment.A && !fragment.z && fragment.z0();
    }

    public String A() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public boolean B(int i) {
        int size = this.f1572a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f1572a.get(i2).f1579b;
            int i3 = fragment != null ? fragment.x : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean C(ArrayList<a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f1572a.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = this.f1572a.get(i4).f1579b;
            int i5 = fragment != null ? fragment.x : 0;
            if (!(i5 == 0 || i5 == i3)) {
                for (int i6 = i; i6 < i2; i6++) {
                    a aVar = arrayList.get(i6);
                    int size2 = aVar.f1572a.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = aVar.f1572a.get(i7).f1579b;
                        if ((fragment2 != null ? fragment2.x : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean E() {
        for (int i = 0; i < this.f1572a.size(); i++) {
            if (D(this.f1572a.get(i))) {
                return true;
            }
        }
        return false;
    }

    public void F() {
        if (this.q != null) {
            for (int i = 0; i < this.q.size(); i++) {
                this.q.get(i).run();
            }
            this.q = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void G(Fragment.d dVar) {
        for (int i = 0; i < this.f1572a.size(); i++) {
            q.a aVar = this.f1572a.get(i);
            if (D(aVar)) {
                aVar.f1579b.b2(dVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment H(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f1572a.size() - 1; size >= 0; size--) {
            q.a aVar = this.f1572a.get(size);
            int i = aVar.f1578a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f1579b;
                            break;
                        case 10:
                            aVar.h = aVar.g;
                            break;
                    }
                }
                arrayList.add(aVar.f1579b);
            }
            arrayList.remove(aVar.f1579b);
        }
        return fragment;
    }

    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (k.r0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.g) {
            return true;
        }
        this.r.b(this);
        return true;
    }

    public int h() {
        return u(false);
    }

    public int i() {
        return u(true);
    }

    public void j() {
        l();
        this.r.S(this, true);
    }

    public q k(Fragment fragment) {
        k kVar = fragment.s;
        if (kVar == null || kVar == this.r) {
            super.k(fragment);
            return this;
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* access modifiers changed from: package-private */
    public void m(int i, Fragment fragment, String str, int i2) {
        super.m(i, fragment, str, i2);
        fragment.s = this.r;
    }

    public q n(Fragment fragment) {
        k kVar = fragment.s;
        if (kVar == null || kVar == this.r) {
            super.n(fragment);
            return this;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public q q(Fragment fragment, g.b bVar) {
        if (fragment.s != this.r) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.r);
        } else if (bVar.f(g.b.CREATED)) {
            super.q(fragment, bVar);
            return this;
        } else {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle below " + g.b.CREATED);
        }
    }

    /* access modifiers changed from: package-private */
    public void t(int i) {
        if (this.g) {
            if (k.r0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f1572a.size();
            for (int i2 = 0; i2 < size; i2++) {
                q.a aVar = this.f1572a.get(i2);
                Fragment fragment = aVar.f1579b;
                if (fragment != null) {
                    fragment.r += i;
                    if (k.r0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f1579b + " to " + aVar.f1579b.r);
                    }
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.t >= 0) {
            sb.append(" #");
            sb.append(this.t);
        }
        if (this.i != null) {
            sb.append(" ");
            sb.append(this.i);
        }
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public int u(boolean z) {
        if (!this.s) {
            if (k.r0(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new b("FragmentManager"));
                v("  ", printWriter);
                printWriter.close();
            }
            this.s = true;
            if (this.g) {
                this.t = this.r.g();
            } else {
                this.t = -1;
            }
            this.r.P(this, z);
            return this.t;
        }
        throw new IllegalStateException("commit already called");
    }

    public void v(String str, PrintWriter printWriter) {
        w(str, printWriter, true);
    }

    public void w(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.i);
            printWriter.print(" mIndex=");
            printWriter.print(this.t);
            printWriter.print(" mCommitted=");
            printWriter.println(this.s);
            if (this.f1577f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1577f));
            }
            if (!(this.f1573b == 0 && this.f1574c == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1573b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1574c));
            }
            if (!(this.f1575d == 0 && this.f1576e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1575d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1576e));
            }
            if (!(this.j == 0 && this.k == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.k);
            }
            if (!(this.l == 0 && this.m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.m);
            }
        }
        if (!this.f1572a.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f1572a.size();
            for (int i = 0; i < size; i++) {
                q.a aVar = this.f1572a.get(i);
                switch (aVar.f1578a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f1578a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f1579b);
                if (z) {
                    if (!(aVar.f1580c == 0 && aVar.f1581d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f1580c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f1581d));
                    }
                    if (aVar.f1582e != 0 || aVar.f1583f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f1582e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f1583f));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void x() {
        int size = this.f1572a.size();
        for (int i = 0; i < size; i++) {
            q.a aVar = this.f1572a.get(i);
            Fragment fragment = aVar.f1579b;
            if (fragment != null) {
                fragment.a2(this.f1577f);
            }
            switch (aVar.f1578a) {
                case 1:
                    fragment.Z1(aVar.f1580c);
                    this.r.U0(fragment, false);
                    this.r.d(fragment);
                    break;
                case 3:
                    fragment.Z1(aVar.f1581d);
                    this.r.M0(fragment);
                    break;
                case 4:
                    fragment.Z1(aVar.f1581d);
                    this.r.p0(fragment);
                    break;
                case 5:
                    fragment.Z1(aVar.f1580c);
                    this.r.U0(fragment, false);
                    this.r.Y0(fragment);
                    break;
                case 6:
                    fragment.Z1(aVar.f1581d);
                    this.r.r(fragment);
                    break;
                case 7:
                    fragment.Z1(aVar.f1580c);
                    this.r.U0(fragment, false);
                    this.r.i(fragment);
                    break;
                case 8:
                    this.r.W0(fragment);
                    break;
                case 9:
                    this.r.W0((Fragment) null);
                    break;
                case 10:
                    this.r.V0(fragment, aVar.h);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f1578a);
            }
            if (!(this.p || aVar.f1578a == 1 || fragment == null)) {
                this.r.z0(fragment);
            }
        }
        if (!this.p) {
            k kVar = this.r;
            kVar.A0(kVar.n, true);
        }
    }

    /* access modifiers changed from: package-private */
    public void y(boolean z) {
        for (int size = this.f1572a.size() - 1; size >= 0; size--) {
            q.a aVar = this.f1572a.get(size);
            Fragment fragment = aVar.f1579b;
            if (fragment != null) {
                fragment.a2(k.R0(this.f1577f));
            }
            switch (aVar.f1578a) {
                case 1:
                    fragment.Z1(aVar.f1583f);
                    this.r.U0(fragment, true);
                    this.r.M0(fragment);
                    break;
                case 3:
                    fragment.Z1(aVar.f1582e);
                    this.r.d(fragment);
                    break;
                case 4:
                    fragment.Z1(aVar.f1582e);
                    this.r.Y0(fragment);
                    break;
                case 5:
                    fragment.Z1(aVar.f1583f);
                    this.r.U0(fragment, true);
                    this.r.p0(fragment);
                    break;
                case 6:
                    fragment.Z1(aVar.f1582e);
                    this.r.i(fragment);
                    break;
                case 7:
                    fragment.Z1(aVar.f1583f);
                    this.r.U0(fragment, true);
                    this.r.r(fragment);
                    break;
                case 8:
                    this.r.W0((Fragment) null);
                    break;
                case 9:
                    this.r.W0(fragment);
                    break;
                case 10:
                    this.r.V0(fragment, aVar.g);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f1578a);
            }
            if (!(this.p || aVar.f1578a == 3 || fragment == null)) {
                this.r.z0(fragment);
            }
        }
        if (!this.p && z) {
            k kVar = this.r;
            kVar.A0(kVar.n, true);
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment z(ArrayList<Fragment> arrayList, Fragment fragment) {
        ArrayList<Fragment> arrayList2 = arrayList;
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f1572a.size()) {
            q.a aVar = this.f1572a.get(i);
            int i2 = aVar.f1578a;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = aVar.f1579b;
                    int i3 = fragment3.x;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList2.get(size);
                        if (fragment4.x == i3) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f1572a.add(i, new q.a(9, fragment4));
                                    i++;
                                    fragment2 = null;
                                }
                                q.a aVar2 = new q.a(3, fragment4);
                                aVar2.f1580c = aVar.f1580c;
                                aVar2.f1582e = aVar.f1582e;
                                aVar2.f1581d = aVar.f1581d;
                                aVar2.f1583f = aVar.f1583f;
                                this.f1572a.add(i, aVar2);
                                arrayList2.remove(fragment4);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.f1572a.remove(i);
                        i--;
                    } else {
                        aVar.f1578a = 1;
                        arrayList2.add(fragment3);
                    }
                } else if (i2 == 3 || i2 == 6) {
                    arrayList2.remove(aVar.f1579b);
                    Fragment fragment5 = aVar.f1579b;
                    if (fragment5 == fragment2) {
                        this.f1572a.add(i, new q.a(9, fragment5));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.f1572a.add(i, new q.a(9, fragment2));
                        i++;
                        fragment2 = aVar.f1579b;
                    }
                }
                i++;
            }
            arrayList2.add(aVar.f1579b);
            i++;
        }
        return fragment2;
    }
}
