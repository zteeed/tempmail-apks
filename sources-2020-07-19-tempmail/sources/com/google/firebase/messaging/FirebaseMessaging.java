package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import b.c.a.b.g;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.firebase.c;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.q;
import com.google.firebase.j.h;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
public class FirebaseMessaging {
    @SuppressLint({"FirebaseUnknownNullness"})

    /* renamed from: d  reason: collision with root package name */
    static g f11366d;

    /* renamed from: a  reason: collision with root package name */
    private final Context f11367a;

    /* renamed from: b  reason: collision with root package name */
    private final FirebaseInstanceId f11368b;

    /* renamed from: c  reason: collision with root package name */
    private final Task<d> f11369c;

    FirebaseMessaging(c cVar, FirebaseInstanceId firebaseInstanceId, h hVar, com.google.firebase.g.c cVar2, com.google.firebase.installations.h hVar2, g gVar) {
        f11366d = gVar;
        this.f11368b = firebaseInstanceId;
        Context g = cVar.g();
        this.f11367a = g;
        Task<d> a2 = d.a(cVar, firebaseInstanceId, new q(g), hVar, cVar2, hVar2, this.f11367a, n.a(), new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Topics-Io")));
        this.f11369c = a2;
        a2.h(n.c(), new p(this));
    }

    @Keep
    static synchronized FirebaseMessaging getInstance(c cVar) {
        FirebaseMessaging firebaseMessaging;
        Class cls = FirebaseMessaging.class;
        synchronized (cls) {
            firebaseMessaging = (FirebaseMessaging) cVar.f(cls);
        }
        return firebaseMessaging;
    }

    public boolean a() {
        return this.f11368b.A();
    }
}
