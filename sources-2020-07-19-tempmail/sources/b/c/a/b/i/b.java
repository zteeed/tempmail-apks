package b.c.a.b.i;

import b.c.a.b.c;
import b.c.a.b.e;
import b.c.a.b.i.l;

/* compiled from: AutoValue_SendRequest */
final class b extends l {

    /* renamed from: a  reason: collision with root package name */
    private final m f2127a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2128b;

    /* renamed from: c  reason: collision with root package name */
    private final c<?> f2129c;

    /* renamed from: d  reason: collision with root package name */
    private final e<?, byte[]> f2130d;

    /* renamed from: e  reason: collision with root package name */
    private final b.c.a.b.b f2131e;

    /* renamed from: b.c.a.b.i.b$b  reason: collision with other inner class name */
    /* compiled from: AutoValue_SendRequest */
    static final class C0061b extends l.a {

        /* renamed from: a  reason: collision with root package name */
        private m f2132a;

        /* renamed from: b  reason: collision with root package name */
        private String f2133b;

        /* renamed from: c  reason: collision with root package name */
        private c<?> f2134c;

        /* renamed from: d  reason: collision with root package name */
        private e<?, byte[]> f2135d;

        /* renamed from: e  reason: collision with root package name */
        private b.c.a.b.b f2136e;

        C0061b() {
        }

        public l a() {
            String str = "";
            if (this.f2132a == null) {
                str = str + " transportContext";
            }
            if (this.f2133b == null) {
                str = str + " transportName";
            }
            if (this.f2134c == null) {
                str = str + " event";
            }
            if (this.f2135d == null) {
                str = str + " transformer";
            }
            if (this.f2136e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new b(this.f2132a, this.f2133b, this.f2134c, this.f2135d, this.f2136e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        public l.a b(b.c.a.b.b bVar) {
            if (bVar != null) {
                this.f2136e = bVar;
                return this;
            }
            throw new NullPointerException("Null encoding");
        }

        /* access modifiers changed from: package-private */
        public l.a c(c<?> cVar) {
            if (cVar != null) {
                this.f2134c = cVar;
                return this;
            }
            throw new NullPointerException("Null event");
        }

        /* access modifiers changed from: package-private */
        public l.a d(e<?, byte[]> eVar) {
            if (eVar != null) {
                this.f2135d = eVar;
                return this;
            }
            throw new NullPointerException("Null transformer");
        }

        public l.a e(m mVar) {
            if (mVar != null) {
                this.f2132a = mVar;
                return this;
            }
            throw new NullPointerException("Null transportContext");
        }

        public l.a f(String str) {
            if (str != null) {
                this.f2133b = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }

    public b.c.a.b.b b() {
        return this.f2131e;
    }

    /* access modifiers changed from: package-private */
    public c<?> c() {
        return this.f2129c;
    }

    /* access modifiers changed from: package-private */
    public e<?, byte[]> e() {
        return this.f2130d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (!this.f2127a.equals(lVar.f()) || !this.f2128b.equals(lVar.g()) || !this.f2129c.equals(lVar.c()) || !this.f2130d.equals(lVar.e()) || !this.f2131e.equals(lVar.b())) {
            return false;
        }
        return true;
    }

    public m f() {
        return this.f2127a;
    }

    public String g() {
        return this.f2128b;
    }

    public int hashCode() {
        return ((((((((this.f2127a.hashCode() ^ 1000003) * 1000003) ^ this.f2128b.hashCode()) * 1000003) ^ this.f2129c.hashCode()) * 1000003) ^ this.f2130d.hashCode()) * 1000003) ^ this.f2131e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f2127a + ", transportName=" + this.f2128b + ", event=" + this.f2129c + ", transformer=" + this.f2130d + ", encoding=" + this.f2131e + "}";
    }

    private b(m mVar, String str, c<?> cVar, e<?, byte[]> eVar, b.c.a.b.b bVar) {
        this.f2127a = mVar;
        this.f2128b = str;
        this.f2129c = cVar;
        this.f2130d = eVar;
        this.f2131e = bVar;
    }
}
