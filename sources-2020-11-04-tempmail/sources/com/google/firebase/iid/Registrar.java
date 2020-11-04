package com.google.firebase.iid;

import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.c;
import com.google.firebase.components.d;
import com.google.firebase.components.h;
import com.google.firebase.components.n;
import com.google.firebase.installations.g;
import java.util.Arrays;
import java.util.List;

@KeepForSdk
@Keep
/* compiled from: com.google.firebase:firebase-iid@@20.2.1 */
public final class Registrar implements h {

    /* compiled from: com.google.firebase:firebase-iid@@20.2.1 */
    private static class a implements com.google.firebase.iid.b.a {

        /* renamed from: a  reason: collision with root package name */
        private final FirebaseInstanceId f11703a;

        public a(FirebaseInstanceId firebaseInstanceId) {
            this.f11703a = firebaseInstanceId;
        }

        public final String h() {
            return this.f11703a.a();
        }
    }

    @Keep
    public final List<d<?>> getComponents() {
        Class<FirebaseInstanceId> cls = FirebaseInstanceId.class;
        d.b<FirebaseInstanceId> a2 = d.a(cls);
        a2.b(n.f(c.class));
        a2.b(n.f(com.google.firebase.f.d.class));
        a2.b(n.f(com.google.firebase.j.h.class));
        a2.b(n.f(com.google.firebase.g.c.class));
        a2.b(n.f(g.class));
        a2.f(s.f11791a);
        a2.c();
        d<FirebaseInstanceId> d2 = a2.d();
        d.b<com.google.firebase.iid.b.a> a3 = d.a(com.google.firebase.iid.b.a.class);
        a3.b(n.f(cls));
        a3.f(t.f11793a);
        return Arrays.asList(new d[]{d2, a3.d(), com.google.firebase.j.g.a("fire-iid", "20.2.1")});
    }
}
