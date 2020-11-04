package androidx.media;

import java.util.Arrays;

/* compiled from: AudioAttributesImplBase */
class c implements a {

    /* renamed from: a  reason: collision with root package name */
    int f1717a = 0;

    /* renamed from: b  reason: collision with root package name */
    int f1718b = 0;

    /* renamed from: c  reason: collision with root package name */
    int f1719c = 0;

    /* renamed from: d  reason: collision with root package name */
    int f1720d = -1;

    c() {
    }

    public int a() {
        return this.f1718b;
    }

    public int b() {
        int i = this.f1719c;
        int c2 = c();
        if (c2 == 6) {
            i |= 4;
        } else if (c2 == 7) {
            i |= 1;
        }
        return i & 273;
    }

    public int c() {
        int i = this.f1720d;
        if (i != -1) {
            return i;
        }
        return AudioAttributesCompat.a(false, this.f1719c, this.f1717a);
    }

    public int d() {
        return this.f1717a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f1718b == cVar.a() && this.f1719c == cVar.b() && this.f1717a == cVar.d() && this.f1720d == cVar.f1720d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1718b), Integer.valueOf(this.f1719c), Integer.valueOf(this.f1717a), Integer.valueOf(this.f1720d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f1720d != -1) {
            sb.append(" stream=");
            sb.append(this.f1720d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.b(this.f1717a));
        sb.append(" content=");
        sb.append(this.f1718b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f1719c).toUpperCase());
        return sb.toString();
    }
}
