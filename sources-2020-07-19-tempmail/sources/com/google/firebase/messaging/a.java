package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;

@KeepForSdk
/* compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
final class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f11377a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f11378b;

    /* renamed from: com.google.firebase.messaging.a$a  reason: collision with other inner class name */
    /* compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
    static final class C0106a {

        /* renamed from: a  reason: collision with root package name */
        private final a f11379a;

        C0106a(a aVar) {
            Preconditions.k(aVar);
            this.f11379a = aVar;
        }

        /* access modifiers changed from: package-private */
        public final a a() {
            return this.f11379a;
        }
    }

    /* compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
    static class b implements com.google.firebase.encoders.b<a> {
        b() {
        }

        public final /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
            a aVar = (a) obj;
            com.google.firebase.encoders.c cVar = (com.google.firebase.encoders.c) obj2;
            Intent a2 = aVar.a();
            cVar.c("ttl", u.l(a2));
            cVar.f("event", aVar.b());
            cVar.f("instanceId", u.g());
            cVar.c("priority", u.s(a2));
            cVar.f("packageName", u.e());
            cVar.f("sdkPlatform", "ANDROID");
            cVar.f("messageType", u.q(a2));
            String p = u.p(a2);
            if (p != null) {
                cVar.f("messageId", p);
            }
            String r = u.r(a2);
            if (r != null) {
                cVar.f("topic", r);
            }
            String m = u.m(a2);
            if (m != null) {
                cVar.f("collapseKey", m);
            }
            if (u.o(a2) != null) {
                cVar.f("analyticsLabel", u.o(a2));
            }
            if (u.n(a2) != null) {
                cVar.f("composerLabel", u.n(a2));
            }
            String i = u.i();
            if (i != null) {
                cVar.f("projectNumber", i);
            }
        }
    }

    /* compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
    static final class c implements com.google.firebase.encoders.b<C0106a> {
        c() {
        }

        public final /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
            ((com.google.firebase.encoders.c) obj2).f("messaging_client_event", ((C0106a) obj).a());
        }
    }

    a(String str, Intent intent) {
        Preconditions.h(str, "evenType must be non-null");
        this.f11377a = str;
        Preconditions.l(intent, "intent must be non-null");
        this.f11378b = intent;
    }

    /* access modifiers changed from: package-private */
    public final Intent a() {
        return this.f11378b;
    }

    /* access modifiers changed from: package-private */
    public final String b() {
        return this.f11377a;
    }
}
