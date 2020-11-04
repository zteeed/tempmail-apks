package com.google.android.datatransport.cct.b;

import com.google.android.datatransport.cct.b.k;

final class e extends k {

    /* renamed from: a  reason: collision with root package name */
    private final k.b f2473a;

    /* renamed from: b  reason: collision with root package name */
    private final a f2474b;

    static final class b extends k.a {

        /* renamed from: a  reason: collision with root package name */
        private k.b f2475a;

        /* renamed from: b  reason: collision with root package name */
        private a f2476b;

        b() {
        }

        public k.a a(a aVar) {
            this.f2476b = aVar;
            return this;
        }

        public k.a b(k.b bVar) {
            this.f2475a = bVar;
            return this;
        }

        public k c() {
            return new e(this.f2475a, this.f2476b, (a) null);
        }
    }

    /* synthetic */ e(k.b bVar, a aVar, a aVar2) {
        this.f2473a = bVar;
        this.f2474b = aVar;
    }

    public a b() {
        return this.f2474b;
    }

    public k.b c() {
        return this.f2473a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k.b bVar = this.f2473a;
        if (bVar != null ? bVar.equals(((e) obj).f2473a) : ((e) obj).f2473a == null) {
            a aVar = this.f2474b;
            if (aVar == null) {
                if (((e) obj).f2474b == null) {
                    return true;
                }
            } else if (aVar.equals(((e) obj).f2474b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        k.b bVar = this.f2473a;
        int i = 0;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        a aVar = this.f2474b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f2473a + ", androidClientInfo=" + this.f2474b + "}";
    }
}
