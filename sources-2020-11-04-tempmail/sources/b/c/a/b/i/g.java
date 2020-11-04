package b.c.a.b.i;

import b.c.a.b.b;
import java.util.Arrays;

/* compiled from: EncodedPayload */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final b f2247a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f2248b;

    public g(b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        } else if (bArr != null) {
            this.f2247a = bVar;
            this.f2248b = bArr;
        } else {
            throw new NullPointerException("bytes is null");
        }
    }

    public byte[] a() {
        return this.f2248b;
    }

    public b b() {
        return this.f2247a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!this.f2247a.equals(gVar.f2247a)) {
            return false;
        }
        return Arrays.equals(this.f2248b, gVar.f2248b);
    }

    public int hashCode() {
        return ((this.f2247a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f2248b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f2247a + ", bytes=[...]}";
    }
}
