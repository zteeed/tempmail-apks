package org.jsoup.e;

import com.tempmail.t.p;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.b.c;
import org.jsoup.d.d;
import org.jsoup.d.e;
import org.jsoup.d.f;
import org.jsoup.d.h;
import org.jsoup.d.j;
import org.jsoup.d.l;
import org.jsoup.d.m;
import org.jsoup.e.i;

/* compiled from: HtmlTreeBuilder */
public class b extends l {
    static final String[] A = {"html", "table"};
    static final String[] B = {"optgroup", "option"};
    static final String[] C = {"dd", "dt", "li", "optgroup", "option", p.g, "rp", "rt"};
    static final String[] D = {"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "command", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", p.g, "param", "plaintext", "pre", "script", "section", "select", "style", "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp"};
    static final String[] x = {"applet", "caption", "html", "marquee", "object", "table", "td", "th"};
    static final String[] y = {"ol", "ul"};
    static final String[] z = {"button"};
    private c k;
    private c l;
    private boolean m;
    private h n;
    private j o;
    private h p;
    private ArrayList<h> q;
    private List<String> r;
    private i.g s;
    private boolean t;
    private boolean u;
    private boolean v;
    private String[] w = {null};

    private boolean I(String str, String[] strArr, String[] strArr2) {
        String[] strArr3 = this.w;
        strArr3[0] = str;
        return J(strArr3, strArr, strArr2);
    }

    private boolean J(String[] strArr, String[] strArr2, String[] strArr3) {
        int size = this.f15259d.size() - 1;
        int i = size > 100 ? size - 100 : 0;
        while (size >= i) {
            String C2 = this.f15259d.get(size).C();
            if (org.jsoup.b.b.c(C2, strArr)) {
                return true;
            }
            if (org.jsoup.b.b.c(C2, strArr2)) {
                return false;
            }
            if (strArr3 != null && org.jsoup.b.b.c(C2, strArr3)) {
                return false;
            }
            size--;
        }
        return false;
    }

    private void T(l lVar) {
        j jVar;
        if (this.f15259d.size() == 0) {
            this.f15258c.d0(lVar);
        } else if (X()) {
            R(lVar);
        } else {
            a().d0(lVar);
        }
        if (lVar instanceof h) {
            h hVar = (h) lVar;
            if (hVar.o0().e() && (jVar = this.o) != null) {
                jVar.r0(hVar);
            }
        }
    }

    private boolean W(ArrayList<h> arrayList, h hVar) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == hVar) {
                return true;
            }
        }
        return false;
    }

    private boolean a0(h hVar, h hVar2) {
        return hVar.C().equals(hVar2.C()) && hVar.f().equals(hVar2.f());
    }

    private void k(String... strArr) {
        int size = this.f15259d.size() - 1;
        while (size >= 0) {
            h hVar = this.f15259d.get(size);
            if (!org.jsoup.b.b.b(hVar.C(), strArr) && !hVar.C().equals("html")) {
                this.f15259d.remove(size);
                size--;
            } else {
                return;
            }
        }
    }

    private void u0(ArrayList<h> arrayList, h hVar, h hVar2) {
        int lastIndexOf = arrayList.lastIndexOf(hVar);
        c.d(lastIndexOf != -1);
        arrayList.set(lastIndexOf, hVar2);
    }

    /* access modifiers changed from: package-private */
    public List<String> A() {
        return this.r;
    }

    /* access modifiers changed from: package-private */
    public c A0() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public ArrayList<h> B() {
        return this.f15259d;
    }

    /* access modifiers changed from: package-private */
    public void B0(c cVar) {
        this.k = cVar;
    }

    /* access modifiers changed from: package-private */
    public boolean C(String str) {
        return F(str, z);
    }

    /* access modifiers changed from: package-private */
    public boolean D(String str) {
        return F(str, y);
    }

    /* access modifiers changed from: package-private */
    public boolean E(String str) {
        return F(str, (String[]) null);
    }

    /* access modifiers changed from: package-private */
    public boolean F(String str, String[] strArr) {
        return I(str, x, strArr);
    }

    /* access modifiers changed from: package-private */
    public boolean G(String[] strArr) {
        return J(strArr, x, (String[]) null);
    }

    /* access modifiers changed from: package-private */
    public boolean H(String str) {
        for (int size = this.f15259d.size() - 1; size >= 0; size--) {
            String C2 = this.f15259d.get(size).C();
            if (C2.equals(str)) {
                return true;
            }
            if (!org.jsoup.b.b.c(C2, B)) {
                return false;
            }
        }
        c.a("Should not be reachable");
        throw null;
    }

    /* access modifiers changed from: package-private */
    public boolean K(String str) {
        return I(str, A, (String[]) null);
    }

    /* access modifiers changed from: package-private */
    public h L(i.h hVar) {
        if (hVar.z()) {
            h P = P(hVar);
            this.f15259d.add(P);
            this.f15257b.u(k.Data);
            j jVar = this.f15257b;
            i.g gVar = this.s;
            gVar.m();
            gVar.B(P.p0());
            jVar.k(gVar);
            return P;
        }
        h k2 = h.k(hVar.A(), this.h);
        String str = this.f15260e;
        f fVar = this.h;
        org.jsoup.d.b bVar = hVar.j;
        fVar.a(bVar);
        h hVar2 = new h(k2, str, bVar);
        M(hVar2);
        return hVar2;
    }

    /* access modifiers changed from: package-private */
    public void M(h hVar) {
        T(hVar);
        this.f15259d.add(hVar);
    }

    /* access modifiers changed from: package-private */
    public void N(i.c cVar) {
        l lVar;
        String p0 = a().p0();
        String q2 = cVar.q();
        if (cVar.f()) {
            lVar = new org.jsoup.d.c(q2);
        } else if (p0.equals("script") || p0.equals("style")) {
            lVar = new e(q2);
        } else {
            lVar = new m(q2);
        }
        a().d0(lVar);
    }

    /* access modifiers changed from: package-private */
    public void O(i.d dVar) {
        T(new d(dVar.p()));
    }

    /* access modifiers changed from: package-private */
    public h P(i.h hVar) {
        h k2 = h.k(hVar.A(), this.h);
        h hVar2 = new h(k2, this.f15260e, hVar.j);
        T(hVar2);
        if (hVar.z()) {
            if (!k2.f()) {
                k2.j();
            } else if (!k2.d()) {
                this.f15257b.q("Tag cannot be self closing; not a void tag");
            }
        }
        return hVar2;
    }

    /* access modifiers changed from: package-private */
    public j Q(i.h hVar, boolean z2) {
        j jVar = new j(h.k(hVar.A(), this.h), this.f15260e, hVar.j);
        x0(jVar);
        T(jVar);
        if (z2) {
            this.f15259d.add(jVar);
        }
        return jVar;
    }

    /* access modifiers changed from: package-private */
    public void R(l lVar) {
        h hVar;
        h y2 = y("table");
        boolean z2 = false;
        if (y2 == null) {
            hVar = this.f15259d.get(0);
        } else if (y2.M() != null) {
            hVar = y2.M();
            z2 = true;
        } else {
            hVar = i(y2);
        }
        if (z2) {
            c.i(y2);
            y2.g0(lVar);
            return;
        }
        hVar.d0(lVar);
    }

    /* access modifiers changed from: package-private */
    public void S() {
        this.q.add((Object) null);
    }

    /* access modifiers changed from: package-private */
    public void U(h hVar, h hVar2) {
        int lastIndexOf = this.f15259d.lastIndexOf(hVar);
        c.d(lastIndexOf != -1);
        this.f15259d.add(lastIndexOf + 1, hVar2);
    }

    /* access modifiers changed from: package-private */
    public h V(String str) {
        h hVar = new h(h.k(str, this.h), this.f15260e);
        M(hVar);
        return hVar;
    }

    /* access modifiers changed from: package-private */
    public boolean X() {
        return this.u;
    }

    /* access modifiers changed from: package-private */
    public boolean Y() {
        return this.v;
    }

    /* access modifiers changed from: package-private */
    public boolean Z(h hVar) {
        return W(this.q, hVar);
    }

    /* access modifiers changed from: protected */
    public void b(Reader reader, String str, e eVar, f fVar) {
        super.b(reader, str, eVar, fVar);
        this.k = c.Initial;
        this.l = null;
        this.m = false;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = new ArrayList<>();
        this.r = new ArrayList();
        this.s = new i.g();
        this.t = true;
        this.u = false;
        this.v = false;
    }

    /* access modifiers changed from: package-private */
    public boolean b0(h hVar) {
        return org.jsoup.b.b.c(hVar.C(), D);
    }

    /* access modifiers changed from: package-private */
    public h c0() {
        if (this.q.size() <= 0) {
            return null;
        }
        ArrayList<h> arrayList = this.q;
        return arrayList.get(arrayList.size() - 1);
    }

    /* access modifiers changed from: protected */
    public boolean d(i iVar) {
        this.f15261f = iVar;
        return this.k.r(iVar, this);
    }

    /* access modifiers changed from: package-private */
    public void d0() {
        this.l = this.k;
    }

    /* access modifiers changed from: package-private */
    public void e0(h hVar) {
        if (!this.m) {
            String b2 = hVar.b("href");
            if (b2.length() != 0) {
                this.f15260e = b2;
                this.m = true;
                this.f15258c.V(b2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void f0() {
        this.r = new ArrayList();
    }

    /* access modifiers changed from: package-private */
    public boolean g0(h hVar) {
        return W(this.f15259d, hVar);
    }

    /* access modifiers changed from: package-private */
    public c h0() {
        return this.l;
    }

    /* access modifiers changed from: package-private */
    public h i(h hVar) {
        for (int size = this.f15259d.size() - 1; size >= 0; size--) {
            if (this.f15259d.get(size) == hVar) {
                return this.f15259d.get(size - 1);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public h i0() {
        return this.f15259d.remove(this.f15259d.size() - 1);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000c, LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j() {
        /*
            r1 = this;
        L_0x0000:
            java.util.ArrayList<org.jsoup.d.h> r0 = r1.q
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x000e
            org.jsoup.d.h r0 = r1.s0()
            if (r0 != 0) goto L_0x0000
        L_0x000e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.e.b.j():void");
    }

    /* access modifiers changed from: package-private */
    public void j0(String str) {
        int size = this.f15259d.size() - 1;
        while (size >= 0 && !this.f15259d.get(size).C().equals(str)) {
            this.f15259d.remove(size);
            size--;
        }
    }

    /* access modifiers changed from: package-private */
    public void k0(String str) {
        int size = this.f15259d.size() - 1;
        while (size >= 0) {
            this.f15259d.remove(size);
            if (!this.f15259d.get(size).C().equals(str)) {
                size--;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void l() {
        k("tbody", "tfoot", "thead", "template");
    }

    /* access modifiers changed from: package-private */
    public void l0(String... strArr) {
        int size = this.f15259d.size() - 1;
        while (size >= 0) {
            this.f15259d.remove(size);
            if (!org.jsoup.b.b.c(this.f15259d.get(size).C(), strArr)) {
                size--;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void m() {
        k("table");
    }

    /* access modifiers changed from: package-private */
    public boolean m0(i iVar, c cVar) {
        this.f15261f = iVar;
        return cVar.r(iVar, this);
    }

    /* access modifiers changed from: package-private */
    public void n() {
        k("tr", "template");
    }

    /* access modifiers changed from: package-private */
    public void n0(h hVar) {
        this.f15259d.add(hVar);
    }

    /* access modifiers changed from: package-private */
    public f o() {
        return f.f15217c;
    }

    /* access modifiers changed from: package-private */
    public void o0(h hVar) {
        int size = this.q.size() - 1;
        int i = 0;
        while (true) {
            if (size >= 0) {
                h hVar2 = this.q.get(size);
                if (hVar2 == null) {
                    break;
                }
                if (a0(hVar, hVar2)) {
                    i++;
                }
                if (i == 3) {
                    this.q.remove(size);
                    break;
                }
                size--;
            } else {
                break;
            }
        }
        this.q.add(hVar);
    }

    /* access modifiers changed from: package-private */
    public void p(c cVar) {
        if (this.g.c()) {
            this.g.add(new d(this.f15256a.F(), "Unexpected token [%s] when in state [%s]", this.f15261f.o(), cVar));
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    void p0() {
        /*
            r7 = this;
            org.jsoup.d.h r0 = r7.c0()
            if (r0 == 0) goto L_0x0056
            boolean r1 = r7.g0(r0)
            if (r1 == 0) goto L_0x000d
            goto L_0x0056
        L_0x000d:
            java.util.ArrayList<org.jsoup.d.h> r1 = r7.q
            int r1 = r1.size()
            r2 = 1
            int r1 = r1 - r2
            r3 = r1
        L_0x0016:
            r4 = 0
            if (r3 != 0) goto L_0x001a
            goto L_0x002d
        L_0x001a:
            java.util.ArrayList<org.jsoup.d.h> r0 = r7.q
            int r3 = r3 + -1
            java.lang.Object r0 = r0.get(r3)
            org.jsoup.d.h r0 = (org.jsoup.d.h) r0
            if (r0 == 0) goto L_0x002c
            boolean r5 = r7.g0(r0)
            if (r5 == 0) goto L_0x0016
        L_0x002c:
            r2 = 0
        L_0x002d:
            if (r2 != 0) goto L_0x0039
            java.util.ArrayList<org.jsoup.d.h> r0 = r7.q
            int r3 = r3 + 1
            java.lang.Object r0 = r0.get(r3)
            org.jsoup.d.h r0 = (org.jsoup.d.h) r0
        L_0x0039:
            org.jsoup.b.c.i(r0)
            java.lang.String r2 = r0.C()
            org.jsoup.d.h r2 = r7.V(r2)
            org.jsoup.d.b r5 = r2.f()
            org.jsoup.d.b r6 = r0.f()
            r5.l(r6)
            java.util.ArrayList<org.jsoup.d.h> r5 = r7.q
            r5.set(r3, r2)
            if (r3 != r1) goto L_0x002c
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.e.b.p0():void");
    }

    /* access modifiers changed from: package-private */
    public void q(boolean z2) {
        this.t = z2;
    }

    /* access modifiers changed from: package-private */
    public void q0(h hVar) {
        for (int size = this.q.size() - 1; size >= 0; size--) {
            if (this.q.get(size) == hVar) {
                this.q.remove(size);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean r() {
        return this.t;
    }

    /* access modifiers changed from: package-private */
    public boolean r0(h hVar) {
        for (int size = this.f15259d.size() - 1; size >= 0; size--) {
            if (this.f15259d.get(size) == hVar) {
                this.f15259d.remove(size);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void s() {
        t((String) null);
    }

    /* access modifiers changed from: package-private */
    public h s0() {
        int size = this.q.size();
        if (size > 0) {
            return this.q.remove(size - 1);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void t(String str) {
        while (str != null && !a().C().equals(str) && org.jsoup.b.b.c(a().C(), C)) {
            i0();
        }
    }

    /* access modifiers changed from: package-private */
    public void t0(h hVar, h hVar2) {
        u0(this.q, hVar, hVar2);
    }

    public String toString() {
        return "TreeBuilder{currentToken=" + this.f15261f + ", state=" + this.k + ", currentElement=" + a() + '}';
    }

    /* access modifiers changed from: package-private */
    public h u(String str) {
        for (int size = this.q.size() - 1; size >= 0; size--) {
            h hVar = this.q.get(size);
            if (hVar == null) {
                return null;
            }
            if (hVar.C().equals(str)) {
                return hVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public String v() {
        return this.f15260e;
    }

    /* access modifiers changed from: package-private */
    public void v0(h hVar, h hVar2) {
        u0(this.f15259d, hVar, hVar2);
    }

    /* access modifiers changed from: package-private */
    public f w() {
        return this.f15258c;
    }

    /* access modifiers changed from: package-private */
    public void w0() {
        int size = this.f15259d.size() - 1;
        boolean z2 = false;
        while (size >= 0) {
            h hVar = this.f15259d.get(size);
            if (size == 0) {
                hVar = this.p;
                z2 = true;
            }
            String C2 = hVar.C();
            if ("select".equals(C2)) {
                B0(c.InSelect);
                return;
            } else if ("td".equals(C2) || ("th".equals(C2) && !z2)) {
                B0(c.InCell);
                return;
            } else if ("tr".equals(C2)) {
                B0(c.InRow);
                return;
            } else if ("tbody".equals(C2) || "thead".equals(C2) || "tfoot".equals(C2)) {
                B0(c.InTableBody);
                return;
            } else if ("caption".equals(C2)) {
                B0(c.InCaption);
                return;
            } else if ("colgroup".equals(C2)) {
                B0(c.InColumnGroup);
                return;
            } else if ("table".equals(C2)) {
                B0(c.InTable);
                return;
            } else if ("head".equals(C2)) {
                B0(c.InBody);
                return;
            } else if ("body".equals(C2)) {
                B0(c.InBody);
                return;
            } else if ("frameset".equals(C2)) {
                B0(c.InFrameset);
                return;
            } else if ("html".equals(C2)) {
                B0(c.BeforeHead);
                return;
            } else if (z2) {
                B0(c.InBody);
                return;
            } else {
                size--;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public j x() {
        return this.o;
    }

    /* access modifiers changed from: package-private */
    public void x0(j jVar) {
        this.o = jVar;
    }

    /* access modifiers changed from: package-private */
    public h y(String str) {
        for (int size = this.f15259d.size() - 1; size >= 0; size--) {
            h hVar = this.f15259d.get(size);
            if (hVar.C().equals(str)) {
                return hVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void y0(boolean z2) {
        this.u = z2;
    }

    /* access modifiers changed from: package-private */
    public h z() {
        return this.n;
    }

    /* access modifiers changed from: package-private */
    public void z0(h hVar) {
        this.n = hVar;
    }
}
