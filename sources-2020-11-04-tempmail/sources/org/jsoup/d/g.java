package org.jsoup.d;

import java.io.IOException;
import org.jsoup.b.b;
import org.jsoup.b.c;
import org.jsoup.d.f;

/* compiled from: DocumentType */
public class g extends k {
    public g(String str, String str2, String str3) {
        c.i(str);
        c.i(str2);
        c.i(str3);
        e("name", str);
        e("publicId", str2);
        if (d0("publicId")) {
            e("pubSysKey", "PUBLIC");
        }
        e("systemId", str3);
    }

    private boolean d0(String str) {
        return !b.e(d(str));
    }

    public String C() {
        return "#doctype";
    }

    /* access modifiers changed from: package-private */
    public void H(Appendable appendable, int i, f.a aVar) throws IOException {
        if (aVar.l() != f.a.C0165a.html || d0("publicId") || d0("systemId")) {
            appendable.append("<!DOCTYPE");
        } else {
            appendable.append("<!doctype");
        }
        if (d0("name")) {
            appendable.append(" ").append(d("name"));
        }
        if (d0("pubSysKey")) {
            appendable.append(" ").append(d("pubSysKey"));
        }
        if (d0("publicId")) {
            appendable.append(" \"").append(d("publicId")).append('\"');
        }
        if (d0("systemId")) {
            appendable.append(" \"").append(d("systemId")).append('\"');
        }
        appendable.append('>');
    }

    /* access modifiers changed from: package-private */
    public void I(Appendable appendable, int i, f.a aVar) {
    }

    public void e0(String str) {
        if (str != null) {
            e("pubSysKey", str);
        }
    }
}
