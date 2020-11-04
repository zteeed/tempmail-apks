package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.analytics.a.a;
import com.google.firebase.components.d;
import com.google.firebase.components.e;
import com.google.firebase.components.h;
import com.google.firebase.components.n;
import com.google.firebase.j.g;
import java.util.Arrays;
import java.util.List;

@Keep
/* compiled from: com.google.firebase:firebase-abt@@19.0.1 */
public class AbtRegistrar implements h {
    static /* synthetic */ a lambda$getComponents$0(e eVar) {
        return new a((Context) eVar.a(Context.class), (a) eVar.a(a.class));
    }

    public List<d<?>> getComponents() {
        d.b<a> a2 = d.a(a.class);
        a2.b(n.f(Context.class));
        a2.b(n.e(a.class));
        a2.f(b.a());
        return Arrays.asList(new d[]{a2.d(), g.a("fire-abt", "19.0.1")});
    }
}
