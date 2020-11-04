package b.c.a.b.i;

import b.c.a.b.c;
import b.c.a.b.e;
import b.c.a.b.i.l;

/* compiled from: AutoValue_SendRequest */
final class b extends l {

    /* renamed from: a  reason: collision with root package name */
    private final m f2225a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2226b;

    /* renamed from: c  reason: collision with root package name */
    private final c<?> f2227c;

    /* renamed from: d  reason: collision with root package name */
    private final e<?, byte[]> f2228d;

    /* renamed from: e  reason: collision with root package name */
    private final b.c.a.b.b f2229e;

    /* renamed from: b.c.a.b.i.b$b  reason: collision with other inner class name */
    /* compiled from: AutoValue_SendRequest */
    static final class C0061b extends l.a {

        /* renamed from: a  reason: collision with root package name */
        private m f2230a;

        /* renamed from: b  reason: collision with root package name */
        private String f2231b;

        /* renamed from: c  reason: collision with root package name */
        private c<?> f2232c;

        /* renamed from: d  reason: collision with root package name */
        private e<?, byte[]> f2233d;

        /* renamed from: e  reason: collision with root package name */
        private b.c.a.b.b f2234e;

        C0061b() {
        }

        public l a() {
            String str = "";
            if (this.f2230a == null) {
                str = str + " transportContext";
            }
            if (this.f2231b == null) {
                str = str + " transportName";
            }
            if (this.f2232c == null) {
                str = str + " event";
            }
            if (this.f2233d == null) {
                str = str + " transformer";
            }
            if (this.f2234e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new b(this.f2230a, this.f2231b, this.f2232c, this.f2233d, this.f2234e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        public l.a b(b.c.a.b.b bVar) {
            if (bVar != null) {
                this.f2234e = bVar;
                return this;
            }
            throw new NullPointerException("Null encoding");
        }

        /* access modifiers changed from: package-private */
        public l.a c(c<?> cVar) {
            if (cVar != null) {
                this.f2232c = cVar;
                return this;
            }
            throw new NullPointerException("Null event");
        }

        /* access modifiers changed from: package-private */
        public l.a d(e<?, byte[]> eVar) {
            if (eVar != null) {
                this.f2233d = eVar;
                return this;
            }
            throw new NullPointerException("Null transformer");
        }

        public l.a e(m mVar) {
            if (mVar != null) {
                this.f2230a = mVar;
                return this;
            }
            throw new NullPointerException("Null transportContext");
        }

        public l.a f(String str) {
            if (str != null) {
                this.f2231b = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }

    public b.c.a.b.b b() {
        return this.f2229e;
    }

    /* access modifiers changed from: package-private */
    public c<?> c() {
        return this.f2227c;
    }

    /* access modifiers changed from: package-private */
    public e<?, byte[]> e() {
        return this.f2228d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (!this.f2225a.equals(lVar.f()) || !this.f2226b.equals(lVar.g()) || !this.f2227c.equals(lVar.c()) || !this.f2228d.equals(lVar.e()) || !this.f2229e.equals(lVar.b())) {
            return false;
        }
        return true;
    }

    public m f() {
        return this.f2225a;
    }

    public String g() {
        return this.f2226b;
    }

    public int hashCode() {
        return ((((((((this.f2225a.hashCode() ^ 1000003) * 1000003) ^ this.f2226b.hashCode()) * 1000003) ^ this.f2227c.hashCode()) * 1000003) ^ this.f2228d.hashCode()) * 1000003) ^ this.f2229e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f2225a + ", transportName=" + this.f2226b + ", event=" + this.f2227c + ", transformer=" + this.f2228d + ", encoding=" + this.f2229e + "}";
    }

    private b(m mVar, String str, c<?> cVar, e<?, byte[]> eVar, b.c.a.b.b bVar) {
        this.f2225a = mVar;
        this.f2226b = str;
        this.f2227c = cVar;
        this.f2228d = eVar;
        this.f2229e = bVar;
    }
}
