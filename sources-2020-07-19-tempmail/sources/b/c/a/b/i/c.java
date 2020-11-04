package b.c.a.b.i;

import b.c.a.b.d;
import b.c.a.b.i.m;
import java.util.Arrays;

/* compiled from: AutoValue_TransportContext */
final class c extends m {

    /* renamed from: a  reason: collision with root package name */
    private final String f2137a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f2138b;

    /* renamed from: c  reason: collision with root package name */
    private final d f2139c;

    /* compiled from: AutoValue_TransportContext */
    static final class b extends m.a {

        /* renamed from: a  reason: collision with root package name */
        private String f2140a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f2141b;

        /* renamed from: c  reason: collision with root package name */
        private d f2142c;

        b() {
        }

        public m a() {
            String str = "";
            if (this.f2140a == null) {
                str = str + " backendName";
            }
            if (this.f2142c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new c(this.f2140a, this.f2141b, this.f2142c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public m.a b(String str) {
            if (str != null) {
                this.f2140a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        public m.a c(byte[] bArr) {
            this.f2141b = bArr;
            return this;
        }

        public m.a d(d dVar) {
            if (dVar != null) {
                this.f2142c = dVar;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }

    public String b() {
        return this.f2137a;
    }

    public byte[] c() {
        return this.f2138b;
    }

    public d d() {
        return this.f2139c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f2137a.equals(mVar.b())) {
            if (!Arrays.equals(this.f2138b, mVar instanceof c ? ((c) mVar).f2138b : mVar.c()) || !this.f2139c.equals(mVar.d())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f2137a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f2138b)) * 1000003) ^ this.f2139c.hashCode();
    }

    private c(String str, byte[] bArr, d dVar) {
        this.f2137a = str;
        this.f2138b = bArr;
        this.f2139c = dVar;
    }
}
