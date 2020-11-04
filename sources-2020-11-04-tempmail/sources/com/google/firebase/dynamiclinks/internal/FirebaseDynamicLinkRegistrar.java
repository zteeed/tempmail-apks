package com.google.firebase.dynamiclinks.internal;

import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.c;
import com.google.firebase.components.d;
import com.google.firebase.components.h;
import com.google.firebase.components.n;
import com.google.firebase.e.a;
import java.util.Arrays;
import java.util.List;

@KeepForSdk
@Keep
/* compiled from: com.google.firebase:firebase-dynamic-links@@19.1.0 */
public final class FirebaseDynamicLinkRegistrar implements h {
    @Keep
    public final List<d<?>> getComponents() {
        d.b<a> a2 = d.a(a.class);
        a2.b(n.f(c.class));
        a2.b(n.e(com.google.firebase.analytics.a.a.class));
        a2.f(f.f11649a);
        return Arrays.asList(new d[]{a2.d()});
    }
}
