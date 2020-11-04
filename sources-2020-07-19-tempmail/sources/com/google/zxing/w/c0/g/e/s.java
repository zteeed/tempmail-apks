package com.google.zxing.w.c0.g.e;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.t.a;

/* compiled from: GeneralAppIdDecoder */
final class s {

    /* renamed from: a  reason: collision with root package name */
    private final a f11927a;

    /* renamed from: b  reason: collision with root package name */
    private final m f11928b = new m();

    /* renamed from: c  reason: collision with root package name */
    private final StringBuilder f11929c = new StringBuilder();

    s(a aVar) {
        this.f11927a = aVar;
    }

    private n b(int i) {
        char c2;
        int f2 = f(i, 5);
        if (f2 == 15) {
            return new n(i + 5, '$');
        }
        if (f2 >= 5 && f2 < 15) {
            return new n(i + 5, (char) ((f2 + 48) - 5));
        }
        int f3 = f(i, 6);
        if (f3 >= 32 && f3 < 58) {
            return new n(i + 6, (char) (f3 + 33));
        }
        switch (f3) {
            case 58:
                c2 = '*';
                break;
            case 59:
                c2 = ',';
                break;
            case 60:
                c2 = '-';
                break;
            case 61:
                c2 = '.';
                break;
            case 62:
                c2 = '/';
                break;
            default:
                throw new IllegalStateException("Decoding invalid alphanumeric value: ".concat(String.valueOf(f3)));
        }
        return new n(i + 6, c2);
    }

    private n d(int i) throws FormatException {
        char c2;
        int f2 = f(i, 5);
        if (f2 == 15) {
            return new n(i + 5, '$');
        }
        if (f2 >= 5 && f2 < 15) {
            return new n(i + 5, (char) ((f2 + 48) - 5));
        }
        int f3 = f(i, 7);
        if (f3 >= 64 && f3 < 90) {
            return new n(i + 7, (char) (f3 + 1));
        }
        if (f3 >= 90 && f3 < 116) {
            return new n(i + 7, (char) (f3 + 7));
        }
        switch (f(i, 8)) {
            case 232:
                c2 = '!';
                break;
            case 233:
                c2 = '\"';
                break;
            case 234:
                c2 = '%';
                break;
            case 235:
                c2 = '&';
                break;
            case 236:
                c2 = '\'';
                break;
            case 237:
                c2 = '(';
                break;
            case 238:
                c2 = ')';
                break;
            case 239:
                c2 = '*';
                break;
            case 240:
                c2 = '+';
                break;
            case 241:
                c2 = ',';
                break;
            case 242:
                c2 = '-';
                break;
            case 243:
                c2 = '.';
                break;
            case 244:
                c2 = '/';
                break;
            case 245:
                c2 = ':';
                break;
            case 246:
                c2 = ';';
                break;
            case 247:
                c2 = '<';
                break;
            case 248:
                c2 = '=';
                break;
            case 249:
                c2 = '>';
                break;
            case 250:
                c2 = '?';
                break;
            case 251:
                c2 = '_';
                break;
            case 252:
                c2 = ' ';
                break;
            default:
                throw FormatException.a();
        }
        return new n(i + 8, c2);
    }

    private p e(int i) throws FormatException {
        int i2 = i + 7;
        if (i2 > this.f11927a.n()) {
            int f2 = f(i, 4);
            if (f2 == 0) {
                return new p(this.f11927a.n(), 10, 10);
            }
            return new p(this.f11927a.n(), f2 - 1, 10);
        }
        int f3 = f(i, 7) - 8;
        return new p(i2, f3 / 11, f3 % 11);
    }

    static int g(a aVar, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (aVar.i(i + i4)) {
                i3 |= 1 << ((i2 - i4) - 1);
            }
        }
        return i3;
    }

    private boolean h(int i) {
        int i2 = i + 3;
        if (i2 > this.f11927a.n()) {
            return false;
        }
        while (i < i2) {
            if (this.f11927a.i(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    private boolean i(int i) {
        int i2;
        if (i + 1 > this.f11927a.n()) {
            return false;
        }
        int i3 = 0;
        while (i3 < 5 && (i2 = i3 + i) < this.f11927a.n()) {
            if (i3 == 2) {
                if (!this.f11927a.i(i + 2)) {
                    return false;
                }
            } else if (this.f11927a.i(i2)) {
                return false;
            }
            i3++;
        }
        return true;
    }

    private boolean j(int i) {
        int i2;
        if (i + 1 > this.f11927a.n()) {
            return false;
        }
        int i3 = 0;
        while (i3 < 4 && (i2 = i3 + i) < this.f11927a.n()) {
            if (this.f11927a.i(i2)) {
                return false;
            }
            i3++;
        }
        return true;
    }

    private boolean k(int i) {
        int f2;
        if (i + 5 > this.f11927a.n()) {
            return false;
        }
        int f3 = f(i, 5);
        if (f3 >= 5 && f3 < 16) {
            return true;
        }
        if (i + 6 <= this.f11927a.n() && (f2 = f(i, 6)) >= 16 && f2 < 63) {
            return true;
        }
        return false;
    }

    private boolean l(int i) {
        int f2;
        if (i + 5 > this.f11927a.n()) {
            return false;
        }
        int f3 = f(i, 5);
        if (f3 >= 5 && f3 < 16) {
            return true;
        }
        if (i + 7 > this.f11927a.n()) {
            return false;
        }
        int f4 = f(i, 7);
        if (f4 >= 64 && f4 < 116) {
            return true;
        }
        if (i + 8 <= this.f11927a.n() && (f2 = f(i, 8)) >= 232 && f2 < 253) {
            return true;
        }
        return false;
    }

    private boolean m(int i) {
        if (i + 7 <= this.f11927a.n()) {
            int i2 = i;
            while (true) {
                int i3 = i + 3;
                if (i2 >= i3) {
                    return this.f11927a.i(i3);
                }
                if (this.f11927a.i(i2)) {
                    return true;
                }
                i2++;
            }
        } else if (i + 4 <= this.f11927a.n()) {
            return true;
        } else {
            return false;
        }
    }

    private l n() {
        while (k(this.f11928b.a())) {
            n b2 = b(this.f11928b.a());
            this.f11928b.h(b2.a());
            if (b2.c()) {
                return new l(new o(this.f11928b.a(), this.f11929c.toString()), true);
            }
            this.f11929c.append(b2.b());
        }
        if (h(this.f11928b.a())) {
            this.f11928b.b(3);
            this.f11928b.g();
        } else if (i(this.f11928b.a())) {
            if (this.f11928b.a() + 5 < this.f11927a.n()) {
                this.f11928b.b(5);
            } else {
                this.f11928b.h(this.f11927a.n());
            }
            this.f11928b.f();
        }
        return new l(false);
    }

    private o o() throws FormatException {
        boolean z;
        l lVar;
        do {
            int a2 = this.f11928b.a();
            if (this.f11928b.c()) {
                lVar = n();
                z = lVar.b();
            } else if (this.f11928b.d()) {
                lVar = p();
                z = lVar.b();
            } else {
                lVar = q();
                z = lVar.b();
            }
            if (!(a2 != this.f11928b.a()) && !z) {
                break;
            }
        } while (!z);
        return lVar.a();
    }

    private l p() throws FormatException {
        while (l(this.f11928b.a())) {
            n d2 = d(this.f11928b.a());
            this.f11928b.h(d2.a());
            if (d2.c()) {
                return new l(new o(this.f11928b.a(), this.f11929c.toString()), true);
            }
            this.f11929c.append(d2.b());
        }
        if (h(this.f11928b.a())) {
            this.f11928b.b(3);
            this.f11928b.g();
        } else if (i(this.f11928b.a())) {
            if (this.f11928b.a() + 5 < this.f11927a.n()) {
                this.f11928b.b(5);
            } else {
                this.f11928b.h(this.f11927a.n());
            }
            this.f11928b.e();
        }
        return new l(false);
    }

    private l q() throws FormatException {
        o oVar;
        while (m(this.f11928b.a())) {
            p e2 = e(this.f11928b.a());
            this.f11928b.h(e2.a());
            if (e2.d()) {
                if (e2.e()) {
                    oVar = new o(this.f11928b.a(), this.f11929c.toString());
                } else {
                    oVar = new o(this.f11928b.a(), this.f11929c.toString(), e2.c());
                }
                return new l(oVar, true);
            }
            this.f11929c.append(e2.b());
            if (e2.e()) {
                return new l(new o(this.f11928b.a(), this.f11929c.toString()), true);
            }
            this.f11929c.append(e2.c());
        }
        if (j(this.f11928b.a())) {
            this.f11928b.e();
            this.f11928b.b(4);
        }
        return new l(false);
    }

    /* access modifiers changed from: package-private */
    public String a(StringBuilder sb, int i) throws NotFoundException, FormatException {
        String str = null;
        while (true) {
            o c2 = c(i, str);
            String a2 = r.a(c2.b());
            if (a2 != null) {
                sb.append(a2);
            }
            String valueOf = c2.d() ? String.valueOf(c2.c()) : null;
            if (i == c2.a()) {
                return sb.toString();
            }
            i = c2.a();
            str = valueOf;
        }
    }

    /* access modifiers changed from: package-private */
    public o c(int i, String str) throws FormatException {
        this.f11929c.setLength(0);
        if (str != null) {
            this.f11929c.append(str);
        }
        this.f11928b.h(i);
        o o = o();
        if (o == null || !o.d()) {
            return new o(this.f11928b.a(), this.f11929c.toString());
        }
        return new o(this.f11928b.a(), this.f11929c.toString(), o.c());
    }

    /* access modifiers changed from: package-private */
    public int f(int i, int i2) {
        return g(this.f11927a, i, i2);
    }
}
