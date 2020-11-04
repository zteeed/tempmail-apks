package org.jsoup.d;

import org.jsoup.e.h;
import org.jsoup.select.a;

/* compiled from: FormElement */
public class j extends h {
    private final a i = new a();

    public j(h hVar, String str, b bVar) {
        super(hVar, str, bVar);
    }

    /* access modifiers changed from: protected */
    public void S(l lVar) {
        super.S(lVar);
        this.i.remove(lVar);
    }

    public j r0(h hVar) {
        this.i.add(hVar);
        return this;
    }
}
