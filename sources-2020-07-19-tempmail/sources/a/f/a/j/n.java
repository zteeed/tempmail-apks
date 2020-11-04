package a.f.a.j;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: ResolutionNode */
public class n {

    /* renamed from: a  reason: collision with root package name */
    HashSet<n> f239a = new HashSet<>(2);

    /* renamed from: b  reason: collision with root package name */
    int f240b = 0;

    public void a(n nVar) {
        this.f239a.add(nVar);
    }

    public void b() {
        this.f240b = 1;
        Iterator<n> it = this.f239a.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    public void c() {
        this.f240b = 0;
        Iterator<n> it = this.f239a.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    public boolean d() {
        return this.f240b == 1;
    }

    public void e() {
        this.f240b = 0;
        this.f239a.clear();
    }

    public void f() {
    }
}
