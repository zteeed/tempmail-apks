package androidx.fragment.app;

import a.h.k.r;
import a.h.k.u;
import a.h.k.w;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SuppressLint({"UnknownNullness"})
/* compiled from: FragmentTransitionImpl */
public abstract class t {

    /* compiled from: FragmentTransitionImpl */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1626b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ArrayList f1627c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArrayList f1628d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ArrayList f1629e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f1630f;

        a(t tVar, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f1626b = i;
            this.f1627c = arrayList;
            this.f1628d = arrayList2;
            this.f1629e = arrayList3;
            this.f1630f = arrayList4;
        }

        public void run() {
            for (int i = 0; i < this.f1626b; i++) {
                u.p0((View) this.f1627c.get(i), (String) this.f1628d.get(i));
                u.p0((View) this.f1629e.get(i), (String) this.f1630f.get(i));
            }
        }
    }

    /* compiled from: FragmentTransitionImpl */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f1631b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Map f1632c;

        b(t tVar, ArrayList arrayList, Map map) {
            this.f1631b = arrayList;
            this.f1632c = map;
        }

        public void run() {
            int size = this.f1631b.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f1631b.get(i);
                String z = u.z(view);
                if (z != null) {
                    u.p0(view, t.i(this.f1632c, z));
                }
            }
        }
    }

    /* compiled from: FragmentTransitionImpl */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f1633b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Map f1634c;

        c(t tVar, ArrayList arrayList, Map map) {
            this.f1633b = arrayList;
            this.f1634c = map;
        }

        public void run() {
            int size = this.f1633b.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f1633b.get(i);
                u.p0(view, (String) this.f1634c.get(u.z(view)));
            }
        }
    }

    protected static void d(List<View> list, View view) {
        int size = list.size();
        if (!h(list, view, size)) {
            list.add(view);
            for (int i = size; i < list.size(); i++) {
                View view2 = list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!h(list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    private static boolean h(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    static String i(Map<String, String> map, String str) {
        for (Map.Entry next : map.entrySet()) {
            if (str.equals(next.getValue())) {
                return (String) next.getKey();
            }
        }
        return null;
    }

    protected static boolean l(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object B(Object obj);

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList<View> arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    /* access modifiers changed from: package-private */
    public void f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (w.a(viewGroup)) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                f(arrayList, viewGroup.getChildAt(i));
            }
            return;
        }
        arrayList.add(view);
    }

    public abstract Object g(Object obj);

    /* access modifiers changed from: package-private */
    public void j(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String z = u.z(view);
            if (z != null) {
                map.put(z, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    j(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void k(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    public abstract Object m(Object obj, Object obj2, Object obj3);

    public abstract Object n(Object obj, Object obj2, Object obj3);

    /* access modifiers changed from: package-private */
    public ArrayList<String> o(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(u.z(view));
            u.p0(view, (String) null);
        }
        return arrayList2;
    }

    public abstract void p(Object obj, View view);

    public abstract void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void r(Object obj, View view, ArrayList<View> arrayList);

    /* access modifiers changed from: package-private */
    public void s(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        r.a(viewGroup, new c(this, arrayList, map));
    }

    public abstract void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void u(Object obj, Rect rect);

    public abstract void v(Object obj, View view);

    public void w(Fragment fragment, Object obj, androidx.core.os.a aVar, Runnable runnable) {
        runnable.run();
    }

    /* access modifiers changed from: package-private */
    public void x(View view, ArrayList<View> arrayList, Map<String, String> map) {
        r.a(view, new b(this, arrayList, map));
    }

    /* access modifiers changed from: package-private */
    public void y(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String z = u.z(view2);
            arrayList4.add(z);
            if (z != null) {
                u.p0(view2, (String) null);
                String str = map.get(z);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        u.p0(arrayList2.get(i2), z);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        r.a(view, new a(this, size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void z(Object obj, View view, ArrayList<View> arrayList);
}
