package com.google.firebase.messaging;

import androidx.annotation.Keep;
import b.c.a.b.c;
import b.c.a.b.e;
import b.c.a.b.f;
import b.c.a.b.g;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.d;
import com.google.firebase.components.h;
import com.google.firebase.components.n;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.Arrays;
import java.util.List;

@KeepForSdk
@Keep
/* compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
public class FirebaseMessagingRegistrar implements h {

    /* compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
    private static class a<T> implements f<T> {
        private a() {
        }

        public final void a(c<T> cVar) {
        }

        public final void b(c<T> cVar, b.c.a.b.h hVar) {
            hVar.onSchedule((Exception) null);
        }
    }

    /* compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
    public static class b implements g {
        public final <T> f<T> a(String str, Class<T> cls, b.c.a.b.b bVar, e<T, byte[]> eVar) {
            return new a();
        }
    }

    @Keep
    public List<d<?>> getComponents() {
        d.b<FirebaseMessaging> a2 = d.a(FirebaseMessaging.class);
        a2.b(n.f(com.google.firebase.c.class));
        a2.b(n.f(FirebaseInstanceId.class));
        a2.b(n.f(com.google.firebase.j.h.class));
        a2.b(n.f(com.google.firebase.g.c.class));
        a2.b(n.e(g.class));
        a2.b(n.f(com.google.firebase.installations.h.class));
        a2.f(q.f11431a);
        a2.c();
        return Arrays.asList(new d[]{a2.d(), com.google.firebase.j.g.a("fire-fcm", "20.2.0")});
    }
}
