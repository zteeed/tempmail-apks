package com.google.zxing.r.f;

import com.google.zxing.t.a;

/* compiled from: BinaryShiftToken */
final class b extends g {

    /* renamed from: c  reason: collision with root package name */
    private final short f11723c;

    /* renamed from: d  reason: collision with root package name */
    private final short f11724d;

    b(g gVar, int i, int i2) {
        super(gVar);
        this.f11723c = (short) i;
        this.f11724d = (short) i2;
    }

    public void c(a aVar, byte[] bArr) {
        int i = 0;
        while (true) {
            short s = this.f11724d;
            if (i < s) {
                if (i == 0 || (i == 31 && s <= 62)) {
                    aVar.d(31, 5);
                    short s2 = this.f11724d;
                    if (s2 > 62) {
                        aVar.d(s2 - 31, 16);
                    } else if (i == 0) {
                        aVar.d(Math.min(s2, 31), 5);
                    } else {
                        aVar.d(s2 - 31, 5);
                    }
                }
                aVar.d(bArr[this.f11723c + i], 8);
                i++;
            } else {
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(this.f11723c);
        sb.append("::");
        sb.append((this.f11723c + this.f11724d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
