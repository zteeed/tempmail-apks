package com.google.android.datatransport.cct.b;

import com.google.android.datatransport.cct.b.o;

final class i extends o {

    /* renamed from: a  reason: collision with root package name */
    private final o.c f2690a;

    /* renamed from: b  reason: collision with root package name */
    private final o.b f2691b;

    static final class b extends o.a {

        /* renamed from: a  reason: collision with root package name */
        private o.c f2692a;

        /* renamed from: b  reason: collision with root package name */
        private o.b f2693b;

        b() {
        }

        public o.a a(o.b bVar) {
            this.f2693b = bVar;
            return this;
        }

        public o.a b(o.c cVar) {
            this.f2692a = cVar;
            return this;
        }

        public o c() {
            return new i(this.f2692a, this.f2693b, (a) null);
        }
    }

    /* synthetic */ i(o.c cVar, o.b bVar, a aVar) {
        this.f2690a = cVar;
        this.f2691b = bVar;
    }

    public o.b b() {
        return this.f2691b;
    }

    public o.c c() {
        return this.f2690a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o.c cVar = this.f2690a;
        if (cVar != null ? cVar.equals(((i) obj).f2690a) : ((i) obj).f2690a == null) {
            o.b bVar = this.f2691b;
            if (bVar == null) {
                if (((i) obj).f2691b == null) {
                    return true;
                }
            } else if (bVar.equals(((i) obj).f2691b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        o.c cVar = this.f2690a;
        int i = 0;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        o.b bVar = this.f2691b;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f2690a + ", mobileSubtype=" + this.f2691b + "}";
    }
}
