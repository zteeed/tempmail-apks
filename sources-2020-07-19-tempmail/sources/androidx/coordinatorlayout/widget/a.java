package androidx.coordinatorlayout.widget;

import a.e.g;
import a.h.j.e;
import a.h.j.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: DirectedAcyclicGraph */
public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final e<ArrayList<T>> f1250a = new f(10);

    /* renamed from: b  reason: collision with root package name */
    private final g<T, ArrayList<T>> f1251b = new g<>();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<T> f1252c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private final HashSet<T> f1253d = new HashSet<>();

    private void e(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList arrayList2 = this.f1251b.get(t);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        e(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    private ArrayList<T> f() {
        ArrayList<T> b2 = this.f1250a.b();
        return b2 == null ? new ArrayList<>() : b2;
    }

    private void k(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f1250a.a(arrayList);
    }

    public void a(T t, T t2) {
        if (!this.f1251b.containsKey(t) || !this.f1251b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = this.f1251b.get(t);
        if (arrayList == null) {
            arrayList = f();
            this.f1251b.put(t, arrayList);
        }
        arrayList.add(t2);
    }

    public void b(T t) {
        if (!this.f1251b.containsKey(t)) {
            this.f1251b.put(t, null);
        }
    }

    public void c() {
        int size = this.f1251b.size();
        for (int i = 0; i < size; i++) {
            ArrayList m = this.f1251b.m(i);
            if (m != null) {
                k(m);
            }
        }
        this.f1251b.clear();
    }

    public boolean d(T t) {
        return this.f1251b.containsKey(t);
    }

    public List g(T t) {
        return this.f1251b.get(t);
    }

    public List<T> h(T t) {
        int size = this.f1251b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList m = this.f1251b.m(i);
            if (m != null && m.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f1251b.i(i));
            }
        }
        return arrayList;
    }

    public ArrayList<T> i() {
        this.f1252c.clear();
        this.f1253d.clear();
        int size = this.f1251b.size();
        for (int i = 0; i < size; i++) {
            e(this.f1251b.i(i), this.f1252c, this.f1253d);
        }
        return this.f1252c;
    }

    public boolean j(T t) {
        int size = this.f1251b.size();
        for (int i = 0; i < size; i++) {
            ArrayList m = this.f1251b.m(i);
            if (m != null && m.contains(t)) {
                return true;
            }
        }
        return false;
    }
}
