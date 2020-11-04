package com.google.firebase.messaging;

import android.content.Context;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.d1;
import com.google.firebase.iid.q;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.firebase:firebase-messaging@@20.2.1 */
final /* synthetic */ class c implements Callable {

    /* renamed from: b  reason: collision with root package name */
    private final Context f11940b;

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledExecutorService f11941c;

    /* renamed from: d  reason: collision with root package name */
    private final FirebaseInstanceId f11942d;

    /* renamed from: e  reason: collision with root package name */
    private final q f11943e;

    /* renamed from: f  reason: collision with root package name */
    private final d1 f11944f;

    c(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseInstanceId firebaseInstanceId, q qVar, d1 d1Var) {
        this.f11940b = context;
        this.f11941c = scheduledExecutorService;
        this.f11942d = firebaseInstanceId;
        this.f11943e = qVar;
        this.f11944f = d1Var;
    }

    public final Object call() {
        return d.b(this.f11940b, this.f11941c, this.f11942d, this.f11943e, this.f11944f);
    }
}
