package androidx.fragment.app;

import a.h.k.t;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: FragmentTransition */
class k {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f1537a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8};

    /* renamed from: b  reason: collision with root package name */
    private static final m f1538b = (Build.VERSION.SDK_INT >= 21 ? new l() : null);

    /* renamed from: c  reason: collision with root package name */
    private static final m f1539c = x();

    /* compiled from: FragmentTransition */
    static class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f1540b;

        a(ArrayList arrayList) {
            this.f1540b = arrayList;
        }

        public void run() {
            k.B(this.f1540b, 4);
        }
    }

    /* compiled from: FragmentTransition */
    static class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f1541b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m f1542c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ View f1543d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Fragment f1544e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f1545f;
        final /* synthetic */ ArrayList g;
        final /* synthetic */ ArrayList h;
        final /* synthetic */ Object i;

        b(Object obj, m mVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f1541b = obj;
            this.f1542c = mVar;
            this.f1543d = view;
            this.f1544e = fragment;
            this.f1545f = arrayList;
            this.g = arrayList2;
            this.h = arrayList3;
            this.i = obj2;
        }

        public void run() {
            Object obj = this.f1541b;
            if (obj != null) {
                this.f1542c.p(obj, this.f1543d);
                this.g.addAll(k.k(this.f1542c, this.f1541b, this.f1544e, this.f1545f, this.f1543d));
            }
            if (this.h != null) {
                if (this.i != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f1543d);
                    this.f1542c.q(this.i, this.h, arrayList);
                }
                this.h.clear();
                this.h.add(this.f1543d);
            }
        }
    }

    /* compiled from: FragmentTransition */
    static class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f1546b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Fragment f1547c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f1548d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a.e.a f1549e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ View f1550f;
        final /* synthetic */ m g;
        final /* synthetic */ Rect h;

        c(Fragment fragment, Fragment fragment2, boolean z, a.e.a aVar, View view, m mVar, Rect rect) {
            this.f1546b = fragment;
            this.f1547c = fragment2;
            this.f1548d = z;
            this.f1549e = aVar;
            this.f1550f = view;
            this.g = mVar;
            this.h = rect;
        }

        public void run() {
            k.f(this.f1546b, this.f1547c, this.f1548d, this.f1549e, false);
            View view = this.f1550f;
            if (view != null) {
                this.g.k(view, this.h);
            }
        }
    }

    /* compiled from: FragmentTransition */
    static class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f1551b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a.e.a f1552c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Object f1553d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e f1554e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f1555f;
        final /* synthetic */ View g;
        final /* synthetic */ Fragment h;
        final /* synthetic */ Fragment i;
        final /* synthetic */ boolean j;
        final /* synthetic */ ArrayList k;
        final /* synthetic */ Object l;
        final /* synthetic */ Rect m;

        d(m mVar, a.e.a aVar, Object obj, e eVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f1551b = mVar;
            this.f1552c = aVar;
            this.f1553d = obj;
            this.f1554e = eVar;
            this.f1555f = arrayList;
            this.g = view;
            this.h = fragment;
            this.i = fragment2;
            this.j = z;
            this.k = arrayList2;
            this.l = obj2;
            this.m = rect;
        }

        public void run() {
            a.e.a<String, View> h2 = k.h(this.f1551b, this.f1552c, this.f1553d, this.f1554e);
            if (h2 != null) {
                this.f1555f.addAll(h2.values());
                this.f1555f.add(this.g);
            }
            k.f(this.h, this.i, this.j, h2, false);
            Object obj = this.f1553d;
            if (obj != null) {
                this.f1551b.z(obj, this.k, this.f1555f);
                View t = k.t(h2, this.f1554e, this.l, this.j);
                if (t != null) {
                    this.f1551b.k(t, this.m);
                }
            }
        }
    }

    /* compiled from: FragmentTransition */
    static class e {

        /* renamed from: a  reason: collision with root package name */
        public Fragment f1556a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1557b;

        /* renamed from: c  reason: collision with root package name */
        public a f1558c;

        /* renamed from: d  reason: collision with root package name */
        public Fragment f1559d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1560e;

        /* renamed from: f  reason: collision with root package name */
        public a f1561f;

        e() {
        }
    }

    private static void A(m mVar, Object obj, Object obj2, a.e.a<String, View> aVar, boolean z, a aVar2) {
        String str;
        ArrayList<String> arrayList = aVar2.r;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (z) {
                str = aVar2.s.get(0);
            } else {
                str = aVar2.r.get(0);
            }
            View view = aVar.get(str);
            mVar.v(obj, view);
            if (obj2 != null) {
                mVar.v(obj2, view);
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

    static void C(h hVar, ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z) {
        if (hVar.m >= 1) {
            SparseArray sparseArray = new SparseArray();
            for (int i3 = i; i3 < i2; i3++) {
                a aVar = arrayList.get(i3);
                if (arrayList2.get(i3).booleanValue()) {
                    e(aVar, sparseArray, z);
                } else {
                    c(aVar, sparseArray, z);
                }
            }
            if (sparseArray.size() != 0) {
                View view = new View(hVar.n.e());
                int size = sparseArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    int keyAt = sparseArray.keyAt(i4);
                    a.e.a<String, String> d2 = d(keyAt, arrayList, arrayList2, i, i2);
                    e eVar = (e) sparseArray.valueAt(i4);
                    if (z) {
                        o(hVar, keyAt, eVar, view, d2);
                    } else {
                        n(hVar, keyAt, eVar, view, d2);
                    }
                }
            }
        }
    }

    private static void a(ArrayList<View> arrayList, a.e.a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View m = aVar.m(size);
            if (collection.contains(t.z(m))) {
                arrayList.add(m);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0041, code lost:
        if (r10.l != false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0076, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0092, code lost:
        if (r10.B == false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0094, code lost:
        r1 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00e7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void b(androidx.fragment.app.a r16, androidx.fragment.app.a.C0043a r17, android.util.SparseArray<androidx.fragment.app.k.e> r18, boolean r19, boolean r20) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            androidx.fragment.app.Fragment r10 = r1.f1478b
            if (r10 != 0) goto L_0x000d
            return
        L_0x000d:
            int r11 = r10.z
            if (r11 != 0) goto L_0x0012
            return
        L_0x0012:
            if (r3 == 0) goto L_0x001b
            int[] r4 = f1537a
            int r1 = r1.f1477a
            r1 = r4[r1]
            goto L_0x001d
        L_0x001b:
            int r1 = r1.f1477a
        L_0x001d:
            r4 = 0
            r5 = 1
            if (r1 == r5) goto L_0x0087
            r6 = 3
            if (r1 == r6) goto L_0x005f
            r6 = 4
            if (r1 == r6) goto L_0x0047
            r6 = 5
            if (r1 == r6) goto L_0x0035
            r6 = 6
            if (r1 == r6) goto L_0x005f
            r6 = 7
            if (r1 == r6) goto L_0x0087
            r1 = 0
        L_0x0031:
            r12 = 0
            r13 = 0
            goto L_0x009a
        L_0x0035:
            if (r20 == 0) goto L_0x0044
            boolean r1 = r10.P
            if (r1 == 0) goto L_0x0096
            boolean r1 = r10.B
            if (r1 != 0) goto L_0x0096
            boolean r1 = r10.l
            if (r1 == 0) goto L_0x0096
            goto L_0x0094
        L_0x0044:
            boolean r1 = r10.B
            goto L_0x0097
        L_0x0047:
            if (r20 == 0) goto L_0x0056
            boolean r1 = r10.P
            if (r1 == 0) goto L_0x0078
            boolean r1 = r10.l
            if (r1 == 0) goto L_0x0078
            boolean r1 = r10.B
            if (r1 == 0) goto L_0x0078
        L_0x0055:
            goto L_0x0076
        L_0x0056:
            boolean r1 = r10.l
            if (r1 == 0) goto L_0x0078
            boolean r1 = r10.B
            if (r1 != 0) goto L_0x0078
            goto L_0x0055
        L_0x005f:
            if (r20 == 0) goto L_0x007a
            boolean r1 = r10.l
            if (r1 != 0) goto L_0x0078
            android.view.View r1 = r10.J
            if (r1 == 0) goto L_0x0078
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0078
            float r1 = r10.Q
            r6 = 0
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 < 0) goto L_0x0078
        L_0x0076:
            r1 = 1
            goto L_0x0083
        L_0x0078:
            r1 = 0
            goto L_0x0083
        L_0x007a:
            boolean r1 = r10.l
            if (r1 == 0) goto L_0x0078
            boolean r1 = r10.B
            if (r1 != 0) goto L_0x0078
            goto L_0x0076
        L_0x0083:
            r13 = r1
            r1 = 0
            r12 = 1
            goto L_0x009a
        L_0x0087:
            if (r20 == 0) goto L_0x008c
            boolean r1 = r10.O
            goto L_0x0097
        L_0x008c:
            boolean r1 = r10.l
            if (r1 != 0) goto L_0x0096
            boolean r1 = r10.B
            if (r1 != 0) goto L_0x0096
        L_0x0094:
            r1 = 1
            goto L_0x0097
        L_0x0096:
            r1 = 0
        L_0x0097:
            r4 = r1
            r1 = 1
            goto L_0x0031
        L_0x009a:
            java.lang.Object r6 = r2.get(r11)
            androidx.fragment.app.k$e r6 = (androidx.fragment.app.k.e) r6
            if (r4 == 0) goto L_0x00ac
            androidx.fragment.app.k$e r6 = p(r6, r2, r11)
            r6.f1556a = r10
            r6.f1557b = r3
            r6.f1558c = r0
        L_0x00ac:
            r14 = r6
            r15 = 0
            if (r20 != 0) goto L_0x00d3
            if (r1 == 0) goto L_0x00d3
            if (r14 == 0) goto L_0x00ba
            androidx.fragment.app.Fragment r1 = r14.f1559d
            if (r1 != r10) goto L_0x00ba
            r14.f1559d = r15
        L_0x00ba:
            androidx.fragment.app.h r4 = r0.f1471a
            int r1 = r10.f1437b
            if (r1 >= r5) goto L_0x00d3
            int r1 = r4.m
            if (r1 < r5) goto L_0x00d3
            boolean r1 = r0.t
            if (r1 != 0) goto L_0x00d3
            r4.A0(r10)
            r6 = 1
            r7 = 0
            r8 = 0
            r9 = 0
            r5 = r10
            r4.K0(r5, r6, r7, r8, r9)
        L_0x00d3:
            if (r13 == 0) goto L_0x00e5
            if (r14 == 0) goto L_0x00db
            androidx.fragment.app.Fragment r1 = r14.f1559d
            if (r1 != 0) goto L_0x00e5
        L_0x00db:
            androidx.fragment.app.k$e r14 = p(r14, r2, r11)
            r14.f1559d = r10
            r14.f1560e = r3
            r14.f1561f = r0
        L_0x00e5:
            if (r20 != 0) goto L_0x00f1
            if (r12 == 0) goto L_0x00f1
            if (r14 == 0) goto L_0x00f1
            androidx.fragment.app.Fragment r0 = r14.f1556a
            if (r0 != r10) goto L_0x00f1
            r14.f1556a = r15
        L_0x00f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.k.b(androidx.fragment.app.a, androidx.fragment.app.a$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(a aVar, SparseArray<e> sparseArray, boolean z) {
        int size = aVar.f1472b.size();
        for (int i = 0; i < size; i++) {
            b(aVar, aVar.f1472b.get(i), sparseArray, false, z);
        }
    }

    private static a.e.a<String, String> d(int i, ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        a.e.a<String, String> aVar = new a.e.a<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            a aVar2 = arrayList.get(i4);
            if (aVar2.v(i)) {
                boolean booleanValue = arrayList2.get(i4).booleanValue();
                ArrayList<String> arrayList5 = aVar2.r;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar2.r;
                        arrayList4 = aVar2.s;
                    } else {
                        ArrayList<String> arrayList6 = aVar2.r;
                        arrayList3 = aVar2.s;
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

    public static void e(a aVar, SparseArray<e> sparseArray, boolean z) {
        if (aVar.f1471a.o.c()) {
            for (int size = aVar.f1472b.size() - 1; size >= 0; size--) {
                b(aVar, aVar.f1472b.get(size), sparseArray, true, z);
            }
        }
    }

    static void f(Fragment fragment, Fragment fragment2, boolean z, a.e.a<String, View> aVar, boolean z2) {
        androidx.core.app.k kVar;
        int i;
        if (z) {
            kVar = fragment2.K();
        } else {
            kVar = fragment.K();
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

    private static boolean g(m mVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!mVar.e(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    static a.e.a<String, View> h(m mVar, a.e.a<String, String> aVar, Object obj, e eVar) {
        androidx.core.app.k kVar;
        ArrayList<String> arrayList;
        String q;
        Fragment fragment = eVar.f1556a;
        View m0 = fragment.m0();
        if (aVar.isEmpty() || obj == null || m0 == null) {
            aVar.clear();
            return null;
        }
        a.e.a<String, View> aVar2 = new a.e.a<>();
        mVar.j(aVar2, m0);
        a aVar3 = eVar.f1558c;
        if (eVar.f1557b) {
            kVar = fragment.M();
            arrayList = aVar3.r;
        } else {
            kVar = fragment.K();
            arrayList = aVar3.s;
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
                } else if (!str.equals(t.z(view)) && (q = q(aVar, str)) != null) {
                    aVar.put(q, t.z(view));
                }
            }
        } else {
            y(aVar, aVar2);
        }
        return aVar2;
    }

    private static a.e.a<String, View> i(m mVar, a.e.a<String, String> aVar, Object obj, e eVar) {
        androidx.core.app.k kVar;
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = eVar.f1559d;
        a.e.a<String, View> aVar2 = new a.e.a<>();
        mVar.j(aVar2, fragment.m0());
        a aVar3 = eVar.f1561f;
        if (eVar.f1560e) {
            kVar = fragment.K();
            arrayList = aVar3.s;
        } else {
            kVar = fragment.M();
            arrayList = aVar3.r;
        }
        aVar2.o(arrayList);
        if (kVar != null) {
            kVar.a(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar2.get(str);
                if (view == null) {
                    aVar.remove(str);
                } else if (!str.equals(t.z(view))) {
                    aVar.put(t.z(view), aVar.remove(str));
                }
            }
        } else {
            aVar.o(aVar2.keySet());
        }
        return aVar2;
    }

    private static m j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object L = fragment.L();
            if (L != null) {
                arrayList.add(L);
            }
            Object c0 = fragment.c0();
            if (c0 != null) {
                arrayList.add(c0);
            }
            Object f0 = fragment.f0();
            if (f0 != null) {
                arrayList.add(f0);
            }
        }
        if (fragment2 != null) {
            Object I = fragment2.I();
            if (I != null) {
                arrayList.add(I);
            }
            Object Z = fragment2.Z();
            if (Z != null) {
                arrayList.add(Z);
            }
            Object d0 = fragment2.d0();
            if (d0 != null) {
                arrayList.add(d0);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        m mVar = f1538b;
        if (mVar != null && g(mVar, arrayList)) {
            return f1538b;
        }
        m mVar2 = f1539c;
        if (mVar2 != null && g(mVar2, arrayList)) {
            return f1539c;
        }
        if (f1538b == null && f1539c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    static ArrayList<View> k(m mVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View m0 = fragment.m0();
        if (m0 != null) {
            mVar.f(arrayList2, m0);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        mVar.b(obj, arrayList2);
        return arrayList2;
    }

    private static Object l(m mVar, ViewGroup viewGroup, View view, a.e.a<String, String> aVar, e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        a.e.a<String, String> aVar2;
        Object obj3;
        Object obj4;
        Rect rect;
        m mVar2 = mVar;
        e eVar2 = eVar;
        ArrayList<View> arrayList3 = arrayList;
        Object obj5 = obj;
        Fragment fragment = eVar2.f1556a;
        Fragment fragment2 = eVar2.f1559d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = eVar2.f1557b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            obj3 = null;
        } else {
            obj3 = u(mVar2, fragment, fragment2, z);
            aVar2 = aVar;
        }
        a.e.a<String, View> i = i(mVar2, aVar2, obj3, eVar2);
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
            mVar2.y(obj4, view, arrayList3);
            A(mVar, obj4, obj2, i, eVar2.f1560e, eVar2.f1561f);
            if (obj5 != null) {
                mVar2.u(obj5, rect);
            }
        } else {
            rect = null;
        }
        d dVar = r0;
        d dVar2 = new d(mVar, aVar, obj4, eVar, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect);
        n.a(viewGroup, dVar);
        return obj4;
    }

    private static Object m(m mVar, ViewGroup viewGroup, View view, a.e.a<String, String> aVar, e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        Rect rect;
        View view2;
        m mVar2 = mVar;
        View view3 = view;
        a.e.a<String, String> aVar2 = aVar;
        e eVar2 = eVar;
        ArrayList<View> arrayList3 = arrayList;
        ArrayList<View> arrayList4 = arrayList2;
        Object obj5 = obj;
        Fragment fragment = eVar2.f1556a;
        Fragment fragment2 = eVar2.f1559d;
        if (fragment != null) {
            fragment.m0().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = eVar2.f1557b;
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = u(mVar, fragment, fragment2, z);
        }
        a.e.a<String, View> i = i(mVar, aVar2, obj3, eVar2);
        a.e.a<String, View> h = h(mVar, aVar2, obj3, eVar2);
        if (aVar.isEmpty()) {
            if (i != null) {
                i.clear();
            }
            if (h != null) {
                h.clear();
            }
            obj4 = null;
        } else {
            a(arrayList3, i, aVar.keySet());
            a(arrayList4, h, aVar.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        f(fragment, fragment2, z, i, true);
        if (obj4 != null) {
            arrayList4.add(view3);
            mVar.y(obj4, view3, arrayList3);
            A(mVar, obj4, obj2, i, eVar2.f1560e, eVar2.f1561f);
            Rect rect2 = new Rect();
            View t = t(h, eVar2, obj5, z);
            if (t != null) {
                mVar.u(obj5, rect2);
            }
            rect = rect2;
            view2 = t;
        } else {
            view2 = null;
            rect = null;
        }
        n.a(viewGroup, new c(fragment, fragment2, z, h, view2, mVar, rect));
        return obj4;
    }

    private static void n(h hVar, int i, e eVar, View view, a.e.a<String, String> aVar) {
        Fragment fragment;
        Fragment fragment2;
        m j;
        Object obj;
        h hVar2 = hVar;
        e eVar2 = eVar;
        View view2 = view;
        a.e.a<String, String> aVar2 = aVar;
        ViewGroup viewGroup = hVar2.o.c() ? (ViewGroup) hVar2.o.b(i) : null;
        if (viewGroup != null && (j = j(fragment2, fragment)) != null) {
            boolean z = eVar2.f1557b;
            boolean z2 = eVar2.f1560e;
            Object r = r(j, (fragment = eVar2.f1556a), z);
            Object s = s(j, (fragment2 = eVar2.f1559d), z2);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = arrayList;
            Object obj2 = s;
            m mVar = j;
            Object l = l(j, viewGroup, view, aVar, eVar, arrayList, arrayList2, r, obj2);
            Object obj3 = r;
            if (obj3 == null && l == null) {
                obj = obj2;
                if (obj == null) {
                    return;
                }
            } else {
                obj = obj2;
            }
            ArrayList<View> k = k(mVar, obj, fragment2, arrayList3, view2);
            Object obj4 = (k == null || k.isEmpty()) ? null : obj;
            mVar.a(obj3, view2);
            Object v = v(mVar, obj3, obj4, l, fragment, eVar2.f1557b);
            if (v != null) {
                ArrayList arrayList4 = new ArrayList();
                m mVar2 = mVar;
                mVar2.t(v, obj3, arrayList4, obj4, k, l, arrayList2);
                z(mVar2, viewGroup, fragment, view, arrayList2, obj3, arrayList4, obj4, k);
                ArrayList arrayList5 = arrayList2;
                mVar.w(viewGroup, arrayList5, aVar2);
                mVar.c(viewGroup, v);
                mVar.s(viewGroup, arrayList5, aVar2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        r11 = r4.f1556a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void o(androidx.fragment.app.h r17, int r18, androidx.fragment.app.k.e r19, android.view.View r20, a.e.a<java.lang.String, java.lang.String> r21) {
        /*
            r0 = r17
            r4 = r19
            r9 = r20
            androidx.fragment.app.d r1 = r0.o
            boolean r1 = r1.c()
            if (r1 == 0) goto L_0x0019
            androidx.fragment.app.d r0 = r0.o
            r1 = r18
            android.view.View r0 = r0.b(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            r10 = r0
            if (r10 != 0) goto L_0x001e
            return
        L_0x001e:
            androidx.fragment.app.Fragment r11 = r4.f1556a
            androidx.fragment.app.Fragment r12 = r4.f1559d
            androidx.fragment.app.m r13 = j(r12, r11)
            if (r13 != 0) goto L_0x0029
            return
        L_0x0029:
            boolean r14 = r4.f1557b
            boolean r0 = r4.f1560e
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.Object r7 = r(r13, r11, r14)
            java.lang.Object r6 = s(r13, r12, r0)
            r0 = r13
            r1 = r10
            r2 = r20
            r3 = r21
            r4 = r19
            r5 = r8
            r17 = r6
            r6 = r15
            r18 = r7
            r16 = r10
            r10 = r8
            r8 = r17
            java.lang.Object r8 = m(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r6 = r18
            if (r6 != 0) goto L_0x0061
            if (r8 != 0) goto L_0x0061
            r7 = r17
            if (r7 != 0) goto L_0x0063
            return
        L_0x0061:
            r7 = r17
        L_0x0063:
            java.util.ArrayList r5 = k(r13, r7, r12, r10, r9)
            java.util.ArrayList r9 = k(r13, r6, r11, r15, r9)
            r0 = 4
            B(r9, r0)
            r0 = r13
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r11
            r11 = r5
            r5 = r14
            java.lang.Object r14 = v(r0, r1, r2, r3, r4, r5)
            if (r14 == 0) goto L_0x00a4
            w(r13, r7, r12, r11)
            java.util.ArrayList r12 = r13.o(r15)
            r0 = r13
            r1 = r14
            r2 = r6
            r3 = r9
            r4 = r7
            r5 = r11
            r6 = r8
            r7 = r15
            r0.t(r1, r2, r3, r4, r5, r6, r7)
            r0 = r16
            r13.c(r0, r14)
            r1 = r13
            r2 = r0
            r3 = r10
            r4 = r15
            r5 = r12
            r6 = r21
            r1.x(r2, r3, r4, r5, r6)
            r0 = 0
            B(r9, r0)
            r13.z(r8, r10, r15)
        L_0x00a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.k.o(androidx.fragment.app.h, int, androidx.fragment.app.k$e, android.view.View, a.e.a):void");
    }

    private static e p(e eVar, SparseArray<e> sparseArray, int i) {
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        sparseArray.put(i, eVar2);
        return eVar2;
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

    private static Object r(m mVar, Fragment fragment, boolean z) {
        Object obj;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.Z();
        } else {
            obj = fragment.I();
        }
        return mVar.g(obj);
    }

    private static Object s(m mVar, Fragment fragment, boolean z) {
        Object obj;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.c0();
        } else {
            obj = fragment.L();
        }
        return mVar.g(obj);
    }

    static View t(a.e.a<String, View> aVar, e eVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        String str;
        a aVar2 = eVar.f1558c;
        if (obj == null || aVar == null || (arrayList = aVar2.r) == null || arrayList.isEmpty()) {
            return null;
        }
        if (z) {
            str = aVar2.r.get(0);
        } else {
            str = aVar2.s.get(0);
        }
        return aVar.get(str);
    }

    private static Object u(m mVar, Fragment fragment, Fragment fragment2, boolean z) {
        Object obj;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        if (z) {
            obj = fragment2.f0();
        } else {
            obj = fragment.d0();
        }
        return mVar.A(mVar.g(obj));
    }

    private static Object v(m mVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        boolean z2;
        if (obj == null || obj2 == null || fragment == null) {
            z2 = true;
        } else {
            z2 = z ? fragment.w() : fragment.v();
        }
        if (z2) {
            return mVar.n(obj2, obj, obj3);
        }
        return mVar.m(obj2, obj, obj3);
    }

    private static void w(m mVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.l && fragment.B && fragment.P) {
            fragment.Q1(true);
            mVar.r(obj, fragment.m0(), arrayList);
            n.a(fragment.I, new a(arrayList));
        }
    }

    private static m x() {
        try {
            return (m) Class.forName("a.p.e").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
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

    private static void z(m mVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        ViewGroup viewGroup2 = viewGroup;
        n.a(viewGroup, new b(obj, mVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }
}
