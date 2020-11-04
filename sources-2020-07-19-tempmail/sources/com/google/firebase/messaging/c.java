package com.google.firebase.messaging;

import android.content.Context;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.d1;
import com.google.firebase.iid.q;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
final /* synthetic */ class c implements Callable {

    /* renamed from: b  reason: collision with root package name */
    private final Context f11391b;

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledExecutorService f11392c;

    /* renamed from: d  reason: collision with root package name */
    private final FirebaseInstanceId f11393d;

    /* renamed from: e  reason: collision with root package name */
    private final q f11394e;

    /* renamed from: f  reason: collision with root package name */
    private final d1 f11395f;

    c(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseInstanceId firebaseInstanceId, q qVar, d1 d1Var) {
        this.f11391b = context;
        this.f11392c = scheduledExecutorService;
        this.f11393d = firebaseInstanceId;
        this.f11394e = qVar;
        this.f11395f = d1Var;
    }

    public final Object call() {
        return d.b(this.f11391b, this.f11392c, this.f11393d, this.f11394e, this.f11395f);
    }
}
