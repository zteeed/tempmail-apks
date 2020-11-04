package com.google.firebase.installations.o;

import com.google.firebase.installations.o.d;

/* compiled from: AutoValue_InstallationResponse */
final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    private final String f11880a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11881b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11882c;

    /* renamed from: d  reason: collision with root package name */
    private final e f11883d;

    /* renamed from: e  reason: collision with root package name */
    private final d.b f11884e;

    /* compiled from: AutoValue_InstallationResponse */
    static final class b extends d.a {

        /* renamed from: a  reason: collision with root package name */
        private String f11885a;

        /* renamed from: b  reason: collision with root package name */
        private String f11886b;

        /* renamed from: c  reason: collision with root package name */
        private String f11887c;

        /* renamed from: d  reason: collision with root package name */
        private e f11888d;

        /* renamed from: e  reason: collision with root package name */
        private d.b f11889e;

        b() {
        }

        public d a() {
            return new a(this.f11885a, this.f11886b, this.f11887c, this.f11888d, this.f11889e);
        }

        public d.a b(e eVar) {
            this.f11888d = eVar;
            return this;
        }

        public d.a c(String str) {
            this.f11886b = str;
            return this;
        }

        public d.a d(String str) {
            this.f11887c = str;
            return this;
        }

        public d.a e(d.b bVar) {
            this.f11889e = bVar;
            return this;
        }

        public d.a f(String str) {
            this.f11885a = str;
            return this;
        }
    }

    public e b() {
        return this.f11883d;
    }

    public String c() {
        return this.f11881b;
    }

    public String d() {
        return this.f11882c;
    }

    public d.b e() {
        return this.f11884e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f11880a;
        if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
            String str2 = this.f11881b;
            if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                String str3 = this.f11882c;
                if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                    e eVar = this.f11883d;
                    if (eVar != null ? eVar.equals(dVar.b()) : dVar.b() == null) {
                        d.b bVar = this.f11884e;
                        if (bVar == null) {
                            if (dVar.e() == null) {
                                return true;
                            }
                        } else if (bVar.equals(dVar.e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public String f() {
        return this.f11880a;
    }

    public int hashCode() {
        String str = this.f11880a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f11881b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f11882c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        e eVar = this.f11883d;
        int hashCode4 = (hashCode3 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        d.b bVar = this.f11884e;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode4 ^ i;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f11880a + ", fid=" + this.f11881b + ", refreshToken=" + this.f11882c + ", authToken=" + this.f11883d + ", responseCode=" + this.f11884e + "}";
    }

    private a(String str, String str2, String str3, e eVar, d.b bVar) {
        this.f11880a = str;
        this.f11881b = str2;
        this.f11882c = str3;
        this.f11883d = eVar;
        this.f11884e = bVar;
    }
}
