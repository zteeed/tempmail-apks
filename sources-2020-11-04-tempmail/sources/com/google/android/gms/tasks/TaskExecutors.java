package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class TaskExecutors {

    /* renamed from: a  reason: collision with root package name */
    public static final Executor f10754a = new a();

    /* renamed from: b  reason: collision with root package name */
    static final Executor f10755b = new s();

    private static final class a implements Executor {

        /* renamed from: b  reason: collision with root package name */
        private final Handler f10756b = new Handler(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            this.f10756b.post(runnable);
        }
    }

    private TaskExecutors() {
    }
}
