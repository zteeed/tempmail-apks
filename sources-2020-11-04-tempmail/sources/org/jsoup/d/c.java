package org.jsoup.d;

import java.io.IOException;
import org.jsoup.UncheckedIOException;
import org.jsoup.d.f;

/* compiled from: CDataNode */
public class c extends m {
    public c(String str) {
        super(str);
    }

    public String C() {
        return "#cdata";
    }

    /* access modifiers changed from: package-private */
    public void H(Appendable appendable, int i, f.a aVar) throws IOException {
        appendable.append("<![CDATA[").append(d0());
    }

    /* access modifiers changed from: package-private */
    public void I(Appendable appendable, int i, f.a aVar) {
        try {
            appendable.append("]]>");
        } catch (IOException e2) {
            throw new UncheckedIOException(e2);
        }
    }
}
