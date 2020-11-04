package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
class s1 extends p1 {

    /* renamed from: e  reason: collision with root package name */
    protected final byte[] f9674e;

    s1(byte[] bArr) {
        if (bArr != null) {
            this.f9674e = bArr;
            return;
        }
        throw null;
    }

    public final boolean A() {
        int F = F();
        return m4.g(this.f9674e, F, h() + F);
    }

    /* access modifiers changed from: package-private */
    public final boolean C(zzeg zzeg, int i, int i2) {
        if (i2 > zzeg.h()) {
            int h = h();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(h);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > zzeg.h()) {
            int h2 = zzeg.h();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(h2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(zzeg instanceof s1)) {
            return zzeg.j(0, i2).equals(j(0, i2));
        } else {
            s1 s1Var = (s1) zzeg;
            byte[] bArr = this.f9674e;
            byte[] bArr2 = s1Var.f9674e;
            int F = F() + i2;
            int F2 = F();
            int F3 = s1Var.F();
            while (F2 < F) {
                if (bArr[F2] != bArr2[F3]) {
                    return false;
                }
                F2++;
                F3++;
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public int F() {
        return 0;
    }

    public byte c(int i) {
        return this.f9674e[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzeg) || h() != ((zzeg) obj).h()) {
            return false;
        }
        if (h() == 0) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return obj.equals(this);
        }
        s1 s1Var = (s1) obj;
        int B = B();
        int B2 = s1Var.B();
        if (B == 0 || B2 == 0 || B == B2) {
            return C(s1Var, 0, h());
        }
        return false;
    }

    public int h() {
        return this.f9674e.length;
    }

    /* access modifiers changed from: protected */
    public final int i(int i, int i2, int i3) {
        return zzfr.a(i, this.f9674e, F(), i3);
    }

    public final zzeg j(int i, int i2) {
        int w = zzeg.w(0, i2, h());
        if (w == 0) {
            return zzeg.f9791c;
        }
        return new m1(this.f9674e, F(), w);
    }

    /* access modifiers changed from: protected */
    public final String s(Charset charset) {
        return new String(this.f9674e, F(), h(), charset);
    }

    /* access modifiers changed from: package-private */
    public final void u(zzed zzed) throws IOException {
        zzed.a(this.f9674e, F(), h());
    }

    /* access modifiers changed from: package-private */
    public byte v(int i) {
        return this.f9674e[i];
    }
}
