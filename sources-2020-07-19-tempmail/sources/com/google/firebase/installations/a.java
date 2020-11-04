package com.google.firebase.installations;

import com.google.firebase.installations.l;

/* compiled from: com.google.firebase:firebase-installations-interop@@16.0.0 */
final class a extends l {

    /* renamed from: a  reason: collision with root package name */
    private final String f11279a;

    /* renamed from: b  reason: collision with root package name */
    private final long f11280b;

    /* renamed from: c  reason: collision with root package name */
    private final long f11281c;

    /* compiled from: com.google.firebase:firebase-installations-interop@@16.0.0 */
    static final class b extends l.a {

        /* renamed from: a  reason: collision with root package name */
        private String f11282a;

        /* renamed from: b  reason: collision with root package name */
        private Long f11283b;

        /* renamed from: c  reason: collision with root package name */
        private Long f11284c;

        b() {
        }

        public l a() {
            String str = "";
            if (this.f11282a == null) {
                str = str + " token";
            }
            if (this.f11283b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f11284c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.f11282a, this.f11283b.longValue(), this.f11284c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public l.a b(String str) {
            if (str != null) {
                this.f11282a = str;
                return this;
            }
            throw new NullPointerException("Null token");
        }

        public l.a c(long j) {
            this.f11284c = Long.valueOf(j);
            return this;
        }

        public l.a d(long j) {
            this.f11283b = Long.valueOf(j);
            return this;
        }
    }

    public String b() {
        return this.f11279a;
    }

    public long c() {
        return this.f11281c;
    }

    public long d() {
        return this.f11280b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f11279a.equals(lVar.b()) && this.f11280b == lVar.d() && this.f11281c == lVar.c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f11280b;
        long j2 = this.f11281c;
        return ((((this.f11279a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f11279a + ", tokenExpirationTimestamp=" + this.f11280b + ", tokenCreationTimestamp=" + this.f11281c + "}";
    }

    private a(String str, long j, long j2) {
        this.f11279a = str;
        this.f11280b = j;
        this.f11281c = j2;
    }
}
