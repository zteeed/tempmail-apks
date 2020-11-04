package com.google.android.play.core.assetpacks;

import java.util.concurrent.ThreadFactory;

final /* synthetic */ class x2 implements ThreadFactory {

    /* renamed from: b  reason: collision with root package name */
    static final ThreadFactory f11456b = new x2();

    private x2() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "UpdateListenerExecutor");
    }
}
