package org.jsoup.d;

import java.io.IOException;
import org.jsoup.d.f;

/* compiled from: Comment */
public class d extends k {
    public d(String str) {
        this.f14621d = str;
    }

    public String C() {
        return "#comment";
    }

    /* access modifiers changed from: package-private */
    public void H(Appendable appendable, int i, f.a aVar) throws IOException {
        if (aVar.k()) {
            y(appendable, i, aVar);
        }
        appendable.append("<!--").append(d0()).append("-->");
    }

    /* access modifiers changed from: package-private */
    public void I(Appendable appendable, int i, f.a aVar) {
    }

    public String d0() {
        return b0();
    }

    public String toString() {
        return E();
    }
}
