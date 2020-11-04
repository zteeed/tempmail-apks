package com.google.firebase.j;

import com.google.firebase.components.d;
import com.google.firebase.components.e;
import com.google.firebase.components.n;
import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.firebase:firebase-common@@19.3.0 */
public class c implements h {

    /* renamed from: a  reason: collision with root package name */
    private final String f11911a;

    /* renamed from: b  reason: collision with root package name */
    private final d f11912b;

    c(Set<f> set, d dVar) {
        this.f11911a = d(set);
        this.f11912b = dVar;
    }

    public static d<h> b() {
        d.b<h> a2 = d.a(h.class);
        a2.b(n.h(f.class));
        a2.f(b.a());
        return a2.d();
    }

    static /* synthetic */ h c(e eVar) {
        return new c(eVar.d(f.class), d.a());
    }

    private static String d(Set<f> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<f> it = set.iterator();
        while (it.hasNext()) {
            f next = it.next();
            sb.append(next.b());
            sb.append('/');
            sb.append(next.c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public String a() {
        if (this.f11912b.b().isEmpty()) {
            return this.f11911a;
        }
        return this.f11911a + ' ' + d(this.f11912b.b());
    }
}
