package b.c.a.b.i;

import b.c.a.b.d;
import b.c.a.b.i.m;
import java.util.Arrays;

/* compiled from: AutoValue_TransportContext */
final class c extends m {

    /* renamed from: a  reason: collision with root package name */
    private final String f2235a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f2236b;

    /* renamed from: c  reason: collision with root package name */
    private final d f2237c;

    /* compiled from: AutoValue_TransportContext */
    static final class b extends m.a {

        /* renamed from: a  reason: collision with root package name */
        private String f2238a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f2239b;

        /* renamed from: c  reason: collision with root package name */
        private d f2240c;

        b() {
        }

        public m a() {
            String str = "";
            if (this.f2238a == null) {
                str = str + " backendName";
            }
            if (this.f2240c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new c(this.f2238a, this.f2239b, this.f2240c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public m.a b(String str) {
            if (str != null) {
                this.f2238a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        public m.a c(byte[] bArr) {
            this.f2239b = bArr;
            return this;
        }

        public m.a d(d dVar) {
            if (dVar != null) {
                this.f2240c = dVar;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }

    public String b() {
        return this.f2235a;
    }

    public byte[] c() {
        return this.f2236b;
    }

    public d d() {
        return this.f2237c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f2235a.equals(mVar.b())) {
            if (!Arrays.equals(this.f2236b, mVar instanceof c ? ((c) mVar).f2236b : mVar.c()) || !this.f2237c.equals(mVar.d())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f2235a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f2236b)) * 1000003) ^ this.f2237c.hashCode();
    }

    private c(String str, byte[] bArr, d dVar) {
        this.f2235a = str;
        this.f2236b = bArr;
        this.f2237c = dVar;
    }
}
