package androidx.fragment.app;

import a.h.j.b;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.h;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* compiled from: BackStackRecord */
final class a extends j implements h.l {

    /* renamed from: a  reason: collision with root package name */
    final h f1471a;

    /* renamed from: b  reason: collision with root package name */
    ArrayList<C0043a> f1472b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    int f1473c;

    /* renamed from: d  reason: collision with root package name */
    int f1474d;

    /* renamed from: e  reason: collision with root package name */
    int f1475e;

    /* renamed from: f  reason: collision with root package name */
    int f1476f;
    int g;
    int h;
    boolean i;
    boolean j = true;
    String k;
    boolean l;
    int m = -1;
    int n;
    CharSequence o;
    int p;
    CharSequence q;
    ArrayList<String> r;
    ArrayList<String> s;
    boolean t = false;
    ArrayList<Runnable> u;

    /* renamed from: androidx.fragment.app.a$a  reason: collision with other inner class name */
    /* compiled from: BackStackRecord */
    static final class C0043a {

        /* renamed from: a  reason: collision with root package name */
        int f1477a;

        /* renamed from: b  reason: collision with root package name */
        Fragment f1478b;

        /* renamed from: c  reason: collision with root package name */
        int f1479c;

        /* renamed from: d  reason: collision with root package name */
        int f1480d;

        /* renamed from: e  reason: collision with root package name */
        int f1481e;

        /* renamed from: f  reason: collision with root package name */
        int f1482f;

        C0043a() {
        }

        C0043a(int i, Fragment fragment) {
            this.f1477a = i;
            this.f1478b = fragment;
        }
    }

    public a(h hVar) {
        this.f1471a = hVar;
    }

    private void o(int i2, Fragment fragment, String str, int i3) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from" + " instance state.");
        }
        fragment.s = this.f1471a;
        if (str != null) {
            String str2 = fragment.A;
            if (str2 == null || str.equals(str2)) {
                fragment.A = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.A + " now " + str);
            }
        }
        if (i2 != 0) {
            if (i2 != -1) {
                int i4 = fragment.y;
                if (i4 == 0 || i4 == i2) {
                    fragment.y = i2;
                    fragment.z = i2;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.y + " now " + i2);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        l(new C0043a(i3, fragment));
    }

    private static boolean x(C0043a aVar) {
        Fragment fragment = aVar.f1478b;
        return fragment != null && fragment.l && fragment.J != null && !fragment.C && !fragment.B && fragment.w0();
    }

    public void A() {
        ArrayList<Runnable> arrayList = this.u;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.u.get(i2).run();
            }
            this.u = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void B(Fragment.e eVar) {
        for (int i2 = 0; i2 < this.f1472b.size(); i2++) {
            C0043a aVar = this.f1472b.get(i2);
            if (x(aVar)) {
                aVar.f1478b.W1(eVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment C(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int i2 = 0; i2 < this.f1472b.size(); i2++) {
            C0043a aVar = this.f1472b.get(i2);
            int i3 = aVar.f1477a;
            if (i3 != 1) {
                if (i3 != 3) {
                    switch (i3) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f1478b;
                            break;
                    }
                }
                arrayList.add(aVar.f1478b);
            }
            arrayList.remove(aVar.f1478b);
        }
        return fragment;
    }

    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (h.F) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.i) {
            return true;
        }
        this.f1471a.n(this);
        return true;
    }

    public j b(int i2, Fragment fragment, String str) {
        o(i2, fragment, str, 1);
        return this;
    }

    public j c(Fragment fragment, String str) {
        o(0, fragment, str, 1);
        return this;
    }

    public j d(String str) {
        if (this.j) {
            this.i = true;
            this.k = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public j e(Fragment fragment) {
        l(new C0043a(7, fragment));
        return this;
    }

    public int f() {
        return n(false);
    }

    public int g() {
        return n(true);
    }

    public j h(Fragment fragment) {
        l(new C0043a(6, fragment));
        return this;
    }

    public j i(Fragment fragment) {
        l(new C0043a(3, fragment));
        return this;
    }

    public j j(int i2, Fragment fragment) {
        z(i2, fragment, (String) null);
        return this;
    }

    public j k(int i2) {
        this.g = i2;
        return this;
    }

    /* access modifiers changed from: package-private */
    public void l(C0043a aVar) {
        this.f1472b.add(aVar);
        aVar.f1479c = this.f1473c;
        aVar.f1480d = this.f1474d;
        aVar.f1481e = this.f1475e;
        aVar.f1482f = this.f1476f;
    }

    /* access modifiers changed from: package-private */
    public void m(int i2) {
        if (this.i) {
            if (h.F) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i2);
            }
            int size = this.f1472b.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0043a aVar = this.f1472b.get(i3);
                Fragment fragment = aVar.f1478b;
                if (fragment != null) {
                    fragment.r += i2;
                    if (h.F) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f1478b + " to " + aVar.f1478b.r);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int n(boolean z) {
        if (!this.l) {
            if (h.F) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new b("FragmentManager"));
                p("  ", (FileDescriptor) null, printWriter, (String[]) null);
                printWriter.close();
            }
            this.l = true;
            if (this.i) {
                this.m = this.f1471a.p(this);
            } else {
                this.m = -1;
            }
            this.f1471a.h0(this, z);
            return this.m;
        }
        throw new IllegalStateException("commit already called");
    }

    public void p(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        q(str, printWriter, true);
    }

    public void q(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.k);
            printWriter.print(" mIndex=");
            printWriter.print(this.m);
            printWriter.print(" mCommitted=");
            printWriter.println(this.l);
            if (this.g != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.g));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.h));
            }
            if (!(this.f1473c == 0 && this.f1474d == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1473c));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1474d));
            }
            if (!(this.f1475e == 0 && this.f1476f == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1475e));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1476f));
            }
            if (!(this.n == 0 && this.o == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.n));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.o);
            }
            if (!(this.p == 0 && this.q == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.p));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.q);
            }
        }
        if (!this.f1472b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            str + "    ";
            int size = this.f1472b.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0043a aVar = this.f1472b.get(i2);
                switch (aVar.f1477a) {
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
                    default:
                        str2 = "cmd=" + aVar.f1477a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f1478b);
                if (z) {
                    if (!(aVar.f1479c == 0 && aVar.f1480d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f1479c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f1480d));
                    }
                    if (aVar.f1481e != 0 || aVar.f1482f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f1481e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f1482f));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void r() {
        int size = this.f1472b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0043a aVar = this.f1472b.get(i2);
            Fragment fragment = aVar.f1478b;
            if (fragment != null) {
                fragment.V1(this.g, this.h);
            }
            switch (aVar.f1477a) {
                case 1:
                    fragment.T1(aVar.f1479c);
                    this.f1471a.o(fragment, false);
                    break;
                case 3:
                    fragment.T1(aVar.f1480d);
                    this.f1471a.R0(fragment);
                    break;
                case 4:
                    fragment.T1(aVar.f1480d);
                    this.f1471a.x0(fragment);
                    break;
                case 5:
                    fragment.T1(aVar.f1479c);
                    this.f1471a.h1(fragment);
                    break;
                case 6:
                    fragment.T1(aVar.f1480d);
                    this.f1471a.y(fragment);
                    break;
                case 7:
                    fragment.T1(aVar.f1479c);
                    this.f1471a.s(fragment);
                    break;
                case 8:
                    this.f1471a.e1(fragment);
                    break;
                case 9:
                    this.f1471a.e1((Fragment) null);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f1477a);
            }
            if (!(this.t || aVar.f1477a == 1 || fragment == null)) {
                this.f1471a.H0(fragment);
            }
        }
        if (!this.t) {
            h hVar = this.f1471a;
            hVar.I0(hVar.m, true);
        }
    }

    /* access modifiers changed from: package-private */
    public void s(boolean z) {
        for (int size = this.f1472b.size() - 1; size >= 0; size--) {
            C0043a aVar = this.f1472b.get(size);
            Fragment fragment = aVar.f1478b;
            if (fragment != null) {
                fragment.V1(h.W0(this.g), this.h);
            }
            switch (aVar.f1477a) {
                case 1:
                    fragment.T1(aVar.f1482f);
                    this.f1471a.R0(fragment);
                    break;
                case 3:
                    fragment.T1(aVar.f1481e);
                    this.f1471a.o(fragment, false);
                    break;
                case 4:
                    fragment.T1(aVar.f1481e);
                    this.f1471a.h1(fragment);
                    break;
                case 5:
                    fragment.T1(aVar.f1482f);
                    this.f1471a.x0(fragment);
                    break;
                case 6:
                    fragment.T1(aVar.f1481e);
                    this.f1471a.s(fragment);
                    break;
                case 7:
                    fragment.T1(aVar.f1482f);
                    this.f1471a.y(fragment);
                    break;
                case 8:
                    this.f1471a.e1((Fragment) null);
                    break;
                case 9:
                    this.f1471a.e1(fragment);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f1477a);
            }
            if (!(this.t || aVar.f1477a == 3 || fragment == null)) {
                this.f1471a.H0(fragment);
            }
        }
        if (!this.t && z) {
            h hVar = this.f1471a;
            hVar.I0(hVar.m, true);
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment t(ArrayList<Fragment> arrayList, Fragment fragment) {
        ArrayList<Fragment> arrayList2 = arrayList;
        Fragment fragment2 = fragment;
        int i2 = 0;
        while (i2 < this.f1472b.size()) {
            C0043a aVar = this.f1472b.get(i2);
            int i3 = aVar.f1477a;
            if (i3 != 1) {
                if (i3 == 2) {
                    Fragment fragment3 = aVar.f1478b;
                    int i4 = fragment3.z;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList2.get(size);
                        if (fragment4.z == i4) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f1472b.add(i2, new C0043a(9, fragment4));
                                    i2++;
                                    fragment2 = null;
                                }
                                C0043a aVar2 = new C0043a(3, fragment4);
                                aVar2.f1479c = aVar.f1479c;
                                aVar2.f1481e = aVar.f1481e;
                                aVar2.f1480d = aVar.f1480d;
                                aVar2.f1482f = aVar.f1482f;
                                this.f1472b.add(i2, aVar2);
                                arrayList2.remove(fragment4);
                                i2++;
                            }
                        }
                    }
                    if (z) {
                        this.f1472b.remove(i2);
                        i2--;
                    } else {
                        aVar.f1477a = 1;
                        arrayList2.add(fragment3);
                    }
                } else if (i3 == 3 || i3 == 6) {
                    arrayList2.remove(aVar.f1478b);
                    Fragment fragment5 = aVar.f1478b;
                    if (fragment5 == fragment2) {
                        this.f1472b.add(i2, new C0043a(9, fragment5));
                        i2++;
                        fragment2 = null;
                    }
                } else if (i3 != 7) {
                    if (i3 == 8) {
                        this.f1472b.add(i2, new C0043a(9, fragment2));
                        i2++;
                        fragment2 = aVar.f1478b;
                    }
                }
                i2++;
            }
            arrayList2.add(aVar.f1478b);
            i2++;
        }
        return fragment2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.m >= 0) {
            sb.append(" #");
            sb.append(this.m);
        }
        if (this.k != null) {
            sb.append(" ");
            sb.append(this.k);
        }
        sb.append("}");
        return sb.toString();
    }

    public String u() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public boolean v(int i2) {
        int size = this.f1472b.size();
        for (int i3 = 0; i3 < size; i3++) {
            Fragment fragment = this.f1472b.get(i3).f1478b;
            int i4 = fragment != null ? fragment.z : 0;
            if (i4 != 0 && i4 == i2) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean w(ArrayList<a> arrayList, int i2, int i3) {
        if (i3 == i2) {
            return false;
        }
        int size = this.f1472b.size();
        int i4 = -1;
        for (int i5 = 0; i5 < size; i5++) {
            Fragment fragment = this.f1472b.get(i5).f1478b;
            int i6 = fragment != null ? fragment.z : 0;
            if (!(i6 == 0 || i6 == i4)) {
                for (int i7 = i2; i7 < i3; i7++) {
                    a aVar = arrayList.get(i7);
                    int size2 = aVar.f1472b.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        Fragment fragment2 = aVar.f1472b.get(i8).f1478b;
                        if ((fragment2 != null ? fragment2.z : 0) == i6) {
                            return true;
                        }
                    }
                }
                i4 = i6;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean y() {
        for (int i2 = 0; i2 < this.f1472b.size(); i2++) {
            if (x(this.f1472b.get(i2))) {
                return true;
            }
        }
        return false;
    }

    public j z(int i2, Fragment fragment, String str) {
        if (i2 != 0) {
            o(i2, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }
}
