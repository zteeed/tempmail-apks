package com.google.android.datatransport.cct.b;

import com.google.android.datatransport.cct.b.l;
import java.util.Arrays;

final class f extends l {

    /* renamed from: a  reason: collision with root package name */
    private final long f2665a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f2666b;

    /* renamed from: c  reason: collision with root package name */
    private final long f2667c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f2668d;

    /* renamed from: e  reason: collision with root package name */
    private final String f2669e;

    /* renamed from: f  reason: collision with root package name */
    private final long f2670f;
    private final o g;

    static final class b extends l.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f2671a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f2672b;

        /* renamed from: c  reason: collision with root package name */
        private Long f2673c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f2674d;

        /* renamed from: e  reason: collision with root package name */
        private String f2675e;

        /* renamed from: f  reason: collision with root package name */
        private Long f2676f;
        private o g;

        b() {
        }

        public l.a a(long j) {
            this.f2671a = Long.valueOf(j);
            return this;
        }

        public l.a b(o oVar) {
            this.g = oVar;
            return this;
        }

        public l.a c(Integer num) {
            this.f2672b = num;
            return this;
        }

        public l d() {
            String str = "";
            if (this.f2671a == null) {
                str = str + " eventTimeMs";
            }
            if (this.f2673c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f2676f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new f(this.f2671a.longValue(), this.f2672b, this.f2673c.longValue(), this.f2674d, this.f2675e, this.f2676f.longValue(), this.g, (a) null);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public l.a e(long j) {
            this.f2673c = Long.valueOf(j);
            return this;
        }

        public l.a f(long j) {
            this.f2676f = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: package-private */
        public l.a g(String str) {
            this.f2675e = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public l.a h(byte[] bArr) {
            this.f2674d = bArr;
            return this;
        }
    }

    /* synthetic */ f(long j, Integer num, long j2, byte[] bArr, String str, long j3, o oVar, a aVar) {
        this.f2665a = j;
        this.f2666b = num;
        this.f2667c = j2;
        this.f2668d = bArr;
        this.f2669e = str;
        this.f2670f = j3;
        this.g = oVar;
    }

    public Integer c() {
        return this.f2666b;
    }

    public long d() {
        return this.f2665a;
    }

    public long e() {
        return this.f2667c;
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
        if (this.f2665a == lVar.d() && ((num = this.f2666b) != null ? num.equals(((f) lVar).f2666b) : ((f) lVar).f2666b == null) && this.f2667c == lVar.e()) {
            if (Arrays.equals(this.f2668d, lVar instanceof f ? ((f) lVar).f2668d : lVar.g()) && ((str = this.f2669e) != null ? str.equals(((f) lVar).f2669e) : ((f) lVar).f2669e == null) && this.f2670f == lVar.i()) {
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
        return this.f2668d;
    }

    public String h() {
        return this.f2669e;
    }

    public int hashCode() {
        long j = this.f2665a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f2666b;
        int i2 = 0;
        int hashCode = num == null ? 0 : num.hashCode();
        long j2 = this.f2667c;
        int hashCode2 = (((((i ^ hashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f2668d)) * 1000003;
        String str = this.f2669e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j3 = this.f2670f;
        int i3 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        o oVar = this.g;
        if (oVar != null) {
            i2 = oVar.hashCode();
        }
        return i3 ^ i2;
    }

    public long i() {
        return this.f2670f;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f2665a + ", eventCode=" + this.f2666b + ", eventUptimeMs=" + this.f2667c + ", sourceExtension=" + Arrays.toString(this.f2668d) + ", sourceExtensionJsonProto3=" + this.f2669e + ", timezoneOffsetSeconds=" + this.f2670f + ", networkConnectionInfo=" + this.g + "}";
    }
}
