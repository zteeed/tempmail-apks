package com.google.android.datatransport.cct.b;

import com.google.android.datatransport.cct.b.m;
import java.util.List;

final class g extends m {

    /* renamed from: a  reason: collision with root package name */
    private final long f2677a;

    /* renamed from: b  reason: collision with root package name */
    private final long f2678b;

    /* renamed from: c  reason: collision with root package name */
    private final k f2679c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f2680d;

    /* renamed from: e  reason: collision with root package name */
    private final String f2681e;

    /* renamed from: f  reason: collision with root package name */
    private final List<l> f2682f;
    private final p g;

    static final class b extends m.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f2683a;

        /* renamed from: b  reason: collision with root package name */
        private Long f2684b;

        /* renamed from: c  reason: collision with root package name */
        private k f2685c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f2686d;

        /* renamed from: e  reason: collision with root package name */
        private String f2687e;

        /* renamed from: f  reason: collision with root package name */
        private List<l> f2688f;
        private p g;

        b() {
        }

        public m.a b(long j) {
            this.f2683a = Long.valueOf(j);
            return this;
        }

        public m.a c(k kVar) {
            this.f2685c = kVar;
            return this;
        }

        public m.a d(p pVar) {
            this.g = pVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        public m.a e(Integer num) {
            this.f2686d = num;
            return this;
        }

        /* access modifiers changed from: package-private */
        public m.a f(String str) {
            this.f2687e = str;
            return this;
        }

        public m.a g(List<l> list) {
            this.f2688f = list;
            return this;
        }

        public m h() {
            String str = "";
            if (this.f2683a == null) {
                str = str + " requestTimeMs";
            }
            if (this.f2684b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new g(this.f2683a.longValue(), this.f2684b.longValue(), this.f2685c, this.f2686d, this.f2687e, this.f2688f, this.g, (a) null);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public m.a i(long j) {
            this.f2684b = Long.valueOf(j);
            return this;
        }
    }

    /* synthetic */ g(long j, long j2, k kVar, Integer num, String str, List list, p pVar, a aVar) {
        this.f2677a = j;
        this.f2678b = j2;
        this.f2679c = kVar;
        this.f2680d = num;
        this.f2681e = str;
        this.f2682f = list;
        this.g = pVar;
    }

    public k b() {
        return this.f2679c;
    }

    public List<l> c() {
        return this.f2682f;
    }

    public Integer d() {
        return this.f2680d;
    }

    public String e() {
        return this.f2681e;
    }

    public boolean equals(Object obj) {
        k kVar;
        Integer num;
        String str;
        List<l> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f2677a == mVar.g() && this.f2678b == mVar.h() && ((kVar = this.f2679c) != null ? kVar.equals(((g) mVar).f2679c) : ((g) mVar).f2679c == null) && ((num = this.f2680d) != null ? num.equals(((g) mVar).f2680d) : ((g) mVar).f2680d == null) && ((str = this.f2681e) != null ? str.equals(((g) mVar).f2681e) : ((g) mVar).f2681e == null) && ((list = this.f2682f) != null ? list.equals(((g) mVar).f2682f) : ((g) mVar).f2682f == null)) {
            p pVar = this.g;
            if (pVar == null) {
                if (((g) mVar).g == null) {
                    return true;
                }
            } else if (pVar.equals(((g) mVar).g)) {
                return true;
            }
        }
        return false;
    }

    public p f() {
        return this.g;
    }

    public long g() {
        return this.f2677a;
    }

    public long h() {
        return this.f2678b;
    }

    public int hashCode() {
        long j = this.f2677a;
        long j2 = this.f2678b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        k kVar = this.f2679c;
        int i2 = 0;
        int hashCode = (i ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f2680d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f2681e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<l> list = this.f2682f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        p pVar = this.g;
        if (pVar != null) {
            i2 = pVar.hashCode();
        }
        return hashCode4 ^ i2;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f2677a + ", requestUptimeMs=" + this.f2678b + ", clientInfo=" + this.f2679c + ", logSource=" + this.f2680d + ", logSourceName=" + this.f2681e + ", logEvents=" + this.f2682f + ", qosTier=" + this.g + "}";
    }
}
