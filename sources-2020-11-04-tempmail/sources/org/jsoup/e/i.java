package org.jsoup.e;

/* compiled from: Token */
abstract class i {

    /* renamed from: a  reason: collision with root package name */
    j f15227a;

    /* compiled from: Token */
    static final class b extends c {
        b(String str) {
            p(str);
        }

        public String toString() {
            return "<![CDATA[" + q() + "]]>";
        }
    }

    /* compiled from: Token */
    static class c extends i {

        /* renamed from: b  reason: collision with root package name */
        private String f15228b;

        c() {
            super();
            this.f15227a = j.Character;
        }

        /* access modifiers changed from: package-private */
        public i m() {
            this.f15228b = null;
            return this;
        }

        /* access modifiers changed from: package-private */
        public c p(String str) {
            this.f15228b = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public String q() {
            return this.f15228b;
        }

        public String toString() {
            return q();
        }
    }

    /* compiled from: Token */
    static final class d extends i {

        /* renamed from: b  reason: collision with root package name */
        final StringBuilder f15229b = new StringBuilder();

        d() {
            super();
            this.f15227a = j.Comment;
        }

        /* access modifiers changed from: package-private */
        public i m() {
            i.n(this.f15229b);
            return this;
        }

        /* access modifiers changed from: package-private */
        public String p() {
            return this.f15229b.toString();
        }

        public String toString() {
            return "<!--" + p() + "-->";
        }
    }

    /* compiled from: Token */
    static final class e extends i {

        /* renamed from: b  reason: collision with root package name */
        final StringBuilder f15230b = new StringBuilder();

        /* renamed from: c  reason: collision with root package name */
        String f15231c = null;

        /* renamed from: d  reason: collision with root package name */
        final StringBuilder f15232d = new StringBuilder();

        /* renamed from: e  reason: collision with root package name */
        final StringBuilder f15233e = new StringBuilder();

        /* renamed from: f  reason: collision with root package name */
        boolean f15234f = false;

        e() {
            super();
            this.f15227a = j.Doctype;
        }

        /* access modifiers changed from: package-private */
        public i m() {
            i.n(this.f15230b);
            this.f15231c = null;
            i.n(this.f15232d);
            i.n(this.f15233e);
            this.f15234f = false;
            return this;
        }

        /* access modifiers changed from: package-private */
        public String p() {
            return this.f15230b.toString();
        }

        /* access modifiers changed from: package-private */
        public String q() {
            return this.f15231c;
        }

        /* access modifiers changed from: package-private */
        public String r() {
            return this.f15232d.toString();
        }

        public String s() {
            return this.f15233e.toString();
        }

        public boolean t() {
            return this.f15234f;
        }
    }

    /* compiled from: Token */
    static final class f extends i {
        f() {
            super();
            this.f15227a = j.EOF;
        }

        /* access modifiers changed from: package-private */
        public i m() {
            return this;
        }
    }

    /* compiled from: Token */
    static final class g extends C0167i {
        g() {
            this.f15227a = j.EndTag;
        }

        public String toString() {
            return "</" + A() + ">";
        }
    }

    /* compiled from: Token */
    static final class h extends C0167i {
        h() {
            this.j = new org.jsoup.d.b();
            this.f15227a = j.StartTag;
        }

        /* access modifiers changed from: package-private */
        public C0167i E() {
            super.m();
            this.j = new org.jsoup.d.b();
            return this;
        }

        /* access modifiers changed from: package-private */
        public h G(String str, org.jsoup.d.b bVar) {
            this.f15235b = str;
            this.j = bVar;
            this.f15236c = org.jsoup.c.a.a(str);
            return this;
        }

        /* access modifiers changed from: package-private */
        public /* bridge */ /* synthetic */ i m() {
            E();
            return this;
        }

        public String toString() {
            org.jsoup.d.b bVar = this.j;
            if (bVar == null || bVar.size() <= 0) {
                return "<" + A() + ">";
            }
            return "<" + A() + " " + this.j.toString() + ">";
        }
    }

    /* renamed from: org.jsoup.e.i$i  reason: collision with other inner class name */
    /* compiled from: Token */
    static abstract class C0167i extends i {

        /* renamed from: b  reason: collision with root package name */
        protected String f15235b;

        /* renamed from: c  reason: collision with root package name */
        protected String f15236c;

        /* renamed from: d  reason: collision with root package name */
        private String f15237d;

        /* renamed from: e  reason: collision with root package name */
        private StringBuilder f15238e = new StringBuilder();

        /* renamed from: f  reason: collision with root package name */
        private String f15239f;
        private boolean g = false;
        private boolean h = false;
        boolean i = false;
        org.jsoup.d.b j;

        C0167i() {
            super();
        }

        private void w() {
            this.h = true;
            String str = this.f15239f;
            if (str != null) {
                this.f15238e.append(str);
                this.f15239f = null;
            }
        }

        /* access modifiers changed from: package-private */
        public final String A() {
            String str = this.f15235b;
            org.jsoup.b.c.b(str == null || str.length() == 0);
            return this.f15235b;
        }

        /* access modifiers changed from: package-private */
        public final C0167i B(String str) {
            this.f15235b = str;
            this.f15236c = org.jsoup.c.a.a(str);
            return this;
        }

        /* access modifiers changed from: package-private */
        public final void C() {
            String str;
            if (this.j == null) {
                this.j = new org.jsoup.d.b();
            }
            String str2 = this.f15237d;
            if (str2 != null) {
                String trim = str2.trim();
                this.f15237d = trim;
                if (trim.length() > 0) {
                    if (this.h) {
                        str = this.f15238e.length() > 0 ? this.f15238e.toString() : this.f15239f;
                    } else {
                        str = this.g ? "" : null;
                    }
                    this.j.Y(this.f15237d, str);
                }
            }
            this.f15237d = null;
            this.g = false;
            this.h = false;
            i.n(this.f15238e);
            this.f15239f = null;
        }

        /* access modifiers changed from: package-private */
        public final String D() {
            return this.f15236c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public C0167i m() {
            this.f15235b = null;
            this.f15236c = null;
            this.f15237d = null;
            i.n(this.f15238e);
            this.f15239f = null;
            this.g = false;
            this.h = false;
            this.i = false;
            this.j = null;
            return this;
        }

        /* access modifiers changed from: package-private */
        public final void F() {
            this.g = true;
        }

        /* access modifiers changed from: package-private */
        public final void p(char c2) {
            q(String.valueOf(c2));
        }

        /* access modifiers changed from: package-private */
        public final void q(String str) {
            String str2 = this.f15237d;
            if (str2 != null) {
                str = str2.concat(str);
            }
            this.f15237d = str;
        }

        /* access modifiers changed from: package-private */
        public final void r(char c2) {
            w();
            this.f15238e.append(c2);
        }

        /* access modifiers changed from: package-private */
        public final void s(String str) {
            w();
            if (this.f15238e.length() == 0) {
                this.f15239f = str;
            } else {
                this.f15238e.append(str);
            }
        }

        /* access modifiers changed from: package-private */
        public final void t(int[] iArr) {
            w();
            for (int appendCodePoint : iArr) {
                this.f15238e.appendCodePoint(appendCodePoint);
            }
        }

        /* access modifiers changed from: package-private */
        public final void u(char c2) {
            v(String.valueOf(c2));
        }

        /* access modifiers changed from: package-private */
        public final void v(String str) {
            String str2 = this.f15235b;
            if (str2 != null) {
                str = str2.concat(str);
            }
            this.f15235b = str;
            this.f15236c = org.jsoup.c.a.a(str);
        }

        /* access modifiers changed from: package-private */
        public final void x() {
            if (this.f15237d != null) {
                C();
            }
        }

        /* access modifiers changed from: package-private */
        public final org.jsoup.d.b y() {
            return this.j;
        }

        /* access modifiers changed from: package-private */
        public final boolean z() {
            return this.i;
        }
    }

    /* compiled from: Token */
    public enum j {
        Doctype,
        StartTag,
        EndTag,
        Comment,
        Character,
        EOF
    }

    static void n(StringBuilder sb) {
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    /* access modifiers changed from: package-private */
    public final c a() {
        return (c) this;
    }

    /* access modifiers changed from: package-private */
    public final d b() {
        return (d) this;
    }

    /* access modifiers changed from: package-private */
    public final e c() {
        return (e) this;
    }

    /* access modifiers changed from: package-private */
    public final g d() {
        return (g) this;
    }

    /* access modifiers changed from: package-private */
    public final h e() {
        return (h) this;
    }

    /* access modifiers changed from: package-private */
    public final boolean f() {
        return this instanceof b;
    }

    /* access modifiers changed from: package-private */
    public final boolean g() {
        return this.f15227a == j.Character;
    }

    /* access modifiers changed from: package-private */
    public final boolean h() {
        return this.f15227a == j.Comment;
    }

    /* access modifiers changed from: package-private */
    public final boolean i() {
        return this.f15227a == j.Doctype;
    }

    /* access modifiers changed from: package-private */
    public final boolean j() {
        return this.f15227a == j.EOF;
    }

    /* access modifiers changed from: package-private */
    public final boolean k() {
        return this.f15227a == j.EndTag;
    }

    /* access modifiers changed from: package-private */
    public final boolean l() {
        return this.f15227a == j.StartTag;
    }

    /* access modifiers changed from: package-private */
    public abstract i m();

    /* access modifiers changed from: package-private */
    public String o() {
        return getClass().getSimpleName();
    }

    private i() {
    }
}
