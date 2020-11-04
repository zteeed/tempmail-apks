package org.jsoup.d;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import org.jsoup.d.f;
import org.jsoup.select.c;

/* compiled from: Element */
public class h extends l {
    private static final List<l> h = Collections.emptyList();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public org.jsoup.e.h f14603d;

    /* renamed from: e  reason: collision with root package name */
    List<l> f14604e;

    /* renamed from: f  reason: collision with root package name */
    private b f14605f;
    private String g;

    /* compiled from: Element */
    class a implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StringBuilder f14606a;

        a(h hVar, StringBuilder sb) {
            this.f14606a = sb;
        }

        public void a(l lVar, int i) {
            if (lVar instanceof m) {
                h.e0(this.f14606a, (m) lVar);
            } else if (lVar instanceof h) {
                h hVar = (h) lVar;
                if (this.f14606a.length() <= 0) {
                    return;
                }
                if ((hVar.l0() || hVar.f14603d.b().equals("br")) && !m.f0(this.f14606a)) {
                    this.f14606a.append(' ');
                }
            }
        }

        public void b(l lVar, int i) {
            if ((lVar instanceof h) && ((h) lVar).l0() && (lVar.z() instanceof m) && !m.f0(this.f14606a)) {
                this.f14606a.append(' ');
            }
        }
    }

    /* compiled from: Element */
    private static final class b extends org.jsoup.b.a<l> {

        /* renamed from: b  reason: collision with root package name */
        private final h f14607b;

        b(h hVar, int i) {
            super(i);
            this.f14607b = hVar;
        }

        public void c() {
            this.f14607b.D();
        }
    }

    static {
        Pattern.compile("\\s+");
    }

    public h(org.jsoup.e.h hVar, String str, b bVar) {
        org.jsoup.b.c.i(hVar);
        org.jsoup.b.c.i(str);
        this.f14604e = h;
        this.g = str;
        this.f14605f = bVar;
        this.f14603d = hVar;
    }

    /* access modifiers changed from: private */
    public static void e0(StringBuilder sb, m mVar) {
        String d0 = mVar.d0();
        if (n0(mVar.f14622b) || (mVar instanceof c)) {
            sb.append(d0);
        } else {
            org.jsoup.b.b.a(sb, d0, m.f0(sb));
        }
    }

    private void k0(StringBuilder sb) {
        for (l F : this.f14604e) {
            F.F(sb);
        }
    }

    static boolean n0(l lVar) {
        if (lVar != null && (lVar instanceof h)) {
            h hVar = (h) lVar;
            int i = 0;
            while (!hVar.f14603d.h()) {
                hVar = hVar.M();
                i++;
                if (i < 6) {
                    if (hVar == null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public String C() {
        return this.f14603d.b();
    }

    /* access modifiers changed from: package-private */
    public void D() {
        super.D();
    }

    /* access modifiers changed from: package-private */
    public void H(Appendable appendable, int i, f.a aVar) throws IOException {
        if (aVar.k() && (this.f14603d.a() || ((M() != null && M().o0().a()) || aVar.i()))) {
            if (!(appendable instanceof StringBuilder)) {
                y(appendable, i, aVar);
            } else if (((StringBuilder) appendable).length() > 0) {
                y(appendable, i, aVar);
            }
        }
        appendable.append('<').append(p0());
        b bVar = this.f14605f;
        if (bVar != null) {
            bVar.U(appendable, aVar);
        }
        if (!this.f14604e.isEmpty() || !this.f14603d.g()) {
            appendable.append('>');
        } else if (aVar.l() != f.a.C0166a.html || !this.f14603d.d()) {
            appendable.append(" />");
        } else {
            appendable.append('>');
        }
    }

    /* access modifiers changed from: package-private */
    public void I(Appendable appendable, int i, f.a aVar) throws IOException {
        if (!this.f14604e.isEmpty() || !this.f14603d.g()) {
            if (aVar.k() && !this.f14604e.isEmpty() && (this.f14603d.a() || (aVar.i() && (this.f14604e.size() > 1 || (this.f14604e.size() == 1 && !(this.f14604e.get(0) instanceof m)))))) {
                y(appendable, i, aVar);
            }
            appendable.append("</").append(p0()).append('>');
        }
    }

    public h d0(l lVar) {
        org.jsoup.b.c.i(lVar);
        T(lVar);
        r();
        this.f14604e.add(lVar);
        lVar.X(this.f14604e.size() - 1);
        return this;
    }

    public b f() {
        if (!w()) {
            this.f14605f = new b();
        }
        return this.f14605f;
    }

    public h f0(String str, String str2) {
        super.e(str, str2);
        return this;
    }

    public String g() {
        return this.g;
    }

    public h g0(l lVar) {
        super.i(lVar);
        return this;
    }

    /* renamed from: h0 */
    public h n() {
        return (h) super.clone();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i0 */
    public h o(l lVar) {
        h hVar = (h) super.o(lVar);
        b bVar = this.f14605f;
        hVar.f14605f = bVar != null ? bVar.clone() : null;
        hVar.g = this.g;
        b bVar2 = new b(hVar, this.f14604e.size());
        hVar.f14604e = bVar2;
        bVar2.addAll(this.f14604e);
        return hVar;
    }

    public String j0() {
        StringBuilder k = org.jsoup.b.b.k();
        k0(k);
        boolean k2 = s().k();
        String sb = k.toString();
        return k2 ? sb.trim() : sb;
    }

    public int k() {
        return this.f14604e.size();
    }

    public boolean l0() {
        return this.f14603d.c();
    }

    /* renamed from: m0 */
    public final h M() {
        return (h) this.f14622b;
    }

    public org.jsoup.e.h o0() {
        return this.f14603d;
    }

    /* access modifiers changed from: protected */
    public void p(String str) {
        this.g = str;
    }

    public String p0() {
        return this.f14603d.b();
    }

    public String q0() {
        StringBuilder sb = new StringBuilder();
        org.jsoup.select.b.a(new a(this, sb), this);
        return sb.toString().trim();
    }

    /* access modifiers changed from: protected */
    public List<l> r() {
        if (this.f14604e == h) {
            this.f14604e = new b(this, 4);
        }
        return this.f14604e;
    }

    public String toString() {
        return E();
    }

    /* access modifiers changed from: protected */
    public boolean w() {
        return this.f14605f != null;
    }

    public h(org.jsoup.e.h hVar, String str) {
        this(hVar, str, (b) null);
    }
}