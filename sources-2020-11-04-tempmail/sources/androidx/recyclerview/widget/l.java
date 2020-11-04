package androidx.recyclerview.widget;

import android.view.View;

/* compiled from: ViewBoundsCheck */
class l {

    /* renamed from: a  reason: collision with root package name */
    final b f1930a;

    /* renamed from: b  reason: collision with root package name */
    a f1931b = new a();

    /* compiled from: ViewBoundsCheck */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        int f1932a = 0;

        /* renamed from: b  reason: collision with root package name */
        int f1933b;

        /* renamed from: c  reason: collision with root package name */
        int f1934c;

        /* renamed from: d  reason: collision with root package name */
        int f1935d;

        /* renamed from: e  reason: collision with root package name */
        int f1936e;

        a() {
        }

        /* access modifiers changed from: package-private */
        public void a(int i) {
            this.f1932a = i | this.f1932a;
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            int i = this.f1932a;
            if ((i & 7) != 0 && (i & (c(this.f1935d, this.f1933b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f1932a;
            if ((i2 & 112) != 0 && (i2 & (c(this.f1935d, this.f1934c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f1932a;
            if ((i3 & 1792) != 0 && (i3 & (c(this.f1936e, this.f1933b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f1932a;
            if ((i4 & 28672) == 0 || (i4 & (c(this.f1936e, this.f1934c) << 12)) != 0) {
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
            this.f1932a = 0;
        }

        /* access modifiers changed from: package-private */
        public void e(int i, int i2, int i3, int i4) {
            this.f1933b = i;
            this.f1934c = i2;
            this.f1935d = i3;
            this.f1936e = i4;
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
        this.f1930a = bVar;
    }

    /* access modifiers changed from: package-private */
    public View a(int i, int i2, int i3, int i4) {
        int c2 = this.f1930a.c();
        int d2 = this.f1930a.d();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View a2 = this.f1930a.a(i);
            this.f1931b.e(c2, d2, this.f1930a.b(a2), this.f1930a.e(a2));
            if (i3 != 0) {
                this.f1931b.d();
                this.f1931b.a(i3);
                if (this.f1931b.b()) {
                    return a2;
                }
            }
            if (i4 != 0) {
                this.f1931b.d();
                this.f1931b.a(i4);
                if (this.f1931b.b()) {
                    view = a2;
                }
            }
            i += i5;
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    public boolean b(View view, int i) {
        this.f1931b.e(this.f1930a.c(), this.f1930a.d(), this.f1930a.b(view), this.f1930a.e(view));
        if (i == 0) {
            return false;
        }
        this.f1931b.d();
        this.f1931b.a(i);
        return this.f1931b.b();
    }
}
