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
    private static final String[] f15150e = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};

    /* renamed from: b  reason: collision with root package name */
    private String f15151b;

    /* renamed from: c  reason: collision with root package name */
    private String f15152c;

    /* renamed from: d  reason: collision with root package name */
    b f15153d;

    public a(String str, String str2, b bVar) {
        c.i(str);
        this.f15151b = str.trim();
        c.h(str);
        this.f15152c = str2;
        this.f15153d = bVar;
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
        return Arrays.binarySearch(f15150e, str) >= 0;
    }

    protected static boolean k(String str, String str2, f.a aVar) {
        return aVar.l() == f.a.C0165a.html && (str2 == null || (("".equals(str2) || str2.equalsIgnoreCase(str)) && i(str)));
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
        return this.f15151b;
    }

    /* renamed from: d */
    public String getValue() {
        return this.f15152c;
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
        String str = this.f15151b;
        if (str == null ? aVar.f15151b != null : !str.equals(aVar.f15151b)) {
            return false;
        }
        String str2 = this.f15152c;
        String str3 = aVar.f15152c;
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
        g(this.f15151b, this.f15152c, appendable, aVar);
    }

    public int hashCode() {
        String str = this.f15151b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f15152c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: j */
    public String setValue(String str) {
        int V;
        String C = this.f15153d.C(this.f15151b);
        b bVar = this.f15153d;
        if (!(bVar == null || (V = bVar.V(this.f15151b)) == -1)) {
            this.f15153d.f15157d[V] = str;
        }
        this.f15152c = str;
        return C;
    }

    public String toString() {
        return e();
    }
}
