package androidx.recyclerview.widget;

import a.h.j.e;
import a.h.j.f;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AdapterHelper */
class a implements g.a {

    /* renamed from: a  reason: collision with root package name */
    private e<b> f1838a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayList<b> f1839b;

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<b> f1840c;

    /* renamed from: d  reason: collision with root package name */
    final C0047a f1841d;

    /* renamed from: e  reason: collision with root package name */
    Runnable f1842e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f1843f;
    final g g;
    private int h;

    /* renamed from: androidx.recyclerview.widget.a$a  reason: collision with other inner class name */
    /* compiled from: AdapterHelper */
    interface C0047a {
        void a(int i, int i2);

        void b(b bVar);

        void c(int i, int i2, Object obj);

        void d(b bVar);

        RecyclerView.b0 e(int i);

        void f(int i, int i2);

        void g(int i, int i2);

        void h(int i, int i2);
    }

    /* compiled from: AdapterHelper */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        int f1844a;

        /* renamed from: b  reason: collision with root package name */
        int f1845b;

        /* renamed from: c  reason: collision with root package name */
        Object f1846c;

        /* renamed from: d  reason: collision with root package name */
        int f1847d;

        b(int i, int i2, int i3, Object obj) {
            this.f1844a = i;
            this.f1845b = i2;
            this.f1847d = i3;
            this.f1846c = obj;
        }

        /* access modifiers changed from: package-private */
        public String a() {
            int i = this.f1844a;
            if (i == 1) {
                return "add";
            }
            if (i == 2) {
                return "rm";
            }
            if (i != 4) {
                return i != 8 ? "??" : "mv";
            }
            return "up";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i = this.f1844a;
            if (i != bVar.f1844a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f1847d - this.f1845b) == 1 && this.f1847d == bVar.f1845b && this.f1845b == bVar.f1847d) {
                return true;
            }
            if (this.f1847d != bVar.f1847d || this.f1845b != bVar.f1845b) {
                return false;
            }
            Object obj2 = this.f1846c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f1846c)) {
                    return false;
                }
            } else if (bVar.f1846c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f1844a * 31) + this.f1845b) * 31) + this.f1847d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f1845b + "c:" + this.f1847d + ",p:" + this.f1846c + "]";
        }
    }

    a(C0047a aVar) {
        this(aVar, false);
    }

    private void c(b bVar) {
        t(bVar);
    }

    private void d(b bVar) {
        t(bVar);
    }

    private void f(b bVar) {
        char c2;
        boolean z;
        boolean z2;
        int i = bVar.f1845b;
        int i2 = bVar.f1847d + i;
        char c3 = 65535;
        int i3 = i;
        int i4 = 0;
        while (i3 < i2) {
            if (this.f1841d.e(i3) != null || h(i3)) {
                if (c3 == 0) {
                    k(b(2, i, i4, (Object) null));
                    z2 = true;
                } else {
                    z2 = false;
                }
                c2 = 1;
            } else {
                if (c3 == 1) {
                    t(b(2, i, i4, (Object) null));
                    z = true;
                } else {
                    z = false;
                }
                c2 = 0;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            c3 = c2;
        }
        if (i4 != bVar.f1847d) {
            a(bVar);
            bVar = b(2, i, i4, (Object) null);
        }
        if (c3 == 0) {
            k(bVar);
        } else {
            t(bVar);
        }
    }

    private void g(b bVar) {
        int i = bVar.f1845b;
        int i2 = bVar.f1847d + i;
        int i3 = i;
        char c2 = 65535;
        int i4 = 0;
        while (i < i2) {
            if (this.f1841d.e(i) != null || h(i)) {
                if (c2 == 0) {
                    k(b(4, i3, i4, bVar.f1846c));
                    i3 = i;
                    i4 = 0;
                }
                c2 = 1;
            } else {
                if (c2 == 1) {
                    t(b(4, i3, i4, bVar.f1846c));
                    i3 = i;
                    i4 = 0;
                }
                c2 = 0;
            }
            i4++;
            i++;
        }
        if (i4 != bVar.f1847d) {
            Object obj = bVar.f1846c;
            a(bVar);
            bVar = b(4, i3, i4, obj);
        }
        if (c2 == 0) {
            k(bVar);
        } else {
            t(bVar);
        }
    }

    private boolean h(int i) {
        int size = this.f1840c.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f1840c.get(i2);
            int i3 = bVar.f1844a;
            if (i3 == 8) {
                if (n(bVar.f1847d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.f1845b;
                int i5 = bVar.f1847d + i4;
                while (i4 < i5) {
                    if (n(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    private void k(b bVar) {
        int i;
        int i2 = bVar.f1844a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int x = x(bVar.f1845b, i2);
        int i3 = bVar.f1845b;
        int i4 = bVar.f1844a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i5 = 1;
        for (int i6 = 1; i6 < bVar.f1847d; i6++) {
            int x2 = x(bVar.f1845b + (i * i6), bVar.f1844a);
            int i7 = bVar.f1844a;
            if (i7 == 2 ? x2 == x : i7 == 4 && x2 == x + 1) {
                i5++;
            } else {
                b b2 = b(bVar.f1844a, x, i5, bVar.f1846c);
                l(b2, i3);
                a(b2);
                if (bVar.f1844a == 4) {
                    i3 += i5;
                }
                x = x2;
                i5 = 1;
            }
        }
        Object obj = bVar.f1846c;
        a(bVar);
        if (i5 > 0) {
            b b3 = b(bVar.f1844a, x, i5, obj);
            l(b3, i3);
            a(b3);
        }
    }

    private void t(b bVar) {
        this.f1840c.add(bVar);
        int i = bVar.f1844a;
        if (i == 1) {
            this.f1841d.g(bVar.f1845b, bVar.f1847d);
        } else if (i == 2) {
            this.f1841d.f(bVar.f1845b, bVar.f1847d);
        } else if (i == 4) {
            this.f1841d.c(bVar.f1845b, bVar.f1847d, bVar.f1846c);
        } else if (i == 8) {
            this.f1841d.a(bVar.f1845b, bVar.f1847d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    private int x(int i, int i2) {
        for (int size = this.f1840c.size() - 1; size >= 0; size--) {
            b bVar = this.f1840c.get(size);
            int i3 = bVar.f1844a;
            if (i3 == 8) {
                int i4 = bVar.f1845b;
                int i5 = bVar.f1847d;
                if (i4 >= i5) {
                    int i6 = i5;
                    i5 = i4;
                    i4 = i6;
                }
                if (i < i4 || i > i5) {
                    int i7 = bVar.f1845b;
                    if (i < i7) {
                        if (i2 == 1) {
                            bVar.f1845b = i7 + 1;
                            bVar.f1847d++;
                        } else if (i2 == 2) {
                            bVar.f1845b = i7 - 1;
                            bVar.f1847d--;
                        }
                    }
                } else {
                    int i8 = bVar.f1845b;
                    if (i4 == i8) {
                        if (i2 == 1) {
                            bVar.f1847d++;
                        } else if (i2 == 2) {
                            bVar.f1847d--;
                        }
                        i++;
                    } else {
                        if (i2 == 1) {
                            bVar.f1845b = i8 + 1;
                        } else if (i2 == 2) {
                            bVar.f1845b = i8 - 1;
                        }
                        i--;
                    }
                }
            } else {
                int i9 = bVar.f1845b;
                if (i9 <= i) {
                    if (i3 == 1) {
                        i -= bVar.f1847d;
                    } else if (i3 == 2) {
                        i += bVar.f1847d;
                    }
                } else if (i2 == 1) {
                    bVar.f1845b = i9 + 1;
                } else if (i2 == 2) {
                    bVar.f1845b = i9 - 1;
                }
            }
        }
        for (int size2 = this.f1840c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f1840c.get(size2);
            if (bVar2.f1844a == 8) {
                int i10 = bVar2.f1847d;
                if (i10 == bVar2.f1845b || i10 < 0) {
                    this.f1840c.remove(size2);
                    a(bVar2);
                }
            } else if (bVar2.f1847d <= 0) {
                this.f1840c.remove(size2);
                a(bVar2);
            }
        }
        return i;
    }

    public void a(b bVar) {
        if (!this.f1843f) {
            bVar.f1846c = null;
            this.f1838a.a(bVar);
        }
    }

    public b b(int i, int i2, int i3, Object obj) {
        b b2 = this.f1838a.b();
        if (b2 == null) {
            return new b(i, i2, i3, obj);
        }
        b2.f1844a = i;
        b2.f1845b = i2;
        b2.f1847d = i3;
        b2.f1846c = obj;
        return b2;
    }

    public int e(int i) {
        int size = this.f1839b.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f1839b.get(i2);
            int i3 = bVar.f1844a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = bVar.f1845b;
                    if (i4 <= i) {
                        int i5 = bVar.f1847d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = bVar.f1845b;
                    if (i6 == i) {
                        i = bVar.f1847d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (bVar.f1847d <= i) {
                            i++;
                        }
                    }
                }
            } else if (bVar.f1845b <= i) {
                i += bVar.f1847d;
            }
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public void i() {
        int size = this.f1840c.size();
        for (int i = 0; i < size; i++) {
            this.f1841d.d(this.f1840c.get(i));
        }
        v(this.f1840c);
        this.h = 0;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        i();
        int size = this.f1839b.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.f1839b.get(i);
            int i2 = bVar.f1844a;
            if (i2 == 1) {
                this.f1841d.d(bVar);
                this.f1841d.g(bVar.f1845b, bVar.f1847d);
            } else if (i2 == 2) {
                this.f1841d.d(bVar);
                this.f1841d.h(bVar.f1845b, bVar.f1847d);
            } else if (i2 == 4) {
                this.f1841d.d(bVar);
                this.f1841d.c(bVar.f1845b, bVar.f1847d, bVar.f1846c);
            } else if (i2 == 8) {
                this.f1841d.d(bVar);
                this.f1841d.a(bVar.f1845b, bVar.f1847d);
            }
            Runnable runnable = this.f1842e;
            if (runnable != null) {
                runnable.run();
            }
        }
        v(this.f1839b);
        this.h = 0;
    }

    /* access modifiers changed from: package-private */
    public void l(b bVar, int i) {
        this.f1841d.b(bVar);
        int i2 = bVar.f1844a;
        if (i2 == 2) {
            this.f1841d.h(i, bVar.f1847d);
        } else if (i2 == 4) {
            this.f1841d.c(i, bVar.f1847d, bVar.f1846c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* access modifiers changed from: package-private */
    public int m(int i) {
        return n(i, 0);
    }

    /* access modifiers changed from: package-private */
    public int n(int i, int i2) {
        int size = this.f1840c.size();
        while (i2 < size) {
            b bVar = this.f1840c.get(i2);
            int i3 = bVar.f1844a;
            if (i3 == 8) {
                int i4 = bVar.f1845b;
                if (i4 == i) {
                    i = bVar.f1847d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.f1847d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.f1845b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.f1847d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.f1847d;
                }
            }
            i2++;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public boolean o(int i) {
        return (i & this.h) != 0;
    }

    /* access modifiers changed from: package-private */
    public boolean p() {
        return this.f1839b.size() > 0;
    }

    /* access modifiers changed from: package-private */
    public boolean q() {
        return !this.f1840c.isEmpty() && !this.f1839b.isEmpty();
    }

    /* access modifiers changed from: package-private */
    public boolean r(int i, int i2, Object obj) {
        if (i2 < 1) {
            return false;
        }
        this.f1839b.add(b(4, i, i2, obj));
        this.h |= 4;
        if (this.f1839b.size() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean s(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f1839b.add(b(2, i, i2, (Object) null));
        this.h |= 2;
        if (this.f1839b.size() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void u() {
        this.g.b(this.f1839b);
        int size = this.f1839b.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.f1839b.get(i);
            int i2 = bVar.f1844a;
            if (i2 == 1) {
                c(bVar);
            } else if (i2 == 2) {
                f(bVar);
            } else if (i2 == 4) {
                g(bVar);
            } else if (i2 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f1842e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f1839b.clear();
    }

    /* access modifiers changed from: package-private */
    public void v(List<b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a(list.get(i));
        }
        list.clear();
    }

    /* access modifiers changed from: package-private */
    public void w() {
        v(this.f1839b);
        v(this.f1840c);
        this.h = 0;
    }

    a(C0047a aVar, boolean z) {
        this.f1838a = new f(30);
        this.f1839b = new ArrayList<>();
        this.f1840c = new ArrayList<>();
        this.h = 0;
        this.f1841d = aVar;
        this.f1843f = z;
        this.g = new g(this);
    }
}
