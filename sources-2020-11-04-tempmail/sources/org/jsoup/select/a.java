package org.jsoup.select;

import java.util.ArrayList;
import java.util.Iterator;
import org.jsoup.d.h;

/* compiled from: Elements */
public class a extends ArrayList<h> {
    public a() {
    }

    /* renamed from: c */
    public a clone() {
        a aVar = new a(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            aVar.add(((h) it.next()).n());
        }
        return aVar;
    }

    public String i() {
        StringBuilder sb = new StringBuilder();
        Iterator it = iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (sb.length() != 0) {
                sb.append("\n");
            }
            sb.append(hVar.E());
        }
        return sb.toString();
    }

    public String toString() {
        return i();
    }

    public a(int i) {
        super(i);
    }
}
