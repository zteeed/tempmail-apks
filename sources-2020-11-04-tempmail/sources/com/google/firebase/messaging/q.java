package com.google.firebase.messaging;

import b.c.a.b.b;
import com.google.android.datatransport.cct.a;
import com.google.firebase.c;
import com.google.firebase.components.e;
import com.google.firebase.components.g;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.j.h;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;

/* compiled from: com.google.firebase:firebase-messaging@@20.2.1 */
final /* synthetic */ class q implements g {

    /* renamed from: a  reason: collision with root package name */
    static final g f11980a = new q();

    private q() {
    }

    public final Object create(e eVar) {
        c cVar = (c) eVar.a(c.class);
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) eVar.a(FirebaseInstanceId.class);
        h hVar = (h) eVar.a(h.class);
        com.google.firebase.g.c cVar2 = (com.google.firebase.g.c) eVar.a(com.google.firebase.g.c.class);
        com.google.firebase.installations.g gVar = (com.google.firebase.installations.g) eVar.a(com.google.firebase.installations.g.class);
        b.c.a.b.g gVar2 = (b.c.a.b.g) eVar.a(b.c.a.b.g.class);
        if (gVar2 == null || !a.g.a().contains(b.b("json"))) {
            gVar2 = new FirebaseMessagingRegistrar.b();
        }
        return new FirebaseMessaging(cVar, firebaseInstanceId, hVar, cVar2, gVar, gVar2);
    }
}
