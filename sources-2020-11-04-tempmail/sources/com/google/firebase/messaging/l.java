package com.google.firebase.messaging;

import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-messaging@@20.2.1 */
final /* synthetic */ class l implements Executor {

    /* renamed from: b  reason: collision with root package name */
    static final Executor f11973b = new l();

    private l() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
