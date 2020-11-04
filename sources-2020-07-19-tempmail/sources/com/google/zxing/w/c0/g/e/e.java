package com.google.zxing.w.c0.g.e;

import com.google.zxing.NotFoundException;
import com.google.zxing.t.a;

/* compiled from: AI013x0x1xDecoder */
final class e extends i {

    /* renamed from: c  reason: collision with root package name */
    private final String f11903c;

    /* renamed from: d  reason: collision with root package name */
    private final String f11904d;

    e(a aVar, String str, String str2) {
        super(aVar);
        this.f11903c = str2;
        this.f11904d = str;
    }

    private void k(StringBuilder sb, int i) {
        int f2 = b().f(i, 16);
        if (f2 != 38400) {
            sb.append('(');
            sb.append(this.f11903c);
            sb.append(')');
            int i2 = f2 % 32;
            int i3 = f2 / 32;
            int i4 = (i3 % 12) + 1;
            int i5 = i3 / 12;
            if (i5 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i5);
            if (i4 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i4);
            if (i2 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i2);
        }
    }

    public String d() throws NotFoundException {
        if (c().n() == 84) {
            StringBuilder sb = new StringBuilder();
            f(sb, 8);
            j(sb, 48, 20);
            k(sb, 68);
            return sb.toString();
        }
        throw NotFoundException.a();
    }

    /* access modifiers changed from: protected */
    public void h(StringBuilder sb, int i) {
        sb.append('(');
        sb.append(this.f11904d);
        sb.append(i / 100000);
        sb.append(')');
    }

    /* access modifiers changed from: protected */
    public int i(int i) {
        return i % 100000;
    }
}
