package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class s implements Executor {
    s() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
