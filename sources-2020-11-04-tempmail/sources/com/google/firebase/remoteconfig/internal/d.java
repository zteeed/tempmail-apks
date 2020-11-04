package com.google.firebase.remoteconfig.internal;

import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-config@@19.1.4 */
final /* synthetic */ class d implements Executor {

    /* renamed from: b  reason: collision with root package name */
    private static final d f12024b = new d();

    private d() {
    }

    public static Executor a() {
        return f12024b;
    }

    public void execute(Runnable runnable) {
        runnable.run();
    }
}
