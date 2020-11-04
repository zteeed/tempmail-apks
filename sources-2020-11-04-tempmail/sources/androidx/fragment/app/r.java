package androidx.fragment.app;

import a.h.k.u;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: FragmentTransition */
class r {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f1584a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b  reason: collision with root package name */
    private static final t f1585b = (Build.VERSION.SDK_INT >= 21 ? new s() : null);

    /* renamed from: c  reason: collision with root package name */
    private static final t f1586c = x();

    /* compiled from: FragmentTransition */
    static class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f1587b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Fragment f1588c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.core.os.a f1589d;

        a(g gVar, Fragment fragment, androidx.core.os.a aVar) {
            this.f1587b = gVar;
            this.f1588c = fragment;
            this.f1589d = aVar;
        }

        public void run() {
            this.f1587b.a(this.f1588c, this.f1589d);
        }
    }

    /* compiled from: FragmentTransition */
    static class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f1590b;

        b(ArrayList arrayList) {
            this.f1590b = arrayList;
        }

        public void run() {
            r.B(this.f1590b, 4);
        }
    }

    /* compiled from: FragmentTransition */
    static class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f1591b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Fragment f1592c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.core.os.a f1593d;

        c(g gVar, Fragment fragment, androidx.core.os.a aVar) {
            this.f1591b = gVar;
            this.f1592c = fragment;
            this.f1593d = aVar;
        }

        public void run() {
            this.f1591b.a(this.f1592c, this.f1593d);
        }
    }

    /* compiled from: FragmentTransition */
    static class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f1594b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ t f1595c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ View f1596d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Fragment f1597e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f1598f;
        final /* synthetic */ ArrayList g;
        final /* synthetic */ ArrayList h;
        final /* synthetic */ Object i;

        d(Object obj, t tVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f1594b = obj;
            this.f1595c = tVar;
            this.f1596d = view;
            this.f1597e = fragment;
            this.f1598f = arrayList;
            this.g = arrayList2;
            this.h = arrayList3;
            this.i = obj2;
        }

        public void run() {
            Object obj = this.f1594b;
            if (obj != null) {
                this.f1595c.p(obj, this.f1596d);
                this.g.addAll(r.k(this.f1595c, this.f1594b, this.f1597e, this.f1598f, this.f1596d));
            }
            if (this.h != null) {
                if (this.i != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f1596d);
                    this.f1595c.q(this.i, this.h, arrayList);
                }
                this.h.clear();
                this.h.add(this.f1596d);
            }
        }
    }

    /* compiled from: FragmentTransition */
    static class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f1599b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Fragment f1600c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f1601d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a.e.a f1602e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ View f1603f;
        final /* synthetic */ t g;
        final /* synthetic */ Rect h;

        e(Fragment fragment, Fragment fragment2, boolean z, a.e.a aVar, View view, t tVar, Rect rect) {
            this.f1599b = fragment;
            this.f1600c = fragment2;
            this.f1601d = z;
            this.f1602e = aVar;
            this.f1603f = view;
            this.g = tVar;
            this.h = rect;
        }

        public void run() {
            r.f(this.f1599b, this.f1600c, this.f1601d, this.f1602e, false);
            View view = this.f1603f;
            if (view != null) {
                this.g.k(view, this.h);
            }
        }
    }

    /* compiled from: FragmentTransition */
    static class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ t f1604b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a.e.a f1605c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Object f1606d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h f1607e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f1608f;
        final /* synthetic */ View g;
        final /* synthetic */ Fragment h;
        final /* synthetic */ Fragment i;
        final /* synthetic */ boolean j;
        final /* synthetic */ ArrayList k;
        final /* synthetic */ Object l;
        final /* synthetic */ Rect m;

        f(t tVar, a.e.a aVar, Object obj, h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f1604b = tVar;
            this.f1605c = aVar;
            this.f1606d = obj;
            this.f1607e = hVar;
            this.f1608f = arrayList;
            this.g = view;
            this.h = fragment;
            this.i = fragment2;
            this.j = z;
            this.k = arrayList2;
            this.l = obj2;
            this.m = rect;
        }

        public void run() {
            a.e.a<String, View> h2 = r.h(this.f1604b, this.f1605c, this.f1606d, this.f1607e);
            if (h2 != null) {
                this.f1608f.addAll(h2.values());
                this.f1608f.add(this.g);
            }
            r.f(this.h, this.i, this.j, h2, false);
            Object obj = this.f1606d;
            if (obj != null) {
                this.f1604b.A(obj, this.k, this.f1608f);
                View t = r.t(h2, this.f1607e, this.l, this.j);
                if (t != null) {
                    this.f1604b.k(t, this.m);
                }
            }
        }
    }

    /* compiled from: FragmentTransition */
    interface g {
        void a(Fragment fragment, androidx.core.os.a aVar);

        void b(Fragment fragment, androidx.core.os.a aVar);
    }

    /* compiled from: FragmentTransition */
    static class h {

        /* renamed from: a  reason: collision with root package name */
        public Fragment f1609a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1610b;

        /* renamed from: c  reason: collision with root package name */
        public a f1611c;

        /* renamed from: d  reason: collision with root package name */
        public Fragment f1612d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1613e;

        /* renamed from: f  reason: collision with root package name */
        public a f1614f;

        h() {
        }
    }

    private static void A(t tVar, Object obj, Object obj2, a.e.a<String, View> aVar, boolean z, a aVar2) {
        String str;
        ArrayList<String> arrayList = aVar2.n;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (z) {
                str = aVar2.o.get(0);
            } else {
                str = aVar2.n.get(0);
            }
            View view = aVar.get(str);
            tVar.v(obj, view);
            if (obj2 != null) {
                tVar.v(obj2, view);
            }
        }
    }

    static void B(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i);
            }
        }
    }

    static void C(k kVar, ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z, g gVar) {
        k kVar2 = kVar;
        ArrayList<a> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i3 = i2;
        boolean z2 = z;
        if (kVar2.n >= 1) {
            SparseArray sparseArray = new SparseArray();
            for (int i4 = i; i4 < i3; i4++) {
                a aVar = arrayList3.get(i4);
                if (arrayList4.get(i4).booleanValue()) {
                    e(aVar, sparseArray, z2);
                } else {
                    c(aVar, sparseArray, z2);
                }
            }
            if (sparseArray.size() != 0) {
                View view = new View(kVar2.o.g());
                int size = sparseArray.size();
                for (int i5 = 0; i5 < size; i5++) {
                    int keyAt = sparseArray.keyAt(i5);
                    a.e.a<String, String> d2 = d(keyAt, arrayList3, arrayList4, i, i3);
                    h hVar = (h) sparseArray.valueAt(i5);
                    if (z2) {
                        o(kVar, keyAt, hVar, view, d2, gVar);
                    } else {
                        n(kVar, keyAt, hVar, view, d2, gVar);
                    }
                }
            }
        }
    }

    private static void a(ArrayList<View> arrayList, a.e.a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View m = aVar.m(size);
            if (collection.contains(u.z(m))) {
                arrayList.add(m);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0039, code lost:
        if (r0.l != false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x006e, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x008a, code lost:
        if (r0.z == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x008c, code lost:
        r9 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void b(androidx.fragment.app.a r8, androidx.fragment.app.q.a r9, android.util.SparseArray<androidx.fragment.app.r.h> r10, boolean r11, boolean r12) {
        /*
            androidx.fragment.app.Fragment r0 = r9.f1579b
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r1 = r0.x
            if (r1 != 0) goto L_0x000a
            return
        L_0x000a:
            if (r11 == 0) goto L_0x0013
            int[] r2 = f1584a
            int r9 = r9.f1578a
            r9 = r2[r9]
            goto L_0x0015
        L_0x0013:
            int r9 = r9.f1578a
        L_0x0015:
            r2 = 0
            r3 = 1
            if (r9 == r3) goto L_0x007f
            r4 = 3
            if (r9 == r4) goto L_0x0057
            r4 = 4
            if (r9 == r4) goto L_0x003f
            r4 = 5
            if (r9 == r4) goto L_0x002d
            r4 = 6
            if (r9 == r4) goto L_0x0057
            r4 = 7
            if (r9 == r4) goto L_0x007f
            r9 = 0
        L_0x0029:
            r4 = 0
            r5 = 0
            goto L_0x0092
        L_0x002d:
            if (r12 == 0) goto L_0x003c
            boolean r9 = r0.M
            if (r9 == 0) goto L_0x008e
            boolean r9 = r0.z
            if (r9 != 0) goto L_0x008e
            boolean r9 = r0.l
            if (r9 == 0) goto L_0x008e
            goto L_0x008c
        L_0x003c:
            boolean r9 = r0.z
            goto L_0x008f
        L_0x003f:
            if (r12 == 0) goto L_0x004e
            boolean r9 = r0.M
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.l
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.z
            if (r9 == 0) goto L_0x0070
        L_0x004d:
            goto L_0x006e
        L_0x004e:
            boolean r9 = r0.l
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.z
            if (r9 != 0) goto L_0x0070
            goto L_0x004d
        L_0x0057:
            if (r12 == 0) goto L_0x0072
            boolean r9 = r0.l
            if (r9 != 0) goto L_0x0070
            android.view.View r9 = r0.H
            if (r9 == 0) goto L_0x0070
            int r9 = r9.getVisibility()
            if (r9 != 0) goto L_0x0070
            float r9 = r0.N
            r4 = 0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 < 0) goto L_0x0070
        L_0x006e:
            r9 = 1
            goto L_0x007b
        L_0x0070:
            r9 = 0
            goto L_0x007b
        L_0x0072:
            boolean r9 = r0.l
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.z
            if (r9 != 0) goto L_0x0070
            goto L_0x006e
        L_0x007b:
            r5 = r9
            r9 = 0
            r4 = 1
            goto L_0x0092
        L_0x007f:
            if (r12 == 0) goto L_0x0084
            boolean r9 = r0.L
            goto L_0x008f
        L_0x0084:
            boolean r9 = r0.l
            if (r9 != 0) goto L_0x008e
            boolean r9 = r0.z
            if (r9 != 0) goto L_0x008e
        L_0x008c:
            r9 = 1
            goto L_0x008f
        L_0x008e:
            r9 = 0
        L_0x008f:
            r2 = r9
            r9 = 1
            goto L_0x0029
        L_0x0092:
            java.lang.Object r6 = r10.get(r1)
            androidx.fragment.app.r$h r6 = (androidx.fragment.app.r.h) r6
            if (r2 == 0) goto L_0x00a4
            androidx.fragment.app.r$h r6 = p(r6, r10, r1)
            r6.f1609a = r0
            r6.f1610b = r11
            r6.f1611c = r8
        L_0x00a4:
            r2 = 0
            if (r12 != 0) goto L_0x00c5
            if (r9 == 0) goto L_0x00c5
            if (r6 == 0) goto L_0x00b1
            androidx.fragment.app.Fragment r9 = r6.f1612d
            if (r9 != r0) goto L_0x00b1
            r6.f1612d = r2
        L_0x00b1:
            androidx.fragment.app.k r9 = r8.r
            int r7 = r0.f1468b
            if (r7 >= r3) goto L_0x00c5
            int r7 = r9.n
            if (r7 < r3) goto L_0x00c5
            boolean r7 = r8.p
            if (r7 != 0) goto L_0x00c5
            r9.w0(r0)
            r9.C0(r0, r3)
        L_0x00c5:
            if (r5 == 0) goto L_0x00d7
            if (r6 == 0) goto L_0x00cd
            androidx.fragment.app.Fragment r9 = r6.f1612d
            if (r9 != 0) goto L_0x00d7
        L_0x00cd:
            androidx.fragment.app.r$h r6 = p(r6, r10, r1)
            r6.f1612d = r0
            r6.f1613e = r11
            r6.f1614f = r8
        L_0x00d7:
            if (r12 != 0) goto L_0x00e3
            if (r4 == 0) goto L_0x00e3
            if (r6 == 0) goto L_0x00e3
            androidx.fragment.app.Fragment r8 = r6.f1609a
            if (r8 != r0) goto L_0x00e3
            r6.f1609a = r2
        L_0x00e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.r.b(androidx.fragment.app.a, androidx.fragment.app.q$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(a aVar, SparseArray<h> sparseArray, boolean z) {
        int size = aVar.f1572a.size();
        for (int i = 0; i < size; i++) {
            b(aVar, aVar.f1572a.get(i), sparseArray, false, z);
        }
    }

    private static a.e.a<String, String> d(int i, ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        a.e.a<String, String> aVar = new a.e.a<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            a aVar2 = arrayList.get(i4);
            if (aVar2.B(i)) {
                boolean booleanValue = arrayList2.get(i4).booleanValue();
                ArrayList<String> arrayList5 = aVar2.n;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar2.n;
                        arrayList4 = aVar2.o;
                    } else {
                        ArrayList<String> arrayList6 = aVar2.n;
                        arrayList3 = aVar2.o;
                        arrayList4 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList4.get(i5);
                        String str2 = arrayList3.get(i5);
                        String remove = aVar.remove(str2);
                        if (remove != null) {
                            aVar.put(str, remove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    public static void e(a aVar, SparseArray<h> sparseArray, boolean z) {
        if (aVar.r.p.d()) {
            for (int size = aVar.f1572a.size() - 1; size >= 0; size--) {
                b(aVar, aVar.f1572a.get(size), sparseArray, true, z);
            }
        }
    }

    static void f(Fragment fragment, Fragment fragment2, boolean z, a.e.a<String, View> aVar, boolean z2) {
        k kVar;
        int i;
        if (z) {
            kVar = fragment2.N();
        } else {
            kVar = fragment.N();
        }
        if (kVar != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (aVar == null) {
                i = 0;
            } else {
                i = aVar.size();
            }
            for (int i2 = 0; i2 < i; i2++) {
                arrayList2.add(aVar.i(i2));
                arrayList.add(aVar.m(i2));
            }
            if (z2) {
                kVar.c(arrayList2, arrayList, (List<View>) null);
            } else {
                kVar.b(arrayList2, arrayList, (List<View>) null);
            }
        }
    }

    private static boolean g(t tVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!tVar.e(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    static a.e.a<String, View> h(t tVar, a.e.a<String, String> aVar, Object obj, h hVar) {
        k kVar;
        ArrayList<String> arrayList;
        String q;
        Fragment fragment = hVar.f1609a;
        View p0 = fragment.p0();
        if (aVar.isEmpty() || obj == null || p0 == null) {
            aVar.clear();
            return null;
        }
        a.e.a<String, View> aVar2 = new a.e.a<>();
        tVar.j(aVar2, p0);
        a aVar3 = hVar.f1611c;
        if (hVar.f1610b) {
            kVar = fragment.Q();
            arrayList = aVar3.n;
        } else {
            kVar = fragment.N();
            arrayList = aVar3.o;
        }
        if (arrayList != null) {
            aVar2.o(arrayList);
            aVar2.o(aVar.values());
        }
        if (kVar != null) {
            kVar.a(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar2.get(str);
                if (view == null) {
                    String q2 = q(aVar, str);
                    if (q2 != null) {
                        aVar.remove(q2);
                    }
                } else if (!str.equals(u.z(view)) && (q = q(aVar, str)) != null) {
                    aVar.put(q, u.z(view));
                }
            }
        } else {
            y(aVar, aVar2);
        }
        return aVar2;
    }

    private static a.e.a<String, View> i(t tVar, a.e.a<String, String> aVar, Object obj, h hVar) {
        k kVar;
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = hVar.f1612d;
        a.e.a<String, View> aVar2 = new a.e.a<>();
        tVar.j(aVar2, fragment.Q1());
        a aVar3 = hVar.f1614f;
        if (hVar.f1613e) {
            kVar = fragment.N();
            arrayList = aVar3.o;
        } else {
            kVar = fragment.Q();
            arrayList = aVar3.n;
        }
        if (arrayList != null) {
            aVar2.o(arrayList);
        }
        if (kVar != null) {
            kVar.a(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar2.get(str);
                if (view == null) {
                    aVar.remove(str);
                } else if (!str.equals(u.z(view))) {
                    aVar.put(u.z(view), aVar.remove(str));
                }
            }
        } else {
            aVar.o(aVar2.keySet());
        }
        return aVar2;
    }

    private static t j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object P = fragment.P();
            if (P != null) {
                arrayList.add(P);
            }
            Object g0 = fragment.g0();
            if (g0 != null) {
                arrayList.add(g0);
            }
            Object i0 = fragment.i0();
            if (i0 != null) {
                arrayList.add(i0);
            }
        }
        if (fragment2 != null) {
            Object M = fragment2.M();
            if (M != null) {
                arrayList.add(M);
            }
            Object d0 = fragment2.d0();
            if (d0 != null) {
                arrayList.add(d0);
            }
            Object h0 = fragment2.h0();
            if (h0 != null) {
                arrayList.add(h0);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        t tVar = f1585b;
        if (tVar != null && g(tVar, arrayList)) {
            return f1585b;
        }
        t tVar2 = f1586c;
        if (tVar2 != null && g(tVar2, arrayList)) {
            return f1586c;
        }
        if (f1585b == null && f1586c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    static ArrayList<View> k(t tVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View p0 = fragment.p0();
        if (p0 != null) {
            tVar.f(arrayList2, p0);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        tVar.b(obj, arrayList2);
        return arrayList2;
    }

    private static Object l(t tVar, ViewGroup viewGroup, View view, a.e.a<String, String> aVar, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        a.e.a<String, String> aVar2;
        Object obj3;
        Object obj4;
        Rect rect;
        t tVar2 = tVar;
        h hVar2 = hVar;
        ArrayList<View> arrayList3 = arrayList;
        Object obj5 = obj;
        Fragment fragment = hVar2.f1609a;
        Fragment fragment2 = hVar2.f1612d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar2.f1610b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            obj3 = null;
        } else {
            obj3 = u(tVar2, fragment, fragment2, z);
            aVar2 = aVar;
        }
        a.e.a<String, View> i = i(tVar2, aVar2, obj3, hVar2);
        if (aVar.isEmpty()) {
            obj4 = null;
        } else {
            arrayList3.addAll(i.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        f(fragment, fragment2, z, i, true);
        if (obj4 != null) {
            rect = new Rect();
            tVar2.z(obj4, view, arrayList3);
            A(tVar, obj4, obj2, i, hVar2.f1613e, hVar2.f1614f);
            if (obj5 != null) {
                tVar2.u(obj5, rect);
            }
        } else {
            rect = null;
        }
        f fVar = r0;
        f fVar2 = new f(tVar, aVar, obj4, hVar, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect);
        a.h.k.r.a(viewGroup, fVar);
        return obj4;
    }

    private static Object m(t tVar, ViewGroup viewGroup, View view, a.e.a<String, String> aVar, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        Rect rect;
        View view2;
        t tVar2 = tVar;
        View view3 = view;
        a.e.a<String, String> aVar2 = aVar;
        h hVar2 = hVar;
        ArrayList<View> arrayList3 = arrayList;
        ArrayList<View> arrayList4 = arrayList2;
        Object obj5 = obj;
        Fragment fragment = hVar2.f1609a;
        Fragment fragment2 = hVar2.f1612d;
        if (fragment != null) {
            fragment.Q1().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar2.f1610b;
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = u(tVar, fragment, fragment2, z);
        }
        a.e.a<String, View> i = i(tVar, aVar2, obj3, hVar2);
        a.e.a<String, View> h2 = h(tVar, aVar2, obj3, hVar2);
        if (aVar.isEmpty()) {
            if (i != null) {
                i.clear();
            }
            if (h2 != null) {
                h2.clear();
            }
            obj4 = null;
        } else {
            a(arrayList3, i, aVar.keySet());
            a(arrayList4, h2, aVar.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        f(fragment, fragment2, z, i, true);
        if (obj4 != null) {
            arrayList4.add(view3);
            tVar.z(obj4, view3, arrayList3);
            A(tVar, obj4, obj2, i, hVar2.f1613e, hVar2.f1614f);
            Rect rect2 = new Rect();
            View t = t(h2, hVar2, obj5, z);
            if (t != null) {
                tVar.u(obj5, rect2);
            }
            rect = rect2;
            view2 = t;
        } else {
            view2 = null;
            rect = null;
        }
        a.h.k.r.a(viewGroup, new e(fragment, fragment2, z, h2, view2, tVar, rect));
        return obj4;
    }

    private static void n(k kVar, int i, h hVar, View view, a.e.a<String, String> aVar, g gVar) {
        Fragment fragment;
        Fragment fragment2;
        t j;
        Object obj;
        k kVar2 = kVar;
        h hVar2 = hVar;
        View view2 = view;
        a.e.a<String, String> aVar2 = aVar;
        g gVar2 = gVar;
        ViewGroup viewGroup = kVar2.p.d() ? (ViewGroup) kVar2.p.b(i) : null;
        if (viewGroup != null && (j = j(fragment2, fragment)) != null) {
            boolean z = hVar2.f1610b;
            boolean z2 = hVar2.f1613e;
            Object r = r(j, (fragment = hVar2.f1609a), z);
            Object s = s(j, (fragment2 = hVar2.f1612d), z2);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = arrayList;
            Object obj2 = s;
            Object obj3 = r;
            t tVar = j;
            Fragment fragment3 = fragment2;
            Object l = l(j, viewGroup, view, aVar, hVar, arrayList3, arrayList2, obj3, obj2);
            Object obj4 = obj3;
            if (obj4 == null && l == null) {
                obj = obj2;
                if (obj == null) {
                    return;
                }
            } else {
                obj = obj2;
            }
            ArrayList arrayList4 = arrayList3;
            ArrayList<View> k = k(tVar, obj, fragment3, arrayList4, view2);
            Object obj5 = (k == null || k.isEmpty()) ? null : obj;
            tVar.a(obj4, view2);
            Object v = v(tVar, obj4, obj5, l, fragment, hVar2.f1610b);
            if (!(fragment3 == null || k == null || (k.size() <= 0 && arrayList4.size() <= 0))) {
                androidx.core.os.a aVar3 = new androidx.core.os.a();
                gVar2.b(fragment3, aVar3);
                tVar.w(fragment3, v, aVar3, new c(gVar2, fragment3, aVar3));
            }
            if (v != null) {
                ArrayList arrayList5 = new ArrayList();
                t tVar2 = tVar;
                tVar2.t(v, obj4, arrayList5, obj5, k, l, arrayList2);
                z(tVar2, viewGroup, fragment, view, arrayList2, obj4, arrayList5, obj5, k);
                ArrayList arrayList6 = arrayList2;
                a.e.a<String, String> aVar4 = aVar;
                tVar.x(viewGroup, arrayList6, aVar4);
                tVar.c(viewGroup, v);
                tVar.s(viewGroup, arrayList6, aVar4);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        r12 = r4.f1609a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void o(androidx.fragment.app.k r17, int r18, androidx.fragment.app.r.h r19, android.view.View r20, a.e.a<java.lang.String, java.lang.String> r21, androidx.fragment.app.r.g r22) {
        /*
            r0 = r17
            r4 = r19
            r9 = r20
            r10 = r22
            androidx.fragment.app.e r1 = r0.p
            boolean r1 = r1.d()
            if (r1 == 0) goto L_0x001b
            androidx.fragment.app.e r0 = r0.p
            r1 = r18
            android.view.View r0 = r0.b(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            r11 = r0
            if (r11 != 0) goto L_0x0020
            return
        L_0x0020:
            androidx.fragment.app.Fragment r12 = r4.f1609a
            androidx.fragment.app.Fragment r13 = r4.f1612d
            androidx.fragment.app.t r14 = j(r13, r12)
            if (r14 != 0) goto L_0x002b
            return
        L_0x002b:
            boolean r15 = r4.f1610b
            boolean r0 = r4.f1613e
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.lang.Object r6 = r(r14, r12, r15)
            java.lang.Object r5 = s(r14, r13, r0)
            r0 = r14
            r1 = r11
            r2 = r20
            r3 = r21
            r4 = r19
            r17 = r5
            r5 = r7
            r18 = r6
            r6 = r8
            r16 = r11
            r11 = r7
            r7 = r18
            r10 = r8
            r8 = r17
            java.lang.Object r8 = m(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r6 = r18
            if (r6 != 0) goto L_0x0066
            if (r8 != 0) goto L_0x0066
            r7 = r17
            if (r7 != 0) goto L_0x0068
            return
        L_0x0066:
            r7 = r17
        L_0x0068:
            java.util.ArrayList r5 = k(r14, r7, r13, r11, r9)
            java.util.ArrayList r9 = k(r14, r6, r12, r10, r9)
            r0 = 4
            B(r9, r0)
            r0 = r14
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r12
            r12 = r5
            r5 = r15
            java.lang.Object r15 = v(r0, r1, r2, r3, r4, r5)
            if (r13 == 0) goto L_0x00a1
            if (r12 == 0) goto L_0x00a1
            int r0 = r12.size()
            if (r0 > 0) goto L_0x008f
            int r0 = r11.size()
            if (r0 <= 0) goto L_0x00a1
        L_0x008f:
            androidx.core.os.a r0 = new androidx.core.os.a
            r0.<init>()
            r1 = r22
            r1.b(r13, r0)
            androidx.fragment.app.r$a r2 = new androidx.fragment.app.r$a
            r2.<init>(r1, r13, r0)
            r14.w(r13, r15, r0, r2)
        L_0x00a1:
            if (r15 == 0) goto L_0x00cb
            w(r14, r7, r13, r12)
            java.util.ArrayList r13 = r14.o(r10)
            r0 = r14
            r1 = r15
            r2 = r6
            r3 = r9
            r4 = r7
            r5 = r12
            r6 = r8
            r7 = r10
            r0.t(r1, r2, r3, r4, r5, r6, r7)
            r0 = r16
            r14.c(r0, r15)
            r1 = r14
            r2 = r0
            r3 = r11
            r4 = r10
            r5 = r13
            r6 = r21
            r1.y(r2, r3, r4, r5, r6)
            r0 = 0
            B(r9, r0)
            r14.A(r8, r11, r10)
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.r.o(androidx.fragment.app.k, int, androidx.fragment.app.r$h, android.view.View, a.e.a, androidx.fragment.app.r$g):void");
    }

    private static h p(h hVar, SparseArray<h> sparseArray, int i) {
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        sparseArray.put(i, hVar2);
        return hVar2;
    }

    private static String q(a.e.a<String, String> aVar, String str) {
        int size = aVar.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(aVar.m(i))) {
                return aVar.i(i);
            }
        }
        return null;
    }

    private static Object r(t tVar, Fragment fragment, boolean z) {
        Object obj;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.d0();
        } else {
            obj = fragment.M();
        }
        return tVar.g(obj);
    }

    private static Object s(t tVar, Fragment fragment, boolean z) {
        Object obj;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.g0();
        } else {
            obj = fragment.P();
        }
        return tVar.g(obj);
    }

    static View t(a.e.a<String, View> aVar, h hVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        String str;
        a aVar2 = hVar.f1611c;
        if (obj == null || aVar == null || (arrayList = aVar2.n) == null || arrayList.isEmpty()) {
            return null;
        }
        if (z) {
            str = aVar2.n.get(0);
        } else {
            str = aVar2.o.get(0);
        }
        return aVar.get(str);
    }

    private static Object u(t tVar, Fragment fragment, Fragment fragment2, boolean z) {
        Object obj;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        if (z) {
            obj = fragment2.i0();
        } else {
            obj = fragment.h0();
        }
        return tVar.B(tVar.g(obj));
    }

    private static Object v(t tVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        boolean z2;
        if (obj == null || obj2 == null || fragment == null) {
            z2 = true;
        } else {
            z2 = z ? fragment.D() : fragment.C();
        }
        if (z2) {
            return tVar.n(obj2, obj, obj3);
        }
        return tVar.m(obj2, obj, obj3);
    }

    private static void w(t tVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.l && fragment.z && fragment.M) {
            fragment.X1(true);
            tVar.r(obj, fragment.p0(), arrayList);
            a.h.k.r.a(fragment.G, new b(arrayList));
        }
    }

    private static t x() {
        try {
            return (t) Class.forName("a.q.e").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static void y(a.e.a<String, String> aVar, a.e.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.m(size))) {
                aVar.k(size);
            }
        }
    }

    private static void z(t tVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        ViewGroup viewGroup2 = viewGroup;
        a.h.k.r.a(viewGroup, new d(obj, tVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }
}
