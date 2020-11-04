package com.google.firebase.installations.q;

import com.google.firebase.installations.q.e;

/* compiled from: AutoValue_TokenResult */
final class b extends e {

    /* renamed from: a  reason: collision with root package name */
    private final String f11341a;

    /* renamed from: b  reason: collision with root package name */
    private final long f11342b;

    /* renamed from: c  reason: collision with root package name */
    private final e.b f11343c;

    /* renamed from: com.google.firebase.installations.q.b$b  reason: collision with other inner class name */
    /* compiled from: AutoValue_TokenResult */
    static final class C0105b extends e.a {

        /* renamed from: a  reason: collision with root package name */
        private String f11344a;

        /* renamed from: b  reason: collision with root package name */
        private Long f11345b;

        /* renamed from: c  reason: collision with root package name */
        private e.b f11346c;

        C0105b() {
        }

        public e a() {
            String str = "";
            if (this.f11345b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new b(this.f11344a, this.f11345b.longValue(), this.f11346c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public e.a b(e.b bVar) {
            this.f11346c = bVar;
            return this;
        }

        public e.a c(String str) {
            this.f11344a = str;
            return this;
        }

        public e.a d(long j) {
            this.f11345b = Long.valueOf(j);
            return this;
        }
    }

    public e.b b() {
        return this.f11343c;
    }

    public String c() {
        return this.f11341a;
    }

    public long d() {
        return this.f11342b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        String str = this.f11341a;
        if (str != null ? str.equals(eVar.c()) : eVar.c() == null) {
            if (this.f11342b == eVar.d()) {
                e.b bVar = this.f11343c;
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
        String str = this.f11341a;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f11342b;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        e.b bVar = this.f11343c;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        return "TokenResult{token=" + this.f11341a + ", tokenExpirationTimestamp=" + this.f11342b + ", responseCode=" + this.f11343c + "}";
    }

    private b(String str, long j, e.b bVar) {
        this.f11341a = str;
        this.f11342b = j;
        this.f11343c = bVar;
    }
}
