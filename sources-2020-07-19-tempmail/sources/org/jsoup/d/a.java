package org.jsoup.d;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import org.jsoup.SerializationException;
import org.jsoup.b.c;
import org.jsoup.d.f;

/* compiled from: Attribute */
public class a implements Map.Entry<String, String>, Cloneable {

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f14581e = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};

    /* renamed from: b  reason: collision with root package name */
    private String f14582b;

    /* renamed from: c  reason: collision with root package name */
    private String f14583c;

    /* renamed from: d  reason: collision with root package name */
    b f14584d;

    public a(String str, String str2, b bVar) {
        c.i(str);
        this.f14582b = str.trim();
        c.h(str);
        this.f14583c = str2;
        this.f14584d = bVar;
    }

    protected static void g(String str, String str2, Appendable appendable, f.a aVar) throws IOException {
        appendable.append(str);
        if (!k(str, str2, aVar)) {
            appendable.append("=\"");
            i.e(appendable, b.w(str2), aVar, true, false, false);
            appendable.append('\"');
        }
    }

    protected static boolean i(String str) {
        return Arrays.binarySearch(f14581e, str) >= 0;
    }

    protected static boolean k(String str, String str2, f.a aVar) {
        return aVar.l() == f.a.C0166a.html && (str2 == null || (("".equals(str2) || str2.equalsIgnoreCase(str)) && i(str)));
    }

    /* renamed from: b */
    public a clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: c */
    public String getKey() {
        return this.f14582b;
    }

    /* renamed from: d */
    public String getValue() {
        return this.f14583c;
    }

    public String e() {
        StringBuilder sb = new StringBuilder();
        try {
            f(sb, new f("").s0());
            return sb.toString();
        } catch (IOException e2) {
            throw new SerializationException(e2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f14582b;
        if (str == null ? aVar.f14582b != null : !str.equals(aVar.f14582b)) {
            return false;
        }
        String str2 = this.f14583c;
        String str3 = aVar.f14583c;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void f(Appendable appendable, f.a aVar) throws IOException {
        g(this.f14582b, this.f14583c, appendable, aVar);
    }

    public int hashCode() {
        String str = this.f14582b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f14583c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: j */
    public String setValue(String str) {
        int V;
        String C = this.f14584d.C(this.f14582b);
        b bVar = this.f14584d;
        if (!(bVar == null || (V = bVar.V(this.f14582b)) == -1)) {
            this.f14584d.f14588d[V] = str;
        }
        this.f14583c = str;
        return C;
    }

    public String toString() {
        return e();
    }
}
