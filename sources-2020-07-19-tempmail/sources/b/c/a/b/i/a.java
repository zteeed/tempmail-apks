package b.c.a.b.i;

import b.c.a.b.i.h;
import java.util.Map;

/* compiled from: AutoValue_EventInternal */
final class a extends h {

    /* renamed from: a  reason: collision with root package name */
    private final String f2115a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f2116b;

    /* renamed from: c  reason: collision with root package name */
    private final g f2117c;

    /* renamed from: d  reason: collision with root package name */
    private final long f2118d;

    /* renamed from: e  reason: collision with root package name */
    private final long f2119e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, String> f2120f;

    /* compiled from: AutoValue_EventInternal */
    static final class b extends h.a {

        /* renamed from: a  reason: collision with root package name */
        private String f2121a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f2122b;

        /* renamed from: c  reason: collision with root package name */
        private g f2123c;

        /* renamed from: d  reason: collision with root package name */
        private Long f2124d;

        /* renamed from: e  reason: collision with root package name */
        private Long f2125e;

        /* renamed from: f  reason: collision with root package name */
        private Map<String, String> f2126f;

        b() {
        }

        public h d() {
            String str = "";
            if (this.f2121a == null) {
                str = str + " transportName";
            }
            if (this.f2123c == null) {
                str = str + " encodedPayload";
            }
            if (this.f2124d == null) {
                str = str + " eventMillis";
            }
            if (this.f2125e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f2126f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new a(this.f2121a, this.f2122b, this.f2123c, this.f2124d.longValue(), this.f2125e.longValue(), this.f2126f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: protected */
        public Map<String, String> e() {
            Map<String, String> map = this.f2126f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* access modifiers changed from: protected */
        public h.a f(Map<String, String> map) {
            if (map != null) {
                this.f2126f = map;
                return this;
            }
            throw new NullPointerException("Null autoMetadata");
        }

        public h.a g(Integer num) {
            this.f2122b = num;
            return this;
        }

        public h.a h(g gVar) {
            if (gVar != null) {
                this.f2123c = gVar;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        public h.a i(long j) {
            this.f2124d = Long.valueOf(j);
            return this;
        }

        public h.a j(String str) {
            if (str != null) {
                this.f2121a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        public h.a k(long j) {
            this.f2125e = Long.valueOf(j);
            return this;
        }
    }

    /* access modifiers changed from: protected */
    public Map<String, String> c() {
        return this.f2120f;
    }

    public Integer d() {
        return this.f2116b;
    }

    public g e() {
        return this.f2117c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.f2115a.equals(hVar.j()) || ((num = this.f2116b) != null ? !num.equals(hVar.d()) : hVar.d() != null) || !this.f2117c.equals(hVar.e()) || this.f2118d != hVar.f() || this.f2119e != hVar.k() || !this.f2120f.equals(hVar.c())) {
            return false;
        }
        return true;
    }

    public long f() {
        return this.f2118d;
    }

    public int hashCode() {
        int hashCode = (this.f2115a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f2116b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j = this.f2118d;
        long j2 = this.f2119e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.f2117c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f2120f.hashCode();
    }

    public String j() {
        return this.f2115a;
    }

    public long k() {
        return this.f2119e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f2115a + ", code=" + this.f2116b + ", encodedPayload=" + this.f2117c + ", eventMillis=" + this.f2118d + ", uptimeMillis=" + this.f2119e + ", autoMetadata=" + this.f2120f + "}";
    }

    private a(String str, Integer num, g gVar, long j, long j2, Map<String, String> map) {
        this.f2115a = str;
        this.f2116b = num;
        this.f2117c = gVar;
        this.f2118d = j;
        this.f2119e = j2;
        this.f2120f = map;
    }
}
