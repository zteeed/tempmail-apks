package org.jsoup.e;

import java.util.ArrayList;
import java.util.Iterator;
import org.jsoup.d.f;
import org.jsoup.e.i;

/* compiled from: HtmlTreeBuilderState */
enum c {
    Initial {
        /* access modifiers changed from: package-private */
        public boolean r(i iVar, b bVar) {
            if (c.q(iVar)) {
                return true;
            }
            if (iVar.h()) {
                bVar.O(iVar.b());
            } else if (iVar.i()) {
                i.e c2 = iVar.c();
                org.jsoup.d.g gVar = new org.jsoup.d.g(bVar.h.b(c2.p()), c2.r(), c2.s());
                gVar.e0(c2.q());
                bVar.w().d0(gVar);
                if (c2.t()) {
                    bVar.w().u0(f.b.quirks);
                }
                bVar.B0(c.BeforeHtml);
            } else {
                bVar.B0(c.BeforeHtml);
                return bVar.d(iVar);
            }
            return true;
        }
    },
    BeforeHtml {
        private boolean t(i iVar, b bVar) {
            bVar.V("html");
            bVar.B0(c.BeforeHead);
            return bVar.d(iVar);
        }

        /* access modifiers changed from: package-private */
        public boolean r(i iVar, b bVar) {
            if (iVar.i()) {
                bVar.p(this);
                return false;
            }
            if (iVar.h()) {
                bVar.O(iVar.b());
            } else if (c.q(iVar)) {
                return true;
            } else {
                if (iVar.l() && iVar.e().D().equals("html")) {
                    bVar.L(iVar.e());
                    bVar.B0(c.BeforeHead);
                } else if (iVar.k() && org.jsoup.b.b.b(iVar.d().D(), "head", "body", "html", "br")) {
                    return t(iVar, bVar);
                } else {
                    if (!iVar.k()) {
                        return t(iVar, bVar);
                    }
                    bVar.p(this);
                    return false;
                }
            }
            return true;
        }
    },
    BeforeHead {
        /* access modifiers changed from: package-private */
        public boolean r(i iVar, b bVar) {
            if (c.q(iVar)) {
                return true;
            }
            if (iVar.h()) {
                bVar.O(iVar.b());
            } else if (iVar.i()) {
                bVar.p(this);
                return false;
            } else if (iVar.l() && iVar.e().D().equals("html")) {
                return c.InBody.r(iVar, bVar);
            } else {
                if (iVar.l() && iVar.e().D().equals("head")) {
                    bVar.z0(bVar.L(iVar.e()));
                    bVar.B0(c.InHead);
                } else if (iVar.k() && org.jsoup.b.b.b(iVar.d().D(), "head", "body", "html", "br")) {
                    bVar.f("head");
                    return bVar.d(iVar);
                } else if (iVar.k()) {
                    bVar.p(this);
                    return false;
                } else {
                    bVar.f("head");
                    return bVar.d(iVar);
                }
            }
            return true;
        }
    },
    InHead {
        private boolean t(i iVar, l lVar) {
            lVar.e("head");
            return lVar.d(iVar);
        }

        /* access modifiers changed from: package-private */
        public boolean r(i iVar, b bVar) {
            if (c.q(iVar)) {
                bVar.N(iVar.a());
                return true;
            }
            int i = p.f15207a[iVar.f15227a.ordinal()];
            if (i == 1) {
                bVar.O(iVar.b());
            } else if (i == 2) {
                bVar.p(this);
                return false;
            } else if (i == 3) {
                i.h e2 = iVar.e();
                String D = e2.D();
                if (D.equals("html")) {
                    return c.InBody.r(iVar, bVar);
                }
                if (org.jsoup.b.b.b(D, "base", "basefont", "bgsound", "command", "link")) {
                    org.jsoup.d.h P = bVar.P(e2);
                    if (D.equals("base") && P.t("href")) {
                        bVar.e0(P);
                    }
                } else if (D.equals("meta")) {
                    bVar.P(e2);
                } else if (D.equals("title")) {
                    c.o(e2, bVar);
                } else if (org.jsoup.b.b.b(D, "noframes", "style")) {
                    c.n(e2, bVar);
                } else if (D.equals("noscript")) {
                    bVar.L(e2);
                    bVar.B0(c.InHeadNoscript);
                } else if (D.equals("script")) {
                    bVar.f15257b.u(k.ScriptData);
                    bVar.d0();
                    bVar.B0(c.Text);
                    bVar.L(e2);
                } else if (!D.equals("head")) {
                    return t(iVar, bVar);
                } else {
                    bVar.p(this);
                    return false;
                }
            } else if (i != 4) {
                return t(iVar, bVar);
            } else {
                String D2 = iVar.d().D();
                if (D2.equals("head")) {
                    bVar.i0();
                    bVar.B0(c.AfterHead);
                } else if (org.jsoup.b.b.b(D2, "body", "html", "br")) {
                    return t(iVar, bVar);
                } else {
                    bVar.p(this);
                    return false;
                }
            }
            return true;
        }
    },
    InHeadNoscript {
        private boolean t(i iVar, b bVar) {
            bVar.p(this);
            i.c cVar = new i.c();
            cVar.p(iVar.toString());
            bVar.N(cVar);
            return true;
        }

        /* access modifiers changed from: package-private */
        public boolean r(i iVar, b bVar) {
            if (iVar.i()) {
                bVar.p(this);
                return true;
            } else if (iVar.l() && iVar.e().D().equals("html")) {
                return bVar.m0(iVar, c.InBody);
            } else {
                if (iVar.k() && iVar.d().D().equals("noscript")) {
                    bVar.i0();
                    bVar.B0(c.InHead);
                    return true;
                } else if (c.q(iVar) || iVar.h() || (iVar.l() && org.jsoup.b.b.b(iVar.e().D(), "basefont", "bgsound", "link", "meta", "noframes", "style"))) {
                    return bVar.m0(iVar, c.InHead);
                } else {
                    if (iVar.k() && iVar.d().D().equals("br")) {
                        return t(iVar, bVar);
                    }
                    if ((!iVar.l() || !org.jsoup.b.b.b(iVar.e().D(), "head", "noscript")) && !iVar.k()) {
                        return t(iVar, bVar);
                    }
                    bVar.p(this);
                    return false;
                }
            }
        }
    },
    AfterHead {
        private boolean t(i iVar, b bVar) {
            bVar.f("body");
            bVar.q(true);
            return bVar.d(iVar);
        }

        /* access modifiers changed from: package-private */
        public boolean r(i iVar, b bVar) {
            i iVar2 = iVar;
            b bVar2 = bVar;
            if (c.q(iVar)) {
                bVar2.N(iVar.a());
                return true;
            } else if (iVar.h()) {
                bVar2.O(iVar.b());
                return true;
            } else if (iVar.i()) {
                bVar2.p(this);
                return true;
            } else if (iVar.l()) {
                i.h e2 = iVar.e();
                String D = e2.D();
                if (D.equals("html")) {
                    return bVar2.m0(iVar2, c.InBody);
                }
                if (D.equals("body")) {
                    bVar2.L(e2);
                    bVar2.q(false);
                    bVar2.B0(c.InBody);
                    return true;
                } else if (D.equals("frameset")) {
                    bVar2.L(e2);
                    bVar2.B0(c.InFrameset);
                    return true;
                } else if (org.jsoup.b.b.b(D, "base", "basefont", "bgsound", "link", "meta", "noframes", "script", "style", "title")) {
                    bVar2.p(this);
                    org.jsoup.d.h z = bVar.z();
                    bVar2.n0(z);
                    bVar2.m0(iVar2, c.InHead);
                    bVar2.r0(z);
                    return true;
                } else if (D.equals("head")) {
                    bVar2.p(this);
                    return false;
                } else {
                    t(iVar, bVar);
                    return true;
                }
            } else if (!iVar.k()) {
                t(iVar, bVar);
                return true;
            } else if (org.jsoup.b.b.b(iVar.d().D(), "body", "html")) {
                t(iVar, bVar);
                return true;
            } else {
                bVar2.p(this);
                return false;
            }
        }
    },
    InBody {
        /* access modifiers changed from: package-private */
        public boolean r(i iVar, b bVar) {
            org.jsoup.d.h hVar;
            i iVar2 = iVar;
            b bVar2 = bVar;
            int i = p.f15207a[iVar2.f15227a.ordinal()];
            boolean z = true;
            if (i == 1) {
                bVar2.O(iVar.b());
            } else if (i == 2) {
                bVar2.p(this);
                return false;
            } else if (i == 3) {
                i.h e2 = iVar.e();
                String D = e2.D();
                if (D.equals("a")) {
                    if (bVar2.u("a") != null) {
                        bVar2.p(this);
                        bVar2.e("a");
                        org.jsoup.d.h y = bVar2.y("a");
                        if (y != null) {
                            bVar2.q0(y);
                            bVar2.r0(y);
                        }
                    }
                    bVar.p0();
                    bVar2.o0(bVar2.L(e2));
                } else if (org.jsoup.b.b.c(D, y.i)) {
                    bVar.p0();
                    bVar2.P(e2);
                    bVar2.q(false);
                } else if (org.jsoup.b.b.c(D, y.f15209b)) {
                    if (bVar2.C(com.tempmail.t.p.g)) {
                        bVar2.e(com.tempmail.t.p.g);
                    }
                    bVar2.L(e2);
                } else if (D.equals("span")) {
                    bVar.p0();
                    bVar2.L(e2);
                } else if (D.equals("li")) {
                    bVar2.q(false);
                    ArrayList<org.jsoup.d.h> B = bVar.B();
                    int size = B.size() - 1;
                    while (true) {
                        if (size <= 0) {
                            break;
                        }
                        org.jsoup.d.h hVar2 = B.get(size);
                        if (!hVar2.C().equals("li")) {
                            if (bVar2.b0(hVar2) && !org.jsoup.b.b.c(hVar2.C(), y.f15212e)) {
                                break;
                            }
                            size--;
                        } else {
                            bVar2.e("li");
                            break;
                        }
                    }
                    if (bVar2.C(com.tempmail.t.p.g)) {
                        bVar2.e(com.tempmail.t.p.g);
                    }
                    bVar2.L(e2);
                } else if (D.equals("html")) {
                    bVar2.p(this);
                    org.jsoup.d.h hVar3 = bVar.B().get(0);
                    Iterator<org.jsoup.d.a> it = e2.y().iterator();
                    while (it.hasNext()) {
                        org.jsoup.d.a next = it.next();
                        if (!hVar3.t(next.getKey())) {
                            hVar3.f().Z(next);
                        }
                    }
                } else if (org.jsoup.b.b.c(D, y.f15208a)) {
                    return bVar2.m0(iVar2, c.InHead);
                } else {
                    if (D.equals("body")) {
                        bVar2.p(this);
                        ArrayList<org.jsoup.d.h> B2 = bVar.B();
                        if (B2.size() == 1 || (B2.size() > 2 && !B2.get(1).C().equals("body"))) {
                            return false;
                        }
                        bVar2.q(false);
                        org.jsoup.d.h hVar4 = B2.get(1);
                        Iterator<org.jsoup.d.a> it2 = e2.y().iterator();
                        while (it2.hasNext()) {
                            org.jsoup.d.a next2 = it2.next();
                            if (!hVar4.t(next2.getKey())) {
                                hVar4.f().Z(next2);
                            }
                        }
                    } else if (D.equals("frameset")) {
                        bVar2.p(this);
                        ArrayList<org.jsoup.d.h> B3 = bVar.B();
                        if (B3.size() == 1 || ((B3.size() > 2 && !B3.get(1).C().equals("body")) || !bVar.r())) {
                            return false;
                        }
                        org.jsoup.d.h hVar5 = B3.get(1);
                        if (hVar5.M() != null) {
                            hVar5.R();
                        }
                        for (int i2 = 1; B3.size() > i2; i2 = 1) {
                            B3.remove(B3.size() - i2);
                        }
                        bVar2.L(e2);
                        bVar2.B0(c.InFrameset);
                    } else if (org.jsoup.b.b.c(D, y.f15210c)) {
                        if (bVar2.C(com.tempmail.t.p.g)) {
                            bVar2.e(com.tempmail.t.p.g);
                        }
                        if (org.jsoup.b.b.c(bVar.a().C(), y.f15210c)) {
                            bVar2.p(this);
                            bVar.i0();
                        }
                        bVar2.L(e2);
                    } else if (org.jsoup.b.b.c(D, y.f15211d)) {
                        if (bVar2.C(com.tempmail.t.p.g)) {
                            bVar2.e(com.tempmail.t.p.g);
                        }
                        bVar2.L(e2);
                        bVar2.f15256a.u("\n");
                        bVar2.q(false);
                    } else if (D.equals("form")) {
                        if (bVar.x() != null) {
                            bVar2.p(this);
                            return false;
                        }
                        if (bVar2.C(com.tempmail.t.p.g)) {
                            bVar2.e(com.tempmail.t.p.g);
                        }
                        bVar2.Q(e2, true);
                        return true;
                    } else if (org.jsoup.b.b.c(D, y.f15213f)) {
                        bVar2.q(false);
                        ArrayList<org.jsoup.d.h> B4 = bVar.B();
                        int size2 = B4.size() - 1;
                        while (true) {
                            if (size2 <= 0) {
                                break;
                            }
                            org.jsoup.d.h hVar6 = B4.get(size2);
                            if (!org.jsoup.b.b.c(hVar6.C(), y.f15213f)) {
                                if (bVar2.b0(hVar6) && !org.jsoup.b.b.c(hVar6.C(), y.f15212e)) {
                                    break;
                                }
                                size2--;
                            } else {
                                bVar2.e(hVar6.C());
                                break;
                            }
                        }
                        if (bVar2.C(com.tempmail.t.p.g)) {
                            bVar2.e(com.tempmail.t.p.g);
                        }
                        bVar2.L(e2);
                    } else if (D.equals("plaintext")) {
                        if (bVar2.C(com.tempmail.t.p.g)) {
                            bVar2.e(com.tempmail.t.p.g);
                        }
                        bVar2.L(e2);
                        bVar2.f15257b.u(k.PLAINTEXT);
                    } else if (D.equals("button")) {
                        if (bVar2.C("button")) {
                            bVar2.p(this);
                            bVar2.e("button");
                            bVar2.d(e2);
                        } else {
                            bVar.p0();
                            bVar2.L(e2);
                            bVar2.q(false);
                        }
                    } else if (org.jsoup.b.b.c(D, y.g)) {
                        bVar.p0();
                        bVar2.o0(bVar2.L(e2));
                    } else if (D.equals("nobr")) {
                        bVar.p0();
                        if (bVar2.E("nobr")) {
                            bVar2.p(this);
                            bVar2.e("nobr");
                            bVar.p0();
                        }
                        bVar2.o0(bVar2.L(e2));
                    } else if (org.jsoup.b.b.c(D, y.h)) {
                        bVar.p0();
                        bVar2.L(e2);
                        bVar.S();
                        bVar2.q(false);
                    } else if (D.equals("table")) {
                        if (bVar.w().t0() != f.b.quirks && bVar2.C(com.tempmail.t.p.g)) {
                            bVar2.e(com.tempmail.t.p.g);
                        }
                        bVar2.L(e2);
                        bVar2.q(false);
                        bVar2.B0(c.InTable);
                    } else if (D.equals("input")) {
                        bVar.p0();
                        if (!bVar2.P(e2).d("type").equalsIgnoreCase("hidden")) {
                            bVar2.q(false);
                        }
                    } else if (org.jsoup.b.b.c(D, y.j)) {
                        bVar2.P(e2);
                    } else if (D.equals("hr")) {
                        if (bVar2.C(com.tempmail.t.p.g)) {
                            bVar2.e(com.tempmail.t.p.g);
                        }
                        bVar2.P(e2);
                        bVar2.q(false);
                    } else if (D.equals("image")) {
                        if (bVar2.y("svg") == null) {
                            e2.B("img");
                            return bVar2.d(e2);
                        }
                        bVar2.L(e2);
                    } else if (D.equals("isindex")) {
                        bVar2.p(this);
                        if (bVar.x() != null) {
                            return false;
                        }
                        bVar2.f("form");
                        if (e2.j.M("action")) {
                            bVar.x().f0("action", e2.j.C("action"));
                        }
                        bVar2.f("hr");
                        bVar2.f("label");
                        String C = e2.j.M("prompt") ? e2.j.C("prompt") : "This is a searchable index. Enter search keywords: ";
                        i.c cVar = new i.c();
                        cVar.p(C);
                        bVar2.d(cVar);
                        org.jsoup.d.b bVar3 = new org.jsoup.d.b();
                        Iterator<org.jsoup.d.a> it3 = e2.j.iterator();
                        while (it3.hasNext()) {
                            org.jsoup.d.a next3 = it3.next();
                            if (!org.jsoup.b.b.c(next3.getKey(), y.k)) {
                                bVar3.Z(next3);
                            }
                        }
                        bVar3.Y("name", "isindex");
                        bVar2.g("input", bVar3);
                        bVar2.e("label");
                        bVar2.f("hr");
                        bVar2.e("form");
                    } else if (D.equals("textarea")) {
                        bVar2.L(e2);
                        bVar2.f15257b.u(k.Rcdata);
                        bVar.d0();
                        bVar2.q(false);
                        bVar2.B0(c.Text);
                    } else if (D.equals("xmp")) {
                        if (bVar2.C(com.tempmail.t.p.g)) {
                            bVar2.e(com.tempmail.t.p.g);
                        }
                        bVar.p0();
                        bVar2.q(false);
                        c.n(e2, bVar2);
                    } else if (D.equals("iframe")) {
                        bVar2.q(false);
                        c.n(e2, bVar2);
                    } else if (D.equals("noembed")) {
                        c.n(e2, bVar2);
                    } else if (D.equals("select")) {
                        bVar.p0();
                        bVar2.L(e2);
                        bVar2.q(false);
                        c A0 = bVar.A0();
                        if (A0.equals(c.InTable) || A0.equals(c.InCaption) || A0.equals(c.InTableBody) || A0.equals(c.InRow) || A0.equals(c.InCell)) {
                            bVar2.B0(c.InSelectInTable);
                        } else {
                            bVar2.B0(c.InSelect);
                        }
                    } else if (org.jsoup.b.b.c(D, y.l)) {
                        if (bVar.a().C().equals("option")) {
                            bVar2.e("option");
                        }
                        bVar.p0();
                        bVar2.L(e2);
                    } else if (org.jsoup.b.b.c(D, y.m)) {
                        if (bVar2.E("ruby")) {
                            bVar.s();
                            if (!bVar.a().C().equals("ruby")) {
                                bVar2.p(this);
                                bVar2.j0("ruby");
                            }
                            bVar2.L(e2);
                        }
                    } else if (D.equals("math")) {
                        bVar.p0();
                        bVar2.L(e2);
                    } else if (D.equals("svg")) {
                        bVar.p0();
                        bVar2.L(e2);
                    } else if (org.jsoup.b.b.c(D, y.n)) {
                        bVar2.p(this);
                        return false;
                    } else {
                        bVar.p0();
                        bVar2.L(e2);
                    }
                }
            } else if (i == 4) {
                i.g d2 = iVar.d();
                String D2 = d2.D();
                if (org.jsoup.b.b.c(D2, y.p)) {
                    int i3 = 0;
                    while (i3 < 8) {
                        org.jsoup.d.h u = bVar2.u(D2);
                        if (u == null) {
                            return t(iVar, bVar);
                        }
                        if (!bVar2.g0(u)) {
                            bVar2.p(this);
                            bVar2.q0(u);
                            return z;
                        } else if (!bVar2.E(u.C())) {
                            bVar2.p(this);
                            return false;
                        } else {
                            if (bVar.a() != u) {
                                bVar2.p(this);
                            }
                            ArrayList<org.jsoup.d.h> B5 = bVar.B();
                            int size3 = B5.size();
                            org.jsoup.d.h hVar7 = null;
                            int i4 = 0;
                            boolean z2 = false;
                            while (true) {
                                if (i4 >= size3 || i4 >= 64) {
                                    hVar = null;
                                } else {
                                    hVar = B5.get(i4);
                                    if (hVar != u) {
                                        if (z2 && bVar2.b0(hVar)) {
                                            break;
                                        }
                                    } else {
                                        hVar7 = B5.get(i4 - 1);
                                        z2 = true;
                                    }
                                    i4++;
                                }
                            }
                            hVar = null;
                            if (hVar == null) {
                                bVar2.k0(u.C());
                                bVar2.q0(u);
                                return z;
                            }
                            org.jsoup.d.h hVar8 = hVar;
                            org.jsoup.d.h hVar9 = hVar8;
                            for (int i5 = 0; i5 < 3; i5++) {
                                if (bVar2.g0(hVar8)) {
                                    hVar8 = bVar2.i(hVar8);
                                }
                                if (!bVar2.Z(hVar8)) {
                                    bVar2.r0(hVar8);
                                } else if (hVar8 == u) {
                                    break;
                                } else {
                                    org.jsoup.d.h hVar10 = new org.jsoup.d.h(h.k(hVar8.C(), f.f15218d), bVar.v());
                                    bVar2.t0(hVar8, hVar10);
                                    bVar2.v0(hVar8, hVar10);
                                    if (hVar9.M() != null) {
                                        hVar9.R();
                                    }
                                    hVar10.d0(hVar9);
                                    hVar8 = hVar10;
                                    hVar9 = hVar8;
                                }
                            }
                            if (org.jsoup.b.b.c(hVar7.C(), y.q)) {
                                if (hVar9.M() != null) {
                                    hVar9.R();
                                }
                                bVar2.R(hVar9);
                            } else {
                                if (hVar9.M() != null) {
                                    hVar9.R();
                                }
                                hVar7.d0(hVar9);
                            }
                            org.jsoup.d.h hVar11 = new org.jsoup.d.h(u.o0(), bVar.v());
                            hVar11.f().l(u.f());
                            for (org.jsoup.d.l d0 : (org.jsoup.d.l[]) hVar.l().toArray(new org.jsoup.d.l[hVar.k()])) {
                                hVar11.d0(d0);
                            }
                            hVar.d0(hVar11);
                            bVar2.q0(u);
                            bVar2.r0(u);
                            bVar2.U(hVar, hVar11);
                            i3++;
                            z = true;
                        }
                    }
                } else if (org.jsoup.b.b.c(D2, y.o)) {
                    if (!bVar2.E(D2)) {
                        bVar2.p(this);
                        return false;
                    }
                    bVar.s();
                    if (!bVar.a().C().equals(D2)) {
                        bVar2.p(this);
                    }
                    bVar2.k0(D2);
                } else if (D2.equals("span")) {
                    return t(iVar, bVar);
                } else {
                    if (D2.equals("li")) {
                        if (!bVar2.D(D2)) {
                            bVar2.p(this);
                            return false;
                        }
                        bVar2.t(D2);
                        if (!bVar.a().C().equals(D2)) {
                            bVar2.p(this);
                        }
                        bVar2.k0(D2);
                    } else if (D2.equals("body")) {
                        if (!bVar2.E("body")) {
                            bVar2.p(this);
                            return false;
                        }
                        bVar2.B0(c.AfterBody);
                    } else if (D2.equals("html")) {
                        if (bVar2.e("body")) {
                            return bVar2.d(d2);
                        }
                    } else if (D2.equals("form")) {
                        org.jsoup.d.j x = bVar.x();
                        bVar2.x0((org.jsoup.d.j) null);
                        if (x == null || !bVar2.E(D2)) {
                            bVar2.p(this);
                            return false;
                        }
                        bVar.s();
                        if (!bVar.a().C().equals(D2)) {
                            bVar2.p(this);
                        }
                        bVar2.r0(x);
                    } else if (D2.equals(com.tempmail.t.p.g)) {
                        if (!bVar2.C(D2)) {
                            bVar2.p(this);
                            bVar2.f(D2);
                            return bVar2.d(d2);
                        }
                        bVar2.t(D2);
                        if (!bVar.a().C().equals(D2)) {
                            bVar2.p(this);
                        }
                        bVar2.k0(D2);
                    } else if (org.jsoup.b.b.c(D2, y.f15213f)) {
                        if (!bVar2.E(D2)) {
                            bVar2.p(this);
                            return false;
                        }
                        bVar2.t(D2);
                        if (!bVar.a().C().equals(D2)) {
                            bVar2.p(this);
                        }
                        bVar2.k0(D2);
                    } else if (org.jsoup.b.b.c(D2, y.f15210c)) {
                        if (!bVar2.G(y.f15210c)) {
                            bVar2.p(this);
                            return false;
                        }
                        bVar2.t(D2);
                        if (!bVar.a().C().equals(D2)) {
                            bVar2.p(this);
                        }
                        bVar2.l0(y.f15210c);
                    } else if (D2.equals("sarcasm")) {
                        return t(iVar, bVar);
                    } else {
                        if (org.jsoup.b.b.c(D2, y.h)) {
                            if (!bVar2.E("name")) {
                                if (!bVar2.E(D2)) {
                                    bVar2.p(this);
                                    return false;
                                }
                                bVar.s();
                                if (!bVar.a().C().equals(D2)) {
                                    bVar2.p(this);
                                }
                                bVar2.k0(D2);
                                bVar.j();
                            }
                        } else if (!D2.equals("br")) {
                            return t(iVar, bVar);
                        } else {
                            bVar2.p(this);
                            bVar2.f("br");
                            return false;
                        }
                    }
                }
            } else if (i == 5) {
                i.c a2 = iVar.a();
                if (a2.q().equals(c.y)) {
                    bVar2.p(this);
                    return false;
                } else if (!bVar.r() || !c.q(a2)) {
                    bVar.p0();
                    bVar2.N(a2);
                    bVar2.q(false);
                } else {
                    bVar.p0();
                    bVar2.N(a2);
                }
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public boolean t(i iVar, b bVar) {
            String b2 = bVar.h.b(iVar.d().A());
            ArrayList<org.jsoup.d.h> B = bVar.B();
            int size = B.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                org.jsoup.d.h hVar = B.get(size);
                if (hVar.C().equals(b2)) {
                    bVar.t(b2);
                    if (!b2.equals(bVar.a().C())) {
                        bVar.p(this);
                    }
                    bVar.k0(b2);
                } else if (bVar.b0(hVar)) {
                    bVar.p(this);
                    return false;
                } else {
                    size--;
                }
            }
            return true;
        }
    },
    Text {
        /* access modifiers changed from: package-private */
        public boolean r(i iVar, b bVar) {
            if (iVar.g()) {
                bVar.N(iVar.a());
                return true;
            } else if (iVar.j()) {
                bVar.p(this);
                bVar.i0();
                bVar.B0(bVar.h0());
                return bVar.d(iVar);
            } else if (!iVar.k()) {
                return true;
            } else {
                bVar.i0();
                bVar.B0(bVar.h0());
                return true;
            }
        }
    },
    InTable {
        /* access modifiers changed from: package-private */
        public boolean r(i iVar, b bVar) {
            i iVar2 = iVar;
            b bVar2 = bVar;
            if (iVar.g()) {
                bVar.f0();
                bVar.d0();
                bVar2.B0(c.InTableText);
                return bVar2.d(iVar2);
            } else if (iVar.h()) {
                bVar2.O(iVar.b());
                return true;
            } else if (iVar.i()) {
                bVar2.p(this);
                return false;
            } else if (iVar.l()) {
                i.h e2 = iVar.e();
                String D = e2.D();
                if (D.equals("caption")) {
                    bVar.m();
                    bVar.S();
                    bVar2.L(e2);
                    bVar2.B0(c.InCaption);
                } else if (D.equals("colgroup")) {
                    bVar.m();
                    bVar2.L(e2);
                    bVar2.B0(c.InColumnGroup);
                } else if (D.equals("col")) {
                    bVar2.f("colgroup");
                    return bVar2.d(iVar2);
                } else if (org.jsoup.b.b.b(D, "tbody", "tfoot", "thead")) {
                    bVar.m();
                    bVar2.L(e2);
                    bVar2.B0(c.InTableBody);
                } else if (org.jsoup.b.b.b(D, "td", "th", "tr")) {
                    bVar2.f("tbody");
                    return bVar2.d(iVar2);
                } else if (D.equals("table")) {
                    bVar2.p(this);
                    if (bVar2.e("table")) {
                        return bVar2.d(iVar2);
                    }
                } else if (org.jsoup.b.b.b(D, "style", "script")) {
                    return bVar2.m0(iVar2, c.InHead);
                } else {
                    if (D.equals("input")) {
                        if (!e2.j.C("type").equalsIgnoreCase("hidden")) {
                            return t(iVar, bVar);
                        }
                        bVar2.P(e2);
                    } else if (!D.equals("form")) {
                        return t(iVar, bVar);
                    } else {
                        bVar2.p(this);
                        if (bVar.x() != null) {
                            return false;
                        }
                        bVar2.Q(e2, false);
                    }
                }
                return true;
            } else if (iVar.k()) {
                String D2 = iVar.d().D();
                if (D2.equals("table")) {
                    if (!bVar2.K(D2)) {
                        bVar2.p(this);
                        return false;
                    }
                    bVar2.k0("table");
                    bVar.w0();
                    return true;
                } else if (!org.jsoup.b.b.b(D2, "body", "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr")) {
                    return t(iVar, bVar);
                } else {
                    bVar2.p(this);
                    return false;
                }
            } else if (!iVar.j()) {
                return t(iVar, bVar);
            } else {
                if (bVar.a().C().equals("html")) {
                    bVar2.p(this);
                }
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean t(i iVar, b bVar) {
            bVar.p(this);
            if (!org.jsoup.b.b.b(bVar.a().C(), "table", "tbody", "tfoot", "thead", "tr")) {
                return bVar.m0(iVar, c.InBody);
            }
            bVar.y0(true);
            boolean m0 = bVar.m0(iVar, c.InBody);
            bVar.y0(false);
            return m0;
        }
    },
    InTableText {
        /* access modifiers changed from: package-private */
        public boolean r(i iVar, b bVar) {
            if (p.f15207a[iVar.f15227a.ordinal()] != 5) {
                if (bVar.A().size() > 0) {
                    for (String next : bVar.A()) {
                        if (!c.p(next)) {
                            bVar.p(this);
                            if (org.jsoup.b.b.b(bVar.a().C(), "table", "tbody", "tfoot", "thead", "tr")) {
                                bVar.y0(true);
                                i.c cVar = new i.c();
                                cVar.p(next);
                                bVar.m0(cVar, c.InBody);
                                bVar.y0(false);
                            } else {
                                i.c cVar2 = new i.c();
                                cVar2.p(next);
                                bVar.m0(cVar2, c.InBody);
                            }
                        } else {
                            i.c cVar3 = new i.c();
                            cVar3.p(next);
                            bVar.N(cVar3);
                        }
                    }
                    bVar.f0();
                }
                bVar.B0(bVar.h0());
                return bVar.d(iVar);
            }
            i.c a2 = iVar.a();
            if (a2.q().equals(c.y)) {
                bVar.p(this);
                return false;
            }
            bVar.A().add(a2.q());
            return true;
        }
    },
    InCaption {
        /* access modifiers changed from: package-private */
        public boolean r(i iVar, b bVar) {
            if (!iVar.k() || !iVar.d().D().equals("caption")) {
                if ((iVar.l() && org.jsoup.b.b.b(iVar.e().D(), "caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr")) || (iVar.k() && iVar.d().D().equals("table"))) {
                    bVar.p(this);
                    if (bVar.e("caption")) {
                        return bVar.d(iVar);
                    }
                    return true;
                } else if (!iVar.k() || !org.jsoup.b.b.b(iVar.d().D(), "body", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr")) {
                    return bVar.m0(iVar, c.InBody);
                } else {
                    bVar.p(this);
                    return false;
                }
            } else if (!bVar.K(iVar.d().D())) {
                bVar.p(this);
                return false;
            } else {
                bVar.s();
                if (!bVar.a().C().equals("caption")) {
                    bVar.p(this);
                }
                bVar.k0("caption");
                bVar.j();
                bVar.B0(c.InTable);
                return true;
            }
        }
    },
    InColumnGroup {
        private boolean t(i iVar, l lVar) {
            if (lVar.e("colgroup")) {
                return lVar.d(iVar);
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x008d, code lost:
            if (r2.equals("html") == false) goto L_0x009a;
         */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00a8  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean r(org.jsoup.e.i r9, org.jsoup.e.b r10) {
            /*
                r8 = this;
                boolean r0 = org.jsoup.e.c.q(r9)
                r1 = 1
                if (r0 == 0) goto L_0x000f
                org.jsoup.e.i$c r9 = r9.a()
                r10.N(r9)
                return r1
            L_0x000f:
                int[] r0 = org.jsoup.e.c.p.f15207a
                org.jsoup.e.i$j r2 = r9.f15227a
                int r2 = r2.ordinal()
                r0 = r0[r2]
                if (r0 == r1) goto L_0x00b3
                r2 = 2
                if (r0 == r2) goto L_0x00af
                r2 = 3
                r3 = 0
                java.lang.String r4 = "html"
                if (r0 == r2) goto L_0x0071
                r2 = 4
                if (r0 == r2) goto L_0x0043
                r2 = 6
                if (r0 == r2) goto L_0x002f
                boolean r9 = r8.t(r9, r10)
                return r9
            L_0x002f:
                org.jsoup.d.h r0 = r10.a()
                java.lang.String r0 = r0.C()
                boolean r0 = r0.equals(r4)
                if (r0 == 0) goto L_0x003e
                return r1
            L_0x003e:
                boolean r9 = r8.t(r9, r10)
                return r9
            L_0x0043:
                org.jsoup.e.i$g r0 = r9.d()
                java.lang.String r0 = r0.f15236c
                java.lang.String r2 = "colgroup"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x006c
                org.jsoup.d.h r9 = r10.a()
                java.lang.String r9 = r9.C()
                boolean r9 = r9.equals(r4)
                if (r9 == 0) goto L_0x0063
                r10.p(r8)
                return r3
            L_0x0063:
                r10.i0()
                org.jsoup.e.c r9 = org.jsoup.e.c.InTable
                r10.B0(r9)
                goto L_0x00ba
            L_0x006c:
                boolean r9 = r8.t(r9, r10)
                return r9
            L_0x0071:
                org.jsoup.e.i$h r0 = r9.e()
                java.lang.String r2 = r0.D()
                r5 = -1
                int r6 = r2.hashCode()
                r7 = 98688(0x18180, float:1.38291E-40)
                if (r6 == r7) goto L_0x0090
                r7 = 3213227(0x3107ab, float:4.50269E-39)
                if (r6 == r7) goto L_0x0089
                goto L_0x009a
            L_0x0089:
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x009a
                goto L_0x009b
            L_0x0090:
                java.lang.String r3 = "col"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x009a
                r3 = 1
                goto L_0x009b
            L_0x009a:
                r3 = -1
            L_0x009b:
                if (r3 == 0) goto L_0x00a8
                if (r3 == r1) goto L_0x00a4
                boolean r9 = r8.t(r9, r10)
                return r9
            L_0x00a4:
                r10.P(r0)
                goto L_0x00ba
            L_0x00a8:
                org.jsoup.e.c r0 = org.jsoup.e.c.InBody
                boolean r9 = r10.m0(r9, r0)
                return r9
            L_0x00af:
                r10.p(r8)
                goto L_0x00ba
            L_0x00b3:
                org.jsoup.e.i$d r9 = r9.b()
                r10.O(r9)
            L_0x00ba:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.e.c.C0166c.r(org.jsoup.e.i, org.jsoup.e.b):boolean");
        }
    },
    InTableBody {
        private boolean t(i iVar, b bVar) {
            return bVar.m0(iVar, c.InTable);
        }

        private boolean u(i iVar, b bVar) {
            if (bVar.K("tbody") || bVar.K("thead") || bVar.E("tfoot")) {
                bVar.l();
                bVar.e(bVar.a().C());
                return bVar.d(iVar);
            }
            bVar.p(this);
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean r(i iVar, b bVar) {
            int i = p.f15207a[iVar.f15227a.ordinal()];
            if (i == 3) {
                i.h e2 = iVar.e();
                String D = e2.D();
                if (D.equals("template")) {
                    bVar.L(e2);
                    return true;
                } else if (D.equals("tr")) {
                    bVar.l();
                    bVar.L(e2);
                    bVar.B0(c.InRow);
                    return true;
                } else if (org.jsoup.b.b.b(D, "th", "td")) {
                    bVar.p(this);
                    bVar.f("tr");
                    return bVar.d(e2);
                } else if (org.jsoup.b.b.b(D, "caption", "col", "colgroup", "tbody", "tfoot", "thead")) {
                    return u(iVar, bVar);
                } else {
                    return t(iVar, bVar);
                }
            } else if (i != 4) {
                return t(iVar, bVar);
            } else {
                String D2 = iVar.d().D();
                if (org.jsoup.b.b.b(D2, "tbody", "tfoot", "thead")) {
                    if (!bVar.K(D2)) {
                        bVar.p(this);
                        return false;
                    }
                    bVar.l();
                    bVar.i0();
                    bVar.B0(c.InTable);
                    return true;
                } else if (D2.equals("table")) {
                    return u(iVar, bVar);
                } else {
                    if (!org.jsoup.b.b.b(D2, "body", "caption", "col", "colgroup", "html", "td", "th", "tr")) {
                        return t(iVar, bVar);
                    }
                    bVar.p(this);
                    return false;
                }
            }
        }
    },
    InRow {
        private boolean t(i iVar, b bVar) {
            return bVar.m0(iVar, c.InTable);
        }

        private boolean u(i iVar, l lVar) {
            if (lVar.e("tr")) {
                return lVar.d(iVar);
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean r(i iVar, b bVar) {
            if (iVar.l()) {
                i.h e2 = iVar.e();
                String D = e2.D();
                if (D.equals("template")) {
                    bVar.L(e2);
                    return true;
                } else if (org.jsoup.b.b.b(D, "th", "td")) {
                    bVar.n();
                    bVar.L(e2);
                    bVar.B0(c.InCell);
                    bVar.S();
                    return true;
                } else if (org.jsoup.b.b.b(D, "caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr")) {
                    return u(iVar, bVar);
                } else {
                    return t(iVar, bVar);
                }
            } else if (!iVar.k()) {
                return t(iVar, bVar);
            } else {
                String D2 = iVar.d().D();
                if (D2.equals("tr")) {
                    if (!bVar.K(D2)) {
                        bVar.p(this);
                        return false;
                    }
                    bVar.n();
                    bVar.i0();
                    bVar.B0(c.InTableBody);
                    return true;
                } else if (D2.equals("table")) {
                    return u(iVar, bVar);
                } else {
                    if (org.jsoup.b.b.b(D2, "tbody", "tfoot", "thead")) {
                        if (!bVar.K(D2)) {
                            bVar.p(this);
                            return false;
                        }
                        bVar.e("tr");
                        return bVar.d(iVar);
                    } else if (!org.jsoup.b.b.b(D2, "body", "caption", "col", "colgroup", "html", "td", "th")) {
                        return t(iVar, bVar);
                    } else {
                        bVar.p(this);
                        return false;
                    }
                }
            }
        }
    },
    InCell {
        private boolean t(i iVar, b bVar) {
            return bVar.m0(iVar, c.InBody);
        }

        private void u(b bVar) {
            if (bVar.K("td")) {
                bVar.e("td");
            } else {
                bVar.e("th");
            }
        }

        /* access modifiers changed from: package-private */
        public boolean r(i iVar, b bVar) {
            if (iVar.k()) {
                String D = iVar.d().D();
                if (org.jsoup.b.b.b(D, "td", "th")) {
                    if (!bVar.K(D)) {
                        bVar.p(this);
                        bVar.B0(c.InRow);
                        return false;
                    }
                    bVar.s();
                    if (!bVar.a().C().equals(D)) {
                        bVar.p(this);
                    }
                    bVar.k0(D);
                    bVar.j();
                    bVar.B0(c.InRow);
                    return true;
                } else if (org.jsoup.b.b.b(D, "body", "caption", "col", "colgroup", "html")) {
                    bVar.p(this);
                    return false;
                } else if (!org.jsoup.b.b.b(D, "table", "tbody", "tfoot", "thead", "tr")) {
                    return t(iVar, bVar);
                } else {
                    if (!bVar.K(D)) {
                        bVar.p(this);
                        return false;
                    }
                    u(bVar);
                    return bVar.d(iVar);
                }
            } else if (!iVar.l() || !org.jsoup.b.b.b(iVar.e().D(), "caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr")) {
                return t(iVar, bVar);
            } else {
                if (bVar.K("td") || bVar.K("th")) {
                    u(bVar);
                    return bVar.d(iVar);
                }
                bVar.p(this);
                return false;
            }
        }
    },
    InSelect {
        private boolean t(i iVar, b bVar) {
            bVar.p(this);
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean r(i iVar, b bVar) {
            switch (p.f15207a[iVar.f15227a.ordinal()]) {
                case 1:
                    bVar.O(iVar.b());
                    break;
                case 2:
                    bVar.p(this);
                    return false;
                case 3:
                    i.h e2 = iVar.e();
                    String D = e2.D();
                    if (D.equals("html")) {
                        return bVar.m0(e2, c.InBody);
                    }
                    if (D.equals("option")) {
                        if (bVar.a().C().equals("option")) {
                            bVar.e("option");
                        }
                        bVar.L(e2);
                        break;
                    } else if (D.equals("optgroup")) {
                        if (bVar.a().C().equals("option")) {
                            bVar.e("option");
                        } else if (bVar.a().C().equals("optgroup")) {
                            bVar.e("optgroup");
                        }
                        bVar.L(e2);
                        break;
                    } else if (D.equals("select")) {
                        bVar.p(this);
                        return bVar.e("select");
                    } else if (org.jsoup.b.b.b(D, "input", "keygen", "textarea")) {
                        bVar.p(this);
                        if (!bVar.H("select")) {
                            return false;
                        }
                        bVar.e("select");
                        return bVar.d(e2);
                    } else if (D.equals("script")) {
                        return bVar.m0(iVar, c.InHead);
                    } else {
                        return t(iVar, bVar);
                    }
                case 4:
                    String D2 = iVar.d().D();
                    char c2 = 65535;
                    int hashCode = D2.hashCode();
                    if (hashCode != -1010136971) {
                        if (hashCode != -906021636) {
                            if (hashCode == -80773204 && D2.equals("optgroup")) {
                                c2 = 0;
                            }
                        } else if (D2.equals("select")) {
                            c2 = 2;
                        }
                    } else if (D2.equals("option")) {
                        c2 = 1;
                    }
                    if (c2 != 0) {
                        if (c2 == 1) {
                            if (!bVar.a().C().equals("option")) {
                                bVar.p(this);
                                break;
                            } else {
                                bVar.i0();
                                break;
                            }
                        } else if (c2 == 2) {
                            if (bVar.H(D2)) {
                                bVar.k0(D2);
                                bVar.w0();
                                break;
                            } else {
                                bVar.p(this);
                                return false;
                            }
                        } else {
                            return t(iVar, bVar);
                        }
                    } else {
                        if (bVar.a().C().equals("option") && bVar.i(bVar.a()) != null && bVar.i(bVar.a()).C().equals("optgroup")) {
                            bVar.e("option");
                        }
                        if (!bVar.a().C().equals("optgroup")) {
                            bVar.p(this);
                            break;
                        } else {
                            bVar.i0();
                            break;
                        }
                    }
                case 5:
                    i.c a2 = iVar.a();
                    if (!a2.q().equals(c.y)) {
                        bVar.N(a2);
                        break;
                    } else {
                        bVar.p(this);
                        return false;
                    }
                case 6:
                    if (!bVar.a().C().equals("html")) {
                        bVar.p(this);
                        break;
                    }
                    break;
                default:
                    return t(iVar, bVar);
            }
            return true;
        }
    },
    InSelectInTable {
        /* access modifiers changed from: package-private */
        public boolean r(i iVar, b bVar) {
            if (iVar.l() && org.jsoup.b.b.b(iVar.e().D(), "caption", "table", "tbody", "tfoot", "thead", "tr", "td", "th")) {
                bVar.p(this);
                bVar.e("select");
                return bVar.d(iVar);
            } else if (!iVar.k() || !org.jsoup.b.b.b(iVar.d().D(), "caption", "table", "tbody", "tfoot", "thead", "tr", "td", "th")) {
                return bVar.m0(iVar, c.InSelect);
            } else {
                bVar.p(this);
                if (!bVar.K(iVar.d().D())) {
                    return false;
                }
                bVar.e("select");
                return bVar.d(iVar);
            }
        }
    },
    AfterBody {
        /* access modifiers changed from: package-private */
        public boolean r(i iVar, b bVar) {
            if (c.q(iVar)) {
                return bVar.m0(iVar, c.InBody);
            }
            if (iVar.h()) {
                bVar.O(iVar.b());
                return true;
            } else if (iVar.i()) {
                bVar.p(this);
                return false;
            } else if (iVar.l() && iVar.e().D().equals("html")) {
                return bVar.m0(iVar, c.InBody);
            } else {
                if (!iVar.k() || !iVar.d().D().equals("html")) {
                    if (iVar.j()) {
                        return true;
                    }
                    bVar.p(this);
                    bVar.B0(c.InBody);
                    return bVar.d(iVar);
                } else if (bVar.Y()) {
                    bVar.p(this);
                    return false;
                } else {
                    bVar.B0(c.AfterAfterBody);
                    return true;
                }
            }
        }
    },
    InFrameset {
        /* access modifiers changed from: package-private */
        public boolean r(i iVar, b bVar) {
            if (c.q(iVar)) {
                bVar.N(iVar.a());
            } else if (iVar.h()) {
                bVar.O(iVar.b());
            } else if (iVar.i()) {
                bVar.p(this);
                return false;
            } else if (iVar.l()) {
                i.h e2 = iVar.e();
                String D = e2.D();
                char c2 = 65535;
                switch (D.hashCode()) {
                    case -1644953643:
                        if (D.equals("frameset")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 3213227:
                        if (D.equals("html")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 97692013:
                        if (D.equals("frame")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 1192721831:
                        if (D.equals("noframes")) {
                            c2 = 3;
                            break;
                        }
                        break;
                }
                if (c2 == 0) {
                    return bVar.m0(e2, c.InBody);
                }
                if (c2 == 1) {
                    bVar.L(e2);
                } else if (c2 == 2) {
                    bVar.P(e2);
                } else if (c2 == 3) {
                    return bVar.m0(e2, c.InHead);
                } else {
                    bVar.p(this);
                    return false;
                }
            } else if (!iVar.k() || !iVar.d().D().equals("frameset")) {
                if (!iVar.j()) {
                    bVar.p(this);
                    return false;
                } else if (!bVar.a().C().equals("html")) {
                    bVar.p(this);
                }
            } else if (bVar.a().C().equals("html")) {
                bVar.p(this);
                return false;
            } else {
                bVar.i0();
                if (!bVar.Y() && !bVar.a().C().equals("frameset")) {
                    bVar.B0(c.AfterFrameset);
                }
            }
            return true;
        }
    },
    AfterFrameset {
        /* access modifiers changed from: package-private */
        public boolean r(i iVar, b bVar) {
            if (c.q(iVar)) {
                bVar.N(iVar.a());
                return true;
            } else if (iVar.h()) {
                bVar.O(iVar.b());
                return true;
            } else if (iVar.i()) {
                bVar.p(this);
                return false;
            } else if (iVar.l() && iVar.e().D().equals("html")) {
                return bVar.m0(iVar, c.InBody);
            } else {
                if (iVar.k() && iVar.d().D().equals("html")) {
                    bVar.B0(c.AfterAfterFrameset);
                    return true;
                } else if (iVar.l() && iVar.e().D().equals("noframes")) {
                    return bVar.m0(iVar, c.InHead);
                } else {
                    if (iVar.j()) {
                        return true;
                    }
                    bVar.p(this);
                    return false;
                }
            }
        }
    },
    AfterAfterBody {
        /* access modifiers changed from: package-private */
        public boolean r(i iVar, b bVar) {
            if (iVar.h()) {
                bVar.O(iVar.b());
                return true;
            } else if (iVar.i() || c.q(iVar) || (iVar.l() && iVar.e().D().equals("html"))) {
                return bVar.m0(iVar, c.InBody);
            } else {
                if (iVar.j()) {
                    return true;
                }
                bVar.p(this);
                bVar.B0(c.InBody);
                return bVar.d(iVar);
            }
        }
    },
    AfterAfterFrameset {
        /* access modifiers changed from: package-private */
        public boolean r(i iVar, b bVar) {
            if (iVar.h()) {
                bVar.O(iVar.b());
                return true;
            } else if (iVar.i() || c.q(iVar) || (iVar.l() && iVar.e().D().equals("html"))) {
                return bVar.m0(iVar, c.InBody);
            } else {
                if (iVar.j()) {
                    return true;
                }
                if (iVar.l() && iVar.e().D().equals("noframes")) {
                    return bVar.m0(iVar, c.InHead);
                }
                bVar.p(this);
                return false;
            }
        }
    },
    ForeignContent {
        /* access modifiers changed from: package-private */
        public boolean r(i iVar, b bVar) {
            return true;
        }
    };
    
    /* access modifiers changed from: private */
    public static String y;

    /* compiled from: HtmlTreeBuilderState */
    static /* synthetic */ class p {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f15207a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                org.jsoup.e.i$j[] r0 = org.jsoup.e.i.j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15207a = r0
                org.jsoup.e.i$j r1 = org.jsoup.e.i.j.Comment     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15207a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.jsoup.e.i$j r1 = org.jsoup.e.i.j.Doctype     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f15207a     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.jsoup.e.i$j r1 = org.jsoup.e.i.j.StartTag     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f15207a     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.jsoup.e.i$j r1 = org.jsoup.e.i.j.EndTag     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f15207a     // Catch:{ NoSuchFieldError -> 0x003e }
                org.jsoup.e.i$j r1 = org.jsoup.e.i.j.Character     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f15207a     // Catch:{ NoSuchFieldError -> 0x0049 }
                org.jsoup.e.i$j r1 = org.jsoup.e.i.j.EOF     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.e.c.p.<clinit>():void");
        }
    }

    /* compiled from: HtmlTreeBuilderState */
    static final class y {

        /* renamed from: a  reason: collision with root package name */
        static final String[] f15208a = null;

        /* renamed from: b  reason: collision with root package name */
        static final String[] f15209b = null;

        /* renamed from: c  reason: collision with root package name */
        static final String[] f15210c = null;

        /* renamed from: d  reason: collision with root package name */
        static final String[] f15211d = null;

        /* renamed from: e  reason: collision with root package name */
        static final String[] f15212e = null;

        /* renamed from: f  reason: collision with root package name */
        static final String[] f15213f = null;
        static final String[] g = null;
        static final String[] h = null;
        static final String[] i = null;
        static final String[] j = null;
        static final String[] k = null;
        static final String[] l = null;
        static final String[] m = null;
        static final String[] n = null;
        static final String[] o = null;
        static final String[] p = null;
        static final String[] q = null;

        static {
            f15208a = new String[]{"base", "basefont", "bgsound", "command", "link", "meta", "noframes", "script", "style", "title"};
            f15209b = new String[]{"address", "article", "aside", "blockquote", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "menu", "nav", "ol", com.tempmail.t.p.g, "section", "summary", "ul"};
            f15210c = new String[]{"h1", "h2", "h3", "h4", "h5", "h6"};
            f15211d = new String[]{"listing", "pre"};
            f15212e = new String[]{"address", "div", com.tempmail.t.p.g};
            f15213f = new String[]{"dd", "dt"};
            g = new String[]{"b", "big", "code", "em", "font", com.tempmail.utils.i.f13118a, "s", "small", "strike", "strong", "tt", "u"};
            h = new String[]{"applet", "marquee", "object"};
            i = new String[]{"area", "br", "embed", "img", "keygen", "wbr"};
            j = new String[]{"param", "source", "track"};
            k = new String[]{"action", "name", "prompt"};
            l = new String[]{"optgroup", "option"};
            m = new String[]{"rp", "rt"};
            n = new String[]{"caption", "col", "colgroup", "frame", "head", "tbody", "td", "tfoot", "th", "thead", "tr"};
            o = new String[]{"address", "article", "aside", "blockquote", "button", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "listing", "menu", "nav", "ol", "pre", "section", "summary", "ul"};
            p = new String[]{"a", "b", "big", "code", "em", "font", com.tempmail.utils.i.f13118a, "nobr", "s", "small", "strike", "strong", "tt", "u"};
            q = new String[]{"table", "tbody", "tfoot", "thead", "tr"};
        }
    }

    static {
        y = String.valueOf(0);
    }

    /* access modifiers changed from: private */
    public static void n(i.h hVar, b bVar) {
        bVar.f15257b.u(k.Rawtext);
        bVar.d0();
        bVar.B0(Text);
        bVar.L(hVar);
    }

    /* access modifiers changed from: private */
    public static void o(i.h hVar, b bVar) {
        bVar.f15257b.u(k.Rcdata);
        bVar.d0();
        bVar.B0(Text);
        bVar.L(hVar);
    }

    /* access modifiers changed from: private */
    public static boolean p(String str) {
        return org.jsoup.b.b.e(str);
    }

    /* access modifiers changed from: private */
    public static boolean q(i iVar) {
        if (iVar.g()) {
            return p(iVar.a().q());
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public abstract boolean r(i iVar, b bVar);
}
