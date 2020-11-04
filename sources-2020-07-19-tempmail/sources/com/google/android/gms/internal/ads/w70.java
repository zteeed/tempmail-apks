package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class w70 extends zzeer {
    static final int[] j = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* renamed from: e  reason: collision with root package name */
    private final int f5192e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final zzeer f5193f;
    /* access modifiers changed from: private */
    public final zzeer g;
    private final int h;
    private final int i;

    private w70(zzeer zzeer, zzeer zzeer2) {
        this.f5193f = zzeer;
        this.g = zzeer2;
        int size = zzeer.size();
        this.h = size;
        this.f5192e = size + zzeer2.size();
        this.i = Math.max(zzeer.z(), zzeer2.z()) + 1;
    }

    static zzeer X(zzeer zzeer, zzeer zzeer2) {
        if (zzeer2.size() == 0) {
            return zzeer;
        }
        if (zzeer.size() == 0) {
            return zzeer2;
        }
        int size = zzeer.size() + zzeer2.size();
        if (size < 128) {
            return Z(zzeer, zzeer2);
        }
        if (zzeer instanceof w70) {
            w70 w70 = (w70) zzeer;
            if (w70.g.size() + zzeer2.size() < 128) {
                return new w70(w70.f5193f, Z(w70.g, zzeer2));
            } else if (w70.f5193f.z() > w70.g.z() && w70.z() > zzeer2.z()) {
                return new w70(w70.f5193f, new w70(w70.g, zzeer2));
            }
        }
        if (size >= b0(Math.max(zzeer.z(), zzeer2.z()) + 1)) {
            return new w70(zzeer, zzeer2);
        }
        return new y70((v70) null).c(zzeer, zzeer2);
    }

    private static zzeer Z(zzeer zzeer, zzeer zzeer2) {
        int size = zzeer.size();
        int size2 = zzeer2.size();
        byte[] bArr = new byte[(size + size2)];
        zzeer.l(bArr, 0, 0, size);
        zzeer2.l(bArr, 0, size, size2);
        return zzeer.V(bArr);
    }

    static int b0(int i2) {
        int[] iArr = j;
        if (i2 >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[i2];
    }

    /* access modifiers changed from: protected */
    public final boolean A() {
        return this.f5192e >= b0(this.i);
    }

    public final byte C(int i2) {
        zzeer.m(i2, this.f5192e);
        return F(i2);
    }

    /* access modifiers changed from: package-private */
    public final byte F(int i2) {
        int i3 = this.h;
        if (i2 < i3) {
            return this.f5193f.F(i2);
        }
        return this.g.F(i2 - i3);
    }

    /* access modifiers changed from: protected */
    public final int J(int i2, int i3, int i4) {
        int i5 = i3 + i4;
        int i6 = this.h;
        if (i5 <= i6) {
            return this.f5193f.J(i2, i3, i4);
        }
        if (i3 >= i6) {
            return this.g.J(i2, i3 - i6, i4);
        }
        int i7 = i6 - i3;
        return this.g.J(this.f5193f.J(i2, i3, i7), 0, i4 - i7);
    }

    /* access modifiers changed from: protected */
    public final int M(int i2, int i3, int i4) {
        int i5 = i3 + i4;
        int i6 = this.h;
        if (i5 <= i6) {
            return this.f5193f.M(i2, i3, i4);
        }
        if (i3 >= i6) {
            return this.g.M(i2, i3 - i6, i4);
        }
        int i7 = i6 - i3;
        return this.g.M(this.f5193f.M(i2, i3, i7), 0, i4 - i7);
    }

    public final zzeer W(int i2, int i3) {
        int O = zzeer.O(i2, i3, this.f5192e);
        if (O == 0) {
            return zzeer.f8533c;
        }
        if (O == this.f5192e) {
            return this;
        }
        int i4 = this.h;
        if (i3 <= i4) {
            return this.f5193f.W(i2, i3);
        }
        if (i2 >= i4) {
            return this.g.W(i2 - i4, i3 - i4);
        }
        zzeer zzeer = this.f5193f;
        return new w70(zzeer.W(i2, zzeer.size()), this.g.W(0, i3 - this.h));
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzeer)) {
            return false;
        }
        zzeer zzeer = (zzeer) obj;
        if (this.f5192e != zzeer.size()) {
            return false;
        }
        if (this.f5192e == 0) {
            return true;
        }
        int B = B();
        int B2 = zzeer.B();
        if (B != 0 && B2 != 0 && B != B2) {
            return false;
        }
        x70 x70 = new x70(this, (v70) null);
        v50 v50 = (v50) x70.next();
        x70 x702 = new x70(zzeer, (v70) null);
        v50 v502 = (v50) x702.next();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int size = v50.size() - i2;
            int size2 = v502.size() - i3;
            int min = Math.min(size, size2);
            if (i2 == 0) {
                z = v50.X(v502, i3, min);
            } else {
                z = v502.X(v50, i2, min);
            }
            if (!z) {
                return false;
            }
            i4 += min;
            int i5 = this.f5192e;
            if (i4 < i5) {
                if (min == size) {
                    v50 = (v50) x70.next();
                    i2 = 0;
                } else {
                    i2 += min;
                }
                if (min == size2) {
                    v502 = (v50) x702.next();
                    i3 = 0;
                } else {
                    i3 += min;
                }
            } else if (i4 == i5) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final String i(Charset charset) {
        return new String(c(), charset);
    }

    /* access modifiers changed from: package-private */
    public final void j(zzeeo zzeeo) throws IOException {
        this.f5193f.j(zzeeo);
        this.g.j(zzeeo);
    }

    /* access modifiers changed from: protected */
    public final void q(byte[] bArr, int i2, int i3, int i4) {
        int i5 = i2 + i4;
        int i6 = this.h;
        if (i5 <= i6) {
            this.f5193f.q(bArr, i2, i3, i4);
        } else if (i2 >= i6) {
            this.g.q(bArr, i2 - i6, i3, i4);
        } else {
            int i7 = i6 - i2;
            this.f5193f.q(bArr, i2, i3, i7);
            this.g.q(bArr, 0, i3 + i7, i4 - i7);
        }
    }

    /* renamed from: s */
    public final zzeew iterator() {
        return new v70(this);
    }

    public final int size() {
        return this.f5192e;
    }

    public final boolean v() {
        int J = this.f5193f.J(0, 0, this.h);
        zzeer zzeer = this.g;
        if (zzeer.J(J, 0, zzeer.size()) == 0) {
            return true;
        }
        return false;
    }

    public final zzefc w() {
        return new b60(new a80(this));
    }

    /* access modifiers changed from: protected */
    public final int z() {
        return this.i;
    }

    /* synthetic */ w70(zzeer zzeer, zzeer zzeer2, v70 v70) {
        this(zzeer, zzeer2);
    }
}
