package androidx.recyclerview.widget;

import a.e.d;
import a.h.j.e;
import a.h.j.f;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ViewInfoStore */
class m {

    /* renamed from: a  reason: collision with root package name */
    final a.e.a<RecyclerView.b0, a> f1854a = new a.e.a<>();

    /* renamed from: b  reason: collision with root package name */
    final d<RecyclerView.b0> f1855b = new d<>();

    /* compiled from: ViewInfoStore */
    static class a {

        /* renamed from: d  reason: collision with root package name */
        static e<a> f1856d = new f(20);

        /* renamed from: a  reason: collision with root package name */
        int f1857a;

        /* renamed from: b  reason: collision with root package name */
        RecyclerView.l.c f1858b;

        /* renamed from: c  reason: collision with root package name */
        RecyclerView.l.c f1859c;

        private a() {
        }

        static void a() {
            do {
            } while (f1856d.b() != null);
        }

        static a b() {
            a b2 = f1856d.b();
            return b2 == null ? new a() : b2;
        }

        static void c(a aVar) {
            aVar.f1857a = 0;
            aVar.f1858b = null;
            aVar.f1859c = null;
            f1856d.a(aVar);
        }
    }

    /* compiled from: ViewInfoStore */
    interface b {
        void a(RecyclerView.b0 b0Var);

        void b(RecyclerView.b0 b0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);

        void c(RecyclerView.b0 b0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);

        void d(RecyclerView.b0 b0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);
    }

    m() {
    }

    private RecyclerView.l.c l(RecyclerView.b0 b0Var, int i) {
        a m;
        RecyclerView.l.c cVar;
        int f2 = this.f1854a.f(b0Var);
        if (f2 >= 0 && (m = this.f1854a.m(f2)) != null) {
            int i2 = m.f1857a;
            if ((i2 & i) != 0) {
                m.f1857a = (~i) & i2;
                if (i == 4) {
                    cVar = m.f1858b;
                } else if (i == 8) {
                    cVar = m.f1859c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((m.f1857a & 12) == 0) {
                    this.f1854a.k(f2);
                    a.c(m);
                }
                return cVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void a(RecyclerView.b0 b0Var, RecyclerView.l.c cVar) {
        a aVar = this.f1854a.get(b0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f1854a.put(b0Var, aVar);
        }
        aVar.f1857a |= 2;
        aVar.f1858b = cVar;
    }

    /* access modifiers changed from: package-private */
    public void b(RecyclerView.b0 b0Var) {
        a aVar = this.f1854a.get(b0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f1854a.put(b0Var, aVar);
        }
        aVar.f1857a |= 1;
    }

    /* access modifiers changed from: package-private */
    public void c(long j, RecyclerView.b0 b0Var) {
        this.f1855b.n(j, b0Var);
    }

    /* access modifiers changed from: package-private */
    public void d(RecyclerView.b0 b0Var, RecyclerView.l.c cVar) {
        a aVar = this.f1854a.get(b0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f1854a.put(b0Var, aVar);
        }
        aVar.f1859c = cVar;
        aVar.f1857a |= 8;
    }

    /* access modifiers changed from: package-private */
    public void e(RecyclerView.b0 b0Var, RecyclerView.l.c cVar) {
        a aVar = this.f1854a.get(b0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f1854a.put(b0Var, aVar);
        }
        aVar.f1858b = cVar;
        aVar.f1857a |= 4;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f1854a.clear();
        this.f1855b.c();
    }

    /* access modifiers changed from: package-private */
    public RecyclerView.b0 g(long j) {
        return this.f1855b.i(j);
    }

    /* access modifiers changed from: package-private */
    public boolean h(RecyclerView.b0 b0Var) {
        a aVar = this.f1854a.get(b0Var);
        if (aVar == null || (aVar.f1857a & 1) == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean i(RecyclerView.b0 b0Var) {
        a aVar = this.f1854a.get(b0Var);
        return (aVar == null || (aVar.f1857a & 4) == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        a.a();
    }

    public void k(RecyclerView.b0 b0Var) {
        p(b0Var);
    }

    /* access modifiers changed from: package-private */
    public RecyclerView.l.c m(RecyclerView.b0 b0Var) {
        return l(b0Var, 8);
    }

    /* access modifiers changed from: package-private */
    public RecyclerView.l.c n(RecyclerView.b0 b0Var) {
        return l(b0Var, 4);
    }

    /* access modifiers changed from: package-private */
    public void o(b bVar) {
        for (int size = this.f1854a.size() - 1; size >= 0; size--) {
            RecyclerView.b0 i = this.f1854a.i(size);
            a k = this.f1854a.k(size);
            int i2 = k.f1857a;
            if ((i2 & 3) == 3) {
                bVar.a(i);
            } else if ((i2 & 1) != 0) {
                RecyclerView.l.c cVar = k.f1858b;
                if (cVar == null) {
                    bVar.a(i);
                } else {
                    bVar.c(i, cVar, k.f1859c);
                }
            } else if ((i2 & 14) == 14) {
                bVar.b(i, k.f1858b, k.f1859c);
            } else if ((i2 & 12) == 12) {
                bVar.d(i, k.f1858b, k.f1859c);
            } else if ((i2 & 4) != 0) {
                bVar.c(i, k.f1858b, (RecyclerView.l.c) null);
            } else if ((i2 & 8) != 0) {
                bVar.b(i, k.f1858b, k.f1859c);
            }
            a.c(k);
        }
    }

    /* access modifiers changed from: package-private */
    public void p(RecyclerView.b0 b0Var) {
        a aVar = this.f1854a.get(b0Var);
        if (aVar != null) {
            aVar.f1857a &= -2;
        }
    }

    /* access modifiers changed from: package-private */
    public void q(RecyclerView.b0 b0Var) {
        int r = this.f1855b.r() - 1;
        while (true) {
            if (r < 0) {
                break;
            } else if (b0Var == this.f1855b.s(r)) {
                this.f1855b.p(r);
                break;
            } else {
                r--;
            }
        }
        a remove = this.f1854a.remove(b0Var);
        if (remove != null) {
            a.c(remove);
        }
    }
}
