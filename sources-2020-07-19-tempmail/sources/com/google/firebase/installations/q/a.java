package com.google.firebase.installations.q;

import com.google.firebase.installations.q.d;

/* compiled from: AutoValue_InstallationResponse */
final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    private final String f11331a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11332b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11333c;

    /* renamed from: d  reason: collision with root package name */
    private final e f11334d;

    /* renamed from: e  reason: collision with root package name */
    private final d.b f11335e;

    /* compiled from: AutoValue_InstallationResponse */
    static final class b extends d.a {

        /* renamed from: a  reason: collision with root package name */
        private String f11336a;

        /* renamed from: b  reason: collision with root package name */
        private String f11337b;

        /* renamed from: c  reason: collision with root package name */
        private String f11338c;

        /* renamed from: d  reason: collision with root package name */
        private e f11339d;

        /* renamed from: e  reason: collision with root package name */
        private d.b f11340e;

        b() {
        }

        public d a() {
            return new a(this.f11336a, this.f11337b, this.f11338c, this.f11339d, this.f11340e);
        }

        public d.a b(e eVar) {
            this.f11339d = eVar;
            return this;
        }

        public d.a c(String str) {
            this.f11337b = str;
            return this;
        }

        public d.a d(String str) {
            this.f11338c = str;
            return this;
        }

        public d.a e(d.b bVar) {
            this.f11340e = bVar;
            return this;
        }

        public d.a f(String str) {
            this.f11336a = str;
            return this;
        }
    }

    public e b() {
        return this.f11334d;
    }

    public String c() {
        return this.f11332b;
    }

    public String d() {
        return this.f11333c;
    }

    public d.b e() {
        return this.f11335e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f11331a;
        if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
            String str2 = this.f11332b;
            if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                String str3 = this.f11333c;
                if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                    e eVar = this.f11334d;
                    if (eVar != null ? eVar.equals(dVar.b()) : dVar.b() == null) {
                        d.b bVar = this.f11335e;
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
        return this.f11331a;
    }

    public int hashCode() {
        String str = this.f11331a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f11332b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f11333c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        e eVar = this.f11334d;
        int hashCode4 = (hashCode3 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        d.b bVar = this.f11335e;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode4 ^ i;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f11331a + ", fid=" + this.f11332b + ", refreshToken=" + this.f11333c + ", authToken=" + this.f11334d + ", responseCode=" + this.f11335e + "}";
    }

    private a(String str, String str2, String str3, e eVar, d.b bVar) {
        this.f11331a = str;
        this.f11332b = str2;
        this.f11333c = str3;
        this.f11334d = eVar;
        this.f11335e = bVar;
    }
}
