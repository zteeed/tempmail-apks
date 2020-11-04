package com.google.firebase.installations.p;

import com.google.firebase.installations.p.c;
import com.google.firebase.installations.p.d;

/* compiled from: AutoValue_PersistedInstallationEntry */
final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    private final String f11309a;

    /* renamed from: b  reason: collision with root package name */
    private final c.a f11310b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11311c;

    /* renamed from: d  reason: collision with root package name */
    private final String f11312d;

    /* renamed from: e  reason: collision with root package name */
    private final long f11313e;

    /* renamed from: f  reason: collision with root package name */
    private final long f11314f;
    private final String g;

    /* compiled from: AutoValue_PersistedInstallationEntry */
    static final class b extends d.a {

        /* renamed from: a  reason: collision with root package name */
        private String f11315a;

        /* renamed from: b  reason: collision with root package name */
        private c.a f11316b;

        /* renamed from: c  reason: collision with root package name */
        private String f11317c;

        /* renamed from: d  reason: collision with root package name */
        private String f11318d;

        /* renamed from: e  reason: collision with root package name */
        private Long f11319e;

        /* renamed from: f  reason: collision with root package name */
        private Long f11320f;
        private String g;

        public d a() {
            String str = "";
            if (this.f11316b == null) {
                str = str + " registrationStatus";
            }
            if (this.f11319e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f11320f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new a(this.f11315a, this.f11316b, this.f11317c, this.f11318d, this.f11319e.longValue(), this.f11320f.longValue(), this.g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public d.a b(String str) {
            this.f11317c = str;
            return this;
        }

        public d.a c(long j) {
            this.f11319e = Long.valueOf(j);
            return this;
        }

        public d.a d(String str) {
            this.f11315a = str;
            return this;
        }

        public d.a e(String str) {
            this.g = str;
            return this;
        }

        public d.a f(String str) {
            this.f11318d = str;
            return this;
        }

        public d.a g(c.a aVar) {
            if (aVar != null) {
                this.f11316b = aVar;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        public d.a h(long j) {
            this.f11320f = Long.valueOf(j);
            return this;
        }

        b() {
        }

        private b(d dVar) {
            this.f11315a = dVar.d();
            this.f11316b = dVar.g();
            this.f11317c = dVar.b();
            this.f11318d = dVar.f();
            this.f11319e = Long.valueOf(dVar.c());
            this.f11320f = Long.valueOf(dVar.h());
            this.g = dVar.e();
        }
    }

    public String b() {
        return this.f11311c;
    }

    public long c() {
        return this.f11313e;
    }

    public String d() {
        return this.f11309a;
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
        String str3 = this.f11309a;
        if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
            if (this.f11310b.equals(dVar.g()) && ((str = this.f11311c) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f11312d) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f11313e == dVar.c() && this.f11314f == dVar.h()) {
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
        return this.f11312d;
    }

    public c.a g() {
        return this.f11310b;
    }

    public long h() {
        return this.f11314f;
    }

    public int hashCode() {
        String str = this.f11309a;
        int i = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f11310b.hashCode()) * 1000003;
        String str2 = this.f11311c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f11312d;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j = this.f11313e;
        long j2 = this.f11314f;
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
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f11309a + ", registrationStatus=" + this.f11310b + ", authToken=" + this.f11311c + ", refreshToken=" + this.f11312d + ", expiresInSecs=" + this.f11313e + ", tokenCreationEpochInSecs=" + this.f11314f + ", fisError=" + this.g + "}";
    }

    private a(String str, c.a aVar, String str2, String str3, long j, long j2, String str4) {
        this.f11309a = str;
        this.f11310b = aVar;
        this.f11311c = str2;
        this.f11312d = str3;
        this.f11313e = j;
        this.f11314f = j2;
        this.g = str4;
    }
}
