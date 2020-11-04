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
    private e<b> f1755a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayList<b> f1756b;

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<b> f1757c;

    /* renamed from: d  reason: collision with root package name */
    final C0047a f1758d;

    /* renamed from: e  reason: collision with root package name */
    Runnable f1759e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f1760f;
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
        int f1761a;

        /* renamed from: b  reason: collision with root package name */
        int f1762b;

        /* renamed from: c  reason: collision with root package name */
        Object f1763c;

        /* renamed from: d  reason: collision with root package name */
        int f1764d;

        b(int i, int i2, int i3, Object obj) {
            this.f1761a = i;
            this.f1762b = i2;
            this.f1764d = i3;
            this.f1763c = obj;
        }

        /* access modifiers changed from: package-private */
        public String a() {
            int i = this.f1761a;
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
            int i = this.f1761a;
            if (i != bVar.f1761a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f1764d - this.f1762b) == 1 && this.f1764d == bVar.f1762b && this.f1762b == bVar.f1764d) {
                return true;
            }
            if (this.f1764d != bVar.f1764d || this.f1762b != bVar.f1762b) {
                return false;
            }
            Object obj2 = this.f1763c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f1763c)) {
                    return false;
                }
            } else if (bVar.f1763c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f1761a * 31) + this.f1762b) * 31) + this.f1764d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f1762b + "c:" + this.f1764d + ",p:" + this.f1763c + "]";
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
        int i = bVar.f1762b;
        int i2 = bVar.f1764d + i;
        char c3 = 65535;
        int i3 = i;
        int i4 = 0;
        while (i3 < i2) {
            if (this.f1758d.e(i3) != null || h(i3)) {
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
        if (i4 != bVar.f1764d) {
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
        int i = bVar.f1762b;
        int i2 = bVar.f1764d + i;
        int i3 = i;
        char c2 = 65535;
        int i4 = 0;
        while (i < i2) {
            if (this.f1758d.e(i) != null || h(i)) {
                if (c2 == 0) {
                    k(b(4, i3, i4, bVar.f1763c));
                    i3 = i;
                    i4 = 0;
                }
                c2 = 1;
            } else {
                if (c2 == 1) {
                    t(b(4, i3, i4, bVar.f1763c));
                    i3 = i;
                    i4 = 0;
                }
                c2 = 0;
            }
            i4++;
            i++;
        }
        if (i4 != bVar.f1764d) {
            Object obj = bVar.f1763c;
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
        int size = this.f1757c.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f1757c.get(i2);
            int i3 = bVar.f1761a;
            if (i3 == 8) {
                if (n(bVar.f1764d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.f1762b;
                int i5 = bVar.f1764d + i4;
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
        int i2 = bVar.f1761a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int x = x(bVar.f1762b, i2);
        int i3 = bVar.f1762b;
        int i4 = bVar.f1761a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i5 = 1;
        for (int i6 = 1; i6 < bVar.f1764d; i6++) {
            int x2 = x(bVar.f1762b + (i * i6), bVar.f1761a);
            int i7 = bVar.f1761a;
            if (i7 == 2 ? x2 == x : i7 == 4 && x2 == x + 1) {
                i5++;
            } else {
                b b2 = b(bVar.f1761a, x, i5, bVar.f1763c);
                l(b2, i3);
                a(b2);
                if (bVar.f1761a == 4) {
                    i3 += i5;
                }
                x = x2;
                i5 = 1;
            }
        }
        Object obj = bVar.f1763c;
        a(bVar);
        if (i5 > 0) {
            b b3 = b(bVar.f1761a, x, i5, obj);
            l(b3, i3);
            a(b3);
        }
    }

    private void t(b bVar) {
        this.f1757c.add(bVar);
        int i = bVar.f1761a;
        if (i == 1) {
            this.f1758d.g(bVar.f1762b, bVar.f1764d);
        } else if (i == 2) {
            this.f1758d.f(bVar.f1762b, bVar.f1764d);
        } else if (i == 4) {
            this.f1758d.c(bVar.f1762b, bVar.f1764d, bVar.f1763c);
        } else if (i == 8) {
            this.f1758d.a(bVar.f1762b, bVar.f1764d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    private int x(int i, int i2) {
        for (int size = this.f1757c.size() - 1; size >= 0; size--) {
            b bVar = this.f1757c.get(size);
            int i3 = bVar.f1761a;
            if (i3 == 8) {
                int i4 = bVar.f1762b;
                int i5 = bVar.f1764d;
                if (i4 >= i5) {
                    int i6 = i5;
                    i5 = i4;
                    i4 = i6;
                }
                if (i < i4 || i > i5) {
                    int i7 = bVar.f1762b;
                    if (i < i7) {
                        if (i2 == 1) {
                            bVar.f1762b = i7 + 1;
                            bVar.f1764d++;
                        } else if (i2 == 2) {
                            bVar.f1762b = i7 - 1;
                            bVar.f1764d--;
                        }
                    }
                } else {
                    int i8 = bVar.f1762b;
                    if (i4 == i8) {
                        if (i2 == 1) {
                            bVar.f1764d++;
                        } else if (i2 == 2) {
                            bVar.f1764d--;
                        }
                        i++;
                    } else {
                        if (i2 == 1) {
                            bVar.f1762b = i8 + 1;
                        } else if (i2 == 2) {
                            bVar.f1762b = i8 - 1;
                        }
                        i--;
                    }
                }
            } else {
                int i9 = bVar.f1762b;
                if (i9 <= i) {
                    if (i3 == 1) {
                        i -= bVar.f1764d;
                    } else if (i3 == 2) {
                        i += bVar.f1764d;
                    }
                } else if (i2 == 1) {
                    bVar.f1762b = i9 + 1;
                } else if (i2 == 2) {
                    bVar.f1762b = i9 - 1;
                }
            }
        }
        for (int size2 = this.f1757c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f1757c.get(size2);
            if (bVar2.f1761a == 8) {
                int i10 = bVar2.f1764d;
                if (i10 == bVar2.f1762b || i10 < 0) {
                    this.f1757c.remove(size2);
                    a(bVar2);
                }
            } else if (bVar2.f1764d <= 0) {
                this.f1757c.remove(size2);
                a(bVar2);
            }
        }
        return i;
    }

    public void a(b bVar) {
        if (!this.f1760f) {
            bVar.f1763c = null;
            this.f1755a.a(bVar);
        }
    }

    public b b(int i, int i2, int i3, Object obj) {
        b b2 = this.f1755a.b();
        if (b2 == null) {
            return new b(i, i2, i3, obj);
        }
        b2.f1761a = i;
        b2.f1762b = i2;
        b2.f1764d = i3;
        b2.f1763c = obj;
        return b2;
    }

    public int e(int i) {
        int size = this.f1756b.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f1756b.get(i2);
            int i3 = bVar.f1761a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = bVar.f1762b;
                    if (i4 <= i) {
                        int i5 = bVar.f1764d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = bVar.f1762b;
                    if (i6 == i) {
                        i = bVar.f1764d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (bVar.f1764d <= i) {
                            i++;
                        }
                    }
                }
            } else if (bVar.f1762b <= i) {
                i += bVar.f1764d;
            }
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public void i() {
        int size = this.f1757c.size();
        for (int i = 0; i < size; i++) {
            this.f1758d.d(this.f1757c.get(i));
        }
        v(this.f1757c);
        this.h = 0;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        i();
        int size = this.f1756b.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.f1756b.get(i);
            int i2 = bVar.f1761a;
            if (i2 == 1) {
                this.f1758d.d(bVar);
                this.f1758d.g(bVar.f1762b, bVar.f1764d);
            } else if (i2 == 2) {
                this.f1758d.d(bVar);
                this.f1758d.h(bVar.f1762b, bVar.f1764d);
            } else if (i2 == 4) {
                this.f1758d.d(bVar);
                this.f1758d.c(bVar.f1762b, bVar.f1764d, bVar.f1763c);
            } else if (i2 == 8) {
                this.f1758d.d(bVar);
                this.f1758d.a(bVar.f1762b, bVar.f1764d);
            }
            Runnable runnable = this.f1759e;
            if (runnable != null) {
                runnable.run();
            }
        }
        v(this.f1756b);
        this.h = 0;
    }

    /* access modifiers changed from: package-private */
    public void l(b bVar, int i) {
        this.f1758d.b(bVar);
        int i2 = bVar.f1761a;
        if (i2 == 2) {
            this.f1758d.h(i, bVar.f1764d);
        } else if (i2 == 4) {
            this.f1758d.c(i, bVar.f1764d, bVar.f1763c);
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
        int size = this.f1757c.size();
        while (i2 < size) {
            b bVar = this.f1757c.get(i2);
            int i3 = bVar.f1761a;
            if (i3 == 8) {
                int i4 = bVar.f1762b;
                if (i4 == i) {
                    i = bVar.f1764d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.f1764d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.f1762b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.f1764d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.f1764d;
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
        return this.f1756b.size() > 0;
    }

    /* access modifiers changed from: package-private */
    public boolean q() {
        return !this.f1757c.isEmpty() && !this.f1756b.isEmpty();
    }

    /* access modifiers changed from: package-private */
    public boolean r(int i, int i2, Object obj) {
        if (i2 < 1) {
            return false;
        }
        this.f1756b.add(b(4, i, i2, obj));
        this.h |= 4;
        if (this.f1756b.size() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean s(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f1756b.add(b(2, i, i2, (Object) null));
        this.h |= 2;
        if (this.f1756b.size() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void u() {
        this.g.b(this.f1756b);
        int size = this.f1756b.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.f1756b.get(i);
            int i2 = bVar.f1761a;
            if (i2 == 1) {
                c(bVar);
            } else if (i2 == 2) {
                f(bVar);
            } else if (i2 == 4) {
                g(bVar);
            } else if (i2 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f1759e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f1756b.clear();
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
        v(this.f1756b);
        v(this.f1757c);
        this.h = 0;
    }

    a(C0047a aVar, boolean z) {
        this.f1755a = new f(30);
        this.f1756b = new ArrayList<>();
        this.f1757c = new ArrayList<>();
        this.h = 0;
        this.f1758d = aVar;
        this.f1760f = z;
        this.g = new g(this);
    }
}
