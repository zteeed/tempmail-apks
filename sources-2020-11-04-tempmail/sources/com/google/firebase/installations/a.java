package com.google.firebase.installations;

import com.google.firebase.installations.j;

/* compiled from: com.google.firebase:firebase-installations-interop@@16.0.0 */
final class a extends j {

    /* renamed from: a  reason: collision with root package name */
    private final String f11829a;

    /* renamed from: b  reason: collision with root package name */
    private final long f11830b;

    /* renamed from: c  reason: collision with root package name */
    private final long f11831c;

    /* compiled from: com.google.firebase:firebase-installations-interop@@16.0.0 */
    static final class b extends j.a {

        /* renamed from: a  reason: collision with root package name */
        private String f11832a;

        /* renamed from: b  reason: collision with root package name */
        private Long f11833b;

        /* renamed from: c  reason: collision with root package name */
        private Long f11834c;

        b() {
        }

        public j a() {
            String str = "";
            if (this.f11832a == null) {
                str = str + " token";
            }
            if (this.f11833b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f11834c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.f11832a, this.f11833b.longValue(), this.f11834c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public j.a b(String str) {
            if (str != null) {
                this.f11832a = str;
                return this;
            }
            throw new NullPointerException("Null token");
        }

        public j.a c(long j) {
            this.f11834c = Long.valueOf(j);
            return this;
        }

        public j.a d(long j) {
            this.f11833b = Long.valueOf(j);
            return this;
        }
    }

    public String b() {
        return this.f11829a;
    }

    public long c() {
        return this.f11831c;
    }

    public long d() {
        return this.f11830b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f11829a.equals(jVar.b()) && this.f11830b == jVar.d() && this.f11831c == jVar.c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f11830b;
        long j2 = this.f11831c;
        return ((((this.f11829a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f11829a + ", tokenExpirationTimestamp=" + this.f11830b + ", tokenCreationTimestamp=" + this.f11831c + "}";
    }

    private a(String str, long j, long j2) {
        this.f11829a = str;
        this.f11830b = j;
        this.f11831c = j2;
    }
}
