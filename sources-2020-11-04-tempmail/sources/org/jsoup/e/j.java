package org.jsoup.e;

import java.util.Arrays;
import org.jsoup.b.c;
import org.jsoup.e.i;

/* compiled from: Tokeniser */
final class j {
    private static final char[] r;
    static final int[] s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};

    /* renamed from: a  reason: collision with root package name */
    private final a f15245a;

    /* renamed from: b  reason: collision with root package name */
    private final e f15246b;

    /* renamed from: c  reason: collision with root package name */
    private k f15247c = k.Data;

    /* renamed from: d  reason: collision with root package name */
    private i f15248d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f15249e = false;

    /* renamed from: f  reason: collision with root package name */
    private String f15250f = null;
    private StringBuilder g = new StringBuilder(1024);
    StringBuilder h = new StringBuilder(1024);
    i.C0167i i;
    i.h j = new i.h();
    i.g k = new i.g();
    i.c l = new i.c();
    i.e m = new i.e();
    i.d n = new i.d();
    private String o;
    private final int[] p = new int[1];
    private final int[] q = new int[2];

    static {
        char[] cArr = {9, 10, 13, 12, ' ', '<', '&'};
        r = cArr;
        Arrays.sort(cArr);
    }

    j(a aVar, e eVar) {
        this.f15245a = aVar;
        this.f15246b = eVar;
    }

    private void c(String str) {
        if (this.f15246b.c()) {
            this.f15246b.add(new d(this.f15245a.F(), "Invalid character reference: %s", str));
        }
    }

    /* access modifiers changed from: package-private */
    public void a(k kVar) {
        this.f15245a.a();
        this.f15247c = kVar;
    }

    /* access modifiers changed from: package-private */
    public String b() {
        return this.o;
    }

    /* access modifiers changed from: package-private */
    public int[] d(Character ch, boolean z) {
        int i2;
        if (this.f15245a.r()) {
            return null;
        }
        if ((ch != null && ch.charValue() == this.f15245a.q()) || this.f15245a.z(r)) {
            return null;
        }
        int[] iArr = this.p;
        this.f15245a.t();
        if (this.f15245a.u("#")) {
            boolean v = this.f15245a.v("X");
            a aVar = this.f15245a;
            String g2 = v ? aVar.g() : aVar.f();
            if (g2.length() == 0) {
                c("numeric reference with no numerals");
                this.f15245a.H();
                return null;
            }
            if (!this.f15245a.u(";")) {
                c("missing semicolon");
            }
            try {
                i2 = Integer.valueOf(g2, v ? 16 : 10).intValue();
            } catch (NumberFormatException unused) {
                i2 = -1;
            }
            if (i2 == -1 || ((i2 >= 55296 && i2 <= 57343) || i2 > 1114111)) {
                c("character outside of valid range");
                iArr[0] = 65533;
                return iArr;
            }
            if (i2 >= 128 && i2 < s.length + 128) {
                c("character is not a valid unicode code point");
                i2 = s[i2 - 128];
            }
            iArr[0] = i2;
            return iArr;
        }
        String i3 = this.f15245a.i();
        boolean w = this.f15245a.w(';');
        if (!(org.jsoup.d.i.f(i3) || (org.jsoup.d.i.g(i3) && w))) {
            this.f15245a.H();
            if (w) {
                c(String.format("invalid named referenece '%s'", new Object[]{i3}));
            }
            return null;
        } else if (!z || (!this.f15245a.C() && !this.f15245a.A() && !this.f15245a.y('=', '-', '_'))) {
            if (!this.f15245a.u(";")) {
                c("missing semicolon");
            }
            int d2 = org.jsoup.d.i.d(i3, this.q);
            if (d2 == 1) {
                iArr[0] = this.q[0];
                return iArr;
            } else if (d2 == 2) {
                return this.q;
            } else {
                c.a("Unexpected characters returned for " + i3);
                throw null;
            }
        } else {
            this.f15245a.H();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public void e() {
        this.n.m();
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.m.m();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: org.jsoup.e.i$g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: org.jsoup.e.i$h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: org.jsoup.e.i$g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: org.jsoup.e.i$g} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.jsoup.e.i.C0167i g(boolean r1) {
        /*
            r0 = this;
            if (r1 == 0) goto L_0x0008
            org.jsoup.e.i$h r1 = r0.j
            r1.E()
            goto L_0x000d
        L_0x0008:
            org.jsoup.e.i$g r1 = r0.k
            r1.m()
        L_0x000d:
            r0.i = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.e.j.g(boolean):org.jsoup.e.i$i");
    }

    /* access modifiers changed from: package-private */
    public void h() {
        i.n(this.h);
    }

    /* access modifiers changed from: package-private */
    public void i(char c2) {
        j(String.valueOf(c2));
    }

    /* access modifiers changed from: package-private */
    public void j(String str) {
        if (this.f15250f == null) {
            this.f15250f = str;
            return;
        }
        if (this.g.length() == 0) {
            this.g.append(this.f15250f);
        }
        this.g.append(str);
    }

    /* access modifiers changed from: package-private */
    public void k(i iVar) {
        c.c(this.f15249e, "There is an unread token pending!");
        this.f15248d = iVar;
        this.f15249e = true;
        i.j jVar = iVar.f15227a;
        if (jVar == i.j.StartTag) {
            this.o = ((i.h) iVar).f15235b;
        } else if (jVar == i.j.EndTag && ((i.g) iVar).j != null) {
            q("Attributes incorrectly present on end tag");
        }
    }

    /* access modifiers changed from: package-private */
    public void l(int[] iArr) {
        j(new String(iArr, 0, iArr.length));
    }

    /* access modifiers changed from: package-private */
    public void m() {
        k(this.n);
    }

    /* access modifiers changed from: package-private */
    public void n() {
        k(this.m);
    }

    /* access modifiers changed from: package-private */
    public void o() {
        this.i.x();
        k(this.i);
    }

    /* access modifiers changed from: package-private */
    public void p(k kVar) {
        if (this.f15246b.c()) {
            this.f15246b.add(new d(this.f15245a.F(), "Unexpectedly reached end of file (EOF) in input state [%s]", kVar));
        }
    }

    /* access modifiers changed from: package-private */
    public void q(String str) {
        if (this.f15246b.c()) {
            this.f15246b.add(new d(this.f15245a.F(), str));
        }
    }

    /* access modifiers changed from: package-private */
    public void r(k kVar) {
        if (this.f15246b.c()) {
            this.f15246b.add(new d(this.f15245a.F(), "Unexpected character '%s' in input state [%s]", Character.valueOf(this.f15245a.q()), kVar));
        }
    }

    /* access modifiers changed from: package-private */
    public boolean s() {
        return this.o != null && this.i.A().equalsIgnoreCase(this.o);
    }

    /* access modifiers changed from: package-private */
    public i t() {
        while (!this.f15249e) {
            this.f15247c.q(this, this.f15245a);
        }
        if (this.g.length() > 0) {
            String sb = this.g.toString();
            StringBuilder sb2 = this.g;
            sb2.delete(0, sb2.length());
            this.f15250f = null;
            i.c cVar = this.l;
            cVar.p(sb);
            return cVar;
        }
        String str = this.f15250f;
        if (str != null) {
            i.c cVar2 = this.l;
            cVar2.p(str);
            this.f15250f = null;
            return cVar2;
        }
        this.f15249e = false;
        return this.f15248d;
    }

    /* access modifiers changed from: package-private */
    public void u(k kVar) {
        this.f15247c = kVar;
    }
}
