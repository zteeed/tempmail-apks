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
    private final e<ArrayList<T>> f1277a = new f(10);

    /* renamed from: b  reason: collision with root package name */
    private final g<T, ArrayList<T>> f1278b = new g<>();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<T> f1279c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private final HashSet<T> f1280d = new HashSet<>();

    private void e(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList arrayList2 = this.f1278b.get(t);
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
        ArrayList<T> b2 = this.f1277a.b();
        return b2 == null ? new ArrayList<>() : b2;
    }

    private void k(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f1277a.a(arrayList);
    }

    public void a(T t, T t2) {
        if (!this.f1278b.containsKey(t) || !this.f1278b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = this.f1278b.get(t);
        if (arrayList == null) {
            arrayList = f();
            this.f1278b.put(t, arrayList);
        }
        arrayList.add(t2);
    }

    public void b(T t) {
        if (!this.f1278b.containsKey(t)) {
            this.f1278b.put(t, null);
        }
    }

    public void c() {
        int size = this.f1278b.size();
        for (int i = 0; i < size; i++) {
            ArrayList m = this.f1278b.m(i);
            if (m != null) {
                k(m);
            }
        }
        this.f1278b.clear();
    }

    public boolean d(T t) {
        return this.f1278b.containsKey(t);
    }

    public List g(T t) {
        return this.f1278b.get(t);
    }

    public List<T> h(T t) {
        int size = this.f1278b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList m = this.f1278b.m(i);
            if (m != null && m.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f1278b.i(i));
            }
        }
        return arrayList;
    }

    public ArrayList<T> i() {
        this.f1279c.clear();
        this.f1280d.clear();
        int size = this.f1278b.size();
        for (int i = 0; i < size; i++) {
            e(this.f1278b.i(i), this.f1279c, this.f1280d);
        }
        return this.f1279c;
    }

    public boolean j(T t) {
        int size = this.f1278b.size();
        for (int i = 0; i < size; i++) {
            ArrayList m = this.f1278b.m(i);
            if (m != null && m.contains(t)) {
                return true;
            }
        }
        return false;
    }
}
