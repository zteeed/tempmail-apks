package b.c.a.b.i;

import b.c.a.b.b;
import java.util.Arrays;

/* compiled from: EncodedPayload */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final b f2149a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f2150b;

    public g(b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        } else if (bArr != null) {
            this.f2149a = bVar;
            this.f2150b = bArr;
        } else {
            throw new NullPointerException("bytes is null");
        }
    }

    public byte[] a() {
        return this.f2150b;
    }

    public b b() {
        return this.f2149a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!this.f2149a.equals(gVar.f2149a)) {
            return false;
        }
        return Arrays.equals(this.f2150b, gVar.f2150b);
    }

    public int hashCode() {
        return ((this.f2149a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f2150b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f2149a + ", bytes=[...]}";
    }
}
