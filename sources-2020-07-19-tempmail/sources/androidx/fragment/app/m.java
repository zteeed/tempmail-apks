package androidx.fragment.app;

import a.h.k.t;
import a.h.k.v;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: FragmentTransitionImpl */
public abstract class m {

    /* compiled from: FragmentTransitionImpl */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1572b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ArrayList f1573c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArrayList f1574d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ArrayList f1575e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f1576f;

        a(m mVar, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f1572b = i;
            this.f1573c = arrayList;
            this.f1574d = arrayList2;
            this.f1575e = arrayList3;
            this.f1576f = arrayList4;
        }

        public void run() {
            for (int i = 0; i < this.f1572b; i++) {
                t.p0((View) this.f1573c.get(i), (String) this.f1574d.get(i));
                t.p0((View) this.f1575e.get(i), (String) this.f1576f.get(i));
            }
        }
    }

    /* compiled from: FragmentTransitionImpl */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f1577b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Map f1578c;

        b(m mVar, ArrayList arrayList, Map map) {
            this.f1577b = arrayList;
            this.f1578c = map;
        }

        public void run() {
            int size = this.f1577b.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f1577b.get(i);
                String z = t.z(view);
                if (z != null) {
                    t.p0(view, m.i(this.f1578c, z));
                }
            }
        }
    }

    /* compiled from: FragmentTransitionImpl */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f1579b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Map f1580c;

        c(m mVar, ArrayList arrayList, Map map) {
            this.f1579b = arrayList;
            this.f1580c = map;
        }

        public void run() {
            int size = this.f1579b.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f1579b.get(i);
                t.p0(view, (String) this.f1580c.get(t.z(view)));
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

    public abstract Object A(Object obj);

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
            if (v.a(viewGroup)) {
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
            String z = t.z(view);
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
            arrayList2.add(t.z(view));
            t.p0(view, (String) null);
        }
        return arrayList2;
    }

    public abstract void p(Object obj, View view);

    public abstract void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void r(Object obj, View view, ArrayList<View> arrayList);

    /* access modifiers changed from: package-private */
    public void s(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        n.a(viewGroup, new c(this, arrayList, map));
    }

    public abstract void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void u(Object obj, Rect rect);

    public abstract void v(Object obj, View view);

    /* access modifiers changed from: package-private */
    public void w(View view, ArrayList<View> arrayList, Map<String, String> map) {
        n.a(view, new b(this, arrayList, map));
    }

    /* access modifiers changed from: package-private */
    public void x(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String z = t.z(view2);
            arrayList4.add(z);
            if (z != null) {
                t.p0(view2, (String) null);
                String str = map.get(z);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        t.p0(arrayList2.get(i2), z);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        n.a(view, new a(this, size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void y(Object obj, View view, ArrayList<View> arrayList);

    public abstract void z(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);
}
