package com.google.android.datatransport.cct.b;

import com.google.android.datatransport.cct.b.l;
import java.util.Arrays;

final class f extends l {

    /* renamed from: a  reason: collision with root package name */
    private final long f2477a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f2478b;

    /* renamed from: c  reason: collision with root package name */
    private final long f2479c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f2480d;

    /* renamed from: e  reason: collision with root package name */
    private final String f2481e;

    /* renamed from: f  reason: collision with root package name */
    private final long f2482f;
    private final o g;

    static final class b extends l.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f2483a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f2484b;

        /* renamed from: c  reason: collision with root package name */
        private Long f2485c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f2486d;

        /* renamed from: e  reason: collision with root package name */
        private String f2487e;

        /* renamed from: f  reason: collision with root package name */
        private Long f2488f;
        private o g;

        b() {
        }

        public l.a a(long j) {
            this.f2483a = Long.valueOf(j);
            return this;
        }

        public l.a b(o oVar) {
            this.g = oVar;
            return this;
        }

        public l.a c(Integer num) {
            this.f2484b = num;
            return this;
        }

        public l d() {
            String str = "";
            if (this.f2483a == null) {
                str = str + " eventTimeMs";
            }
            if (this.f2485c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f2488f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new f(this.f2483a.longValue(), this.f2484b, this.f2485c.longValue(), this.f2486d, this.f2487e, this.f2488f.longValue(), this.g, (a) null);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public l.a e(long j) {
            this.f2485c = Long.valueOf(j);
            return this;
        }

        public l.a f(long j) {
            this.f2488f = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: package-private */
        public l.a g(String str) {
            this.f2487e = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public l.a h(byte[] bArr) {
            this.f2486d = bArr;
            return this;
        }
    }

    /* synthetic */ f(long j, Integer num, long j2, byte[] bArr, String str, long j3, o oVar, a aVar) {
        this.f2477a = j;
        this.f2478b = num;
        this.f2479c = j2;
        this.f2480d = bArr;
        this.f2481e = str;
        this.f2482f = j3;
        this.g = oVar;
    }

    public Integer c() {
        return this.f2478b;
    }

    public long d() {
        return this.f2477a;
    }

    public long e() {
        return this.f2479c;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f2477a == lVar.d() && ((num = this.f2478b) != null ? num.equals(((f) lVar).f2478b) : ((f) lVar).f2478b == null) && this.f2479c == lVar.e()) {
            if (Arrays.equals(this.f2480d, lVar instanceof f ? ((f) lVar).f2480d : lVar.g()) && ((str = this.f2481e) != null ? str.equals(((f) lVar).f2481e) : ((f) lVar).f2481e == null) && this.f2482f == lVar.i()) {
                o oVar = this.g;
                if (oVar == null) {
                    if (((f) lVar).g == null) {
                        return true;
                    }
                } else if (oVar.equals(((f) lVar).g)) {
                    return true;
                }
            }
        }
        return false;
    }

    public o f() {
        return this.g;
    }

    public byte[] g() {
        return this.f2480d;
    }

    public String h() {
        return this.f2481e;
    }

    public int hashCode() {
        long j = this.f2477a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f2478b;
        int i2 = 0;
        int hashCode = num == null ? 0 : num.hashCode();
        long j2 = this.f2479c;
        int hashCode2 = (((((i ^ hashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f2480d)) * 1000003;
        String str = this.f2481e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j3 = this.f2482f;
        int i3 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        o oVar = this.g;
        if (oVar != null) {
            i2 = oVar.hashCode();
        }
        return i3 ^ i2;
    }

    public long i() {
        return this.f2482f;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f2477a + ", eventCode=" + this.f2478b + ", eventUptimeMs=" + this.f2479c + ", sourceExtension=" + Arrays.toString(this.f2480d) + ", sourceExtensionJsonProto3=" + this.f2481e + ", timezoneOffsetSeconds=" + this.f2482f + ", networkConnectionInfo=" + this.g + "}";
    }
}
