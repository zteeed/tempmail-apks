package com.google.android.datatransport.cct.b;

import com.google.android.datatransport.cct.b.k;

final class e extends k {

    /* renamed from: a  reason: collision with root package name */
    private final k.b f2661a;

    /* renamed from: b  reason: collision with root package name */
    private final a f2662b;

    static final class b extends k.a {

        /* renamed from: a  reason: collision with root package name */
        private k.b f2663a;

        /* renamed from: b  reason: collision with root package name */
        private a f2664b;

        b() {
        }

        public k.a a(a aVar) {
            this.f2664b = aVar;
            return this;
        }

        public k.a b(k.b bVar) {
            this.f2663a = bVar;
            return this;
        }

        public k c() {
            return new e(this.f2663a, this.f2664b, (a) null);
        }
    }

    /* synthetic */ e(k.b bVar, a aVar, a aVar2) {
        this.f2661a = bVar;
        this.f2662b = aVar;
    }

    public a b() {
        return this.f2662b;
    }

    public k.b c() {
        return this.f2661a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k.b bVar = this.f2661a;
        if (bVar != null ? bVar.equals(((e) obj).f2661a) : ((e) obj).f2661a == null) {
            a aVar = this.f2662b;
            if (aVar == null) {
                if (((e) obj).f2662b == null) {
                    return true;
                }
            } else if (aVar.equals(((e) obj).f2662b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        k.b bVar = this.f2661a;
        int i = 0;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        a aVar = this.f2662b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f2661a + ", androidClientInfo=" + this.f2662b + "}";
    }
}
