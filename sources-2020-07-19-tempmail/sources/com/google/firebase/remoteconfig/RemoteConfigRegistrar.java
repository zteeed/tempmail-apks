package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.abt.component.a;
import com.google.firebase.c;
import com.google.firebase.components.d;
import com.google.firebase.components.e;
import com.google.firebase.components.h;
import com.google.firebase.components.n;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.j.g;
import java.util.Arrays;
import java.util.List;

@Keep
/* compiled from: com.google.firebase:firebase-config@@19.1.4 */
public class RemoteConfigRegistrar implements h {
    static /* synthetic */ j lambda$getComponents$0(e eVar) {
        return new j((Context) eVar.a(Context.class), (c) eVar.a(c.class), (FirebaseInstanceId) eVar.a(FirebaseInstanceId.class), ((a) eVar.a(a.class)).b("frc"), (com.google.firebase.analytics.a.a) eVar.a(com.google.firebase.analytics.a.a.class));
    }

    public List<d<?>> getComponents() {
        d.b<j> a2 = d.a(j.class);
        a2.b(n.f(Context.class));
        a2.b(n.f(c.class));
        a2.b(n.f(FirebaseInstanceId.class));
        a2.b(n.f(a.class));
        a2.b(n.e(com.google.firebase.analytics.a.a.class));
        a2.f(k.a());
        a2.e();
        return Arrays.asList(new d[]{a2.d(), g.a("fire-rc", "19.1.4")});
    }
}
