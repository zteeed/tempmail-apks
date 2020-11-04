package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
class x50 extends v50 {

    /* renamed from: e  reason: collision with root package name */
    protected final byte[] f5283e;

    x50(byte[] bArr) {
        if (bArr != null) {
            this.f5283e = bArr;
            return;
        }
        throw null;
    }

    public byte C(int i) {
        return this.f5283e[i];
    }

    /* access modifiers changed from: package-private */
    public byte F(int i) {
        return this.f5283e[i];
    }

    /* access modifiers changed from: protected */
    public final int J(int i, int i2, int i3) {
        int Y = Y() + i2;
        return y80.e(i, this.f5283e, Y, i3 + Y);
    }

    /* access modifiers changed from: protected */
    public final int M(int i, int i2, int i3) {
        return zzegd.c(i, this.f5283e, Y() + i2, i3);
    }

    public final zzeer W(int i, int i2) {
        int O = zzeer.O(i, i2, size());
        if (O == 0) {
            return zzeer.f8533c;
        }
        return new s50(this.f5283e, Y() + i, O);
    }

    /* access modifiers changed from: package-private */
    public final boolean X(zzeer zzeer, int i, int i2) {
        if (i2 <= zzeer.size()) {
            int i3 = i + i2;
            if (i3 > zzeer.size()) {
                int size = zzeer.size();
                StringBuilder sb = new StringBuilder(59);
                sb.append("Ran off end of other: ");
                sb.append(i);
                sb.append(", ");
                sb.append(i2);
                sb.append(", ");
                sb.append(size);
                throw new IllegalArgumentException(sb.toString());
            } else if (!(zzeer instanceof x50)) {
                return zzeer.W(i, i3).equals(W(0, i2));
            } else {
                x50 x50 = (x50) zzeer;
                byte[] bArr = this.f5283e;
                byte[] bArr2 = x50.f5283e;
                int Y = Y() + i2;
                int Y2 = Y();
                int Y3 = x50.Y() + i;
                while (Y2 < Y) {
                    if (bArr[Y2] != bArr2[Y3]) {
                        return false;
                    }
                    Y2++;
                    Y3++;
                }
                return true;
            }
        } else {
            int size2 = size();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(i2);
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* access modifiers changed from: protected */
    public int Y() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzeer) || size() != ((zzeer) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof x50)) {
            return obj.equals(this);
        }
        x50 x50 = (x50) obj;
        int B = B();
        int B2 = x50.B();
        if (B == 0 || B2 == 0 || B == B2) {
            return X(x50, 0, size());
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final String i(Charset charset) {
        return new String(this.f5283e, Y(), size(), charset);
    }

    /* access modifiers changed from: package-private */
    public final void j(zzeeo zzeeo) throws IOException {
        zzeeo.a(this.f5283e, Y(), size());
    }

    /* access modifiers changed from: protected */
    public void q(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f5283e, i, bArr, i2, i3);
    }

    public int size() {
        return this.f5283e.length;
    }

    public final boolean v() {
        int Y = Y();
        return y80.j(this.f5283e, Y, size() + Y);
    }

    public final zzefc w() {
        return zzefc.d(this.f5283e, Y(), size(), true);
    }
}
