package org.jsoup.d;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.jsoup.SerializationException;
import org.jsoup.d.f;
import org.jsoup.select.c;

/* compiled from: Node */
public abstract class l implements Cloneable {

    /* renamed from: b  reason: collision with root package name */
    l f14622b;

    /* renamed from: c  reason: collision with root package name */
    int f14623c;

    /* compiled from: Node */
    class a implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f14624a;

        a(l lVar, String str) {
            this.f14624a = str;
        }

        public void a(l lVar, int i) {
            lVar.p(this.f14624a);
        }

        public void b(l lVar, int i) {
        }
    }

    /* compiled from: Node */
    private static class b implements c {

        /* renamed from: a  reason: collision with root package name */
        private Appendable f14625a;

        /* renamed from: b  reason: collision with root package name */
        private f.a f14626b;

        b(Appendable appendable, f.a aVar) {
            this.f14625a = appendable;
            this.f14626b = aVar;
            aVar.j();
        }

        public void a(l lVar, int i) {
            try {
                lVar.H(this.f14625a, i, this.f14626b);
            } catch (IOException e2) {
                throw new SerializationException(e2);
            }
        }

        public void b(l lVar, int i) {
            if (!lVar.C().equals("#text")) {
                try {
                    lVar.I(this.f14625a, i, this.f14626b);
                } catch (IOException e2) {
                    throw new SerializationException(e2);
                }
            }
        }
    }

    protected l() {
    }

    private void Q(int i) {
        List<l> r = r();
        while (i < r.size()) {
            r.get(i).X(i);
            i++;
        }
    }

    public abstract String C();

    /* access modifiers changed from: package-private */
    public void D() {
    }

    public String E() {
        StringBuilder sb = new StringBuilder(128);
        F(sb);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public void F(Appendable appendable) {
        org.jsoup.select.b.a(new b(appendable, s()), this);
    }

    /* access modifiers changed from: package-private */
    public abstract void H(Appendable appendable, int i, f.a aVar) throws IOException;

    /* access modifiers changed from: package-private */
    public abstract void I(Appendable appendable, int i, f.a aVar) throws IOException;

    public f L() {
        l U = U();
        if (U instanceof f) {
            return (f) U;
        }
        return null;
    }

    public l M() {
        return this.f14622b;
    }

    public final l P() {
        return this.f14622b;
    }

    public void R() {
        org.jsoup.b.c.i(this.f14622b);
        this.f14622b.S(this);
    }

    /* access modifiers changed from: protected */
    public void S(l lVar) {
        org.jsoup.b.c.d(lVar.f14622b == this);
        int i = lVar.f14623c;
        r().remove(i);
        Q(i);
        lVar.f14622b = null;
    }

    /* access modifiers changed from: protected */
    public void T(l lVar) {
        lVar.W(this);
    }

    public l U() {
        l lVar = this;
        while (true) {
            l lVar2 = lVar.f14622b;
            if (lVar2 == null) {
                return lVar;
            }
            lVar = lVar2;
        }
    }

    public void V(String str) {
        org.jsoup.b.c.i(str);
        a0(new a(this, str));
    }

    /* access modifiers changed from: protected */
    public void W(l lVar) {
        org.jsoup.b.c.i(lVar);
        l lVar2 = this.f14622b;
        if (lVar2 != null) {
            lVar2.S(this);
        }
        this.f14622b = lVar;
    }

    /* access modifiers changed from: protected */
    public void X(int i) {
        this.f14623c = i;
    }

    public int Y() {
        return this.f14623c;
    }

    public List<l> Z() {
        l lVar = this.f14622b;
        if (lVar == null) {
            return Collections.emptyList();
        }
        List<l> r = lVar.r();
        ArrayList arrayList = new ArrayList(r.size() - 1);
        for (l next : r) {
            if (next != this) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public l a0(c cVar) {
        org.jsoup.b.c.i(cVar);
        org.jsoup.select.b.a(cVar, this);
        return this;
    }

    public String b(String str) {
        org.jsoup.b.c.h(str);
        if (!t(str)) {
            return "";
        }
        return org.jsoup.b.b.i(g(), d(str));
    }

    /* access modifiers changed from: protected */
    public void c(int i, l... lVarArr) {
        org.jsoup.b.c.f(lVarArr);
        List<l> r = r();
        for (l T : lVarArr) {
            T(T);
        }
        r.addAll(i, Arrays.asList(lVarArr));
        Q(i);
    }

    public String d(String str) {
        org.jsoup.b.c.i(str);
        if (!w()) {
            return "";
        }
        String F = f().F(str);
        if (F.length() > 0) {
            return F;
        }
        if (str.startsWith("abs:")) {
            return b(str.substring(4));
        }
        return "";
    }

    public l e(String str, String str2) {
        f().a0(str, str2);
        return this;
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    public abstract b f();

    public abstract String g();

    public l i(l lVar) {
        org.jsoup.b.c.i(lVar);
        org.jsoup.b.c.i(this.f14622b);
        this.f14622b.c(this.f14623c, lVar);
        return this;
    }

    public l j(int i) {
        return r().get(i);
    }

    public abstract int k();

    public List<l> l() {
        return Collections.unmodifiableList(r());
    }

    /* renamed from: n */
    public l clone() {
        l o = o((l) null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(o);
        while (!linkedList.isEmpty()) {
            l lVar = (l) linkedList.remove();
            int k = lVar.k();
            for (int i = 0; i < k; i++) {
                List<l> r = lVar.r();
                l o2 = r.get(i).o(lVar);
                r.set(i, o2);
                linkedList.add(o2);
            }
        }
        return o;
    }

    /* access modifiers changed from: protected */
    public l o(l lVar) {
        int i;
        try {
            l lVar2 = (l) super.clone();
            lVar2.f14622b = lVar;
            if (lVar == null) {
                i = 0;
            } else {
                i = this.f14623c;
            }
            lVar2.f14623c = i;
            return lVar2;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void p(String str);

    /* access modifiers changed from: protected */
    public abstract List<l> r();

    /* access modifiers changed from: package-private */
    public f.a s() {
        f L = L();
        if (L == null) {
            L = new f("");
        }
        return L.s0();
    }

    public boolean t(String str) {
        org.jsoup.b.c.i(str);
        if (str.startsWith("abs:")) {
            String substring = str.substring(4);
            if (f().P(substring) && !b(substring).equals("")) {
                return true;
            }
        }
        return f().P(str);
    }

    public String toString() {
        return E();
    }

    /* access modifiers changed from: protected */
    public abstract boolean w();

    public boolean x() {
        return this.f14622b != null;
    }

    /* access modifiers changed from: protected */
    public void y(Appendable appendable, int i, f.a aVar) throws IOException {
        appendable.append(10).append(org.jsoup.b.b.h(i * aVar.g()));
    }

    public l z() {
        l lVar = this.f14622b;
        if (lVar == null) {
            return null;
        }
        List<l> r = lVar.r();
        int i = this.f14623c + 1;
        if (r.size() > i) {
            return r.get(i);
        }
        return null;
    }
}
