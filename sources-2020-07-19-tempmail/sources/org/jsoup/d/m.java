package org.jsoup.d;

import org.jsoup.b.b;
import org.jsoup.d.f;

/* compiled from: TextNode */
public class m extends k {
    public m(String str) {
        this.f14621d = str;
    }

    static boolean f0(StringBuilder sb) {
        return sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ';
    }

    public String C() {
        return "#text";
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        if (e0() == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        y(r7, r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (e0() == false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void H(java.lang.Appendable r7, int r8, org.jsoup.d.f.a r9) throws java.io.IOException {
        /*
            r6 = this;
            boolean r0 = r9.k()
            if (r0 == 0) goto L_0x003d
            int r0 = r6.Y()
            if (r0 != 0) goto L_0x0024
            org.jsoup.d.l r0 = r6.f14622b
            boolean r1 = r0 instanceof org.jsoup.d.h
            if (r1 == 0) goto L_0x0024
            org.jsoup.d.h r0 = (org.jsoup.d.h) r0
            org.jsoup.e.h r0 = r0.o0()
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0024
            boolean r0 = r6.e0()
            if (r0 == 0) goto L_0x003a
        L_0x0024:
            boolean r0 = r9.i()
            if (r0 == 0) goto L_0x003d
            java.util.List r0 = r6.Z()
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x003d
            boolean r0 = r6.e0()
            if (r0 != 0) goto L_0x003d
        L_0x003a:
            r6.y(r7, r8, r9)
        L_0x003d:
            boolean r8 = r9.k()
            if (r8 == 0) goto L_0x0058
            org.jsoup.d.l r8 = r6.M()
            boolean r8 = r8 instanceof org.jsoup.d.h
            if (r8 == 0) goto L_0x0058
            org.jsoup.d.l r8 = r6.M()
            boolean r8 = org.jsoup.d.h.n0(r8)
            if (r8 != 0) goto L_0x0058
            r8 = 1
            r4 = 1
            goto L_0x005a
        L_0x0058:
            r8 = 0
            r4 = 0
        L_0x005a:
            java.lang.String r1 = r6.b0()
            r3 = 0
            r5 = 0
            r0 = r7
            r2 = r9
            org.jsoup.d.i.e(r0, r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.d.m.H(java.lang.Appendable, int, org.jsoup.d.f$a):void");
    }

    /* access modifiers changed from: package-private */
    public void I(Appendable appendable, int i, f.a aVar) {
    }

    public String d0() {
        return b0();
    }

    public boolean e0() {
        return b.e(b0());
    }

    public String toString() {
        return E();
    }
}
