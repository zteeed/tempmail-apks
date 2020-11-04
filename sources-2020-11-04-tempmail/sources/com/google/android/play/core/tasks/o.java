package com.google.android.play.core.tasks;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

final class o implements Executor {

    /* renamed from: b  reason: collision with root package name */
    private final Handler f11524b = new Handler(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f11524b.post(runnable);
    }
}
