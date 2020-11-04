package com.google.firebase.installations.n;

import com.google.firebase.installations.n.c;
import com.google.firebase.installations.n.d;

/* compiled from: AutoValue_PersistedInstallationEntry */
final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    private final String f11858a;

    /* renamed from: b  reason: collision with root package name */
    private final c.a f11859b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11860c;

    /* renamed from: d  reason: collision with root package name */
    private final String f11861d;

    /* renamed from: e  reason: collision with root package name */
    private final long f11862e;

    /* renamed from: f  reason: collision with root package name */
    private final long f11863f;
    private final String g;

    /* compiled from: AutoValue_PersistedInstallationEntry */
    static final class b extends d.a {

        /* renamed from: a  reason: collision with root package name */
        private String f11864a;

        /* renamed from: b  reason: collision with root package name */
        private c.a f11865b;

        /* renamed from: c  reason: collision with root package name */
        private String f11866c;

        /* renamed from: d  reason: collision with root package name */
        private String f11867d;

        /* renamed from: e  reason: collision with root package name */
        private Long f11868e;

        /* renamed from: f  reason: collision with root package name */
        private Long f11869f;
        private String g;

        public d a() {
            String str = "";
            if (this.f11865b == null) {
                str = str + " registrationStatus";
            }
            if (this.f11868e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f11869f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new a(this.f11864a, this.f11865b, this.f11866c, this.f11867d, this.f11868e.longValue(), this.f11869f.longValue(), this.g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public d.a b(String str) {
            this.f11866c = str;
            return this;
        }

        public d.a c(long j) {
            this.f11868e = Long.valueOf(j);
            return this;
        }

        public d.a d(String str) {
            this.f11864a = str;
            return this;
        }

        public d.a e(String str) {
            this.g = str;
            return this;
        }

        public d.a f(String str) {
            this.f11867d = str;
            return this;
        }

        public d.a g(c.a aVar) {
            if (aVar != null) {
                this.f11865b = aVar;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        public d.a h(long j) {
            this.f11869f = Long.valueOf(j);
            return this;
        }

        b() {
        }

        private b(d dVar) {
            this.f11864a = dVar.d();
            this.f11865b = dVar.g();
            this.f11866c = dVar.b();
            this.f11867d = dVar.f();
            this.f11868e = Long.valueOf(dVar.c());
            this.f11869f = Long.valueOf(dVar.h());
            this.g = dVar.e();
        }
    }

    public String b() {
        return this.f11860c;
    }

    public long c() {
        return this.f11862e;
    }

    public String d() {
        return this.f11858a;
    }

    public String e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str3 = this.f11858a;
        if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
            if (this.f11859b.equals(dVar.g()) && ((str = this.f11860c) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f11861d) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f11862e == dVar.c() && this.f11863f == dVar.h()) {
                String str4 = this.g;
                if (str4 == null) {
                    if (dVar.e() == null) {
                        return true;
                    }
                } else if (str4.equals(dVar.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    public String f() {
        return this.f11861d;
    }

    public c.a g() {
        return this.f11859b;
    }

    public long h() {
        return this.f11863f;
    }

    public int hashCode() {
        String str = this.f11858a;
        int i = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f11859b.hashCode()) * 1000003;
        String str2 = this.f11860c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f11861d;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j = this.f11862e;
        long j2 = this.f11863f;
        int i2 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.g;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i2 ^ i;
    }

    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f11858a + ", registrationStatus=" + this.f11859b + ", authToken=" + this.f11860c + ", refreshToken=" + this.f11861d + ", expiresInSecs=" + this.f11862e + ", tokenCreationEpochInSecs=" + this.f11863f + ", fisError=" + this.g + "}";
    }

    private a(String str, c.a aVar, String str2, String str3, long j, long j2, String str4) {
        this.f11858a = str;
        this.f11859b = aVar;
        this.f11860c = str2;
        this.f11861d = str3;
        this.f11862e = j;
        this.f11863f = j2;
        this.g = str4;
    }
}
