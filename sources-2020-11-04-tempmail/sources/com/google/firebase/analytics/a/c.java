package com.google.firebase.analytics.a;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-measurement-api@@17.4.3 */
final /* synthetic */ class c implements Executor {

    /* renamed from: b  reason: collision with root package name */
    static final Executor f11556b = new c();

    private c() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
