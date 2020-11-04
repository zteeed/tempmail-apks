package org.jsoup.e;

import com.tempmail.utils.i;
import java.util.HashMap;
import java.util.Map;
import org.jsoup.b.c;

/* compiled from: Tag */
public class h {
    private static final Map<String, h> j = new HashMap();
    private static final String[] k;
    private static final String[] l = {"object", "base", "font", "tt", i.f12574a, "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "a", "img", "br", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", "label", "button", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track", "data", "bdi", "s"};
    private static final String[] m = {"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"};
    private static final String[] n = {"title", "a", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style", "ins", "del", "s"};
    private static final String[] o = {"pre", "plaintext", "title", "textarea"};
    private static final String[] p = {"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};
    private static final String[] q = {"input", "keygen", "object", "select", "textarea"};

    /* renamed from: a  reason: collision with root package name */
    private String f14652a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f14653b = true;

    /* renamed from: c  reason: collision with root package name */
    private boolean f14654c = true;

    /* renamed from: d  reason: collision with root package name */
    private boolean f14655d = true;

    /* renamed from: e  reason: collision with root package name */
    private boolean f14656e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f14657f = false;
    private boolean g = false;
    private boolean h = false;
    private boolean i = false;

    static {
        String[] strArr = {"html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", "details", "menu", "plaintext", "template", "article", "main", "svg", "math"};
        k = strArr;
        for (String hVar : strArr) {
            i(new h(hVar));
        }
        for (String hVar2 : l) {
            h hVar3 = new h(hVar2);
            hVar3.f14653b = false;
            hVar3.f14654c = false;
            i(hVar3);
        }
        for (String str : m) {
            h hVar4 = j.get(str);
            c.i(hVar4);
            hVar4.f14655d = false;
            hVar4.f14656e = true;
        }
        for (String str2 : n) {
            h hVar5 = j.get(str2);
            c.i(hVar5);
            hVar5.f14654c = false;
        }
        for (String str3 : o) {
            h hVar6 = j.get(str3);
            c.i(hVar6);
            hVar6.g = true;
        }
        for (String str4 : p) {
            h hVar7 = j.get(str4);
            c.i(hVar7);
            hVar7.h = true;
        }
        for (String str5 : q) {
            h hVar8 = j.get(str5);
            c.i(hVar8);
            hVar8.i = true;
        }
    }

    private h(String str) {
        this.f14652a = str;
    }

    private static void i(h hVar) {
        j.put(hVar.f14652a, hVar);
    }

    public static h k(String str, f fVar) {
        c.i(str);
        h hVar = j.get(str);
        if (hVar != null) {
            return hVar;
        }
        String b2 = fVar.b(str);
        c.h(b2);
        h hVar2 = j.get(b2);
        if (hVar2 != null) {
            return hVar2;
        }
        h hVar3 = new h(b2);
        hVar3.f14653b = false;
        return hVar3;
    }

    public boolean a() {
        return this.f14654c;
    }

    public String b() {
        return this.f14652a;
    }

    public boolean c() {
        return this.f14653b;
    }

    public boolean d() {
        return this.f14656e;
    }

    public boolean e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f14652a.equals(hVar.f14652a) && this.f14655d == hVar.f14655d && this.f14656e == hVar.f14656e && this.f14654c == hVar.f14654c && this.f14653b == hVar.f14653b && this.g == hVar.g && this.f14657f == hVar.f14657f && this.h == hVar.h && this.i == hVar.i) {
            return true;
        }
        return false;
    }

    public boolean f() {
        return j.containsKey(this.f14652a);
    }

    public boolean g() {
        return this.f14656e || this.f14657f;
    }

    public boolean h() {
        return this.g;
    }

    public int hashCode() {
        return (((((((((((((((this.f14652a.hashCode() * 31) + (this.f14653b ? 1 : 0)) * 31) + (this.f14654c ? 1 : 0)) * 31) + (this.f14655d ? 1 : 0)) * 31) + (this.f14656e ? 1 : 0)) * 31) + (this.f14657f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }

    /* access modifiers changed from: package-private */
    public h j() {
        this.f14657f = true;
        return this;
    }

    public String toString() {
        return this.f14652a;
    }
}
