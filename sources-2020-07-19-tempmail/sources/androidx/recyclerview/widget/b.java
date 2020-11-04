package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ChildHelper */
class b {

    /* renamed from: a  reason: collision with root package name */
    final C0048b f1765a;

    /* renamed from: b  reason: collision with root package name */
    final a f1766b = new a();

    /* renamed from: c  reason: collision with root package name */
    final List<View> f1767c = new ArrayList();

    /* compiled from: ChildHelper */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        long f1768a = 0;

        /* renamed from: b  reason: collision with root package name */
        a f1769b;

        a() {
        }

        private void c() {
            if (this.f1769b == null) {
                this.f1769b = new a();
            }
        }

        /* access modifiers changed from: package-private */
        public void a(int i) {
            if (i >= 64) {
                a aVar = this.f1769b;
                if (aVar != null) {
                    aVar.a(i - 64);
                    return;
                }
                return;
            }
            this.f1768a &= ~(1 << i);
        }

        /* access modifiers changed from: package-private */
        public int b(int i) {
            a aVar = this.f1769b;
            if (aVar == null) {
                if (i >= 64) {
                    return Long.bitCount(this.f1768a);
                }
                return Long.bitCount(this.f1768a & ((1 << i) - 1));
            } else if (i < 64) {
                return Long.bitCount(this.f1768a & ((1 << i) - 1));
            } else {
                return aVar.b(i - 64) + Long.bitCount(this.f1768a);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean d(int i) {
            if (i < 64) {
                return (this.f1768a & (1 << i)) != 0;
            }
            c();
            return this.f1769b.d(i - 64);
        }

        /* access modifiers changed from: package-private */
        public void e(int i, boolean z) {
            if (i >= 64) {
                c();
                this.f1769b.e(i - 64, z);
                return;
            }
            boolean z2 = (this.f1768a & Long.MIN_VALUE) != 0;
            long j = (1 << i) - 1;
            long j2 = this.f1768a;
            this.f1768a = ((j2 & (~j)) << 1) | (j2 & j);
            if (z) {
                h(i);
            } else {
                a(i);
            }
            if (z2 || this.f1769b != null) {
                c();
                this.f1769b.e(0, z2);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean f(int i) {
            if (i >= 64) {
                c();
                return this.f1769b.f(i - 64);
            }
            long j = 1 << i;
            boolean z = (this.f1768a & j) != 0;
            long j2 = this.f1768a & (~j);
            this.f1768a = j2;
            long j3 = j - 1;
            this.f1768a = (j2 & j3) | Long.rotateRight((~j3) & j2, 1);
            a aVar = this.f1769b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f1769b.f(0);
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        public void g() {
            this.f1768a = 0;
            a aVar = this.f1769b;
            if (aVar != null) {
                aVar.g();
            }
        }

        /* access modifiers changed from: package-private */
        public void h(int i) {
            if (i >= 64) {
                c();
                this.f1769b.h(i - 64);
                return;
            }
            this.f1768a |= 1 << i;
        }

        public String toString() {
            if (this.f1769b == null) {
                return Long.toBinaryString(this.f1768a);
            }
            return this.f1769b.toString() + "xx" + Long.toBinaryString(this.f1768a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.b$b  reason: collision with other inner class name */
    /* compiled from: ChildHelper */
    interface C0048b {
        View a(int i);

        void b(View view);

        int c();

        void d();

        int e(View view);

        RecyclerView.b0 f(View view);

        void g(int i);

        void h(View view);

        void i(View view, int i);

        void j(int i);

        void k(View view, int i, ViewGroup.LayoutParams layoutParams);
    }

    b(C0048b bVar) {
        this.f1765a = bVar;
    }

    private int h(int i) {
        if (i < 0) {
            return -1;
        }
        int c2 = this.f1765a.c();
        int i2 = i;
        while (i2 < c2) {
            int b2 = i - (i2 - this.f1766b.b(i2));
            if (b2 == 0) {
                while (this.f1766b.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b2;
        }
        return -1;
    }

    private void l(View view) {
        this.f1767c.add(view);
        this.f1765a.b(view);
    }

    private boolean t(View view) {
        if (!this.f1767c.remove(view)) {
            return false;
        }
        this.f1765a.h(view);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void a(View view, int i, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.f1765a.c();
        } else {
            i2 = h(i);
        }
        this.f1766b.e(i2, z);
        if (z) {
            l(view);
        }
        this.f1765a.i(view, i2);
    }

    /* access modifiers changed from: package-private */
    public void b(View view, boolean z) {
        a(view, -1, z);
    }

    /* access modifiers changed from: package-private */
    public void c(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.f1765a.c();
        } else {
            i2 = h(i);
        }
        this.f1766b.e(i2, z);
        if (z) {
            l(view);
        }
        this.f1765a.k(view, i2, layoutParams);
    }

    /* access modifiers changed from: package-private */
    public void d(int i) {
        int h = h(i);
        this.f1766b.f(h);
        this.f1765a.g(h);
    }

    /* access modifiers changed from: package-private */
    public View e(int i) {
        int size = this.f1767c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f1767c.get(i2);
            RecyclerView.b0 f2 = this.f1765a.f(view);
            if (f2.m() == i && !f2.s() && !f2.u()) {
                return view;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public View f(int i) {
        return this.f1765a.a(h(i));
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.f1765a.c() - this.f1767c.size();
    }

    /* access modifiers changed from: package-private */
    public View i(int i) {
        return this.f1765a.a(i);
    }

    /* access modifiers changed from: package-private */
    public int j() {
        return this.f1765a.c();
    }

    /* access modifiers changed from: package-private */
    public void k(View view) {
        int e2 = this.f1765a.e(view);
        if (e2 >= 0) {
            this.f1766b.h(e2);
            l(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* access modifiers changed from: package-private */
    public int m(View view) {
        int e2 = this.f1765a.e(view);
        if (e2 != -1 && !this.f1766b.d(e2)) {
            return e2 - this.f1766b.b(e2);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public boolean n(View view) {
        return this.f1767c.contains(view);
    }

    /* access modifiers changed from: package-private */
    public void o() {
        this.f1766b.g();
        for (int size = this.f1767c.size() - 1; size >= 0; size--) {
            this.f1765a.h(this.f1767c.get(size));
            this.f1767c.remove(size);
        }
        this.f1765a.d();
    }

    /* access modifiers changed from: package-private */
    public void p(View view) {
        int e2 = this.f1765a.e(view);
        if (e2 >= 0) {
            if (this.f1766b.f(e2)) {
                t(view);
            }
            this.f1765a.j(e2);
        }
    }

    /* access modifiers changed from: package-private */
    public void q(int i) {
        int h = h(i);
        View a2 = this.f1765a.a(h);
        if (a2 != null) {
            if (this.f1766b.f(h)) {
                t(a2);
            }
            this.f1765a.j(h);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean r(View view) {
        int e2 = this.f1765a.e(view);
        if (e2 == -1) {
            t(view);
            return true;
        } else if (!this.f1766b.d(e2)) {
            return false;
        } else {
            this.f1766b.f(e2);
            t(view);
            this.f1765a.j(e2);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public void s(View view) {
        int e2 = this.f1765a.e(view);
        if (e2 < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f1766b.d(e2)) {
            this.f1766b.a(e2);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f1766b.toString() + ", hidden list:" + this.f1767c.size();
    }
}
