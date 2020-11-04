package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.c;
import com.google.firebase.components.d;
import com.google.firebase.components.e;
import com.google.firebase.components.h;
import com.google.firebase.components.n;
import com.google.firebase.j.g;
import java.util.Arrays;
import java.util.List;

@Keep
public class FirebaseInstallationsRegistrar implements h {
    static /* synthetic */ g lambda$getComponents$0(e eVar) {
        return new f((c) eVar.a(c.class), (com.google.firebase.j.h) eVar.a(com.google.firebase.j.h.class), (com.google.firebase.g.c) eVar.a(com.google.firebase.g.c.class));
    }

    public List<d<?>> getComponents() {
        d.b<g> a2 = d.a(g.class);
        a2.b(n.f(c.class));
        a2.b(n.f(com.google.firebase.g.c.class));
        a2.b(n.f(com.google.firebase.j.h.class));
        a2.f(h.a());
        return Arrays.asList(new d[]{a2.d(), g.a("fire-installations", "16.3.2")});
    }
}
