package org.jsoup.select;

import org.jsoup.d.l;

/* compiled from: NodeTraversor */
public class b {
    public static void a(c cVar, l lVar) {
        l lVar2 = lVar;
        int i = 0;
        while (lVar2 != null) {
            cVar.a(lVar2, i);
            if (lVar2.k() > 0) {
                lVar2 = lVar2.j(0);
                i++;
            } else {
                while (lVar2.z() == null && i > 0) {
                    cVar.b(lVar2, i);
                    lVar2 = lVar2.P();
                    i--;
                }
                cVar.b(lVar2, i);
                if (lVar2 != lVar) {
                    lVar2 = lVar2.z();
                } else {
                    return;
                }
            }
        }
    }
}
