package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import b.c.a.b.g;
import com.google.firebase.components.d;
import com.google.firebase.components.h;
import com.google.firebase.components.n;
import java.util.Collections;
import java.util.List;

@Keep
/* compiled from: com.google.firebase:firebase-datatransport@@17.0.3 */
public class TransportRegistrar implements h {
    public List<d<?>> getComponents() {
        d.b<g> a2 = d.a(g.class);
        a2.b(n.f(Context.class));
        a2.f(a.a());
        return Collections.singletonList(a2.d());
    }
}
