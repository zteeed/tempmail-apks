package b.c.a.b.i;

import b.c.a.b.i.h;
import java.util.Map;

/* compiled from: AutoValue_EventInternal */
final class a extends h {

    /* renamed from: a  reason: collision with root package name */
    private final String f2213a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f2214b;

    /* renamed from: c  reason: collision with root package name */
    private final g f2215c;

    /* renamed from: d  reason: collision with root package name */
    private final long f2216d;

    /* renamed from: e  reason: collision with root package name */
    private final long f2217e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, String> f2218f;

    /* compiled from: AutoValue_EventInternal */
    static final class b extends h.a {

        /* renamed from: a  reason: collision with root package name */
        private String f2219a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f2220b;

        /* renamed from: c  reason: collision with root package name */
        private g f2221c;

        /* renamed from: d  reason: collision with root package name */
        private Long f2222d;

        /* renamed from: e  reason: collision with root package name */
        private Long f2223e;

        /* renamed from: f  reason: collision with root package name */
        private Map<String, String> f2224f;

        b() {
        }

        public h d() {
            String str = "";
            if (this.f2219a == null) {
                str = str + " transportName";
            }
            if (this.f2221c == null) {
                str = str + " encodedPayload";
            }
            if (this.f2222d == null) {
                str = str + " eventMillis";
            }
            if (this.f2223e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f2224f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new a(this.f2219a, this.f2220b, this.f2221c, this.f2222d.longValue(), this.f2223e.longValue(), this.f2224f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: protected */
        public Map<String, String> e() {
            Map<String, String> map = this.f2224f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* access modifiers changed from: protected */
        public h.a f(Map<String, String> map) {
            if (map != null) {
                this.f2224f = map;
                return this;
            }
            throw new NullPointerException("Null autoMetadata");
        }

        public h.a g(Integer num) {
            this.f2220b = num;
            return this;
        }

        public h.a h(g gVar) {
            if (gVar != null) {
                this.f2221c = gVar;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        public h.a i(long j) {
            this.f2222d = Long.valueOf(j);
            return this;
        }

        public h.a j(String str) {
            if (str != null) {
                this.f2219a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        public h.a k(long j) {
            this.f2223e = Long.valueOf(j);
            return this;
        }
    }

    /* access modifiers changed from: protected */
    public Map<String, String> c() {
        return this.f2218f;
    }

    public Integer d() {
        return this.f2214b;
    }

    public g e() {
        return this.f2215c;
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
        if (!this.f2213a.equals(hVar.j()) || ((num = this.f2214b) != null ? !num.equals(hVar.d()) : hVar.d() != null) || !this.f2215c.equals(hVar.e()) || this.f2216d != hVar.f() || this.f2217e != hVar.k() || !this.f2218f.equals(hVar.c())) {
            return false;
        }
        return true;
    }

    public long f() {
        return this.f2216d;
    }

    public int hashCode() {
        int hashCode = (this.f2213a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f2214b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j = this.f2216d;
        long j2 = this.f2217e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.f2215c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f2218f.hashCode();
    }

    public String j() {
        return this.f2213a;
    }

    public long k() {
        return this.f2217e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f2213a + ", code=" + this.f2214b + ", encodedPayload=" + this.f2215c + ", eventMillis=" + this.f2216d + ", uptimeMillis=" + this.f2217e + ", autoMetadata=" + this.f2218f + "}";
    }

    private a(String str, Integer num, g gVar, long j, long j2, Map<String, String> map) {
        this.f2213a = str;
        this.f2214b = num;
        this.f2215c = gVar;
        this.f2216d = j;
        this.f2217e = j2;
        this.f2218f = map;
    }
}
