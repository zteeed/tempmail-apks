package com.google.firebase.installations.o;

import com.google.firebase.installations.o.e;

/* compiled from: AutoValue_TokenResult */
final class b extends e {

    /* renamed from: a  reason: collision with root package name */
    private final String f11890a;

    /* renamed from: b  reason: collision with root package name */
    private final long f11891b;

    /* renamed from: c  reason: collision with root package name */
    private final e.b f11892c;

    /* renamed from: com.google.firebase.installations.o.b$b  reason: collision with other inner class name */
    /* compiled from: AutoValue_TokenResult */
    static final class C0105b extends e.a {

        /* renamed from: a  reason: collision with root package name */
        private String f11893a;

        /* renamed from: b  reason: collision with root package name */
        private Long f11894b;

        /* renamed from: c  reason: collision with root package name */
        private e.b f11895c;

        C0105b() {
        }

        public e a() {
            String str = "";
            if (this.f11894b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new b(this.f11893a, this.f11894b.longValue(), this.f11895c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public e.a b(e.b bVar) {
            this.f11895c = bVar;
            return this;
        }

        public e.a c(String str) {
            this.f11893a = str;
            return this;
        }

        public e.a d(long j) {
            this.f11894b = Long.valueOf(j);
            return this;
        }
    }

    public e.b b() {
        return this.f11892c;
    }

    public String c() {
        return this.f11890a;
    }

    public long d() {
        return this.f11891b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        String str = this.f11890a;
        if (str != null ? str.equals(eVar.c()) : eVar.c() == null) {
            if (this.f11891b == eVar.d()) {
                e.b bVar = this.f11892c;
                if (bVar == null) {
                    if (eVar.b() == null) {
                        return true;
                    }
                } else if (bVar.equals(eVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f11890a;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f11891b;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        e.b bVar = this.f11892c;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        return "TokenResult{token=" + this.f11890a + ", tokenExpirationTimestamp=" + this.f11891b + ", responseCode=" + this.f11892c + "}";
    }

    private b(String str, long j, e.b bVar) {
        this.f11890a = str;
        this.f11891b = j;
        this.f11892c = bVar;
    }
}
