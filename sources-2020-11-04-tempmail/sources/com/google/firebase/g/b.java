package com.google.firebase.g;

import android.content.Context;
import com.google.firebase.components.d;
import com.google.firebase.components.e;
import com.google.firebase.components.n;
import com.google.firebase.g.c;

/* compiled from: com.google.firebase:firebase-common@@19.3.0 */
public class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private d f11679a;

    private b(Context context) {
        this.f11679a = d.a(context);
    }

    public static d<c> b() {
        d.b<c> a2 = d.a(c.class);
        a2.b(n.f(Context.class));
        a2.f(a.a());
        return a2.d();
    }

    static /* synthetic */ c c(e eVar) {
        return new b((Context) eVar.a(Context.class));
    }

    public c.a a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean c2 = this.f11679a.c(str, currentTimeMillis);
        boolean b2 = this.f11679a.b(currentTimeMillis);
        if (c2 && b2) {
            return c.a.COMBINED;
        }
        if (b2) {
            return c.a.GLOBAL;
        }
        if (c2) {
            return c.a.SDK;
        }
        return c.a.NONE;
    }
}
