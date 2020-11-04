package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-messaging@@20.2.1 */
final class b0 {

    /* renamed from: d  reason: collision with root package name */
    private static WeakReference<b0> f11936d;

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f11937a;

    /* renamed from: b  reason: collision with root package name */
    private a0 f11938b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f11939c;

    private b0(SharedPreferences sharedPreferences, Executor executor) {
        this.f11939c = executor;
        this.f11937a = sharedPreferences;
    }

    public static synchronized b0 a(Context context, Executor executor) {
        b0 b0Var;
        synchronized (b0.class) {
            b0Var = null;
            if (f11936d != null) {
                b0Var = (b0) f11936d.get();
            }
            if (b0Var == null) {
                b0Var = new b0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                b0Var.c();
                f11936d = new WeakReference<>(b0Var);
            }
        }
        return b0Var;
    }

    private final synchronized void c() {
        this.f11938b = a0.a(this.f11937a, "topic_operation_queue", ",", this.f11939c);
    }

    /* access modifiers changed from: package-private */
    public final synchronized c0 b() {
        return c0.c(this.f11938b.b());
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean d(c0 c0Var) {
        return this.f11938b.c(c0Var.d());
    }
}
