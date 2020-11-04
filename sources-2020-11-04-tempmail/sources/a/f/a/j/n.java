package a.f.a.j;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: ResolutionNode */
public class n {

    /* renamed from: a  reason: collision with root package name */
    HashSet<n> f240a = new HashSet<>(2);

    /* renamed from: b  reason: collision with root package name */
    int f241b = 0;

    public void a(n nVar) {
        this.f240a.add(nVar);
    }

    public void b() {
        this.f241b = 1;
        Iterator<n> it = this.f240a.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    public void c() {
        this.f241b = 0;
        Iterator<n> it = this.f240a.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    public boolean d() {
        return this.f241b == 1;
    }

    public void e() {
        this.f241b = 0;
        this.f240a.clear();
    }

    public void f() {
    }
}
