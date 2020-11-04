package org.jsoup.e;

/* compiled from: Token */
abstract class i {

    /* renamed from: a  reason: collision with root package name */
    j f14658a;

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
        private String f14659b;

        c() {
            super();
            this.f14658a = j.Character;
        }

        /* access modifiers changed from: package-private */
        public i m() {
            this.f14659b = null;
            return this;
        }

        /* access modifiers changed from: package-private */
        public c p(String str) {
            this.f14659b = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public String q() {
            return this.f14659b;
        }

        public String toString() {
            return q();
        }
    }

    /* compiled from: Token */
    static final class d extends i {

        /* renamed from: b  reason: collision with root package name */
        final StringBuilder f14660b = new StringBuilder();

        d() {
            super();
            this.f14658a = j.Comment;
        }

        /* access modifiers changed from: package-private */
        public i m() {
            i.n(this.f14660b);
            return this;
        }

        /* access modifiers changed from: package-private */
        public String p() {
            return this.f14660b.toString();
        }

        public String toString() {
            return "<!--" + p() + "-->";
        }
    }

    /* compiled from: Token */
    static final class e extends i {

        /* renamed from: b  reason: collision with root package name */
        final StringBuilder f14661b = new StringBuilder();

        /* renamed from: c  reason: collision with root package name */
        String f14662c = null;

        /* renamed from: d  reason: collision with root package name */
        final StringBuilder f14663d = new StringBuilder();

        /* renamed from: e  reason: collision with root package name */
        final StringBuilder f14664e = new StringBuilder();

        /* renamed from: f  reason: collision with root package name */
        boolean f14665f = false;

        e() {
            super();
            this.f14658a = j.Doctype;
        }

        /* access modifiers changed from: package-private */
        public i m() {
            i.n(this.f14661b);
            this.f14662c = null;
            i.n(this.f14663d);
            i.n(this.f14664e);
            this.f14665f = false;
            return this;
        }

        /* access modifiers changed from: package-private */
        public String p() {
            return this.f14661b.toString();
        }

        /* access modifiers changed from: package-private */
        public String q() {
            return this.f14662c;
        }

        /* access modifiers changed from: package-private */
        public String r() {
            return this.f14663d.toString();
        }

        public String s() {
            return this.f14664e.toString();
        }

        public boolean t() {
            return this.f14665f;
        }
    }

    /* compiled from: Token */
    static final class f extends i {
        f() {
            super();
            this.f14658a = j.EOF;
        }

        /* access modifiers changed from: package-private */
        public i m() {
            return this;
        }
    }

    /* compiled from: Token */
    static final class g extends C0168i {
        g() {
            this.f14658a = j.EndTag;
        }

        public String toString() {
            return "</" + A() + ">";
        }
    }

    /* compiled from: Token */
    static final class h extends C0168i {
        h() {
            this.j = new org.jsoup.d.b();
            this.f14658a = j.StartTag;
        }

        /* access modifiers changed from: package-private */
        public C0168i E() {
            super.m();
            this.j = new org.jsoup.d.b();
            return this;
        }

        /* access modifiers changed from: package-private */
        public h G(String str, org.jsoup.d.b bVar) {
            this.f14666b = str;
            this.j = bVar;
            this.f14667c = org.jsoup.c.a.a(str);
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
    static abstract class C0168i extends i {

        /* renamed from: b  reason: collision with root package name */
        protected String f14666b;

        /* renamed from: c  reason: collision with root package name */
        protected String f14667c;

        /* renamed from: d  reason: collision with root package name */
        private String f14668d;

        /* renamed from: e  reason: collision with root package name */
        private StringBuilder f14669e = new StringBuilder();

        /* renamed from: f  reason: collision with root package name */
        private String f14670f;
        private boolean g = false;
        private boolean h = false;
        boolean i = false;
        org.jsoup.d.b j;

        C0168i() {
            super();
        }

        private void w() {
            this.h = true;
            String str = this.f14670f;
            if (str != null) {
                this.f14669e.append(str);
                this.f14670f = null;
            }
        }

        /* access modifiers changed from: package-private */
        public final String A() {
            String str = this.f14666b;
            org.jsoup.b.c.b(str == null || str.length() == 0);
            return this.f14666b;
        }

        /* access modifiers changed from: package-private */
        public final C0168i B(String str) {
            this.f14666b = str;
            this.f14667c = org.jsoup.c.a.a(str);
            return this;
        }

        /* access modifiers changed from: package-private */
        public final void C() {
            String str;
            if (this.j == null) {
                this.j = new org.jsoup.d.b();
            }
            String str2 = this.f14668d;
            if (str2 != null) {
                String trim = str2.trim();
                this.f14668d = trim;
                if (trim.length() > 0) {
                    if (this.h) {
                        str = this.f14669e.length() > 0 ? this.f14669e.toString() : this.f14670f;
                    } else {
                        str = this.g ? "" : null;
                    }
                    this.j.Y(this.f14668d, str);
                }
            }
            this.f14668d = null;
            this.g = false;
            this.h = false;
            i.n(this.f14669e);
            this.f14670f = null;
        }

        /* access modifiers changed from: package-private */
        public final String D() {
            return this.f14667c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public C0168i m() {
            this.f14666b = null;
            this.f14667c = null;
            this.f14668d = null;
            i.n(this.f14669e);
            this.f14670f = null;
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
            String str2 = this.f14668d;
            if (str2 != null) {
                str = str2.concat(str);
            }
            this.f14668d = str;
        }

        /* access modifiers changed from: package-private */
        public final void r(char c2) {
            w();
            this.f14669e.append(c2);
        }

        /* access modifiers changed from: package-private */
        public final void s(String str) {
            w();
            if (this.f14669e.length() == 0) {
                this.f14670f = str;
            } else {
                this.f14669e.append(str);
            }
        }

        /* access modifiers changed from: package-private */
        public final void t(int[] iArr) {
            w();
            for (int appendCodePoint : iArr) {
                this.f14669e.appendCodePoint(appendCodePoint);
            }
        }

        /* access modifiers changed from: package-private */
        public final void u(char c2) {
            v(String.valueOf(c2));
        }

        /* access modifiers changed from: package-private */
        public final void v(String str) {
            String str2 = this.f14666b;
            if (str2 != null) {
                str = str2.concat(str);
            }
            this.f14666b = str;
            this.f14667c = org.jsoup.c.a.a(str);
        }

        /* access modifiers changed from: package-private */
        public final void x() {
            if (this.f14668d != null) {
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
        return this.f14658a == j.Character;
    }

    /* access modifiers changed from: package-private */
    public final boolean h() {
        return this.f14658a == j.Comment;
    }

    /* access modifiers changed from: package-private */
    public final boolean i() {
        return this.f14658a == j.Doctype;
    }

    /* access modifiers changed from: package-private */
    public final boolean j() {
        return this.f14658a == j.EOF;
    }

    /* access modifiers changed from: package-private */
    public final boolean k() {
        return this.f14658a == j.EndTag;
    }

    /* access modifiers changed from: package-private */
    public final boolean l() {
        return this.f14658a == j.StartTag;
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
