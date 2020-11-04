package androidx.recyclerview.widget;

import android.view.View;

/* compiled from: ViewBoundsCheck */
class l {

    /* renamed from: a  reason: collision with root package name */
    final b f1847a;

    /* renamed from: b  reason: collision with root package name */
    a f1848b = new a();

    /* compiled from: ViewBoundsCheck */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        int f1849a = 0;

        /* renamed from: b  reason: collision with root package name */
        int f1850b;

        /* renamed from: c  reason: collision with root package name */
        int f1851c;

        /* renamed from: d  reason: collision with root package name */
        int f1852d;

        /* renamed from: e  reason: collision with root package name */
        int f1853e;

        a() {
        }

        /* access modifiers changed from: package-private */
        public void a(int i) {
            this.f1849a = i | this.f1849a;
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            int i = this.f1849a;
            if ((i & 7) != 0 && (i & (c(this.f1852d, this.f1850b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f1849a;
            if ((i2 & 112) != 0 && (i2 & (c(this.f1852d, this.f1851c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f1849a;
            if ((i3 & 1792) != 0 && (i3 & (c(this.f1853e, this.f1850b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f1849a;
            if ((i4 & 28672) == 0 || (i4 & (c(this.f1853e, this.f1851c) << 12)) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public int c(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.f1849a = 0;
        }

        /* access modifiers changed from: package-private */
        public void e(int i, int i2, int i3, int i4) {
            this.f1850b = i;
            this.f1851c = i2;
            this.f1852d = i3;
            this.f1853e = i4;
        }
    }

    /* compiled from: ViewBoundsCheck */
    interface b {
        View a(int i);

        int b(View view);

        int c();

        int d();

        int e(View view);
    }

    l(b bVar) {
        this.f1847a = bVar;
    }

    /* access modifiers changed from: package-private */
    public View a(int i, int i2, int i3, int i4) {
        int c2 = this.f1847a.c();
        int d2 = this.f1847a.d();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View a2 = this.f1847a.a(i);
            this.f1848b.e(c2, d2, this.f1847a.b(a2), this.f1847a.e(a2));
            if (i3 != 0) {
                this.f1848b.d();
                this.f1848b.a(i3);
                if (this.f1848b.b()) {
                    return a2;
                }
            }
            if (i4 != 0) {
                this.f1848b.d();
                this.f1848b.a(i4);
                if (this.f1848b.b()) {
                    view = a2;
                }
            }
            i += i5;
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    public boolean b(View view, int i) {
        this.f1848b.e(this.f1847a.c(), this.f1847a.d(), this.f1847a.b(view), this.f1847a.e(view));
        if (i == 0) {
            return false;
        }
        this.f1848b.d();
        this.f1848b.a(i);
        return this.f1848b.b();
    }
}
