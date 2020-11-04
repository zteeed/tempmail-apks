package com.google.android.datatransport.cct.b;

import com.google.android.datatransport.cct.b.m;
import java.util.List;

final class g extends m {

    /* renamed from: a  reason: collision with root package name */
    private final long f2489a;

    /* renamed from: b  reason: collision with root package name */
    private final long f2490b;

    /* renamed from: c  reason: collision with root package name */
    private final k f2491c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f2492d;

    /* renamed from: e  reason: collision with root package name */
    private final String f2493e;

    /* renamed from: f  reason: collision with root package name */
    private final List<l> f2494f;
    private final p g;

    static final class b extends m.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f2495a;

        /* renamed from: b  reason: collision with root package name */
        private Long f2496b;

        /* renamed from: c  reason: collision with root package name */
        private k f2497c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f2498d;

        /* renamed from: e  reason: collision with root package name */
        private String f2499e;

        /* renamed from: f  reason: collision with root package name */
        private List<l> f2500f;
        private p g;

        b() {
        }

        public m.a b(long j) {
            this.f2495a = Long.valueOf(j);
            return this;
        }

        public m.a c(k kVar) {
            this.f2497c = kVar;
            return this;
        }

        public m.a d(p pVar) {
            this.g = pVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        public m.a e(Integer num) {
            this.f2498d = num;
            return this;
        }

        /* access modifiers changed from: package-private */
        public m.a f(String str) {
            this.f2499e = str;
            return this;
        }

        public m.a g(List<l> list) {
            this.f2500f = list;
            return this;
        }

        public m h() {
            String str = "";
            if (this.f2495a == null) {
                str = str + " requestTimeMs";
            }
            if (this.f2496b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new g(this.f2495a.longValue(), this.f2496b.longValue(), this.f2497c, this.f2498d, this.f2499e, this.f2500f, this.g, (a) null);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public m.a i(long j) {
            this.f2496b = Long.valueOf(j);
            return this;
        }
    }

    /* synthetic */ g(long j, long j2, k kVar, Integer num, String str, List list, p pVar, a aVar) {
        this.f2489a = j;
        this.f2490b = j2;
        this.f2491c = kVar;
        this.f2492d = num;
        this.f2493e = str;
        this.f2494f = list;
        this.g = pVar;
    }

    public k b() {
        return this.f2491c;
    }

    public List<l> c() {
        return this.f2494f;
    }

    public Integer d() {
        return this.f2492d;
    }

    public String e() {
        return this.f2493e;
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
        if (this.f2489a == mVar.g() && this.f2490b == mVar.h() && ((kVar = this.f2491c) != null ? kVar.equals(((g) mVar).f2491c) : ((g) mVar).f2491c == null) && ((num = this.f2492d) != null ? num.equals(((g) mVar).f2492d) : ((g) mVar).f2492d == null) && ((str = this.f2493e) != null ? str.equals(((g) mVar).f2493e) : ((g) mVar).f2493e == null) && ((list = this.f2494f) != null ? list.equals(((g) mVar).f2494f) : ((g) mVar).f2494f == null)) {
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
        return this.f2489a;
    }

    public long h() {
        return this.f2490b;
    }

    public int hashCode() {
        long j = this.f2489a;
        long j2 = this.f2490b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        k kVar = this.f2491c;
        int i2 = 0;
        int hashCode = (i ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f2492d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f2493e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<l> list = this.f2494f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        p pVar = this.g;
        if (pVar != null) {
            i2 = pVar.hashCode();
        }
        return hashCode4 ^ i2;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f2489a + ", requestUptimeMs=" + this.f2490b + ", clientInfo=" + this.f2491c + ", logSource=" + this.f2492d + ", logSourceName=" + this.f2493e + ", logEvents=" + this.f2494f + ", qosTier=" + this.g + "}";
    }
}
