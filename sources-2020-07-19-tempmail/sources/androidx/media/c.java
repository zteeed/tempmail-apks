package androidx.media;

import java.util.Arrays;

/* compiled from: AudioAttributesImplBase */
class c implements a {

    /* renamed from: a  reason: collision with root package name */
    int f1634a = 0;

    /* renamed from: b  reason: collision with root package name */
    int f1635b = 0;

    /* renamed from: c  reason: collision with root package name */
    int f1636c = 0;

    /* renamed from: d  reason: collision with root package name */
    int f1637d = -1;

    c() {
    }

    public int a() {
        return this.f1635b;
    }

    public int b() {
        int i = this.f1636c;
        int c2 = c();
        if (c2 == 6) {
            i |= 4;
        } else if (c2 == 7) {
            i |= 1;
        }
        return i & 273;
    }

    public int c() {
        int i = this.f1637d;
        if (i != -1) {
            return i;
        }
        return AudioAttributesCompat.a(false, this.f1636c, this.f1634a);
    }

    public int d() {
        return this.f1634a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f1635b == cVar.a() && this.f1636c == cVar.b() && this.f1634a == cVar.d() && this.f1637d == cVar.f1637d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1635b), Integer.valueOf(this.f1636c), Integer.valueOf(this.f1634a), Integer.valueOf(this.f1637d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f1637d != -1) {
            sb.append(" stream=");
            sb.append(this.f1637d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.b(this.f1634a));
        sb.append(" content=");
        sb.append(this.f1635b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f1636c).toUpperCase());
        return sb.toString();
    }
}
